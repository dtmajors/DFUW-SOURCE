/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public abstract class dfd
extends dey {
    protected String gnK = null;
    protected boolean eMi = false;
    protected boolean gnL = false;
    protected boolean eMj = false;
    protected boolean gnM = true;
    protected dgj gnN = null;

    dfd() {
        this.gnx = false;
        this.gny = false;
    }

    @Override
    public void setDefaultValues() {
        super.setDefaultValues();
        this.gnK = "Default.xml";
        this.eMi = false;
        this.gnL = false;
        this.eMj = false;
    }

    public String getXMLFileName() {
        return this.gnK;
    }

    public void setXMLFileName(String string) {
        this.gnK = string;
    }

    public boolean isLooping() {
        return this.eMi;
    }

    public void setLooping(boolean bl) {
        this.eMi = bl;
    }

    public boolean blB() {
        return this.gnL;
    }

    public void hO(boolean bl) {
        this.gnL = bl;
    }

    public boolean isPlayingOnce() {
        return this.eMj;
    }

    public void setPlayingOnce(boolean bl) {
        this.eMj = bl;
    }

    public final void blC() {
        this.F(1, this.eMi);
    }

    public void play() {
        this.F(1, this.eMi);
        this.gnL = true;
    }

    public void stop() {
        this.F(2, this.eMi);
        this.gnL = false;
    }

    public void blD() {
        this.F(2, this.eMi);
    }

    @Override
    public final void receiveResourceResponse(ktf ktf2) {
        if (ktf2.egN() == 6) {
            this.gnx = true;
            ksx ksx2 = (ksx)ktf2;
            if (this.gnN != null) {
                float f2 = (float)ksx2.egL() / 1000.0f;
                this.gnN.receiveAudioDuration(f2 == 0.0f ? 10.0f : f2);
            }
            if (ksx2.getResult() == 0) {
                if (this.gnM) {
                    this.F(1, this.eMi);
                }
                this.gny = true;
            }
        } else {
            super.receiveResourceResponse(ktf2);
        }
    }

    protected void a(dey dey2) {
        super.copyValues(dey2);
        dfd dfd2 = (dfd)dey2;
        dfd2.setXMLFileName(this.gnK);
        dfd2.setLooping(this.eMi);
        dfd2.hO(this.gnL);
        dfd2.setPlayingOnce(this.eMj);
    }

    protected final void blE() {
        if (!this.gny) {
            return;
        }
        kig kig2 = (kig)this.MessageDelegator.h(1287);
        kig2.ts(this.GUID);
        kig2.tB(this.GUID);
        kig2.XO(1);
        this.MessageDelegator.a(kig2);
    }

    protected final void F(int n2, boolean bl) {
        assert (n2 > 0);
        kih kih2 = (kih)this.MessageDelegator.h(1281);
        kih2.ts(this.GUID);
        kih2.tB(this.GUID);
        kih2.XP(n2);
        kih2.wL(bl);
        this.MessageDelegator.a(kih2);
    }

    protected void c(dey dey2) {
        dfd dfd2 = (dfd)dey2;
        this.setXMLFileName(dfd2.getXMLFileName());
        this.setLooping(dfd2.isLooping());
        this.hO(dfd2.blB());
        this.setPlayingOnce(dfd2.isPlayingOnce());
    }

    public boolean blF() {
        return this.gnM;
    }

    public void hP(boolean bl) {
        this.gnM = bl;
    }

    public void c(dgj dgj2) {
        this.gnN = dgj2;
    }
}

