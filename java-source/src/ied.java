/*
 * Decompiled with CFR.
 */
public enum ied {
    lMm,
    lMn,
    lMo,
    lMp,
    lMq,
    lMr;


    public ied cPh() {
        switch (this) {
            case lMm: {
                return lMn;
            }
            case lMn: {
                return lMm;
            }
            case lMo: {
                return lMp;
            }
            case lMp: {
                return lMo;
            }
            case lMq: {
                return lMr;
            }
            case lMr: {
                return lMq;
            }
        }
        return this;
    }

    public int cPf() {
        switch (this) {
            case lMm: 
            case lMo: 
            case lMq: {
                return 1;
            }
            case lMn: 
            case lMp: 
            case lMr: {
                return 2;
            }
        }
        return 0;
    }

    public boolean a(ied ied2) {
        return ied2 == this || ied2 == this.cPh();
    }

    public static ied getValueByOrdinal(int n) {
        return n < 0 || n >= ied.values().length ? null : ied.values()[n];
    }
}

