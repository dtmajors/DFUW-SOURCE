/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 */
public class cdd {
    private final cdb aeg;
    public final ldv Xe;

    public cdd(cdb cdb2, ldv ldv2) {
        this.aeg = cdb2;
        this.Xe = ldv2;
    }

    public void oU(int n) {
        this.pg(n);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFLifeModeListener: CreatureObjectGUID=");
        stringBuilder.append(this.aeg.getGUID());
        stringBuilder.append(" NotifyObjectGUID=");
        stringBuilder.append(this.Xe);
        return stringBuilder.toString();
    }

    private void pg(int n) {
        assert (n > 0);
        dxr dxr2 = this.aeg.getMessageDelegator();
        eym eym2 = (eym)dxr2.h(23554, this.aeg.getGUID(), this.Xe);
        eym2.bno = n;
        dxr2.F(eym2);
    }
}

