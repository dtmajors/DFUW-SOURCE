/*
 * Decompiled with CFR.
 */
public class csy {
    public String fem = null;
    public cta[] fen = null;
    public int feo = -1;
    public int fep = -1;
    public cta feq = null;

    public csy bbm() {
        csy csy2 = new csy();
        csy2.fem = this.fem;
        cta[] ctaArray = new cta[this.fen.length];
        int n = ctaArray.length;
        for (int i = 0; i < n; ++i) {
            ctaArray[i] = this.fen[i].bbs();
        }
        csy2.fen = ctaArray;
        csy2.feq = this.feq;
        return csy2;
    }

    public cta bbn() {
        if (this.feo < 0 || this.feo >= this.fen.length) {
            lfn.b(5, "SFCollisionSchemeInfo", "getActiveMapping() ActiveCollisionSchemeID is invalid.");
            return null;
        }
        return this.fen[this.feo];
    }

    public cta uh(int n) {
        if (n <= 0) {
            lfn.b(5, "SFCollisionSchemeInfo", "getMappingForLifeMode() LifeMode is invalid.");
            return null;
        }
        if (this.fen == null) {
            lfn.b(5, "SFCollisionSchemeInfo", "getMappingForLifeMode() CollisionSchemeMappings array is null.");
            return null;
        }
        int n2 = this.fen.length;
        for (int i = 0; i < n2; ++i) {
            if (this.fen[i].bpX != 3 || this.fen[i].bpZ != n) continue;
            return this.fen[i];
        }
        return null;
    }

    public cta ui(int n) {
        if (n <= 0) {
            lfn.b(5, "SFCollisionSchemeInfo", "getMappingForPostureMode() PostureMode is invalid.");
            return null;
        }
        if (this.fen == null) {
            lfn.b(5, "SFCollisionSchemeInfo", "getMappingForPostureMode() CollisionSchemeMappings array is null.");
            return null;
        }
        int n2 = this.fen.length;
        for (int i = 0; i < n2; ++i) {
            if (this.fen[i].bpX != 5 || this.fen[i].bpZ != n) continue;
            return this.fen[i];
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFCollisionSchemeInfo: MeshFile='");
        stringBuilder.append(this.fem);
        stringBuilder.append("' CollisionSchemeMappingCount=");
        stringBuilder.append(this.fen.length);
        return stringBuilder.toString();
    }
}

