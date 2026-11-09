/*
 * Decompiled with CFR.
 */
public class chh
extends che {
    public boolean ezP = false;
    public int SkillType = -1;
    public int ResourceType = -1;

    public chh() {
        this.ezL = cgi.CRAFTING;
    }

    public boolean b(boolean bl, int n, int n2) {
        if (this.ezP != bl) {
            return false;
        }
        if (!this.aqN.isDescendant(n, this.SkillType)) {
            return false;
        }
        return this.ResourceType == -1 || this.ResourceTree.isDescendant(n2, this.ResourceType);
    }
}

