/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public abstract class bng
extends btk
implements bto,
cbq {
    @Override
    public void doTick(ldz ldz2) {
    }

    @Override
    public void b(cbx cbx2) {
        if (cbx2 instanceof cox) {
            this.a((cox)cbx2);
        } else assert (false) : "Unknown PO";
    }

    @Override
    public boolean b(cbx cbx2, et et2) {
        return true;
    }

    @Override
    public void a(cbx cbx2, et et2) {
    }

    public void a(cox cox2) {
        lfn.b(5, "SFGunManager", "handleDeadGun() THIS SHOULD NEVER BE CALLED. ");
    }
}

