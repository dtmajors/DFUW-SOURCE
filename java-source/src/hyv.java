/*
 * Decompiled with CFR.
 */
public class hyv
extends ihs
implements bto {
    public static final int lqb = 1;
    public static final int lqc = 2;
    private static final int lqd = 30;
    private final cfz lqe;
    private double oV = 0.0;
    private int lqf = -1;
    private boolean lqg = false;
    private ips lqh;
    private ips lqi;
    private ips lqj;
    private ist lqk;
    private ist lql;
    private ist lqm;
    private ist lqn;
    private ips lqo;
    private ist lqp;
    private ist lqq;
    private isy lqr;
    private ist lqs;
    private ips lqt;
    private ips lqu;
    private ist lqv;
    private boolean lpP = false;

    public hyv(cfz cfz2) {
        super("DuelWindow", "duelwindow.swf");
        this.lqe = cfz2;
        this.OQ(-1);
        this.U(408.0f, 295.0f);
        this.ql(true);
    }

    @Override
    public void cGo() {
        float f = hso.cxK().cxY().dOj();
        float f2 = hso.cxK().cxY().TG();
        float f3 = this.getWidth();
        float f4 = this.getHeight();
        this.R(f / 2.0f - f3 / 2.0f, f2 / 2.0f - f4 / 2.0f);
    }

    public void cEk() {
        super.cEk();
        this.cGp();
    }

    protected void cGp() {
        if (this.lqk == null) {
            return;
        }
        switch (this.lqe.aNP()) {
            case ewl: {
                this.lqk.setText(lwu.tid.bD(new Object[0]).exA());
                break;
            }
            case ewm: {
                this.lqk.setText(lwu.tic.bD(new Object[0]).exA());
            }
        }
        this.lql.setText(lwu.tie.bD(new Object[0]).exA());
        this.lqm.setText(lwu.tif.bD(new Object[0]).exA());
        this.lqn.setText(lwu.tig.bD(new Object[0]).exA());
        this.lqp.setText(this.lqe.aNN());
        this.lqq.setText(String.valueOf(this.lqe.aNO()));
        this.lqr.setText(String.valueOf(this.lqe.aNM()));
        this.lqs.setText(String.valueOf(this.lqe.aNL()));
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.lqh = new ips();
        this.lqh.qQ("lineTwoButtons");
        this.dhJ().W(this.lqh);
        this.lqi = new ips();
        this.lqi.qQ("lineThreeButtons");
        this.dhJ().W(this.lqi);
        this.lqj = new ips();
        this.lqj.qQ("topLine");
        this.dhJ().W(this.lqj);
        this.lqk = new ist();
        this.lqk.a(isu.mxO);
        this.lqk.qQ("challengerLabel");
        this.dhJ().W(this.lqk);
        this.lql = new ist();
        this.lql.a(isu.mxO);
        this.lql.qQ("prowessLabel");
        this.dhJ().W(this.lql);
        this.lqm = new ist();
        this.lqm.a(isu.mxO);
        this.lqm.qQ("wagerLabel");
        this.dhJ().W(this.lqm);
        this.lqn = new ist();
        this.lqn.a(isu.mxO);
        this.lqn.qQ("bankGoldLabel");
        this.dhJ().W(this.lqn);
        this.lqo = new ips();
        this.lqo.qQ("wagerBackground");
        this.dhJ().W(this.lqo);
        this.lqp = new ist();
        this.lqp.qQ("nameTextField");
        this.dhJ().W(this.lqp);
        this.lqq = new ist();
        this.lqq.qQ("prowessTextField");
        this.dhJ().W(this.lqq);
        this.lqs = new ist();
        this.lqs.qQ("bankGoldTextField");
        this.dhJ().W(this.lqs);
        this.lqr = new isy(this){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ hyv lqw;
            {
                this.lqw = hyv2;
            }

            public void od(String string) {
                if (hyv.a(this.lqw).aNP() != cfz.a.ewl) {
                    hyv.b(this.lqw).setText(String.valueOf(hyv.a(this.lqw).aNM()));
                    if (!$assertionsDisabled) {
                        throw new AssertionError();
                    }
                    return;
                }
                int n = 0;
                try {
                    n = Integer.parseInt(string);
                    if (n > hyv.a(this.lqw).aNL()) {
                        n = 0;
                        hyv.b(this.lqw).setText(String.valueOf(n));
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    n = hyv.a(this.lqw).aNM();
                    hyv.b(this.lqw).setText(String.valueOf(n));
                }
                hyv.a(this.lqw).pQ(n);
            }

            static {
                $assertionsDisabled = !hyv.class.desiredAssertionStatus();
            }
        };
        this.lqr.a(isu.mxO);
        this.lqr.qQ("wagerTextField");
        this.dhJ().W(this.lqr);
        this.lqt = new ips();
        this.lqt.qQ("timerBackground");
        this.dhJ().W(this.lqt);
        this.lqu = new ips();
        this.lqu.qQ("timerIcon");
        this.dhJ().W(this.lqu);
        this.lqv = new ist();
        this.lqv.qQ("timerTextField");
        this.dhJ().W(this.lqv);
        this.lqv.a(isu.mxO);
        this.Rz(50);
        this.cXE().a((iqz)null);
        this.a(new ipb("/dfdata/texture/gui/j2f/duels/title_icon_duels.png"), 10, 0, 24, lwu.tia.bD(new Object[0]));
        this.cGr();
    }

    @Override
    public void cGq() {
        super.cGq();
        this.cGr();
    }

    private void cGr() {
        this.cGp();
        if (this.lqe.aNP() == cfz.a.ewl) {
            this.lqt.hz(0.0f);
            this.lqu.hz(0.0f);
            this.lqv.hz(0.0f);
            this.lqi.hz(0.0f);
            this.lqr.Rk(0);
            this.a("moveButtons", new Object[]{16});
        } else if (this.lqe.aNP() == cfz.a.ewm) {
            this.lqh.hz(0.0f);
            this.lqo.hz(0.0f);
            this.lqr.Rk(0xABABAB);
        }
    }

    @llk
    protected void onAcceptButtonClicked() {
        int n = this.lqe.aNM();
        if (n > this.lqe.aNL() || n < 0) {
            n = 0;
            this.lqe.pQ(0);
            this.lqr.setText(String.valueOf(0));
        }
        this.lqe.a(cfx.evy);
    }

    @llk
    protected void onCancelButtonClicked() {
        this.lqe.a(cfx.evz);
    }

    @llk
    protected void onBlockButtonClicked() {
        this.lqe.a(cfx.evA);
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (!this.lpP) {
            return;
        }
        if (this.lqe.aNP() == cfz.a.ewl && !this.lqg) {
            this.lqg = true;
        }
        if (this.lqv != null && this.lqe.aNP() == cfz.a.ewm) {
            int n;
            if (this.oV == 0.0) {
                this.oV = ldz2.rgz;
            }
            if ((n = 30 - (int)(ldz2.rgz - this.oV)) != this.lqf) {
                this.lqv.setText("" + n);
            }
            this.lqf = n;
            if (n == 0) {
                this.lqe.a(cfx.evz);
            }
        }
    }

    @Override
    public void cds() {
        super.cds();
        this.QT(0);
        this.Rz(48);
        this.RA(20);
        if (this.lqj != null) {
            this.lqj.hz(this.cXM().djL() ? 0.0f : 1.0f);
        }
    }

    @Override
    protected void cuf() {
        super.cuf();
        if (this.lpP) {
            return;
        }
        this.lpP = true;
        if (this.lqe.aNP() == cfz.a.ewl) {
            hso.cxK().a(jnz.nFI);
            this.cFc();
            this.lqp.setText(this.lqe.aNN());
            this.lqq.setText(String.valueOf(this.lqe.aNO()));
            this.lqr.b("^[0-9]{0,5}$", 0, false);
            this.lqr.setText(String.valueOf("0"));
            this.lqr.L();
        } else {
            this.lqp.setText(this.lqe.aNN());
            this.lqq.setText(String.valueOf(this.lqe.aNO()));
            this.lqr.setText(String.valueOf(this.lqe.aNM()));
            this.lqr.rF(false);
            this.lqr.SQ(0);
        }
    }

    @Override
    protected iox cGl() {
        return null;
    }

    @Override
    protected ipq cGj() {
        return null;
    }

    @Override
    protected ios cGk() {
        return null;
    }

    @Override
    protected ios cGs() {
        return null;
    }

    static /* synthetic */ cfz a(hyv hyv2) {
        return hyv2.lqe;
    }

    static /* synthetic */ isy b(hyv hyv2) {
        return hyv2.lqr;
    }
}

