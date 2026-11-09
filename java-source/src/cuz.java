/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class cuz
implements cuu {
    private static final String TC = "SFSpecialEventChestManager";
    private static final double feb = 20.0;
    private final Map<Integer, csw> fej;
    private final csx fyA;
    private final les ResourceTree;
    private Map<ldv, cuy> fyF = lcn.abI(100);
    private Map<ldv, cuy> fyG = lcn.abI(100);
    private final Map<Integer, gfw[]> feh = lcn.emw();
    private final Map<Integer, Double> fei = lcn.emw();
    private int Qs = 1;

    public cuz(csx csx2) {
        assert (aev.isEnabled());
        this.fyA = csx2;
        this.ResourceTree = lea.enW();
        this.fej = lea.eoT();
    }

    private void a(gll gll2) {
        int[] nArray = gll2.jle;
        int[] nArray2 = gll2.jlf;
        float f2 = gll2.Radius;
        ljq ljq2 = gll2.fyE;
        double d2 = gll2.jld;
        assert (nArray.length == nArray2.length);
        assert (f2 > 0.0f);
        assert (d2 > 0.0);
        for (int i = 0; i < nArray.length; ++i) {
            int n = nArray[i];
            int n2 = nArray2[i];
            for (int j = 0; j < n2; ++j) {
                cuy cuy2 = new cuy(this, n, ljq2, f2);
                cuy2.setGUID(this.fyA.getMessageDelegator().bzv());
                this.fyA.getMessageDelegator().a(cuy2);
                this.fyF.put(cuy2.getGUID(), cuy2);
            }
        }
    }

    public boolean lM(ldv ldv2) {
        cuy cuy2 = this.fyG.get(ldv2);
        if (cuy2 == null) {
            return false;
        }
        return cuy2.bcf();
    }

    @Override
    public void a(ldv ldv2, cuv cuv2, ljq ljq2) {
        cuy cuy2 = (cuy)cuv2;
        this.fyG.put(ldv2, cuy2);
    }

    @Override
    public void a(ldv ldv2, cuv cuv2, boolean bl) {
        assert (this.fyG.containsKey(ldv2));
        cuy cuy2 = (cuy)cuv2;
        this.fyG.remove(ldv2);
        this.fyA.getMessageDelegator().hd(cuy2.getGUID());
    }

    public void a(glo glo2) {
        int n = glo2.bEz();
        switch (n) {
            case 35329: {
                this.a((gll)glo2);
            }
        }
    }

    @Override
    public int bbl() {
        return this.fyA.bbl();
    }
}

