/*
 * Decompiled with CFR.
 */
public class df
extends btk
implements bto {
    dg lS = new dg();

    @Override
    public void setMessageDelegator(dxr dxr2) {
        this.MessageDelegator = dxr2;
        this.lS.setMessageDelegator(this.MessageDelegator);
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            this.Initialized = true;
            this.lS.setGUID(this.GUID);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        this.lS.doTick(ldz2);
    }
}

