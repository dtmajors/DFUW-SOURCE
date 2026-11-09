/*
 * Decompiled with CFR.
 */
public class lov {
    public final String Title;
    public final String FirstName;
    public final String LastName;
    public final low rHf;
    public final lou rHg;

    public lov(String string, String string2, String string3, low low2, lou lou2) {
        this.Title = string;
        this.FirstName = string2;
        this.LastName = string3;
        this.rHf = low2;
        this.rHg = lou2;
    }

    public static lov Bf(String string) {
        int n = string.indexOf(59);
        if (n < 0) {
            return null;
        }
        int n2 = string.indexOf(59, n + 1);
        if (n2 < 0) {
            return null;
        }
        int n3 = string.indexOf(59, n2 + 1);
        if (n3 < 0) {
            return null;
        }
        int n4 = string.indexOf(59, n3 + 1);
        if (n4 < 0) {
            return null;
        }
        String string2 = string.substring(n3 + 1, n4);
        if (low.valueOf(string2) == null) {
            return null;
        }
        String string3 = string.substring(n4);
        if (lou.valueOf(string3) == null) {
            return null;
        }
        lov lov2 = new lov(string.substring(0, n), string.substring(n + 1, n2), string.substring(n2 + 1, n3), low.valueOf(string2), lou.valueOf(string3));
        return lov2;
    }

    public String cJW() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.Title != null) {
            stringBuilder.append(this.Title);
        }
        stringBuilder.append(";");
        stringBuilder.append(this.FirstName);
        stringBuilder.append(";");
        stringBuilder.append(this.LastName);
        stringBuilder.append(";");
        stringBuilder.append((Object)this.rHf);
        stringBuilder.append(";");
        stringBuilder.append((Object)this.rHg);
        return stringBuilder.toString();
    }
}

