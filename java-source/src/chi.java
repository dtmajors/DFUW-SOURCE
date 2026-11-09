/*
 * Decompiled with CFR.
 */
public class chi
extends che {
    public cgc ezQ;
    public cgc ezR;
    public cgc ezS;
    public cgc ezT;
    public cgc ezU;
    public cgc ezV;
    public int ezW;
    public int ResourceType;
    public int ezX;
    public int SkillType;

    public chi() {
        this.ezL = cgi.EVENT;
    }

    public boolean a(boolean bl, boolean bl2, int n, int n2, int n3, int n4, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        if (!this.ezV.bZR && bl4 != this.ezV.Pp) {
            return false;
        }
        if (!this.ezS.bZR && bl3 != this.ezS.Pp) {
            return false;
        }
        if (!this.ezT.bZR && bl6 != this.ezT.Pp) {
            return false;
        }
        if (!this.ezU.bZR && bl5 != this.ezU.Pp) {
            return false;
        }
        if (!this.ezQ.bZR && bl != this.ezQ.Pp) {
            return false;
        }
        if (!this.ezR.bZR && bl2 != this.ezR.Pp) {
            return false;
        }
        if (this.ResourceType != -1 && !this.ResourceTree.isDescendant(n, this.ResourceType)) {
            return false;
        }
        if (this.ezW != -1 && this.ezW != n2) {
            return false;
        }
        if (this.ezX != -1 && !this.ResourceTree.isDescendant(n4, this.ezX)) {
            return false;
        }
        return this.SkillType == -1 || this.aqN.isDescendant(n3, this.SkillType);
    }
}

