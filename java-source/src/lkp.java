/*
 * Decompiled with CFR.
 */
public class lkp
implements Comparable<lkp> {
    private float aZE;
    private int rqW;
    private ljq Offset = new ljq();
    private String qvO;

    public lkp() {
    }

    public lkp(lkp lkp2) {
        this.aZE = lkp2.getStartTime();
        this.rqW = lkp2.etN();
        this.Offset = new ljq(lkp2.getOffset());
        this.qvO = lkp2.qvO;
    }

    public int etN() {
        return this.rqW;
    }

    public void ade(int n) {
        this.rqW = n;
    }

    public float getStartTime() {
        return this.aZE;
    }

    public void setStartTime(float f) {
        this.aZE = f;
    }

    public String toString() {
        return "StartTime = " + this.aZE + ", EffectID = " + this.rqW;
    }

    public int b(lkp lkp2) {
        lkp lkp3 = lkp2;
        float f = lkp3.getStartTime();
        float f2 = this.getStartTime();
        if (f2 < f) {
            return -1;
        }
        if (f2 > f) {
            return 1;
        }
        if (this.rqW < lkp3.etN()) {
            return -1;
        }
        if (this.rqW > lkp3.etN()) {
            return 1;
        }
        lfn.b(5, this.getClass().getName(), "compareTo() : Cannot have two SFAnimationSpecialEffect that start at the same time, changing the same property!");
        lfn.b(5, this.getClass().getName(), "compareTo() : This effect = " + this);
        lfn.b(5, this.getClass().getName(), "compareTo() : Other effect = " + lkp3);
        assert (false);
        return 0;
    }

    public ljq getOffset() {
        return this.Offset;
    }

    public void setOffset(ljq ljq2) {
        this.Offset = ljq2;
    }

    public String emu() {
        return this.qvO;
    }

    public void yX(String string) {
        this.qvO = string;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.b((lkp)object);
    }
}

