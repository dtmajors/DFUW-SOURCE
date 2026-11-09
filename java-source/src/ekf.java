/*
 * Decompiled with CFR.
 */
public class ekf
extends emr
implements dxu {
    public int isL = 0;
    public int aqs = -1;
    public ldv Ri = null;
    public ldv cCH = null;
    public ldv aDk = null;

    ekf() {
        super(13874);
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

