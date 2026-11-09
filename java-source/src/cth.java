/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class cth {
    public String ResourceName;
    public int aFg;
    public double ffO;
    public int asi;
    public int dpS;
    public int dpT;
    public double ffP;
    public ej[] DR;
    public ctd[] ffQ;
    public Set<String> ffR;
    long ffS;
    long aFi;

    public final cto bbz() {
        cto cto2 = new cto();
        cto2.ResourceType = lea.enW().getType(this.ResourceName);
        cto2.asi = this.asi;
        cto2.dpS = this.dpS;
        cto2.dpT = this.dpT;
        cto2.Probability = (float)this.ffP;
        cto2.DR = this.DR;
        cto2.ffQ = this.ffQ;
        cto2.fgf = null;
        cto2.fez = true;
        return cto2;
    }
}

