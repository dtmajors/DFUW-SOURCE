/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
public class akv
extends akt {
    private float bpE = 0.0f;
    private bvd bqP = null;

    public akv() {
        this.bog = ajb.b.bpj;
    }

    public float getMaxDistance() {
        return this.bpE;
    }

    public void setMaxDistance(float f2) {
        this.bpE = f2;
    }

    @Override
    public void reset() {
        super.reset();
        this.bqP = null;
    }

    @Override
    protected boolean BU() {
        Object object;
        assert (this.boj.aJz().bgQ().aAG() != null);
        if (this.boj.bfF()) {
            return true;
        }
        boolean bl = super.BU();
        if (!bl) {
            return false;
        }
        if (this.bqP == null) {
            object = this.CN().KY();
            this.bqP = (bvd)this.boj.getMessageDelegator().bzx().bzt().d((ldv)object);
            if (this.bqP == null) {
                return false;
            }
        }
        object = this.bqP.av();
        ljq ljq2 = this.boj.aJz().bgQ().aAG().av();
        float f2 = Math.abs(ljq2.ez((ljq)object));
        if (f2 > this.bpE) {
            this.bok = mcs.uAy.bD(new Object[0]);
            return false;
        }
        return true;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        akv akv2 = (akv)aja2;
        akv2.setMaxDistance(this.bpE);
    }
}

