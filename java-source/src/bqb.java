/*
 * Decompiled with CFR.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class bqb
extends brm {
    private int ResourceType = 0;
    private int asi = 0;
    private ldv Xe = null;
    private int dBC = 0;

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public int vf() {
        return this.asi;
    }

    public void do(int n) {
        this.asi = n;
    }

    public ldv mq() {
        return this.Xe;
    }

    public void aX(ldv ldv2) {
        this.Xe = ldv2;
    }

    public int aud() {
        return this.dBC;
    }

    public void lS(int n) {
        this.dBC = n;
    }

    @Override
    public brm aue() {
        return null;
    }

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" ResourceType='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' Quantity=");
        stringBuilder.append(this.asi);
        stringBuilder.append(" NotifyObjectGUID=");
        stringBuilder.append(this.Xe);
        stringBuilder.append(" MinimumQuantityRequiredForNotification=");
        stringBuilder.append(this.dBC);
        return stringBuilder.toString();
    }
}

