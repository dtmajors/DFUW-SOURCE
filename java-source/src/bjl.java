/*
 * Decompiled with CFR.
 */
public class bjl
extends btk
implements bto {
    private ldv akX = null;
    private float Magnitude = 0.0f;
    private ldv doO = null;
    private ldv doP = null;
    private double oV = 0.0;
    private ljq Position = new ljq(0.0f, 0.0f, 0.0f);
    private ljq Qe = new ljq(0.0f, 10.0f, 0.0f);
    private float doQ = 0.0f;
    private float doR = 1.0f;
    private int Type = 0;
    private int doS = -1;
    private float doT = 4.0f;
    private float doU = 2.0f;
    private float daN = 0.5f;
    private boolean doV = false;
    private float doW = 1.0f;
    private float doX = 0.5f;
    private float doY = 0.2f;
    private float doZ = 1.0f;

    @Override
    public void initialize() {
        super.initialize();
        this.oV = this.MessageDelegator.arc().rgz;
        this.daN = 0.7f;
        this.doT = 1.0f;
        this.doU = 0.7f;
        this.Position.y = (float)Math.random() * 0.3f - 0.2f;
        this.Position.x = (float)Math.random() * 0.3f - 0.15f;
        this.Position.rlV = (float)Math.random() * 0.3f - 0.15f;
        if (this.Type == bjm.dpb.ordinal()) {
            this.doT = 0.8f;
            this.doW = 1.5f;
            this.doX = 0.6f;
            this.doY = 0.1f;
            this.Qe = new ljq(0.0f, 1.0f, 0.0f);
            this.doQ = 0.0f;
            this.doU = 0.4f;
            if (this.doV) {
                this.doS = 15341849;
                this.Qe.y *= -1.0f;
            } else {
                this.doS = 0xD0D0D0;
            }
        } else if (this.Type == bjm.dpa.ordinal()) {
            this.doT = 1.5f;
            this.Qe = new ljq(0.0, 0.5, 0.0);
            this.doS = 4052520;
        } else if (this.Type == bjm.dpc.ordinal()) {
            this.doT = 0.8f;
            this.doW = 1.5f;
            this.doX = 0.7f;
            this.doY = 0.1f;
            this.Qe = new ljq(0.0f, 0.0f, 0.0f);
            this.doQ = 0.0f;
            this.doU = 0.6f;
            this.doS = 14731040;
        } else if (this.Type == bjm.dpd.ordinal()) {
            this.Position.x = (float)Math.random() * 1.0f - 0.5f;
            this.Position.rlV = (float)Math.random() * 1.0f - 0.5f;
            this.doT = 2.0f;
            this.Qe = new ljq(0.0f, 0.0f, 0.0f);
            this.doS = 7131065;
            this.daN = 0.8f;
            this.doU = 1.0f;
        }
        this.apJ();
        this.VO();
        this.VP();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.apL();
        this.apM();
        this.apK();
    }

    @Override
    public void receiveRenderResponse(kgz kgz2) {
        if (kgz2.X() == 9) {
            this.a((kgu)kgz2);
        } else {
            super.receiveRenderResponse(kgz2);
        }
    }

    private void a(kgu kgu2) {
        if (kgu2.dZa() == null) {
            this.MessageDelegator.hd(this.GUID);
            lfn.b(5, "SFFloatingDamageSprite", "handleRenderDynamicBitmapResponse() Failed to render bitmap");
            return;
        }
        this.doO = kgu2.dZa();
        kkp kkp2 = (kkp)this.MessageDelegator.h(1034);
        kkp2.ts(this.GUID);
        kkp2.hC(this.GUID);
        kkp2.setType(4);
        kkp2.tq(this.doO);
        kkp2.wD(false);
        this.MessageDelegator.a(kkp2);
    }

    private void apJ() {
        kkp kkp2 = (kkp)this.MessageDelegator.h(1034);
        kkp2.ts(this.GUID);
        kkp2.hC(this.GUID);
        kkp2.setType(1);
        kkp2.wD(true);
        kkp2.wX(false);
        kkp2.setScale(this.daN);
        this.MessageDelegator.a(kkp2);
    }

    private void apK() {
        if (this.doO == null) {
            return;
        }
        kga kga2 = (kga)this.MessageDelegator.BV(19);
        kga2.ts(this.GUID);
        kga2.setType(2);
        kga2.setGUID(this.doO);
        this.MessageDelegator.b(kga2);
    }

    private void VO() {
        this.doP = this.MessageDelegator.bzv();
        kni kni2 = (kni)this.MessageDelegator.h(782);
        kni2.ec = this.getGUID();
        kni2.pPN = 16;
        kni2.biE = new ljq(0.0f, 1.8f, 0.0f);
        kni2.biF = new lgl();
        kni2.ehv = this.akX;
        kni2.ehw = this.GUID;
        kni2.dsK = false;
        kni2.iBr = false;
        kni2.biD = false;
        kni2.doP = this.doP;
        this.MessageDelegator.a(kni2);
    }

    private void apL() {
        knj knj2 = (knj)this.MessageDelegator.h(778);
        knj2.ec = this.getGUID();
        knj2.pPN = 1;
        knj2.ehv = ldv.rfe;
        knj2.ehw = ldv.rfe;
        knj2.dsK = false;
        knj2.iBr = false;
        knj2.doP = this.doP;
        this.MessageDelegator.a(knj2);
        this.MessageDelegator.oa(this.doP);
    }

    private void apM() {
        klb klb2 = (klb)this.MessageDelegator.h(1026);
        klb2.ts(this.GUID);
        klb2.hC(this.GUID);
        klb2.HX(klb.iHB);
        this.MessageDelegator.a(klb2);
    }

    private void VP() {
        String string = String.format("%.1f", Float.valueOf(Math.abs(this.Magnitude)));
        String string2 = string.substring(string.length() - 2, string.length());
        if (string2.equals(".0")) {
            string = string.substring(0, string.length() - 2);
        }
        if (this.Type == bjm.dpd.ordinal() && (string = String.format("%.2f", Float.valueOf(Math.abs(this.Magnitude)))).substring(string.length() - 3, string.length()).equals(".00")) {
            string = string.substring(0, string.length() - 3);
        }
        if (this.doV && this.Type != bjm.dpd.ordinal()) {
            string = this.Magnitude > 0.0f ? "+" + string : "-" + string;
        }
        int n = 0;
        if (this.Type == bjm.dpc.ordinal()) {
            n = 0;
        } else if (this.Type == bjm.dpd.ordinal()) {
            n = 2;
        }
        String string3 = "FloatingDamage;" + string + ";" + this.doS + ";" + n;
        kga kga2 = (kga)this.MessageDelegator.BV(19);
        kga2.ts(this.GUID);
        kga2.setType(1);
        kga2.wH(string3);
        this.MessageDelegator.b(kga2);
    }

    public ldv getTargetObjectGUID() {
        return this.akX;
    }

    public void setTargetObjectGUID(ldv ldv2) {
        this.akX = ldv2;
    }

    public float uO() {
        return this.Magnitude;
    }

    public void N(float f) {
        this.Magnitude = f;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.oV > 0.0) {
            float f = (float)(this.MessageDelegator.arc().rgz - this.oV);
            ljq ljq2 = this.Qe.esF();
            ljq2.nm((float)ldz2.qwh);
            if (f < this.doY + 0.3f) {
                ljq2 = new ljq(0.0f, 0.0f, 0.0f);
            }
            this.Position.es(ljq2);
            this.Qe.y += this.doQ * (float)ldz2.qwh;
            float f2 = f / this.doY;
            f2 = lew.A(f2, 0.0f, 1.0f);
            this.daN = lew.o(this.doW, this.doX, f2) * this.doZ;
            this.doR = 1.0f;
            if (f > this.doU) {
                this.doR = 1.0f - (f - this.doU) / (this.doT - this.doU);
            }
            kkp kkp2 = (kkp)this.MessageDelegator.h(1034);
            kkp2.ts(this.GUID);
            kkp2.hC(this.GUID);
            kkp2.setType(56);
            kkp2.setScale(this.daN);
            kkp2.c(this.Position);
            kkp2.a(new ljr(this.doR, 1.0f, 1.0f, 1.0f));
            this.MessageDelegator.a(kkp2);
            if (f > this.doT) {
                this.MessageDelegator.hd(this.GUID);
            }
        }
    }

    public int getType() {
        return this.Type;
    }

    public void setType(int n) {
        this.Type = n;
    }

    public boolean apN() {
        return this.doV;
    }

    public void dn(boolean bl2) {
        this.doV = bl2;
    }

    public void kP(int n) {
        if (n == 0) {
            this.doZ = 0.7f;
        } else if (n == 1) {
            this.doZ = 1.0f;
        } else if (n == 2) {
            this.doZ = 1.3f;
        }
    }
}

