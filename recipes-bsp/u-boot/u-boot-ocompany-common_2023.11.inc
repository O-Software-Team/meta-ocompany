DESCRIPTION = "U-Boot for Ocompany odevice"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=01227781a96150b429023a200313f5e5"

SRCBRANCH = "u-boot-2023.07.y"
SRC_URI = "https://github.com/u-boot/u-boot.git;branch=${SRCBRANCH};protocol=https"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
