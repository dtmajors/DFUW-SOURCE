/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public class hzy {
    public static void a(StringBuilder stringBuilder, Integer n) {
        stringBuilder.append(',');
        if (n != null) {
            stringBuilder.append(n);
        }
    }

    public static void a(StringBuilder stringBuilder, Float f) {
        stringBuilder.append(',');
        if (f != null) {
            stringBuilder.append(f);
        }
    }

    public static void a(StringBuilder stringBuilder, Boolean bl) {
        stringBuilder.append(',');
        if (bl != null) {
            stringBuilder.append(bl);
        }
    }

    public static void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(',');
        if (string != null) {
            stringBuilder.append(string.replaceAll("'", "_"));
        }
    }

    public static void a(StringBuilder stringBuilder, lil<Integer, Float, Float> lil2) {
        stringBuilder.append(',');
        if (lil2 != null) {
            stringBuilder.append('[');
            hzy.a(stringBuilder, (Integer)lil2.reX);
            hzy.a(stringBuilder, (Float)lil2.reY);
            hzy.a(stringBuilder, (Float)lil2.reZ);
            stringBuilder.append(']');
        }
    }

    public static void b(StringBuilder stringBuilder, lil<Integer, Integer, Float> lil2) {
        stringBuilder.append(',');
        if (lil2 != null) {
            stringBuilder.append('[');
            hzy.a(stringBuilder, (Integer)lil2.reX);
            hzy.a(stringBuilder, (Integer)lil2.reY);
            hzy.a(stringBuilder, (Float)lil2.reZ);
            stringBuilder.append(']');
        }
    }

    public static void c(StringBuilder stringBuilder, lil<Float, Float, Boolean> lil2) {
        stringBuilder.append(',');
        if (lil2 != null) {
            stringBuilder.append('[');
            hzy.a(stringBuilder, (Float)lil2.reX);
            hzy.a(stringBuilder, (Float)lil2.reY);
            hzy.a(stringBuilder, (Boolean)lil2.reZ);
            stringBuilder.append(']');
        }
    }

    public static void a(StringBuilder stringBuilder, ArrayList<lil<Integer, Float, Float>> arrayList) {
        stringBuilder.append(',');
        if (arrayList != null) {
            stringBuilder.append('[');
            for (lil<Integer, Float, Float> lil2 : arrayList) {
                hzy.a(stringBuilder, lil2);
            }
            stringBuilder.append(']');
        }
    }

    public static void b(StringBuilder stringBuilder, ArrayList<lil<Integer, Integer, Float>> arrayList) {
        stringBuilder.append(',');
        if (arrayList != null) {
            stringBuilder.append('[');
            for (lil<Integer, Integer, Float> lil2 : arrayList) {
                hzy.b(stringBuilder, lil2);
            }
            stringBuilder.append(']');
        }
    }

    public static void a(StringBuilder stringBuilder, ljq ljq2) {
        stringBuilder.append(',');
        if (ljq2 != null) {
            stringBuilder.append('[');
            hzy.a(stringBuilder, Float.valueOf(ljq2.x));
            hzy.a(stringBuilder, Float.valueOf(ljq2.y));
            hzy.a(stringBuilder, Float.valueOf(ljq2.rlV));
            stringBuilder.append(']');
        }
    }

    public static void a(StringBuilder stringBuilder, lfs<Integer, Integer> lfs2) {
        stringBuilder.append(',');
        if (lfs2 != null) {
            stringBuilder.append('[');
            hzy.a(stringBuilder, (Integer)lfs2.reX);
            hzy.a(stringBuilder, (Integer)lfs2.reY);
            stringBuilder.append(']');
        }
    }

    public static void b(StringBuilder stringBuilder, lfs<Integer, Float> lfs2) {
        stringBuilder.append(',');
        if (lfs2 != null) {
            stringBuilder.append('[');
            hzy.a(stringBuilder, (Integer)lfs2.reX);
            hzy.a(stringBuilder, (Float)lfs2.reY);
            stringBuilder.append(']');
        }
    }

    public static void c(StringBuilder stringBuilder, ArrayList<lfs<Integer, Integer>> arrayList) {
        stringBuilder.append(',');
        if (arrayList != null) {
            stringBuilder.append('[');
            for (lfs<Integer, Integer> lfs2 : arrayList) {
                hzy.a(stringBuilder, lfs2);
            }
            stringBuilder.append(']');
        }
    }

    public static void d(StringBuilder stringBuilder, ArrayList<lfs<Integer, Float>> arrayList) {
        stringBuilder.append(',');
        if (arrayList != null) {
            stringBuilder.append('[');
            for (lfs<Integer, Float> lfs2 : arrayList) {
                hzy.b(stringBuilder, lfs2);
            }
            stringBuilder.append(']');
        }
    }

    public static void e(StringBuilder stringBuilder, ArrayList<String> arrayList) {
        stringBuilder.append(',');
        if (arrayList != null) {
            stringBuilder.append('[');
            for (String string : arrayList) {
                hzy.a(stringBuilder, string);
            }
            stringBuilder.append(']');
        }
    }

    public static Integer ot(String string) {
        return string != null && string.length() > 0 ? Integer.valueOf(Integer.parseInt(string)) : null;
    }

    public static Float ou(String string) {
        return string != null && string.length() > 0 ? Float.valueOf(Float.parseFloat(string)) : null;
    }

    public static Boolean ov(String string) {
        return string != null && string.length() > 0 ? Boolean.valueOf(Boolean.parseBoolean(string)) : null;
    }

    public static String ow(String string) {
        return string != null && string.length() > 0 ? string.replaceAll("_", "'") : null;
    }

    public static lil<Integer, Float, Float> ox(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        string = string.substring(1, string.length() - 1);
        String[] stringArray = hzy.split(string);
        return new lil<Integer, Float, Float>(hzy.ot(stringArray[1]), hzy.ou(stringArray[2]), hzy.ou(stringArray[3]));
    }

    public static lil<Float, Float, Boolean> oy(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        string = string.substring(1, string.length() - 1);
        String[] stringArray = hzy.split(string);
        return new lil<Float, Float, Boolean>(hzy.ou(stringArray[1]), hzy.ou(stringArray[2]), hzy.ov(stringArray[3]));
    }

    public static lil<Integer, Integer, Float> oz(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        string = string.substring(1, string.length() - 1);
        String[] stringArray = hzy.split(string);
        return new lil<Integer, Integer, Float>(hzy.ot(stringArray[1]), hzy.ot(stringArray[2]), hzy.ou(stringArray[3]));
    }

    public static ArrayList<lil<Integer, Float, Float>> oA(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        string = string.substring(1, string.length() - 1);
        String[] stringArray = hzy.split(string);
        ArrayList<lil<Integer, Float, Float>> arrayList = new ArrayList<lil<Integer, Float, Float>>();
        for (int j = 1; j < stringArray.length; ++j) {
            arrayList.add(hzy.ox(stringArray[j]));
        }
        return arrayList;
    }

    public static ArrayList<lil<Integer, Integer, Float>> oB(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        string = string.substring(1, string.length() - 1);
        String[] stringArray = hzy.split(string);
        ArrayList<lil<Integer, Integer, Float>> arrayList = new ArrayList<lil<Integer, Integer, Float>>();
        for (int j = 1; j < stringArray.length; ++j) {
            arrayList.add(hzy.oz(stringArray[j]));
        }
        return arrayList;
    }

    public static lfs<Integer, Integer> oC(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        string = string.substring(1, string.length() - 1);
        String[] stringArray = hzy.split(string);
        return new lfs<Integer, Integer>(hzy.ot(stringArray[1]), hzy.ot(stringArray[2]));
    }

    public static lfs<Integer, Float> oD(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        string = string.substring(1, string.length() - 1);
        String[] stringArray = hzy.split(string);
        return new lfs<Integer, Float>(hzy.ot(stringArray[1]), hzy.ou(stringArray[2]));
    }

    public static ArrayList<lfs<Integer, Integer>> oE(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        string = string.substring(1, string.length() - 1);
        String[] stringArray = hzy.split(string);
        ArrayList<lfs<Integer, Integer>> arrayList = new ArrayList<lfs<Integer, Integer>>();
        for (int j = 1; j < stringArray.length; ++j) {
            arrayList.add(hzy.oC(stringArray[j]));
        }
        return arrayList;
    }

    public static ArrayList<lfs<Integer, Float>> oF(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        string = string.substring(1, string.length() - 1);
        String[] stringArray = hzy.split(string);
        ArrayList<lfs<Integer, Float>> arrayList = new ArrayList<lfs<Integer, Float>>();
        for (int j = 1; j < stringArray.length; ++j) {
            arrayList.add(hzy.oD(stringArray[j]));
        }
        return arrayList;
    }

    public static ArrayList<String> oG(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        string = string.substring(1, string.length() - 1);
        String[] stringArray = hzy.split(string);
        ArrayList<String> arrayList = lcn.emv();
        for (int j = 1; j < stringArray.length; ++j) {
            arrayList.add(hzy.ow(stringArray[j]));
        }
        return arrayList;
    }

    public static ljq oH(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        string = string.substring(1, string.length() - 1);
        String[] stringArray = hzy.split(string);
        return new ljq(hzy.ou(stringArray[1]).floatValue(), hzy.ou(stringArray[2]).floatValue(), hzy.ou(stringArray[3]).floatValue());
    }

    public static String[] split(String string) {
        return lhn.a(string, ',', "[", "]");
    }
}

