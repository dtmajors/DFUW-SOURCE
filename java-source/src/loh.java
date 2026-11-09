/*
 * Decompiled with CFR.
 */
public class loh {
    private boolean bTt = false;
    public static final int rGl = 5000;
    public static final int rGm = 5000;

    public native void h(int var1, String var2, String var3);

    public native gr[] hS();

    public native Object[] ewF();

    public native dxq[] ewG();

    public native ktf[] ewH();

    public native ktv[] ewI();

    public native kgz[] ewJ();

    public native ba[] ewK();

    public native boolean h(int var1, Object var2);

    public native void yS(boolean var1);

    public native void shutdown();

    public native void aF(String var1);

    public native boolean aD(Object var1);

    public native int adQ(int var1);

    public native void bA(Object[] var1);

    public native void c(Object[] var1, int var2);

    public native kcz[] ewL();

    public native jrq[] ewM();

    public native miw[] ewN();

    public native boolean AQ(String var1);

    public native byte[] readFile(String var1);

    public native byte[] AR(String var1);

    public native byte[] AS(String var1);

    public native boolean a(String var1, boolean var2, byte[] var3);

    public native int AT(String var1);

    public static native void a(long var0, int var2, long[] var3, boolean[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, float[] var10, float[] var11, float[] var12, float[] var13);

    public static native void ewO();

    public static native long ewP();

    public static native String aC(long var0);

    public static native void aD(long var0);

    public static native long aE(long var0);

    public static native void a(long var0, int var2, int var3, int var4, int var5);

    public static native void a(long var0, String var2);

    public static native void a(long var0, int var2, int var3, int var4);

    public static native int aF(long var0);

    public static native boolean aE(String var0, String var1);

    public static native String getRegistryValue(String var0);

    public void r(String string, int n, int n2) {
    }

    public boolean af(String string, int n) {
        return true;
    }

    public boolean s(String string, int n, int n2) {
        return true;
    }

    public void AU(String string) {
        this.aF(string);
    }

    public int AV(String string) {
        return 1;
    }

    public Object[] adR(int n) {
        return null;
    }

    public dxq[] ewQ() {
        return this.ewG();
    }

    public Object[] ewR() {
        return this.ewF();
    }

    public void V(String[] stringArray) {
    }

    public gr[] ewS() {
        return this.hS();
    }

    public int ewT() {
        return 0;
    }

    public boolean aE(Object object) {
        return this.aD(object);
    }

    public void ewU() {
    }

    public void j(int n, String string, String string2) {
        this.h(n, string, string2);
    }

    public kcz[] ewV() {
        return this.ewL();
    }

    public ktf[] ewW() {
        return this.ewH();
    }

    public ktv[] ewX() {
        return this.ewI();
    }

    public kgz[] ewY() {
        return this.ewJ();
    }

    public jrq[] ewZ() {
        return this.ewM();
    }

    public ba[] exa() {
        return this.ewK();
    }

    public miw[] exb() {
        return this.ewN();
    }

    public int d(String string, String string2, int n) {
        return 1;
    }

    public int adS(int n) {
        return this.adQ(n);
    }

    public void a(int n, float f, float f2, int n2) {
    }

    public void bB(Object[] objectArray) {
        this.bA(objectArray);
    }

    public void d(Object[] objectArray, int n) {
        this.c(objectArray, n);
    }

    public void exc() {
        this.shutdown();
    }

    public void adT(int n) {
    }

    public void yT(boolean bl) {
        this.yS(bl);
    }

    public boolean i(int n, Object object) {
        return this.h(n, object);
    }

    public boolean AW(String string) {
        return this.AQ(string);
    }

    public byte[] AX(String string) {
        return this.readFile(string);
    }

    public byte[] AY(String string) {
        return this.AR(string);
    }

    public byte[] AZ(String string) {
        return this.AS(string);
    }

    public int Ba(String string) {
        return this.AT(string);
    }

    public boolean b(String string, boolean bl, byte[] byArray) {
        return this.a(string, bl, byArray);
    }
}

