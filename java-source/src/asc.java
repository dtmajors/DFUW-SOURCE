/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class asc {
    private int bTl;
    private int bTm;
    private short[] bTn;
    private final String bTo;
    private float bTp;
    private int bTq;
    private int bTr;
    private float bTs;
    private boolean bTt;
    private float bTu;
    private float bTv;
    private float bTw;

    public asc(String string) {
        this.bTo = string.toLowerCase() + "_hmp";
        this.Tc();
    }

    public float k(float f2, float f3) {
        return this.R(this.bQ(f2), this.bR(f3));
    }

    public float R(int n, int n2) {
        if (n < 0 || n2 < 0 || n >= this.bTq || n2 >= this.bTq) {
            return -3.4028235E38f;
        }
        short s = this.bTn[this.bTq * n2 + n];
        if (s == Short.MIN_VALUE) {
            return -3.4028235E38f;
        }
        return ((float)s + 32767.0f) * (this.bTw / 65534.0f) + this.bTu;
    }

    public float e(ljp ljp2) {
        return this.k(ljp2.x, ljp2.y);
    }

    public float aC(ljq ljq2) {
        return this.k(ljq2.x, ljq2.rlV);
    }

    public float l(float f2, float f3) {
        float f4 = (f2 - (float)this.bTl) / this.bTp;
        float f5 = (f3 - (float)this.bTm) / this.bTp;
        int n = Math.round((float)Math.floor(f4));
        int n2 = Math.round((float)Math.floor(f5));
        int n3 = Math.round((float)Math.ceil(f4));
        int n4 = Math.round((float)Math.ceil(f5));
        int n5 = Math.round((float)Math.ceil(f4));
        int n6 = Math.round((float)Math.floor(f5));
        int n7 = Math.round((float)Math.floor(f4));
        int n8 = Math.round((float)Math.ceil(f5));
        float f6 = this.R(n, n2);
        float f7 = this.R(n3, n4);
        float f8 = this.R(n5, n6);
        float f9 = this.R(n7, n8);
        if (f6 == -3.4028235E38f || f7 == -3.4028235E38f || f8 == -3.4028235E38f || f9 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        float f10 = f4 - (float)Math.floor(f4);
        float f11 = f5 - (float)Math.floor(f5);
        return (f6 *= (1.0f - f10) * (1.0f - f11)) + (f7 *= f10 * f11) + (f8 *= f10 * (1.0f - f11)) + (f9 *= (1.0f - f10) * f11);
    }

    public float f(ljp ljp2) {
        return this.l(ljp2.x, ljp2.y);
    }

    public float aD(ljq ljq2) {
        return this.l(ljq2.x, ljq2.rlV);
    }

    public int SU() {
        return this.bTl;
    }

    public int SV() {
        return this.bTm;
    }

    public short[] SW() {
        return this.bTn;
    }

    public String SX() {
        return this.bTo;
    }

    public float SY() {
        return this.bTp;
    }

    public int SZ() {
        return this.bTr;
    }

    public float u(ljq ljq2, float f2) {
        int n = this.bQ(ljq2.x - f2);
        int n2 = this.bR(ljq2.rlV - f2);
        int n3 = this.bQ(ljq2.x + f2);
        int n4 = this.bR(ljq2.rlV + f2);
        float f3 = -3.4028235E38f;
        for (int i = n2; i <= n4; ++i) {
            for (int j = n; j <= n3; ++j) {
                float f4 = this.R(j, i);
                if (!(f4 > f3)) continue;
                f3 = f4;
            }
        }
        return f3;
    }

    public float f(ljq ljq2, ljq ljq3) {
        int n = this.bQ(ljq2.x);
        int n2 = this.bR(ljq2.rlV);
        int n3 = this.bQ(ljq3.x);
        int n4 = this.bR(ljq3.rlV);
        float f2 = -3.4028235E38f;
        int n5 = n3 - n;
        int n6 = n4 - n2;
        int n7 = Math.abs(n5) < Math.abs(n6) ? Math.abs(n6) + 1 : Math.abs(n5) + 1;
        for (int i = 0; i < n7; ++i) {
            int n8 = n + i * n5 / n7;
            int n9 = n2 + i * n6 / n7;
            float f3 = this.R(n8, n9);
            if (!(f3 > f2)) continue;
            f2 = f3;
        }
        return f2;
    }

    public float Ta() {
        return this.bTs;
    }

    public boolean isLoaded() {
        return this.bTt;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Deprecated
    private void Tb() {
        FileInputStream fileInputStream = null;
        FilterInputStream filterInputStream = null;
        try {
            fileInputStream = new FileInputStream(lcw.qLb + "pathgraphs/" + this.bTo);
            filterInputStream = new DataInputStream(fileInputStream);
            this.bTl = ((DataInputStream)filterInputStream).readInt();
            this.bTm = ((DataInputStream)filterInputStream).readInt();
            this.bTr = ((DataInputStream)filterInputStream).readInt();
            this.bTq = ((DataInputStream)filterInputStream).readInt();
            this.bTp = Float.intBitsToFloat(((DataInputStream)filterInputStream).readInt());
            this.bTs = Float.intBitsToFloat(((DataInputStream)filterInputStream).readInt());
            this.bTn = new short[this.bTr];
            for (int i = 0; i < this.bTr; ++i) {
                this.bTn[i] = ((DataInputStream)filterInputStream).readShort();
            }
            this.bTt = true;
        }
        catch (EOFException eOFException) {
            arw.ct.error("Data corruption in HeightMap file " + this.bTo);
        }
        catch (FileNotFoundException fileNotFoundException) {
            arw.ct.error("HeightMap file " + this.bTo + " does not exists.");
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        finally {
            if (filterInputStream != null) {
                try {
                    filterInputStream.close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void Tc() {
        FileInputStream fileInputStream = null;
        try {
            int n = 32;
            fileInputStream = new FileInputStream(lcw.qLb + "pathgraphs/" + this.bTo);
            FileChannel fileChannel = fileInputStream.getChannel();
            MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannel.size());
            byte[] byArray = new byte[n];
            mappedByteBuffer.get(byArray, 0, n);
            this.bTl = this.a(byArray, 0);
            this.bTm = this.a(byArray, 4);
            this.bTr = this.a(byArray, 8);
            this.bTq = this.a(byArray, 12);
            this.bTp = Float.intBitsToFloat(this.a(byArray, 16));
            this.bTs = Float.intBitsToFloat(this.a(byArray, 20));
            this.bTu = Float.intBitsToFloat(this.a(byArray, 24));
            this.bTv = Float.intBitsToFloat(this.a(byArray, 28));
            n = this.bTr * 2;
            if (mappedByteBuffer.remaining() < n) {
                throw new EOFException("Data corruption in HeightMap file " + this.bTo);
            }
            byArray = new byte[n];
            mappedByteBuffer.get(byArray, 0, n);
            int n2 = 0;
            this.bTw = this.bTv - this.bTu;
            this.bTn = new short[this.bTr];
            for (int i = 0; i < byArray.length; i += 2) {
                this.bTn[n2++] = asc.b(byArray, i);
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                    this.bTt = true;
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
    }

    private int a(byte[] byArray, int n) {
        int n2 = 0;
        for (int i = 0; i < 4; ++i) {
            int n3 = (3 - i) * 8;
            n2 += (byArray[i + n] & 0xFF) << n3;
        }
        return n2;
    }

    private static short b(byte[] byArray, int n) {
        short s = 0;
        for (int i = 0; i < 2; ++i) {
            int n2 = (1 - i) * 8;
            s = (short)(s + ((byArray[i + n] & 0xFF) << n2));
        }
        return s;
    }

    private int bQ(float f2) {
        return Math.round((f2 - (float)this.bTl) / this.bTp);
    }

    private int bR(float f2) {
        return Math.round((f2 - (float)this.bTm) / this.bTp);
    }
}

