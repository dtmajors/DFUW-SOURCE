/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  lcr
 */
public class nae
extends btk
implements bto {
    private bvf eec = null;
    bzt eik = null;
    private ldv EYD = null;
    private int[] EYE = new int[255];
    int mb = 65539;
    float bzb = 0.0f;
    int EYF = 0;

    @Override
    public void initialize() {
        jyg jyg2 = new jyg(false);
        this.eec = (bvf)jyg2.d("hum_m.xml", bve.a.dQu);
        if (this.eec == null) {
            return;
        }
        this.eec.setGUID(this.MessageDelegator.bzv());
        this.eec.c(mje.DBl.esF());
        this.eec.a(new lgl());
        this.MessageDelegator.a((amf)this.eec);
        this.eik = new bzt();
        this.eik.b(this.eec);
        this.eik.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eik);
        kja kja2 = (kja)this.MessageDelegator.h(2052);
        kja2.pDM = 7195;
        kja2.ec = this.GUID;
        kja2.nN = lcr.rg;
        kja2.hs = lcr.qBS;
        kja2.Rs = this.eec.getGUID();
        kja2.pCY = 2040030;
        float f = 1.81f;
        kja2.byT = 0.3f;
        kja2.pDR = 0.5f;
        kja2.pDS = f * 2.2f;
        kja2.pDN = false;
        kja2.Active = true;
        kja2.iNo = new ljq(0.0f, f, 0.0f);
        this.MessageDelegator.a(kja2);
        kmw kmw2 = (kmw)this.MessageDelegator.h(3333);
        kmw2.iBr = true;
        kmw2.ec = this.GUID;
        kmw2.pPe = 6145;
        kmw2.ddh = 1.1E-4f;
        kmw2.ddi = 1.1E-4f;
        kmw2.Rs = this.GUID;
        kmw2.dsK = true;
        this.MessageDelegator.a(kmw2);
        for (amf amf2 : this.MessageDelegator.bzx().bzr()) {
            if (amf2.getObjectType() != 25) continue;
            dle dle2 = (dle)amf2;
            dle2.I(this.eec.getGUID(), false);
            dle2.ik(false);
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 5376 && this.EYD == null) {
            this.EYD = ktv2.axa();
            kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
            kmj2.Zf(8);
            kmj2.wD(false);
            kmj2.ts(this.GUID);
            kmj2.hC(this.eec.axa());
            kmj2.tE(this.EYD);
            this.MessageDelegator.a(kmj2);
        }
    }

    @Override
    public void cleanUp() {
        if (this.eec != null) {
            Object object2;
            for (Object object2 : this.MessageDelegator.bzx().bzr()) {
                if (((amf)object2).getObjectType() != 25) continue;
                dle dle2 = (dle)object2;
                dle2.mN(this.eec.getGUID());
                dle2.ik(true);
            }
            this.MessageDelegator.hd(this.eik.getGUID());
            this.eik = null;
            kio kio2 = (kio)this.MessageDelegator.h(2057);
            kio2.XW(2);
            kio2.oG(lcr.rg);
            kio2.e(lcr.qBS);
            kio2.ts(this.GUID);
            this.MessageDelegator.a(kio2);
            object2 = (kmw)this.MessageDelegator.h(3333);
            ((kmw)object2).iBr = false;
            ((kmw)object2).ec = this.GUID;
            ((kmw)object2).pPe = 2;
            ((kmw)object2).Rs = this.EYD;
            this.MessageDelegator.a(kio2);
            this.MessageDelegator.hd(this.eec.getGUID());
            this.eec = null;
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        ljq ljq2;
        amf amf2;
        if (this.eec != null && (amf2 = this.MessageDelegator.bzx().bzt().d(lcr.rg)) != null) {
            dld dld2 = (dld)amf2;
            ljq2 = dld2.aw().eqT();
            this.eec.d(new ljq(0.0f, ljq2.y + 3.14f, 0.0f));
        }
        int n2 = 65539;
        float f = 0.0f;
        ljq2 = new ljq(0.0f, 0.0f, 0.0f);
        if (this.EYE[17] == 1) {
            ljq2.es(new ljq(0.0f, 0.0f, -1.0f));
            n2 = 0x10000E;
            f = 3.7f;
            if (this.EYE[42] == 1) {
                n2 = 0x100190;
                f = 15.5f;
            }
        }
        if (this.EYE[30] == 1) {
            ljq2.es(new ljq(1.0f, 0.0f, 0.0f));
            n2 = 0x100011;
            f = 2.8f;
        }
        if (this.EYE[32] == 1) {
            ljq2.es(new ljq(-1.0f, 0.0f, 0.0f));
            n2 = 0x100010;
            f = 2.8f;
        }
        if (this.EYE[31] == 1) {
            ljq2.es(new ljq(0.0f, 0.0f, 1.0f));
            n2 = 983050;
            f = 2.5f;
        }
        if (this.EYE[17] == 1 && this.EYE[30] == 1) {
            n2 = 0x100012;
        }
        if (this.EYE[17] == 1 && this.EYE[32] == 1) {
            n2 = 0x10000F;
        }
        if (this.EYE[31] == 1 && this.EYE[30] == 1) {
            n2 = 983051;
        }
        if (this.EYE[31] == 1 && this.EYE[32] == 1) {
            n2 = 983049;
        }
        if (this.EYE[57] == 1 && this.EYF == 0) {
            n2 = 196793;
            this.eUw();
        } else if (!ljq2.isZero()) {
            this.fb(ljq2);
        }
        if (this.bzb != f) {
            this.bzb = f;
            kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
            kmj2.pNm = 2;
            kmj2.ec = this.GUID;
            kmj2.Rs = this.eec.getGUID();
            kmj2.pNn = this.bzb;
            this.MessageDelegator.a(kmj2);
        }
        if (n2 != this.mb) {
            this.mb = n2;
            this.agc(this.mb);
        }
        this.EYF = this.EYE[57];
    }

    public void agc(int n2) {
        dzv dzv2 = (dzv)this.MessageDelegator.h(7425, this.GUID, this.eec.getGUID());
        dzv2.dTs = n2;
        this.MessageDelegator.F(dzv2);
    }

    public boolean b(fjr fjr2) {
        myp[] mypArray = fjr2.bPV();
        myp myp22 = null;
        int n2 = 0;
        for (myp myp22 : mypArray) {
            if (myp22 == null) {
                lfn.b(4, "SFWorldbuilderLogic", "handleKeyInput() : Got a NULL keyEvent!");
                return false;
            }
            n2 = myp22.dMu();
            if (n2 < 0 || n2 > 255) continue;
            if (myp22.eTh()) {
                this.EYE[n2] = 1;
            }
            if (!myp22.eTg()) continue;
            this.EYE[n2] = 0;
        }
        return this.EYE[87] != 1 || this.EYE[29] != 1 && this.EYE[157] != 1;
    }

    public void eUw() {
        kmw kmw2 = (kmw)this.MessageDelegator.h(3333);
        kmw2.iBr = false;
        kmw2.ec = this.GUID;
        kmw2.Rs = this.EYD;
        kmw2.pPe = 16;
        kmw2.pMH = true;
        this.MessageDelegator.a(kmw2);
    }

    void fb(ljq ljq2) {
        kmw kmw2 = (kmw)this.MessageDelegator.h(3333);
        kmw2.iBr = false;
        kmw2.ec = this.GUID;
        kmw2.Rs = this.EYD;
        kmw2.pPe = 8;
        kmw2.pPf = ljq2;
        this.MessageDelegator.a(kmw2);
    }
}

