/*
 * Decompiled with CFR.
 */
public class gka
extends gjl
implements dxu {
    private int aqs = -1;
    private int[] jjz = null;
    private boolean jjA = true;
    private boolean jjB = false;
    private boolean jjC = false;
    private cxn[] jjD = null;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public cxn[] bVw() {
        if (this.jjD != null) {
            return this.jjD;
        }
        if (this.jjz == null) {
            return new cxn[0];
        }
        this.jjD = new cxn[this.jjz.length];
        for (int i = 0; i < this.jjz.length; ++i) {
            this.jjD[i] = cxn.values()[this.jjz[i]];
        }
        return this.jjD;
    }

    public void a(cxn[] cxnArray) {
        int n;
        if (cxnArray == null) {
            this.jjz = null;
            this.jjD = null;
            return;
        }
        this.jjD = cxnArray;
        boolean bl = false;
        for (n = 0; n < this.jjD.length; ++n) {
            if (this.jjD[n] != null) continue;
            bl = true;
        }
        if (bl) {
            n = 0;
            for (int i = 0; i < this.jjD.length; ++i) {
                if (this.jjD[i] == null) continue;
                ++n;
            }
            cxn[] cxnArray2 = new cxn[n];
            n = 0;
            for (int i = 0; i < this.jjD.length; ++i) {
                if (this.jjD[i] == null) continue;
                cxnArray2[n++] = this.jjD[i];
            }
            this.jjD = cxnArray2;
        }
        this.jjz = new int[this.jjD.length];
        for (n = 0; n < this.jjD.length; ++n) {
            this.jjz[n] = this.jjD[n].ordinal();
        }
    }

    public boolean bVx() {
        return this.jjA;
    }

    public void mg(boolean bl) {
        this.jjA = bl;
    }

    public boolean bVy() {
        return this.jjB;
    }

    public void mh(boolean bl) {
        this.jjB = bl;
    }

    public boolean bVz() {
        return this.jjC;
    }

    public void mi(boolean bl) {
        this.jjC = bl;
    }

    gka() {
        super(4633);
    }

    public boolean p(String string, boolean bl) {
        int n;
        if (string == null || string.isEmpty()) {
            return false;
        }
        String[] stringArray = string.trim().split(";");
        cxn[] cxnArray = new cxn[stringArray.length];
        for (n = 0; n < cxnArray.length; ++n) {
            cxnArray[n] = cxn.getValueByName(stringArray[n].trim());
        }
        n = 0;
        boolean bl2 = false;
        for (int i = 0; i < cxnArray.length; ++i) {
            if (cxnArray[i] == null) {
                bl2 = true;
                continue;
            }
            n = 1;
        }
        if (n != 0 && (!bl || bl && !bl2)) {
            this.a(cxnArray);
            return true;
        }
        return false;
    }
}

