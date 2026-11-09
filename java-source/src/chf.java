/*
 * Decompiled with CFR.
 */
public class chf
extends che {
    public int ResourceType;

    public chf() {
        this.ezL = cgi.BREAK_ITEM;
    }

    public boolean qb(int n) {
        return this.ResourceTree.isDescendant(n, this.ResourceType);
    }
}

