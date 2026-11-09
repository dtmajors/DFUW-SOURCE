/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public abstract class dvx {
    private static final SimpleDateFormat hhR = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    protected dvx() {
    }

    protected static String jD(String string) {
        return (string == null ? "" : string + ".") + "GameID = " + lcw.qGe + " AND " + (string == null ? "" : string + ".") + "WorldID = " + lcw.qGf;
    }

    protected static String a(Enum enum_, String string) {
        return enum_ == null ? null : (string == null ? "" : string + ".") + enum_.name();
    }

    protected static String a(Enum[] enumArray, String string) {
        if (enumArray == null || enumArray.length == 0) {
            return null;
        }
        boolean bl = string != null;
        String string2 = string + ".";
        String string3 = (bl ? string2 : "") + enumArray[0].name();
        for (int i = 1; i < enumArray.length; ++i) {
            string3 = string3 + ", " + (bl ? string2 : "") + enumArray[i].name();
        }
        return string3;
    }

    protected static String cB(ljq ljq2) {
        if (ljq2 == null) {
            return "Invalid Position";
        }
        String string = lcw.dZ((ljq)ljq2);
        if (string == null) {
            string = dvx.aD("Invalid Position");
        }
        return string;
    }

    public static boolean b(lmi lmi2) {
        return lmi2 == null || lmi2.euR() || !(lmi2 instanceof lml) ? false : ((lml)lmi2).getValue() != 0;
    }

    public static String c(lmi lmi2) {
        return lmi2 == null || lmi2.euR() || !(lmi2 instanceof lmp) ? null : ((lmp)lmi2).getValue();
    }

    public static int d(lmi lmi2) {
        return lmi2 == null || lmi2.euR() || !(lmi2 instanceof lml) ? Integer.MAX_VALUE : ((lml)lmi2).getValue();
    }

    public static float e(lmi lmi2) {
        return lmi2 == null || lmi2.euR() || !(lmi2 instanceof lmk) ? Float.MAX_VALUE : ((lmk)lmi2).getValue();
    }

    public static double f(lmi lmi2) {
        return lmi2 == null || lmi2.euR() || !(lmi2 instanceof lmh) ? Double.MAX_VALUE : ((lmh)lmi2).getValue();
    }

    public static long g(lmi lmi2) {
        return lmi2 == null || lmi2.euR() || !(lmi2 instanceof lmm) ? Long.MAX_VALUE : ((lmm)lmi2).getValue();
    }

    public static ldv h(lmi lmi2) {
        if (lmi2 == null || lmi2.euR()) {
            return null;
        }
        if (lmi2 instanceof lmm) {
            long l2 = ((lmm)lmi2).getValue();
            return l2 >= 0L ? ldv.aw(l2) : lcr.qAC;
        }
        if (lmi2 instanceof lmp) {
            String string = ((lmp)lmi2).getValue();
            return string == null ? lcr.qAC : ldv.zp(string);
        }
        return null;
    }

    public static Timestamp i(lmi lmi2) {
        if (lmi2 == null || lmi2.euR() || !(lmi2 instanceof lmp)) {
            return null;
        }
        try {
            return new Timestamp(hhR.parse(((lmp)lmi2).getValue()).getTime());
        }
        catch (ParseException parseException) {
            return null;
        }
    }

    public static ljq j(lmi lmi2) {
        if (lmi2 == null || lmi2.euR() || !(lmi2 instanceof lmp)) {
            return null;
        }
        try {
            return ljq.Au(((lmp)lmi2).getValue());
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public static String bCo() {
        return "UPDATE login_character_state SET " + dvx.a(a.hhV, null) + " = " + lcw.qGo + " " + "WHERE " + dvx.jD(null);
    }

    public static String bCp() {
        return "CALL startHighscoreManagement(" + lcw.qGe + ", " + lcw.qGf + ")";
    }

    protected String a(char c2, int n) {
        String string = "";
        for (int i = 0; i < n; ++i) {
            string = string + c2;
        }
        return string;
    }

    public static String aD(String string) {
        if (string == null || string.trim().isEmpty()) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char[] cArray = string.trim().toCharArray();
        block3: for (int i = 0; i < cArray.length; ++i) {
            switch (cArray[i]) {
                case '\"': 
                case '\'': 
                case '\\': {
                    stringBuffer.append("\\" + cArray[i]);
                    continue block3;
                }
                default: {
                    stringBuffer.append(cArray[i]);
                }
            }
        }
        return "'" + stringBuffer.toString() + "'";
    }
}

