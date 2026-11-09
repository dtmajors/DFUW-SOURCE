/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public class gsl
extends grb {
    public static final int jqO = 1;
    public static final int jqP = 2;
    public static final int jqQ = 4;
    public int aXP = 0;
    public int ObjectType = 0;
    public int blu = 0;
    public ldv Rs = null;
    public uk[] joY = null;

    gsl() {
        super(11033);
    }

    @Override
    public dxq bEE() {
        int n;
        gsm gsm2 = new gsm();
        super.Y(gsm2);
        gsm2.aXP = this.aXP;
        gsm2.ObjectType = this.ObjectType;
        gsm2.blu = this.blu;
        gsm2.Rs = this.Rs;
        gsm2.joY = null;
        gsm2.jqR = null;
        gsm2.jqS = null;
        if (this.joY == null || this.joY.length == 0) {
            return this;
        }
        ArrayList<uk> arrayList = new ArrayList<uk>();
        ArrayList<wr> arrayList2 = new ArrayList<wr>();
        ArrayList<Boolean> arrayList3 = new ArrayList<Boolean>();
        for (n = 0; n < this.joY.length; ++n) {
            uk uk2 = this.joY[n];
            wr wr2 = wr.f(uk2);
            if (wr2 != null) {
                arrayList2.add(wr2);
                arrayList3.add(new Boolean(true));
                continue;
            }
            arrayList.add(uk2);
            arrayList3.add(new Boolean(false));
        }
        if (arrayList2.size() == 0) {
            return this;
        }
        if (arrayList.size() > 0) {
            gsm2.joY = new uk[arrayList.size()];
            for (n = 0; n < arrayList.size(); ++n) {
                gsm2.joY[n] = (uk)arrayList.get(n);
            }
        }
        if (arrayList2.size() > 0) {
            gsm2.jqR = new wr[arrayList2.size()];
            for (n = 0; n < arrayList2.size(); ++n) {
                gsm2.jqR[n] = (wr)arrayList2.get(n);
            }
            n = arrayList3.size() / 8;
            if (arrayList3.size() % 8 != 0) {
                ++n;
            }
            gsm2.jqS = new byte[n];
            int n2 = 0;
            for (int i = 0; i < n; ++i) {
                byte by = 0;
                for (int j = 0; j < 8 && n2 < arrayList3.size(); ++j) {
                    by = (byte)(by << 1);
                    boolean bl = (Boolean)arrayList3.get(n2);
                    ++n2;
                    if (!bl) continue;
                    by = (byte)(by | 1);
                }
                gsm2.jqS[i] = by;
            }
        }
        return gsm2;
    }
}

