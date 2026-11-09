/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public class gsm
extends grb {
    public int aXP = 0;
    public int ObjectType = 0;
    public int blu = 0;
    public ldv Rs = null;
    public uk[] joY = null;
    public wr[] jqR = null;
    public byte[] jqS = null;

    gsm() {
        super(11121);
    }

    @Override
    public dxq bEF() {
        int n;
        int n2;
        gsl gsl2 = new gsl();
        super.Y(gsl2);
        gsl2.aXP = this.aXP;
        gsl2.ObjectType = this.ObjectType;
        gsl2.blu = this.blu;
        gsl2.Rs = this.Rs;
        int n3 = 0;
        if (this.joY != null) {
            n3 += this.joY.length;
        }
        if (this.jqR != null) {
            n3 += this.jqR.length;
        }
        ArrayList<Integer> arrayList = null;
        if (this.jqS != null && this.joY != null) {
            arrayList = new ArrayList<Integer>();
            int n4 = 0;
            block0: for (n2 = 0; n2 < this.jqS.length; ++n2) {
                n = this.jqS[n2];
                for (int i = 0; i < 8; ++i) {
                    if ((n & 1) == 0) {
                        arrayList.add(new Integer(n4));
                        if (arrayList.size() >= this.joY.length) continue block0;
                    }
                    n = (byte)(n >> 1);
                    ++n4;
                }
            }
        }
        uk[] ukArray = null;
        if (n3 > 0) {
            ukArray = new uk[n3];
            if (this.joY != null) {
                if (arrayList != null) {
                    for (n2 = 0; n2 < this.joY.length; ++n2) {
                        n = (Integer)arrayList.get(n2);
                        assert (n >= 0 && n < ukArray.length);
                        ukArray[n] = this.joY[n2];
                    }
                } else {
                    assert (this.jqR == null);
                    for (n2 = 0; n2 < this.joY.length; ++n2) {
                        ukArray[n2] = this.joY[n2];
                    }
                }
            }
            if (this.jqR != null) {
                n2 = 0;
                for (n = 0; n < this.jqR.length; ++n) {
                    while (ukArray[n2] != null) {
                        ++n2;
                    }
                    assert (n2 < ukArray.length);
                    ukArray[n2] = wr.a(this.jqR[n]);
                }
            }
        }
        gsl2.joY = ukArray;
        return gsl2;
    }
}

