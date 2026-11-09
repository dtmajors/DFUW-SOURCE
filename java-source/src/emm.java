/*
 * Decompiled with CFR.
 */
public class emm
extends emr {
    private ldv ade = null;
    private int ew = bbu.cRX.ordinal();
    private long itC = 0L;

    public ldv iG() {
        return this.ade;
    }

    public void ch(ldv ldv2) {
        this.ade = ldv2;
    }

    public bbu bIP() {
        return bbu.getValueByOrdinal(this.ew);
    }

    public void a(bbu bbu2) {
        this.ew = bbu2 == null ? this.ew : bbu2.ordinal();
    }

    public long bIs() {
        return this.itC;
    }

    public void aa(long l2) {
        this.itC = l2;
    }

    public boolean vA() {
        return this.bIP().vA();
    }

    emm() {
        super(13893);
    }

    public String bIk() {
        bbu bbu2 = this.bIP();
        switch (bbu2) {
            default: {
                return bbu2.YF().bD(new Object[0]).exA();
            }
            case cRZ: 
        }
        return bbu2.YF().bD(this.itC).exA();
    }
}

