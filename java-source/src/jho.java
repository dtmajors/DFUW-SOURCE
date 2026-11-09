/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jho
extends ipx {
    private jcn mTm;
    private boolean mTx;
    private ipb mcc;
    private iso myJ;

    public jho(jcn jcn2, boolean bl) {
        this.mTm = jcn2;
        this.mTx = bl;
        this.a(iqo.dmS());
        this.W(ipx.d(ipx.a(16, 16, ipx.d(this.drv()))));
        this.W(ipx.a(4, 1, new ipf[0]));
        this.W(this.cPo());
        this.aTg();
        this.mTm.mRa.c((jlf<jcn>)new jlr<jho, jcn>(this, this){
            final /* synthetic */ jho nfj;
            {
                this.nfj = jho2;
                super(jho3);
            }

            public void a(jho jho2, jcn jcn2) {
                jho.a(jho2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jho)object, (jcn)object2);
            }
        });
        this.mTm.mRC.c((jlf<jcn>)new jlr<jho, jcn>(this, this){
            final /* synthetic */ jho nfj;
            {
                this.nfj = jho2;
                super(jho3);
            }

            public void a(jho jho2, jcn jcn2) {
                jho.b(jho2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jho)object, (jcn)object2);
            }
        });
    }

    public void aTg() {
        if (this.mTm.isComplete()) {
            this.mcc.qP("/dfdata/texture/gui/j2f/quests/panels/quest_task_complete.png");
            this.myJ.Rk(12357465);
        } else {
            this.mcc.qP(this.mTx ? "/dfdata/texture/gui/j2f/quests/panels/quest_task_optional.png" : "/dfdata/texture/gui/j2f/quests/panels/quest_task_bullet.png");
        }
        String string = this.mTm.yp().exA();
        if (this.mTm.dxN() > 1) {
            string = string + " (" + this.mTm.ze() + "/" + this.mTm.dxN() + ")";
        }
        this.myJ.setText(string);
    }

    @Override
    public hyn dd(int n, int n2) {
        lox lox2 = this.mTm.isComplete() ? lxu.tyE : (this.mTx ? lxu.tyF : lxu.tyG);
        return iae.oJ(lox2.bD(new Object[0]).exA().toUpperCase());
    }

    private ipf drv() {
        this.mcc = new ipb();
        return this.mcc;
    }

    private ipf cPo() {
        this.myJ = new iso(isf.mwN, 11, 0xABABAB);
        this.myJ.setWidth(312);
        this.myJ.a(isu.mxP);
        this.myJ.sv(false);
        return this.myJ;
    }

    private void dGn() {
        this.aTg();
    }

    private void dGo() {
        this.aTg();
    }

    static /* synthetic */ void a(jho jho2) {
        jho2.dGn();
    }

    static /* synthetic */ void b(jho jho2) {
        jho2.dGo();
    }
}

