/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cxd
 */
public class byr
extends byq {
    private static final boolean dtQ = false;
    private bzc dYn = null;
    private bzc dYo = null;
    private float dZp = 1.0f;
    private float dZq = 1.0f;

    public byr(cpf cpf2) {
        super(cpf2);
        this.ecW = new byu(this);
    }

    @Override
    public bzc aDe() {
        return this.dYn;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.ecW.aEa()) {
            assert (this.dZn.aAG() != null);
            assert (this.ecW != null);
            this.ecW.aEh();
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dYn = new bzc();
    }

    public void dF(float f2) {
        assert (!this.isServerObject());
        assert (this.ecW != null);
        this.ecW.dF(f2);
    }

    @Override
    public final void b(bzc bzc2) {
        cpf cpf2;
        ldv ldv2;
        assert (bzc2 != null);
        if (this.dYn.equals(bzc2)) {
            return;
        }
        this.dYo = this.dYn;
        this.dYn = bzc2;
        if (this.dYo.edp != this.dYn.edp) {
            switch (this.dYn.edp) {
                case 0: {
                    this.b(byw.c.ecx);
                    break;
                }
                case 1: {
                    this.b(byw.c.ecy);
                    break;
                }
                case 2: {
                    this.b(byw.c.ecz);
                    break;
                }
                case 3: {
                    this.b(byw.c.ecA);
                    break;
                }
            }
        }
        boolean bl = this.dYn.aFc();
        boolean bl2 = this.dYo.aFc();
        if (bl2 != bl && this.aDd() != null && (ldv2 = (cpf2 = (cpf)this.aDd()).aXC()) != null) {
            gab gab2 = (gab)this.MessageDelegator.h(6403, this.GUID, ldv2);
            gab2.edq = this.dYn.edq;
            this.MessageDelegator.F(gab2);
        }
        if (this.dYn.edl != this.dYo.edl) {
            if (this.dYn.edl) {
                this.b(byw.c.ebZ);
            } else {
                this.b(byw.c.eca);
            }
        }
        if (this.dYn.edn != this.dYo.edn && !this.dYo.edn) {
            this.b(byw.c.ebY);
        }
    }

    public final void aDR() {
        this.ecS.aEP().aEH();
        this.dYn = new bzc();
        this.dYo = null;
    }

    @Override
    protected void a(byz byz2) {
        assert (this.ecW != null);
        if (!this.aEP().isAlive()) {
            return;
        }
        this.ecW.ay(byz2.ecZ, byz2.eda);
    }

    @Override
    protected void a(byw.d d2, byz byz2) {
        switch (d2) {
            case ecJ: {
                this.c(byz2);
                break;
            }
            case ecQ: {
                float f2 = this.FZ();
                this.dZn.cL(f2);
                break;
            }
            default: {
                super.a(d2, byz2);
            }
        }
    }

    @Override
    protected void b(int n, String string, String string2) {
    }

    public float FZ() {
        float f2 = 0.0f;
        byv byv2 = this.aEP();
        block0 : switch (byv2.vO()) {
            case 6: {
                switch (byv2.vN()) {
                    case 1: {
                        f2 = cxd.xM((int)(this.dZn != null ? this.dZn.az() : 0));
                        break block0;
                    }
                    case 2: 
                    case 3: {
                        f2 = cxd.xM((int)(this.dZn != null ? this.dZn.az() : 0));
                        break block0;
                    }
                    case 4: {
                        et et2;
                        cdb cdb2;
                        f2 = cxd.xN((int)(this.dZn != null ? this.dZn.az() : 0));
                        if (!(this.dZn instanceof cpf) || (cdb2 = ((cpf)this.dZn).aXa()) == null) break block0;
                        if (this.dZn.fi() != null && (et2 = this.dZn.fi().ah(11056)) != null) {
                            f2 = et2.fN();
                        }
                        f2 = cil.b(cdb2.fi(), f2);
                        f2 = cie.f(cdb2, f2);
                        f2 *= lew.o(1.0f, this.dZp, this.dZq);
                        break block0;
                    }
                    default: {
                        return 0.0f;
                    }
                }
            }
            case 7: {
                cdb cdb3;
                f2 = cxd.xO((int)(this.dZn != null ? this.dZn.az() : 0));
                if (this.dZn instanceof cpf && (cdb3 = ((cpf)this.dZn).aXa()) != null) {
                    f2 = cil.b(cdb3.fi(), f2);
                    f2 = cie.f(cdb3, f2);
                }
                return f2;
            }
            default: {
                return 0.0f;
            }
        }
        return f2;
    }

    private void c(byz byz2) {
        boolean bl = true;
        boolean bl2 = false;
        switch (byz2.eda) {
            case 6: {
                if (byz2.ecZ != 7) break;
                ((cpf)this.dZn).oW(2);
                break;
            }
            case 7: {
                ((cpf)this.dZn).oW(10);
                break;
            }
            default: {
                return;
            }
        }
    }

    public float aEd() {
        return this.dZp;
    }

    public void dG(float f2) {
        this.dZp = f2;
    }

    public float aEe() {
        return this.dZq;
    }

    public void dH(float f2) {
        this.dZq = f2;
    }
}

