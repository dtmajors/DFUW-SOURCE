/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  lcw
 */
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class hwo
extends hwm {
    public static final int liw = 0;
    public static final int lix = 1;
    public static final int liy = 2;
    public static final int liz = 3;
    public static final int liA = 1;
    public static final int liB = 2;
    public static final int liC = 4;
    public static final int liD = 8;
    public static final int liE = 16;
    bsh liF = null;
    ldv aCK = null;
    bsm liG = null;
    hxd liH = null;
    boolean Visible = true;
    int eDY = 0;
    float liI = -1.0f;
    int liJ = 0;
    boolean kba = true;
    long liK = -1L;
    int liL = -1;

    private hwo() {
    }

    protected hwo(String[] stringArray) {
        if (stringArray.length > 1) {
            this.liG = (bsm)((Object)lea.enW().acv(Integer.valueOf(stringArray[1])));
        }
        if (stringArray.length > 2) {
            long l2 = Long.valueOf(stringArray[2]);
            this.aCK = new ldv(l2);
            if (l2 != 0L) {
                this.liF = hso.cxK().cxP().cza().J(-1, this.aCK);
                this.cBn();
                this.cBp();
            }
        }
    }

    public hwo(bsm bsm2) {
        this.liG = bsm2;
    }

    public hwo(bsm bsm2, long l2) {
        this.liG = bsm2;
        this.liK = l2;
    }

    public hwo(bsh bsh2) {
        this.x(bsh2);
    }

    public void x(bsh bsh2) {
        this.liF = bsh2;
        this.liG = bsh2.awx();
        this.aCK = bsh2.getGUID();
        this.cBn();
        this.cBp();
    }

    private void cBn() {
        this.liK = this.liF instanceof bsl ? ((bsl)this.liF).AQ() : -1L;
    }

    public long cBo() {
        return this.liK;
    }

    private void cBp() {
        if (this.liF == null) {
            return;
        }
        this.eDY = 0;
        lgw lgw2 = (lgw)lea.enW().acv(this.liF.az());
        if (lgw2 == null) {
            return;
        }
        switch (lgw2.erJ()) {
            case dDY: {
                if (lea.enW().isDescendant(this.liF.az(), cug.fjQ)) {
                    this.eDY |= 1;
                    break;
                }
                this.eDY |= 2;
                break;
            }
            case dEj: {
                if (this.liF.az() != cug.fwp && this.liF.az() != cug.fwq && this.liF.az() != cug.fwr) break;
                this.eDY |= 3;
            }
        }
    }

    @Override
    public SFGUIElementDTO cBj() {
        SFGUIElementDTO sFGUIElementDTO = new SFGUIElementDTO();
        sFGUIElementDTO.iconName = "texture/dds/" + this.liG.atw().Name;
        sFGUIElementDTO.quantity = this.liF != null ? this.liF.vf() : 1;
        sFGUIElementDTO.visible = this.Visible;
        if (this.cBu() != null && this.auU()) {
            ej[] ejArray = this.cBH();
            if (ejArray == null || ejArray.length() == 0) {
                ejArray = lxf.tod.bD(this.liG.getType()).exA();
            }
            sFGUIElementDTO.text = ejArray;
            sFGUIElementDTO.changed = true;
        } else {
            sFGUIElementDTO.text = lxg.tpf.bD(sFGUIElementDTO.quantity, this.liG.getType()).exA();
        }
        sFGUIElementDTO.progress = this.liI;
        sFGUIElementDTO.state = hxw.llv.ordinal();
        if (this.liF == null) {
            sFGUIElementDTO.state = hxw.llx.ordinal();
        } else if (hso.cxK().cxP().cyI().dIa() && !cug.us((int)this.liF.az())) {
            sFGUIElementDTO.state = hxw.llw.ordinal();
        }
        if (!this.kba && sFGUIElementDTO.state == hxw.llv.ordinal()) {
            sFGUIElementDTO.state = hxw.llw.ordinal();
        }
        if (this.cCa()) {
            sFGUIElementDTO.quantity = this.cBL();
        }
        sFGUIElementDTO.quantityText = String.valueOf(sFGUIElementDTO.quantity);
        boolean bl = sFGUIElementDTO.quickItem = this.liF != null && iao.cKB().rs(this.liF.getGUID());
        if (this.liF != null && this.liF.arJ() != null) {
            for (ej ej2 : this.liF.arJ()) {
                if (ej2.getType() != 13216) continue;
                int n = ((ew)ej2).fQ();
                int n2 = n & 0xFFFF;
                int n3 = n >> 16;
                cab cab2 = lea.epO().get(n2);
                cab cab3 = lea.epO().get(n3);
                sFGUIElementDTO.primaryDye = cab2 == null ? 0 : cab2.aFK();
                sFGUIElementDTO.secondaryDye = cab3 == null ? 0 : cab3.aFK();
                break;
            }
        }
        return sFGUIElementDTO;
    }

    @Override
    public String getName() {
        return this.liG.getName();
    }

    @Override
    public String getDescription() {
        return this.liG.getDescription();
    }

    public bsm cBq() {
        return this.liG;
    }

    @Override
    public boolean a(cxc cxc2, float f2, int n) {
        if (cxc2 == null) {
            return false;
        }
        if (!(cxc2.zg() == cxd.fHe && this.eDY == 2 || cxc2.zg() == cxd.fHd && this.eDY == 1 || cxc2.zg() == cxd.fJJ && this.eDY == 3)) {
            return false;
        }
        if (f2 <= 0.0f) {
            this.liI = -1.0f;
            return true;
        }
        float f3 = Math.abs(f2 - this.liI);
        if (f3 < 0.027777778f && this.liL != n && n - this.liL < 20) {
            return false;
        }
        this.liL = n;
        this.liI = f2;
        return true;
    }

    public int cBr() {
        return this.eDY;
    }

    public String toString() {
        return "item;" + this.liG.getType() + ";" + (this.liF == null ? "0" : String.valueOf(this.liF.getGUID().eny()));
    }

    public ldv awM() {
        return this.aCK;
    }

    public void a(hxd hxd2) {
        this.liH = hxd2;
    }

    public hxd cBs() {
        return this.liH;
    }

    public void setVisible(boolean bl) {
        this.Visible = bl;
    }

    @Override
    public float cBk() {
        return this.liI;
    }

    public int cBt() {
        return this.liJ;
    }

    public void OG(int n) {
        this.liJ = n;
    }

    public bsh cBu() {
        return this.liF;
    }

    public void y(bsh bsh2) {
        this.liF = bsh2;
        this.cBn();
        this.cBp();
    }

    private et ah(int n) {
        ej ej2 = this.LZ(n);
        if (ej2 == null) {
            return null;
        }
        if (!(ej2 instanceof et)) {
            return null;
        }
        return (et)ej2;
    }

    private ew ao(int n) {
        ej ej2 = this.LZ(n);
        if (ej2 == null) {
            return null;
        }
        if (!(ej2 instanceof ew)) {
            return null;
        }
        return (ew)ej2;
    }

    private ff aq(int n) {
        ej ej2 = this.LZ(n);
        if (ej2 == null) {
            return null;
        }
        if (!(ej2 instanceof ff)) {
            return null;
        }
        return (ff)ej2;
    }

    private fh ay(int n) {
        ej ej2 = this.LZ(n);
        if (ej2 == null) {
            return null;
        }
        if (!(ej2 instanceof fh)) {
            return null;
        }
        return (fh)ej2;
    }

    private ej LZ(int n) {
        return hwo.a(this.liF, n);
    }

    public static ej a(bsh bsh2, int n) {
        assert (n > 0);
        if (bsh2 == null) {
            return null;
        }
        if (bsh2.arJ() == null) {
            return null;
        }
        for (ej ej2 : bsh2.arJ()) {
            if (ej2.getType() != n) continue;
            return ej2;
        }
        return null;
    }

    public float OH(int n) {
        if (this.liF == null) {
            return 0.0f;
        }
        switch (n) {
            case 1680: {
                et et2 = this.ah(1680);
                return et2 != null ? et2.fN() : 0.0f;
            }
            case 1744: {
                et et3 = this.ah(1744);
                return et3 != null ? et3.fN() : 0.0f;
            }
            case 6416: {
                et et4 = this.ah(6416);
                return et4 != null ? et4.fN() : 0.0f;
            }
            case 1936: {
                et et5 = this.ah(1936);
                return et5 != null ? et5.fN() : 0.0f;
            }
            case 2096: {
                et et6 = this.ah(2096);
                return et6 != null ? et6.fN() : 0.0f;
            }
            case 2704: {
                et et7 = this.ah(2704);
                return et7 != null ? et7.fN() : 0.0f;
            }
            case 3248: {
                et et8 = this.ah(3248);
                return et8 != null ? et8.fN() : 0.0f;
            }
            case 3280: {
                et et9 = this.ah(3280);
                return et9 != null ? et9.fN() : 0.0f;
            }
            case 4464: {
                et et10 = this.ah(4464);
                return et10 != null ? et10.fN() : 0.0f;
            }
            case 3536: {
                et et11 = this.ah(3536);
                return et11 != null ? et11.fN() : 0.0f;
            }
            case 3568: {
                et et12 = this.ah(3568);
                return et12 != null ? et12.fN() : 0.0f;
            }
            case 4496: {
                et et13 = this.ah(4496);
                return et13 != null ? et13.fN() : 0.0f;
            }
            case 4912: {
                et et14 = this.ah(4912);
                return et14 != null ? et14.fN() : 0.0f;
            }
            case 5536: {
                et et15 = this.ah(5536);
                return et15 != null ? et15.fN() : 0.0f;
            }
            case 4208: {
                et et16 = this.ah(4208);
                return et16 != null ? et16.fN() : 0.0f;
            }
            case 13248: {
                et et17 = this.ah(13248);
                return et17 != null ? et17.fN() : 0.0f;
            }
            case 13264: {
                et et18 = this.ah(13264);
                return et18 != null ? et18.fN() : 0.0f;
            }
            case 14128: {
                et et19 = this.ah(14128);
                return et19 != null ? et19.fN() : 0.0f;
            }
            case 13296: {
                et et20 = this.ah(13296);
                return et20 != null ? et20.fN() : 0.0f;
            }
            case 13280: {
                et et21 = this.ah(13280);
                return et21 != null ? et21.fN() : 0.0f;
            }
        }
        assert (false) : "ProtectionAttributeType : " + n + " is unhandled.";
        return 0.0f;
    }

    public float getWeight() {
        return this.liF != null ? this.liF.awB() : 0.0f;
    }

    public int vf() {
        return this.liF != null ? this.liF.vf() : 0;
    }

    public cak.c cBv() {
        return this.liF != null ? this.liF.auO() : null;
    }

    public String cBw() {
        ff ff2 = this.aq(1360);
        return ff2 != null ? ff2.getStringValue() : null;
    }

    public boolean auW() {
        return this.liF != null && this.liF.awx() != null ? this.liF.awx().auW() : false;
    }

    public float aug() {
        et et2 = (et)this.LZ(1088);
        return et2 != null ? et2.fN() : 0.0f;
    }

    public float cBx() {
        ej ej2 = this.LZ(1234);
        et et2 = ej2 != null ? (et)ej2 : null;
        return et2 != null ? et2.fN() : 0.0f;
    }

    public et cBy() {
        ej ej2 = this.LZ(1234);
        return ej2 != null ? (et)ej2 : null;
    }

    public float cBz() {
        ej ej2 = this.LZ(1232);
        et et2 = ej2 != null ? (et)ej2 : null;
        return et2 != null ? et2.fN() : 0.0f;
    }

    public et cBA() {
        ej ej2 = this.LZ(1232);
        return ej2 != null ? (et)ej2 : null;
    }

    public String cBB() {
        ff ff2 = (ff)this.LZ(11024);
        return ff2 != null ? ff2.getStringValue() : null;
    }

    public float cBC() {
        et et2 = this.ah(640);
        return et2 != null ? et2.fN() : 0.0f;
    }

    public float cBD() {
        et et2 = (et)this.LZ(688);
        return et2 != null ? et2.fN() * 100.0f : 0.0f;
    }

    public float cBE() {
        et et2 = this.ah(624);
        if (et2 != null) {
            float f2 = et2.fN();
            return f2 > 0.0f ? 1.0f / f2 : 0.0f;
        }
        return 0.0f;
    }

    public ljq cBF() {
        ej ej2 = this.LZ(10976);
        if (ej2 == null) {
            return null;
        }
        fh fh2 = (fh)ej2;
        return fh2.gy();
    }

    public String getDisplayName() {
        ff ff2 = (ff)this.LZ(1328);
        return ff2 != null ? ff2.getStringValue() : null;
    }

    public float cBG() {
        String string;
        float f2 = 0.0f;
        float f3 = 1.0f;
        et et2 = (et)this.LZ(9472);
        if (et2 != null && et2.fN() > 0.0f) {
            f2 = et2.fN();
        }
        if (this.liF != null && (string = this.liF.awz()) != null) {
            et et3;
            string = string.replace("r_Figurine ", "r_");
            int n = lea.enW().getType(string);
            cuf cuf2 = lea.eov().get(n);
            if (cuf2 != null && (et3 = (et)cuf2.ae(352)) != null) {
                if (f2 == 0.0f) {
                    f2 = et3.fN();
                }
                f3 = et3.fN();
            }
        }
        return f2 / f3 * 100.0f;
    }

    public float Ub() {
        Object object;
        String string;
        if (this.liF != null && (string = this.liF.awz()) != null) {
            string = string.replace("r_Figurine ", "r_");
            int n = lea.enW().getType(string);
            object = lea.eov().get(n);
            if (object != null) {
                et et2 = (et)((cuf)object).ae(352);
                return et2 != null ? et2.fN() : 0.0f;
            }
        }
        int n = this.az();
        n = cug.uJ((int)n);
        cuf cuf2 = lea.eov().get(n);
        object = (et)cuf2.ae(352);
        if (object != null) {
            return ((et)object).fN();
        }
        return 0.0f;
    }

    public String cBH() {
        return hwo.z(this.liF);
    }

    public static String z(bsh bsh2) {
        ff ff2 = (ff)hwo.a(bsh2, 10368);
        return ff2 != null && ff2.getStringValue() != null && !ff2.getStringValue().isEmpty() ? ff2.getStringValue() : lvm.sXa.bD(bsh2.az()).exA();
    }

    public float cBI() {
        et et2 = this.ah(1552);
        return et2 != null ? et2.fN() : 0.0f;
    }

    public boolean ceE() {
        return this.cBO() || this.cBW() || this.cBP();
    }

    public float cBJ() {
        et et2 = (et)this.LZ(9360);
        if (et2 != null) {
            float f2 = et2.fN();
            return f2 > 0.0f ? f2 : 0.0f;
        }
        return 0.0f;
    }

    public String cBK() {
        if (this.liF == null) {
            return null;
        }
        if (this.liF.az() == cug.fpN || this.liF.az() == cug.fpO) {
            ff ff2 = this.aq(9632);
            return ff2 == null ? "" : ff2.getStringValue().toUpperCase();
        }
        return null;
    }

    public int cBL() {
        if (this.liF == null) {
            return 0;
        }
        ew ew2 = this.ao(1248);
        return ew2 == null ? 0 : ew2.fQ();
    }

    public String cBM() {
        if (this.liF == null) {
            return null;
        }
        fh fh2 = this.ay(9648);
        return fh2 == null || fh2.gy() == null ? null : fh2.gy().esI();
    }

    public ljq cBN() {
        if (this.liF == null) {
            return null;
        }
        fh fh2 = this.ay(9648);
        return fh2 != null ? fh2.gy() : null;
    }

    public int az() {
        return this.liF != null ? this.liF.az() : this.liG.getType();
    }

    public boolean cBO() {
        return lea.enW().isDescendant(this.az(), cug.fjl);
    }

    public boolean cBP() {
        return bsi.my(this.az());
    }

    public boolean cBQ() {
        return bsi.mz(this.az());
    }

    public boolean cBR() {
        return bsi.mA(this.az());
    }

    public boolean cBS() {
        return bsi.mB(this.az());
    }

    public boolean cBT() {
        return bsi.mv(this.az());
    }

    public boolean cBU() {
        return bsi.mw(this.az());
    }

    public boolean cBV() {
        return bsi.mx(this.az());
    }

    public boolean cBW() {
        return lea.enW().isDescendant(this.az(), cug.fjr);
    }

    public boolean cBX() {
        return lea.enW().isDescendant(this.az(), cug.fiK);
    }

    public boolean auU() {
        return lea.enW().isDescendant(this.az(), cug.fjP);
    }

    public boolean cBY() {
        return lea.enW().isDescendant(this.az(), cug.fjk);
    }

    public boolean cBZ() {
        return this.az() == cug.fpN || this.az() == cug.fpO;
    }

    public boolean cCa() {
        return this.az() == cug.fwp || this.az() == cug.fwq || this.az() == cug.fwr;
    }

    public boolean cCb() {
        return lea.enW().isDescendant(this.az(), cug.fkR);
    }

    public boolean cCc() {
        return lea.enW().isDescendant(this.az(), cug.fjZ) || this.az() == cug.fka;
    }

    public boolean bkp() {
        return lea.enW().isDescendant(this.az(), cug.fmO);
    }

    public boolean cCd() {
        return lea.enW().isDescendant(this.az(), cug.fnq);
    }

    public boolean cCe() {
        return lea.enW().isDescendant(this.liG.getType(), cug.fkF);
    }

    public boolean cCf() {
        return lea.enW().isDescendant(this.liG.getType(), cug.fiL);
    }

    public boolean cCg() {
        return this.cCf() && bqm.d.isOneHandedWeapon(bqm.d.getWeaponType(this.liG.getType()));
    }

    public boolean cCh() {
        return this.cCf() && bqm.d.isTwoHandedWeapon(bqm.d.getWeaponType(this.liG.getType()));
    }

    @Override
    public boolean b(hwm hwm2) {
        if (!(hwm2 instanceof hwo)) {
            return false;
        }
        hwo hwo2 = (hwo)hwm2;
        if (hwo2.liF == null) {
            return false;
        }
        if (this.liF == null) {
            return false;
        }
        return ldv.au(hwo2.liF.getGUID(), this.liF.getGUID());
    }

    public boolean cCi() {
        return this.cBO() || this.cBW() || this.cBQ() || this.cBP();
    }

    public boolean cCj() {
        return this.kba;
    }

    public boolean cCk() {
        assert (this.cCi());
        boolean bl = this.kba;
        this.liJ = 0;
        if (ctg.ffk) {
            this.kba = true;
            return bl != this.kba;
        }
        int n = this.liF.az();
        if (n == -1) {
            this.kba = true;
            return bl != this.kba;
        }
        cur cur2 = lea.eos().get(lea.enW().getName(n));
        if (cur2 == null) {
            this.kba = true;
            return bl != this.kba;
        }
        float f2 = jbg.b((jbh)jbh.mNh).mNc + jbg.b((jbh)jbh.mNh).mNf;
        float f3 = jbg.b((jbh)jbh.mNi).mNc + jbg.b((jbh)jbh.mNi).mNf;
        float f4 = jbg.b((jbh)jbh.mNk).mNc + jbg.b((jbh)jbh.mNk).mNf;
        float f5 = jbg.b((jbh)jbh.mNj).mNc + jbg.b((jbh)jbh.mNj).mNf;
        int n2 = -1;
        if (lcw.aQH()) {
            cjv cjv2 = cjv.getValueByName(this.cBB());
            n2 = cjv.getConnectionAttribute(cjv2);
            if (n2 == -1) {
                n2 = ckh.getWeaponTypeConnectedAttribute(n);
            }
            if (n2 != -1) {
                n2 = hso.cxK().cxP().cyZ().Ow(n2);
            }
        }
        if (n2 == -1) {
            n2 = cur2.fyd;
        }
        switch (n2) {
            case 208: {
                if (!(f2 < cur2.fye)) break;
                this.liJ |= 2;
                break;
            }
            case 160: {
                if (!(f3 < cur2.fye)) break;
                this.liJ |= 4;
                break;
            }
            case 240: {
                if (!(f4 < cur2.fye)) break;
                this.liJ |= 8;
                break;
            }
            case 176: {
                if (!(f5 < cur2.fye)) break;
                this.liJ |= 0x10;
            }
        }
        boolean bl2 = this.kba = this.liJ == 0;
        if (!lcw.aQH()) {
            int n3 = cur2.fyf;
            switch (n3) {
                case 208: {
                    if (f2 < cur2.fyg) {
                        this.liJ |= 2;
                        break;
                    }
                    this.kba = true;
                    break;
                }
                case 160: {
                    if (f3 < cur2.fyg) {
                        this.liJ |= 4;
                        break;
                    }
                    this.kba = true;
                    break;
                }
                case 240: {
                    if (f4 < cur2.fyg) {
                        this.liJ |= 8;
                        break;
                    }
                    this.kba = true;
                    break;
                }
                case 176: {
                    if (f5 < cur2.fyg) {
                        this.liJ |= 0x10;
                        break;
                    }
                    this.kba = true;
                }
            }
            if (!this.mi(n)) {
                this.liJ |= 1;
                this.kba = false;
            }
        }
        return bl != this.kba;
    }

    private boolean mi(int n) {
        if (!lea.enW().isDescendant(n, cug.fjl) && !lea.enW().isDescendant(n, cug.fjr)) {
            return true;
        }
        ff ff2 = (ff)cug.bh((int)n, (int)11024);
        if (ff2 == null) {
            return true;
        }
        String string = ff2.getStringValue();
        if (string == null) {
            return true;
        }
        cjv cjv2 = cjv.getValueByName(string);
        if (cjv2 == null) {
            return true;
        }
        cjx cjx2 = hso.cxK().cxP().cyZ().ki();
        if (cjx2 == null) {
            return false;
        }
        return cjv2.ordinal() == cjx2.aQv().ordinal();
    }

    @Override
    public hwm cBl() {
        hwo hwo2 = new hwo();
        hwo2.avz = this.avz;
        hwo2.liF = this.liF;
        hwo2.aCK = this.aCK;
        hwo2.liG = this.liG;
        hwo2.liH = this.liH;
        hwo2.Visible = this.Visible;
        hwo2.eDY = this.eDY;
        hwo2.liI = this.liI;
        hwo2.liJ = this.liJ;
        hwo2.kba = this.kba;
        hwo2.liK = this.liK;
        return hwo2;
    }

    public boolean cCl() {
        return bsi.i(this.liF);
    }

    public boolean cCm() {
        return bsi.j(this.liF);
    }

    public boolean cCn() {
        return bsi.k(this.liF);
    }

    public boolean cCo() {
        return bsi.l(this.liF);
    }

    public boolean b(hwo hwo2) {
        return hwo2 != null ? bsi.a(this.liF, hwo2.liF) && hwo2.liG.getType() == hwo2.liG.getType() : false;
    }

    public static boolean a(hwo hwo2, hwo hwo3) {
        return hwo2 == hwo3 || hwo2 != null && hwo3 != null && hwo2.b(hwo3);
    }

    public void ak(long l2) {
        this.liK = l2;
    }

    @Override
    public void update() {
        bsh bsh2 = hso.cxK().cxP().cza().rm(this.aCK);
        if (bsh2 != null) {
            this.x(bsh2);
        }
    }
}

