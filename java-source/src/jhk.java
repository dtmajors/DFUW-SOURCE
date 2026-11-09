/*
 * Decompiled with CFR.
 */
public class jhk
extends izn {
    private static jhr neY;

    @Override
    public void d(iua iua2) {
        super.d(iua2);
        this.djE().pack();
    }

    public void a(jhj jhj2) {
        this.djE().pack();
    }

    @Override
    public boolean c(int n, int n2, hzk hzk2, ifg ifg2) {
        ioa ioa2 = ioa.o(ifg2);
        if (ioa2 instanceof jhq) {
            this.fw(n, n2);
            return true;
        }
        return false;
    }

    @Override
    public boolean a(int n, int n2, hzk hzk2, ifg ifg2) {
        ioa ioa2 = ioa.o(ifg2);
        if (ioa2 instanceof jhq) {
            this.fw(n, n2);
            return true;
        }
        return false;
    }

    @Override
    public boolean d(int n, int n2, hzk hzk2, ifg ifg2) {
        ioa ioa2 = ioa.o(ifg2);
        if (ioa2 instanceof jhq) {
            this.dGh();
            return true;
        }
        return false;
    }

    @Override
    public boolean b(int n, int n2, hzk hzk2, ifg ifg2) {
        ioa ioa2 = ioa.o(ifg2);
        if (ioa2 instanceof jhq) {
            this.dGh();
            this.doK();
            int n3 = this.fx(n, n2);
            jhq jhq2 = (jhq)ioa2;
            jhi jhi2 = jhq2.dGq();
            if (jhi2.dGg() == this) {
                int n4 = jhi2.getIndexInParent();
                if (n4 != n3) {
                    jhi2.RG(n3);
                }
            } else {
                jhi2.djE().pack();
                jhi2.removeFromParent();
                this.djE().pack();
                this.b(jhi2.dFQ(), n3);
            }
            return true;
        }
        return false;
    }

    @Override
    public void d(ifg ifg2) {
        this.doK();
    }

    private void fw(int n, int n2) {
        int n3;
        iph iph2;
        int n4;
        if (neY == null) {
            neY = new jhr();
            neY.setGUID(this.djE().getMessageDelegator().bzv());
            this.djE().getMessageDelegator().a((amf)((Object)neY));
            neY.cqF();
        }
        ipf ipf2 = (n4 = this.fx(n, n2)) < (iph2 = (iph)((Object)this.drN())).bfn() ? iph2.RO(n4) : null;
        int n5 = 0;
        if (ipf2 != null) {
            n3 = ipf2.getY();
        } else {
            ipf2 = iph2.RO(iph2.bfn() - 1);
            n3 = ipf2.getY() + ipf2.getHeight();
        }
        ioc ioc2 = iph2.eo(n5, n3);
        neY.fy(ioc2.cf, ioc2.cg);
        neY.setVisible(true);
    }

    private void dGh() {
        if (neY != null) {
            neY.setVisible(false);
        }
    }

    private void doK() {
        if (neY != null) {
            neY.getMessageDelegator().hd(neY.getGUID());
            neY = null;
        }
    }

    private int fx(int n, int n2) {
        jhh jhh2;
        iph iph2 = (iph)((Object)this.drN());
        ioc ioc2 = this.a(n, n2, (ipf)iph2);
        int n3 = iph2.RQ(ioc2.cg);
        if (n3 == 0 && !(jhh2 = (jhh)iph2.RO(0)).dFR()) {
            n3 = 1;
        }
        return n3;
    }
}

