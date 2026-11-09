/*
 * Decompiled with CFR.
 */
public class hju
implements alz {
    private final ama knm;
    private final ldv bWM;
    private final ldv hC;
    private int crZ;
    private hic kAV;
    private final hec kAW;

    public hju(hec hec2, ldv ldv2) {
        this.hC = ldv2;
        this.kAW = hec2;
        this.knm = new ama(this);
        this.knm.Eu();
        this.bWM = this.knm.getMessageDelegator().bzv();
        dqi dqi2 = new dqi();
        dqi2.M(new int[]{10400});
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
            this.iq(((ew)gzp2.bhp).fQ());
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
        if (gzq2.DR[0].getType() != 10400) {
            return;
        }
        this.iq(((ew)gzq2.DR[0]).fQ());
    }

    private void iq(int n) {
        if (n == this.crZ) {
            return;
        }
        this.crZ = n;
        if (this.crZ == 0) {
            if (this.kAV != null) {
                this.kAV.remove();
                this.kAV = null;
            }
        } else {
            if (this.kAV == null) {
                this.kAV = new hic((hnc)this.kAW.cbO(), "Power Bar", lgg.rlI, lhf.rnv);
                this.kAW.cbO().kND.j(this.kAV);
            }
            this.kAV.setLevel(this.crZ);
        }
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

