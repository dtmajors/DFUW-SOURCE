/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.TreeMap;

public abstract class kei<E>
extends kee {
    protected static final boolean pjL = true;
    protected loi eF = loi.exd();
    protected static final int pjM = 5000;
    private int pjN = 0;
    protected E[] pjO;

    public void p(E e) {
        if (!this.bdP) {
            this.pjO[this.pjN++] = e;
            if (this.pjN == 5000) {
                lfn.b(4, this.getClass().getSimpleName(), "addObject() : Flushing now, list full");
                TreeMap<Object, Integer> treeMap = lcn.emG();
                int n = Math.min(5000, 500);
                for (int i = 0; i < n; ++i) {
                    Map.Entry entry = this.pjO[i].getClass().getSimpleName();
                    Integer n2 = (Integer)treeMap.remove(entry);
                    n2 = n2 == null ? Integer.valueOf(1) : Integer.valueOf(n2 + 1);
                    treeMap.put(entry, n2);
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    if ((Integer)entry.getValue() < 2) continue;
                    lfn.b(4, "SFJavaToNativeFixedSizePipe", "addObject: " + entry.getValue() + " * " + (String)entry.getKey());
                }
                this.dVL();
            }
        }
    }

    public boolean dVL() {
        if (this.pjN > 0) {
            this.eF.e(this.pjO, this.pjN);
        }
        for (int i = 0; i < this.pjN; ++i) {
            this.pjO[i] = null;
        }
        this.pjN = 0;
        return true;
    }

    @Override
    public int dVG() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return this.pjN == 0;
    }

    public int dVM() {
        return this.pjN;
    }
}

