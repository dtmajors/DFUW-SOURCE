/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Set;

public class arf {
    private are bOp;
    private are bOq;
    private a bOr = a.bOx;
    private b bOs = b.bOA;
    Set<String> bOt = lcn.emx();

    public ljq QD() {
        if (this.bOq == null) {
            return null;
        }
        return this.bOq.av();
    }

    public ljq QE() {
        if (this.bOq == null) {
            return null;
        }
        return this.bOq.IY();
    }

    public a QF() {
        return this.bOr;
    }

    public arf(Collection<String> collection, b b2) {
        this.bOt.addAll(collection);
        if (b2 != null) {
            this.bOs = b2;
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        arf arf2 = (arf)object;
        if (this.bOs == null ? arf2.bOs != null : !this.bOs.equals((Object)arf2.bOs)) {
            return false;
        }
        if (this.bOt == null) {
            if (arf2.bOt != null) {
                return false;
            }
        } else {
            if (this.bOt.size() != arf2.bOt.size()) {
                return false;
            }
            for (String string : arf2.bOt) {
                if (this.bOt.contains(string)) continue;
                return false;
            }
        }
        return true;
    }

    public Collection<String> QG() {
        return this.bOt;
    }

    public b QH() {
        return this.bOs;
    }

    public boolean QI() {
        return this.bOp != null && this.bOp.QC();
    }

    public boolean a(are are2) {
        return are2.equals(this.bOq);
    }

    public String QJ() {
        if (this.bOq == null) {
            return null;
        }
        return this.bOq.getName();
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.bOt == null ? 0 : ((Object)this.bOt).hashCode());
        n2 = 31 * n2 + (this.bOs == null ? 0 : this.bOs.hashCode());
        return n2;
    }

    public boolean dL(String string) {
        return this.bOt.contains(string);
    }

    public void b(are are2) {
        assert (are2 != null);
        if (this.QI()) {
            return;
        }
        this.bOp = are2;
        this.bOp.a(this, true);
    }

    public void a(are are2, a a2) {
        assert (are2 != null);
        are2.a(this, false);
        if (are2.equals(this.bOp)) {
            this.bOp = null;
            this.bOq = are2;
            this.bOr = a2;
        }
    }

    public String toString() {
        return lcn.m(this.bOt);
    }
}

