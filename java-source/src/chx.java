/*
 * Decompiled with CFR.
 */
public class chx
extends che {
    public boolean eyI;
    public boolean eAj;
    public int eAk;
    public int ResourceType;

    public chx() {
        this.ezL = cgi.TRANSFER;
    }

    public boolean k(int n, int n2, int n3) {
        if (this.eAj ? !this.ResourceTree.isDescendant(n2, this.eAk) : !this.ResourceTree.isDescendant(n, this.eAk)) {
            return false;
        }
        return this.ResourceTree.isDescendant(n3, this.ResourceType);
    }
}

