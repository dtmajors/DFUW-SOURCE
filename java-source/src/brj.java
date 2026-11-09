/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collections;

public class brj
extends bql {
    public brj() {
        super(0);
    }

    protected final void b(uk[] ukArray) {
        int n;
        assert (ukArray != null);
        ArrayList<vi> arrayList = null;
        int n2 = ukArray.length;
        for (n = 0; n < n2; ++n) {
            if (ukArray[n] == null) continue;
            if (ukArray[n].Uo < 160) {
                super.a(ukArray[n]);
                continue;
            }
            if (ukArray[n] instanceof vi) {
                vi vi2 = (vi)ukArray[n];
                if ((vi2.aXP & 4) > 0) {
                    if (arrayList == null) {
                        arrayList = lcn.abH(5);
                    }
                    arrayList.add(vi2);
                    continue;
                }
                this.a(ukArray[n]);
                continue;
            }
            this.a(ukArray[n]);
        }
        if (arrayList != null) {
            Collections.reverse(arrayList);
            n2 = arrayList.size();
            for (n = 0; n < n2; ++n) {
                this.a((uk)arrayList.get(n));
            }
        }
    }
}

