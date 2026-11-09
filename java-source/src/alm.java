/*
 * Decompiled with CFR.
 */
public abstract class alm {
    protected int Type = 0;
    private ldv GUID = null;

    public final int getType() {
        return this.Type;
    }

    public ldv getGUID() {
        return this.GUID;
    }

    public void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public final alm DN() {
        alm alm2;
        block2: {
            alm2 = null;
            try {
                Class<?> clazz = this.getClass();
                alm2 = (alm)clazz.newInstance();
                this.a(alm2);
            }
            catch (Exception exception) {
                lfn.b(5, "SFExtraAbility", "createCopy() Unable to create copy of extraability.");
                lfn.b(5, "SFExtraAbility", "createCopy() Exception: " + exception);
                if ($assertionsDisabled) break block2;
                throw new AssertionError();
            }
        }
        return alm2;
    }

    public final String DO() {
        return aln.fW(this.Type);
    }

    public String toString() {
        return this.DO() + ": GUID=" + this.GUID;
    }

    protected void a(alm alm2) {
        alm2.setGUID(this.GUID);
    }
}

