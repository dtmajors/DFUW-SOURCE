/*
 * Decompiled with CFR.
 */
public class dd
extends btk
implements bto {
    private boolean fE = true;

    @Override
    public void doTick(ldz ldz2) {
        if (this.fE) {
            kih kih2 = (kih)this.MessageDelegator.h(1281);
            kih2.XP(1);
            kih2.wL(true);
            this.MessageDelegator.a(kih2);
            this.fE = false;
        }
    }
}

