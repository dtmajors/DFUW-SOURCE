/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class igd
extends igb {
    private int lSl = lea.enW().getType("r_Bank");
    private int lSm = lea.enW().getType("r_Bank Local");
    private int lSn = lea.enW().getType("r_Clan Banks");
    private int lSo = lea.enW().getType("r_Player House Banks");

    @Override
    public float a(ljq ljq2, boolean bl, che che2, ljq ljq3) {
        chx chx2 = (chx)che2;
        les les2 = lea.enW();
        float f = Float.MAX_VALUE;
        boolean bl2 = false;
        if (les2.isDescendant(chx2.eAk, this.lSl) || les2.isDescendant(chx2.eAk, this.lSm) || les2.isDescendant(chx2.eAk, this.lSn) || les2.isDescendant(chx2.eAk, this.lSo)) {
            for (igf igf2 : igj.lSz.values()) {
                float f2;
                if (igf2.cTd() != bl || !((f2 = igf2.cY(ljq2)) < f)) continue;
                f = f2;
                bl2 = true;
                ljq3 = igf2.av();
            }
        } else if (chx2.eAk == cug.fgF) {
            f = super.a(ljq2, bl, che2, ljq3);
            bl2 = f >= 0.0f;
        }
        return bl2 ? f : -1.0f;
    }
}

