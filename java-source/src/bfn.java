/*
 * Decompiled with CFR.
 */
public class bfn {
    public int Type = 0;
    public double dhq = 0.0;
    public ldv aYF = null;
    public ldv akX = null;
    public int bsG = 0;
    public int dhr = 0;
    public int aYH = -1;

    public final bfn aob() {
        bfn bfn2 = null;
        try {
            Class<?> clazz = this.getClass();
            bfn2 = (bfn)clazz.newInstance();
            this.b(bfn2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return bfn2;
    }

    public final String aoc() {
        return lea.enW().getName(this.bsG);
    }

    public final String getName() {
        return bfo.eV(this.Type);
    }

    public final String aod() {
        return lea.enW().getName(this.dhr);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": Type='" + this.getName());
        stringBuilder.append("' CauseObjectGUID=");
        stringBuilder.append(this.aYF);
        stringBuilder.append(" TargetObjectGUID=");
        stringBuilder.append(this.akX);
        stringBuilder.append(" CauseResourceType='");
        stringBuilder.append(this.aoc());
        stringBuilder.append("' TargetResourceType='");
        stringBuilder.append(this.aod());
        stringBuilder.append("' EventTime=");
        stringBuilder.append(this.dhq);
        stringBuilder.append("' SessionID=");
        stringBuilder.append(this.aYH);
        return stringBuilder.toString();
    }

    protected void b(bfn bfn2) {
        bfn2.Type = this.Type;
        bfn2.dhq = this.dhq;
        bfn2.aYF = this.aYF;
        bfn2.akX = this.akX;
        bfn2.bsG = this.bsG;
        bfn2.dhr = this.dhr;
        bfn2.aYH = this.aYH;
    }
}

