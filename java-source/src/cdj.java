/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class cdj {
    private static final boolean bC = false;
    private final cdt dZk;
    private a enr = a.env;
    private csz ens = null;
    private int ent = -1;

    public cdj(cdt cdt2) {
        assert (cdt2 != null);
        this.dZk = cdt2;
    }

    public csz aKn() {
        return this.ens;
    }

    public void hk(int n) {
        if (n <= 0) {
            lfn.b(5, "SFCollisionSchemeManagerMonster", "changeCollisionScheme() CollisionSchemeID is invalid.");
            return;
        }
        if (this.ens == null) {
            lfn.b(5, "SFCollisionSchemeManagerMonster", "changeCollisionScheme() CollisionSchemeInfo is null.");
            return;
        }
        assert (this.ens.feo >= 0);
        ctb ctb2 = this.ens.uj(n);
        if (ctb2 == null) {
            ctb2 = this.ens.fes;
        }
        if (ctb2.feu.trim().equals("")) {
            lfn.b(5, "SFCollisionSchemeManagerMonster", "changeCollisionScheme() StaticCollisionSchemeName is invalid.");
            return;
        }
        if (ctb2.fev.trim().equals("")) {
            lfn.b(5, "SFCollisionSchemeManagerMonster", "changeCollisionScheme() DynamicCollisionSchemeName is invalid.");
            return;
        }
        switch (this.enr) {
            case env: {
                this.enr = a.enw;
                this.ens.fep = this.ens.feo;
                this.ens.feo = ctb2.bid;
                break;
            }
            case enw: {
                this.ens.fep = this.ens.feo;
                this.ens.feo = ctb2.bid;
                break;
            }
            case enx: {
                if (this.ens.feo == ctb2.bid) break;
                this.enr = a.eny;
                this.ent = ctb2.bid;
                break;
            }
            case eny: {
                if (this.ens.feo == ctb2.bid) {
                    this.enr = a.enx;
                    this.ent = -1;
                    break;
                }
                this.ent = ctb2.bid;
                break;
            }
            default: {
                lfn.b(5, "SFCollisionSchemeManagerMonster", "changeCollisionScheme() Invalid swapstate provided: " + (Object)((Object)this.enr));
                assert (false);
                return;
            }
        }
    }

    public void doTick(ldz ldz2) {
        if (this.enr != a.enw) {
            return;
        }
        if (this.dZk.aAG() == null) {
            return;
        }
        if (!this.dZk.aAG().isReadyToRun()) {
            return;
        }
        if (this.ens == null) {
            return;
        }
        this.v(this.ens.bbq().feu, this.ens.bbq().fev);
        this.enr = a.enx;
    }

    public void a(kvm kvm2) {
        assert (this.ens != null);
        assert (this.ens.feo > 0);
        if (!kvm2.qeH) {
            lfn.b(5, "SFCollisionSchemeManagerMonster", "handleCollisionSchemeResponse() CollisionScheme could not be swapped.");
            lfn.b(5, "SFCollisionSchemeManagerMonster", "handleCollisionSchemeResponse() Swap failed for: " + this.ens.bbq());
            assert (this.ens.fep >= 0);
            switch (this.enr) {
                case enx: {
                    assert (this.ent < 0);
                    this.enr = a.env;
                    this.ens.feo = this.ens.fep;
                    this.ens.fep = -1;
                    break;
                }
                case eny: {
                    assert (this.ent >= 0);
                    if (this.ent == this.ens.fep) {
                        this.enr = a.env;
                        this.ens.feo = this.ens.fep;
                    } else {
                        this.enr = a.enw;
                        this.ens.feo = this.ent;
                    }
                    this.ens.fep = -1;
                    this.ent = -1;
                    break;
                }
                default: {
                    lfn.b(5, "SFCollisionSchemeManagerMonster", "handleCollisionSchemeResponse() Invalid swapstate found: '" + this.enr.name() + "'");
                    return;
                }
            }
            return;
        }
        switch (this.enr) {
            case enx: {
                assert (this.ent < 0);
                this.enr = a.env;
                break;
            }
            case eny: {
                assert (this.ent >= 0);
                this.enr = a.enw;
                this.ens.feo = this.ent;
                this.ent = -1;
                break;
            }
            default: {
                lfn.b(5, "SFCollisionSchemeManagerMonster", "handleCollisionSchemeResponse() Invalid swapstate found: '" + this.enr.name() + "'");
                return;
            }
        }
        ctb ctb2 = this.ens.bbq();
        if (this.dZk.isServerObject()) {
            this.pj(ctb2.bid);
        } else {
            this.pi(ctb2.bid);
        }
    }

    public void initialize() {
        assert (this.ens == null);
        this.aKo();
    }

    public void ph(int n) {
        assert (n >= 0);
        assert (this.dZk != null);
        assert (!this.dZk.isServerObject());
        assert (!this.dZk.aJI());
        if (!this.dZk.isInitialized() && this.ens == null) {
            this.aKo();
        }
        assert (this.ens.fep < 0);
        switch (this.enr) {
            case env: {
                this.enr = a.enw;
                this.ens.feo = n;
                break;
            }
            case enw: {
                this.ens.feo = n;
                break;
            }
            case enx: {
                if (this.ens.feo == n) break;
                this.enr = a.eny;
                this.ent = n;
                break;
            }
            case eny: {
                if (this.ens.feo == n) {
                    this.enr = a.enx;
                    this.ent = -1;
                    break;
                }
                this.ent = n;
                break;
            }
            default: {
                lfn.b(5, "SFCollisionSchemeManagerMonster", "notifyCollisionSchemeChanged() Invalid swapstate provided: " + (Object)((Object)this.enr));
                assert (false);
                return;
            }
        }
    }

    private void aKo() {
        lgw lgw2 = (lgw)lea.enW().acv(this.dZk.az());
        assert (lgw2 != null) : this.dZk.az();
        this.ens = lea.eoy().get(lgw2.bBt());
        if (this.ens == null) {
            return;
        }
        ctb ctb2 = this.ens.bbr();
        if (ctb2 == null) {
            lfn.b(5, "SFCollisionSchemeManagerMonster", "getCollisionSchemeInfo() No default collisionschememapping found.");
            assert (false);
            this.ens = null;
            return;
        }
        this.ens = this.ens.bbp();
        this.ens.feo = ctb2.bid;
        this.ens.fep = -1;
        this.enr = a.enw;
        assert (this.ens.fes != null);
    }

    private void v(String string, String string2) {
        assert (string != null);
        assert (string2 != null);
        assert (this.dZk.aAG() != null);
        assert (this.dZk.aAG().axa() != null);
        boolean bl = true;
        if (this.dZk.aJI()) {
            // empty if block
        }
        kmq kmq2 = (kmq)this.dZk.getMessageDelegator().h(3353);
        kmq2.ec = this.dZk.aJM().getGUID();
        kmq2.hsP = false;
        kmq2.iBr = false;
        kmq2.Rs = this.dZk.aAG().axa();
        kmq2.pOb = string;
        kmq2.pOc = string2;
        kmq2.pOd = "dummy.sfc";
        kmq2.pOa = bl;
        this.dZk.getMessageDelegator().a(kmq2);
    }

    private void pi(int n) {
        assert (n > 0);
        ewz ewz2 = (ewz)this.dZk.getMessageDelegator().h(5123, this.dZk.getGUID(), this.dZk.getServerGUID());
        ewz2.bid = n;
        this.dZk.getMessageDelegator().F(ewz2);
    }

    private void pj(int n) {
        assert (n > 0);
        gyh gyh2 = (gyh)this.dZk.getMessageDelegator().h(12058, this.dZk.getGUID(), lcr.qAI);
        gyh2.ija = 1;
        gyh2.bid = n;
        this.dZk.getMessageDelegator().F(gyh2);
    }
}

