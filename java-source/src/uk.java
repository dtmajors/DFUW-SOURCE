/*
 * Decompiled with CFR.
 */
public abstract class uk
implements Comparable {
    public final int aWp;
    public int Uo = -1;

    public uk(int n) {
        this.aWp = n;
    }

    protected uk() {
        this.aWp = -1;
    }

    public int compareTo(Object object) {
        if (object instanceof uk) {
            uk uk2 = (uk)object;
            if (this.aWp < uk2.aWp) {
                return -1;
            }
            if (this.aWp > uk2.aWp) {
                return 1;
            }
            if (this.Uo > uk2.Uo) {
                return 1;
            }
            if (this.Uo < uk2.Uo) {
                return -1;
            }
            return 0;
        }
        lfn.b(5, "SFPropertyUpdate", "compareTo() Object not a propertyupdate: " + object.getClass().getName());
        assert (false);
        return 1;
    }

    public final uk vE() {
        uk uk2;
        block2: {
            uk2 = null;
            try {
                Class<?> clazz = this.getClass();
                uk2 = (uk)clazz.newInstance();
                this.b(uk2);
            }
            catch (Exception exception) {
                lfn.log("SFPropertyUpdate", exception);
                if ($assertionsDisabled) break block2;
                throw new AssertionError();
            }
        }
        return uk2;
    }

    public final String vF() {
        return Integer.toString(this.aWp);
    }

    public abstract Object vC();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": ");
        stringBuilder.append("PropertyUpdateType=" + this.aWp);
        return stringBuilder.toString();
    }

    protected void b(uk uk2) {
        uk2.Uo = this.Uo;
    }
}

