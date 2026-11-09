/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public class lkb {
    public String nBN = "default";
    public int Type = 0;
    public ArrayList<String> rqa = lcn.emv();
    public ArrayList<dfc> rqb = lcn.emv();

    public Object clone() {
        lkb lkb2 = new lkb();
        lkb2.nBN = this.nBN;
        lkb2.Type = this.Type;
        lkb2.rqa.addAll(this.rqa);
        for (dfc dfc2 : this.rqb) {
            lkb2.rqb.add((dfc)dfc2.clone());
        }
        return lkb2;
    }
}

