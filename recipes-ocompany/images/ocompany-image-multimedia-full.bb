# This image extends fsl-image-multimedia-full with additional
# Ocompany packages

require recipes-fsl/images/fsl-image-multimedia-full.bb

CORE_IMAGE_EXTRA_INSTALL += " \
	i2c-tools \
	iperf3 \
	imx-gpu-viv-demos \
	kernel-module-qcacld \
	linux-firmware-bdsdmac \
	mmc-utils \
	openssh \
	spitools \
	networkmanager \
	tslib-tests tslib-calibrate \
	evtest \
	silex-uart \
	udev-rules-bt \
	can-utils \
	iproute2 \
	pciutils \
	e2fsprogs \
	packagegroup-tools-bluetooth \
"

#imx-gpu-viv-demos are not compatible with i.MX7
IMAGE_INSTALL_remove_mx7 += " imx-gpu-viv-demos"
