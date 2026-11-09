/*
 * Decompiled with CFR.
 */
import java.util.List;

public class agf {
    private final ahu.a bhK;
    private int bhL = 0;
    private ldv GUID = null;
    private List<ahw> bhM = lcn.abH(2);
    private List<aih> bhN = lcn.abH(2);
    private boolean bhO = false;
    private boolean bhP = false;

    public agf(ahu.a a2) {
        assert (a2 != null);
        this.bhK = a2;
    }

    public final ahu.a AD() {
        return this.bhK;
    }

    public final int AE() {
        return this.bhL;
    }

    public final void eO(int n) {
        assert (n > 0);
        this.bhL = n;
    }

    public final ldv getGUID() {
        return this.GUID;
    }

    public final void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public final List<aih> AF() {
        return this.bhN;
    }

    public final boolean AG() {
        return this.bhO;
    }

    public final void aJ(boolean bl) {
        this.bhO = bl;
    }

    public final boolean AH() {
        return this.bhP;
    }

    public final void aK(boolean bl) {
        this.bhP = bl;
    }

    public final void cC(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        aih aih2 = this.cE(ldv2);
        if (aih2 != null) {
            return;
        }
        aih2 = new aih(ldv2);
        aih2.bnl = false;
        this.bhN.add(aih2);
        this.bhO = true;
    }

    public final void a(aia aia2, int n) {
        assert (aia2 != null);
        assert (n > 160);
        assert (aia2.fv(n));
        ahx ahx2 = new ahx(aia2, n);
        if (this.bhM.contains(ahx2)) {
            return;
        }
        this.bhM.add(ahx2);
    }

    public final void c(aht aht2, int n) {
        assert (aht2 != null);
        assert (n < 159);
        assert (n > 0);
        assert (aht2.fo(n));
        ahy ahy2 = new ahy(aht2, n);
        if (this.bhM.contains(ahy2)) {
            return;
        }
        this.bhM.add(ahy2);
    }

    public final void K(List<uk> list) {
        assert (!this.bhM.isEmpty());
        int n = this.bhM.size();
        for (int i = 0; i < n; ++i) {
            ahw ahw2 = this.bhM.get(i);
            ahw2.L(list);
        }
    }

    public final void b(int n, List<uk> list) {
        assert (!this.bhM.isEmpty());
        int n2 = this.bhM.size();
        for (int i = 0; i < n2; ++i) {
            ahw ahw2 = this.bhM.get(i);
            ahw2.d(n, list);
        }
    }

    public final void cD(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        aih aih2 = this.cE(ldv2);
        if (aih2 == null) {
            return;
        }
        this.bhN.remove(aih2);
    }

    public final void k(aht aht2) {
        assert (aht2 != null);
        int n = this.bhM.size();
        for (int i = 0; i < n; ++i) {
            ahw ahw2 = this.bhM.get(i);
            if (!(ahw2 instanceof ahy)) continue;
            ahy ahy2 = (ahy)ahw2;
            if (ahy2.Uo != 5 || !ahw2.BH().getGUID().tV(aht2.getGUID())) continue;
            assert (ahw2.BH().Bx() == aht2.Bx());
            ahw2.l(aht2);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFCompositeStateObject: GUID=");
        stringBuilder.append(this.GUID);
        stringBuilder.append(" NumberOfLinks=");
        stringBuilder.append(this.bhM.size());
        stringBuilder.append(" UpdateReceiverCount=");
        stringBuilder.append(this.bhN.size());
        return stringBuilder.toString();
    }

    private aih cE(ldv ldv2) {
        assert (ldv2 != null);
        int n = this.bhN.size();
        for (int i = 0; i < n; ++i) {
            aih aih2 = this.bhN.get(i);
            if (!aih2.Rs.equals(ldv2)) continue;
            return aih2;
        }
        return null;
    }
}

