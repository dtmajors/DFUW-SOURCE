/*
 * Decompiled with CFR.
 */
public class iyo
extends iyc {
    private lie mBO;
    private hvr lgb;

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.dbr();
    }

    public irz cMz() {
        for (iph iph2 = this.djJ(); iph2 != null; iph2 = iph2.djJ()) {
            if (!(iph2 instanceof irz)) continue;
            return (irz)iph2;
        }
        return null;
    }

    public final void dpo() {
        if (this.lgb != null) {
            return;
        }
        this.lgb = new a(this);
        iyo.czy().a(this.lgb);
    }

    public final void dbr() {
        if (this.lgb == null) {
            return;
        }
        if (iyo.czy() != null) {
            iyo.czy().b(this.lgb);
        }
        this.lgb = null;
    }

    @Override
    public boolean c(int n, int n2, hzk hzk2, ifg ifg2) {
        irz irz2 = this.cMz();
        if (!irz2.m(ifg2)) {
            return false;
        }
        this.dsT();
        return true;
    }

    @Override
    public boolean d(int n, int n2, hzk hzk2, ifg ifg2) {
        if (this.mBO == null) {
            return false;
        }
        this.dsU();
        return true;
    }

    private void dsT() {
        this.mBO = new lie(this, 0.25, true){
            final /* synthetic */ iyo mBP;
            {
                this.mBP = iyo2;
                super(d2, bl);
            }

            public void dh(double d2) {
                this.mBP.cLq();
            }
        };
        this.mBO.e(this.djE().getMessageDelegator());
    }

    private void dsU() {
        this.mBO.stop();
        this.mBO = null;
    }
}

