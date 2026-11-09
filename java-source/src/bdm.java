/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class bdm
extends amf
implements ami {
    private Map daM = lcn.emw();
    protected ljq Position = null;
    protected lgl Rotation = null;
    protected float daN = 1.0f;
    protected int daO = 0;
    protected lek daP = null;
    protected float daQ = 0.0f;
    protected boolean daR = false;

    @Override
    public ljq av() {
        return this.Position;
    }

    @Override
    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    @Override
    public ljq FX() {
        if (this.Rotation == null) {
            return null;
        }
        return this.Rotation.eqT();
    }

    @Override
    public void d(ljq ljq2) {
        if (this.Rotation == null) {
            this.Rotation = new lgl(ljq2);
        } else {
            this.Rotation.ep(ljq2);
        }
    }

    @Override
    public lgl aw() {
        return this.Rotation;
    }

    @Override
    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public float getScale() {
        return this.daN;
    }

    public void setScale(float f) {
        this.daN = f;
    }

    public void p(Object object) {
        if (object != null) {
            if (object instanceof btk) {
                btk btk2 = (btk)object;
                this.daM.put(btk2.getGUID(), object);
            } else if (object instanceof dul) {
                dul dul2 = (dul)object;
                this.daM.put(dul2.getGUID(), object);
            }
        } else {
            return;
        }
    }

    public Map amn() {
        return this.daM;
    }

    public int amo() {
        return this.daO;
    }

    public void kn(int n) {
        this.daO = n;
    }

    public lek amp() {
        return this.daP;
    }

    public void c(lek lek2) {
        this.daP = lek2;
    }

    public boolean amq() {
        return this.daR;
    }

    public void setShowGrid(boolean bl) {
        this.daR = bl;
    }

    public float amr() {
        return this.daQ;
    }

    public void cs(float f) {
        this.daQ = f;
    }
}

