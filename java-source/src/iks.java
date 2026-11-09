/*
 * Decompiled with CFR.
 */
public class iks
extends ipx {
    private String mgL;
    private ipb mbG;
    private iqu mgM;
    private irr lBr;
    private ist lUP;
    private iqu mgN;

    public iks(String string) {
        this.a(irl.dnr());
        this.mgL = string;
        this.W(this.cGT());
        this.W(this.cGU());
    }

    public ist dan() {
        return this.lUP;
    }

    public irr dcx() {
        return this.lBr;
    }

    public void i(ijf ijf2) {
        String string = null;
        String string2 = null;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        switch (ijf2) {
            case mcL: {
                string = "Small.png";
                string2 = "bar_small.png";
                n = 4;
                n2 = 4;
                n3 = 8;
                break;
            }
            case mcM: {
                string = "Medium.png";
                string2 = "bar_medium.png";
                n = 3;
                n2 = 3;
                n3 = 10;
                break;
            }
            case mcN: {
                string = "Big.png";
                string2 = "bar_big.png";
                n = 2;
                n2 = 2;
                n3 = 12;
            }
        }
        this.mbG.qP("/dfdata/texture/gui/j2f/stats/StatBarBg" + string);
        this.lBr.Sm(0).b("/dfdata/texture/gui/j2f/stats/" + this.mgL + string2, 0, 0, 0, 0);
        this.mgM.setSize(n, 1);
        this.mgN.setSize(n2, 1);
        this.lUP.zY(n3);
        this.pack();
    }

    private ipf cGT() {
        this.mbG = new ipb();
        return this.mbG;
    }

    private ipf cGU() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(this.dcy());
        ipx2.W(ipx.c(this.cUv(), ipx.d(this.cPo())));
        ipx2.W(this.dcz());
        return ipx2;
    }

    private ipf dcy() {
        ipx ipx2 = new ipx();
        this.mgM = new iqu(1, 1);
        ipx2.a(this.mgM);
        return ipx2;
    }

    private ipf cUv() {
        irs irs2 = new irs();
        irs2.qu(null);
        irs2.ra(null);
        this.lBr = new irr(irs2);
        this.lBr.Sm(0).setName("StatBar");
        return this.lBr;
    }

    private ipf cPo() {
        this.lUP = new ist(isf.mwN, 14, 0xFFFFFF);
        return this.lUP;
    }

    private ipf dcz() {
        ipx ipx2 = new ipx();
        this.mgN = new iqu(1, 1);
        ipx2.a(this.mgN);
        return ipx2;
    }
}

