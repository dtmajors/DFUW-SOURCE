/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Iterator;

public class cdi
extends cdg {
    private ccw enk = new ccw(this);
    private final cdl enl = new cdl(this);
    private bqx enm = new bqx();
    private hu enn = null;
    private ldv eno = null;
    private boolean enp = false;
    private boolean enq = false;

    public cdi() {
        super(true);
    }

    public final ccw aJL() {
        return this.enk;
    }

    public final ccx aJM() {
        return this.enl;
    }

    public final bqv aJC() {
        return this.enm;
    }

    public final void b(bqv bqv2) {
        this.enm = (bqx)bqv2;
    }

    public final hu aJP() {
        return this.enn;
    }

    public final void a(hu hu2) {
        this.enn = hu2;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.enk != null) {
            this.enk.doTick(ldz2);
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        assert (this.enm.auk() == null);
        assert (this.enm.asf().auk() == null);
        if (ResourceTree.isDescendant(this.az(), cug.fgE)) {
            this.enk.bl(this.MessageDelegator.arc().rgz);
            this.enk.aC(352, 416);
            if (this.fi().ad(384)) {
                this.enk.aC(384, 448);
            }
            if (this.fi().ad(400)) {
                this.enk.aC(400, 464);
            }
            if (this.fi().ad(1504)) {
                this.enk.aJo();
            }
        }
        this.enm.a((brb)((Object)this));
        this.enm.setObjectType(118);
        this.MessageDelegator.a(this.enm);
        this.g(1032, this.GUID, this.enm.getGUID());
        Iterator iterator = this.emI.jl().values().iterator();
        while (iterator.hasNext()) {
            this.MessageDelegator.a((amf)iterator.next());
        }
        this.enl.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.enl);
    }

    private void a(dyr dyr2) {
        this.oM(dyr2.bbK);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bED()) {
            case 13312: {
                switch (dxq2.bEz()) {
                    case 13334: {
                        this.a((dyr)dxq2);
                        break;
                    }
                    default: {
                        this.b((dyk)dxq2);
                    }
                }
                return;
            }
            case 20480: {
                this.enl.receiveMessage(dxq2);
                return;
            }
        }
        switch (dxq2.bEz()) {
            case 11010: {
                this.a((grl)dxq2);
                break;
            }
            case 4354: {
                this.a((gvn)dxq2);
                break;
            }
            case 4357: {
                this.a((gvt)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public final void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        this.MessageDelegator.hd(this.enl.getGUID());
        if (this.aJC() != null) {
            this.MessageDelegator.hd(this.enm.getGUID());
        }
    }

    private void b(dyk dyk2) {
        dyk2.f(this.GUID);
        dyk2.on(this.jk().bhh());
        this.MessageDelegator.F(dyk2);
    }

    private void a(grl grl2) {
        byv byv2 = grl2.edV;
        if (byv2 == null) {
            return;
        }
        if (grl2.ecU == null) {
            return;
        }
        this.enf.d(grl2.ecU);
        this.enf.aEK().a(byv2, true, false);
    }

    public void f(et et2) {
        if (this.enn == null) {
            return;
        }
        if (et2.getType() == 352) {
            if (!this.aIs()) {
                return;
            }
            this.h(et2);
        } else {
            super.f(et2);
        }
    }

    @Override
    public final void aKl() {
        super.aKl();
        if (this.enf.aDM()) {
            assert (!this.enp);
            this.enp = true;
        } else {
            this.enn.mf();
        }
    }

    @Override
    public final void fH(boolean bl) {
        assert (this.eno == null);
        super.fH(bl);
        float f2 = 4.0f;
        if (f2 == 0.0f) {
            this.enf.a(byw.c.ech);
            return;
        }
        this.dL(f2);
        this.enn.S(bl);
    }

    public void aKm() {
        assert (this.enp);
        this.enn.mf();
        this.enp = false;
        this.enq = false;
    }

    private void h(et et2) {
        assert (et2 != null);
        assert (et2.getType() == 352);
        bfn bfn2 = this.enP.aof();
        if (bfn2 == null) {
            this.enf.a(byw.c.eci);
            return;
        }
        if (bfn2 instanceof bfl) {
            bfl bfl2 = (bfl)bfn2;
            this.enP.a(5, bfl2);
            this.enf.a(byw.c.eci);
        } else {
            this.enP.c(5, bfn2.aYF, bfn2.bsG);
            this.enf.a(byw.c.eci);
        }
    }

    private void a(gvn gvn2) {
        if (gvn2.atv == null) {
            this.enf.a(byw.c.ech);
            this.eno = null;
            return;
        }
        this.eno = gvn2.atv;
    }

    private void a(gvt gvt2) {
        ldv ldv2 = gvt2.atv;
        if (ldv2 == null) {
            return;
        }
        if (!ldv2.equals(this.eno)) {
            return;
        }
        this.eno = null;
        byv byv2 = this.enf.aEP();
        switch (byv2.vM()) {
            case 2: {
                this.enf.a(byw.c.eci);
                break;
            }
            case 3: {
                this.enf.a(byw.c.ech);
                break;
            }
            default: {
                return;
            }
        }
    }
}

