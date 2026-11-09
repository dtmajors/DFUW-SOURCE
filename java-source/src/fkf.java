/*
 * Decompiled with CFR.
 */
public class fkf
extends fkc
implements dxu {
    public int aqs;
    private int iOz = 0;

    public void a(boa boa2) {
        this.iOz = boa2 == null ? boa.dwZ.ordinal() : boa2.ordinal();
    }

    public boa bQd() {
        if (this.iOz >= 0 && this.iOz < boa.values().length) {
            return boa.values()[this.iOz];
        }
        return boa.dwZ;
    }

    fkf() {
        super(11800);
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

