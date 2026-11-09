/*
 * Decompiled with CFR.
 */
public class lpj
extends lpe {
    public final lpe rHQ;
    private static final String[] ccq = new String[0];
    private static final boolean rHW = true;

    public lpj(lpe lpe2) {
        super(lpi.rHS);
        this.rHQ = lpe2;
    }

    @Override
    public String a(lom lom2) {
        String string = this.rHQ.a(lom2);
        String string2 = null;
        String string3 = null;
        int n = string.indexOf(46);
        if (n >= 0) {
            string3 = string.substring(n + 1);
            string2 = string.substring(0, n);
        } else {
            string2 = string;
        }
        String string4 = lom2.Bc(string2);
        loo loo2 = lom2.Bd(string2);
        if (loo2 == null) {
            return "[UDV: " + string2 + "]";
        }
        if (string4 == null) {
            return "[MV: " + string2 + "]";
        }
        switch (loo2) {
            case rGG: {
                return this.j(string2, string3, string4);
            }
            case rGH: {
                return this.k(string2, string3, string4);
            }
            case rGI: {
                return this.l(string2, string3, string4);
            }
            case rGJ: {
                return this.m(string2, string3, string4);
            }
            case rGK: {
                return this.n(string2, string3, string4);
            }
            case rGL: {
                return this.o(string2, string3, string4);
            }
            case rGM: {
                return this.a(string2, string3, string4, lom2.Be(string2));
            }
            case rGN: {
                return this.p(string2, string3, string4);
            }
            case rGO: {
                return this.q(string2, string3, string4);
            }
            case rGP: {
                return this.r(string2, string3, string4);
            }
            case rGQ: {
                return this.s(string2, string3, string4);
            }
            case rGR: {
                return this.u(string2, string3, string4);
            }
            case rGS: {
                return this.v(string2, string3, string4);
            }
            case rGT: {
                return this.w(string2, string3, string4);
            }
            case rGU: {
                return this.x(string2, string3, string4);
            }
            case rGV: {
                return this.y(string2, string3, string4);
            }
            case rGW: {
                return this.z(string2, string3, string4);
            }
            case rGX: {
                return this.A(string2, string3, string4);
            }
            case rGY: {
                return this.B(string2, string3, string4);
            }
            case rGZ: {
                return this.C(string2, string3, string4);
            }
            case rHa: {
                return this.D(string2, string3, string4);
            }
            case rHb: {
                return this.E(string2, string3, string4);
            }
            case rHc: {
                return this.t(string2, string3, string4);
            }
        }
        assert (false);
        return string4;
    }

    public String toString() {
        return "Var{" + this.rHQ.toString() + "}";
    }

    private String j(String string, String string2, String string3) {
        if (string2 == null) {
            return string3;
        }
        if (string2.equals("Plurality")) {
            long l = 0L;
            try {
                l = Long.parseLong(string3);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
            if (l == 1L) {
                return "Singular";
            }
            return "Plural";
        }
        return "[UDF: " + string + "." + string2 + "]";
    }

    private String k(String string, String string2, String string3) {
        if (string2 == null) {
            return string3;
        }
        if (string2.equals("Plurality")) {
            double d2 = 0.0;
            try {
                d2 = Double.parseDouble(string3);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
            long l = (long)d2;
            if (l == 1L) {
                return "Singular";
            }
            return "Plural";
        }
        return "[UDF: " + string + "." + string2 + "]";
    }

    private String l(String string, String string2, String string3) {
        return string3;
    }

    private String m(String string, String string2, String string3) {
        return string3;
    }

    private String n(String string, String string2, String string3) {
        if (string2 == null) {
            return "[UDF: " + string + ".null]";
        }
        lgw lgw2 = (lgw)lea.enW().zx(string3);
        if (lgw2 == null) {
            return "[ERR: " + string + "." + string2 + "]";
        }
        if (string2.equals("IDResourceName")) {
            return lgw2.getName().toLowerCase();
        }
        if (string2.equals("NameSingular") || string2.equals("NamePlural") || string2.equals("Description")) {
            String string4 = "Resource." + lgw2.getName().substring(2, 3).toUpperCase() + "." + lgw2.getName().replace(' ', '_').replace('-', '_').toLowerCase() + "_" + string2;
            return lpd.rHs.c(string4, ccq);
        }
        return "[UDF: " + string + "." + string2 + "]";
    }

    private String o(String string, String string2, String string3) {
        if (string2 == null) {
            return "[UDF: " + string + ".null]";
        }
        lhg lhg2 = (lhg)lea.enZ().zx(string3);
        if (lhg2 == null) {
            return "[ERR: " + string + "." + string2 + "]";
        }
        if (string2.equals("IDSkillName")) {
            return lhg2.getName();
        }
        if (string2.equals("NameSingular") || string2.equals("Description")) {
            String string4 = "Skill." + lhg2.getName().substring(2, 3).toUpperCase() + "." + lhg2.getName().replace(' ', '_').replace('-', '_').toLowerCase() + "_" + string2;
            return lpd.rHs.c(string4, ccq);
        }
        return "[UDF: " + string + "." + string2 + "]";
    }

    private String a(String string, String string2, String string3, Class<? extends Enum> clazz) {
        if (clazz != null) {
            try {
                int n = Integer.parseInt(string3);
                return clazz.getEnumConstants()[n].toString();
            }
            catch (NumberFormatException numberFormatException) {
                assert (false) : "Failed to parse ordinal from enum parameter data!!!... Data = " + string3 + ", EnumClass = " + clazz.getName();
                return "[UDE: EnumClass " + clazz.getName() + "]";
            }
        }
        assert (false) : "Null EnumClass Supplied!!!... VarName = " + string + ", FieldName = " + string2 + ", Data = " + string3;
        return "[ERR: " + string + "]";
    }

    private String p(String string, String string2, String string3) {
        lox lox2;
        if (string2 != null) {
            return "[UDF: " + string + "." + string2 + "]";
        }
        double d2 = 0.0;
        try {
            d2 = Double.parseDouble(string3);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        long l = (long)d2;
        int n = (int)(l % 60L);
        int n2 = (int)((l /= 60L) % 60L);
        int n3 = (int)((l /= 60L) % 24L);
        int n4 = (int)(l /= 24L);
        lon lon2 = new lon();
        if (n4 > 0) {
            lox2 = lvm.sWJ;
            lon2.a(lox2, new String[]{"" + n4, lpj.gh(n3, 2), lpj.gh(n2, 2), lpj.gh(n, 2)});
        } else if (n3 > 0) {
            lox2 = lvm.sWK;
            lon2.a(lox2, new String[]{"" + n3, lpj.gh(n2, 2), lpj.gh(n, 2)});
        } else if (n2 > 0) {
            lox2 = lvm.sWL;
            lon2.a(lox2, new String[]{"" + n2, lpj.gh(n, 2)});
        } else {
            lox2 = lvm.sWM;
            lon2.a(lox2, new String[]{"" + n});
        }
        return lpd.rHs.b(lox2.Identifier, lon2);
    }

    private static String gh(int n, int n2) {
        String string = "" + n;
        while (string.length() < n2) {
            string = "0" + string;
        }
        return string;
    }

    private String q(String string, String string2, String string3) {
        if (string2 == null) {
            return "[UDF: " + string + ".null]";
        }
        lov lov2 = lov.Bf(string3);
        if (lov2 == null) {
            return "[ERR: " + string + "." + string2 + "]";
        }
        if (string2.equals("Name")) {
            if (lov2.Title.isEmpty()) {
                return lov2.FirstName + " " + lov2.LastName;
            }
            return lov2.Title + " " + lov2.FirstName + " " + lov2.LastName;
        }
        if (string2.equals("FirstName")) {
            return lov2.FirstName;
        }
        if (string2.equals("LastName")) {
            return lov2.LastName;
        }
        if (string2.equals("Race")) {
            return lpd.rHs.c("Races." + cg.n(lov2.rHf.ordinal()).toLowerCase() + "_DemonymSingular", ccq);
        }
        if (string2.equals("Gender")) {
            return lpd.rHs.c("Framework." + lov2.rHg.toString(), ccq);
        }
        if (string2.equals("IDRace")) {
            return lov2.rHf.toString();
        }
        if (string2.equals("IDGender")) {
            return lov2.rHg.toString();
        }
        return "[UDF: " + string + "." + string2 + "]";
    }

    private String r(String string, String string2, String string3) {
        String string4 = "Attribute.Attribute" + string3;
        return lpd.rHs.c(string4, ccq);
    }

    private String s(String string, String string2, String string3) {
        String string4 = "Holdings." + string3;
        return lpd.rHs.c(string4, ccq);
    }

    private String t(String string, String string2, String string3) {
        if (string2 == null) {
            return "[UDF: " + string + ".null]";
        }
        if (string2.equals("Name") || string2.equals("Description")) {
            String string4 = "SpecialEvents." + string3.replace(' ', '_').replace('-', '_').toLowerCase() + "_" + string2;
            return lpd.rHs.c(string4, ccq);
        }
        return "[UDF: " + string + "." + string2 + "]";
    }

    private String u(String string, String string2, String string3) {
        String string4 = "Villages." + string3;
        return lpd.rHs.c(string4, ccq);
    }

    private String v(String string, String string2, String string3) {
        String string4 = "Tile." + string3;
        return lpd.rHs.c(string4, ccq);
    }

    private String w(String string, String string2, String string3) {
        if (string2 == null) {
            return "[UDF: " + string + ".null]";
        }
        return lpd.rHs.c("Roles." + string3 + "_" + string2, ccq);
    }

    private String x(String string, String string2, String string3) {
        if (string2 == null) {
            return "[UDF: " + string + ".null]";
        }
        return lpd.rHs.c("Perks." + string3 + "_" + string2, ccq);
    }

    private String y(String string, String string2, String string3) {
        if (string2 == null) {
            return "[UDF: " + string + ".null]";
        }
        if (string2.compareToIgnoreCase("IDName") == 0) {
            return string3;
        }
        return lpd.rHs.c("Races." + string3 + "_" + string2, ccq);
    }

    private String z(String string, String string2, String string3) {
        if (string2 == null) {
            return "[UDF: " + string + ".null]";
        }
        return lpd.rHs.c("Vendors." + string3 + "_" + string2, ccq);
    }

    private String A(String string, String string2, String string3) {
        if (string2 == null) {
            return "[UDF: " + string + ".null]";
        }
        return lpd.rHs.c("Quests." + string3 + "_" + string2, ccq);
    }

    private String B(String string, String string2, String string3) {
        if (string2 == null) {
            return "[UDF: " + string + ".null]";
        }
        return lpd.rHs.c("Quests.Nodes." + string3 + "_" + string2, ccq);
    }

    private String C(String string, String string2, String string3) {
        if (string2 == null) {
            return "[UDF: " + string + ".null]";
        }
        return lpd.rHs.c("Quests.Tasks." + string3 + "_" + string2, ccq);
    }

    private String D(String string, String string2, String string3) {
        if (string2 == null) {
            return "[UDF: " + string + ".null]";
        }
        return lpd.rHs.c("Quests.Lines." + string3 + "_" + string2, ccq);
    }

    private String E(String string, String string2, String string3) {
        if (string2 == null) {
            return "[UDF: " + string + ".null]";
        }
        return lpd.rHs.c("Quests.Items." + string3 + "_" + string2, ccq);
    }
}

