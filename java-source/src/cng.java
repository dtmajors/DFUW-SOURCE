/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqw
 *  lcr
 */
public class cng
extends cne
implements brc {
    private bqw enh = null;
    private int dj = 0;
    private boolean dxD = false;
    private boolean eNH = false;
    private ldv eNI = null;
    private ldv eNJ = null;

    public cng() {
        super(false);
    }

    @Override
    public final bqv aJC() {
        return this.enh;
    }

    @Override
    public final void b(bqv bqv2) {
        this.enh = (bqw)bqv2;
    }

    public boolean arY() {
        return this.dxD;
    }

    public boolean aUh() {
        return this.eNH;
    }

    public void lf(ldv ldv2) {
        this.eNJ = ldv2;
        assert (this.eNJ != null);
        if (this.enh == null) {
            return;
        }
        this.enh.dV(true);
    }

    public bqa B(ldv ldv2, boolean bl) {
        this.eNJ = ldv2;
        assert (this.eNJ != null);
        ldv ldv3 = this.enh.dV(bl);
        return ((bql)this.enh.asf()).iP(ldv3);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.dxD) {
            return;
        }
        if (this.enh != null && this.enh.asf() != null) {
            this.dxD = true;
            this.enh.asf().dN(true);
        }
    }

    @Override
    public final ldv getServerGUID() {
        return this.eNI;
    }

    public void initialize() {
        assert (this.enh == null);
        super.initialize();
        this.dxD = false;
        if (this.ObjectType == 116) {
            emc emc2 = (emc)this.MessageDelegator.h(13835, this.GUID, this.eNI);
            this.MessageDelegator.F(emc2);
        }
    }

    @Override
    public final void avw() {
        this.asu();
    }

    public void receiveMessage(dxq dxq2) {
        block0 : switch (dxq2.bED()) {
            case 7936: {
                if (this.enh == null) {
                    return;
                }
                this.enh.receiveMessage(dxq2);
                break;
            }
            default: {
                switch (dxq2.bEz()) {
                    case 9986: {
                        this.a((gnv)dxq2);
                        break block0;
                    }
                    case 4878: {
                        this.a((gbb)dxq2);
                        break block0;
                    }
                    case 13836: {
                        this.a((emd)dxq2);
                        break block0;
                    }
                }
                super.receiveMessage(dxq2);
            }
        }
    }

    public void aUi() {
        assert (this.eNH);
        this.dxD = false;
        this.eNH = false;
    }

    protected void a(uk uk2) {
        switch (uk2.Uo) {
            case 3: {
                this.dj = ((uh)uk2).PC;
                this.eNI = lcr.al((ldv)this.GUID, (int)this.dj);
                break;
            }
            default: {
                super.a(uk2);
            }
        }
    }

    private void a(emd emd2) {
        if (this.enh == null) {
            return;
        }
        this.enh.g(emd2.dFx, emd2.dFy);
    }

    private void a(gbb gbb2) {
        if (!gbb2.aO().equals(this.eNJ)) {
            return;
        }
        if (this.enh == null) {
            return;
        }
        if (this.enh != null) {
            this.enh.auz();
        }
        this.eNH = true;
    }

    private void a(gnv gnv2) {
        if (!gnv2.aO().equals(this.eNI)) {
            return;
        }
        if (this.enh != null) {
            this.enh.auz();
        }
        this.eNH = true;
    }

    private void asu() {
        assert (this.enh.asf() != null);
        assert (this.eNJ != null);
        gbc gbc2 = (gbc)this.MessageDelegator.h(4879, this.GUID, this.eNJ);
        this.MessageDelegator.F(gbc2);
    }
}

