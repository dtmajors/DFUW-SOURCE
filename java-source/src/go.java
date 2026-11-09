/*
 * Decompiled with CFR.
 */
class go {
    public ldv Ts = null;
    public ldv Sy = null;
    public ldv Xe = null;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFMonsterSessionInfo: SessionObjectGUID=");
        stringBuilder.append(this.Ts);
        stringBuilder.append(" SystemOSGUID=");
        stringBuilder.append(this.Sy);
        stringBuilder.append(" NotifyObjectGUID=");
        stringBuilder.append(this.Xe);
        return stringBuilder.toString();
    }
}

