/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jzq
extends jzy {
    public static final lju oRy = new lju(0, 1, 0);

    public void dUN() {
        String string;
        ler ler2 = this.ResourceTree.acv(cug.fjJ);
        ler ler3 = this.ResourceTree.g(ler2);
        while (ler3 != null) {
            string = cug.uD((int)ler3.getType());
            this.K(ler3.getType(), string);
            ler3 = this.ResourceTree.h(ler3);
        }
        ler2 = this.ResourceTree.acv(cug.fwA);
        ler3 = this.ResourceTree.g(ler2);
        while (ler3 != null) {
            string = cug.uD((int)ler3.getType());
            this.K(ler3.getType(), string);
            ler3 = this.ResourceTree.h(ler3);
        }
        ler2 = this.ResourceTree.acv(cug.fjK);
        ler3 = this.ResourceTree.g(ler2);
        while (ler3 != null) {
            string = cug.uD((int)ler3.getType());
            this.K(ler3.getType(), string);
            ler3 = this.ResourceTree.h(ler3);
        }
        ler2 = this.ResourceTree.acv(cug.fjL);
        ler3 = this.ResourceTree.g(ler2);
        while (ler3 != null) {
            string = cug.uD((int)ler3.getType());
            this.K(ler3.getType(), string);
            ler3 = this.ResourceTree.h(ler3);
        }
    }

    private void K(int n, String string) {
        String string2 = "xml-files/server/resourcecontainers/chest inventory/" + string;
        if (!jry.tj(string2)) {
            return;
        }
        try {
            Document document = jsy.tJ(string2);
            jsy.a(document, oRy);
            Node node = jsy.d("XML", document);
            csw csw2 = new csw();
            csw2.ResourceType = n;
            Node node2 = jsy.d("SFChestInventory", node);
            double d2 = jsy.e(node2, "MaxSpawnTime");
            if (d2 <= 0.0) {
                throw new bj("Attribute 'MaxSpawnTime' has invalid value.");
            }
            double d3 = jsy.e(node2, "MinSpawnTime");
            if (d3 < 0.0) {
                throw new bj("Attribute 'MinSpawnTime' has invalid value.");
            }
            if (d2 <= d3) {
                throw new bg("MaximumSpawnTime <= MinimumSpawnTime.");
            }
            csw2.fdY = d2 * 60.0;
            csw2.fdZ = d3 * 60.0;
            csw2.fea = this.cU(node2);
            Map<Integer, csw> map = lea.eoT();
            if (map.containsKey(csw2.ResourceType)) {
                throw new bg("ChestInventoryInfo for resource '" + csw2.pa() + "' already exists.");
            }
            map.put(csw2.ResourceType, csw2);
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string2 + "' failed.", bg2);
        }
    }
}

