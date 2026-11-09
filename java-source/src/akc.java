/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  mcs
 */
public abstract class akc
extends aja
implements ajc {
    private int ResourceType = 0;
    private bqm.c bqe = null;
    private ajb.c bqf = null;
    private dci bqm = null;
    private int bqh = 0;
    private bsa bqi = null;
    private boolean bqn = false;
    private boolean bqo = false;
    private boolean bqp = true;

    public final int az() {
        return this.ResourceType;
    }

    public final void l(int n) {
        this.ResourceType = n;
    }

    public final bqm.c CY() {
        return this.bqe;
    }

    public final void a(bqm.c c2) {
        this.bqe = c2;
    }

    public final ajb.c CZ() {
        return this.bqf;
    }

    public final void a(ajb.c c2) {
        this.bqf = c2;
    }

    public final dci Df() {
        return this.bqm;
    }

    public final void a(dci dci2) {
        assert (dci2 != null);
        this.bqm = dci2;
        this.bqm.a(this);
    }

    public final int Db() {
        if (this.bqh == 0) {
            assert (this.bqi == null);
            this.bqh = this.Dd();
        }
        return this.bqh;
    }

    public final bsa Dc() {
        if (this.bqi == null) {
            this.bqi = this.De();
            if (this.bqi == null) {
                // empty if block
            }
        }
        return this.bqi;
    }

    public final void Dg() {
        this.bqn = true;
        this.bqo = true;
    }

    public final void Dh() {
        this.bqo = true;
    }

    public final String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    @Override
    public final void reset() {
        super.reset();
        this.bqh = 0;
        if (this.bqi != null && this.bqi.awJ() != null && this.bqp) {
            assert (this.bqi.avX() != null);
            assert (this.bqi.avX().length > 0);
            assert (this.bqi.awJ().length > 0);
            assert (this.bqi.avX().length == this.bqi.awJ().length);
            bqu bqu2 = this.boj.aJz().bgQ().aJC().asf().auo();
            int n = this.bqi.avX().length;
            for (int i = 0; i < n; ++i) {
                ldv ldv2 = this.bqi.avX()[i].GUID;
                lef lef2 = this.bqi.awJ()[i];
                if (bqu2.a(ldv2, lef2)) continue;
                lfn.b(5, "SFResourceConstraint", "reset() Failed to release itemlock " + lef2 + " on item " + ldv2);
            }
        }
        if (this.bqp) {
            this.bqi = null;
        }
    }

    @Override
    protected final boolean BU() {
        if (this.bqn) {
            return true;
        }
        if (this.bqh == 0) {
            this.bqh = this.Dd();
        }
        if (this.bqh == 0 && this.bqe == bqm.c.dEV) {
            return true;
        }
        bsa bsa2 = this.Dc();
        if (bsa2 == null) {
            return false;
        }
        if (this.bqh == 0) {
            return true;
        }
        assert (this.bqh > 0);
        assert (bsa2.vf() >= this.bqh);
        return true;
    }

    @Override
    protected final boolean Cv() {
        if (this.bqn) {
            return true;
        }
        bsa bsa2 = this.Dc();
        if (bsa2 != null) {
            assert (this.bqh > 0);
            assert (bsa2.az() == this.ResourceType);
            assert (bsa2.vf() >= this.bqh);
            return false;
        }
        return true;
    }

    protected abstract int Dd();

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        akc akc2 = (akc)aja2;
        akc2.l(this.ResourceType);
        akc2.a(this.bqe);
        akc2.a(this.bqf);
        if (this.bqm != null) {
            akc2.a((dci)this.bqm.bjr());
        }
    }

    private bsa De() {
        bsa bsa2;
        block32: {
            int n;
            block31: {
                assert (this.bqi == null);
                this.bok = null;
                n = this.Db();
                if (n == 0) {
                    n = 1;
                }
                if (n <= 0) {
                    lfn.b(5, "SFResourceConstraint", "performConstraintQuery() RequiredResourceQuantity is invalid.");
                    return null;
                }
                if (this.boj.aJz() == null || this.boj.aJz().bgQ() == null || this.boj.aJz().bgQ().aJC() == null || this.boj.aJz().bgQ().aJC().asf() == null) {
                    return null;
                }
                brh brh2 = this.boj.aJz().bgQ().aJC().asf().aup();
                if (brh2 == null) {
                    lfn.b(5, "SFResourceConstraint", "performConstraintQuery() QueryManager is null.");
                    return null;
                }
                boolean bl = false;
                if (this.boj.bfF() && this.Cs()) {
                    switch (this.bqf) {
                        case bpu: {
                            bl = false;
                            break;
                        }
                        case bpv: {
                            bl = true;
                            break;
                        }
                        case bpw: {
                            assert (this.bqm != null);
                            bl = true;
                            break;
                        }
                        default: {
                            lfn.b(5, "SFResourceConstraint", "performConstraintQuery() Invalid lockconfigtype provided: " + (Object)((Object)this.bqf));
                            assert (false);
                            return null;
                        }
                    }
                }
                if ((bsa2 = brh2.a(this.ResourceType, n, this.bqe, bl)) == null) {
                    int n2 = cug.wx((int)this.ResourceType);
                    String string = lea.enW().getName(this.ResourceType);
                    if (n2 != -1) {
                        bsa2 = brh2.a(n2, n, this.bqe, bl);
                    }
                }
                if (bsa2 != null) break block31;
                if (this.Cn()) {
                    return bsa2;
                }
                switch (this.bqe) {
                    case dEU: {
                        assert ((float)n == 1.0f);
                        this.bok = mcs.uBe.bD(this.ResourceType);
                        break block32;
                    }
                    case dEV: {
                        this.bok = mcs.uBf.bD(n, this.ResourceType);
                        break block32;
                    }
                    case dEW: {
                        assert ((float)n == 1.0f);
                        this.bok = mcs.uBd.bD(this.ResourceType);
                        break block32;
                    }
                    default: {
                        lfn.b(5, "SFResourceConstraint", "performConstraintQuery() Invalid itemstatetype provided: " + (Object)((Object)this.bqe));
                        return null;
                    }
                }
            }
            if (!this.Cn()) {
                return bsa2;
            }
            switch (this.bqe) {
                case dEU: {
                    assert ((float)n == 1.0f);
                    this.bok = mcs.uBb.bD(this.ResourceType);
                    break;
                }
                case dEV: {
                    this.bok = mcs.uBc.bD(n, this.ResourceType);
                    break;
                }
                case dEW: {
                    assert ((float)n == 1.0f);
                    this.bok = mcs.uBd.bD(this.ResourceType);
                    break;
                }
                default: {
                    lfn.b(5, "SFResourceConstraint", "performConstraintQuery() Invalid itemstatetype provided: " + (Object)((Object)this.bqe));
                    return null;
                }
            }
        }
        return bsa2;
    }

    @Override
    public final void Ca() {
        if (this.bqm == null || this.bqo) {
            return;
        }
        this.bqm.Ca();
    }

    public final void Di() {
        if (this.bqm == null || this.bqo) {
            return;
        }
        this.bqm.Di();
    }

    public boolean Dj() {
        return this.bqp;
    }

    public void bb(boolean bl) {
        this.bqp = bl;
    }
}

