/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Map;

public class ktw {
    private Map qbO = lcn.emw();
    private int qbP = 50;

    public ktv aaJ(int n) {
        ArrayList arrayList;
        kto kto2 = null;
        Integer n2 = new Integer(n);
        if (this.qbO.containsKey(n2) && !(arrayList = (ArrayList)this.qbO.get(n2)).isEmpty()) {
            System.out.println("Using reclaimed RESPONSE!!!");
            return (ktv)arrayList.remove(0);
        }
        switch (n) {
            case 2306: {
                kto2 = new kto();
                break;
            }
            case 1026: {
                break;
            }
            case 514: {
                break;
            }
        }
        return kto2;
    }

    public void f(ktv ktv2) {
        Integer n = new Integer(ktv2.egT());
        if (this.qbO.containsKey(n)) {
            ArrayList arrayList = (ArrayList)this.qbO.get(n);
            ktv2.reset();
            arrayList.add(ktv2);
        } else {
            ArrayList<ktv> arrayList = new ArrayList<ktv>(this.qbP);
            arrayList.add(ktv2);
            this.qbO.put(new Integer(ktv2.egT()), arrayList);
        }
    }
}

