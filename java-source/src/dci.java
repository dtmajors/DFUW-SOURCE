/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 */
public class dci
extends dcl {
    private akc gcR = null;

    public dci() {
        this.gcU = cxd.o.fRZ;
    }

    public void a(akc akc2) {
        this.gcR = akc2;
    }

    @Override
    public void Ca() {
        assert (this.gcR != null);
        if (ctg.ffg) {
            return;
        }
        bri bri2 = (bri)this.gcR.Co().aJz().bgQ().aJC().asf();
        if (bri2 == null) {
            return;
        }
        bsa bsa2 = this.gcR.Dc();
        if (bsa2 == null) {
            return;
        }
        assert ((float)bsa2.vf() > 0.0f);
        assert (bsa2.avX() != null);
        assert (bsa2.awJ() != null);
        assert (bsa2.avX().length == bsa2.awJ().length);
        bri2.a(bsa2, bqy.dHw);
    }

    public void Di() {
        assert (this.gcR != null);
        if (ctg.ffg) {
            return;
        }
        bri bri2 = (bri)this.gcR.Co().aJz().bgQ().aJC().asf();
        if (bri2 == null) {
            return;
        }
        bsa bsa2 = this.gcR.Dc();
        if (bsa2 == null) {
            return;
        }
        assert ((float)bsa2.vf() > 0.0f);
        assert (bsa2.avX() != null);
        assert (bsa2.awJ() != null);
        assert (bsa2.avX().length == bsa2.awJ().length);
        if (bsa2.vf() >= 1 && bsa2.vf() == 1) {
            return;
        }
        int n2 = bsa2.vf() - 1;
        bri2.a(bsa2, n2, bqy.dHw);
    }

    public String pa() {
        return this.gcR.pa();
    }

    @Override
    protected void a(dcl dcl2) {
        super.a(dcl2);
        dci dci2 = (dci)dcl2;
    }
}

