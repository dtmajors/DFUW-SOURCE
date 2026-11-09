/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lkv
 */
public class tx {
    public int aWe = 0;
    public float aWf = 0.0f;
    public int aWg = 0;
    public boolean aWh = false;

    public tx vB() {
        tx tx2 = new tx();
        tx2.aWe = this.aWe;
        tx2.aWf = this.aWf;
        tx2.aWg = this.aWg;
        tx2.aWh = this.aWh;
        return tx2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFAnimationData: AnimationState='");
        stringBuilder.append(lkv.adr((int)this.aWe));
        stringBuilder.append("' AnimationDuration=");
        stringBuilder.append(this.aWf);
        stringBuilder.append("' StopAnimation=");
        stringBuilder.append(this.aWh);
        if (this.aWg > 0) {
            stringBuilder.append(" TimeSliceNumber=");
            stringBuilder.append(this.aWg);
        }
        return stringBuilder.toString();
    }
}

