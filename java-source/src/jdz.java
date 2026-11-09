/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jdz
extends ipx {
    private jcn mTm;
    private boolean mTx;
    private ipb mcc;
    private iso myJ;

    public jdz(jcn jcn2, boolean bl) {
        this.mTm = jcn2;
        this.mTx = bl;
        this.a(iqo.dmS());
        this.W(ipx.a(4, 1, new ipf[0]));
        this.W(ipx.j(this.dze(), ipx.c(new ipf[0])));
        this.W(ipx.a(4, 1, new ipf[0]));
        this.W(this.cPo());
    }

    public void dzc() {
        this.mcc.qP("/dfdata/texture/gui/j2f/quests/panels/quest_task_complete.png");
        this.myJ.Rk(12357465);
    }

    public void dzd() {
        this.myJ.setText(this.dzf());
    }

    @Override
    public hyn dd(int n, int n2) {
        lox lox2 = this.mTm.isComplete() ? lxu.tyE : (this.mTx ? lxu.tyF : lxu.tyG);
        return iae.oJ(lox2.bD(new Object[0]).exA().toUpperCase());
    }

    private ipf dze() {
        this.mcc = this.mTm.isComplete() ? new ipb("/dfdata/texture/gui/j2f/quests/panels/quest_task_complete.png") : (this.mTx ? new ipb("/dfdata/texture/gui/j2f/quests/panels/quest_task_optional.png") : new ipb("/dfdata/texture/gui/j2f/quests/panels/quest_task_bullet.png"));
        return this.mcc;
    }

    private ipf cPo() {
        this.myJ = new iso();
        this.myJ.a(isf.mwN, 12);
        this.myJ.Rk(!this.mTm.isComplete() ? 0xABABAB : 12357465);
        this.myJ.setText(this.dzf());
        this.myJ.a(isu.mxP);
        this.myJ.setWidth(400);
        return this.myJ;
    }

    private String dzf() {
        String string = this.mTm.yp().exA();
        if (this.mTm.dxN() > 1) {
            string = string + " (" + Math.min(this.mTm.ze(), this.mTm.dxN()) + "/" + this.mTm.dxN() + ")";
        }
        return string;
    }
}

