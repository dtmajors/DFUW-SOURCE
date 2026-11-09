/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class cgm {
    private int adk;
    private boolean bdP;
    private Map<Integer, cgn> eyF;

    public cgm(cgq cgq2) {
        this.adk = cgq2.adk;
        this.bdP = cgq2.bdP;
        this.eyF = lcn.abI(cgq2.eyF.size());
        Map<Integer, cgu> map = cgq2.eyF;
        for (cgu cgu2 : map.values()) {
            cgn cgn2 = new cgn(cgu2);
            this.eyF.put(cgn2.adk, cgn2);
        }
    }

    public cgo pY(int n) {
        for (cgn cgn2 : this.eyF.values()) {
            cgo cgo2 = cgn2.pZ(n);
            if (cgo2 == null) continue;
            return cgo2;
        }
        return null;
    }

    public float aOt() {
        float f2 = 0.0f;
        for (cgn cgn2 : this.eyF.values()) {
            for (cgo cgo2 : cgn2.eyH.values()) {
                if (!cgo2.isCompleted()) continue;
                f2 += lea.eps().du(cgo2.getIndex());
            }
        }
        return f2;
    }

    public cgt v(float f2, float f3) {
        return lea.eps().b(this.adk, f2, f3);
    }

    public boolean isLocked() {
        return this.bdP;
    }

    public boolean isCompleted() {
        for (cgn cgn2 : this.eyF.values()) {
            if (cgn2.isCompleted()) continue;
            return false;
        }
        return true;
    }

    public final int getIndex() {
        return this.adk;
    }

    public final Map<Integer, cgn> aOu() {
        return this.eyF;
    }

    public final List<cgo> aOv() {
        ArrayList<cgo> arrayList = lcn.emv();
        for (cgn cgn2 : this.eyF.values()) {
            arrayList.addAll(cgn2.eyH.values());
        }
        return arrayList;
    }

    public final void aB(boolean bl) {
        this.bdP = bl;
    }
}

