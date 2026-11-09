/*
 * Decompiled with CFR.
 */
import java.text.DecimalFormat;

public class isr {
    public static void d(StringBuilder stringBuilder) {
        stringBuilder.append("^");
    }

    public static void e(StringBuilder stringBuilder) {
        stringBuilder.append("$");
    }

    public static void f(StringBuilder stringBuilder) {
        stringBuilder.append("0-9");
    }

    public static void g(StringBuilder stringBuilder) {
        char c2 = ((DecimalFormat)DecimalFormat.getInstance()).getDecimalFormatSymbols().getDecimalSeparator();
        String string = String.format("%04x", c2);
        stringBuilder.append("\\u" + string + "{1}");
    }

    public static void h(StringBuilder stringBuilder) {
        stringBuilder.append("[");
        stringBuilder.append(" ");
        isr.f(stringBuilder);
        stringBuilder.append(".");
        stringBuilder.append("a-z");
        stringBuilder.append("A-Z");
        stringBuilder.append("\u1100-\u11ff");
        stringBuilder.append("\ua960-\ua97c");
        stringBuilder.append("\ud7b0-\ud7fb");
        stringBuilder.append("\u3131-\u318e");
        stringBuilder.append("\u302e-\u302f");
        stringBuilder.append("\uac00-\ud7a3");
        stringBuilder.append("\u3200-\u321e");
        stringBuilder.append("\u3260-\u327e");
        stringBuilder.append("\u3000-\u303f");
        stringBuilder.append("\u3040-\u309f");
        stringBuilder.append("\u30a0-\u30ff");
        stringBuilder.append("\uff00-\uffef");
        stringBuilder.append("\u4e00-\u9faf");
        stringBuilder.append("]");
    }

    public static void a(StringBuilder stringBuilder, int n, int n2) {
        stringBuilder.append("{");
        stringBuilder.append(n);
        stringBuilder.append(",");
        stringBuilder.append(n2);
        stringBuilder.append("}");
    }

    public static String eN(int n, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        isr.d(stringBuilder);
        isr.h(stringBuilder);
        isr.a(stringBuilder, n, n2);
        isr.e(stringBuilder);
        return stringBuilder.toString();
    }

    public static String dpZ() {
        StringBuilder stringBuilder = new StringBuilder();
        isr.d(stringBuilder);
        stringBuilder.append("[");
        isr.f(stringBuilder);
        stringBuilder.append("]+");
        isr.g(stringBuilder);
        stringBuilder.append("[");
        isr.f(stringBuilder);
        stringBuilder.append("]+");
        isr.e(stringBuilder);
        return stringBuilder.toString();
    }

    public static String dqa() {
        StringBuilder stringBuilder = new StringBuilder();
        isr.d(stringBuilder);
        stringBuilder.append("[");
        isr.f(stringBuilder);
        stringBuilder.append("]*");
        isr.e(stringBuilder);
        return stringBuilder.toString();
    }
}

