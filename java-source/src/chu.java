/*
 * Decompiled with CFR.
 */
public class chu
extends che {
    public int bBh;
    public int ResourceType;

    public chu() {
        this.ezL = cgi.SKIN;
    }

    public boolean aL(int n, int n2) {
        if (this.ResourceType != -1 && !this.ResourceTree.isDescendant(n, this.ResourceType)) {
            return false;
        }
        return this.bBh == -1 || this.ResourceTree.isDescendant(n2, this.bBh);
    }
}

