/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
public class ajm
extends aja
implements aki {
    protected int aXP = 0;
    protected boolean bpO = false;

    public ajm() {
        this.bog = ajb.b.boN;
    }

    public final int getEventType() {
        return this.aXP;
    }

    public final void setEventType(int n) {
        this.aXP = n;
    }

    public boolean equals(Object object) {
        assert (this.boj != null);
        if (object instanceof ajm) {
            ajm ajm2 = (ajm)object;
            if (this.boj.zg() == ajm2.Co().zg() && this.aXP == ajm2.getEventType()) {
                return true;
            }
        }
        return false;
    }

    public final String CJ() {
        return bfo.eV(this.aXP);
    }

    public void a(bfn bfn2) {
        this.bok = null;
        if (bfn2 == null) {
            return;
        }
        if (this.aXP != bfn2.Type) {
            return;
        }
        this.bpO = true;
        this.bok = mcs.uAu.bD(this.boj.Bu());
    }

    @Override
    public final void Ch() {
        assert (this.boj.aJz() != null);
        assert (this.boj.aJz().bgQ() != null);
        this.bpO = false;
        this.boj.aJz().bgQ().aJQ().a(this);
    }

    @Override
    public final void Ci() {
        assert (this.boj.aJz() != null);
        assert (this.boj.aJz().bgQ() != null);
        this.boj.aJz().bgQ().aJQ().b(this);
    }

    @Override
    protected final boolean BU() {
        return this.bpO;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        ajm ajm2 = (ajm)aja2;
        ajm2.setEventType(this.aXP);
    }
}

