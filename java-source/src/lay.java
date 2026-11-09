/*
 * Decompiled with CFR.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class lay {
    public static final int quR = 0;
    public static final int quS = 1;
    public static final int quT = 0;
    public static final int quU = 2;
    public static final int quV = 4;
    public static final int quW = 8;
    public static final int quX = 16;
    public static final int quY = 32;
    private static final int quZ = 76;
    private static final byte qva = 61;
    private static final byte qvb = 10;
    private static final String qvc = "US-ASCII";
    private static final byte qvd = -5;
    private static final byte qve = -1;
    private static final byte[] qvf = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] qvg = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] qvh = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] qvi = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] qvj = new byte[]{45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    private static final byte[] qvk = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    private static final byte[] abB(int n) {
        if ((n & 0x10) == 16) {
            return qvh;
        }
        if ((n & 0x20) == 32) {
            return qvj;
        }
        return qvf;
    }

    private static final byte[] abC(int n) {
        if ((n & 0x10) == 16) {
            return qvi;
        }
        if ((n & 0x20) == 32) {
            return qvk;
        }
        return qvg;
    }

    private lay() {
    }

    private static byte[] a(byte[] byArray, byte[] byArray2, int n, int n2) {
        lay.a(byArray2, 0, n, byArray, 0, n2);
        return byArray;
    }

    private static byte[] a(byte[] byArray, int n, int n2, byte[] byArray2, int n3, int n4) {
        byte[] byArray3 = lay.abB(n4);
        int n5 = (n2 > 0 ? byArray[n] << 24 >>> 8 : 0) | (n2 > 1 ? byArray[n + 1] << 24 >>> 16 : 0) | (n2 > 2 ? byArray[n + 2] << 24 >>> 24 : 0);
        switch (n2) {
            case 3: {
                byArray2[n3] = byArray3[n5 >>> 18];
                byArray2[n3 + 1] = byArray3[n5 >>> 12 & 0x3F];
                byArray2[n3 + 2] = byArray3[n5 >>> 6 & 0x3F];
                byArray2[n3 + 3] = byArray3[n5 & 0x3F];
                return byArray2;
            }
            case 2: {
                byArray2[n3] = byArray3[n5 >>> 18];
                byArray2[n3 + 1] = byArray3[n5 >>> 12 & 0x3F];
                byArray2[n3 + 2] = byArray3[n5 >>> 6 & 0x3F];
                byArray2[n3 + 3] = 61;
                return byArray2;
            }
            case 1: {
                byArray2[n3] = byArray3[n5 >>> 18];
                byArray2[n3 + 1] = byArray3[n5 >>> 12 & 0x3F];
                byArray2[n3 + 2] = 61;
                byArray2[n3 + 3] = 61;
                return byArray2;
            }
        }
        return byArray2;
    }

    public static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] byArray = new byte[3];
        byte[] byArray2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int n = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(byArray, 0, n);
            lay.a(byArray2, byArray, n, 0);
            byteBuffer2.put(byArray2);
        }
    }

    public static void a(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] byArray = new byte[3];
        byte[] byArray2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int n = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(byArray, 0, n);
            lay.a(byArray2, byArray, n, 0);
            for (int i = 0; i < 4; ++i) {
                charBuffer.put((char)(byArray2[i] & 0xFF));
            }
        }
    }

    public static String d(byte[] byArray) {
        String string;
        block3: {
            string = null;
            try {
                string = lay.a(byArray, 0, byArray.length, 0);
            }
            catch (IOException iOException) {
                if ($assertionsDisabled) break block3;
                throw new AssertionError((Object)iOException.getMessage());
            }
        }
        assert (string != null);
        return string;
    }

    public static String c(byte[] byArray, int n) {
        return lay.a(byArray, 0, byArray.length, n);
    }

    public static String a(byte[] byArray, int n, int n2) {
        String string;
        block3: {
            string = null;
            try {
                string = lay.a(byArray, n, n2, 0);
            }
            catch (IOException iOException) {
                if ($assertionsDisabled) break block3;
                throw new AssertionError((Object)iOException.getMessage());
            }
        }
        assert (string != null);
        return string;
    }

    public static String a(byte[] byArray, int n, int n2, int n3) {
        byte[] byArray2 = lay.b(byArray, n, n2, n3);
        try {
            return new String(byArray2, qvc);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return new String(byArray2);
        }
    }

    public static byte[] e(byte[] byArray) {
        byte[] byArray2;
        block2: {
            byArray2 = null;
            try {
                byArray2 = lay.b(byArray, 0, byArray.length, 0);
            }
            catch (IOException iOException) {
                if ($assertionsDisabled) break block2;
                throw new AssertionError((Object)("IOExceptions only come from GZipping, which is turned off: " + iOException.getMessage()));
            }
        }
        return byArray2;
    }

    public static byte[] b(byte[] byArray, int n, int n2, int n3) {
        if (byArray == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (n < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + n);
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + n2);
        }
        if (n + n2 > byArray.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", n, n2, byArray.length));
        }
        if ((n3 & 2) != 0) {
            ByteArrayOutputStream byteArrayOutputStream = null;
            DeflaterOutputStream deflaterOutputStream = null;
            b b2 = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                b2 = new b(byteArrayOutputStream, 1 | n3);
                deflaterOutputStream = new GZIPOutputStream(b2);
                ((GZIPOutputStream)deflaterOutputStream).write(byArray, n, n2);
                deflaterOutputStream.close();
            }
            catch (IOException iOException) {
                throw iOException;
            }
            finally {
                if (deflaterOutputStream != null) {
                    try {
                        deflaterOutputStream.close();
                    }
                    catch (Exception exception) {}
                }
                if (b2 != null) {
                    try {
                        b2.close();
                    }
                    catch (Exception exception) {}
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    }
                    catch (Exception exception) {}
                }
            }
            if (byteArrayOutputStream == null) {
                return null;
            }
            return byteArrayOutputStream.toByteArray();
        }
        boolean bl = (n3 & 8) != 0;
        int n4 = n2 / 3 * 4 + (n2 % 3 > 0 ? 4 : 0);
        if (bl) {
            n4 += n4 / 76;
        }
        byte[] byArray2 = new byte[n4];
        int n5 = 0;
        int n6 = 0;
        int n7 = n2 - 2;
        int n8 = 0;
        while (n5 < n7) {
            lay.a(byArray, n5 + n, 3, byArray2, n6, n3);
            if (bl && (n8 += 4) >= 76) {
                byArray2[n6 + 4] = 10;
                ++n6;
                n8 = 0;
            }
            n5 += 3;
            n6 += 4;
        }
        if (n5 < n2) {
            lay.a(byArray, n5 + n, n2 - n5, byArray2, n6, n3);
            n6 += 4;
        }
        if (n6 <= byArray2.length - 1) {
            byte[] byArray3 = new byte[n6];
            System.arraycopy(byArray2, 0, byArray3, 0, n6);
            return byArray3;
        }
        return byArray2;
    }

    private static int a(byte[] byArray, int n, byte[] byArray2, int n2, int n3) {
        if (byArray == null) {
            throw new NullPointerException("Source array was null.");
        }
        if (byArray2 == null) {
            throw new NullPointerException("Destination array was null.");
        }
        if (n < 0 || n + 3 >= byArray.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", byArray.length, n));
        }
        if (n2 < 0 || n2 + 2 >= byArray2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", byArray2.length, n2));
        }
        byte[] byArray3 = lay.abC(n3);
        if (byArray[n + 2] == 61) {
            int n4 = (byArray3[byArray[n]] & 0xFF) << 18 | (byArray3[byArray[n + 1]] & 0xFF) << 12;
            byArray2[n2] = (byte)(n4 >>> 16);
            return 1;
        }
        if (byArray[n + 3] == 61) {
            int n5 = (byArray3[byArray[n]] & 0xFF) << 18 | (byArray3[byArray[n + 1]] & 0xFF) << 12 | (byArray3[byArray[n + 2]] & 0xFF) << 6;
            byArray2[n2] = (byte)(n5 >>> 16);
            byArray2[n2 + 1] = (byte)(n5 >>> 8);
            return 2;
        }
        int n6 = (byArray3[byArray[n]] & 0xFF) << 18 | (byArray3[byArray[n + 1]] & 0xFF) << 12 | (byArray3[byArray[n + 2]] & 0xFF) << 6 | byArray3[byArray[n + 3]] & 0xFF;
        byArray2[n2] = (byte)(n6 >> 16);
        byArray2[n2 + 1] = (byte)(n6 >> 8);
        byArray2[n2 + 2] = (byte)n6;
        return 3;
    }

    public static byte[] decode(byte[] byArray) {
        byte[] byArray2 = null;
        byArray2 = lay.c(byArray, 0, byArray.length, 0);
        return byArray2;
    }

    public static byte[] c(byte[] byArray, int n, int n2, int n3) {
        if (byArray == null) {
            throw new NullPointerException("Cannot decode null source array.");
        }
        if (n < 0 || n + n2 > byArray.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", byArray.length, n, n2));
        }
        if (n2 == 0) {
            return new byte[0];
        }
        if (n2 < 4) {
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + n2);
        }
        byte[] byArray2 = lay.abC(n3);
        int n4 = n2 * 3 / 4;
        byte[] byArray3 = new byte[n4];
        int n5 = 0;
        byte[] byArray4 = new byte[4];
        int n6 = 0;
        int n7 = 0;
        byte by = 0;
        for (n7 = n; n7 < n + n2; ++n7) {
            by = byArray2[byArray[n7] & 0xFF];
            if (by >= -5) {
                if (by < -1) continue;
                byArray4[n6++] = byArray[n7];
                if (n6 <= 3) continue;
                n5 += lay.a(byArray4, 0, byArray3, n5, n3);
                n6 = 0;
                if (byArray[n7] != 61) continue;
                break;
            }
            throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", byArray[n7] & 0xFF, n7));
        }
        byte[] byArray5 = new byte[n5];
        System.arraycopy(byArray3, 0, byArray5, 0, n5);
        return byArray5;
    }

    public static byte[] decode(String string) {
        return lay.ab(string, 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] ab(String string, int n) {
        int n2;
        boolean bl;
        byte[] byArray;
        if (string == null) {
            throw new NullPointerException("Input string was null.");
        }
        try {
            byArray = string.getBytes(qvc);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            byArray = string.getBytes();
        }
        byArray = lay.c(byArray, 0, byArray.length, n);
        boolean bl2 = bl = (n & 4) != 0;
        if (byArray != null && byArray.length >= 4 && !bl && 35615 == (n2 = byArray[0] & 0xFF | byArray[1] << 8 & 0xFF00)) {
            ByteArrayInputStream byteArrayInputStream = null;
            GZIPInputStream gZIPInputStream = null;
            ByteArrayOutputStream byteArrayOutputStream = null;
            byte[] byArray2 = new byte[2048];
            int n3 = 0;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayInputStream = new ByteArrayInputStream(byArray);
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                while ((n3 = gZIPInputStream.read(byArray2)) >= 0) {
                    byteArrayOutputStream.write(byArray2, 0, n3);
                }
                byArray = byteArrayOutputStream.toByteArray();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            finally {
                try {
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                }
                catch (Exception exception) {}
                try {
                    if (gZIPInputStream != null) {
                        gZIPInputStream.close();
                    }
                }
                catch (Exception exception) {}
                try {
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                }
                catch (Exception exception) {}
            }
        }
        return byArray;
    }

    static /* synthetic */ byte[] abD(int n) {
        return lay.abC(n);
    }

    static /* synthetic */ byte[] b(byte[] byArray, int n, int n2, byte[] byArray2, int n3, int n4) {
        return lay.a(byArray, n, n2, byArray2, n3, n4);
    }

    static /* synthetic */ int b(byte[] byArray, int n, byte[] byArray2, int n2, int n3) {
        return lay.a(byArray, n, byArray2, n2, n3);
    }

    static /* synthetic */ byte[] b(byte[] byArray, byte[] byArray2, int n, int n2) {
        return lay.a(byArray, byArray2, n, n2);
    }
}

