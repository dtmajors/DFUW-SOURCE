/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class any {
    private static final float bHH = 10.0f;
    public static final float bHI = 80.0f;
    public static final float bHJ = 15.0f;
    public static final float bHK = 50.0f;
    public static final float bHL = -15.0f;
    public static final float bHM = 150.0f;
    public static final float bHN = 130.0f;
    public static final float bHO = 100.0f;
    public static final float bHP = 85.0f;
    public static final float bHQ = 50.0f;
    public static final float bHR = 10.0f;
    public static final float bHS = -10.0f;
    public static final float bHT = 0.0f;
    public static final float bHU = 35.0f;
    public static final float bHV = 25.0f;
    public static final float bHW = 20.0f;
    public static final float bHX = 10.0f;
    public static final float bHY = 160.0f;
    private ldg[] bHZ = new ldg[]{new ldg()};
    private anf bFP;
    private float bIa;
    private float bIb;
    private boolean bIc;
    private boolean bId;
    private final ljq bIe;
    private float bIf;
    private float bIg;
    private float bIh;
    private float bIi;
    private boolean bIj;
    private double bIk;
    private int bIl;
    private double bIm = Math.PI * 2;

    public any(anf anf2) {
        this.bFP = anf2;
        this.bHZ[0].cck = 0;
        this.bHZ[0].Position = null;
        this.bIe = new ljq(0.0f, 0.0f, 0.0f);
        this.bIg = 50.0f;
        this.bIh = 100.0f;
        this.bIi = 25.0f;
        this.bIf = 0.0f;
        this.a(a.bIo);
        this.bIj = false;
        this.bIk = -1.0;
    }

    private void Ou() {
        anh.a(this.bHZ, this.bFP.IW(), this.bFP.getMessageDelegator(), this.bFP.getGUID());
    }

    public void bz(boolean bl) {
        if (!this.Ow()) {
            this.bA(bl);
            this.Ou();
        } else if (this.bFP.av().ez(this.bHZ[0].Position) < 10.0f) {
            this.Ox();
        }
    }

    public ljq Ov() {
        ljq ljq2 = this.bIe.esF();
        ljq2.y += this.bIg * (1.0f + 0.2f * this.bIb);
        return ljq2;
    }

    public boolean Ow() {
        return this.bHZ[0].Position != null;
    }

    public void a(a a2) {
        this.bIa = (float)(2.0 * arw.Sw() * Math.PI);
        this.bIb = arw.Sx();
        this.bId = false;
        if (a2 == a.bIp) {
            this.bId = true;
        }
        if (a2 == a.bIn) {
            this.bIc = true;
        }
        if (a2 == a.bIq) {
            this.bIc = false;
        }
        if (a2 == a.bIo) {
            this.bIc = !(arw.Sw() > 0.5);
        }
    }

    public void bA(boolean bl) {
        float f;
        ljq ljq2;
        ljq ljq3;
        ljq ljq4 = this.bIe.esF();
        ljq ljq5 = this.bIe.esF();
        ljq ljq6 = new ljq(0.0f, 1.0f, 0.0f);
        float f2 = this.bIi * (1.0f - 0.2f * this.bIb);
        float f3 = this.bIg * (1.0f + 0.2f * this.bIb);
        float f4 = this.bIh * (1.0f - 0.2f * this.bIb);
        this.bIg += this.bIf;
        ljq4.x = (float)((double)ljq4.x + (double)f4 * Math.cos(this.bIa));
        ljq4.rlV = (float)((double)ljq4.rlV + (double)f4 * Math.sin(this.bIa));
        ljq5.x = (float)((double)ljq5.x + (double)f4 * Math.cos((double)this.bIa + Math.PI));
        ljq5.rlV = (float)((double)ljq5.rlV + (double)f4 * Math.sin((double)this.bIa + Math.PI));
        if (this.bId) {
            ljq3 = ljq.z(ljq4, this.bFP.av());
            ljq2 = ljq.z(ljq5, this.bFP.av());
            ljq3.normalize();
            ljq2.normalize();
        } else {
            ljq ljq7 = ljq.z(ljq4, this.bIe);
            ljq ljq8 = ljq.z(ljq5, this.bIe);
            ljq7.normalize();
            ljq8.normalize();
            ljq3 = ljq.w(ljq7, ljq6);
            ljq2 = ljq.w(ljq8, ljq6);
            ljq3.normalize();
            ljq2.normalize();
            if (!this.bIc) {
                ljq2 = ljq3;
            }
        }
        ljq4.y += f3;
        ljq5.y += f3;
        float f5 = this.bFP.av().ez(ljq4);
        float f6 = this.bFP.av().ez(ljq5);
        this.bHZ[0].fXV = f2;
        if (f6 > f5) {
            this.bHZ[0].mx = ljq2;
            this.bHZ[0].Position = ljq5;
        } else {
            this.bHZ[0].mx = ljq3;
            this.bHZ[0].Position = ljq4;
        }
        if (bl && (f = this.bFP.Jn().f(this.bFP.av(), this.bHZ[0].Position) + 15.0f) > this.bHZ[0].Position.y) {
            this.bHZ[0].Position.y = f;
        }
    }

    public void a(ljq ljq2, float f, float f2, float f3, float f4) {
        if (ljq2 == null) {
            return;
        }
        this.bIe.ex(ljq2);
        float f5 = this.bFP.Jn().u(this.bIe, 130.0f);
        if (f5 > -3.4028235E38f) {
            this.bIe.y = f5;
        }
        this.bIh = f;
        this.bIg = f2;
        this.bIi = f3;
        this.bIf = f4;
    }

    public void Ox() {
        anh.a(this.bFP.IW(), this.bFP.getMessageDelegator(), this.bFP.getGUID());
        this.bHZ[0].Position = null;
        this.bHZ[0].mx = null;
    }

    public void terminate() {
        this.bFP = null;
        this.bHZ = null;
    }

    public void Oy() {
        this.bFP.hg(590188);
        this.bIj = false;
    }

    public void Oz() {
        this.bFP.hg(590189);
        this.bIj = false;
    }

    public void OA() {
        this.bFP.hg(590275);
        this.bIj = false;
    }

    public void OB() {
        this.bFP.hg(590276);
        this.bIj = false;
    }

    public void OC() {
        boolean bl;
        if (this.bHZ[0].Position == null) {
            return;
        }
        if (this.bIk < 0.0) {
            this.bIk = this.bFP.Jp().rgz;
        }
        if (this.bFP.Jp().rgz < this.bIk + 5.0) {
            return;
        }
        this.bIk = this.bFP.Jp().rgz;
        boolean bl2 = bl = this.bHZ[0].Position.y < this.bFP.av().y;
        if (Math.random() < 0.2) {
            bl = false;
        }
        if (bl == this.bIj) {
            return;
        }
        this.bIj = bl;
        if (this.bIj) {
            this.bFP.hg(590187);
        } else {
            this.bFP.hg(590185);
        }
    }

    private boolean OD() {
        if (this.bFP.Jp().lpr == this.bIl) {
            return false;
        }
        this.bIl = this.bFP.Jp().lpr;
        return true;
    }

    private boolean bx(float f) {
        double d2;
        double d3 = this.bFP.Jp().qwh * this.bIm;
        double d4 = this.bFP.IV();
        arw.ct.debug("*** turnToRaw dif: " + d2 + "angle: " + f + "current: " + d4);
        for (d2 = (double)f - d4; d2 > Math.PI; d2 -= Math.PI * 2) {
        }
        while (d2 < -Math.PI) {
            d2 += Math.PI * 2;
        }
        if (Math.abs(d2) < 0.001) {
            return true;
        }
        if (d2 > d3) {
            d2 = d3;
        }
        if (d2 < -d3) {
            d2 = -d3;
        }
        d4 += d2;
        while (d4 > Math.PI) {
            d4 -= Math.PI * 2;
        }
        while (d4 < -Math.PI) {
            d4 += Math.PI * 2;
        }
        arw.ct.debug("*** FacingAngle, faceDirection with current = " + d4);
        arw.ct.debug("*** owner GUID: " + this.bFP.getGUID() + " characterObjectGUID: " + this.bFP.IW() + " mesh GUID: " + this.bFP.IX());
        lgl lgl2 = new lgl(0.0f, (float)d4, 0.0f);
        ljq ljq2 = new ljq(0.0f, 0.0f, 1.0f);
        ljq2 = lgl2.eq(ljq2);
        arw.ct.debug("*** turnToRaw direction: " + ljq2);
        this.bFP.i(2048, ljq2);
        return true;
    }

    public boolean ar(ljq ljq2) {
        if (ljq2 == null) {
            return false;
        }
        if (!this.OD()) {
            return true;
        }
        ljq ljq3 = this.bFP.av();
        ljq ljq4 = new ljq(ljq2.x - ljq3.x, 0.0f, ljq2.rlV - ljq3.rlV);
        ljq4.normalize();
        this.bFP.i(2048, ljq4);
        return true;
    }

    public boolean OE() {
        return this.ar(this.bFP.IZ().LC());
    }
}

