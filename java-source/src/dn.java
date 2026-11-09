/*
 * Decompiled with CFR.
 */
public class dn
extends btk
implements bto {
    boolean fE = true;
    boolean mP = false;
    private final float mQ = 2.0f;
    private final float mR = 3.0f;
    private static float mS = 2.2f;
    krm mT = null;

    @Override
    public void initialize() {
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.fE) {
            this.fE = false;
            this.mP = true;
        } else if (this.ObserverObjects != null && this.mP) {
            ldv ldv2 = null;
            for (int i = 0; i < this.ObserverObjects.size(); ++i) {
                ldv2 = (ldv)this.ObserverObjects.get(i);
                kkw kkw2 = (kkw)this.MessageDelegator.h(1030);
                kkw2.YI(1);
                kkw2.YH(4);
                kkw2.YJ(1);
                this.MessageDelegator.a(kkw2);
                mS = mS < 3.0f ? (mS += 0.08f) : 2.0f;
                knb knb2 = (knb)this.MessageDelegator.h(771);
                this.MessageDelegator.a(knb2);
            }
            this.mP = false;
        }
    }
}

