/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ibp
 */
public class ibm
extends inx
implements jmj {
    private ibp lFi;
    private irz lFj;
    private isb lFk;
    private ibo lFl;
    private int lFm;
    private int lFn;
    private int lFo;
    private ipb lFp;

    public ibm(ibp ibp2, irz irz2, isb isb2, int n, int n2) {
        super("ChatTabDraggableWindow", "ChatWindow.swf");
        this.lFi = ibp2;
        this.lFj = irz2;
        this.lFk = isb2;
        this.lFm = this.lFj.c(this.lFk);
        this.lFl = (ibo)this.lFj.SF(this.lFm);
        this.lFn = n;
        this.lFo = n2;
    }

    @Override
    public void initialize() {
        super.initialize();
        hso.cxK().cxR().a(this);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (hso.cxK() != null && hso.cxK().cxR() != null) {
            hso.cxK().cxR().b(this);
        }
    }

    public ibp cMy() {
        return this.lFi;
    }

    public irz cMz() {
        return this.lFj;
    }

    public isb cMA() {
        return this.lFk;
    }

    public ibo cMB() {
        return this.lFl;
    }

    public int cMC() {
        return this.lFm;
    }

    public int cMD() {
        return this.lFn;
    }

    public int cME() {
        return this.lFo;
    }

    @Override
    public void cMF() {
        this.cMH();
    }

    public boolean cMG() {
        return this.lFp != null && this.lFp.djL();
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.dhJ().a(irl.dnr());
        ipx ipx2 = ipx.h(new ipf[0]);
        this.dhJ().W(ipx2);
        ipx ipx3 = ipx.j(new ipf[0]);
        ipx2.W(ipx3);
        iyi iyi2 = new iyi();
        iyi2.a(iya.rD(this.lFk.dpl()));
        iyi2.a(new iyd(this.lFk.dan().getText()));
        iyi2.setActive(true);
        ipx3.W(iyi2);
        ipx3.W(ipx.a(1, 5, new ipf[0]));
        ipx ipx4 = ipx.j(new ipf[0]);
        ipx2.W(ipx4);
        ipx4.W(ipx.c(new ipf[0]));
        ipx ipx5 = ipx.l(new ipf[0]);
        ipx4.W(ipx5);
        ipx5.W(ipx.c(new ipf[0]));
        this.lFp = new ipb("/dfdata/texture/gui/j2f/chat/tab_drop_clone_01.png");
        this.cMH();
        ipx5.W(ipx.h(ipx.a(11, 11, new ipf[0]), this.lFp));
        ipx5.W(ipx.c(new ipf[0]));
        this.pack();
    }

    private void cMH() {
        if (this.lFp == null) {
            return;
        }
        boolean bl = hso.cxK().cxR().dMl();
        this.lFp.setVisible(bl);
    }
}

