/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hnt {
    public final a kPF;
    public final String aFo;
    public int fc;

    public hnt(a a2, String string) {
        this.kPF = a2;
        this.aFo = string;
    }

    public static hnt a(String string, hdm hdm2) {
        if (string.isEmpty()) {
            return null;
        }
        char c2 = string.charAt(0);
        if ((string = string.substring(1)).isEmpty()) {
            return null;
        }
        int n = string.indexOf(124);
        if (n < 0) {
            return null;
        }
        String string2 = string.substring(0, n);
        string = string.length() > n + 1 ? string.substring(n + 1) : "";
        a a2 = null;
        switch (c2) {
            case '1': {
                a2 = hdm2.kKr;
                break;
            }
            case '2': {
                a2 = hdm2.jGV;
                break;
            }
            case '3': {
                a2 = hdm2.kKo;
                break;
            }
            case '4': {
                a2 = hdm2.kKp;
                break;
            }
            case '5': {
                a2 = hdm2.jGU;
                break;
            }
            case '6': {
                a2 = hdm2.kKn;
                break;
            }
            default: {
                return null;
            }
        }
        int n2 = 0;
        try {
            n2 = Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        if (n2 < 0 || n2 > 100) {
            return null;
        }
        hnt hnt2 = new hnt(a2, string);
        hnt2.fc = n2;
        return hnt2;
    }

    public String r(hdm hdm2) {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.kPF.equals(hdm2.kKr)) {
            return null;
        }
        if (this.kPF.equals(hdm2.jGV)) {
            stringBuilder.append("2");
        } else if (this.kPF.equals(hdm2.kKo)) {
            stringBuilder.append("3");
        } else if (this.kPF.equals(hdm2.kKp)) {
            stringBuilder.append("4");
        } else if (this.kPF.equals(hdm2.jGU)) {
            stringBuilder.append("5");
        } else if (this.kPF.equals(hdm2.kKn)) {
            stringBuilder.append("6");
        } else {
            stringBuilder.append("5");
        }
        stringBuilder.append(this.fc);
        stringBuilder.append("|");
        stringBuilder.append(this.aFo);
        return stringBuilder.toString();
    }
}

