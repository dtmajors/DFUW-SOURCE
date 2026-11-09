/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
import java.util.ArrayList;

public final class hkk
extends hdj {
    private final lbn kBX = new lbn(this){
        final /* synthetic */ hkk kBY;
        {
            this.kBY = hkk2;
        }

        public final void W() {
            hkk.b((hkk)this.kBY).kcf.cnF();
        }
    };

    public hkk(hdm hdm2) {
        super(hdm2, null, "CRAFT_PROMPT", 340, null);
    }

    @Override
    protected hen cdl() {
        Object object;
        Object object2;
        lbq lbq2;
        ArrayList<hhj.a> arrayList = new ArrayList<hhj.a>();
        Object object3 = this.cbP().kcf.cnE();
        for (int i = 0; i < ((hdx[])object3).length; ++i) {
            lbq2 = object3[i];
            object2 = null;
            if (this.jLM.cbP().kck.b((hdx)lbq2) != null) {
                object2 = new a(this, (hdx)lbq2);
            }
            object = new hhj.a((lbn)object2, lvm.sWD.bD("OLD_GUID!"));
            arrayList.add((hhj.a)object);
        }
        Object object4 = new hhj.a(this.kBX, lvm.sWD.bD("OLD_GUID!"));
        arrayList.add((hhj.a)object4);
        String string = null;
        hhj.b b2 = this.jLM.jXE;
        this.jLM.jXk.getClass();
        object3 = new hhj((hnc)this.jLM, string, lgg.rlI, b2, 300, arrayList, this.kBX);
        object4 = this.jLM.jXJ;
        lbq2 = ((hms)object3).cqv().p(((hen.f)object4).keL.kKX.kPT.ctr());
        object2 = this.jLM.e(this.jLM.jXk.jUz, (lhf)lbq2);
        object = new hen(this.jLM, (String)null, (lgg)object2, (lhf)lbq2, (hen.f)object4, new hen.d(lcy.qYx), new hnu.d(this.kBX), new hen.e(true), new hen.c(this.hasAttribute(256)));
        ((hnu)object).w((hms)object3);
        return object;
    }

    private hec cbP() {
        return this.jLM.cbP();
    }

    static /* synthetic */ hdm a(hkk hkk2) {
        return hkk2.jLM;
    }

    static /* synthetic */ hec b(hkk hkk2) {
        return hkk2.cbP();
    }
}

