/*
 * Decompiled with CFR.
 */
import java.io.InputStream;
import java.io.OutputStream;

public class jsf {
    public static final int nVa = 1;
    public static final int nVb = 2;
    public static final int NETWORK = 3;
    public static final int nVc = 4;
    public static final int nVd = 5;
    private jsd nVe = null;
    private jsg nVf = null;
    private jsc nVg = null;
    private jsh nVh = null;
    private jsj nVi = null;

    public jsf() {
        try {
            this.dSc();
        }
        catch (br br2) {
            System.out.println("SFResourceException: " + br2);
        }
    }

    void dSc() {
        this.nVe = new jsd();
        this.nVf = new jsg();
        this.nVg = new jsc();
        this.nVh = new jsh();
        this.nVi = new jsj();
    }

    Object Wd(int n) {
        return null;
    }

    InputStream R(String string, int n) {
        switch (n) {
            case 1: {
                return this.nVi.tC(string);
            }
            case 2: {
                return this.nVe.tC(string);
            }
            case 3: {
                return this.nVh.tC(string);
            }
        }
        return null;
    }

    OutputStream S(String string, int n) {
        return null;
    }

    void nh() {
        this.nVh.nh();
    }
}

