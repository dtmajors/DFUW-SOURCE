/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public abstract class avv
extends aul {
    protected les ResourceTree = lea.enW();
    protected cul ala = new cul();
    protected les aqN = lea.enZ();

    public avv(amd amd2) {
        super(amd2);
    }

    protected final List<cte> ba(String string) {
        assert (string != null);
        ArrayList<cte> arrayList = lcn.emv();
        StringTokenizer stringTokenizer = new StringTokenizer(string.trim(), ";");
        String string2 = null;
        cte cte2 = null;
        while (stringTokenizer.hasMoreTokens()) {
            String string3 = stringTokenizer.nextToken().trim();
            cte2 = new cte();
            int n = string3.indexOf(58);
            if (n < 0) {
                string2 = string3;
                cte2.asi = 0;
            } else {
                string2 = string3.substring(0, n).trim();
                String string4 = string3.substring(n + 1, string3.length()).trim();
                if ((n = string4.indexOf(58)) < 0) {
                    if (string4.equalsIgnoreCase("true") || string4.equalsIgnoreCase("false")) {
                        cte2.fex = Boolean.parseBoolean(string4);
                    } else {
                        cte2.asi = this.bb(string4);
                    }
                } else {
                    String string5 = string4.substring(0, n);
                    cte2.asi = this.bb(string5);
                    String string6 = string4.substring(n + 1, string4.length());
                    cte2.fex = Boolean.parseBoolean(string6);
                }
            }
            if (string2 != null && string2.startsWith("*")) {
                string2 = string2.replace("*", "");
                if (cte2.asi > 0) {
                    this.ala.a(string2, cte2.asi, arrayList);
                    continue;
                }
                this.ala.a(string2, arrayList);
                continue;
            }
            cte2.ResourceType = this.ResourceTree.getType(string2);
            if (cte2.ResourceType <= 0) {
                lfn.b(5, "SFChatProxyUtil", "createEquipmentItems() ResourceName '" + string2 + "' is invalid.");
                continue;
            }
            this.ala.a(cte2.ResourceType, cte2.asi, cte2.fex, arrayList);
        }
        return arrayList;
    }

    private int bb(String string) {
        try {
            int n = Integer.parseInt(string);
            if (n < 0) {
                lfn.b(5, "SFChatProxyUtil", "parseQuantityString() QuantityString '" + string + "' is invalid.");
                return 0;
            }
            return n;
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFChatProxyUtil", "parseQuantityString() " + numberFormatException);
            return 0;
        }
    }
}

