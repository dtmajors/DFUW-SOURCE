/*
 * Decompiled with CFR.
 */
public class enm
extends emr {
    private int ew = bcs.cXk.ordinal();
    private bcq ivJ = null;
    private long itC = 0L;
    private String aET = null;

    public bcs bJB() {
        return bcs.getValueByOrdinal(this.ew);
    }

    public void a(bcs bcs2) {
        this.ew = bcs2 == null ? this.ew : bcs2.ordinal();
    }

    public bcq bJC() {
        return this.ivJ;
    }

    public void h(bcq bcq2) {
        this.ivJ = bcq2;
    }

    public long bIs() {
        return this.itC;
    }

    public void aa(long l2) {
        this.itC = l2;
    }

    public boolean vA() {
        return this.bJB().vA();
    }

    public String alE() {
        return this.aET;
    }

    public void ki(String string) {
        this.aET = string;
    }

    enm() {
        super(13897);
    }

    public String bIk() {
        bcs bcs2 = this.bJB();
        switch (bcs2) {
            default: {
                return bcs2.YF().bD(new Object[0]).exA();
            }
            case cXq: {
                return bcs2.YF().bD(this.itC).exA();
            }
            case cXp: {
                return bcs2.YF().bD(this.aET, this.itC).exA();
            }
            case cXs: {
                return bcs2.YF().bD(new Object[]{this.bJC().ali()}).exA();
            }
            case cXt: 
        }
        return bcs2.YF().bD(new Object[]{this.aET, this.bJC().ali()}).exA();
    }
}

