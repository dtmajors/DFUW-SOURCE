/*
 * Decompiled with CFR.
 */
public class cta {
    public int bid = 0;
    public boolean fet = false;
    public int bpX = 0;
    public int bpZ = 0;
    public String feu = null;
    public String fev = null;

    public cta bbs() {
        cta cta2 = new cta();
        cta2.bid = this.bid;
        cta2.fet = this.fet;
        cta2.bpX = this.bpX;
        cta2.bpZ = this.bpZ;
        cta2.feu = this.feu;
        cta2.fev = this.fev;
        return cta2;
    }

    public String bbt() {
        return byw.az(this.bpX, this.bpZ);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFCollisionSchemeMapping: ID=");
        stringBuilder.append(this.bid);
        stringBuilder.append(" ModeValue='");
        stringBuilder.append(this.bbt());
        stringBuilder.append("' StaticCollisionScheme='");
        stringBuilder.append(this.feu);
        stringBuilder.append("' DynamicCollisionSchemeName='");
        stringBuilder.append(this.fev);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

