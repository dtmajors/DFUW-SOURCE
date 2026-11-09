/*
 * Decompiled with CFR.
 */
public class ctb {
    public int bid = 0;
    public boolean fet = false;
    public String feu = null;
    public String fev = null;

    public ctb bbu() {
        ctb ctb2 = new ctb();
        ctb2.bid = this.bid;
        ctb2.fet = this.fet;
        ctb2.feu = this.feu;
        ctb2.fev = this.fev;
        return ctb2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFCollisionSchemeMappingMonster: ID=");
        stringBuilder.append(this.bid);
        stringBuilder.append(" DefaultScheme=");
        stringBuilder.append(this.fet);
        stringBuilder.append(" StaticCollisionScheme='");
        stringBuilder.append(this.feu);
        stringBuilder.append("' DynamicCollisionSchemeName='");
        stringBuilder.append(this.fev);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

