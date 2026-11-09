/*
 * Decompiled with CFR.
 */
public class knr
extends knt {
    public static final int pQX = 1;
    public static final int pQY = 2;
    public static final int pQZ = 4;
    protected int pRa = 0;
    protected ldv iRG = null;

    knr() {
        this.Jv(260);
    }

    public int eek() {
        return this.pRa;
    }

    public void Zy(int n) {
        this.pRa = n;
    }

    public ldv bQp() {
        return this.iRG;
    }

    public void pL(ldv ldv2) {
        this.iRG = ldv2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(1024);
        stringBuilder.append("{SF2DLifeRequest: super=");
        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append("SF2DLifeRequestType=");
        stringBuilder.append(knr.Zz(this.pRa));
        stringBuilder.append(",");
        stringBuilder.append("NewGUID=");
        stringBuilder.append(this.iRG);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private static String Zz(int n) {
        StringBuilder stringBuilder = new StringBuilder(1024);
        n = knr.a(stringBuilder, n, 1, "Delete2DObject");
        n = knr.a(stringBuilder, n, 2, "Clone2DObject");
        if ((n = knr.a(stringBuilder, n, 4, "ChangeGUID")) != 0) {
            assert (false) : n;
            stringBuilder.append("+" + n);
        }
        return stringBuilder.toString();
    }
}

