/*
 * Decompiled with CFR.
 */
public class dky
extends btk {
    private ldv gEN = null;
    private boolean bqw = false;
    private boolean gEO = false;
    private ljq Position = null;
    private ljq eMC = null;
    private lgl Rotation = null;
    private lgl gEP = null;
    private int gfi = 10;

    public void aZC() {
        kpl kpl2 = (kpl)this.MessageDelegator.h(517);
        kpl2.lQ(false);
        kpl2.wC(false);
        kpl2.jM(true);
        kpl2.wD(false);
        kpl2.sy(this.getGUID());
        kpl2.ts(this.getGUID());
        kpl2.hK(this.gEN);
        kpl2.aai(1);
        kpl2.aaj(1);
        kpl2.aag(1);
        kpl2.aah(3);
        kpl2.zP(this.gfi);
        this.bqw = true;
        this.MessageDelegator.a(kpl2);
    }

    public void aoJ() {
        if (!this.bqw) {
            return;
        }
        kpl kpl2 = (kpl)this.MessageDelegator.h(517);
        kpl2.aag(2);
        kpl2.hK(this.bol());
        kpl2.sy(this.getGUID());
        kpl2.ts(this.getGUID());
        kpl2.wD(false);
        kpl2.jM(true);
        this.bqw = false;
        this.MessageDelegator.a(kpl2);
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
            this.aZC();
            this.Initialized = true;
        }
    }

    @Override
    public void cleanUp() {
        this.aoJ();
        this.CleanedUp = true;
    }

    public ldv bol() {
        return this.gEN;
    }

    public void mL(ldv ldv2) {
        this.gEN = ldv2;
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 512) {
            if (ktv2.getResult() != 0) {
                this.bqw = false;
            }
        } else if (ktv2.egT() == 516) {
            this.b((kwp)ktv2);
        }
    }

    private void b(kwp kwp2) {
        this.gEO = true;
        this.eMC = this.Position;
        this.gEP = this.Rotation;
        this.Position = kwp2.av();
        this.Rotation = kwp2.aw();
        kpl kpl2 = (kpl)this.MessageDelegator.h(517);
        kpl2.aag(4);
        kpl2.hK(this.bol());
        kpl2.sy(this.getGUID());
        kpl2.ts(this.getGUID());
        kpl2.wD(false);
        kpl2.jM(true);
        this.MessageDelegator.a(kpl2);
    }

    public ljq av() {
        return this.Position;
    }

    public ljq bom() {
        return this.eMC;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
        this.eMC = ljq2;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public lgl bon() {
        return this.gEP;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
        this.gEP = lgl2;
    }

    public boolean boo() {
        return this.bqw;
    }

    public boolean bop() {
        return this.gEO;
    }

    public int bkE() {
        return this.gfi;
    }

    public void zP(int n) {
        this.gfi = n;
    }
}

