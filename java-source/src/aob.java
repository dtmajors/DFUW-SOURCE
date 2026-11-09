/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aob {
    private static final float bIM = 1.5f;
    private static final float bHH = 3.0f;
    public static final float bHN = 30.0f;
    public static final float bHO = 20.0f;
    public static final float bHP = 10.0f;
    public static final float bHR = 5.0f;
    public static final float bHS = -5.0f;
    public static final float bHT = 0.0f;
    public static final float bIN = 1.0f;
    private static final float bIO = 5.0f;
    public static final float bIP = 20.0f;
    public static final float bHY = 40.0f;
    public static final float bIQ = 10.0f;
    public static final float bIR = 8.0f;
    public static final float bIS = 6.0f;
    public static final float bIT = 5.0f;
    private anf bFP;
    private float bIa;
    private float bIb;
    private boolean bIc;
    private final float bIU = 214.5f;
    private final float bIV = 206.5f;
    private float bIW = 214.5f;
    private final ljq bIe;
    private float bIf;
    private float bIX;
    private float bIh;
    private float bIi;
    private boolean isMoving;
    private ldg[] bIY = new ldg[]{new ldg()};

    public aob(anf anf2) {
        this.bFP = anf2;
        this.bIY[0].cck = 0;
        this.bIY[0].Position = null;
        this.bIe = new ljq(0.0f, 0.0f, 0.0f);
        this.bIX = 20.0f;
        this.bIh = 20.0f;
        this.bIi = 8.0f;
        this.bIf = 0.0f;
        this.a(a.bJa);
    }

    private void Ou() {
        if (this.bIY[0] == null) {
            return;
        }
        anh.a(this.bIY, this.bFP.IW(), this.bFP.getMessageDelegator(), this.bFP.getGUID());
        ++this.bIY[0].cck;
        this.isMoving = true;
    }

    public ljq Pk() {
        ljq ljq2 = this.bIe.esF();
        ljq2.y += this.bIX * (1.0f + 0.2f * this.bIb);
        return ljq2;
    }

    public void bE(boolean bl) {
        this.bIW = bl ? 206.5f : 214.5f;
    }

    public void a(a a2) {
        this.bIa = (float)(2.0 * arw.Sw() * Math.PI);
        this.bIb = arw.Sx();
        if (a2 == a.bIZ) {
            this.bIc = true;
        }
        if (a2 == a.bJb) {
            this.bIc = false;
        }
        if (a2 == a.bJa) {
            this.bIc = !(arw.Sw() > 0.5);
        }
    }

    public void Pl() {
        ljq ljq2 = this.bIe.esF();
        ljq ljq3 = this.bIe.esF();
        ljq ljq4 = new ljq(0.0f, 1.0f, 0.0f);
        float f = this.bIi * (1.2f - 0.4f * this.bIb);
        float f2 = this.bIX * (1.1f - 0.2f * this.bIb);
        float f3 = this.bIh * (1.1f - 0.2f * this.bIb);
        this.bIX += this.bIf;
        ljq2.x = (float)((double)ljq2.x + (double)f3 * Math.cos(this.bIa));
        ljq2.rlV = (float)((double)ljq2.rlV + (double)f3 * Math.sin(this.bIa));
        ljq3.x = (float)((double)ljq3.x + (double)f3 * Math.cos((double)this.bIa + Math.PI));
        ljq3.rlV = (float)((double)ljq3.rlV + (double)f3 * Math.sin((double)this.bIa + Math.PI));
        ljq ljq5 = ljq.w(ljq2, ljq4);
        ljq ljq6 = ljq.w(ljq3, ljq4);
        ljq5.normalize();
        ljq6.normalize();
        if (!this.bIc) {
            ljq6 = ljq5;
        }
        ljq2.y += f2;
        ljq3.y += f2;
        float f4 = this.bFP.av().ez(ljq2);
        float f5 = this.bFP.av().ez(ljq3);
        this.bIY[0].fXV = f;
        if (f5 > f4) {
            this.bIY[0].mx = ljq6;
            this.bIY[0].Position = ljq3;
        } else {
            this.bIY[0].mx = ljq5;
            this.bIY[0].Position = ljq2;
        }
        this.Pm();
    }

    private void Pm() {
        float f;
        float f2 = this.bFP.Jn().f(this.bFP.av(), this.bIY[0].Position) + 5.0f;
        if (f2 > this.bIY[0].Position.y) {
            this.bIY[0].Position.y = f2;
        }
        if ((f = this.bFP.Jl().TX() - 1.5f) < 0.0f) {
            f = 0.0f;
        }
        if (this.bIY[0].Position.y > this.bIW - f) {
            this.bIY[0].Position.y = this.bIW - f;
        }
    }

    public boolean b(ljq ljq2, float f, float f2, float f3, float f4) {
        this.bIe.ex(ljq2);
        float f5 = this.bFP.Jn().u(this.bIe, 30.0f);
        if (f5 > this.bIe.y) {
            this.bIe.y = f5;
        }
        if (f5 + 5.0f > this.bIW) {
            return false;
        }
        this.bIh = f;
        this.bIX = f2;
        this.bIi = f3;
        this.bIf = f4;
        return true;
    }

    public void Ox() {
        anh.a(this.bFP.IW(), this.bFP.getMessageDelegator(), this.bFP.getGUID());
        this.bIY[0].Position = null;
        this.bIY[0].mx = null;
        this.isMoving = false;
    }

    public boolean Pn() {
        return false;
    }

    public void Po() {
        if (!this.isMoving) {
            if (!this.Pn()) {
                this.Pl();
            }
            this.Ou();
        } else {
            if (this.bFP.av().ez(this.bIY[0].Position) < 3.0f) {
                this.Ox();
            }
            if (this.bIY[0].Position != null && this.bIY[0].Position.y > this.bIW) {
                this.Ox();
            }
        }
    }

    public void terminate() {
        this.bFP = null;
        this.bIY = null;
    }
}

