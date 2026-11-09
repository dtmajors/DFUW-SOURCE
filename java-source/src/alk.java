/*
 * Decompiled with CFR.
 */
public class alk {
    public final alc.a brQ;
    public final int brR;
    public final int brS;

    public alk(alc.a a2, int n, int n2) {
        assert (a2 != null);
        assert (n > 0);
        assert (n2 > 0);
        this.brQ = a2;
        this.brR = n;
        this.brS = n2;
    }

    public String DF() {
        return lea.enW().getName(this.brS);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFEnchantmentSlotInfo: SlotType=");
        stringBuilder.append((Object)this.brQ);
        stringBuilder.append(" RequiredQuantity=");
        stringBuilder.append(this.brR);
        stringBuilder.append(" RequiredResourceType='");
        stringBuilder.append(this.DF());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

