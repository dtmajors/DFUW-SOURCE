/*
 * Decompiled with CFR.
 */
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class mhc
extends mgr<mhd> {
    private static final String DwB = "spawn_area";
    private static final String DwC = "restricted_resource";
    private static final String DwD = "spawnable";
    private static final String oTd = "resource_name";
    private mhe DwE = mhe.DwM;
    private Set<String> DwF = null;

    public mhc(mhe mhe2) {
        this.DwE = mhe2;
        this.DvZ = new mhd((short)this.DvY.cf, (short)this.DvY.cg, (short)this.DvY.rmN);
        this.DwF = lcn.emx();
    }

    @Override
    public void oG() {
        this.DvZ = new mhd((short)this.DvY.cf, (short)this.DvY.cg, (short)this.DvY.rmN);
    }

    public boolean c(ljq ljq2, String string) {
        if (string == null) {
            return false;
        }
        if (!this.DwF.contains(string.toLowerCase())) {
            return true;
        }
        return ((mhd)this.DvZ).as(mhc.oh(ljq2.x), mhc.oi(ljq2.rlV));
    }

    public boolean eyX() {
        if (this.DwE == mhe.DwM) {
            return false;
        }
        try {
            this.BP("xml-files/quadtrees/spawnareas/" + this.DwE.toString().toLowerCase() + ".sfqt");
        }
        catch (bh bh2) {
            return false;
        }
        String string = "xml-files/quadtrees/spawn_areas.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getSimpleName(), "parseConfig() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            return false;
        }
        NodeList nodeList = document.getElementsByTagName(DwB);
        for (int i = 0; i < nodeList.getLength(); ++i) {
            Element element;
            String string2;
            Node node = nodeList.item(i);
            if (node.getNodeType() != 1 || this.DwE != mhe.parse(string2 = (element = (Element)node).getAttribute(DwD))) continue;
            NodeList nodeList2 = element.getElementsByTagName(DwC);
            for (int j = 0; j < nodeList2.getLength(); ++j) {
                Element element2;
                String string3;
                Node node2 = nodeList2.item(j);
                if (node2.getNodeType() != 1 || (string3 = (element2 = (Element)node2).getAttribute(oTd)) == null || string3.isEmpty() || this.DwF.contains(string3.toLowerCase())) continue;
                this.DwF.add(string3.toLowerCase());
            }
            return true;
        }
        return false;
    }
}

