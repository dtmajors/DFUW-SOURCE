/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class cgn {
    public int adk;
    public int eyG;
    public boolean bdP;
    public Map<Integer, cgo> eyH;

    public cgn(cgu cgu2) {
        this.adk = cgu2.adk;
        this.eyG = cgu2.eyG;
        this.bdP = cgu2.bdP;
        this.eyH = lcn.abI(cgu2.eyH.size());
        Map<Integer, cgr> map = cgu2.eyH;
        for (cgr cgr2 : map.values()) {
            if (cgr2.eyU instanceof chx) {
                chx chx2 = (chx)cgr2.eyU;
                this.eyH.put(cgr2.adk, new cgp(cgr2.adk, cgr2.bdP, 0.0f, cgr2.eyU.aFv, chx2.eyI));
                continue;
            }
            this.eyH.put(cgr2.adk, new cgo(cgr2.adk, cgr2.bdP, 0.0f, cgr2.eyU.aFv));
        }
    }

    public cgo pZ(int n) {
        return this.eyH.get(n);
    }

    public boolean isCompleted() {
        for (cgo cgo2 : this.eyH.values()) {
            if (cgo2.isCompleted()) continue;
            return false;
        }
        return true;
    }

    public final boolean isLocked() {
        return this.bdP;
    }

    public final void aB(boolean bl) {
        this.bdP = bl;
    }
}

