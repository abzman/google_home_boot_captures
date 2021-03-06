ep3tsa01rp>sys_init start. boot_strap=0x000005c7 (source=NAND), boot_state=0x0
speed_bin_tag: 0
Leakage current: 133 mA
Temp ID: 98 deg C
OTP/RKEK ID: 16C4DCD8F5F40100
OTP/VERSION: 00
EROM ID      :0592434E
RSA KEY INDEX:7
USB BOOT TO  :1
ROMK DISABLE :1
DIS USB BOOT :0
DIS BOOTSTRAP:0
DIS BLANK MED:0
tsm_src_blk_num: 0x01
sysinit_src_blk_num: 0x01
erom_src_blk_num: 0x01
OTP/MID:     00000001
OTP/ULT:     58A31D89D6640118
OTP LOCK    :1
RKEK CRC    :416670CC
AESK0 CRC   :CA38149B
SIGNK7 CRC  :4A767220
MRVL SIGN R :FFFF
CUST SIGN R :0000
try boot_data: page_size=2048, block_size=131072 ecc=48
boot_data: page_size=2048, block_size=131072 ecc=48
NAND block size 131072, page size 2048, ecc_strength 48
Get bootloader image.
Read from block 1
Read layout from lba 0x20000
-- image2: iLoader_OFFSET = 0x3400
-- image3: iLoader_OFFSET = 0xa000
####### img2: 0x101c237, 0x7a086d61, 0x63a04380
	verify 0:0x101c237, 1k:0x401c0de, 2k:0x102c0de
	verify image e0000301, size=0, waitcount=1
tz_loader_src_blk_num: 0x01
	verify 0:0x101c237, 1k:0x2a2e1, 2k:0x302c0de
	verify image 0, size=22668, waitcount=2
sysinit: image3 verified.

tz_loader start. boot_strap=0x000005c7 (source=NAND), boot_state=0x0
try boot_data: page_size=2048, block_size=131072 ecc=48
boot_data: page_size=2048, block_size=131072 ecc=48
NAND block size 131072, page size 2048, ecc_strength 48
nand_randomizer_init_by_flash_type(chip_id = 0x98DA90157616): !!! UNRANDOMIZED !!!
-- TZ_loader -- bootloader
Read from block 1
-- vt entries: 6 size: 396
block0: part1(start=0, blks=1, version=000000000000), part2(start=0, blks=1, version=000000000000)
pre-bootloader: part1(start=1, blks=8, version=000000000000), part2(start=1, blks=8, version=000000000000)
tz_en: part1(start=9, blks=18, version=000000000000), part2(start=9, blks=18, version=000000000000)
{line: 806} -- here
tz_en-B: part1(start=27, blks=18, version=000000000000), part2(start=27, blks=18, version=000000000000)
{line: 799} -- here
post-bootloader: part1(start=45, blks=5, version=000000000000), part2(start=45, blks=5, version=000000000000)
{line: 813} -- here
postbootloaderB: part1(start=50, blks=5, version=000000000000), part2(start=50, blks=5, version=000000000000)
{line: 820} -- here
	lastK: 0x201c237, 0x201c237, 0x0
{line: 1113} -- NTW entry: 0x1004000 bootloader entry: 0x1680000
{line: 1131} tz_en_start: 0x120000 tz_en_end: 0x360000 tz_en_size: 0x240000
Uncorrectable error @ 0x00260000
Read failed @ 0x00260000
	verify 0k:0x402c0de, 1k:0xd6749664, 2k:0xccd3d16e
	verify image 0, size=1237488, waitcount=49
tz_loader: image4 verified.
tz_en image load verify success 
	verify 0k:0x201c237, 1k:0xf01c0de, 2k:0x0
	verify image e0000301, size=0, waitcount=1
{line: 1158} bl_en_start: 0x5a0000 bl_en_end: 0x640000
Uncorrectable error @ 0x005c0000
Read failed @ 0x005c0000
	verify 0k:0x400c0de, 1k:0xe16f5f14, 2k:0xe92d43f8
	verify image 0, size=120408, waitcount=4
tz_loader: image4 verified.
bl_en image read and verify success 
tz_loader: start image4.
->tw:MCK5 config addr 20020000  magic#: e3530007
->tw:load memory zone default setting!
->tw:MCK5 config size: e00000 100000 100000 1e600000 a00000
->tw:MCK5 config access: 3 1 2 0 3
->tw:hal_set_region ntw start 1000000 size 1e600000
->tw:secure SHM start 1f600000 size a00000Galois
->tw:irq enable: 0x2000
->tw:fiq disable: 0x2000
->tw:kernel start ...
->tw:free memory(0xb10a0) at 0x204af60
->tw:TEE TW version 1.12.21, build time 16-10-17 18:04
->tw:proc log buf: 11080000, ctl: 11180000
->tw:init module 202945c
->tw:init module 2037cf4
->tw:init module 203b518
->tw:init module 2038a3c
->tw:init module 203c388
chirp-b4 BG2CD+: 3040
[init_nfc:1405] get nand parameters from tz_loder (block_size=131072, page_size=2048, ecc=48)
nand_randomizer_init_by_flash_type(chip_id = 0x98DA90157616): !!! UNRANDOMIZED !!!
block 0: !!! UNRANDOMIZED !!! (page=0)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
block 1021: !!! UNRANDOMIZED !!! (page=0)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
block 1022: !!! UNRANDOMIZED !!! (page=0)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
[is_chunk_blank:455] not blank! data_len=2080, ecc=48, zero_bits=49
[mv_nand_read_large_page:2232] ECC uncorrectable error (page=0xlx)
fts: v164 loaded from 0x0002c000
chip is cold boot.
chip is cold boot.
 
------ Entered Power_measurement_script() -------
 
------ End Power_measurement_script() ------
OTP/RKEK ID: 16C4DCD8F5F40100
OTP/VERSION: 00000000
EROM ID      :0592434E
RSA KEY INDEX:7
USB BOOT TO  :1
ROMK DISABLE :1
DIS USB BOOT :0
DIS BOOTSTRAP:0
DIS BLANK MED:0
OTP/MID:     00000001
OTP/ULT:     58A31D89D6640118
OTP LOCK    :1
RKEK CRC    :416670CC
AESK0 CRC   :CA38149B
SIGNK7 CRC  :4A767220
MRVL SIGN R :FFFF
CUST SIGN R :0000
0xf7ea0200: 06220015 1600125a 3000003c 00fc1a00 
0xf7940050: 06220015 1600301a 3800003c 00461a00 
0xf7920070: 0621a015 1a003018 20000024 00000000 
Clock configuration:
              memPll           frequency	1600
              sysPll           frequency	800
              cpuPll           frequency	1300
                dClk           frequency	400
       cpufastRefClk           frequency	400
       memfastRefClk           frequency	400
              cfgClk           frequency	100
              sysClk           frequency	400
           g1CoreClk           frequency	800
        gfx3DCoreClk           frequency	800
         gfx3DSysClk           frequency	800
          avioSysClk           frequency	400
           vppSysClk           frequency	800
           arcRefClk           frequency	400
          hdmirxMClk           frequency	800
            perifClk           frequency	200
              tspClk           frequency	400
           tspRefClk           frequency	200
              atbClk           frequency	800
              bcmClk           frequency	66
           nfcEccClk           frequency	400
              sd0Clk           frequency	100
         usb2TestClk           frequency	66
   sdio3DllMstRefClk           frequency	200
**************************************************************** 
                  Read and setup kernel Image                    
**************************************************************** 
boot normally (crashcounter: 5)
block 27: !!! UNRANDOMIZED !!! (page=0)
block 28: !!! UNRANDOMIZED !!! (page=0)
block 29: !!! UNRANDOMIZED !!! (page=0)
block 30: !!! UNRANDOMIZED !!! (page=0)
block 31: !!! UNRANDOMIZED !!! (page=0)
block 32: !!! UNRANDOMIZED !!! (page=0)
block 33: !!! UNRANDOMIZED !!! (page=0)
block 34: !!! UNRANDOMIZED !!! (page=0)
block 35: !!! UNRANDOMIZED !!! (page=0)
block 36: !!! UNRANDOMIZED !!! (page=0)
block 37: !!! UNRANDOMIZED !!! (page=0)
block 38: !!! UNRANDOMIZED !!! (page=0)
block 39: !!! UNRANDOMIZED !!! (page=0)
block 40: !!! UNRANDOMIZED !!! (page=0)
block 41: !!! UNRANDOMIZED !!! (page=0)
block 42: !!! UNRANDOMIZED !!! (page=0)
block 43: !!! UNRANDOMIZED !!! (page=0)
	verify 0k:0x400c0de, 1k:0x0, 2k:0x0
	verify image 0, size=4235264, waitcount=5101
mkbootimg bootargs: init=/init console=  mtdblock.ro_fspart="rootfs" ro nooverlayfs
Generated bootargs: init=/init console=  mtdblock.ro_fspart="rootfs" ro nooverlayfs  flash_ts.dev_id=0 flash_ts.size=524288 flash_ts.erasesize=131072 flash_ts.writesize=2048
chip is cold boot.

Boot normal GTV image
chip is cold boot.
cold boot
block 1021: !!! UNRANDOMIZED !!! (page=0)
fts: record v165 commited @ 0x00030000
set crashcounter to 6
chip is cold boot.
chip is cold boot.
Start kernel at 0x01108000
6Add randomness with 128 bytes
6speed_tag: 0 otp_ver: 0 mkt_id: 1  otp_ult: 0xD664011858A31D89 feature_bits:0x00004117
ep3tsa01rp:�