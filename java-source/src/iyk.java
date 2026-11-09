/*
 * Decompiled with CFR.
 */
public class iyk
extends ipx {
    private iwy lHo;
    private iqa lVj;
    private static iqz mdv = new iqz(){

        public void i(ipf ipf2) {
            boolean bl;
            iyk iyk2 = (iyk)ipf2;
            iyg iyg2 = (iyg)iyk2.djJ();
            iyk.a(iyk2).r(0, 0, iyk2.getWidth(), iyk2.getHeight());
            iyk.b(iyk2).r(0, 0, iyk2.getWidth(), 1);
            boolean bl2 = bl = hso.cxK().cxN() == jnz.nFE;
            if (bl && !iyg2.doR()) {
                iyk2.dsR();
            } else {
                iyk2.dsS();
            }
        }
    };

    public iyk() {
        this.a(mdv);
        this.lHo = new iwy();
        this.W(this.lHo);
        this.lHo.rP(false);
        this.lHo.rQ(false);
        this.lHo.rR(false);
        this.lVj = new iqa("/dfdata/texture/gui/j2f/common/lines/line_gold_horizontal_end.png", 0, 0, 13, 0);
        this.W(this.lVj);
    }

    public iwy dsG() {
        return this.lHo;
    }

    public void dsR() {
        this.lHo.rP(false);
        this.lHo.rQ(false);
        this.lVj.setVisible(true);
    }

    public void dsS() {
        this.lHo.rP(true);
        this.lHo.rQ(true);
        this.lVj.setVisible(false);
    }

    @Override
    public void b(jnz jnz2, jnz jnz3) {
        super.b(jnz2, jnz3);
        this.pack();
    }

    @Override
    public boolean dF(int n, int n2) {
        return false;
    }

    static /* synthetic */ iwy a(iyk iyk2) {
        return iyk2.lHo;
    }

    static /* synthetic */ iqa b(iyk iyk2) {
        return iyk2.lVj;
    }
}

