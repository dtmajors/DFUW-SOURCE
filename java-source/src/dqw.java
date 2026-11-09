/*
 * Decompiled with CFR.
 */
public class dqw
extends btk
implements bto {
    public static final float gQp = 3.0f;
    private final boolean bC = false;
    public static final int gQq = 1;
    public static final int gQr = 2;
    public static final int gQs = 3;
    private int gPb;
    private String gOn;
    private static final float dKJ = 1.0f;
    private float gPP = 3.0f;
    private final float gQt = 2.0f;
    private boolean aME;
    private ldv gQu;
    private int gQv = ber.ddU;
    private String gQw;
    private lhw gQx;
    private boolean gQy;

    public dqw() {
        this.ObjectType = 126;
        this.gOn = "ambience/adagio fairissisimo.ogg";
    }

    @Override
    public void initialize() {
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.gQx != null && this.gQx.eb(ldz2.rgz)) {
            this.gQx = null;
            this.iW(this.gQw);
            this.gQw = null;
            this.setStarted(true);
            this.buB();
            return;
        }
        if (this.gQx == null && this.gQv != ber.ddU) {
            this.gPb |= 8;
            this.gQv = ber.ddU;
        }
        if (this.gPb != 0) {
            this.buB();
        }
    }

    private void buB() {
        kim kim2 = (kim)this.MessageDelegator.h(1282);
        kim2.ts(this.GUID);
        if (this.gQu == null) {
            if (!this.aME) {
                return;
            }
            this.buC();
            return;
        }
        if ((this.gPb & 2) != 0) {
            this.buD();
            this.buC();
            this.gPb = 0;
            return;
        }
        float f2 = 1.0f * ((float)ber.ddU / 100.0f);
        if (this.gQy) {
            f2 = 0.0f;
        }
        f2 = lew.A(f2, 0.0f, 1.0f);
        int n = 0;
        if ((this.gPb & 4) != 0) {
            if (this.aME) {
                n |= 2;
            } else {
                n |= 4;
                f2 = 0.0f;
            }
        }
        if ((this.gPb & 8) != 0) {
            n |= 8;
        }
        kim2.tB(this.gQu);
        kim2.pBh = n;
        kim2.ResourceName = this.gOn;
        kim2.pBi = f2;
        kim2.gPP = this.gPP;
        this.MessageDelegator.a(kim2);
        this.gPb = 0;
    }

    private void buC() {
        if (this.gQu != null) {
            return;
        }
        this.gQu = this.MessageDelegator.bzv();
        kim kim2 = (kim)this.MessageDelegator.h(1282);
        kim2.ts(this.GUID);
        kim2.tB(this.gQu);
        kim2.pBh = 3;
        kim2.ResourceName = this.gOn;
        kim2.pBi = this.gQy ? 0.0f : 1.0f * ((float)ber.ddU / 100.0f);
        kim2.gPP = this.gPP;
        this.MessageDelegator.a(kim2);
    }

    private void buD() {
        if (this.gQu == null) {
            return;
        }
        kig kig2 = (kig)this.MessageDelegator.h(1287);
        kig2.ts(this.GUID);
        kig2.tB(this.gQu);
        kig2.XO(1);
        this.MessageDelegator.a(kig2);
        this.gQu = null;
    }

    public String btn() {
        return this.gOn;
    }

    public void iW(String string) {
        this.gOn = string;
        this.gPb |= 2;
    }

    public void iY(String string) {
        if (string == null) {
            return;
        }
        if (!string.startsWith("ambience/")) {
            string = "ambience/" + string;
        }
        if (this.gQx != null) {
            this.gQw = string;
            return;
        }
        this.gQw = string;
        this.setStarted(false);
        double d2 = this.gPP + 2.0f;
        this.gQx = new lhw(this.MessageDelegator.arc().rgz, d2);
    }

    public void setStarted(boolean bl) {
        this.aME = bl;
        this.gPb |= 4;
    }

    public boolean isStarted() {
        return this.aME;
    }

    public void hs(float f2) {
        this.gPP = f2;
    }

    public boolean buE() {
        return this.gQy;
    }

    public void iR(boolean bl) {
        if (bl == this.gQy) {
            return;
        }
        this.gQy = bl;
        this.gPb |= 8;
    }
}

