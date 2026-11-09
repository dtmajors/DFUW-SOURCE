/*
 * Decompiled with CFR.
 */
public class dfb
extends dfd {
    protected boolean gnB = false;
    protected boolean gnC = false;
    protected boolean gnD = false;
    protected int gnE = 0;
    protected long gnF = 0L;
    protected long gnG = 100L;
    protected kib gnH = null;
    protected int dcq = 0;
    protected boolean gnI = false;

    dfb() {
        this.gnv = 3;
        this.gnH = (kib)gnw.h(1286);
    }

    @Override
    public void setDefaultValues() {
        super.setDefaultValues();
        this.gnB = false;
        this.gnC = false;
        this.gnD = false;
        this.gnE = 1;
        this.gnF = 0L;
        this.gnG = 1L;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.dcq == 0) {
            return;
        }
        this.gnH.XG(this.dcq);
        this.MessageDelegator.a(this.gnH);
        this.dcq = 0;
    }

    public boolean isEnableModifyFrequency() {
        return this.gnB;
    }

    public void setEnableModifyFrequency(boolean bl) {
        this.gnB = bl;
    }

    public boolean isEnableModifyPan() {
        return this.gnC;
    }

    public void setEnableModifyPan(boolean bl) {
        this.gnC = bl;
    }

    public boolean isEnableModifyVolume() {
        return this.gnD;
    }

    public void setEnableModifyVolume(boolean bl) {
        this.gnD = bl;
    }

    public int getFrequency() {
        return this.gnE;
    }

    public void setFrequency(int n2) {
        this.gnE = n2;
    }

    public long getPan() {
        return this.gnF;
    }

    public void setPan(long l2) {
        this.gnF = l2;
    }

    public long getVolume() {
        return this.gnG;
    }

    public void setVolume(long l2) {
        this.gnH.as(l2);
        this.gl(1.0f / (float)Math.pow(10.0, (float)Math.abs(l2) / 10.0f));
        this.gnG = l2;
        this.dcq |= 8;
    }

    public float blu() {
        return this.gnH.blu();
    }

    public void gl(float f2) {
        this.gnH.gl(f2);
        this.dcq |= 8;
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            this.bly();
            this.Initialized = true;
        }
    }

    @Override
    public void cleanUp() {
        if (!this.CleanedUp) {
            super.cleanUp();
            if (this.Initialized) {
                this.blE();
            }
            this.CleanedUp = true;
        }
    }

    public final void blv() {
        this.F(1, this.eMi);
    }

    public final void blw() {
        this.F(5, this.eMi);
    }

    public final void blx() {
        this.F(2, this.eMi);
    }

    private void bly() {
        krt krt2 = new krt();
        krt2.ts(this.GUID);
        krt2.aaD(1);
        krt2.aaE(2);
        krt2.xC(true);
        krt2.hC(this.GUID);
        krt2.xc(this.gnK);
        krt2.xE(this.gnL);
        krt2.wL(this.eMi);
        krt2.setEnableModifyFrequency(this.gnB);
        krt2.setEnableModifyPan(this.gnC);
        krt2.setEnableModifyVolume(this.gnD);
        krt2.c(new ljq());
        krt2.setConeOrientation(new ljq());
        krt2.bi(new ljq());
        krt2.hN(this.gnI);
        krt2.dh(this.gnH.blu());
        this.MessageDelegator.a(krt2);
        this.gnH.ts(this.GUID);
        this.gnH.tB(this.GUID);
        this.gnH.wD(false);
        this.gnH.jM(false);
        this.dcq = 0;
    }

    public boolean blz() {
        return this.gnI;
    }

    public void hN(boolean bl) {
        this.gnI = bl;
    }
}

