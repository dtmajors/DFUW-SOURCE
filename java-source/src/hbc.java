/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hbc {
    private static final hbe jzX = hbe.jAM;
    private static final String[] jAD = new String[0];
    private static final String[] jAE = new String[]{"SFNeutral", "SFEnglish", "SFGerman"};
    public static final int jAF = 0;
    public static final int jAG = 1;
    public static final int jAH = 2;
    private int jAI = 0;
    private final String jAJ;
    private Map<String, String> jAK;

    public hbc(String string) {
        this.jAJ = string;
        this.LA(0);
    }

    public final void LA(int n) {
        assert (this.jAJ != null);
        if (this.jAI == n) {
            return;
        }
        this.jAI = n;
        switch (this.jAI) {
            case 0: {
                this.jAK = null;
                break;
            }
            case 1: 
            case 2: {
                this.jAK = new HashMap<String, String>();
                jst jst2 = new jst();
                try {
                    jst2.c(this.jAJ, jAE[this.jAI], this.jAK);
                }
                catch (Exception exception) {
                    jzX.error("failed to load the language mapping file: " + exception);
                }
                break;
            }
            default: {
                assert (false) : this.jAI;
                break;
            }
        }
    }

    public final int caN() {
        assert (this.jAJ != null);
        return this.jAI;
    }

    public final String translate(String string) {
        return this.b(string, jAD);
    }

    public final String b(String string, String[] stringArray) {
        assert (this.jAJ != null);
        if (string == null) {
            return "";
        }
        String string2 = string;
        List<String> list = this.a(string2, '%');
        StringBuilder stringBuilder = new StringBuilder();
        if (list.size() > 0) {
            stringBuilder.append(list.get(0));
        }
        int n = 0;
        for (int j = 1; j < list.size(); ++j) {
            String string3 = list.get(j);
            if (string3.length() == 0) {
                stringBuilder.append('%');
                continue;
            }
            char c2 = string3.charAt(0);
            if (c2 < '1' || c2 > '9') {
                stringBuilder.append('%');
                stringBuilder.append(string3);
                continue;
            }
            int n2 = c2 - 49;
            if (n2 >= stringArray.length) {
                stringBuilder.append('%');
                stringBuilder.append(string3);
                continue;
            }
            if (n2 > n) {
                n = n2;
            }
            stringBuilder.append(stringArray[n2]);
            stringBuilder.append(string3.substring(1));
        }
        return lhn.Aj(stringBuilder.toString());
    }

    private List<String> a(String string, char c2) {
        String string2;
        ArrayList<String> arrayList = new ArrayList<String>();
        int n = 0;
        while (true) {
            int n2;
            if ((n2 = string.indexOf(c2, n)) == -1) break;
            string2 = string.substring(n, n2);
            arrayList.add(string2);
            n = n2 + 1;
        }
        string2 = string.substring(n, string.length());
        arrayList.add(string2);
        return arrayList;
    }
}

