/*
 * Decompiled with CFR.
 */
public class mk {
    final int SkillType;
    final int ResourceType;
    int ayN;
    final int ayO;

    public mk(int n, int n2, int n3, int n4) {
        this.SkillType = n;
        this.ResourceType = n2;
        this.ayN = n3;
        this.ayO = n4;
    }

    public boolean a(int n, int n2, int n3, boolean bl, boolean bl2) {
        if (this.isCompleted() && !bl2) {
            return false;
        }
        if (this.SkillType != -1 && !lea.enZ().isDescendant(n2, this.SkillType)) {
            return false;
        }
        if (!lea.enW().isDescendant(n, this.ResourceType)) {
            return false;
        }
        this.ayN = bl ? n3 : this.ayN + n3;
        return true;
    }

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public int qO() {
        return this.ayN;
    }

    public boolean isCompleted() {
        return this.ayN >= this.ayO;
    }
}

