/*
 * Decompiled with CFR.
 */
class cnk {
    public ldv dzZ = null;
    public ldv eOo = null;
    public boolean dFx = true;
    public boolean eOp = true;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFStorageSession: SessionHandlerGUID=");
        stringBuilder.append(this.dzZ);
        stringBuilder.append(" StorageObjectClientGUID=");
        stringBuilder.append(this.eOo);
        stringBuilder.append(" CanDepositItems=");
        stringBuilder.append(this.dFx);
        stringBuilder.append(" CanWitdrawItems=");
        stringBuilder.append(this.eOp);
        return stringBuilder.toString();
    }
}

