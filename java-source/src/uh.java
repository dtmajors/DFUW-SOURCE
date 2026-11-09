/*
 * Decompiled with CFR.
 */
public class uh
extends uk {
    public int PC = 0;

    public uh() {
        super(23);
    }

    @Override
    public Object vC() {
        return this.PC;
    }

    @Override
    protected void b(uk uk2) {
        super.b(uk2);
        uh uh2 = (uh)uk2;
        uh2.PC = this.PC;
    }
}

