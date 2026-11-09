/*
 * Decompiled with CFR.
 */
public class ihv
extends iqc {
    private int lXo = 0;
    private int lXp = 90;
    private int lXq = 0;
    private ipx lXr;
    private jaa lXs;
    private ipx lXt;
    private ist lXu;
    private izt lXv;
    private int lXw = 0;
    private int lXx = 0;
    private ipx lXy;
    private ipx lXz;

    public ihv() {
        this.Sd(-1);
        this.b(this.cXL());
        this.s(this.cGU());
    }

    public ipx cYB() {
        return this.lXr;
    }

    public int getIconWidth() {
        return this.lXp;
    }

    public int cYC() {
        return this.lXo;
    }

    public int cYD() {
        return this.lXq;
    }

    public void E(int n, int n2, int n3) {
        this.lXo = n;
        this.lXp = n2;
        this.lXq = n3;
        this.lXr.a(new iqu(this.cYI(), 1));
    }

    public ist cYE() {
        return this.lXs;
    }

    public String cYr() {
        return this.lXs.getText();
    }

    public void b(itd itd2) {
        this.lXs.e(itd2);
    }

    public void ql(String string) {
        this.lXs.setText(string);
    }

    public void A(loz loz2) {
        this.lXs.o(loz2);
    }

    public ist cYF() {
        return this.lXv;
    }

    public String cYs() {
        return this.lXv.getText();
    }

    public void c(itd itd2) {
        this.lXv.e(itd2);
        String string = itd2 != null ? itd2.getText() : null;
        this.lXv.setVisible(string != null && !string.isEmpty());
    }

    public void qm(String string) {
        this.lXv.setText(string);
        this.lXv.setVisible(string != null && !string.isEmpty());
    }

    public void B(loz loz2) {
        this.lXv.o(loz2);
        String string = loz2 != null ? loz2.exA() : null;
        this.lXv.setVisible(string != null && !string.isEmpty());
    }

    public int cYG() {
        return this.lXw;
    }

    public void QZ(int n) {
        if (n == this.lXw) {
            return;
        }
        this.lXw = n;
        if (this.lXy != null) {
            this.lXy.a(new iqu(n, 1));
        }
    }

    public int cYH() {
        return this.lXx;
    }

    public void Ra(int n) {
        if (n == this.lXx) {
            return;
        }
        this.lXx = n;
        if (this.lXz != null) {
            this.lXz.a(new iqu(n, 1));
        }
    }

    public String cYy() {
        return this.lXu.getText();
    }

    public ist cYz() {
        return this.lXu;
    }

    public void d(itd itd2) {
        this.lXu.e(itd2);
        this.pack();
    }

    public void C(loz loz2) {
        this.lXu.o(loz2);
        this.pack();
    }

    public void qn(String string) {
        this.lXu.setText(string);
        this.pack();
    }

    public boolean cYA() {
        return this.lXt.djL();
    }

    public void qp(boolean bl) {
        this.lXt.setVisible(bl);
    }

    public iqa cXL() {
        return new ihz();
    }

    private ipf cGU() {
        this.lXr = ipx.a(this.cYI(), 1, new ipf[0]);
        this.lXy = ipx.a(this.lXw, 1, new ipf[0]);
        this.lXs = new jaa();
        this.lXu = ist.a(isf.mwO, 16, 0xABABAB);
        this.lXt = ipx.l(ipx.j(ipx.a(1, 4, new ipf[0]), this.lXu));
        this.lXt.setVisible(false);
        this.lXz = ipx.a(this.lXx, 1, new ipf[0]);
        this.lXv = new izt();
        ipx ipx2 = ipx.l(this.lXr, this.lXy, this.lXs, this.lXt, this.lXz, ipx.j(ipx.a(1, 1, new ipf[0]), this.lXv));
        return ipx2;
    }

    private int cYI() {
        int n = this.lXp + this.lXq;
        return n;
    }
}

