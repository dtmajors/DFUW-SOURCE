/*
 * Decompiled with CFR.
 */
public class iil
extends ipz {
    private boolean lzT;
    private int mbc = 0;
    private int mbd = 0;
    private ipx mbe;
    private ipb mbf;
    private iqa lUU;
    private ist lUP;
    private hvr lgb;

    public iil(boolean bl, ijf ijf2, loz loz2, float f) {
        String string;
        this.lzT = bl;
        this.sa(true);
        String string2 = string = bl ? "left" : "right";
        String string3 = ijf2 == ijf.mcN ? "large" : (ijf2 == ijf.mcM ? "normal" : "small");
        String string4 = "ap_label_" + string + "_" + string3 + "_background";
        String string5 = string4 + "_lines";
        this.mbe = new ipx();
        this.W(this.mbe);
        this.mbf = new ipb(string5);
        this.mbe.W(this.mbf);
        this.lUU = new iqa(string4, bl ? 28 : 16, 4, bl ? 16 : 28, 4, iqb.mtp);
        this.mbe.W(this.lUU);
        this.lUP = new ist(isf.mwO, 11 + ijf2.ordinal(), 12357465, loz2);
        this.mbe.W(this.lUP);
        this.mbf.hz(f);
        this.lUU.hz(f);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.lgb != null) {
            hso.cxK().cxP().czy().b(this.lgb);
            this.lgb = null;
        }
    }

    @Override
    public void cPj() {
        this.setHeight(this.mbf.getHeight());
    }

    @Override
    public void cPk() {
        int n;
        int n2;
        boolean bl = this.mbc == 0;
        this.mbc = n2 = 44 + this.lUP.getWidth();
        this.mbd = n = this.mbf.getHeight();
        this.mbf.ek(this.lzT ? n2 - this.mbf.getWidth() + 19 : -19, 0);
        this.lUU.r(0, n / 2 - this.lUU.djv() / 2, n2, this.lUU.djv());
        this.lUP.ek(this.lzT ? 28 : 16, n / 2 - this.lUP.getHeight() / 2);
        if (bl) {
            this.lgb = new iim(this, this){
                final /* synthetic */ iil mbg;
                {
                    this.mbg = iil2;
                    super(iil3);
                }

                public void cZW() {
                    this.mbg.cZR();
                }
            };
            hso.cxK().cxP().czy().a(this.lgb);
        }
    }

    public void cZR() {
    }

    boolean cZS() {
        return this.lzT;
    }

    int cZT() {
        return this.mbc;
    }

    int cZU() {
        return this.mbd;
    }

    ipx cZV() {
        return this.mbe;
    }
}

