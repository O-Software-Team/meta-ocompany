# Copyright 2023 Ocompany

DEPENDS = "zlib-native openssl-native"

SRCBRANCH = "lf-5.15.32_2.0.0"
SRC_URI = "https://github.com/O-Software-Team/ocompany-mkimage.git;protocol=http;branch=${SRCBRANCH} \
           file://0001-mkimage_fit_atf-fix-fit-generator-node-naming.patch \
           file://0001-iMX8M-soc.mak-use-native-mkimage-from-sysroot.patch \
"
SRCREV = "a8bb8edb45492ac70b33734122a57aa8e38a20bd"
S = "${WORKDIR}/git"

BOOT_TOOLS = "ocompany-boot-tools"
SYSROOT_DIRS += "/boot"
