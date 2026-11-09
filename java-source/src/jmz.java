/*
 * Decompiled with CFR.
 */
public abstract class jmz {
    private jnd nCX = null;
    private double nCY = 0.0;
    private long nCZ = 0L;

    public jnd dMQ() {
        return this.nCX;
    }

    public double dMR() {
        return this.nCY;
    }

    public long dMS() {
        return this.nCZ;
    }

    protected jmz(jnd jnd2, double d2, long l) {
        this.nCX = jnd2;
        this.nCY = d2;
        this.nCZ = l;
    }

    public static jmz a(double d2, long l, loz loz2, jns jns2) {
        return jnb.b(d2, l, loz2, jns2);
    }

    public static jmz a(double d2, long l, egz egz2) {
        switch (aud.a.getValue(egz2.ipK)) {
            case cas: {
                return jne.d(d2, l, egz2);
            }
            case cat: 
            case caC: 
            case caD: 
            case caH: 
            case caE: 
            case cau: {
                return jna.b(d2, l, egz2);
            }
        }
        return jnc.c(d2, l, egz2);
    }
}

