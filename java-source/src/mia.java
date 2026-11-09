/*
 * Decompiled with CFR.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mia {
    private int Dxw = -1;
    private float[][] Dxx = new float[1024][];

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static mia BV(String string) {
        mia mia2 = new mia();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(string));
            try {
                String string2 = bufferedReader.readLine();
                assert (string2.length() > 0);
                int n = Integer.parseInt(string2);
                mia2.aeq(n);
                for (int i = 0; i < 1024; ++i) {
                    string2 = bufferedReader.readLine();
                    assert (string2.length() > 0);
                    int n2 = Integer.parseInt(string2);
                    assert (n2 == 0 || n2 == n * n);
                    if (n2 <= 0) continue;
                    float[] fArray = new float[n2];
                    for (int j = 0; j < n2; ++j) {
                        string2 = bufferedReader.readLine();
                        assert (string2.length() > 0);
                        fArray[j] = Float.parseFloat(string2);
                    }
                    mia2.a(i, fArray);
                }
            }
            finally {
                bufferedReader.close();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
        return mia2;
    }

    public void aeq(int n) {
        this.Dxw = n;
    }

    public void a(int n, float[] fArray) {
        this.Dxx[n] = fArray;
    }

    public float au(float f, float f2) {
        lej lej2 = this.av(f, f2);
        int n = this.gk(lej2.getX(), lej2.getY());
        if (this.Dxx[n] == null) {
            return 215.0f;
        }
        ljq ljq2 = this.gl(lej2.getX(), lej2.getY());
        float f3 = (f - ljq2.x) / 1024.0f;
        float f4 = (f2 - ljq2.rlV) / 1024.0f;
        assert (this.Dxw > 0);
        int n2 = (int)((float)this.Dxw * f3);
        int n3 = (int)((float)this.Dxw * f4);
        return this.Dxx[n][n2 * this.Dxw + n3];
    }

    private lej av(float f, float f2) {
        int n = (int)((f + 16384.0f) / 1024.0f);
        int n2 = (int)((f2 + 16384.0f) / 1024.0f);
        assert (f >= -16384.0f && f < 16384.0f);
        assert (f2 >= -16384.0f && f2 < 16384.0f);
        assert (n >= 0 && n <= 31);
        assert (n2 >= 0 && n2 <= 31);
        return new lej(n, n2);
    }

    private int gk(int n, int n2) {
        return 32 * n + (31 - n2);
    }

    private ljq gl(int n, int n2) {
        assert (n >= 0 && n <= 31);
        float f = (float)(n - 16) * 1024.0f;
        assert (n2 >= 0 && n2 <= 31);
        float f2 = (float)(n2 - 16) * 1024.0f;
        return new ljq(f, 0.0f, f2);
    }
}

