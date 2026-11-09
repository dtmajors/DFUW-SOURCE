/*
 * Decompiled with CFR.
 */
public abstract class knt
extends khd {
    protected float ljZ = 0.0f;
    protected boolean dsK = false;
    public boolean Visible = true;
    public ldv Rs = null;
    public int aFg = 0;

    knt() {
        this.Jv(256);
    }

    public void gk(float f) {
        this.ljZ = f;
    }

    public float eel() {
        return this.ljZ;
    }

    public void lQ(boolean bl) {
        this.dsK = bl;
    }

    public boolean ebP() {
        return this.dsK;
    }

    public void setVisible(boolean bl) {
        this.Visible = bl;
    }

    public boolean djL() {
        return this.Visible;
    }

    public void Nd(int n) {
        this.aFg = n;
    }

    public int cxr() {
        return this.aFg;
    }

    public void c(knt knt2) {
        this.ljZ = knt2.ljZ;
        this.dsK = knt2.dsK;
        this.Visible = knt2.Visible;
        this.Rs = knt2.Rs;
        super.d(knt2);
    }

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(1024);
        stringBuilder.append("{SF2DRequest: super=");
        stringBuilder.append(super.toString());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    @Override
    public String Xn(int n) {
        switch (n) {
            case 257: {
                return "SF2DTEXTREQUEST";
            }
            case 258: {
                return "SF2DSCROLLREQUEST";
            }
            case 259: {
                return "SF2DSPRITEREQUEST";
            }
            case 260: {
                return "SF2DLIFEREQUEST";
            }
            case 261: {
                return "SF2DFONTREQUEST";
            }
            case 262: {
                return "SF2DSPRITEDCREQUEST";
            }
            case 263: {
                return "SF2DCURSORREQUEST";
            }
        }
        assert (false) : n;
        return super.Xn(n);
    }
}

