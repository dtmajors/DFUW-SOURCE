/*
 * Decompiled with CFR.
 */
public class gcz
extends gdb
implements dxu {
    private int aqs = -1;
    private String[] jdP = new String[0];
    private String ayB = "";
    private int hdr = 0;
    public int[] jdQ;
    public int[] jdR;
    public String[] jdS;
    public lgo[] jdT;
    public int jdU;
    public int[] jdV = null;
    public int[] jdW = null;

    gcz() {
        super(10258);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public String[] bTF() {
        return this.jdP;
    }

    public void C(String[] stringArray) {
        this.jdP = stringArray;
    }

    public int getLevel() {
        return this.hdr;
    }

    public void setLevel(int n) {
        this.hdr = n;
    }

    public String getVendorName() {
        return this.ayB;
    }

    public void fS(String string) {
        this.ayB = string;
    }
}

