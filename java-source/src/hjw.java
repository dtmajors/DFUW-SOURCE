/*
 * Decompiled with CFR.
 */
public class hjw
implements alz {
    private final ama knm;
    private final ldv bWM;
    private final ldv hC;
    private int kBc;
    private final hec kAW;

    public hjw(hec hec2, ldv ldv2) {
        this.hC = ldv2;
        this.kAW = hec2;
        this.knm = new ama(this);
        this.knm.Eu();
        this.bWM = this.knm.getMessageDelegator().bzv();
        dqi dqi2 = new dqi();
        dqi2.M(new int[]{9872});
        dqi2.setMessageDelegator(this.knm.getMessageDelegator());
        dqi2.nC(this.knm.getGUID());
        dqi2.setGUID(this.bWM);
        gzo gzo2 = (gzo)this.knm.getMessageDelegator().h(8193, this.knm.getGUID(), this.hC);
        gzo2.jvG = dqi2;
        this.knm.getMessageDelegator().F(gzo2);
    }

    public void dispose() {
        gzr gzr2 = (gzr)this.knm.getMessageDelegator().h(8194, this.knm.getGUID(), this.hC);
        gzr2.bWM = this.bWM;
        this.knm.getMessageDelegator().F(gzr2);
        this.knm.Ev();
    }

    private void a(gzp gzp2) {
        if (gzp2.bhp instanceof ew) {
            this.MZ(((ew)gzp2.bhp).fQ());
        }
    }

    private void a(gzq gzq2) {
        if (gzq2.DR == null) {
            return;
        }
        if (gzq2.DR.length < 1) {
            return;
        }
        if (gzq2.DR[0] == null) {
            return;
        }
        if (gzq2.DR[0].getType() != 9872) {
            return;
        }
        this.MZ(((ew)gzq2.DR[0]).fQ());
    }

    private void MZ(int n) {
        this.kBc = n;
    }

    public int cox() {
        return this.kBc;
    }

    @Override
    public boolean a(ba ba2) {
        return false;
    }

    @Override
    public boolean m(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 8195: {
                this.a((gzp)dxq2);
                return true;
            }
            case 8196: {
                this.a((gzq)dxq2);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean a(kcz kcz2) {
        return false;
    }

    @Override
    public boolean a(kgz kgz2) {
        return false;
    }

    @Override
    public boolean a(ktf ktf2) {
        return false;
    }

    @Override
    public boolean b(ktv ktv2) {
        return false;
    }
}

