/*
 * Decompiled with CFR.
 */
public class nl
extends na {
    public String aCI;
    public int asi;

    public String fk() {
        return this.aCI + ":" + this.asi;
    }

    public static nl bM(String string) {
        int n2 = string.indexOf(58);
        if (n2 < 0) {
            lfn.b(5, "SFStorableObjectLevyCollectorItem", "fromDBString: Can't parse '" + string + "'");
            return null;
        }
        nl nl2 = new nl();
        try {
            nl2.aCI = string.substring(0, n2);
            nl2.asi = Integer.parseInt(string.substring(n2 + 1));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFStorableObjectLevyCollectorItem", "fromDBString: Can't parse '" + string + "'");
            return null;
        }
        return nl2;
    }
}

