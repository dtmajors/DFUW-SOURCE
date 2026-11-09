/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
public class ceb {
    private static final boolean bC = false;
    private final cev bnF;
    private a eow = a.eoz;
    private csy eox = null;
    private int ent = -1;

    public ceb(cev cev2) {
        assert (cev2 != null);
        this.bnF = cev2;
    }

    public csy aKK() {
        return this.eox;
    }

    public void doTick(ldz ldz2) {
        if (this.eow != a.eoA) {
            return;
        }
        if (this.bnF.aAG() == null) {
            return;
        }
        if (!this.bnF.aAG().isReadyToRun()) {
            return;
        }
        if (this.eox == null) {
            return;
        }
        this.v(this.eox.bbn().feu, this.eox.bbn().fev);
        this.eow = a.eoB;
    }

    public void a(kvm kvm2) {
        cta cta2;
        assert (this.eox != null);
        assert (this.eox.feo >= 0);
        if (!kvm2.qeH) {
            lfn.b(5, "SFCollisionSchemeManager", "handleCollisionSchemeResponse() CollisionScheme could not be swapped.");
            lfn.b(5, "SFCollisionSchemeManager", "handleCollisionSchemeResponse() Swap failed for: " + this.eox.bbn());
            assert (this.eox.fep >= 0);
            switch (this.eow) {
                case eoB: {
                    assert (this.ent < 0);
                    cta cta3 = this.eox.bbn();
                    if (cta3.bpX == 5 && cta3.bpZ == 6 && this.bnF != null && this.bnF.aLU() != null && this.bnF.aLU().aEK() != null && this.bnF.aLU().aEK().aEP() != null && this.bnF.aLU().aEK().aEP().vO() == 3) {
                        this.eow = a.eoA;
                        this.eox.fep = this.eox.feo;
                        this.eox.feo = cta3.bid;
                        return;
                    }
                    this.eow = a.eoz;
                    this.eox.feo = this.eox.fep;
                    this.eox.fep = -1;
                    break;
                }
                case eoC: {
                    assert (this.ent >= 0);
                    if (this.ent == this.eox.fep) {
                        this.eow = a.eoz;
                        this.eox.feo = this.eox.fep;
                    } else {
                        this.eow = a.eoA;
                        this.eox.feo = this.ent;
                    }
                    this.eox.fep = -1;
                    this.ent = -1;
                    break;
                }
                default: {
                    lfn.b(5, "SFCollisionSchemeManager", "handleCollisionSchemeResponse() Invalid swapstate found: '" + this.eow.name() + "'");
                    return;
                }
            }
            return;
        }
        if (!this.bnF.isServerObject() && this.bnF.aJI()) {
            cta2 = this.eox.bbn();
            if (cta2.bpX == 5) {
                switch (cta2.bpZ) {
                    case 3: {
                        this.bnF.aJD().a(byw.c.ect);
                        break;
                    }
                    case 6: {
                        this.bnF.aJD().a(byw.c.ecw);
                    }
                }
            }
        }
        switch (this.eow) {
            case eoB: {
                assert (this.ent < 0);
                this.eow = a.eoz;
                break;
            }
            case eoC: {
                assert (this.ent >= 0);
                this.eow = a.eoA;
                this.eox.feo = this.ent;
                this.ent = -1;
                break;
            }
            default: {
                lfn.b(5, "SFCollisionSchemeManager", "handleCollisionSchemeResponse() Invalid swapstate found: '" + this.eow.name() + "'");
                return;
            }
        }
        if (this.bnF.isServerObject()) {
            cta2 = this.eox.bbn();
            this.pl(cta2.bid);
        }
    }

    public void initialize() {
        assert (this.eox == null);
        this.aKo();
    }

    public void ph(int n) {
        assert (n >= 0);
        assert (this.bnF != null);
        assert (!this.bnF.isServerObject());
        assert (!this.bnF.aJI());
        if (!this.bnF.isInitialized() && this.eox == null) {
            this.aKo();
            if (this.eox == null) {
                lfn.b(5, "SFCollisionSchemeManager", "notifyCollisionSchemeChanged() No collisionschemeinfo found.");
                return;
            }
        }
        assert (this.eox.fep < 0);
        switch (this.eow) {
            case eoz: {
                this.eow = a.eoA;
                this.eox.feo = n;
                break;
            }
            case eoA: {
                this.eox.feo = n;
                break;
            }
            case eoB: {
                if (this.eox.feo == n) break;
                this.eow = a.eoC;
                this.ent = n;
                break;
            }
            case eoC: {
                if (this.eox.feo == n) {
                    this.eow = a.eoB;
                    this.ent = -1;
                    break;
                }
                this.ent = n;
                break;
            }
            default: {
                lfn.b(5, "SFCollisionSchemeManager", "notifyCollisionSchemeChanged() Invalid swapstate provided: " + (Object)((Object)this.eow));
                assert (false);
                return;
            }
        }
    }

    public void oU(int n) {
        if (n <= 0) {
            lfn.b(5, "SFCollisionSchemeManager", "notifyLifeModeChanged() LifeMode is invalid.");
            return;
        }
        if (this.eox == null) {
            lfn.b(5, "SFCollisionSchemeManager", "notifyLifeModeChanged() CollisionSchemeInfo is null.");
            return;
        }
        assert (this.eox.feo >= 0);
        cta cta2 = this.eox.uh(n);
        if (cta2 == null) {
            cta2 = this.eox.feq;
        }
        if (cta2.feu.trim().equals("")) {
            lfn.b(5, "SFCollisionSchemeManager", "notifyLifeModeChanged() StaticCollisionSchemeName is invalid.");
            return;
        }
        if (cta2.fev.trim().equals("")) {
            lfn.b(5, "SFCollisionSchemeManager", "notifyLifeModeChanged() DynamicCollisionSchemeName is invalid.");
            return;
        }
        switch (this.eow) {
            case eoz: {
                this.eow = a.eoA;
                this.eox.fep = this.eox.feo;
                this.eox.feo = cta2.bid;
                break;
            }
            case eoA: {
                this.eox.fep = this.eox.feo;
                this.eox.feo = cta2.bid;
                break;
            }
            case eoB: {
                if (this.eox.feo == cta2.bid) break;
                this.eow = a.eoC;
                this.ent = cta2.bid;
                break;
            }
            case eoC: {
                if (this.eox.feo == cta2.bid) {
                    this.eow = a.eoB;
                    this.ent = -1;
                    break;
                }
                this.ent = cta2.bid;
                break;
            }
            default: {
                lfn.b(5, "SFCollisionSchemeManager", "notifyLifeModeChanged() Invalid swapstate provided: " + (Object)((Object)this.eow));
                assert (false);
                return;
            }
        }
    }

    public void oV(int n) {
        if (n <= 0) {
            lfn.b(5, "SFCollisionSchemeManager", "notifyPostureModeChanged() PostureMode is invalid.");
            return;
        }
        if (this.eox == null) {
            lfn.b(5, "SFCollisionSchemeManager", "notifyPostureModeChanged() CollisionSchemeInfo is null.");
            return;
        }
        assert (this.eox.feo >= 0);
        cta cta2 = this.eox.ui(n);
        if (cta2 == null) {
            if (this.eox.feo == this.eox.feq.bid) {
                return;
            }
            cta2 = this.eox.feq;
        }
        if (cta2.feu.trim().equals("")) {
            lfn.b(5, "SFCollisionSchemeManager", "notifyLifeModeChanged() StaticCollisionSchemeName is invalid.");
            return;
        }
        if (cta2.fev.trim().equals("")) {
            lfn.b(5, "SFCollisionSchemeManager", "notifyPostureModeChanged() DynamicCollisionSchemeName is invalid.");
            return;
        }
        switch (this.eow) {
            case eoz: {
                this.eow = a.eoA;
                this.eox.fep = this.eox.feo;
                this.eox.feo = cta2.bid;
                break;
            }
            case eoA: {
                this.eox.fep = this.eox.feo;
                this.eox.feo = cta2.bid;
                break;
            }
            case eoB: {
                if (this.eox.feo == cta2.bid) break;
                this.eow = a.eoC;
                this.ent = cta2.bid;
                break;
            }
            case eoC: {
                if (this.eox.feo == cta2.bid) {
                    this.eow = a.eoB;
                    this.ent = -1;
                    break;
                }
                this.ent = cta2.bid;
                break;
            }
            default: {
                lfn.b(5, "SFCollisionSchemeManager", "notifyPostureModeChanged() Invalid swapstate provided: " + (Object)((Object)this.eow));
                assert (false);
                return;
            }
        }
    }

    public void aKL() {
        int n = 6;
        this.oV(n);
    }

    private void aKo() {
        int n;
        cta cta2;
        lgw lgw2 = (lgw)lea.enW().acv(this.bnF.az());
        assert (lgw2 != null) : this.bnF.az();
        this.eox = lea.eox().get(lgw2.bBt());
        if (this.eox == null) {
            if (cug.vM((int)this.bnF.az())) {
                lfn.b(5, "SFCollisionSchemeManager", "getCollisionSchemeInfo() No collisionscheminfo found for meshfile '" + lgw2.bBt() + "'");
                return;
            }
            csz csz2 = lea.eoy().get(lgw2.bBt());
            if (csz2 == null) {
                lfn.b(5, "SFCollisionSchemeManager", "getCollisionSchemeInfo() No collisionscheminfomonster found for meshfile '" + lgw2.bBt() + "'");
                return;
            }
            this.eox = csz2.bbo();
        }
        if ((cta2 = this.eox.ui(n = 6)) == null) {
            lfn.b(5, "SFCollisionSchemeManager", "getCollisionSchemeInfo() No collisionschememapping found for posturemode '" + byw.nV(n) + "'");
            assert (false);
            this.eox = null;
            return;
        }
        this.eox = this.eox.bbm();
        this.eox.feo = cta2.bid;
        this.eox.fep = -1;
        this.eow = a.eoA;
        assert (this.eox.feq != null);
    }

    private void v(String string, String string2) {
        assert (string != null);
        assert (string2 != null);
        assert (this.bnF.aAG() != null);
        assert (this.bnF.aAG().axa() != null);
        boolean bl = this.bnF.isServerObject() || this.eox.fep < 0;
        kmq kmq2 = (kmq)this.bnF.getMessageDelegator().h(3353);
        kmq2.ec = this.bnF.aJM().getGUID();
        kmq2.hsP = false;
        kmq2.iBr = false;
        kmq2.Rs = this.bnF.aAG().axa();
        kmq2.pOb = string;
        kmq2.pOc = string2;
        kmq2.pOd = "dummy.sfc";
        kmq2.pOa = bl;
        this.bnF.getMessageDelegator().a(kmq2);
    }

    private void pl(int n) {
        assert (n >= 0);
        gyu gyu2 = (gyu)this.bnF.getMessageDelegator().h(12046, this.bnF.getGUID(), lcr.qAI);
        gyu2.ija = 1;
        gyu2.bid = n;
        this.bnF.getMessageDelegator().F(gyu2);
    }
}

