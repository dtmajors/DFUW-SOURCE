/*
 * Decompiled with CFR.
 */
import java.util.List;

public class on {
    public String ResourceName;
    public int ayN;

    public on(String string, int n2) {
        this.ResourceName = string;
        this.ayN = n2;
    }

    public final String fk() {
        return pr.b(':', this.ResourceName, String.valueOf(this.ayN));
    }

    public static on bP(String string) {
        List<String> list = pr.a(':', string);
        if (list == null || list.size() != 2) {
            lfn.b(5, "SFStorableObjectQuestTarget", "fromDBString: Can't parse '" + string + "'");
            return null;
        }
        String string2 = list.get(0);
        int n2 = lea.enW().getType(string2);
        if (n2 == -1) {
            lfn.b(5, "SFStorableObjectQuestTarget", "fromDBString: Can't parse '" + string + "'");
            return null;
        }
        int n3 = 0;
        try {
            n3 = Integer.valueOf(list.get(1));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFStorableObjectQuestTarget", "fromDBString: Can't parse '" + list.get(1) + "' as an int.");
            n3 = 0;
        }
        on on2 = new on(string2, n3);
        return on2;
    }
}

