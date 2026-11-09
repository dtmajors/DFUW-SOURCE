/*
 * Decompiled with CFR.
 */
package spenefett.util.jni;

@lle
@llc
@lld
public class SFJNIUtils {
    private static String BasePath = null;
    public static SFJNIUtils Instance = new SFJNIUtils();
    public static final int DT_TOP = 0;
    public static final int DT_LEFT = 0;
    public static final int DT_CENTER = 1;
    public static final int DT_RIGHT = 2;
    public static final int DT_VCENTER = 4;
    public static final int DT_BOTTOM = 8;
    public static final int DT_WORDBREAK = 16;
    public static final int DT_SINGLELINE = 32;
    public static final int DT_EXPANDTABS = 64;
    public static final int DT_TABSTOP = 128;
    public static final int DT_NOCLIP = 256;
    public static final int DT_EXTERNALLEADING = 512;
    public static final int DT_CALCRECT = 1024;
    public static final int DT_NOPREFIX = 2048;
    public static final int DT_INTERNAL = 4096;
    public static final int DT_EDITCONTROL = 8192;
    public static final int DT_PATH_ELLIPSIS = 16384;
    public static final int DT_END_ELLIPSIS = 32768;
    public static final int DT_MODIFYSTRING = 65536;
    public static final int DT_RTLREADING = 131072;
    public static final int DT_WORD_ELLIPSIS = 262144;
    public static final int DT_NOFULLWIDTHCHARBREAK = 524288;
    public static final int DT_HIDEPREFIX = 0x100000;
    public static final int DT_PREFIXONLY = 0x200000;

    private native String getDFBasePath();

    private native String getDFRegistryValue(String var1);

    public native void sleep(int var1);

    private SFJNIUtils() {
        System.loadLibrary("SFJNIUtils");
        BasePath = this.getDFBasePath();
        System.out.println("BasePath='" + BasePath + "'");
    }

    public static String getBasePath() {
        return BasePath;
    }

    public static String getRegistryValue(String string) {
        return Instance.getDFRegistryValue(string);
    }

    public native lhf getSinglelineTextSize(String var1, int var2, int var3, boolean var4, String var5);

    public native lhf getMultilineTextSize(String var1, int var2, int var3, boolean var4, String var5, int var6, int var7);

    public native String clipboardRead();

    public native boolean clipboardWrite(String var1);

    public native int getTickCount();

    public native int globalMutexOpen(String var1);

    public native boolean globalMutexClose(int var1);

    public native boolean globalMutexLock(int var1, int var2);

    public native boolean globalMutexUnlock(int var1);
}

