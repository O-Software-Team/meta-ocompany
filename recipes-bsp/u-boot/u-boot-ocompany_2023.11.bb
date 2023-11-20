# Copyright (C) 2023 Ocompany

require recipes-bsp/u-boot/u-boot.inc
require u-boot-ocompany-common_${PV}.inc

PROVIDES += "u-boot-ocompany"

do_deploy:append:mx8m () {
    if [ -n "${UBOOT_CONFIG}" ]
    then
        for config in ${UBOOT_MACHINE}; do
            i=$(expr $i + 1);
            for type in ${UBOOT_CONFIG}; do
                j=$(expr $j + 1);
                if [ $j -eq $i ]
                then
		    install -d ${DEPLOYDIR}/${BOOT_TOOLS}
		    install -m 0777 ${B}/${config}/arch/arm/dts/${UBOOT_DTB_NAME}  ${DEPLOYDIR}/${BOOT_TOOLS}
		    install -m 0777 ${B}/${config}/u-boot-nodtb.bin  ${DEPLOYDIR}/${BOOT_TOOLS}/u-boot-nodtb.bin-${MACHINE}-${type}
		fi
	    done
	    unset j
	done
	unset i
    fi
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(odevice8mp)"
