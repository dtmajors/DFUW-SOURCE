/*
 * Decompiled with CFR.
 */
public class fb {
    public int PZ = 0;
    public int Qa = 0;
    public double oV = 0.0;
    public double Qb = 0.0;
    public double Qc = 0.0;
    public alt Qd = null;

    public boolean equals(Object object) {
        if (object instanceof fb) {
            fb fb2 = (fb)object;
            return this.PZ == fb2.PZ;
        }
        assert (false);
        return false;
    }

    public final boolean gu() {
        return this.Qc == -2.0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFModifierTimer: ModifierTimerID=");
        stringBuilder.append(this.PZ);
        stringBuilder.append(" NumberOfTicksLeft=");
        stringBuilder.append(this.Qa);
        stringBuilder.append(" StartTime=");
        stringBuilder.append(this.oV);
        stringBuilder.append(" TickIntervalLength=");
        stringBuilder.append(this.Qb);
        stringBuilder.append(" NextTickTime=");
        stringBuilder.append(this.Qc);
        stringBuilder.append(" ");
        stringBuilder.append(this.Qd);
        return stringBuilder.toString();
    }
}

