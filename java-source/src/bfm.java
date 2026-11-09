/*
 * Decompiled with CFR.
 */
public class bfm
extends bfp {
    public int[] dhp = null;

    @Override
    public boolean equals(Object object) {
        if (object instanceof bfm) {
            bfm bfm2 = (bfm)object;
            if (super.equals(object)) {
                assert (this.dhp.length == bfm2.dhp.length);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" NumberOfEffects=");
        stringBuilder.append(this.dhp.length);
        return stringBuilder.toString();
    }
}

