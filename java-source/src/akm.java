/*
 * Decompiled with CFR.
 */
public class akm
extends akk {
    private float bof = 0.0f;

    public akm() {
        this.bog = ajb.b.bpe;
    }

    public float Ck() {
        return this.bof;
    }

    public void aj(float f2) {
        this.bof = f2;
    }

    @Override
    protected float Dt() {
        return this.bof;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        akm akm2 = (akm)aja2;
        akm2.aj(this.bof);
    }
}

