/*
 * Decompiled with CFR.
 */
public class gcy
extends gdb
implements dxu {
    public static final int jdD = 1;
    public static final int jdE = 2;
    public static final int jdF = 3;
    public static final int jdG = 4;
    public static final int jdH = 5;
    public static final int jdI = 6;
    public static final int jdJ = 7;
    public static final int jdK = 8;
    public static final int jdL = 9;
    public static final int jdM = 10;
    private int jdN = -1;
    private int aqs = -1;
    private String jdO = "";
    private String jdw = null;

    gcy() {
        super(10257);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public int bTC() {
        return this.jdN;
    }

    public void IN(int n) {
        this.jdN = n;
    }

    public String bTD() {
        return this.jdO;
    }

    public void kT(String string) {
        this.jdO = string;
    }

    public String bTE() {
        return this.jdw;
    }

    public void kU(String string) {
        this.jdw = string;
    }
}

