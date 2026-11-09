/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.ArrayList;

public final class hkj
extends hdj {
    private final lbn kBU = new lbn(this){
        final /* synthetic */ hkj kBW;
        {
            this.kBW = hkj2;
        }

        public final void W() {
            hkj.a((hkj)this.kBW).kcn.cnC();
        }
    };
    private final lbn jLS = new lbn(this){
        final /* synthetic */ hkj kBW;
        {
            this.kBW = hkj2;
        }

        public final void W() {
            if (!hkj.b(this.kBW).cdw() && hkj.a((hkj)this.kBW).kcn.cnA()) {
                hkj.a((hkj)this.kBW).kcn.cnC();
            }
        }
    };
    private final lbn kBV = new lbn(this){
        final /* synthetic */ hkj kBW;
        {
            this.kBW = hkj2;
        }

        public final void W() {
            if (!hkj.a((hkj)this.kBW).kcn.cnA()) {
                this.kBW.ne(false);
            } else {
                if (this.kBW.cdi()) {
                    this.kBW.closeWindow();
                }
                this.kBW.cdk();
            }
        }
    };

    public hkj(hdm hdm2) {
        super(hdm2, null, "CONTEXT_MENU", 64, null);
        this.mU(true);
    }

    @Override
    protected hen cdl() {
        Object object;
        Object object2;
        ArrayList<hhj.a> arrayList = new ArrayList<hhj.a>();
        Object object3 = this.jLM.cbP().kcn.bOT();
        for (int i = 0; i < ((hcn[])object3).length; ++i) {
            object2 = object3[i].epI ? null : new a(this, object3[i].ipx);
            object = new hhj.a((lbn)object2, object3[i].jHa);
            arrayList.add((hhj.a)object);
        }
        Object object4 = new hhj.a(this.kBU, lvm.sWD.bD("OLD_GUID!"));
        arrayList.add((hhj.a)object4);
        object3 = this.jLM.jXH;
        object4 = new hhj((hnc)this.jLM, null, lgg.rlI, this.jLM.jXE, 0, arrayList, this.kBU);
        object2 = ((hms)object4).cqv().p(object3.keL.kKX.kPT.ctr());
        object = this.jLM.kND.cqE().l((lhf)object2);
        hen hen2 = new hen(this.jLM, (String)null, (lgg)object, (lhf)object2, (hen.f)object3, new hnu.b[0]);
        hen2.w((hms)object4);
        return hen2;
    }

    @Override
    protected void cbg() {
        this.mU(false);
        super.cbg();
    }

    private hec cbP() {
        return this.jLM.cbP();
    }

    private void mU(boolean bl) {
        this.jLM.cdu().a(bl, this.jLS);
        this.cbP().kcn.cnB().a(bl, this.kBV);
    }

    static /* synthetic */ hec a(hkj hkj2) {
        return hkj2.cbP();
    }

    static /* synthetic */ hdm b(hkj hkj2) {
        return hkj2.jLM;
    }
}

