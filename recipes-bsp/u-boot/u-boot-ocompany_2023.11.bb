require recipes-bsp/u-boot/u-boot.inc
require recipes-bsp/u-boot/u-boot-ocompany-common_${PV}.inc

DEPENDS += "bison-native"

PROVIDES += "u-boot"

BOOT_TOOLS = "imx-boot-tools"

do_deploy_append_mx8 () {
	install -d ${DEPLOYDIR}/${BOOT_TOOLS}
	install -m 0777 ${B}/${config}/arch/arm/dts/${UBOOT_DTB_NAME}  ${DEPLOYDIR}/${BOOT_TOOLS}
	install -m 0777 ${B}/${config}/u-boot-nodtb.bin  ${DEPLOYDIR}/${BOOT_TOOLS}/u-boot-nodtb.bin-${MACHINE}-${UBOOT_CONFIG}
}

COMPATIBLE_MACHINE = "(odevice8m|odevice8mm|odevice8mn|odevice8mp)"
