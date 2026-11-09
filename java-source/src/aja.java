/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cwx
 */
public abstract class aja {
    protected ajb.b bog = null;
    private ajb.a boh = null;
    private boolean boi = false;
    protected cwx boj = null;
    protected loz bok = null;

    public final ajb.b Cl() {
        return this.bog;
    }

    public final ajb.a Cm() {
        return this.boh;
    }

    public final void a(ajb.a a2) {
        this.boh = a2;
    }

    public final boolean Cn() {
        return this.boi;
    }

    public final void aY(boolean bl) {
        this.boi = bl;
    }

    public final cwx Co() {
        return this.boj;
    }

    public final void a(cwx cwx2) {
        this.boj = cwx2;
    }

    public final aja Cp() {
        aja aja2;
        block2: {
            aja2 = null;
            try {
                Class<?> clazz = this.getClass();
                aja2 = (aja)clazz.newInstance();
                this.a(aja2);
            }
            catch (Exception exception) {
                lfn.b(5, "SFConstraintBase", "createCopy() Unable to create copy of constraint.");
                lfn.b(5, "SFConstraintBase", "createCopy() Exception: " + exception);
                if ($assertionsDisabled) break block2;
                throw new AssertionError();
            }
        }
        return aja2;
    }

    public final String Cq() {
        return this.boh.name();
    }

    public final boolean Cr() {
        switch (this.boh) {
            case bos: 
            case bot: {
                return true;
            }
            case bou: {
                return false;
            }
        }
        lfn.b(5, "SFConstraintBase", "isCheckInitially() Constraint has invalid checktype: '" + this.Cq() + "'");
        return false;
    }

    public final boolean Cs() {
        switch (this.boh) {
            case bos: {
                return false;
            }
            case bot: 
            case bou: {
                return true;
            }
        }
        lfn.b(5, "SFConstraintBase", "isCheckPerforming() Constraint has invalid checktype: '" + this.Cq() + "'");
        return false;
    }

    public final boolean Ct() {
        if (this.boi) {
            return this.Cv();
        }
        return this.BU();
    }

    public boolean Cu() {
        return ajb.b.isSupportPerformingCheck(this.bog);
    }

    public void reset() {
        this.bok = null;
    }

    public String toString() {
        if (this.boj == null) {
            return this.bog.name();
        }
        if (this.boj.bfF()) {
            return this.bog.name() + " (S) ";
        }
        return this.bog.name() + " (C) ";
    }

    protected abstract boolean BU();

    protected boolean Cv() {
        lfn.b(5, "SFConstraintBase", "checkInvertedConstraint() Constraint '" + this.bog.name() + "' should override this method.");
        return false;
    }

    protected void a(aja aja2) {
        aja2.a(this.boh);
        aja2.aY(this.boi);
    }

    public final loz Cw() {
        return this.bok;
    }
}

