/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 */
public class cda {
    private final cdb aeg;
    private final ldv Xe;
    private boolean emy = false;

    public cda(cdb cdb2, ldv ldv2) {
        this.aeg = cdb2;
        this.Xe = ldv2;
    }

    public void d(byv byv2) {
        if (this.emy) {
            return;
        }
        this.aJu();
    }

    public void a(cxo cxo2) {
        assert (cxo2 != null);
        if (this.emy) {
            return;
        }
        this.aJu();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFCreatureListener: CreatureObjectGUID=");
        stringBuilder.append(this.aeg.getGUID());
        stringBuilder.append(" NotifyObjectGUID=");
        stringBuilder.append(this.Xe);
        return stringBuilder.toString();
    }

    private void aJu() {
        dxr dxr2 = this.aeg.getMessageDelegator();
        eyp eyp2 = (eyp)dxr2.h(23557, this.aeg.getGUID(), this.Xe);
        dxr2.F(eyp2);
        this.emy = true;
    }
}

