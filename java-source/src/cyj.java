/*
 * Decompiled with CFR.
 */
class cyj {
    public cyk fYd = null;
    public ldv fzI = null;
    public ldv Ud = null;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFSensorData: SensorType='");
        stringBuilder.append((Object)this.fYd.Do());
        stringBuilder.append("' ObjectToSenseGUID=");
        stringBuilder.append(this.fzI);
        stringBuilder.append(" SensorGUID=");
        stringBuilder.append(this.Ud);
        return stringBuilder.toString();
    }
}

