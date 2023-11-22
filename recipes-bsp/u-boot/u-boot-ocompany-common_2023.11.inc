# Copyright (C) 2023 Ocompany

inherit fsl-u-boot-localversion

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=13bd014c01a429f38c39fe6e9f4a8062"

DEPENDS += "flex-native bison-native"

SRC_URI = "https://github.com/O-Software-Team/u-boot-ocompany.git;branch=${SRCBRANCH};protocol=http"
SRC_URI[sha256sum] = "c94e47b26b93a071fa8ccca96312bc190560dcb9ea8fa668e4170486b0f03323"

SRCBRANCH = "master"

PV = "v2023.11+git_${SRCBRANCH}"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"
