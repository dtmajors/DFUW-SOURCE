/*
 * Decompiled with CFR.
 */
import java.util.Queue;

public class ikm
extends ijd {
    private static final int mgm = 0xEFEFEF;
    private static final double mgn = 0.5;
    private static final double mgo = 2.0;
    private static final double mgp = 8.0;
    private static final double mgq = 0.5;
    private static final float mgr = 0.25f;
    private iso mgs = null;
    private iqu mgt = null;
    private boolean mgu = false;
    private a mgv = null;
    private a mgw = null;
    private hvr mgx = null;
    private Queue<lfs<loz, Boolean>> mgy = lcn.emA();

    public static int dcu() {
        return 0xEFEFEF;
    }

    public static int f(ijf ijf2) {
        switch (ijf2) {
            case mcL: {
                return 18;
            }
            default: {
                return 24;
            }
            case mcN: 
        }
        return 32;
    }

    public static int g(ijf ijf2) {
        switch (ijf2) {
            case mcL: {
                return 400;
            }
            default: {
                return 600;
            }
            case mcN: 
        }
        return 1000;
    }

    public static int h(ijf ijf2) {
        switch (ijf2) {
            case mcL: {
                return 50;
            }
            default: {
                return 100;
            }
            case mcN: 
        }
        return 150;
    }

    public static float daU() {
        return 0.25f;
    }

    @Override
    public boolean cZX() {
        return true;
    }

    @Override
    public Integer dO(int n, int n2) {
        return (int)((float)n * 0.5f);
    }

    @Override
    public ijg dS(int n, int n2) {
        return ijg.mcR;
    }

    @Override
    public ijg dT(int n, int n2) {
        return ijg.mcR;
    }

    @Override
    public Integer dP(int n, int n2) {
        return (int)((float)n2 * 0.5f);
    }

    public ikm() {
        super("Notifications");
        this.mgs = new iso();
        this.mgs.a(isf.mwO, ikm.f(this.daD()));
        this.mgs.Rk(ikm.dcu());
        this.mgs.a(isu.mxR);
        this.mgs.g(lwx.tli);
        this.W(this.mgs);
        if (this.mgt == null) {
            this.mgt = new iqu(ikm.g(this.daD()), ikm.h(this.daD()));
        }
        this.a(this.mgt);
        this.a(a.mgB);
        this.a(ipn.msf);
    }

    @Override
    public void cZZ() {
        if (this.mgt == null) {
            this.mgt = new iqu(ikm.g(this.daD()), ikm.h(this.daD()));
        }
        this.mgt.setSize(ikm.g(this.daD()), ikm.h(this.daD()));
        this.setSize(ikm.g(this.daD()), ikm.h(this.daD()));
        this.mgs.zY(ikm.f(this.daD()));
        this.pack();
    }

    public void c(loz loz2, boolean bl) {
        switch (this.mgv) {
            case mgB: {
                if (this.mgy.isEmpty()) {
                    this.mgs.o(loz2);
                    this.mgu = bl;
                    this.a(a.mgC);
                    break;
                }
                this.mgy.add(new lfs<loz, Boolean>(loz2, bl));
                lfn.b(0, this.getClass().getSimpleName(), "displayNotification() : Queue Size = " + this.mgy.size());
                break;
            }
            default: {
                this.mgy.add(new lfs<loz, Boolean>(loz2, bl));
                lfn.b(0, this.getClass().getSimpleName(), "displayNotification() : Queue Size = " + this.mgy.size());
            }
        }
    }

    private void a(a a2) {
        if (a2 == this.mgv) {
            return;
        }
        if (a2 == a.mgF) {
            this.d(this.mgx);
            this.mgw = this.mgv;
            this.mgv = a.mgF;
            this.setVisible(false);
            return;
        }
        if (this.mgv == a.mgF) {
            this.c(this.mgx);
            this.mgv = this.mgw;
            this.mgw = null;
            this.setVisible(true);
            return;
        }
        this.d(this.mgx);
        this.mgx = this.b(a2);
        this.c(this.mgx);
        this.mgv = a2;
        switch (this.mgv) {
            case mgB: {
                if (!this.mgy.isEmpty()) {
                    lfs<loz, Boolean> lfs2 = this.mgy.poll();
                    if (lfs2 == null) break;
                    this.mgs.o((loz)lfs2.reX);
                    this.mgu = (Boolean)lfs2.reY;
                    this.a(a.mgC);
                    lfn.b(0, this.getClass().getSimpleName(), "changeState() : Queue Size = " + this.mgy.size());
                }
                this.hz(0.0f);
                this.setVisible(false);
                break;
            }
            default: {
                this.setVisible(true);
            }
        }
    }

    @Override
    public ijc cZY() {
        return new ikn();
    }

    @Override
    public void dah() {
        this.a(a.mgF);
        super.dah();
        ikn ikn2 = (ikn)this.daw();
        ikn2.kI(this.daE());
        ikn2.a(this.daD());
    }

    @Override
    public void dai() {
        super.dai();
        ikn ikn2 = (ikn)this.daw();
        this.kI(ikn2.daE());
        this.a(ikn2.daD());
        this.mgs.zY(ikm.f(this.daD()));
        this.cPk();
        switch (this.mgw) {
            case mgB: {
                this.hz(0.0f);
            }
        }
        this.a(this.mgw);
    }

    private void c(hvr hvr2) {
        if (hvr2 == null) {
            return;
        }
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czy() != null) {
            hso.cxK().cxP().czy().a(hvr2);
        }
    }

    private void d(hvr hvr2) {
        if (hvr2 == null) {
            return;
        }
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czy() != null) {
            hso.cxK().cxP().czy().b(hvr2);
        }
    }

    private hvr b(a a2) {
        switch (a2) {
            case mgC: {
                return new ioe(this, this, 0.0f, this.daE(), 0.5){
                    final /* synthetic */ ikm mgz;
                    {
                        this.mgz = ikm2;
                        super(ipf2, f, f2, d2);
                    }

                    public void czS() {
                        ikm.a(this.mgz, a.mgD);
                    }
                };
            }
            case mgD: {
                return new hvq(this, this.mgu ? 8.0 : 2.0){
                    final /* synthetic */ ikm mgz;
                    {
                        this.mgz = ikm2;
                        super(d2);
                    }

                    public void czS() {
                        ikm.a(this.mgz, a.mgE);
                    }
                };
            }
            case mgE: {
                return new ioe(this, this, this.daE(), 0.0f, 0.5){
                    final /* synthetic */ ikm mgz;
                    {
                        this.mgz = ikm2;
                        super(ipf2, f, f2, d2);
                    }

                    public void czS() {
                        ikm.a(this.mgz, a.mgB);
                    }
                };
            }
        }
        return null;
    }

    static /* synthetic */ void a(ikm ikm2, a a2) {
        ikm2.a(a2);
    }
}

