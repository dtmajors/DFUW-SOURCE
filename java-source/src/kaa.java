/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcw
 */
import java.io.File;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class kaa
extends jzy {
    public static final lju oRy = new lju(0, 1, 0);

    public void dUR() {
        this.ve(true);
    }

    public void dUS() {
        this.ve(false);
    }

    public void ve(boolean bl) {
        File file = new File(lcw.qLb + "xml-files/server/resourcecontainers/monster inventory/");
        String[] stringArray = file.list();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            try {
                if (!stringArray[i2].endsWith(".xml")) continue;
                this.N(stringArray[i2], bl);
                continue;
            }
            catch (bg bg2) {
                assert (false);
                continue;
            }
        }
    }

    public void Wp(int n) {
        this.ak(n, false);
    }

    public void ak(int n, boolean bl) {
        if (!this.ResourceTree.isDescendant(n, cug.fgG)) {
            throw new bi("Resource '" + this.ResourceTree.getName(n) + "' is not a monster.");
        }
        String string = cug.uQ((int)n);
        this.c(n, string, bl);
    }

    public ctq vO(String string) {
        return this.N(string, true);
    }

    public ctq N(String string, boolean bl) {
        int n = cug.hY((String)string);
        if (n <= 0) {
            throw new bi("File '" + string + "' has invalid name.");
        }
        this.c(n, string, bl);
        return lea.eoJ().get(n);
    }

    private void c(int n, String string, boolean bl) {
        String string2 = "xml-files/server/resourcecontainers/monster inventory/" + string;
        try {
            Document document = jsy.tJ(string2);
            jsy.a(document, oRy);
            Node node = jsy.d("XML", document);
            ctq ctq2 = new ctq();
            ctq2.ResourceType = n;
            Node node2 = jsy.a("SFLootInventory", node);
            if (node2 != null) {
                ctq2.fgc = this.cU(node2);
            }
            node2 = jsy.d("SFSkinningInventory", node);
            ctq2.fgg = this.cU(node2);
            Map<Integer, ctq> map = lea.eoJ();
            if (bl || map.containsKey(ctq2.ResourceType)) {
                // empty if block
            }
            map.put(ctq2.ResourceType, ctq2);
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string2 + "' failed.", bg2);
        }
    }
}

