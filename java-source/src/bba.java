/*
 * Decompiled with CFR.
 */
public enum bba {
    cPu,
    cPv,
    cPw,
    cPx,
    cPy,
    cPz,
    cPA,
    cPB,
    cPC,
    cPD,
    cPE,
    cPF,
    cPG,
    cPH,
    cPI,
    cPJ,
    cPK,
    cPL;


    public boolean ajp() {
        switch (this) {
            case cPx: 
            case cPz: 
            case cPF: 
            case cPG: 
            case cPK: 
            case cPL: {
                return true;
            }
        }
        return false;
    }

    public boolean ajq() {
        switch (this) {
            case cPx: 
            case cPz: 
            case cPF: 
            case cPG: 
            case cPK: 
            case cPL: 
            case cPv: 
            case cPw: 
            case cPA: 
            case cPB: 
            case cPC: 
            case cPD: 
            case cPE: 
            case cPI: 
            case cPJ: {
                return true;
            }
        }
        return false;
    }

    public boolean ajr() {
        switch (this) {
            case cPx: 
            case cPz: 
            case cPF: 
            case cPG: 
            case cPK: 
            case cPL: 
            case cPv: 
            case cPw: 
            case cPA: 
            case cPB: 
            case cPC: 
            case cPD: 
            case cPE: 
            case cPI: 
            case cPJ: 
            case cPy: 
            case cPH: {
                return true;
            }
        }
        return false;
    }

    public static bba getValueByOrdinal(int n) {
        return n < 0 || n >= bba.values().length ? cPu : bba.values()[n];
    }
}

