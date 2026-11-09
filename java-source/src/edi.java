/*
 * Decompiled with CFR.
 */
public class edi
extends eea
implements dxu {
    public int aqs = -1;
    public boolean imu = false;
    public int imv = 0;

    edi() {
        super(12831);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n2) {
        this.aqs = n2;
    }
}

