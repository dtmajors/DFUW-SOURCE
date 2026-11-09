/*
 * Decompiled with CFR.
 */
public abstract class bvc
extends bvd {
    protected boolean dQm = false;
    protected String bhl = null;

    public bvc(bve.a a2) {
        super(a2);
        this.ObjectType = 13;
    }

    public final String ayY() {
        return this.bhl;
    }

    public final void cx(String string) {
        this.bhl = string;
    }

    @Override
    public final boolean ayZ() {
        return this.dQm;
    }

    @Override
    protected void c(bvd bvd2) {
        super.c(bvd2);
        bvc bvc2 = (bvc)bvd2;
        bvc2.cx(this.bhl);
    }
}

