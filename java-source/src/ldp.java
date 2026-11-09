/*
 * Decompiled with CFR.
 */
public class ldp {
    public final String[] reW;
    public final String DisplayName;
    public int ksh;

    public ldp(String[] stringArray, int n, String string) {
        this.reW = stringArray;
        if (string != null && !string.isEmpty() && Character.isLowerCase(string.charAt(0))) {
            string = string.substring(0, 1).toUpperCase() + string.substring(1);
        }
        this.DisplayName = string;
        this.ksh = n;
    }
}

