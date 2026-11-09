/*
 * Decompiled with CFR.
 */
public class fjd
extends fiv {
    private int iNy;

    public fjd() {
        super(2841);
    }

    public static fjd a(lbm<dxq> lbm2, ldv ldv2, a a2) {
        assert (a2 != null);
        fjd fjd2 = (fjd)lbm2.ik(2841);
        fjd2.eSR = ldv2;
        fjd2.a(a2);
        return fjd2;
    }

    public void a(a a2) {
        this.iNy = a2.ordinal();
    }

    public a bPU() {
        return a.ListOfValue.get(this.iNy);
    }
}

