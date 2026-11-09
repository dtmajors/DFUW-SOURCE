/*
 * Decompiled with CFR.
 */
public class bcj {
    public int cWh = bcu.cXF.ordinal();
    public double ps = -1.0;

    public bcj() {
    }

    public bcj(bci bci2) {
        this.cWh = bci2.cWg.ordinal();
        this.ps = bci2.ps;
    }

    public bci ald() {
        bci bci2 = new bci();
        bci2.cWg = bcu.getValueByOrdinal(this.cWh);
        bci2.ps = this.ps;
        return bci2;
    }
}

