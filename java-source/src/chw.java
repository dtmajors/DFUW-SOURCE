/*
 * Decompiled with CFR.
 */
public class chw
extends che {
    public int ResourceType = -1;

    public chw() {
        this.ezL = cgi.SPAWNING;
    }

    public boolean qb(int n) {
        return this.ResourceTree.isDescendant(n, this.ResourceType);
    }
}

