/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
public class ajx
extends aja {
    private float bqb = 0.0f;

    public ajx() {
        this.bog = ajb.b.boX;
    }

    public float getVelocity() {
        return this.bqb;
    }

    public void setVelocity(float f2) {
        this.bqb = f2;
    }

    @Override
    protected boolean BU() {
        assert (this.bqb >= 0.0f);
        if (this.boj.bfF()) {
            return true;
        }
        this.bok = null;
        float f2 = this.boj.aJz().bgQ().aJD().aEg();
        if (f2 > this.bqb) {
            this.bok = mcs.uBa.bD(new Object[0]);
            return false;
        }
        return true;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        ajx ajx2 = (ajx)aja2;
        ajx2.setVelocity(this.bqb);
    }
}

