/*
 * Decompiled with CFR.
 */
public class ekx
extends emr {
    private int ew = ayh.cxE.ordinal();
    private long itC = 0L;

    public ayh bIr() {
        return ayh.getValueByOrdinal(this.ew);
    }

    public void a(ayh ayh2) {
        this.ew = ayh2 == null ? this.ew : ayh2.ordinal();
    }

    public long bIs() {
        return this.itC;
    }

    public void aa(long l) {
        this.itC = l;
    }

    ekx() {
        super(13889);
    }

    public loz bIt() {
        ayh ayh2 = this.bIr();
        switch (ayh2) {
            case cxI: {
                return ayh2.YF().bD(0);
            }
            case cxJ: {
                return ayh2.YF().bD(100);
            }
            case cxK: {
                return ayh2.YF().bD(0);
            }
            case cxL: {
                return ayh2.YF().bD(200);
            }
            case cxQ: {
                return ayh2.YF().bD(this.itC);
            }
            case cxS: {
                return ayh2.YF().bD(new Object[0]);
            }
        }
        return ayh2.YF().bD(new Object[0]);
    }
}

