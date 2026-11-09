/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class eun
extends euk {
    private int ew = bat.cOo.ordinal();
    private double hsq = 0.0;
    private int iCY = 0;

    public bat bMk() {
        return bat.getValueByOrdinal(this.ew);
    }

    public void a(bat bat2) {
        this.ew = bat2 == null ? this.ew : bat2.ordinal();
    }

    public double bHG() {
        return this.hsq;
    }

    public void ce(double d2) {
        this.hsq = d2;
    }

    public int bMl() {
        return this.iCY;
    }

    public void Fm(int n) {
        this.iCY = n;
    }

    eun() {
        super(20028);
    }

    public String bIk() {
        if (!lcw.ena() && !lcw.enb()) {
            return this.bMk().name();
        }
        bat bat2 = this.bMk();
        switch (bat2) {
            default: {
                return bat2.aiS().bD(new Object[0]).exA();
            }
            case cOI: 
            case cOJ: 
            case cOK: {
                return bat2.aiS().bD(this.iCY).exA();
            }
            case cOB: 
            case cOv: 
            case cOu: 
        }
        return bat2.aiS().bD(this.hsq).exA();
    }
}

