/*
 * Decompiled with CFR.
 */
public class chr
extends che {
    public int ResourceType = -1;

    public chr() {
        this.ezL = cgi.SELL;
    }

    public boolean qb(int n) {
        return this.ResourceType == -1 || lea.enW().isDescendant(n, this.ResourceType);
    }
}

