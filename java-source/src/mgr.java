/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public abstract class mgr<T extends mgs> {
    private static final int DvW = 10000;
    protected static final lgs DvX = new lgs(0, 0, (int)((float)(lcw.qGC.rmN + 2) * lcw.qGD.x), (int)((float)(lcw.qGC.H + 2) * lcw.qGD.rlV));
    protected lgs DvY = null;
    protected T DvZ = null;

    public boolean hasData() {
        return !((mgs)this.DvZ).isLeaf() || ((mgs)this.DvZ).hasData();
    }

    protected mgr() {
        this.DvY = DvX;
    }

    protected mgr(lgs lgs2) {
        this.DvY = lgs2;
    }

    protected void oF() {
    }

    public abstract void oG();

    protected static float oh(float f) {
        return f + Math.abs(lcw.fyl.x) - (float)(lcw.qGC.cf - 1) * lcw.qGD.x;
    }

    protected static float oi(float f) {
        return (float)lcw.fyk.H * lcw.qGD.rlV - (f + Math.abs(lcw.fyl.rlV)) - (float)(lcw.qGC.cg - 1) * lcw.qGD.rlV;
    }

    protected static float oj(float f) {
        return f + (float)(lcw.qGC.cf - 1) * lcw.qGD.x - Math.abs(lcw.fyl.x);
    }

    protected static float ok(float f) {
        return -(f + (float)(lcw.qGC.cg - 1) * lcw.qGD.rlV - Math.abs(lcw.fyl.rlV));
    }

    public byte[] eyQ() {
        StringBuilder stringBuilder = new StringBuilder(10000);
        ((mgs)this.DvZ).a(stringBuilder);
        return mgr.BR(stringBuilder.toString());
    }

    public String eyR() {
        StringBuilder stringBuilder = new StringBuilder(10000);
        ((mgs)this.DvZ).a(stringBuilder);
        return stringBuilder.toString();
    }

    public void g(byte[] byArray) {
        ((mgs)this.DvZ).parse(mgr.h(byArray));
        this.oF();
    }

    public void BO(String string) {
        ((mgs)this.DvZ).parse(string);
        this.oF();
    }

    public void BP(String string) {
        ((mgs)this.DvZ).parse(jsb.ty(string));
        this.oF();
    }

    public void BQ(String string) {
        ((mgs)this.DvZ).parse(jsb.tz(string));
        this.oF();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static byte[] BR(String string) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        GZIPOutputStream gZIPOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(string.getBytes());
            gZIPOutputStream.close();
            byte[] byArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            gZIPOutputStream = null;
            byteArrayOutputStream = null;
            byte[] byArray2 = byArray;
            return byArray2;
        }
        catch (IOException iOException) {
            lfn.b(5, mgr.class.getSimpleName(), "compressPersistenceString() : Compression Failed!!!... Exception Message = " + iOException.getMessage());
            byte[] byArray = string.getBytes();
            return byArray;
        }
        finally {
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                }
                catch (IOException iOException) {}
                byteArrayOutputStream = null;
            }
            if (gZIPOutputStream != null) {
                try {
                    gZIPOutputStream.close();
                }
                catch (IOException iOException) {}
                gZIPOutputStream = null;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static String h(byte[] byArray) {
        ByteArrayInputStream byteArrayInputStream = null;
        GZIPInputStream gZIPInputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(byArray);
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            byteArrayOutputStream = new ByteArrayOutputStream();
            while (gZIPInputStream.available() > 0) {
                byteArrayOutputStream.write(gZIPInputStream.read());
            }
            String string = new String(byteArrayOutputStream.toByteArray());
            gZIPInputStream.close();
            byteArrayInputStream.close();
            byteArrayOutputStream.close();
            gZIPInputStream = null;
            byteArrayInputStream = null;
            byteArrayOutputStream = null;
            String string2 = string;
            return string2;
        }
        catch (IOException iOException) {
            lfn.b(5, mgr.class.getSimpleName(), "decompressPersistenceString() : Decompression Failed!!!... Exception Message = " + iOException.getMessage());
            String string = new String(byArray);
            return string;
        }
        finally {
            if (byteArrayInputStream != null) {
                try {
                    byteArrayInputStream.close();
                }
                catch (IOException iOException) {}
                byteArrayInputStream = null;
            }
            if (gZIPInputStream != null) {
                try {
                    gZIPInputStream.close();
                }
                catch (IOException iOException) {}
                gZIPInputStream = null;
            }
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                }
                catch (IOException iOException) {}
                byteArrayOutputStream = null;
            }
        }
    }
}

