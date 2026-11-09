/*
 * Decompiled with CFR.
 */
public class kcy
extends kcz {
    public int hB;
    public int SN;
    public ljq jjc;
    private int aXP;
    private int peu;
    public String pev;
    public String aFo;

    kcy() {
        super(278);
    }

    public b dVn() {
        return b.pfs[this.aXP];
    }

    public void a(b b2) {
        this.aXP = b2.ordinal();
    }

    public a dVo() {
        return a.pfj[this.peu];
    }

    public void a(a a2) {
        this.peu = a2.ordinal();
        switch (a2) {
            case pex: {
                break;
            }
            case pey: 
            case pez: {
                assert (this.dVn() == b.pfm);
                break;
            }
            case peA: 
            case peB: 
            case peC: 
            case peD: 
            case peE: 
            case peF: 
            case peG: 
            case peH: 
            case peI: 
            case peJ: {
                assert (this.dVn() == b.pfp);
                break;
            }
        }
    }
}

