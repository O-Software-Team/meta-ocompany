DESCRIPTION = "U-Boot for Ocompany odevice"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=5a7450c57ffe5ae63fd732446b988025"

SRCREV = "94f0b1290a94e97ca2870122640c508f23b929f5"
SRCBRANCH = "master"
SRC_URI = "git://github.com/O-Software-Team/u-boot.git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
