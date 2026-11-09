/*
 * Decompiled with CFR.
 */
public class uj
extends uk {
    public lgj aWo = null;

    public uj() {
        super(28);
    }

    public uj(lgj lgj2) {
        super(28);
        this.aWo = lgj2;
    }

    @Override
    public Object vC() {
        return this.aWo;
    }

    @Override
    protected void b(uk uk2) {
        super.b(uk2);
        uj uj2 = (uj)uk2;
        if (this.aWo != null) {
            uj2.aWo = this.aWo;
        }
    }
}

