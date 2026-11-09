/*
 * Decompiled with CFR.
 */
class btw {
    public cci dMr = null;

    btw() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFClanStoneInfo: ");
        stringBuilder.append("CityID: ");
        stringBuilder.append(this.dMr.Xt());
        stringBuilder.append(" GUID=");
        stringBuilder.append(this.dMr.getGUID());
        stringBuilder.append(" CityPos: ");
        stringBuilder.append(this.dMr.Xv());
        stringBuilder.append(" CityRadi: ");
        stringBuilder.append(this.dMr.Xu());
        return stringBuilder.toString();
    }
}

