/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.List;

public class axq {
    private ldv aDt;
    private axp csG = axp.CATEGORY_CANNONS;
    private String aDu = null;
    private String csH = null;
    private int csI = -1;
    private List<lfs<Integer, Integer>> csJ = null;
    private List<lfs<String, Integer>> csK = null;
    private int csL = -1;
    private ljq Position = null;
    private lgl Rotation = null;
    private boolean csM = false;
    private String csN = null;
    private float aDv = 0.0f;
    private int aDw = -1;
    private boolean csO = false;
    private int csP = -1;
    private int[] csQ;
    private int[] csR;
    private String[] csS;
    private int[] csT;
    private int csU;
    private int[] csV;
    private boolean csW = false;
    private int csX = -1;
    private List<Integer> csY = null;
    private boolean csZ = false;
    private boolean cta = false;
    private int ctb = 0;
    private boolean ctc = false;

    public int Yg() {
        return this.ctb;
    }

    public boolean Yh() {
        return this.ctc;
    }

    public void cg(boolean bl) {
        this.ctc = bl;
    }

    public void Yi() {
        this.csQ = new int[this.csJ.size()];
        this.csR = new int[this.csJ.size()];
        int n = 0;
        for (lfs<Integer, Integer> comparable : this.csJ) {
            this.csQ[n] = (Integer)comparable.reX;
            this.csR[n] = (Integer)comparable.reY;
            ++n;
        }
        this.csS = new String[this.csK.size()];
        this.csT = new int[this.csK.size()];
        n = 0;
        for (lfs<Object, Integer> lfs2 : this.csK) {
            this.csS[n] = (String)lfs2.reX;
            this.csT[n] = (Integer)lfs2.reY;
            ++n;
        }
        this.csU = this.csG.ordinal();
        if (this.csY != null) {
            this.csV = new int[this.csY.size()];
            n = 0;
            for (Integer n2 : this.csY) {
                this.csV[n] = n2;
                ++n;
            }
        }
    }

    public void Yj() {
        lfs lfs2;
        int n;
        int n2;
        if (this.csQ != null) {
            assert (this.csQ.length == this.csR.length);
            this.csJ = lcn.abH(this.csQ.length);
            n2 = this.csQ.length;
            for (n = 0; n < n2; ++n) {
                lfs2 = new lfs();
                lfs2.reX = this.csQ[n];
                lfs2.reY = this.csR[n];
                this.csJ.add(lfs2);
            }
        }
        if (this.csS != null) {
            assert (this.csS.length == this.csT.length);
            this.csK = lcn.abH(this.csS.length);
            n2 = this.csS.length;
            for (n = 0; n < n2; ++n) {
                lfs2 = new lfs();
                lfs2.reX = this.csS[n];
                lfs2.reY = this.csT[n];
                this.csK.add(lfs2);
            }
        }
        if (this.csV != null && this.csY == null) {
            this.csY = lcn.abH(this.csV.length);
            n2 = this.csV.length;
            for (n = 0; n < n2; ++n) {
                this.csY.add(this.csV[n]);
            }
        }
        this.csG = axp.getCategoryByOrdinal(this.csU);
    }

    public nk Yk() {
        nk nk2 = new nk();
        nk2.aDt = this.aDt;
        nk2.aDu = this.Yp();
        nk2.aDv = this.Yd();
        nk2.aDw = this.XS();
        nk2.aDx = this.ctb;
        return nk2;
    }

    public void a(nk nk2) {
        this.aDt = nk2.aDt;
        this.aDu = nk2.aDu;
        this.aDv = nk2.aDv;
        this.aDw = nk2.aDw;
        this.ctb = nk2.aDx;
        this.ctc = true;
    }

    public boolean XM() {
        return this.cta;
    }

    public void ch(boolean bl) {
        this.cta = bl ? this.Yl() : false;
    }

    public boolean Yl() {
        return !lea.enW().isDescendant(this.csI, cug.fmZ);
    }

    public String iv(int n) {
        assert (n >= 0);
        if (n == 0) {
            return this.aDu;
        }
        return this.aDu + " u" + n;
    }

    public int iw(int n) {
        assert (n >= 0);
        if (n == 0) {
            return this.csI;
        }
        String string = this.iv(n);
        return lea.enW().getType(string);
    }

    public int ix(int n) {
        assert (n < this.csY.size());
        return this.csY.get(n);
    }

    public int U(int n, int n2) {
        assert (n < this.csY.get(n2) + 1);
        if (n == 0) {
            return this.iw(n2);
        }
        String string = this.iv(n2);
        String string2 = string + " D" + n;
        return lea.enW().getType(string2);
    }

    public boolean Ym() {
        return lea.enW().isDescendant(this.csI, cug.fmZ);
    }

    public axp Yn() {
        return this.csG;
    }

    public void a(axp axp2) {
        this.csG = axp2;
    }

    public int Yo() {
        return this.csI;
    }

    public void iy(int n) {
        this.csI = n;
    }

    public String Yp() {
        return this.aDu;
    }

    public void eI(String string) {
        this.aDu = string;
        this.csH = string + "_rubble";
    }

    public int XT() {
        return this.csL;
    }

    public void iz(int n) {
        this.csL = n;
    }

    public String Yq() {
        return this.csN;
    }

    public void eJ(String string) {
        this.csN = string;
    }

    public boolean Yr() {
        return this.Position != null;
    }

    public ljq av() {
        return new ljq(this.Position);
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public boolean Ys() {
        return this.csM;
    }

    public void ci(boolean bl) {
        this.csM = bl;
    }

    public lgl aw() {
        return new lgl(this.Rotation);
    }

    public boolean Yt() {
        return this.Rotation != null;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public void EM() {
        this.Yv();
        this.Yu();
    }

    public void Yu() {
        assert (this.csL >= 0);
        String string = this.aDu + " Rubble";
        this.csX = lea.enW().getType(string);
        this.csY = lcn.abH(this.csL);
        for (int i = 0; i <= this.csL; ++i) {
            String string2 = this.iv(i);
            int n = 0;
            while (true) {
                String string3 = string2 + " d" + (n + 1);
                int n2 = lea.enW().getType(string3);
                if (n2 < 0) break;
                ++n;
            }
            if (n > 0) {
                this.csZ = true;
            }
            this.csY.add(new Integer(n));
        }
    }

    private void Yv() {
        this.csL = 0;
        String string = this.aDu + " u" + (this.csL + 1);
        int n = lea.enW().getType(string);
        while (n > 0) {
            ++this.csL;
            string = this.aDu + " u" + (this.csL + 1);
            n = lea.enW().getType(string);
        }
    }

    public boolean Yw() {
        return this.csX > 0;
    }

    public int Yx() {
        return this.csX;
    }

    public String Yy() {
        return lea.enW().getName(this.csX);
    }

    public void iA(int n) {
        this.csX = n;
    }

    public void c(axq axq2) {
        this.aDt = axq2.aDt;
        this.csG = axq2.csG;
        this.aDu = axq2.aDu;
        this.csH = axq2.csH;
        this.csI = axq2.csI;
        this.csL = axq2.csL;
        if (axq2.Position != null) {
            this.Position = axq2.Position;
        }
        if (axq2.Rotation != null) {
            this.Rotation = axq2.Rotation;
        }
        this.csM = axq2.csM;
        this.csN = axq2.csN;
        this.csX = axq2.csX;
        List<lfs<String, Integer>> list = axq2.csK;
        this.csK = lcn.emv();
        for (lfs<String, Integer> lfs2 : list) {
            lfs<String, Integer> lfs3 = new lfs<String, Integer>(lfs2);
            this.csK.add(lfs3);
        }
        this.U(this.csK);
    }

    public List<lfs<Integer, Integer>> Yz() {
        return this.csJ;
    }

    public List<lfs<String, Integer>> YA() {
        return this.csK;
    }

    public void U(List<lfs<String, Integer>> list) {
        this.csK = list;
        this.csJ = lcn.abH(this.csK.size());
        for (lfs<String, Integer> lfs2 : this.csK) {
            int n = lea.enW().getType((String)lfs2.reX);
            assert (n > 0);
            this.csJ.add(new lfs(new Integer(n), lfs2.reY));
        }
    }

    public boolean YB() {
        return this.csZ;
    }

    public void cj(boolean bl) {
        this.csZ = bl;
    }

    public boolean XU() {
        return this.csW;
    }

    public void cf(boolean bl) {
        this.csW = bl;
    }

    public boolean YC() {
        if (this.csN == null) {
            return false;
        }
        return !this.csN.equals("");
    }

    public float Yd() {
        return this.aDv;
    }

    public void cg(float f) {
        this.aDv = f;
    }

    public int XS() {
        return this.aDw;
    }

    public void iB(int n) {
        this.aDw = n;
    }

    public boolean isEnabled() {
        return this.csO;
    }

    public void setEnabled(boolean bl) {
        this.csO = bl;
        this.ctb = this.csO ? 2 : 1;
    }

    public String toString() {
        return "Element = " + this.aDu;
    }

    public ldv YD() {
        return this.aDt;
    }

    public void dr(ldv ldv2) {
        this.aDt = ldv2;
    }

    public final int YE() {
        return this.csP;
    }

    public final void iC(int n) {
        this.csP = n;
    }
}

