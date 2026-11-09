/*
 * Decompiled with CFR.
 */
public abstract class iqf
extends ios {
    @Override
    public boolean du(int n, int n2) {
        super.du(n, n2);
        iqg iqg2 = this.dmM();
        if (iqg2 != null) {
            iqg2.setGUID(this.djE().getMessageDelegator().bzv());
            this.djE().getMessageDelegator().a((amf)((Object)iqg2));
        }
        return true;
    }

    public abstract iqg dmM();
}

