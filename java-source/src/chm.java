/*
 * Decompiled with CFR.
 */
public class chm
extends che {
    public int eAc;
    public int ResourceType;

    public chm() {
        this.ezL = cgi.HARVEST;
    }

    public boolean aL(int n, int n2) {
        if (this.eAc != -1 && !this.ResourceTree.isDescendant(n, this.eAc)) {
            return false;
        }
        return this.ResourceTree.isDescendant(n2, this.ResourceType);
    }
}

