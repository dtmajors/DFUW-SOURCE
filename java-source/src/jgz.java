/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class jgz
extends iho {
    private static final String nbP = "Open";
    private static List<dxq> ahc = lcn.emv();
    private static Map<String, jgw> nbQ = lcn.emw();
    private ipc mXs;
    private ipc mXt;
    private iug myS;
    private boolean nbR = false;

    public jgz() {
        super("SpecialEventsWindow", "J2FWindow.swf");
        this.OQ(jnz.nGe | jnz.nGi);
        this.U(370.0f, 100.0f);
        this.a(nbP, hsu.ldg, false);
    }

    @Override
    public void initialize() {
        super.initialize();
        for (dxq dxq2 : ahc) {
            this.receiveMessage(dxq2);
        }
        ahc = null;
        this.ql(true);
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 35330: {
                this.a((glk)dxq2);
            }
        }
    }

    public static void aa(dxq dxq2) {
        jgz jgz2 = hso.cxK().cxP().cyJ().cIY();
        if (jgz2 != null) {
            jgz2.receiveMessage(dxq2);
        } else {
            ahc.add(dxq2);
        }
    }

    @Override
    public boolean isOpen() {
        boolean bl = this.nk(nbP);
        return bl;
    }

    public void setOpen(boolean bl) {
        if (bl == this.isOpen()) {
            return;
        }
        this.q(nbP, bl);
        this.setVisible(this.isOpen());
        if (bl) {
            this.cqF();
            this.cFc();
        }
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.p(10, 0, 10, 20);
        this.f(new ipb("/dfdata/texture/gui/j2f/special_events/mi_events.png"));
        this.cXE().a(irl.dnr());
        this.cXE().W(this.cGT());
        this.cXE().W(ipx.j(this.cGU(), ipx.a(1, 10, new ipf[0])));
        this.pack();
    }

    @Override
    protected ipq cGj() {
        return null;
    }

    @Override
    protected ios cGS() {
        return null;
    }

    @Override
    protected void cds() {
        super.cds();
        if (this.mXs != null) {
            this.mXs.setVisible(this.cXO() == ihx.lXF);
        }
    }

    @Override
    protected void cGR() {
        jgz.cyJ().cHw().a(hyc.lnc, false);
    }

    @Override
    protected void cGQ() {
        super.cGQ();
        jgz.cyJ().cHw().a(hyc.lnc, this.isOpen());
    }

    @Override
    protected void cGo() {
        super.cGo();
        jgz.cyJ().cHw().a(hyc.lnc, true);
        this.qV(true);
        joa joa2 = hso.cxK().cxY();
        this.Z(joa2.W / 2.0f + 144.0f, this.cEF());
    }

    @Override
    protected void ku(float f2) {
        super.ku(f2);
        if (this.mXt != null) {
            this.mXt.hz(f2);
        }
        if (this.myS != null) {
            this.myS.hz(f2);
        }
    }

    private ipf cGT() {
        this.mXs = new ipb("/dfdata/texture/gui/j2f/special_events/background/event_background_main_gold_line.png");
        this.mXt = new iqa("/dfdata/texture/gui/j2f/special_events/background/event_background_main.png", 20, 0, 20, 20, iqb.mtp);
        return ipx.j(this.mXs, ipx.a(20, 0, 10, 20, this.mXt));
    }

    private ipf cGU() {
        this.myS = new izm();
        if (!nbQ.isEmpty()) {
            for (Map.Entry<String, jgw> entry : nbQ.entrySet()) {
                entry.getValue().nbG = new jgy(entry.getValue());
                this.myS.c(entry.getValue().nbG);
            }
        } else {
            this.myS.c(new jgx());
        }
        return this.myS;
    }

    private void a(glk glk2) {
        switch (glk2.bHc()) {
            case 0: {
                if (!this.isOpen()) {
                    jgz.cyJ().cHw().d(hyc.lnc, true);
                }
                this.b(glk2);
                break;
            }
            case 1: {
                this.c(glk2);
                break;
            }
            case 2: {
                this.d(glk2);
                break;
            }
            case 3: {
                this.e(glk2);
                break;
            }
            case 4: {
                this.f(glk2);
            }
        }
        this.pack();
    }

    private void b(glk glk2) {
        jgw jgw2 = new jgw();
        jgw2.Name = glk2.CJ();
        jgw2.iIy = glk2.qO();
        jgw2.kgo = glk2.bVN();
        nbQ.put(glk2.CJ(), jgw2);
        if (this.myS != null) {
            if (nbQ.size() == 1) {
                this.myS.removeAllItems();
            }
            jgw2.nbG = new jgy(jgw2);
            this.myS.c(jgw2.nbG);
        }
    }

    private void c(glk glk2) {
        jgw jgw2 = nbQ.get(glk2.CJ());
        if (jgw2 != null) {
            jgw2.iIy = glk2.qO();
            jgw2.kgo = glk2.bVN();
            if (jgw2.nbG != null) {
                jgw2.nbG.dFg();
            }
        } else {
            this.b(glk2);
        }
    }

    private void d(glk glk2) {
        jgw jgw2 = nbQ.get(glk2.CJ());
        if (jgw2 != null) {
            jgw2.iIy = glk2.qO();
            jgw2.kgo = glk2.bVN();
            if (jgw2.nbG != null) {
                jgw2.nbG.dFh();
            }
        }
    }

    private void e(glk glk2) {
        jgw jgw2 = nbQ.get(glk2.CJ());
        if (jgw2 != null) {
            jgw2.iIy = glk2.qO();
            jgw2.kgo = glk2.bVN();
            if (jgw2.nbG != null) {
                jgw2.nbG.dFi();
            }
        }
    }

    private void f(glk glk2) {
        jgw jgw2 = nbQ.get(glk2.CJ());
        if (jgw2 != null) {
            nbQ.remove(glk2.CJ());
            if (jgw2.nbG != null) {
                this.myS.d(jgw2.nbG);
                if (nbQ.isEmpty()) {
                    this.myS.c(new jgx());
                }
            }
        }
    }
}

