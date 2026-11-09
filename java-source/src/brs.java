/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class brs {
    private brs dIX = null;
    private List<brs> bim = null;
    private brm dIY = null;

    public final brs awn() {
        return this.dIX;
    }

    public final void h(brs brs2) {
        this.dIX = brs2;
    }

    public final List<brs> AY() {
        return this.bim;
    }

    public final brm awo() {
        return this.dIY;
    }

    public final void c(brm brm2) {
        this.dIY = brm2;
    }

    public final boolean i(brs brs2) {
        if (brs2 == null) {
            lfn.b(5, "SFItemNode", "addChildNode() ChildNode is null.");
            return false;
        }
        if (this.k(brs2)) {
            lfn.b(5, "SFItemNode", "addChildNode() ChildNode has already been added: " + brs2);
            return false;
        }
        if (brs2.equals(this)) {
            lfn.b(5, "SFItemNode", "addChildNode(): ChildNode == this: " + brs2);
            assert (false);
            return false;
        }
        if (this.j(brs2)) {
            lfn.b(5, "SFItemNode", "addChildNode(): ChildNode is in parent chain: " + brs2);
            assert (false);
            return false;
        }
        if (this.bim == null) {
            this.bim = lcn.abH(5);
        }
        assert (brs2.awn() == null);
        assert (brs2.awo() != null);
        brs2.h(this);
        this.bim.add(brs2);
        return true;
    }

    public final boolean jq(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFItemNode", "containsChildNode() ItemGUID is null.");
            return false;
        }
        if (this.bim != null) {
            int n = this.bim.size();
            for (int i = 0; i < n; ++i) {
                brs brs2 = this.bim.get(i);
                if (!brs2.awo().getGUID().equals(ldv2)) continue;
                return true;
            }
        }
        return false;
    }

    public final boolean j(brs brs2) {
        if (brs2 == null) {
            return false;
        }
        brs brs3 = this.awn();
        while (brs3 != null) {
            if (brs2.equals(brs3)) {
                return true;
            }
            brs3 = brs3.dIX;
        }
        return false;
    }

    public final boolean k(brs brs2) {
        if (brs2 == null) {
            lfn.b(5, "SFItemNode", "containsChildNode() ItemNode is null.");
            return false;
        }
        if (this.bim == null) {
            return false;
        }
        return this.bim.contains(brs2);
    }

    public final boolean Ba() {
        return this.bim != null && !this.bim.isEmpty();
    }

    public final List<brs> awp() {
        if (this.bim == null) {
            return null;
        }
        ArrayList<brs> arrayList = lcn.abH(this.bim.size());
        int n = this.bim.size();
        for (int i = 0; i < n; ++i) {
            arrayList.add(this.bim.get(i));
        }
        return arrayList;
    }

    public final brs awq() {
        assert (this.dIY != null);
        brs brs2 = new brs();
        brs2.c(this.dIY.aue());
        brs2.awo().c(brs2);
        return brs2;
    }

    public final bsd awr() {
        return new bsd(this);
    }

    public final boolean equals(Object object) {
        assert (this.dIY != null);
        if (object instanceof brs) {
            brs brs2 = (brs)object;
            assert (brs2.awo() != null);
            if (!(brs2.awo() instanceof bpy) && !(brs2.awo() instanceof bqb)) {
                assert (this.dIY.getGUID() != null);
                assert (brs2.awo().getGUID() != null);
            }
            return this.dIY.equals(brs2.awo());
        }
        return false;
    }

    public final brs jr(ldv ldv2) {
        assert (ldv2 != null);
        if (this.bim != null) {
            int n = this.bim.size();
            for (int i = 0; i < n; ++i) {
                brs brs2 = this.bim.get(i);
                if (!brs2.awo().getGUID().equals(ldv2)) continue;
                return brs2;
            }
        }
        lfn.b(5, "SFItemNode", "getChildNode() Could not find childnode " + ldv2 + " in node " + this.dIY.getGUID());
        return null;
    }

    public final int getDepth() {
        bsd bsd2 = this.awr();
        return bsd2.awN().size();
    }

    public final int aws() {
        if (this.bim == null) {
            return 1;
        }
        int n = 0;
        int n2 = this.bim.size();
        for (int i = 0; i < n2; ++i) {
            brs brs2 = this.bim.get(i);
            int n3 = brs2.aws();
            if (n >= n3) continue;
            n = n3;
        }
        return n + 1;
    }

    public final int awt() {
        if (this.bim == null) {
            return 1;
        }
        int n = 0;
        int n2 = this.bim.size();
        for (int i = 0; i < n2; ++i) {
            brs brs2 = this.bim.get(i);
            n += brs2.awt();
        }
        return n + 1;
    }

    public final boolean awu() {
        for (brs brs2 = this.dIX; brs2 != null; brs2 = brs2.awn()) {
            if (!(brs2.awo() instanceof bqd)) continue;
            return true;
        }
        return false;
    }

    public final boolean l(brs brs2) {
        if (brs2 == null) {
            lfn.b(5, "SFItemNode", "removeChildNode() ChildNode is null.");
            return false;
        }
        if (!this.k(brs2)) {
            lfn.b(5, "SFItemNode", "removeChildNode() ChildNode was not found: " + brs2);
            return false;
        }
        assert (this.bim != null);
        assert (brs2.awn() != null);
        assert (brs2.awo() != null);
        brs2.h(null);
        this.bim.remove(brs2);
        if (this.bim.isEmpty()) {
            this.bim = null;
        }
        return true;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFItemNode: ");
        if (this.dIY != null) {
            stringBuilder.append(this.dIY);
        } else {
            stringBuilder.append("ItemBase=null");
        }
        return stringBuilder.toString();
    }
}

