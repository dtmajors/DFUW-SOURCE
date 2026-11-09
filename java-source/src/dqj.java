/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 */
public class dqj
extends dqk {
    protected String gOn = null;

    public dqj() {
        this.ObjectType = 26;
    }

    public void initialize() {
        if (!this.Initialized) {
            this.Initialized = true;
            ksk ksk2 = (ksk)this.MessageDelegator.j(8);
            ksk2.hC(this.GUID);
            ksk2.xc(this.gOn);
            this.MessageDelegator.a(ksk2);
        }
    }

    public void iW(String string) {
        this.gOn = string;
    }

    public String btn() {
        return this.gOn;
    }

    public void play() {
        kih kih2 = (kih)this.MessageDelegator.h(1281);
        kih2.XP(1);
        kih2.wL(false);
        kih2.tB(this.GUID);
        kih2.ts(this.GUID);
        this.MessageDelegator.a(kih2);
    }
}

