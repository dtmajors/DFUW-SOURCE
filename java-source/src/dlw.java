/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public class dlw
extends btk
implements bto,
cbq {
    @Override
    public void doTick(ldz ldz2) {
    }

    @Override
    public boolean b(cbx cbx2, et et2) {
        return true;
    }

    @Override
    public void b(cbx cbx2) {
        if (cbx2 instanceof cox) {
            this.a((cox)cbx2);
        } else if (cbx2 instanceof cpa) {
            this.a((cpa)cbx2);
        } else assert (false) : "Unknown PO";
    }

    @Override
    public void a(cbx cbx2, et et2) {
    }

    public void a(cox cox2) {
    }

    public void a(cpa cpa2) {
    }
}

