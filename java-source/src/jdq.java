/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jdq
extends ipx {
    private jcn mTm;

    public jdq(jcn jcn2) {
        this.mTm = jcn2;
        this.a(iqo.dmS());
        this.W(ipx.a(4, 1, new ipf[0]));
        this.W(ipx.j(ipx.a(12, 20, ipx.d(this.dyU())), ipx.c(new ipf[0])));
        this.W(ipx.a(4, 1, new ipf[0]));
        this.W(this.cPo());
    }

    @Override
    public hyn dd(int n, int n2) {
        return iae.oJ(lxu.tyI.bD(new Object[0]).exA().toUpperCase());
    }

    private ipf dyU() {
        return new ipb("/dfdata/texture/gui/j2f/quests/panels/quest_task_dash.png");
    }

    private ipf cPo() {
        ism ism2 = new ism(this){
            final /* synthetic */ jdq mTn;
            {
                this.mTn = jdq2;
            }

            public boolean du(int n, int n2) {
                jdq.a(this.mTn).dxS().dxJ().eo(jdq.a(this.mTn).getID());
                return true;
            }
        };
        ism2.a(isf.mwN, 12);
        ism2.Rk(!this.mTm.isComplete() ? 0xABABAB : 12357465);
        ism2.o(this.mTm.yp());
        ism2.a(isu.mxP);
        ism2.setWidth(400);
        return ism2;
    }

    static /* synthetic */ jcn a(jdq jdq2) {
        return jdq2.mTm;
    }
}

