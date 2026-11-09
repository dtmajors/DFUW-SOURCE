/*
 * Decompiled with CFR.
 */
import java.util.List;

public class bom
extends bop {
    private List<String> dxR = lcn.emv();

    @Override
    public int asH() {
        return dud.hdO.ordinal();
    }

    public List<String> asI() {
        return this.dxR;
    }

    public int[] asJ() {
        int[] nArray = new int[this.dxR.size()];
        for (int i = 0; i < this.dxR.size(); ++i) {
            int n = lea.enW().getType(this.dxR.get(i));
            if (n == -1) {
                return null;
            }
            nArray[i] = n;
        }
        return nArray;
    }

    public void a(dtz.a[] aArray) {
        for (int i = 0; i < aArray.length; ++i) {
            String string = aArray[i].ResourceName;
            this.dxR.add(string);
        }
    }
}

