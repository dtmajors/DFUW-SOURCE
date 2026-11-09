/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  iet
 */
import java.util.List;

public class ieu
extends ier
implements bto,
hxe {
    protected iet lPt = null;
    protected List<hxd> lPu = lcn.emv();

    public ieu(iet iet2) {
        super("OrganizationBar", "organizationbar.swf");
        this.a(hyb.lmC);
        this.lPt = iet2;
        this.OQ(jnz.nGp | jnz.nGs | jnz.nGi);
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void cBa() {
        super.cBa();
    }

    protected void kq(float f) {
        this.a("setSize", new Object[]{Float.valueOf(f), Float.valueOf(this.getHeight())});
    }

    @Override
    protected boolean a(hzk hzk2, ifg ifg2, String string) {
        if (string == null) {
            return false;
        }
        hwl hwl2 = new hwl(string);
        return hwl2.cck >= -1;
    }

    @Override
    public boolean b(hzk hzk2, ifg ifg2, String string) {
        int n;
        Object object;
        if (!(ifg2 instanceof ifh)) {
            return false;
        }
        hxd hxd2 = null;
        if (hzk2 instanceof iet) {
            object = (iet)hzk2;
            if (object != this.lPt) {
                return false;
            }
            hxd2 = object.cBs();
        } else if (hzk2 != this) {
            return false;
        }
        object = (ifh)ifg2;
        hwm hwm2 = ((ifh)((Object)object)).cQm();
        if (!(hwm2 instanceof hwo)) {
            return false;
        }
        hwo hwo2 = (hwo)hwm2;
        if (hxd2 == null) {
            hxd2 = hwo2.cBs();
        }
        hwl hwl2 = new hwl(string);
        int n2 = this.lOp.size();
        if (hwl2.cck != -1) {
            n = hwl2.cf > -16 && hwl2.cf < 16 ? 1 : 0;
            ieq ieq2 = (ieq)this.lOq.get(hwl2.cck);
            if (ieq2 != null) {
                hwo hwo3 = (hwo)ieq2.cQm();
                int n3 = this.lOp.indexOf(ieq2);
                hxd hxd3 = ieu.cxP().cza().ri(hwo3.cBu().getGUID());
                if (hxd3 != null && n != 0) {
                    hxd2.a(hwo2.cBu().getGUID(), hxd3, false);
                    return true;
                }
                n2 = hwl2.cf < 0 ? n3 : n3 + 1;
            }
        }
        hwo2.a(hxd2);
        if (hzk2 == this && (n = this.c(hwo2)) != -1) {
            this.Qg(n);
        }
        ieq ieq3 = new ieq(this, hwo2);
        this.a(ieq3, n2);
        this.lPt.D(hwo2.cBu());
        hxd2.a(this);
        return true;
    }

    public void f(hwo hwo2) {
        int n = this.c(hwo2);
        if (n != -1) {
            this.Qg(n);
            if (hwo2.cBs() != null) {
                boolean bl = false;
                for (ieq ieq2 : this.lOp) {
                    hwo hwo3 = (hwo)ieq2.cQm();
                    if (hwo3.cBs() != hwo2.cBs()) continue;
                    bl = true;
                    break;
                }
                if (!bl) {
                    this.lPu.add(hwo2.cBs());
                }
            }
        }
    }

    @Override
    public void c(ieq ieq2) {
        hwo hwo2 = (hwo)ieq2.cQm();
        bsh bsh2 = hwo2.cBu();
        hxd hxd2 = ieu.cxP().cza().ri(bsh2.getGUID());
        if (hxd2 == null) {
            hwo2.cBs().rp(bsh2.getGUID());
        } else {
            this.lPt.a(hxd2, hwo2.cBj().text);
        }
    }

    public boolean G(bsh bsh2) {
        for (ieq ieq2 : this.lOp) {
            hwo hwo2 = (hwo)ieq2.cQm();
            if (!hwo2.cBu().getGUID().equals(bsh2.getGUID())) continue;
            return true;
        }
        return false;
    }

    @Override
    public void B(bsh bsh2) {
    }

    @Override
    public void C(bsh bsh2) {
        for (ieq ieq2 : this.lOp) {
            hwo hwo2 = (hwo)ieq2.cQm();
            if (!hwo2.cBu().getGUID().equals(bsh2.getGUID())) continue;
            this.f(hwo2);
            return;
        }
    }

    @Override
    public void D(bsh bsh2) {
        int n = this.E(bsh2);
        if (n != -1) {
            ieq ieq2 = (ieq)this.lOp.get(n);
            hwo hwo2 = (hwo)ieq2.cQm();
            hwo2.y(bsh2);
            super.a(ieq2);
        }
    }

    public void cQB() {
    }

    @Override
    public void cEk() {
        super.cEk();
        this.a("setTitle", new Object[]{lxg.tpx.bD(new Object[0]).exA()});
    }

    protected void g(int n, int n2, String string) {
        if (this.lPt != null) {
            this.lPt.cqF();
        }
    }

    protected void j(int n, int n2, String string) {
        if (string == null) {
            return;
        }
        hwl hwl2 = new hwl(string);
        if (hwl2.cck == -1) {
            return;
        }
        for (int j = 0; j < this.lOp.size(); ++j) {
            ieq ieq2 = (ieq)this.lOp.get(j);
            if (ieq2.getID() != hwl2.cck) continue;
            hwm hwm2 = ((ieq)this.lOp.get(j)).cQm();
            if (!(hwm2 instanceof hwo)) break;
            hwo hwo2 = (hwo)hwm2;
            this.Qg(j);
            this.lPt.D(hwo2.cBu());
            break;
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.lPu.size() > 0) {
            for (hxd hxd2 : this.lPu) {
                hxd2.b(this);
            }
            this.lPu.clear();
        }
    }
}

