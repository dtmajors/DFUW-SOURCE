/*
 * Decompiled with CFR.
 */
public class byt
extends bzi {
    private int[] dZt = null;

    public int[] aEf() {
        return this.dZt;
    }

    public void w(int[] nArray) {
        this.dZt = nArray;
    }

    public boolean equals(Object object) {
        assert (this.dZt != null);
        if (object instanceof byt) {
            byt byt2 = (byt)object;
            if (this.edc != byt2.aER()) {
                return false;
            }
            if (byt2.aEf() == null || byt2.aEf().length != this.dZt.length) {
                return false;
            }
            int n = this.dZt.length;
            for (int i = 0; i < n; ++i) {
                if (this.dZt[i] == byt2.aEf()[i]) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean a(byx byx2) {
        int n = byx2.aEN();
        assert (this.dZt != null);
        assert (n >= 0);
        int n2 = this.dZt.length;
        for (int i = 0; i < n2; ++i) {
            if (!(this.edc ? this.dZt[i] != n : this.dZt[i] == n)) continue;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        assert (this.dZt != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFMovementSkillRequirement: ");
        stringBuilder.append(super.toString());
        int n = this.dZt.length;
        for (int i = 0; i < n; ++i) {
            stringBuilder.append(" MovementSkill='");
            stringBuilder.append(this.eJ(this.dZt[i]));
            stringBuilder.append("'");
        }
        return stringBuilder.toString();
    }

    @Override
    protected void a(bzi bzi2) {
        assert (this.dZt != null);
        super.a(bzi2);
        byt byt2 = (byt)bzi2;
        int[] nArray = new int[this.dZt.length];
        System.arraycopy(this.dZt, 0, nArray, 0, this.dZt.length);
        byt2.w(nArray);
    }

    private String eJ(int n) {
        assert (n >= 0);
        if (n == 0) {
            return "null";
        }
        return lea.enZ().getName(n);
    }
}

