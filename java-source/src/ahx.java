/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import java.util.List;

public class ahx
extends ahw {
    public final aia bmT;
    public final int bmU;
    public final int bmV;

    public ahx(aia aia2, int n) {
        assert (aia2 != null);
        assert (n > 160);
        this.bmT = aia2;
        this.bmU = ep.k((int)n, (int)2);
        this.bmV = n;
    }

    @Override
    public final aht BH() {
        return this.bmT;
    }

    @Override
    public final void l(aht aht2) {
    }

    public final boolean equals(Object object) {
        if (object instanceof ahx) {
            ahx ahx2 = (ahx)object;
            if (!this.bmT.getGUID().equals(ahx2.bmT.getGUID())) {
                return false;
            }
            return this.bmV == ahx2.bmV;
        }
        return false;
    }

    public final String getAttributeName() {
        return ep.aM((int)this.bmV);
    }

    @Override
    public final void L(List<uk> list) {
        afw afw2 = (afw)this.bmT.fw(this.bmU);
        afw afw3 = (afw)this.bmT.fw(this.bmV);
        assert (afw2 != null);
        assert (afw3 != null);
        uz uz2 = new uz();
        uz2.Uo = this.bmV;
        uz2.aXP = 8;
        uz2.aXs = ((et)afw2.An()).fN();
        uz2.Pz = ((et)afw3.An()).fN();
        list.add(uz2);
    }

    @Override
    public final void d(int n, List<uk> list) {
        afw afw2 = (afw)this.bmT.fw(this.bmU);
        afw afw3 = (afw)this.bmT.fw(this.bmV);
        assert (afw2 != null);
        assert (afw3 != null);
        boolean bl = false;
        if (afw2.eT(8) > this.bmS) {
            bl = true;
        } else if (afw3.eT(8) > this.bmS) {
            bl = true;
        }
        if (bl) {
            uz uz2 = new uz();
            uz2.Uo = this.bmV;
            uz2.aXP = 8;
            uz2.aXs = ((et)afw2.An()).fN();
            uz2.Pz = ((et)afw3.An()).fN();
            list.add(uz2);
            this.bmS = n;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFStateObjectLinkToAttribute: SO=");
        stringBuilder.append(this.bmT.getGUID());
        stringBuilder.append(" Attribute='");
        stringBuilder.append(this.getAttributeName());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

