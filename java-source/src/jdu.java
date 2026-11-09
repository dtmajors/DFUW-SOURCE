/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jdu
extends ipx {
    private jcn mTm;

    public jdu(jcn jcn2) {
        this.mTm = jcn2;
        this.a(iqo.dmS());
        this.W(new jdx(jcn2.dxR(), true));
        this.W(ipx.d(this.dyZ()));
    }

    private ipf dyZ() {
        ipx ipx2 = ipx.h(new ipf[0]);
        ipx2.W(new ipt(0x202020));
        ipx2.W(ipx.c(1, 1, 1, 1, new jdt(this){
            final /* synthetic */ jdu mTq;
            {
                this.mTq = jdu2;
            }

            public void cLq() {
                jdu.a(this.mTq).dxS().dxJ().eo(jdu.a(this.mTq).getID());
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxu.tyL.bD(new Object[0]).exA().toUpperCase());
            }
        }));
        return ipx2;
    }

    static /* synthetic */ jcn a(jdu jdu2) {
        return jdu2.mTm;
    }
}

