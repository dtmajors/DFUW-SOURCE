/*
 * Decompiled with CFR.
 */
public class eni
extends emr {
    private int ew = bco.cWG.ordinal();
    private ldv ivC = null;
    private String ivD = null;
    private int ivE = 0;
    private int ivF = 0;
    private int ivG = 0;

    public bco bJr() {
        return bco.getValueByOrdinal(this.ew);
    }

    public void a(bco bco2) {
        this.ew = bco2 == null ? this.ew : bco2.ordinal();
    }

    public ldv bJs() {
        return this.ivC;
    }

    public void pa(ldv ldv2) {
        this.ivC = ldv2;
    }

    public String bJt() {
        return this.ivD;
    }

    public void kg(String string) {
        this.ivD = string;
    }

    public int bJu() {
        return this.ivE;
    }

    public void Eu(int n) {
        this.ivE = n;
    }

    public int bJv() {
        return this.ivF;
    }

    public void Ev(int n) {
        this.ivF = n;
    }

    public int bJw() {
        return this.ivG;
    }

    public void Ew(int n) {
        this.ivG = n;
    }

    eni() {
        super(13907);
    }

    public String kh(String string) {
        bco bco2 = this.bJr();
        switch (bco2) {
            case cWM: 
            case cWN: {
                return bco2.YF().bD(this.ivE, this.ivF, this.ivG).exA();
            }
            case cWX: 
            case cWR: 
            case cWS: 
            case cWT: 
            case cWO: 
            case cWP: 
            case cWQ: 
            case cWW: 
            case cWU: 
            case cWV: {
                return bco2.YF().bD(this.ivD == null ? string : this.ivD).exA();
            }
        }
        return bco2.YF().bD(new Object[0]).exA();
    }
}

