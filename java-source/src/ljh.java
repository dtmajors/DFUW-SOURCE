/*
 * Decompiled with CFR.
 */
public class ljh<E extends Enum<E>>
extends lip {
    private final E roJ;

    protected ljh() {
        this.roJ = null;
    }

    public ljh(E e2) {
        assert (e2 != null);
        this.roJ = e2;
    }

    @Override
    public String esy() {
        return ((Enum)this.roJ).name();
    }

    public boolean a(ljh<?> ljh2) {
        return ((Enum)this.roJ).equals(ljh2.roJ);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof ljh) {
            return this.a((ljh)object);
        }
        return super.equals(object);
    }

    public final int b(ljh<E> ljh2) {
        return ((Enum)this.roJ).compareTo(ljh2.roJ);
    }

    @Override
    protected int j(lip lip2) {
        if (lip2 instanceof ljh) {
            ljh<E> ljh2 = this.k(lip2);
            if (this.roJ.getClass() == ljh2.roJ.getClass()) {
                return this.b(ljh2);
            }
        }
        return this.esy().compareTo(lip2.esy());
    }

    private ljh<E> k(lip lip2) {
        return (ljh)lip2;
    }
}

