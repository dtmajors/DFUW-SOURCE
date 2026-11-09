/*
 * Decompiled with CFR.
 */
public abstract class lip
implements Comparable<lip> {
    protected lip() {
    }

    public final int h(lip lip2) {
        return this.j(lip2);
    }

    public abstract String esy();

    public final String toString() {
        return super.toString() + ": '" + this.esy() + "'";
    }

    public boolean i(lip lip2) {
        return this.esy().equals(lip2.esy());
    }

    public boolean equals(Object object) {
        if (object instanceof lip) {
            return this.i((lip)object);
        }
        assert (false);
        return super.equals(object);
    }

    protected int j(lip lip2) {
        return this.esy().compareTo(lip2.esy());
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.h((lip)object);
    }
}

