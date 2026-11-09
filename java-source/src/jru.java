/*
 * Decompiled with CFR.
 */
import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.MemoryImageSource;
import java.io.InputStream;

public class jru {
    int width;
    int height;
    short bitsPerPixel;
    int nUM;
    byte[] nUN;
    byte[] nUO;
    byte[] b;
    int nUP;
    byte[] nUQ;

    public void read(InputStream inputStream) {
        long l;
        int n = 0;
        int n2 = this.a(inputStream);
        this.readInt(inputStream);
        this.a(inputStream);
        this.a(inputStream);
        int n3 = this.readInt(inputStream);
        n += 20;
        if (n2 != 19778) {
            throw new Exception("Not a BMP file");
        }
        this.readInt(inputStream);
        this.width = this.readInt(inputStream);
        this.height = this.readInt(inputStream);
        this.a(inputStream);
        this.bitsPerPixel = this.a(inputStream);
        int n4 = this.readInt(inputStream);
        int n5 = this.readInt(inputStream);
        this.readInt(inputStream);
        this.readInt(inputStream);
        int n6 = this.readInt(inputStream);
        this.readInt(inputStream);
        n += 44;
        switch (this.bitsPerPixel) {
            case 1: 
            case 4: 
            case 8: 
            case 24: {
                break;
            }
            default: {
                throw new Exception("Unsupported bits-per-pixel value");
            }
        }
        if (n4 != 0) {
            throw new Exception("Compression not supported");
        }
        this.nUM = (this.width * this.bitsPerPixel + 31) / 32 * 4;
        int n7 = n5 != 0 ? n5 : this.nUM * this.height;
        n2 = n6 != 0 ? n6 : (this.bitsPerPixel < 16 ? 1 << this.bitsPerPixel : 0);
        this.nUP = n2;
        if (this.nUP > 0) {
            this.nUN = new byte[this.nUP];
            this.nUO = new byte[this.nUP];
            this.b = new byte[this.nUP];
            for (n4 = 0; n4 < this.nUP; ++n4) {
                this.b[n4] = (byte)inputStream.read();
                this.nUO[n4] = (byte)inputStream.read();
                this.nUN[n4] = (byte)inputStream.read();
                inputStream.read();
                n += 4;
            }
        }
        if ((l = (long)(n3 - n)) > 0L) {
            inputStream.skip(l);
            n = (int)((long)n + l);
        }
        this.nUQ = new byte[n7];
        int n8 = inputStream.read(this.nUQ, 0, n7);
        if (n8 < n7) {
            throw new Exception("short read: " + n8 + " out of " + n7 + " bytes");
        }
    }

    public MemoryImageSource dRP() {
        ColorModel colorModel = this.nUP > 0 ? new IndexColorModel((int)this.bitsPerPixel, this.nUP, this.nUN, this.nUO, this.b) : ColorModel.getRGBdefault();
        if (this.bitsPerPixel > 8) {
            int[] nArray = new int[this.width * this.height];
            int n = 0;
            int n2 = (this.height - 1) * this.width;
            for (int i = this.height - 1; i >= 0; --i) {
                this.a(n, nArray, n2, this.width);
                n += this.nUM;
                n2 -= this.width;
            }
            return new MemoryImageSource(this.width, this.height, colorModel, nArray, 0, this.width);
        }
        byte[] byArray = new byte[this.width * this.height];
        int n = 0;
        int n3 = (this.height - 1) * this.width;
        for (int i = this.height - 1; i >= 0; --i) {
            this.a(n, this.bitsPerPixel, byArray, n3, this.width);
            n += this.nUM;
            n3 -= this.width;
        }
        return new MemoryImageSource(this.width, this.height, colorModel, byArray, 0, this.width);
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int dRQ() {
        return this.bitsPerPixel;
    }

    public byte[] dRR() {
        return this.nUQ;
    }

    public lcf dRS() {
        return new lcf(this.width, this.height, this.nUQ);
    }

    private int readInt(InputStream inputStream) {
        int n = inputStream.read();
        int n2 = inputStream.read();
        int n3 = inputStream.read();
        int n4 = inputStream.read();
        return (n4 << 24) + (n3 << 16) + (n2 << 8) + (n << 0);
    }

    private short a(InputStream inputStream) {
        int n = inputStream.read();
        int n2 = inputStream.read();
        return (short)((n2 << 8) + n);
    }

    private void a(int n, int[] nArray, int n2, int n3) {
        int n4 = n2;
        int n5 = n;
        int n6 = 255;
        for (int i = 0; i < n3; ++i) {
            int n7 = this.nUQ[n5++] & n6;
            int n8 = (this.nUQ[n5++] & n6) << 8;
            int n9 = (this.nUQ[n5++] & n6) << 16;
            nArray[n4] = 0xFF000000 | n7 | n8 | n9;
            ++n4;
        }
    }

    private void a(int n, int n2, byte[] byArray, int n3, int n4) {
        int n5 = n3;
        int n6 = n;
        int n7 = 0;
        int n8 = 0;
        switch (n2) {
            case 1: {
                n7 = 1;
                n8 = 8;
                break;
            }
            case 4: {
                n7 = 15;
                n8 = 2;
                break;
            }
            case 8: {
                n7 = -1;
                n8 = 1;
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        int n9 = 0;
        while (true) {
            int n10 = 8 - n2;
            for (int i = 0; i < n8; ++i) {
                byte by = this.nUQ[n6];
                by = (byte)(by >> n10);
                byArray[n5] = (byte)(by & n7);
                ++n5;
                if (++n9 == n4) {
                    return;
                }
                n10 -= n2;
            }
            ++n6;
        }
    }
}

