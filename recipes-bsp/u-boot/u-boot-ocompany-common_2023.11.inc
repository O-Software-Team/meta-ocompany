# Copyright (C) 2023 Ocompany

inherit fsl-u-boot-localversion

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=13bd014c01a429f38c39fe6e9f4a8062"

DEPENDS += "flex-native bison-native"

SRC_URI = "https://github.com/O-Software-Team/u-boot-ocompany.git;branch=${SRCBRANCH};protocol=http"
SRC_URI[sha256sum] = "60d3abc63434cfa0f5e66b20c1fb11a080a2a00ce655c343befbbaa57231125b"

SRCBRANCH = "master"

PV = "v2023.11+git${SRCPV}"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"
