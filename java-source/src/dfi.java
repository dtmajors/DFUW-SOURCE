/*
 * Decompiled with CFR.
 */
public class dfi
extends dey {
    private int dcq = 0;
    private kjv goc = null;

    public dfi() {
        this.gnv = 24;
        this.goc = (kjv)gnw.h(1806);
        this.gnx = false;
        this.gny = false;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.Initialized) {
            return;
        }
        super.doTick(ldz2);
        this.updateObject();
    }

    private void updateObject() {
        if (!this.gnx) {
            return;
        }
        if (this.dcq == 0) {
            return;
        }
        this.goc.wD(false);
        assert ((this.dcq & kjv.iHB) == 0);
        this.goc.Yq(this.dcq);
        this.MessageDelegator.a(this.goc);
        this.dcq = 0;
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 1792 && ktv2.getResult() == 0) {
            this.gnx = true;
            this.gny = true;
        }
    }

    @Override
    public void cleanUp() {
        if (!this.CleanedUp && this.Initialized) {
            this.blP();
        }
        super.cleanUp();
    }

    @Override
    public void initialize() {
        super.initialize();
        this.blO();
    }

    @Override
    public void setDefaultValues() {
        super.setDefaultValues();
    }

    public void blO() {
        this.goc.ts(this.GUID);
        this.goc.lQ(false);
        this.goc.wD(true);
        this.goc.jM(false);
        this.goc.tD(this.GUID);
        this.goc.Yq(kjv.pFG);
        this.MessageDelegator.a(this.goc);
    }

    public void blP() {
        kjv kjv2 = (kjv)gnw.h(1806);
        kjv2.Yq(kjv.iHB);
        kjv2.ts(this.GUID);
        kjv2.lQ(false);
        kjv2.wD(false);
        kjv2.jM(false);
        kjv2.tD(this.GUID);
        kjv2.c(new ljq());
        kjv2.a(new lgl());
        kjv2.iL("");
        kjv2.bM(new ljq(0.0f, 0.0f, 0.0f));
        kjv2.l(new lcq(0.0f, 0.0f, 0.0f, 0.0f));
        this.MessageDelegator.a(kjv2);
        this.gny = false;
        this.gnx = false;
        this.dcq = 0;
    }

    public float blQ() {
        return this.goc.blQ();
    }

    public void go(float f2) {
        this.goc.go(f2);
        this.dcq |= kjv.pFH;
    }

    public ljq av() {
        return this.goc.av();
    }

    public void c(ljq ljq2) {
        this.goc.c(ljq2);
        this.dcq |= kjv.goz;
    }

    public boolean blR() {
        return this.goc.blR();
    }

    public void hR(boolean bl) {
        this.goc.hR(bl);
        this.dcq |= kjv.pFJ;
    }

    public lgl aw() {
        return this.goc.aw();
    }

    public void a(lgl lgl2) {
        this.goc.a(lgl2);
        this.dcq |= kjv.goA;
    }

    public ljq blS() {
        return this.goc.blS();
    }

    public void bM(ljq ljq2) {
        this.goc.bM(ljq2);
        this.dcq |= kjv.iGB;
    }

    public lcq blT() {
        return this.goc.blT();
    }

    public void l(lcq lcq2) {
        this.goc.l(lcq2);
        this.dcq |= kjv.pFI;
    }

    public String blU() {
        return this.goc.blU();
    }

    public void iL(String string) {
        this.goc.iL(string);
    }
}

