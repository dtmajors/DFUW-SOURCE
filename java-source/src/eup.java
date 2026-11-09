/*
 * Decompiled with CFR.
 */
public class eup
extends euk
implements dxu {
    private int aqs = -1;
    private int iCZ = -1;
    private boolean iDa = false;
    private double iDb = 0.0;
    private int iCY = 0;

    eup() {
        super(19970);
    }

    public bat bMm() {
        return bat.getValueByOrdinal(this.iCZ);
    }

    public void b(bat bat2) {
        this.iCZ = bat2 == null ? this.iCZ : bat2.ordinal();
    }

    public boolean bMn() {
        return this.iDa;
    }

    public void kM(boolean bl) {
        this.iDa = bl;
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public double bMo() {
        return this.iDb;
    }

    public void cq(double d2) {
        this.iDb = d2;
    }

    public final int bMl() {
        return this.iCY;
    }

    public final void Fm(int n) {
        this.iCY = n;
    }

    public loz bMp() {
        bat bat2 = this.bMm();
        switch (bat2) {
            case cOu: 
            case cOv: 
            case cOB: {
                return bat2.aiS().bD(this.iDb);
            }
            case cOI: 
            case cOJ: {
                return bat2.aiS().bD(this.iCY);
            }
            case cOK: {
                return bat2.aiS().bD(this.iCY);
            }
        }
        return bat2.aiS().bD(new Object[0]);
    }
}

