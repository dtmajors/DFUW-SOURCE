/*
 * Decompiled with CFR.
 */
public class aiy
extends ait {
    private float bof = 0.0f;

    public aiy() {
        this.bog = ajb.b.boC;
    }

    public float Ck() {
        return this.bof;
    }

    public void aj(float f2) {
        this.bof = f2;
    }

    @Override
    protected float BZ() {
        return this.bof;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        aiy aiy2 = (aiy)aja2;
        aiy2.aj(this.bof);
    }
}

