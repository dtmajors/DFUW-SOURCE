/*
 * Decompiled with CFR.
 */
public class bfp {
    public ldv GUID = null;
    public int[] dhI = null;

    public boolean equals(Object object) {
        assert (this.dhI != null);
        if (object instanceof bfp) {
            bfp bfp2 = (bfp)object;
            if (bfp2.GUID.equals(this.GUID)) {
                assert (this.dhI.length == bfp2.dhI.length);
                return true;
            }
        }
        return false;
    }

    public String toString() {
        assert (this.dhI != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": GUID=");
        stringBuilder.append(this.GUID);
        stringBuilder.append(" NumberOfEvents=");
        stringBuilder.append(this.dhI.length);
        return stringBuilder.toString();
    }
}

