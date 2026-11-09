/*
 * Decompiled with CFR.
 */
public class ize
extends itn {
    private ipb mcc;
    private ipx myK;
    private ist lUP;

    public ize() {
        this.a(this.dtN());
        this.dmO().W(ipx.d(this.cPn()));
        this.dmO().W(this.cKZ());
    }

    public ipb dss() {
        return this.mcc;
    }

    @Override
    public ist drd() {
        return this.lUP;
    }

    @Override
    public String getText() {
        return this.drd().getText();
    }

    @Override
    public void cND() {
        super.cND();
        this.aTg();
    }

    @Override
    public void cVa() {
        this.aTg();
    }

    @Override
    public void qB(String string) {
    }

    @Override
    public iph drb() {
        return this.myK;
    }

    protected void aTg() {
        if (this.getSelected()) {
            this.lUP.Rk(12357465);
        } else if (this.dkb()) {
            this.lUP.Rk(0xC0C0C0);
        } else {
            this.lUP.Rk(0xABABAB);
        }
    }

    private iox dtN() {
        ivj ivj2 = new ivj(this){
            final /* synthetic */ ize mDa;
            {
                this.mDa = ize2;
            }

            public void pn(boolean bl) {
                this.mDa.setExpanded(bl);
            }
        };
        return ivj2;
    }

    private ipf cPn() {
        this.mcc = new ipb(null, 24, 24);
        return this.mcc;
    }

    private ipf cKZ() {
        this.myK = ipx.h(new ipf[0]);
        this.myK.W(ipx.d(this.cPo()));
        return this.myK;
    }

    private ipf cPo() {
        this.lUP = new ist(isf.mwN, 12, 0xABABAB);
        return this.lUP;
    }
}

