/*
 * Decompiled with CFR.
 */
public class csz {
    public String fem = null;
    public ctb[] fer = null;
    public int feo = -1;
    public int fep = -1;
    public ctb fes = null;

    public csy bbo() {
        csy csy2 = new csy();
        csy2.fem = this.fem;
        cta[] ctaArray = new cta[this.fer.length];
        int n = ctaArray.length;
        for (int i = 0; i < n; ++i) {
            ctaArray[i] = new cta();
            ctaArray[i].bid = this.fer[i].bid;
            ctaArray[i].fet = this.fer[i].fet;
            ctaArray[i].bpX = 5;
            ctaArray[i].bpZ = 6;
            ctaArray[i].feu = this.fer[i].feu;
            ctaArray[i].fev = this.fer[i].fev;
            if (!ctaArray[i].fet) continue;
            csy2.feq = ctaArray[i];
        }
        csy2.fen = ctaArray;
        return csy2;
    }

    public csz bbp() {
        csz csz2 = new csz();
        csz2.fem = this.fem;
        ctb[] ctbArray = new ctb[this.fer.length];
        int n = ctbArray.length;
        for (int i = 0; i < n; ++i) {
            ctbArray[i] = this.fer[i].bbu();
        }
        csz2.fer = ctbArray;
        csz2.fes = this.fes;
        return csz2;
    }

    public ctb bbq() {
        if (this.feo <= 0) {
            lfn.b(5, "SFCollisionSchemeInfoMonster", "getActiveMapping() ActiveCollisionSchemeID is invalid.");
            return null;
        }
        int n = this.fer.length;
        for (int i = 0; i < n; ++i) {
            if (this.fer[i].bid != this.feo) continue;
            return this.fer[i];
        }
        return null;
    }

    public ctb uj(int n) {
        if (this.fer == null) {
            lfn.b(5, "SFCollisionSchemeInfoMonster", "getCollisionSchemeMapping() CollisionSchemeMappings array is null.");
            return null;
        }
        int n2 = this.fer.length;
        for (int i = 0; i < n2; ++i) {
            if (this.fer[i].bid != n) continue;
            return this.fer[i];
        }
        return null;
    }

    public ctb bbr() {
        return this.uj(1);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFCollisionSchemeInfoMonster: MeshFile='");
        stringBuilder.append(this.fem);
        stringBuilder.append("' CollisionSchemeMappingCount=");
        stringBuilder.append(this.fer.length);
        return stringBuilder.toString();
    }
}

