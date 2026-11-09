/*
 * Decompiled with CFR.
 */
import java.util.List;

public class igc
extends igb {
    @Override
    public float a(ljq ljq2, boolean bl, che che2, ljq ljq3) {
        chu chu2 = (chu)che2;
        float f = Float.MAX_VALUE;
        boolean bl2 = false;
        for (igh igh2 : igj.lSv) {
            float f2;
            if (igh2.cTd() != bl || !this.a(chu2.ResourceType, igh2) || !((f2 = igh2.cY(ljq2)) < f)) continue;
            f = f2;
            bl2 = true;
            ljq3.ex(igh2.av());
        }
        if (!bl2) {
            return -1.0f;
        }
        return f;
    }

    private boolean a(int n, igh igh2) {
        for (Integer n2 : igh2.cTf()) {
            ctq ctq2 = lea.eoJ().get(n2);
            if (ctq2 == null || ctq2.fgg == null || !this.i(n, ctq2.fgg)) continue;
            return true;
        }
        return false;
    }

    private boolean i(int n, List<cto> list) {
        for (cto cto2 : list) {
            if (cto2 instanceof cto) {
                cto cto3 = cto2;
                if (cto3.ResourceType != n) continue;
                return true;
            }
            if (!(cto2 instanceof List) || !this.i(n, (List)((Object)cto2))) continue;
            return true;
        }
        return false;
    }
}

