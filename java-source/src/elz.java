/*
 * Decompiled with CFR.
 */
public class elz
extends emr
implements dxu {
    private int aqs = -1;
    private String[] hlz = null;
    private ldv[] iuC = null;

    public elz() {
        super(13873);
    }

    public String[] getNames() {
        return this.hlz;
    }

    public void q(String[] stringArray) {
        this.hlz = stringArray;
    }

    public ldv[] bIL() {
        return this.iuC;
    }

    public void s(ldv[] ldvArray) {
        this.iuC = ldvArray;
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }
}

