/*
 * Decompiled with CFR.
 */
import java.sql.Timestamp;

public class pz {
    public static final String escape(String string) {
        int n = string.indexOf(92);
        if (n >= 0) {
            string = string.replace("\\", "\\\\");
        }
        if ((n = string.indexOf(39)) >= 0) {
            string = string.replace("'", "\\'");
        }
        return string;
    }

    public static final String e(Object object) {
        if (object == null) {
            return "null";
        }
        if (object instanceof Long) {
            return ((Long)object).toString();
        }
        if (object instanceof Integer) {
            return ((Integer)object).toString();
        }
        if (object instanceof Short) {
            return ((Short)object).toString();
        }
        if (object instanceof Byte) {
            return ((Byte)object).toString();
        }
        if (object instanceof Boolean) {
            return (Boolean)object != false ? "1" : "0";
        }
        if (object instanceof Float) {
            return ((Float)object).toString();
        }
        if (object instanceof Double) {
            return ((Double)object).toString();
        }
        if (object instanceof String) {
            return "'" + pz.escape((String)object) + "'";
        }
        if (object instanceof ldv) {
            return "'" + ((ldv)object).fk() + "'";
        }
        if (object instanceof ljq) {
            return "'" + ((ljq)object).fk() + "'";
        }
        if (object instanceof lcq) {
            return "'" + ((lcq)object).fk() + "'";
        }
        if (object instanceof lgl) {
            return "'" + ((lgl)object).fk() + "'";
        }
        if (object instanceof Timestamp) {
            return "'" + ((Timestamp)object).toString() + "'";
        }
        if (object instanceof mhk) {
            return "'" + ((mhk)object).fk() + "'";
        }
        lfn.b(5, "SFSQLUtils", "createStringForStatement: Don't know how to handle " + object.getClass().getSimpleName() + " values");
        assert (false);
        return null;
    }
}

