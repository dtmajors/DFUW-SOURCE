/*
 * Decompiled with CFR.
 */
public class jeb
extends ipx {
    private jci mSI;
    private iph mSW;
    private iox lXg;

    public jeb(jci jci2) {
        this.mSI = jci2;
        this.a(iqo.dmS());
        this.W(ipx.a(1, 63, new ipf[0]));
        this.W(ipx.c(new ipf[]{ipx.d(new ist(isf.mwO, 16, 12357465, this.mSI.aND()))}));
        if (this.mSI.vY()) {
            this.W(this.cGX());
            this.W(ipx.a(2, 1, new ipf[0]));
            this.W(ipx.d(this.dyA()));
        }
        this.W(ipx.a(2, 1, new ipf[0]));
    }

    private ipf cGX() {
        return ipx.j(ipx.a(1, 6, new ipf[0]), new ipk(0x2F2F2F, 1, 52));
    }

    private ipf dyA() {
        return new jdj(this){
            final /* synthetic */ jeb mTB;
            {
                this.mTB = jeb2;
            }

            public void cLq() {
                jcc.dwT().TP(jeb.a(this.mTB).vS().getID());
            }
        };
    }

    static /* synthetic */ jci a(jeb jeb2) {
        return jeb2.mSI;
    }
}

