# Adapted from linux-imx.inc, copyright (C) 2013, 2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc

SUMMARY = "Linux kernel for Ocompany odevice"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
SRC_URI = "git://github.com/O-Software-Team/linux-ocompany.git;protocol=http;branch=${SRCBRANCH} \
"

LOCALVERSION = "-2.2.0+yocto"
SRCBRANCH = "ocompany-imx_6.1"
LINUX_VERSION = "ocompany-imx_6.1"
SRCREV = "cc579b3ed03de36b0aff1ed1e0fec7e465640db6"
DEPENDS += "lzop-native bc-native"
COMPATIBLE_MACHINE = "(odevice8mp)"
SRC_URI[sha256sum]="19f25ddbc64880c8b6cddd252257e28de7de40671f33dc379315b646434384df"

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
