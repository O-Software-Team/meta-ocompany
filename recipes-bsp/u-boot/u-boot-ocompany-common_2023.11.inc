# Copyright (C) 2023 Ocompany

inherit fsl-u-boot-localversion

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=13bd014c01a429f38c39fe6e9f4a8062"

DEPENDS += "flex-native bison-native"

SRC_URI = "https://github.com/O-Software-Team/u-boot-ocompany.git;branch=${SRCBRANCH};protocol=http"
SRC_URI[sha256sum] = "c31e7a1edc94d41b2413134adbbc7b8bed022b87efbf9e1f04896b11992d8499"

SRCBRANCH = "master"

PV = "v2023.11+git_${SRCBRANCH}"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"
