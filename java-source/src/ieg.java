/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.Set;

public class ieg
extends iho {
    private String lNd = "";
    private Set<Integer> lNe = lcn.emx();
    private boolean lBD = false;
    private ist lNf;
    private ixc lNg;
    private hur lNh = new hur(this){
        final /* synthetic */ ieg lNi;
        {
            this.lNi = ieg2;
        }

        public void oi() {
            this.lNi.cGR();
        }

        public void oj() {
            if (ieg.a(this.lNi) != null) {
                ieg.b(this.lNi);
            }
        }

        public void i(long l2) {
            ieg.a(this.lNi, (int)l2);
        }

        public void a(bcx bcx2, bda[] bdaArray, int n) {
            ieg.a(this.lNi, bcx2, bdaArray, n);
        }
    };

    public ieg() {
        super("ClanVaultLogsWindow", "J2FWindow.swf");
        this.OQ(jnz.nGi);
        this.U(740.0f, 200.0f);
        this.T(this.cFy(), this.cFz());
        this.a(ire.mul);
    }

    @Override
    public boolean isOpen() {
        return this.lBD;
    }

    public void setOpen(boolean bl) {
        if (bl == this.lBD) {
            return;
        }
        this.lBD = bl;
        this.setVisible(bl);
        if (bl) {
            this.cqF();
            this.cFc();
        }
        ieg.cyJ().cHx().a(hyy.b.ltB, bl ? 1 : 0);
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.p(24, 0, 24, 24);
        this.f(new ipb("/dfdata/texture/gui/j2f/clan_vault_logs/main_clan_vault_logs.png"));
        this.QW(-5);
        this.cXE().a(irl.dnr());
        this.cXE().W(ipx.a(24, 0, 24, 24, new iqa(this, "/dfdata/texture/gui/j2f/clan_vault_logs/clan_vault_logs_background.png", 24, 0, 24, 24){
            final /* synthetic */ ieg lNi;
            {
                this.lNi = ieg2;
                super(string, n, n2, n3, n4);
            }

            public void kh(float f) {
                this.hz(f);
            }
        }));
        ipx ipx2 = ipx.c(8, 8, 8, 8, new ipf[0]);
        this.cXE().W(ipx2);
        ipx ipx3 = ipx.j(new ipf[0]);
        ipx2.W(ipx3);
        ipx ipx4 = ipx.l(new ipf[0]);
        ipx3.W(ipx4);
        ipx4.W(ipx.d(new ist(isf.mwO, 14, 0xABABAB, lwo.tfB.bD(new Object[0]))));
        ipx4.W(ipx.d(this.cPp()));
        ipx4.W(ipx.c(new ipf[0]));
        ipx4.W(ipx.d(new ipk(0x313131, 1, 18)));
        ipx4.W(ipx.a(4, 1, new ipf[0]));
        ipx4.W(ipx.d(this.cPq()));
        ipx3.W(ipx.a(1, 2, new ipf[0]));
        ipx3.W(ipx.d(new ipk(0x313131, 690, 1)));
        ipx3.W(ipx.a(1, 4, new ipf[0]));
        ipx3.W(ipx.i(this.cPr()));
        ipx3.W(ipx.a(1, 4, new ipf[0]));
        this.cPt();
    }

    @Override
    protected iox cGl() {
        return null;
    }

    @Override
    protected ios cGS() {
        return null;
    }

    @Override
    protected void cGR() {
        ieg.cyJ().pt(false);
    }

    @Override
    protected ipq cGj() {
        return this.cYc();
    }

    private ipf cPp() {
        this.lNf = new ist(isf.mwO, 14, 12357465, "0");
        return this.lNf;
    }

    private ipf cPq() {
        return new iwe(this){
            final /* synthetic */ ieg lNi;
            {
                this.lNi = ieg2;
            }

            public void cLq() {
                ieg.b(this.lNi);
            }
        };
    }

    private ipf cPr() {
        this.lNg = new ixc(this){
            final /* synthetic */ ieg lNi;
            {
                this.lNi = ieg2;
            }

            public ipf Qc(int n) {
                return new ief(n);
            }

            public void a(int n, ipf ipf2) {
                ieg.b(this.lNi, n);
                ipf2.hz(0.25f);
            }

            public void cPu() {
                ieg.c(this.lNi);
            }
        };
        this.lNg.eI(750, 32);
        return this.lNg;
    }

    private void Qa(int n) {
        int n2 = n / bcz.cZc;
        this.lNe.add(n2);
    }

    private void cPs() {
        Set<Integer> set = lcn.emx();
        set.addAll(this.lNe);
        this.lNe.clear();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            hso.cxK().cxP().czb().a(this.lNh, false, n);
        }
    }

    private void cPt() {
        this.lNe.clear();
        this.lNf.setText("0");
        this.lNg.Se(0);
        hso.cxK().cxP().czb().a(this.lNh, true);
    }

    private void Qb(int n) {
        this.lNf.setText("" + n);
        this.lNg.Se(n);
    }

    private void b(bcx bcx2, bda[] bdaArray, int n) {
        if (bcx2.vA()) {
            int n2 = bcz.cZc * n;
            for (int j = 0; j < bdaArray.length; ++j) {
                ief ief2 = (ief)this.lNg.Si(n2 + j);
                if (ief2 == null) continue;
                ief2.hz(1.0f);
                ief2.a(bdaArray[j], n2 + j);
            }
        }
    }

    static /* synthetic */ ixc a(ieg ieg2) {
        return ieg2.lNg;
    }

    static /* synthetic */ void b(ieg ieg2) {
        ieg2.cPt();
    }

    static /* synthetic */ void a(ieg ieg2, int n) {
        ieg2.Qb(n);
    }

    static /* synthetic */ void a(ieg ieg2, bcx bcx2, bda[] bdaArray, int n) {
        ieg2.b(bcx2, bdaArray, n);
    }

    static /* synthetic */ void b(ieg ieg2, int n) {
        ieg2.Qa(n);
    }

    static /* synthetic */ void c(ieg ieg2) {
        ieg2.cPs();
    }
}

