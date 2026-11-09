/*
 * Decompiled with CFR.
 */
public class chp
extends che {
    public int cwg;

    public chp() {
        this.ezL = cgi.OPEN_CHEST;
    }

    public boolean qb(int n) {
        return this.ResourceTree.isDescendant(n, this.cwg);
    }
}

