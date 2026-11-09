/*
 * Decompiled with CFR.
 */
public class iuz
extends ipx {
    private ipb mcc;
    private ist lUP;
    private iuy lUQ;

    public iuz(isf isf2, int n, int n2, loz loz2, int n3, int n4) {
        this.a(iqo.dmS());
        ipf[] ipfArray = new ipf[1];
        this.lUP = new ist(isf2, n, n2, loz2);
        ipfArray[0] = this.lUP;
        this.W(ipx.d(ipfArray));
        this.W(ipx.c(new ipf[0]));
        this.W(ipx.d(new ipk(n3, 1, n4)));
        this.W(ipx.a(8, 1, new ipf[0]));
        ipf[] ipfArray2 = new ipf[1];
        this.lUQ = new iuy(this){
            final /* synthetic */ iuz mAF;
            {
                this.mAF = iuz2;
            }

            public void pn(boolean bl) {
                this.mAF.aTg();
                this.mAF.pn(bl);
            }
        };
        ipfArray2[0] = this.lUQ;
        this.W(ipx.d(ipfArray2));
    }

    public iuz(loz loz2, boolean bl) {
        this(isf.mwO, 14, 0xABABAB, loz2, 0x313131, 20);
        this.hX(bl);
    }

    public boolean dir() {
        return this.lUQ.dir();
    }

    public void hX(boolean bl) {
        this.lUQ.hX(bl);
        this.aTg();
    }

    public ipb dss() {
        return this.mcc;
    }

    public ist drd() {
        return this.lUP;
    }

    public iuy dst() {
        return this.lUQ;
    }

    public void pn(boolean bl) {
    }

    public ipb dsu() {
        return null;
    }

    public void aTg() {
    }
}

