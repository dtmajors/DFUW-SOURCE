/*
 * Decompiled with CFR.
 */
public enum iec {
    lMb,
    lMc,
    lMd,
    lMe,
    lMf,
    lMg,
    lMh,
    lMi,
    lMj,
    lMk;


    public iec cPg() {
        switch (this) {
            case lMb: {
                return lMc;
            }
            case lMc: {
                return lMb;
            }
            case lMd: {
                return lMe;
            }
            case lMe: {
                return lMd;
            }
            case lMf: {
                return lMg;
            }
            case lMg: {
                return lMf;
            }
            case lMh: {
                return lMi;
            }
            case lMi: {
                return lMh;
            }
            case lMj: {
                return lMk;
            }
            case lMk: {
                return lMj;
            }
        }
        return this;
    }

    public int cPf() {
        switch (this) {
            case lMb: 
            case lMd: 
            case lMf: 
            case lMh: 
            case lMj: {
                return 1;
            }
            case lMc: 
            case lMe: 
            case lMg: 
            case lMi: 
            case lMk: {
                return 2;
            }
        }
        return 0;
    }

    public boolean a(iec iec2) {
        return iec2 == this || iec2 == this.cPg();
    }

    public boolean a(htw.a a2) {
        switch (this) {
            case lMh: 
            case lMi: {
                return a2 == htw.a.lds;
            }
            case lMf: 
            case lMg: {
                return a2 == htw.a.ldt;
            }
            case lMj: 
            case lMk: {
                return a2 == htw.a.ldq;
            }
            case lMd: 
            case lMe: {
                return a2 == htw.a.ldu;
            }
        }
        return false;
    }

    public static iec getValueByOrdinal(int n) {
        return n < 0 || n >= iec.values().length ? null : iec.values()[n];
    }
}

