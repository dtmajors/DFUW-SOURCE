/*
 * Decompiled with CFR.
 */
public class ijm
extends ijc {
    private ijo mdV = ijo.mee;
    private boolean mdW;
    private boolean mdX;
    private boolean mdY;
    private boolean mdZ;
    private boolean mea = false;
    private ipb meb;
    private ipb mec;
    private ipb med;

    public ijm() {
        super(false, true, lyu.tKS);
        this.c(this.dbs(), 0);
        this.c(this.dbt(), 0);
        this.c(this.dbu(), 1);
    }

    @Override
    public ije dae() {
        return new ijp(this);
    }

    @Override
    public ikd daf() {
        return ikd.mft;
    }

    public ijo dbf() {
        return this.mdV;
    }

    public void a(ijo ijo2) {
        this.mdV = ijo2;
        this.meb.qP(this.mdV.dbw());
        this.med.qP(this.mdV.Ri(4));
        this.mci.dLF();
    }

    public boolean dbg() {
        return this.mdX;
    }

    public void qw(boolean bl) {
        this.mdX = bl;
        this.mci.dLF();
    }

    public boolean dbh() {
        return this.mdZ;
    }

    public void qx(boolean bl) {
        this.mdZ = bl;
        this.mci.dLF();
    }

    public boolean dbi() {
        return this.mdY;
    }

    public void qy(boolean bl) {
        this.mdY = bl;
        this.mci.dLF();
    }

    public boolean dbj() {
        return this.mdW;
    }

    public void qz(boolean bl) {
        this.mdW = bl;
        this.mec.setVisible(bl);
        this.mci.dLF();
    }

    public boolean dbk() {
        return this.mea;
    }

    public void qA(boolean bl) {
        this.mea = bl;
        this.med.setVisible(bl);
        this.mci.dLF();
    }

    @Override
    public void cPk() {
        super.cPk();
        this.daG();
        switch (this.daD()) {
            case mcL: {
                this.meb.setSize(22, 22);
                this.mec.setSize(67, 44);
                this.med.setSize(30, 30);
                break;
            }
            case mcM: {
                this.meb.setSize(28, 28);
                this.mec.setSize(75, 49);
                this.med.setSize(35, 35);
                break;
            }
            case mcN: {
                this.meb.setSize(32, 32);
                this.mec.setSize(83, 54);
                this.med.setSize(40, 40);
            }
        }
        this.meb.ek(this.getWidth() / 2 - this.meb.getWidth() / 2, this.getHeight() / 2 - this.meb.getHeight() / 2);
        this.mec.ek(this.getWidth() / 2 - this.mec.getWidth() / 2, this.getHeight() / 2 - this.mec.getHeight() / 2);
        this.med.ek(this.getWidth() / 2 - this.med.getWidth() / 2, this.getHeight() / 2 - this.med.getHeight() / 2);
    }

    @Override
    public iph cXA() {
        return null;
    }

    @Override
    public void daa() {
        this.meb.hz(this.daE());
        this.mec.hz(this.daE());
        this.med.hz(this.daE());
    }

    private ipf dbs() {
        this.meb = new ipb(this.mdV.dbw());
        return this.meb;
    }

    private ipf dbt() {
        this.mec = new ipb("hit_indicator_new");
        return this.mec;
    }

    private ipf dbu() {
        this.med = new ipb(this.mdV.Ri(4));
        return this.med;
    }
}

