/*
 * Decompiled with CFR.
 */
public class joe {
    public static final int nHn = 0;
    public static final int nHo = 1;
    public static final int nHp = 2;
    public static final int nHq = 3;
    public static final int nHr = 4;
    public static final int nHs = 5;
    public static final int nHt = 6;
    public static final int nHu = 7;
    public static final int nHv = 8;
    public static final int nHw = 9;
    public static final int nHx = 10;
    private int nvz;
    private int kV;
    private int nvA;
    private int nvB;
    private int nvC;
    private short nvD;
    private short nvE;
    private short nuN;
    private int nvF;
    private short nvG;
    private String Name;
    private int nvH;
    private int nvI;
    private int Type;
    private int nvJ;
    private short nuM;

    public short dOB() {
        return this.nvD;
    }

    public void g(short s) {
        this.nvD = s;
    }

    public short dOC() {
        return this.nvE;
    }

    public void h(short s) {
        this.nvE = s;
    }

    public int dOD() {
        return this.nvz;
    }

    public int getDimension() {
        return this.nvF;
    }

    public void Vp(int n) {
        this.nvF = n;
    }

    public short dOE() {
        return this.nvG;
    }

    public void i(short s) {
        this.nvG = s;
    }

    public int getFlags() {
        return this.kV;
    }

    public void OP(int n) {
        this.kV = n;
    }

    public int dOF() {
        return this.nvC;
    }

    public void Vq(int n) {
        this.nvC = n;
    }

    public int dOG() {
        return this.nvB;
    }

    public void Vr(int n) {
        this.nvB = n;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    public short dOA() {
        return this.nuN;
    }

    public void f(short s) {
        this.nuN = s;
    }

    public int getAscii() {
        return this.nvI;
    }

    public void Vs(int n) {
        this.nvI = n;
    }

    public int dMu() {
        return this.nvH;
    }

    public int getType() {
        return this.Type;
    }

    public void setType(int n) {
        this.Type = n;
    }

    public int getOffset() {
        return this.nvJ;
    }

    public void setOffset(int n) {
        this.nvJ = n;
    }

    public short dOz() {
        return this.nuM;
    }

    public void e(short s) {
        this.nuM = s;
    }

    public int dOH() {
        return this.nvA;
    }

    public void Vt(int n) {
        this.nvA = n;
    }

    public String toString() {
        return "DeviceObjectType " + this.nvz + " Flags " + this.kV + " Granularity " + this.nvA + " MaxForce " + this.nvB + " ForceResolution " + this.nvC + " CollectionNumber " + this.nvD + " DesignatorIndex " + this.nvE + " UsagePage " + this.nuN + " Dimension " + this.nvF + " Exponent " + this.nvG + " Name " + this.Name + " ScanCode " + this.nvH + " Ascii " + this.nvI + " Type " + this.Type + " Offset " + this.nvJ + " Usage " + this.nuM;
    }
}

