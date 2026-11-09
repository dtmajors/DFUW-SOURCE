/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.List;

public class hrb
extends hqz {
    private hdm dXw = null;
    private hnt.a kUc = null;
    private hnt.a ktN = null;
    private lhu dMU = null;
    private hnt kUd = null;
    private List<hnt> euM = null;

    public String cuJ() {
        return this.kUd == null ? null : this.kUd.aFo;
    }

    public void mZ(String string) {
        if (string == null) {
            this.kUd = null;
            return;
        }
        if (this.kUd == null) {
            return;
        }
        this.kUd = new hnt(this.kUc, string);
    }

    public void a(String string, hnt.a a2) {
        if (string == null || a2 == null) {
            this.kUd = null;
            return;
        }
        this.kUc = a2;
        this.kUd = new hnt(this.kUc, string);
    }

    public lhu cuK() {
        return this.dMU;
    }

    public void c(lhu lhu2) {
        this.dMU = lhu2;
    }

    public String[] cuL() {
        String[] stringArray = new String[this.euM.size()];
        int n = 0;
        for (hnt hnt2 : this.euM) {
            stringArray[n++] = hnt2.aFo;
        }
        return stringArray;
    }

    public void na(String string) {
        this.euM.clear();
        if (string == null) {
            return;
        }
        this.euM.add(new hnt(this.ktN, string));
    }

    public void b(String string, hnt.a a2) {
        if (a2 == null) {
            return;
        }
        this.ktN = a2;
        this.na(string);
    }

    public void I(String[] stringArray) {
        this.euM.clear();
        if (stringArray == null) {
            return;
        }
        for (String string : stringArray) {
            this.euM.add(new hnt(this.ktN, string));
        }
    }

    public void a(String[] stringArray, hnt.a a2) {
        if (a2 == null) {
            return;
        }
        this.ktN = a2;
        this.I(stringArray);
    }

    public void nb(String string) {
        this.euM.add(new hnt(this.ktN, string));
    }

    public void J(String[] stringArray) {
        for (String string : stringArray) {
            this.euM.add(new hnt(this.ktN, string));
        }
    }

    public hrb(hdm hdm2, String string, lgg lgg2, lhf lhf2, hpx.a a2, hpx.b b2, lhv lhv2, String string2, hnt.a a3) {
        this(hdm2, string, lgg2, lhf2, a2, b2, lhv2, null, null, string2, null, a3);
    }

    public hrb(hdm hdm2, String string, lgg lgg2, lhf lhf2, hpx.a a2, hpx.b b2, lhv lhv2, String string2, lhu lhu2, hnt.a a3) {
        this(hdm2, string, lgg2, lhf2, a2, b2, lhv2, null, null, string2, lhu2, a3);
    }

    public hrb(hdm hdm2, String string, lgg lgg2, lhf lhf2, hpx.a a2, hpx.b b2, lhv lhv2, String string2, hnt.a a3, String string3, hnt.a a4) {
        this(hdm2, string, lgg2, lhf2, a2, b2, lhv2, string2, a3, string3, null, a4);
    }

    public hrb(hdm hdm2, String string, lgg lgg2, lhf lhf2, hpx.a a2, hpx.b b2, lhv lhv2, String string2, hnt.a a3, String string3, lhu lhu2, hnt.a a4) {
        this(hdm2, string, lgg2, lhf2, a2, b2, lhv2, string2, a3, new String[]{string3}, lhu2, a4);
    }

    public hrb(hdm hdm2, String string, lgg lgg2, lhf lhf2, hpx.a a2, hpx.b b2, lhv lhv2, String[] stringArray, hnt.a a3) {
        this(hdm2, string, lgg2, lhf2, a2, b2, lhv2, null, null, stringArray, null, a3);
    }

    public hrb(hdm hdm2, String string, lgg lgg2, lhf lhf2, hpx.a a2, hpx.b b2, lhv lhv2, String[] stringArray, lhu lhu2, hnt.a a3) {
        this(hdm2, string, lgg2, lhf2, a2, b2, lhv2, null, null, stringArray, lhu2, a3);
    }

    public hrb(hdm hdm2, String string, lgg lgg2, lhf lhf2, hpx.a a2, hpx.b b2, lhv lhv2, String string2, hnt.a a3, String[] stringArray, hnt.a a4) {
        this(hdm2, string, lgg2, lhf2, a2, b2, lhv2, string2, a3, stringArray, null, a4);
    }

    public hrb(hdm hdm2, String string, lgg lgg2, lhf lhf2, hpx.a a2, hpx.b b2, lhv lhv2, String string2, hnt.a a3, String[] stringArray, lhu lhu2, hnt.a a4) {
        super((hnc)hdm2, string, lgg2, lhf2, a2, b2, lhv2);
        this.dXw = hdm2;
        this.kUc = a3;
        this.ktN = a4;
        this.dMU = lhu2;
        if (string2 != null) {
            this.kUd = new hnt(this.kUc, string2);
        }
        this.euM = lcn.emA();
        for (String string3 : stringArray) {
            this.euM.add(new hnt(this.ktN, string3));
        }
    }

    @Override
    protected void ccc() {
        this.kLu.a(this.dMU, this.euM, this.kUd);
    }
}

