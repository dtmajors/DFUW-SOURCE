/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class kaj
extends jzy {
    public static final lju oRy = new lju(0, 1, 0);

    public kaj() {
    }

    public kaj(jzp jzp2) {
        super(jzp2);
    }

    public void dUW() {
        ler ler2 = this.ResourceTree.acv(cug.fkR);
        String string = cug.uE((int)ler2.getType());
        this.L(ler2.getType(), string);
        ler ler3 = this.ResourceTree.g(ler2);
        while (ler3 != null) {
            string = cug.uE((int)ler3.getType());
            this.L(ler3.getType(), string);
            ler3 = this.ResourceTree.h(ler3);
        }
    }

    private void vT(String string) {
        int n = cug.hX((String)string);
        if (n <= 0) {
            throw new bi("File '" + string + "' has invalid name.");
        }
        this.L(n, string);
    }

    private void L(int n, String string) {
        String string2 = "xml-files/server/resourcecontainers/treasure map inventory/" + string;
        try {
            Map<Integer, cup> map;
            Document document = jsy.tJ(string2);
            jsy.a(document, oRy);
            Node node = jsy.d("XML", document);
            cup cup2 = new cup();
            cup2.ResourceType = n;
            Node node2 = jsy.a("SFTreasureMapInventory", node);
            if (node2 != null) {
                cup2.fxO = this.cU(node2);
            }
            if ((map = lea.eoM()).containsKey(cup2.ResourceType)) {
                throw new bg("TreasureMapInventoryInfo for resource '" + cup2.pa() + "' already exists.");
            }
            map.put(cup2.ResourceType, cup2);
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string2 + "' failed.", bg2);
        }
    }
}

