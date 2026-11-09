/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Collection;
import org.w3c.dom.Document;

public class cu {
    private static Collection<a> kO = null;

    public static int O(String string) {
        int n = 0;
        for (int i = 0; i < string.length(); ++i) {
            char c2 = string.charAt(i);
            if (Character.isLetter(c2)) {
                if (c2 >= 'a' && c2 <= 'z' || c2 >= 'A' && c2 <= 'Z') {
                    ++n;
                    continue;
                }
                n += 2;
                continue;
            }
            ++n;
        }
        return n;
    }

    public static b a(String string, String string2, hc hc2, Collection<String> collection) {
        String string3;
        b b2;
        Collection<a> collection2 = cu.ct();
        if (hc2.ordinal() >= hc.aaA.ordinal()) {
            collection2 = null;
        }
        if ((b2 = c.a(string, string2, collection2)) != b.kX) {
            return b2;
        }
        if (collection != null && collection.contains((string3 = string + " " + string2).toLowerCase())) {
            return b.lk;
        }
        return b.kX;
    }

    private static Collection<a> ct() {
        if (kO == null) {
            Document document = null;
            try {
                document = jsy.tJ("xml-files/client/cc_config/" + (lcw.emW() ? "blacklist_kr.xml" : "blacklist.xml"));
                kO = a.b(document);
            }
            catch (bo bo2) {
                lfn.b(5, "SFCharacterCreatorUtility", "getBlacklist: Document Parse Exception: " + bo2);
                return null;
            }
        }
        return kO;
    }
}

