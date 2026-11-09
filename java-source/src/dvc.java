/*
 * Decompiled with CFR.
 */
public class dvc {
    private ldv GUID = null;

    public ldv getGUID() {
        return this.GUID;
    }

    public void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public final dvc bBw() {
        dvc dvc2;
        block2: {
            dvc2 = null;
            try {
                Class<?> clazz = this.getClass();
                dvc2 = (dvc)clazz.newInstance();
                this.a(dvc2);
            }
            catch (Exception exception) {
                lfn.b(5, "SFSpecialFunction", "createCopy() Unable to create copy of specialfunction.");
                lfn.b(5, "SFSpecialFunction", "createCopy() Exception: " + exception);
                if ($assertionsDisabled) break block2;
                throw new AssertionError();
            }
        }
        return dvc2;
    }

    protected void a(dvc dvc2) {
    }

    public String toString() {
        return " GUID=" + this.GUID;
    }
}

