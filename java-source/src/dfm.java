/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Map;

public class dfm
extends dey {
    private static final int goz = 1;
    private static final int goA = 2;
    private static final int goB = 4;
    private String ekh = null;
    private boolean goC = false;
    int goD = 0;
    private boolean goE = false;
    private static final int goF = 1;
    private static final int goG = 2;
    private static final int gnO = 4;
    private static final int gnP = 8;
    private static final int gnQ = 16;
    private static final int gnR = 32;
    private lcq goH = lcq.BRIGHT_WHITE;
    private lcq goI = lcq.BRIGHT_WHITE;
    private int gnS = 0;
    private int gnT = 0;
    private int gnU = 0;
    private int gnV = 0;
    private int gnW = 0;
    private int gnX = 0;
    private int gnY = 0;
    private int gnZ = 0;
    private int dcq = 0;
    private int goJ = 0;
    private int goK = 0;
    private int goL = 0;
    private Map goM = lcn.emw();
    private String goN = null;
    private int goO = 0;
    private boolean goP = false;
    private kky goQ = null;
    private kps epT = null;
    private kla goR = null;

    dfm() {
        this.gnv = 11;
        this.ObjectType = cug.fmY;
        this.goQ = (kky)gnw.h(1025);
        this.goQ.wD(false);
        this.goQ.jM(false);
        this.goQ.pHF = 8;
        this.epT = (kps)gnw.h(3589);
        this.epT.wD(false);
        this.epT.jM(false);
        this.epT.aam(5);
        this.goR = (kla)gnw.h(1028);
        this.goR.wD(false);
        this.goR.jM(false);
        this.goR.HW(1);
        this.goR.setScale(1.0f);
        this.gnx = false;
        this.gny = false;
    }

    @Override
    public void setDefaultValues() {
        super.setDefaultValues();
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.updateObject();
        this.bml();
        this.bmo();
        this.bmn();
        this.bmm();
        if (this.goE || this.goC) {
            return;
        }
        this.bmp();
    }

    private void bml() {
        if (this.goJ == 0) {
            return;
        }
        this.epT.aam(5);
        this.epT.aam(5);
        this.epT.g(this.goI.emQ());
        this.epT.f(this.goH.emQ());
        if ((this.goJ & 4) != 0) {
            this.epT.bJ(this.gnS, this.gnW);
            this.epT.aam(this.epT.efu() | 0x100);
        }
        if ((this.goJ & 8) != 0) {
            this.epT.bK(this.gnT, this.gnX);
            this.epT.aam(this.epT.efu() | 0x200);
        }
        if ((this.goJ & 0x10) != 0) {
            this.epT.bL(this.gnU, this.gnY);
            this.epT.aam(this.epT.efu() | 0x400);
        }
        if ((this.goJ & 0x20) != 0) {
            this.epT.bM(this.gnV, this.gnZ);
            this.epT.aam(this.epT.efu() | 0x800);
        }
        this.MessageDelegator.a(this.epT);
        this.goJ = 0;
    }

    private void bmm() {
        if (this.goL == 0) {
            return;
        }
        this.MessageDelegator.a(this.goR);
        this.goL = 0;
    }

    private void bmn() {
        if (this.goK == 0) {
            return;
        }
        if (this.goM.isEmpty()) {
            return;
        }
        for (Map.Entry entry : this.goM.entrySet()) {
            kpu kpu2 = (kpu)this.MessageDelegator.h(3588);
            kpu2.JE(2);
            kpu2.JF((Integer)entry.getKey());
            kpu2.kW((String)entry.getValue());
            kpu2.wD(false);
            kpu2.jM(false);
            kpu2.hC(this.getGUID());
            kpu2.ts(this.getGUID());
            this.MessageDelegator.a(kpu2);
        }
        this.goK = 0;
        this.goM.clear();
    }

    private void bmo() {
        if (this.goO == 0) {
            return;
        }
        kpt kpt2 = (kpt)this.MessageDelegator.h(3585);
        kpt2.JD(1);
        kpt2.gW(this.goN);
        kpt2.wD(false);
        kpt2.jM(false);
        kpt2.hC(this.getGUID());
        kpt2.ts(this.getGUID());
        this.MessageDelegator.a(kpt2);
        this.goO = 0;
    }

    private void updateObject() {
        if (this.dcq == 0 || !this.gny) {
            return;
        }
        if ((this.dcq & 1) > 0 || (this.dcq & 2) > 0) {
            this.MessageDelegator.a(this.goQ);
        }
        if ((this.dcq & 4) > 0) {
            kll kll2 = (kll)this.MessageDelegator.h(1035);
            kll2.wD(false);
            kll2.jM(false);
            kll2.hC(this.getGUID());
            kll2.ts(this.getGUID());
            kll2.setObjectType(this.getObjectType());
            kll2.YR(1);
            this.MessageDelegator.a(kll2);
        }
        this.dcq = 0;
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            this.bmq();
            this.Initialized = true;
        }
    }

    @Override
    public void cleanUp() {
        if (!this.CleanedUp) {
            super.cleanUp();
            if (this.Initialized) {
                this.bmr();
            }
            this.CleanedUp = true;
        }
    }

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        if (ktf2.egN() == 1) {
            ksv ksv2 = (ksv)ktf2;
            this.gnx = true;
            if (ksv2.getResult() == 0) {
                this.gny = true;
                if (!this.goP) {
                    kla kla2 = (kla)gnw.h(1028);
                    kla2.ts(this.getGUID());
                    kla2.hC(this.getGUID());
                    kla2.wD(false);
                    kla2.jM(false);
                    kla2.HW(2);
                    kla2.setVisible(true);
                    this.MessageDelegator.a(kla2);
                }
            }
        }
    }

    private void bmp() {
        kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
        kmj2.wD(false);
        kmj2.aO(false);
        kmj2.jM(false);
        kmj2.hC(this.GUID);
        kmj2.ts(this.GUID);
        kmj2.Zf(1);
        this.MessageDelegator.a(kmj2);
        this.goE = true;
    }

    private void bmq() {
        assert (this.ekh != null);
        krr krr2 = (krr)this.MessageDelegator.j(1);
        krr2.xe("Normal");
        krr2.setObjectType(this.ObjectType);
        krr2.hC(this.GUID);
        krr2.c(new ljq(this.goQ.pHG, this.goQ.pHH, this.goQ.pHI));
        krr2.xC(true);
        lgl lgl2 = new lgl(this.goQ.rb, this.goQ.rc, this.goQ.rd, this.goQ.pHJ);
        assert (lgl2.eqP());
        krr2.a(lgl2);
        krr2.ts(this.GUID);
        krr2.xd("");
        krr2.xc(this.ekh);
        krr2.xD(true);
        krr2.aaz(1);
        if (this.goP) {
            krr2.setVisible(true);
            krr2.aaA(64);
        } else {
            krr2.aaA(2);
            krr2.setVisible(false);
        }
        this.MessageDelegator.a(krr2);
        this.goQ.ts(this.getGUID());
        this.goQ.hC(this.getGUID());
        this.epT.ts(this.getGUID());
        this.epT.hC(this.getGUID());
        this.goR.ts(this.getGUID());
        this.goR.hC(this.getGUID());
        this.dcq = 0;
    }

    private void bmr() {
        if (!this.gny) {
            return;
        }
        klb klb2 = (klb)this.MessageDelegator.h(1026);
        klb2.jM(false);
        klb2.wD(false);
        klb2.ts(this.getGUID());
        klb2.hC(this.getGUID());
        klb2.HX(klb.iHB);
        this.MessageDelegator.a(klb2);
        this.dcq = 0;
    }

    public String getMeshXML() {
        return this.ekh;
    }

    public void setMeshXML(String string) {
        this.ekh = string;
    }

    public ljq av() {
        return new ljq(this.goQ.pHG, this.goQ.pHH, this.goQ.pHI);
    }

    public void c(ljq ljq2) {
        this.goQ.pHG = ljq2.x;
        this.goQ.pHH = ljq2.y;
        this.goQ.pHI = ljq2.rlV;
        this.dcq |= 1;
    }

    public lgl aw() {
        return new lgl(this.goQ.rb, this.goQ.rc, this.goQ.rd, this.goQ.pHJ);
    }

    public void a(lgl lgl2) {
        assert (lgl2.eqP());
        this.goQ.rb = lgl2.x;
        this.goQ.rc = lgl2.y;
        this.goQ.rd = lgl2.rlV;
        this.goQ.pHJ = lgl2.rlW;
        this.dcq |= 2;
    }

    public lcq bms() {
        return this.goI;
    }

    public void n(lcq lcq2) {
        this.goI = lcq2;
        this.goJ |= 2;
    }

    public void u(int n2, String string) {
        this.goM.put(new Integer(n2), string);
        this.goK = 1;
    }

    public void setGlobalShader(String string) {
        this.goN = string;
        this.goO = 1;
    }

    public lcq bmt() {
        return this.goH;
    }

    public void o(lcq lcq2) {
        this.goH = lcq2;
        this.goJ |= 1;
    }

    public String getGlobalShader() {
        return this.goN;
    }

    public boolean bmu() {
        return this.goP;
    }

    public void hS(boolean bl) {
        this.goP = bl;
    }

    public void setScale(float f2) {
        this.goR.setScale(f2);
        this.goL = 1;
    }

    public float getScale() {
        return this.goR.getScale();
    }

    public final boolean bmv() {
        return this.goC;
    }

    public final void aO(boolean bl) {
        this.goC = bl;
    }

    public void bJ(int n2, int n3) {
        if (n2 == 0) {
            return;
        }
        this.gnS = n2;
        this.gnW = n3;
        this.goJ |= 4;
    }

    public void bK(int n2, int n3) {
        if (n2 == 0) {
            return;
        }
        this.gnT = n2;
        this.gnX = n3;
        this.goJ |= 8;
    }

    public void bL(int n2, int n3) {
        if (n2 == 0) {
            return;
        }
        this.gnU = n2;
        this.gnY = n3;
        this.goJ |= 0x10;
    }

    public void bM(int n2, int n3) {
        if (n2 == 0) {
            return;
        }
        this.gnV = n2;
        this.gnZ = n3;
        this.goJ |= 0x20;
    }
}

