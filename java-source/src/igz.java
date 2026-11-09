/*
 * Decompiled with CFR.
 */
public class igz
extends ihm {
    private ign liv;

    public igz(ioa ioa2, joa joa2, ign ign2) {
        super("FeatWindowMaterialsTooltip", "FeatWindowNew.swf", ioa2, joa2, 2, 3);
        this.a(hya.lmt, false);
        this.liv = ign2;
    }

    @Override
    public void cCu() {
        super.cCu();
        this.p(40, 0, 40, 30);
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(new jaa(lww.tiX));
        this.cXE().W(ipx.a(1, 2, new ipf[0]));
        for (cgw cgw2 : this.liv.cTq().eyK.aCN) {
            if (cgw2.ezk != cgl.eyC) continue;
            this.cXE().W(new igy(cgw2.ezl, cgw2.ezm));
            this.cXE().W(ipx.a(1, 8, new ipf[0]));
        }
        this.cXE().W(ipx.a(1, 70, new ipf[0]));
    }

    @Override
    protected ihn cVF() {
        return null;
    }

    @Override
    protected ipf cMs() {
        iqa iqa2 = new iqa("MaterialsBackgroundBitmap", 40, 1, 263, 85);
        iqa2.a(iqb.mtp);
        return iqa2;
    }
}

