# Copyright (C) 2023 Ocompany

SUMMARY = "Daemonize"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=5003fa041d799dd5dd5f646b74e36924"

S = "${WORKDIR}/git"

SRC_URI = "git://github.com/O-Software-Team/daemonize.git;branch=${SRCBRANCH}"
SRCBRANCH = "master"
SRCREV = "9c08934f6cbf3cf4bfbdeb92d411072e5d2f7ad0"

inherit autotools-brokensep


