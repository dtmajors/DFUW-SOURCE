/*
 * Decompiled with CFR.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ctu
extends ctt {
    private int ResourceType = 0;
    private int asi = 0;
    private float fgi = 0.0f;
    private float fgj = 0.0f;
    private int brS = 0;
    private float fgk = 0.0f;
    private float fgl = 100.0f;
    private ctz[] fgm = null;
    private ctc[] fgn = null;
    private boolean fgo = false;
    private boolean Visible = true;

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public int vf() {
        return this.asi;
    }

    public void do(int n) {
        this.asi = n;
    }

    public float bbF() {
        return this.fgi;
    }

    public void eR(float f2) {
        this.fgi = f2;
    }

    public float bbG() {
        return this.fgj;
    }

    public void eS(float f2) {
        this.fgj = f2;
    }

    public int bbH() {
        return this.brS;
    }

    public void un(int n) {
        this.brS = n;
    }

    public ctz[] bbI() {
        return this.fgm;
    }

    public void a(ctz[] ctzArray) {
        this.fgm = ctzArray;
    }

    public final String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public final String DF() {
        return lea.enW().getName(this.brS);
    }

    public float bbJ() {
        return this.fgk;
    }

    public void eT(float f2) {
        this.fgk = f2;
    }

    public float bbK() {
        return this.fgl;
    }

    public void eU(float f2) {
        this.fgl = f2;
    }

    public ctc[] bbL() {
        return this.fgn;
    }

    public void a(ctc[] ctcArray) {
        this.fgn = ctcArray;
    }

    public boolean bbM() {
        return this.fgo;
    }

    public void gY(boolean bl) {
        this.fgo = bl;
    }

    public boolean isVisible() {
        return this.Visible;
    }

    public void setVisible(boolean bl) {
        this.Visible = bl;
    }

    public final boolean a(ctz ctz2) {
        if (ctz2 == null) {
            return false;
        }
        if (this.fgm == null) {
            this.fgm = new ctz[]{ctz2};
            return true;
        }
        if (this.uo(ctz2.SkillType) >= 0) {
            return false;
        }
        ctz[] ctzArray = new ctz[this.fgm.length + 1];
        for (int i = 0; i < this.fgm.length; ++i) {
            ctzArray[i] = this.fgm[i];
        }
        ctzArray[ctzArray.length - 1] = ctz2;
        this.fgm = ctzArray;
        return true;
    }

    public final boolean b(ctz ctz2) {
        if (ctz2 == null) {
            return false;
        }
        int n = this.uo(ctz2.SkillType);
        if (n < 0) {
            return false;
        }
        if (this.fgm.length == 1) {
            this.fgm = null;
            return true;
        }
        ctz[] ctzArray = new ctz[this.fgm.length - 1];
        int n2 = 0;
        for (int i = 0; i < this.fgm.length; ++i) {
            if (i == n) continue;
            ctzArray[n2] = this.fgm[i];
            ++n2;
        }
        this.fgm = ctzArray;
        return true;
    }

    private int uo(int n) {
        assert (this.fgm != null);
        assert (this.fgm.length > 0);
        for (int i = 0; i < this.fgm.length; ++i) {
            if (this.fgm[i].SkillType != n) continue;
            return i;
        }
        return -1;
    }

    public boolean up(int n) {
        if (this.fgn == null) {
            return false;
        }
        for (int i = 0; i < this.fgn.length; ++i) {
            if (this.fgn[i].az() != n) continue;
            return true;
        }
        return false;
    }

    @Override
    protected void a(ctt ctt2) {
        super.a(ctt2);
        ctu ctu2 = (ctu)ctt2;
        ctu2.l(this.ResourceType);
        ctu2.do(this.asi);
        ctu2.eR(this.fgi);
        ctu2.eS(this.fgj);
        ctu2.un(this.brS);
        ctu2.eT(this.fgk);
        ctu2.eU(this.fgl);
        if (this.fgm != null) {
            ctz[] ctzArray = new ctz[this.fgm.length];
            for (int i = 0; i < this.fgm.length; ++i) {
                ctzArray[i] = this.fgm[i].bbN();
            }
            ctu2.a(ctzArray);
        }
        ctu2.fgn = new ctc[this.fgn.length];
        for (int i = 0; i < this.fgn.length; ++i) {
            ctu2.fgn[i] = this.fgn[i].bbv();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFRecipeCrafting: ResourceName='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' Quantity=");
        stringBuilder.append(this.asi);
        stringBuilder.append(" Difficulty=");
        stringBuilder.append(this.fgi);
        stringBuilder.append(" DurationMultiplier=");
        stringBuilder.append(this.fgj);
        stringBuilder.append(" RequiredResourceName='");
        stringBuilder.append(this.DF());
        stringBuilder.append("' ");
        stringBuilder.append(super.toString());
        stringBuilder.append(" ");
        if (this.fgm != null) {
            for (int i = 0; i < this.fgm.length; ++i) {
                if (i > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(this.fgm[i].toString());
            }
        }
        return stringBuilder.toString();
    }
}

