/*
 * Decompiled with CFR.
 */
public class efh
extends eea
implements dxu {
    public static final int iou = 0;
    public static final int iov = 1;
    public static final int iow = 2;
    public static final int iox = 3;
    public static final int ioy = 4;
    public static final int eOD = 5;
    public static final int OFFLINE = 6;
    public static final int ioz = 7;
    public static final int ioA = 8;
    public static final int ioB = 9;
    public static final int ioC = 10;
    public static final int ioD = 11;
    public static final int ioE = 12;
    public static final int ioF = 13;
    private int aqs = -1;
    private int ew = -1;

    efh() {
        super(12837);
    }

    @Override
    public void sk(int n2) {
        this.aqs = n2;
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    public final int getResult() {
        return this.ew;
    }

    public final void DR(int n2) {
        this.ew = n2;
    }
}

