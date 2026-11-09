/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hvy
 */
public class ifj
extends ihs {
    private ipb lLM;
    private ifi lRj;
    private ifi lRk;

    public ifj() {
        super("DyesWindow", "dyes.swf");
        this.OQ(jnz.nGi);
        this.U(275.0f, 200.0f);
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.cXE().a((iqz)null);
        this.lLM = new ipb("Background");
        this.cXE().W(this.lLM);
        this.lLM.ek(12, 0);
        ipk ipk2 = new ipk(0x313131, 1, 97);
        this.cXE().W(ipk2);
        ipk2.ek(147, 5);
        this.cXM().cYx().a(new iqu(18, 1));
        this.lRj = new ifi("Slot1");
        this.lRk = new ifi("Slot2");
        hvy hvy2 = ifj.cxP().cyZ();
        int n = hvy2.cAs();
        cab cab2 = lea.epO().get(n & 0xFFFF);
        cab cab3 = lea.epO().get(n >> 16);
        this.lRj.a(new ifi.a(this, hvy2){
            final /* synthetic */ hvy lPp;
            final /* synthetic */ ifj lRl;
            {
                this.lRl = ifj2;
                this.lPp = hvy2;
            }

            public void QA(int n) {
                this.lPp.cV(0, n);
                if (n != -1) {
                    int n2 = this.lRl.QC(n);
                    ifj.a(this.lRl).do(n2);
                    if (ifj.b(this.lRl).az() == n && n2 < 2) {
                        ifj.b(this.lRl).Qz(-1);
                    }
                }
                ifj.a(this.lRl).cSj();
                ifj.b(this.lRl).cSj();
            }

            public void QB(int n) {
                ifj.b(this.lRl).Qz(n);
            }
        });
        this.lRk.a(new ifi.a(this, hvy2){
            final /* synthetic */ hvy lPp;
            final /* synthetic */ ifj lRl;
            {
                this.lRl = ifj2;
                this.lPp = hvy2;
            }

            public void QA(int n) {
                this.lPp.cV(1, n);
                if (n != -1) {
                    int n2 = this.lRl.QC(n);
                    ifj.b(this.lRl).do(n2);
                    if (ifj.a(this.lRl).az() == n && n2 < 2) {
                        ifj.a(this.lRl).Qz(-1);
                    }
                }
                ifj.a(this.lRl).cSj();
                ifj.b(this.lRl).cSj();
            }

            public void QB(int n) {
                ifj.a(this.lRl).Qz(n);
            }
        });
        if (cab2 != null && this.QC(cab2.az()) > 0) {
            this.lRj.Qz(cab2.az());
        }
        if (cab3 != null && this.QC(cab3.az()) > 0) {
            this.lRk.Qz(cab3.az());
        }
        this.a(new ipb("DyesIcon"), 3, 0, 24, lxf.toW.bD(new Object[0]));
        this.lRj.ek(58, 15);
        this.lRk.ek(172, 15);
        this.cXE().W(this.lRj);
        this.cXE().W(this.lRk);
    }

    @Override
    protected ipq cGj() {
        return null;
    }

    @Override
    protected iox cGl() {
        return null;
    }

    @Override
    protected ios cGs() {
        return null;
    }

    @Override
    protected void cuf() {
        super.cuf();
    }

    protected int QC(int n) {
        bql bql2 = (bql)((Object)this.MessageDelegator.bzx().bzt().d(hso.cxK().bAn().gZb));
        return bql2.aup().mp(n);
    }

    public void cSk() {
        int n = this.QC(this.lRj.az());
        if (n == 0) {
            this.lRj.Qz(-1);
        } else {
            this.lRj.do(n);
        }
        int n2 = this.QC(this.lRk.az());
        if (n2 == 0) {
            this.lRk.Qz(-1);
        } else {
            this.lRk.do(n2);
        }
        if (this.lRj.az() == this.lRk.az() && this.lRj.az() != -1 && n < 2) {
            this.lRk.Qz(-1);
        }
    }

    public ifi cSl() {
        return this.lRj;
    }

    public ifi cSm() {
        return this.lRk;
    }

    static /* synthetic */ ifi a(ifj ifj2) {
        return ifj2.lRj;
    }

    static /* synthetic */ ifi b(ifj ifj2) {
        return ifj2.lRk;
    }
}

