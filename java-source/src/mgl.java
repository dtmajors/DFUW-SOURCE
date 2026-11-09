/*
 * Decompiled with CFR.
 */
public class mgl
implements Comparable {
    private int qbi;
    private int DvJ;
    private int DvK;

    public int compareTo(Object object) {
        if (object instanceof mgl) {
            float f = ((mgl)object).eyE();
            if ((float)this.DvJ < f) {
                return -1;
            }
            if ((float)this.DvJ > f) {
                return 1;
            }
            return 0;
        }
        throw new IllegalArgumentException("Argument isn't type SFMaterialRange!");
    }

    public int eyD() {
        return this.qbi;
    }

    public void aec(int n) {
        this.qbi = n;
    }

    public int eyE() {
        return this.DvJ;
    }

    public void aed(int n) {
        this.DvJ = n;
    }

    public int eyF() {
        return this.DvK;
    }

    public void aee(int n) {
        this.DvK = n;
    }
}

