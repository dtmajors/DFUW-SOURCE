/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 */
public class dch
extends dcl {
    private aka gcQ = null;

    public dch() {
        this.gcU = cxd.o.fRZ;
    }

    public void a(aka aka2) {
        this.gcQ = aka2;
    }

    @Override
    public void Ca() {
        assert (this.gcQ != null);
        if (ctg.ffg) {
            return;
        }
        bri bri2 = (bri)this.gcQ.Co().aJz().bgQ().aJC().asf();
        if (bri2 == null) {
            return;
        }
        bsa bsa2 = this.gcQ.Dc();
        if (bsa2 == null) {
            return;
        }
        assert ((float)bsa2.vf() > 0.0f);
        assert (bsa2.avX() != null);
        assert (bsa2.awJ() != null);
        assert (bsa2.avX().length == bsa2.awJ().length);
        bri2.a(bsa2, bqy.dHw);
    }

    public String pa() {
        return this.gcQ.pa();
    }

    @Override
    protected void a(dcl dcl2) {
        super.a(dcl2);
        dch dch2 = (dch)dcl2;
    }
}

