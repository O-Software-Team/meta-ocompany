# Copyright (C) 2014 O.S. Systems Software LTDA.
# Copyright (C) 2014-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright 2023 Ocompany

FILESEXTRAPATHS:prepend := "${THISDIR}/u-boot-ocompany:"

require u-boot-ocompany_${PV}.bb
require u-boot-mfgtool.inc
