/*
 * Decompiled with CFR.
 */
public class anz {
    private final float bIs = 0.05f;
    private final double bIt = 0.08;
    private final double bIu = 1.0;
    private double bIv = 1.5707963267948966;
    private double bIw = 2.0;
    private double bIx = 7.0;
    private double bIy;
    private ldv bCl;
    private ldv GUID;
    private final asc bIz;
    private ljq bIA = new ljq();
    private ljq Position;
    private float mh;
    private float bIB;
    private boolean bIC;
    private final asr bID = new asr(12, 4);
    private final asr bIE = new asr(60, 20);
    private final asr bIF = new asr(60, 20);
    private dxr MessageDelegator;
    private int aZa;

    public ljq av() {
        return this.Position;
    }

    public float OF() {
        return this.mh;
    }

    public void J(double d2) {
        this.bIw = d2;
    }

    public void bB(boolean bl) {
        this.bIC = bl;
    }

    public void K(double d2) {
        this.bIx = d2;
    }

    public void L(double d2) {
        this.bIv = d2;
    }

    public boolean OG() {
        return this.MessageDelegator == null || this.GUID == null || this.bCl == null;
    }

    public void a(dxr dxr2, ldv ldv2, ldv ldv3) {
        this.MessageDelegator = dxr2;
        this.GUID = ldv2;
        this.bCl = ldv3;
    }

    public anz(ljq ljq2, float f, asc asc2) {
        this.bIz = asc2;
        this.aZa = 0;
        this.Position = ljq2.esF();
        this.mh = f;
        this.bIy = 0.0;
    }

    private void as(ljq ljq2) {
        if (ljq2 == null) {
            return;
        }
        if (this.bIz == null) {
            return;
        }
        float f = this.bIz.SY();
        ljq ljq3 = ljq2.esF();
        ljq3.x = (float)((double)ljq3.x - (double)f * Math.sin(this.mh));
        ljq3.rlV = (float)((double)ljq3.rlV - (double)f * Math.cos(this.mh));
        ljq3.y = this.bIz.aD(ljq3);
        if (ljq3.y == -3.4028235E38f || ljq2.y == -3.4028235E38f) {
            return;
        }
        ljq3.et(ljq2);
        ljq3.normalize();
        this.bIB = 0.8f * (float)this.bIF.d(this.aZa, Math.asin(ljq3.y));
    }

    private void at(ljq ljq2) {
        if (ljq2 == null) {
            return;
        }
        if (this.bIz == null) {
            return;
        }
        float f = this.bIz.aD(ljq2);
        if (f == -3.4028235E38f) {
            return;
        }
        ljq2.y = f;
    }

    private void M(double d2) {
        if (d2 > 0.08 * this.bIy) {
            d2 = 0.08 * this.bIy;
        }
        this.Position.x = (float)((double)this.Position.x - d2 * Math.sin(this.mh));
        this.Position.rlV = (float)((double)this.Position.rlV - d2 * Math.cos(this.mh));
        float f = this.Position.y;
        this.at(this.Position);
        this.Position.y = 0.05f + (float)this.bID.d(this.aZa, this.Position.y);
    }

    private void bC(boolean bl) {
        this.bIy = this.bIw;
        if (bl) {
            this.bIy = this.bIx;
        }
        double d2 = Math.max(0.0, Math.cos(this.bIB));
        this.bIy = Math.max(this.bIw / 4.0, d2 * this.bIy);
        this.bIy = this.bIE.d(this.aZa, this.bIy);
    }

    private boolean by(float f) {
        boolean bl = false;
        float f2 = (float)(0.08 * this.bIv);
        float f3 = f - this.mh;
        while ((double)f3 > Math.PI) {
            f3 = (float)((double)f3 - Math.PI * 2);
        }
        while ((double)f3 < -Math.PI) {
            f3 = (float)((double)f3 + Math.PI * 2);
        }
        if ((double)Math.abs(f3) >= 0.7853981633974483) {
            bl = true;
        }
        if (f3 > f2) {
            f3 = f2;
        }
        if (f3 < -f2) {
            f3 = -f2;
        }
        this.mh += f3;
        while ((double)this.mh > Math.PI) {
            this.mh = (float)((double)this.mh - Math.PI * 2);
        }
        while ((double)this.mh < -Math.PI) {
            this.mh = (float)((double)this.mh + Math.PI * 2);
        }
        return bl;
    }

    public boolean N(double d2) {
        int n = mfz.ex(d2) + 10;
        if (this.aZa == 0) {
            this.aZa = n;
        }
        if (this.aZa < n - 1) {
            this.aZa += 2;
            return true;
        }
        return false;
    }

    public boolean a(ljp ljp2, boolean bl) {
        if (ljp2 == null) {
            return false;
        }
        this.bIA.x = ljp2.x - this.Position.x;
        this.bIA.y = 0.0f;
        this.bIA.rlV = ljp2.y - this.Position.rlV;
        double d2 = this.bIA.eqN();
        this.bC(bl);
        boolean bl2 = this.by(arw.aA(this.bIA));
        this.M(d2);
        double d3 = 1.0;
        if (bl2) {
            d3 = Math.max(d3, 0.1 + this.bIy / this.bIv);
        }
        this.as(this.Position);
        return d2 < d3;
    }

    public void OH() {
        if (this.bCl == null) {
            return;
        }
        if (this.MessageDelegator == null) {
            return;
        }
        if (this.GUID == null) {
            return;
        }
        ftw ftw2 = (ftw)this.MessageDelegator.h(1039, this.GUID, this.bCl);
        ftw2.imk = 3;
        ftw2.Position = this.Position.esF();
        float f = 0.0f;
        if (this.bIC) {
            f = lew.A(this.bIB, -0.7853982f, 0.7853982f);
        }
        ftw2.Rotation = new lgl(f, this.mh, 0.0f);
        ftw2.aZa = this.aZa;
        this.MessageDelegator.I(ftw2);
    }
}

