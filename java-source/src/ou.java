/*
 * Decompiled with CFR.
 */
public class ou {
    public int aGo;
    public int aGp;

    public ou() {
    }

    public ou(int n, int n2) {
        this.aGo = n;
        this.aGp = n2;
    }

    public String fk() {
        return this.aGo + ":" + this.aGp;
    }

    public static ou bV(String string) {
        int n = string.indexOf(58);
        if (n < 0) {
            return null;
        }
        ou ou2 = new ou();
        try {
            ou2.aGo = Integer.parseInt(string.substring(0, n));
            ou2.aGp = Integer.parseInt(string.substring(n + 1));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        return ou2;
    }
}

