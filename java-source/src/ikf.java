/*
 * Decompiled with CFR.
 */
public class ikf
extends ipx {
    private ijc mcy;
    private iou<ijf> mfT;

    public ikf(ijc ijc2) {
        this.mcy = ijc2;
        this.a(iqo.dmS());
        this.W(ipx.a(19, 1, new ipf[0]));
        this.W(ipx.d(new ist(isf.mwO, 14, 0xABABAB, lwx.tkA.bD(new Object[0]))));
        this.W(ipx.a(32, 1, new ipf[0]));
        this.W(ipx.c(new ipf[0]));
        this.dcm();
        this.W(ipx.a(16, 1, new ipf[0]));
    }

    private void dcm() {
        this.mfT = new iou<ijf>(this){
            final /* synthetic */ ikf mfU;
            {
                this.mfU = ikf2;
            }

            public void e(ijf ijf2) {
                ikf.a(this.mfU).a(ijf2);
            }

            public /* synthetic */ void S(Object object) {
                this.e((ijf)((Object)object));
            }
        };
        int n = 0;
        for (ijf ijf2 : ijf.values()) {
            if (n > 0) {
                this.W(ipx.a(8, 1, new ipf[0]));
                this.W(new ipk(0x313131, 1, 21));
                this.W(ipx.a(9, 1, new ipf[0]));
            }
            this.W(ipx.d(new ikg(this.mfT, ijf2)));
            ++n;
        }
        this.mfT.setInitialValue(this.mcy.daD());
    }

    static /* synthetic */ ijc a(ikf ikf2) {
        return ikf2.mcy;
    }
}

