/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 */
class buh {
    public cew dNQ = null;
    public ldv Zf = null;
    public boolean dNR = false;

    buh() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFPlayerInfo: Player=");
        stringBuilder.append(this.dNQ.getGUID());
        stringBuilder.append(" TitleCollectionGUID=");
        stringBuilder.append(this.Zf);
        stringBuilder.append(" ClanMember=");
        stringBuilder.append(this.dNR);
        return stringBuilder.toString();
    }
}

