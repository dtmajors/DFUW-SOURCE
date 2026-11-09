/*
 * Decompiled with CFR.
 */
public class ue
extends uk {
    public float Pz = 0.0f;

    public ue() {
        super(18);
    }

    @Override
    public Object vC() {
        return Float.valueOf(this.Pz);
    }

    @Override
    protected void b(uk uk2) {
        super.b(uk2);
        ue ue2 = (ue)uk2;
        ue2.Pz = this.Pz;
    }
}

