/*
 * Decompiled with CFR.
 */
public class ug
extends uk {
    public ldv PB = null;

    public ug() {
        super(21);
    }

    @Override
    public Object vC() {
        if (this.PB != null) {
            return new ldv(this.PB.eny());
        }
        return null;
    }

    @Override
    protected void b(uk uk2) {
        super.b(uk2);
        ug ug2 = (ug)uk2;
        if (this.PB != null) {
            ug2.PB = new ldv(this.PB.eny());
        }
    }
}

