/*
 * Decompiled with CFR.
 */
public class cpx {
    private final cpy eUs;
    public final ldv Xe;

    public cpx(cpy cpy2, ldv ldv2) {
        this.eUs = cpy2;
        this.Xe = ldv2;
    }

    public void oU(int n) {
        this.pg(n);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFLifeModeListenerForWildlife: WildlifeObjectGUID=");
        stringBuilder.append(this.eUs.getGUID());
        stringBuilder.append(" NotifyObjectGUID=");
        stringBuilder.append(this.Xe);
        return stringBuilder.toString();
    }

    private void pg(int n) {
        assert (n > 0);
        dxr dxr2 = this.eUs.getMessageDelegator();
        eym eym2 = (eym)dxr2.h(23554, this.eUs.getGUID(), this.Xe);
        eym2.bno = n;
        dxr2.F(eym2);
    }
}

