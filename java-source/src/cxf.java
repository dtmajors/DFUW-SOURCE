/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  kbg
 *  lcw
 */
import java.util.Map;

public class cxf {
    private Map<Integer, cxc> fTe = lcn.emw();
    private kbi fTf = null;
    private boolean fTg = true;
    private static les aqN = lea.enZ();

    public cxf(boolean bl) {
        this.fTg = bl;
        if (this.fTg) {
            kbg kbg2 = new kbg();
            kbg2.a(this);
            this.fTf = kbg2;
        } else {
            this.fTf = new kav();
        }
    }

    public kbi bfM() {
        return this.fTf;
    }

    public cxc iv(String string) {
        return this.n(string, false);
    }

    public cxc n(String string, boolean bl) {
        if (string == null) {
            return null;
        }
        return this.D(aqN.getType(string), bl);
    }

    public cxc yb(int n2) {
        return this.D(n2, false);
    }

    public cxc D(int n2, boolean bl) {
        if (n2 <= 0) {
            return null;
        }
        String string = aqN.getName(n2);
        if (string == null) {
            return null;
        }
        cxc cxc2 = this.fTe.get(n2);
        if (cxc2 == null) {
            String string2 = this.iw(string);
            cxc2 = this.o(string2, bl);
            if (cxc2 == null) {
                return null;
            }
            this.fTe.put(n2, cxc2);
        }
        return cxc2.bfv();
    }

    private cxc o(String string, boolean bl) {
        assert (string != null);
        try {
            return this.fTf.O(string.toLowerCase(), bl);
        }
        catch (Throwable throwable) {
            lfn.b(5, "SFSkillFactory", "PARSING OF FILE : " + string + " failed.");
            return null;
        }
    }

    private String iw(String string) {
        if (this.fTg) {
            return lcw.qMZ + string + ".xml";
        }
        return lcw.qMy + string + ".xml";
    }
}

