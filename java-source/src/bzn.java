/*
 * Decompiled with CFR.
 */
public class bzn {
    private byw.c edQ = null;
    private bzi[] edR = null;
    private bzm[] edS = null;

    public byw.c aFq() {
        return this.edQ;
    }

    public void c(byw.c c2) {
        this.edQ = c2;
    }

    public bzi[] aFr() {
        return this.edR;
    }

    public void a(bzi[] bziArray) {
        this.edR = bziArray;
    }

    public bzm[] aFs() {
        return this.edS;
    }

    public void a(bzm[] bzmArray) {
        this.edS = bzmArray;
    }

    public bzn aFt() {
        assert (this.edQ != null);
        assert (this.edR != null);
        assert (this.edS != null);
        bzn bzn2 = new bzn();
        bzn2.c(this.edQ);
        bzi[] bziArray = new bzi[this.edR.length];
        int n = bziArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            bziArray[i2] = this.edR[i2].aFo();
        }
        bzn2.a(bziArray);
        bzm[] bzmArray = new bzm[this.edS.length];
        int n2 = bzmArray.length;
        for (n = 0; n < n2; ++n) {
            bzmArray[n] = this.edS[n].aFp();
        }
        bzn2.a(bzmArray);
        return bzn2;
    }

    public boolean equals(Object object) {
        assert (this.edR != null);
        assert (this.edS != null);
        if (object instanceof bzn) {
            int n;
            bzn bzn2 = (bzn)object;
            if (this.edQ != bzn2.aFq()) {
                return false;
            }
            int n2 = this.edR.length;
            for (n = 0; n < n2; ++n) {
                if (this.edR[n].equals(bzn2.aFr()[n])) continue;
                return false;
            }
            n2 = this.edS.length;
            for (n = 0; n < n2; ++n) {
                if (this.edS[n].equals(bzn2.aFs()[n])) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean a(byx byx2) {
        if (this.edR == null) {
            return true;
        }
        int n = this.edR.length;
        for (int i2 = 0; i2 < n; ++i2) {
            if (this.edR[i2].a(byx2)) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFStateChangeRule: Event='");
        stringBuilder.append((Object)this.edQ);
        stringBuilder.append("' RequirementCount=");
        stringBuilder.append(this.edR.length);
        stringBuilder.append(" StateChangeCount=");
        stringBuilder.append(this.edS.length);
        return stringBuilder.toString();
    }
}

