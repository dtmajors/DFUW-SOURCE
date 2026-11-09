/*
 * Decompiled with CFR.
 */
public class cht
extends che {
    public int ResourceType;
    public int SkillType;
    public boolean eAg;
    public boolean eAh;

    public cht() {
        this.ezL = cgi.SKILL;
    }

    public boolean aL(int n, int n2) {
        if (this.ResourceType != -1 && !lea.enW().isDescendant(n, this.ResourceType)) {
            return false;
        }
        return lea.enZ().isDescendant(n2, this.SkillType);
    }
}

