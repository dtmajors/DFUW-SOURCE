/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class lgw
extends ler
implements bsm {
    private lhu dzN = null;
    private lhu rmU = null;
    private String fem = null;
    private bqm.a rmV = null;
    private boolean rmW = false;
    private boolean rmX = false;
    private cak.c bpW = cak.c.efE;
    private float rmY = 0.0f;
    private lcf rmZ;
    private lgs rna;
    private lgs rnb;
    private String lzh = null;
    private String rnc = null;
    private ff rnd = null;
    private static les ResourceTree = lea.enW();

    @Override
    public lhu atw() {
        return this.dzN;
    }

    public void a(lhu lhu2) {
        assert (lhu2 != null);
        this.dzN = lhu2;
    }

    public lhu erI() {
        return this.rmU;
    }

    public void f(lhu lhu2) {
        assert (lhu2 != null);
        this.rmU = lhu2;
    }

    public String bBt() {
        return this.fem;
    }

    public void jC(String string) {
        assert (string != null);
        this.fem = string;
    }

    @Override
    public boolean awQ() {
        if (this.rmV == null) {
            return false;
        }
        return this.rmV != bqm.a.dDV;
    }

    public bqm.a erJ() {
        return this.rmV;
    }

    public void a(bqm.a a2) {
        assert (a2 != null);
        this.rmV = a2;
    }

    public boolean erK() {
        return this.rmW;
    }

    public void ys(boolean bl) {
        this.rmW = bl;
    }

    @Override
    public boolean auW() {
        return this.rmX;
    }

    @Override
    public boolean auU() {
        return ResourceTree.isDescendant(this.Type, cug.fjP);
    }

    @Override
    public lhu awW() {
        return cug.vd((int)this.Type);
    }

    public void yt(boolean bl) {
        this.rmX = bl;
    }

    @Override
    public cak.c auO() {
        return this.bpW;
    }

    public void b(cak.c c2) {
        this.bpW = c2;
    }

    public float erL() {
        return this.rmY;
    }

    public void np(float f) {
        this.rmY = f;
    }

    @Override
    public lcf awS() {
        return this.rmZ;
    }

    public void b(lcf lcf2) {
        assert (lcf2 != null);
        this.rmZ = lcf2;
    }

    @Override
    public lgs awT() {
        assert (this.rna != null);
        return new lgs(this.rna);
    }

    public lgs cel() {
        assert (this.rnb != null);
        return new lgs(this.rnb);
    }

    public void z(lgs lgs2) {
        assert (lgs2 != null);
        assert (lgs2.cf >= 0);
        assert (lgs2.cg >= 0);
        assert (lgs2.rmN <= this.dzN.kLY.rmN);
        assert (lgs2.H <= this.dzN.kLY.H);
        assert (lgs2.cf + lgs2.rmN <= this.dzN.kLY.rmN);
        assert (lgs2.cg + lgs2.H <= this.dzN.kLY.H);
        this.rna = lgs2;
    }

    public void A(lgs lgs2) {
        assert (lgs2 != null);
        assert (lgs2.cf >= 0);
        assert (lgs2.cg >= 0);
        assert (lgs2.rmN <= this.dzN.kLY.rmN);
        assert (lgs2.H <= this.dzN.kLY.H);
        assert (lgs2.cf + lgs2.rmN <= this.dzN.kLY.rmN);
        assert (lgs2.cg + lgs2.H <= this.dzN.kLY.H);
        this.rnb = lgs2;
    }

    public String enm() {
        return this.lzh;
    }

    public void op(String string) {
        this.lzh = string;
    }

    public String erM() {
        return this.rnc;
    }

    public void Ac(String string) {
        this.rnc = string;
    }

    public void v(lgw lgw2) {
        lgw2.a(this.dzN);
        lgw2.f(this.rmU);
        lgw2.jC(this.fem);
        lgw2.a(this.rmV);
        lgw2.ys(this.rmW);
        lgw2.yt(this.rmX);
        lgw2.b(this.bpW);
        lgw2.b(this.rmZ);
        lgw2.z(this.rna);
        lgw2.A(this.rnb);
    }

    @Override
    public ctu mO(int n) {
        return cwy.bm(n, this.Type);
    }

    @Override
    public lip awO() {
        if (this.rnd == null) {
            this.rnd = this.erN();
        }
        return new ljk(this.rnd.getStringValue());
    }

    @Override
    public bsg awR() {
        int n = ResourceTree.uW(this.Type);
        if (n < 0) {
            return null;
        }
        return (bsg)((Object)ResourceTree.acv(n));
    }

    @Override
    public bsm awV() {
        return (bsm)this.awR();
    }

    @Override
    public boolean awU() {
        return this.bpW != cak.c.efE;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFFResourceListItem:");
        stringBuilder.append("super=");
        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append("ResourceType:");
        stringBuilder.append(this.Type);
        stringBuilder.append("Name:'");
        stringBuilder.append(this.getName());
        stringBuilder.append("', Description:'");
        stringBuilder.append(this.jD);
        stringBuilder.append("', Texture:'");
        stringBuilder.append(this.dzN);
        stringBuilder.append("', Stackable: ");
        stringBuilder.append(this.rmX);
        return stringBuilder.toString();
    }

    public ff erN() {
        ff ff2;
        if (this.rmW && (ff2 = (ff)cug.bh((int)this.Type, (int)1328)) != null) {
            return ff2;
        }
        return this.erO();
    }

    private ff erO() {
        ff ff2 = new ff();
        ff2.setType(1328);
        ff2.av(cug.q((int)this.Type, (String)this.getName()));
        return ff2;
    }

    @Override
    public boolean a(bsm bsm2) {
        return ResourceTree.isDescendant(this.Type, bsm2.getType());
    }

    public boolean erP() {
        return ResourceTree.isDescendant(this.Type, cug.fiC);
    }

    public boolean ceq() {
        bqm.d d2 = bqm.d.getWeaponType(this.Type);
        if (d2 == null) {
            return false;
        }
        return bqm.d.isTwoHandedWeapon(d2);
    }
}

