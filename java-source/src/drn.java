/*
 * Decompiled with CFR.
 */
public class drn
extends btk {
    public static final int gTU = 1;
    public static final int gTV = 2;
    public static final int gTW = 3;
    private String gTX = "shaderdefault.xml";
    private ljq gTY = new ljq(0.0f, 1500.0f, 0.0f);
    private drq gTZ = null;
    private drq gUa = null;
    private drq gUb = null;
    private boolean gUc = true;
    private ldv gUd = null;
    private int gUe = 1;

    @Override
    public void initialize() {
        if (!this.Initialized && this.MessageDelegator != null) {
            this.bvX();
            this.Initialized = true;
        }
    }

    private boolean bvX() {
        if (mje.DBp) {
            this.gTZ = new dro();
            this.gTZ.setGUID(this.MessageDelegator.bzv());
            this.gTZ.iX(this.gTX);
            this.gTZ.setObjectDescriptionFilename("gizmos\\gizmo_arrows01.xml");
            this.gTZ.c(this.gTY);
            this.gTZ.d(new ljq());
            this.gTZ.setVisible(false);
            this.MessageDelegator.a((amf)((Object)this.gTZ));
            this.gUa = new drp();
            this.gUa.setGUID(this.MessageDelegator.bzv());
            this.gUa.iX(this.gTX);
            this.gUa.setObjectDescriptionFilename("gizmos\\gizmo_rotate01.xml");
            this.gUa.c(this.gTY);
            this.gUa.d(new ljq());
            this.gUa.setVisible(false);
            this.MessageDelegator.a((amf)((Object)this.gUa));
        }
        return true;
    }

    public void nG(ldv ldv2) {
        if (this.gUd == null) {
            if (ldv2 != null) {
                this.jT(ldv2);
            }
        } else if (ldv2 == null) {
            this.nH(this.gUd);
            this.jf(false);
        } else if (!this.gUd.equals(ldv2)) {
            this.nH(this.gUd);
            this.jT(ldv2);
        }
        this.gUd = ldv2;
    }

    public void BE(int n) {
        int n2 = 0;
        switch (n) {
            case 1: {
                n2 = n;
                break;
            }
            case 2: {
                n2 = n;
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        if (n2 != 0 && mje.gUd != null) {
            this.nH(mje.gUd);
            this.gUe = n2;
            this.jT(mje.gUd);
        }
    }

    private void jT(ldv ldv2) {
        drq drq2 = this.bwb();
        if (drq2 != null) {
            drq2.nI(ldv2);
            drq2.setVisible(true);
            kkz kkz2 = (kkz)this.MessageDelegator.h(1027);
            kkz2.pHM = 3;
            kkz2.hC(ldv2);
            kkz2.ts(drq2.getGUID());
            kkz2.wD(true);
            this.MessageDelegator.a(kkz2);
        }
    }

    private void nH(ldv ldv2) {
        drq drq2 = this.bwb();
        if (drq2 != null) {
            drq2.nH(ldv2);
            drq2.setVisible(false);
        }
    }

    public boolean bvY() {
        return this.gUc;
    }

    public void jf(boolean bl) {
        this.gUc = bl;
    }

    public ldv bvZ() {
        drq drq2 = this.bwb();
        if (drq2 != null) {
            return drq2.getGUID();
        }
        return null;
    }

    public int bwa() {
        return this.gUe;
    }

    private drq bwb() {
        switch (this.gUe) {
            case 1: {
                return this.gTZ;
            }
            case 2: {
                return this.gUa;
            }
            case 3: {
                return this.gUb;
            }
        }
        assert (false) : "Active Gizmo type [" + this.gUe + "] not found!";
        return null;
    }
}

