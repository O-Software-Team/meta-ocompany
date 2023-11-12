# Adapted from linux-imx.inc, copyright (C) 2013, 2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

# In case of 8mp, kernel-module-isp-vvcam will build and cause the following error:
# The recipe linux-ocompany is trying to install files into a shared area when those files already exist (kernel-module-imx219)
# So we need to remove config from kernel to avoid error.
EXTRA_OEMAKE:append:mx8mp-nxp-bsp = " CONFIG_VIDEO_IMX219=n"

require recipes-kernel/linux/linux-imx.inc

DESCRIPTION = "Linux kernel for Ocompany odevice"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086ahttpsedcd7e46"
BB_STRICT_CHECKSUM:forcevariable = "0"

SRCREV = "{AUTOREV}"
LINUX_VERSION ?= "6.1"
PV = "${LINUX_VERSION}+git${SRCPV}"

SRC_URI = "git://github.com/O-Software-Team/linux-ocompany.git;protocol=http"

DEPENDS += "lzop-native bc-native"
COMPATIBLE_MACHINE = "(odevice8mp)"

FILES_${KERNEL_PACKAGE_NAME}-base += "${nonarch_base_libdir}/modules/${KERNEL_VERSION}/modules.builtin.modinfo "

KERNEL_DEFCONFIG ?= ".config"

S = "${WORKDIR}/git"

#Copy ocompany_defconfig from git
do_copy_default_config() {
    if [ ! -f  ${WORKDIR}/defconfig ]; then
        if [ -f ${S}/arch/${ARCH}/configs/${KERNEL_DEFCONFIG} ]; then
            cp ${S}/arch/${ARCH}/configs/${KERNEL_DEFCONFIG} ${WORKDIR}/defconfig
        else
	    bberror "KERNEL_DEFCONFIG does not exist! Please set a valid KERNEL_DEFCONFIG"
	fi
    fi
}

addtask copy_default_config before do_preconfigure after do_patch
