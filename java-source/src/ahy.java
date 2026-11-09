/*
 * Decompiled with CFR.
 */
import java.util.List;

public class ahy
extends ahw {
    public aht ahf;
    public final int Uo;

    public ahy(aht aht2, int n) {
        assert (aht2 != null);
        assert (n < 159);
        assert (n > 0);
        this.ahf = aht2;
        this.Uo = n;
    }

    @Override
    public final aht BH() {
        return this.ahf;
    }

    @Override
    public final void l(aht aht2) {
        this.ahf = aht2;
    }

    public final boolean equals(Object object) {
        if (object instanceof ahy) {
            ahy ahy2 = (ahy)object;
            if (!this.ahf.getGUID().equals(ahy2.ahf.getGUID())) {
                return false;
            }
            return this.Uo == ahy2.Uo;
        }
        return false;
    }

    public final String getPropertyName() {
        return this.ahf.eB(this.Uo);
    }

    @Override
    public final void L(List<uk> list) {
        uk uk2 = this.ahf.G(this.Uo, -1);
        if (uk2 == null) {
            return;
        }
        list.add(uk2);
    }

    @Override
    public final void d(int n, List<uk> list) {
        int[] nArray = this.ahf.BC();
        if (nArray[this.Uo] > this.bmS) {
            uk uk2 = this.ahf.G(this.Uo, this.bmS);
            if (uk2 == null) {
                return;
            }
            list.add(uk2);
            this.bmS = n;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFStateObjectLinkToFixedProperty: SO=");
        stringBuilder.append(this.ahf.getGUID());
        stringBuilder.append(" Property='");
        stringBuilder.append(this.getPropertyName());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

