DESCRIPTION = "i.MX U-Boot suppporting i.MX Ocompany odevice."

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCBRANCH = "master"
SRC_URI = "git://github.com/O-Software-Team/u-boot-ocompany.git;protocol=http;branch=${SRCBRANCH}"
SRCREV = "1eef4d990fb6259e57451e987a6458d4d6ef8f51"

DEPENDS += "flex-native bison-native bc-native dtc-native"

PV = "2023.11"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

inherit fsl-u-boot-localversion
inherit pypi setuptools3

LOCALVERSION ?= "-master"

BOOT_TOOLS = "ocompany-boot-tools"
