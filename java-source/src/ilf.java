/*
 * Decompiled with CFR.
 */
public class ilf
extends ipx {
    private static final int mfZ = 3;
    private ipb mbG;
    private ipx lUt;
    private String mhn;
    private ipb lNa;
    private int lXp;
    private int mho;
    private ist lUP;
    private static iqz mhp = new iqz(){

        public void e(ipf ipf2) {
            ilf.a((ilf)ipf2.djJ());
        }

        public void i(ipf ipf2) {
            ilf.b((ilf)ipf2.djJ());
        }
    };

    public ilf(String string, String string2, int n, isf isf2, int n2, int n3, String string3) {
        this.a(irl.dnr());
        this.mbG = new ipb(string);
        this.W(this.mbG);
        this.lUt = new ipx(mhp);
        this.W(this.lUt);
        this.lUt.W(this.cPn());
        this.lUt.W(this.a(isf2, n2, n3, string3));
        this.qv(string2);
        this.Rj(n);
    }

    public String dcO() {
        return this.mbG.djt();
    }

    public void qu(String string) {
        this.mbG.qP(string);
    }

    public String dcP() {
        return this.mhn;
    }

    public void qv(String string) {
        if (lhn.equal(this.mhn, string)) {
            return;
        }
        this.mhn = string;
        this.lNa.qP(this.mhn);
    }

    public int getIconWidth() {
        return this.lXp;
    }

    public int getIconHeight() {
        return this.mho;
    }

    public void Rj(int n) {
        this.eb(n, n);
    }

    public void eb(int n, int n2) {
        if (n == this.lXp && n2 == this.mho) {
            return;
        }
        this.lXp = n;
        this.mho = n2;
        this.pack();
    }

    public boolean dcQ() {
        return this.lNa.djL();
    }

    public void setIconVisible(boolean bl) {
        this.lNa.setVisible(bl);
    }

    public String getText() {
        return this.lUP.getText();
    }

    public void o(loz loz2) {
        this.lUP.o(loz2);
    }

    public void setText(String string) {
        this.lUP.setText(string);
    }

    public void Rk(int n) {
        this.lUP.Rk(n);
    }

    public void m(String string, int n, int n2) {
        this.qu(string);
        this.Rj(n);
        this.lUP.zY(n2);
    }

    public void b(String string, int n, int n2, int n3) {
        this.qu(string);
        this.eb(n, n2);
        this.lUP.zY(n3);
    }

    public void kI(float f) {
        if (this.mbG != null) {
            this.mbG.hz(f);
        }
    }

    private ipf cPn() {
        this.lNa = new ipb();
        return this.lNa;
    }

    private ipf a(isf isf2, int n, int n2, String string) {
        this.lUP = new ist(isf2, n, n2, string);
        return this.lUP;
    }

    private void dcR() {
        int n = this.lUP.getWidth();
        int n2 = this.lUP.getHeight();
        n2 = Math.max(n2, this.lNa.getHeight());
        this.lUt.setSize(n += this.lNa.getWidth() + 3, n2);
    }

    private void dcS() {
        this.lUP.ek(this.lUt.getWidth() / 2 - this.lUP.getWidth() / 2, this.lUt.getHeight() / 2 - this.lUP.getHeight() / 2);
        this.lNa.r(this.lUP.getX() - 3 - this.getIconWidth(), this.lUt.getHeight() / 2 - this.getIconHeight() / 2, this.getIconWidth(), this.getIconHeight());
    }

    static /* synthetic */ void a(ilf ilf2) {
        ilf2.dcR();
    }

    static /* synthetic */ void b(ilf ilf2) {
        ilf2.dcS();
    }
}

