/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  ep
 *  lcw
 */
import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import spenefett.util.jni.SFJNIUtils;

public class kxm {
    public static final lju oRy = new lju(0, 1, 0);
    private static final String qgB = "SFAttributeInfoHarvester [-f:<filename>] [-w]";
    private final jzp oRz = new jzp();
    private final les ResourceTree = lea.enW();
    private final jta oQa = new jta();
    private final kal oRX = new kal();
    private final kar pdI = new kar();
    private Map<Integer, kxn> qgC = lcn.emw();
    private final Map<Integer, cuf> qgD = lcn.emw();
    private final Map<Integer, cum> qgE = lcn.emw();
    private boolean qgF = false;
    private final StringBuilder qgG = new StringBuilder();

    public kxm(boolean bl) {
        this.qgF = bl;
    }

    public static void main(String[] stringArray) {
        lcw.qHF = 20;
        lfn.eqw().a(lfp.a.rks);
        String string = SFJNIUtils.getBasePath();
        if (!string.endsWith("\\")) {
            string = string + "/";
        }
        lcw.qLb = string + "dfdata" + "/";
        lfn.b(0, "SFAttributeInfoHarvester", "main() '" + lcw.qLb + "'");
        try {
            String string2 = lcw.qLb + "xml-files/server/resource/";
            boolean bl = false;
            boolean bl2 = true;
            String string3 = null;
            if (stringArray != null) {
                int n = stringArray.length;
                for (int i = 0; i < n; ++i) {
                    if (stringArray[i].startsWith("-f")) {
                        bl2 = false;
                        string3 = stringArray[i].substring(3, stringArray[i].length());
                        continue;
                    }
                    if (stringArray[i].startsWith("-w")) {
                        bl = true;
                        continue;
                    }
                    lfn.b(5, "SFAttributeInfoHarvester", "main() Invalid arguments provided.");
                    lfn.b(5, "", qgB);
                    return;
                }
            }
            kxm kxm2 = new kxm(false);
            if (bl2) {
                kxm2.b(string2, bl, true);
            } else {
                kxm2.xn(string3);
            }
        }
        catch (Exception exception) {
            lfn.log("SFAttributeInfoHarvester", exception);
        }
        try {
            Thread.sleep(1000L);
        }
        catch (Exception exception) {
            // empty catch block
        }
        lfn.b(0, "SFAttributeInfoHarvester", "main() Done..");
    }

    public String getErrorString() {
        String string = this.qgG.toString();
        this.qgG.delete(0, this.qgG.length());
        return string;
    }

    public void xn(String string) {
        this.b(2, "SFAttributeInfoHarvester", "harvestDataFromFile() Starting harvester...");
        this.xP(true);
        try {
            this.eL(string);
        }
        catch (bg bg2) {
            throw new bs("Parsing of file '" + string + "' failed.", bg2);
        }
        this.b(2, "SFAttributeInfoHarvester", "harvestDataFromFile() Finished harvesting");
    }

    public void b(String string, boolean bl, boolean bl2) {
        this.b(2, "SFAttributeInfoHarvester", "harvestDataFromDirectory() Starting harvester...");
        this.xP(bl2);
        try {
            this.R(string, !bl);
        }
        catch (bg bg2) {
            throw new bs("Parsing of directory '" + string + "' failed.", bg2);
        }
        if (bl) {
            String string2 = lcw.qLb + "xml-files/common/crafting/" + "resourceattributeinfo.xml";
            this.xo(string2);
            string2 = lcw.qLb + "xml-files/common/crafting/" + "resourcevendorinfo.xml";
            this.xp(string2);
        }
        this.b(2, "SFAttributeInfoHarvester", "harvestDataFromDirectory() Finished harvesting");
    }

    private void R(String string, boolean bl) {
        if (string == null || string.trim().equals("")) {
            throw new bg("DirectoryPath is invalid.");
        }
        jrw jrw2 = new jrw(string);
        if (!jrw2.exists()) {
            throw new bg("DirectoryPath '" + string + "' is invalid.");
        }
        jrw[] jrwArray = jrw2.a(new FileFilter(this){
            final /* synthetic */ kxm qgH;
            {
                this.qgH = kxm2;
            }

            public boolean accept(File file) {
                String string = file.getName().toLowerCase();
                return string.startsWith("r_") && string.endsWith(".xml");
            }
        });
        this.a(jrwArray, bl);
    }

    private void eL(String string) {
        String string2;
        jrw jrw2;
        if (string == null || string.trim().equals("")) {
            throw new bg("DirectoryPath is invalid.");
        }
        if (!string.endsWith(".xml")) {
            string = string + ".xml";
        }
        if (!(jrw2 = new jrw(string2 = lcw.qLb + "xml-files/server/resource/" + string.trim())).exists()) {
            throw new bg("FilePath '" + string2 + "' is invalid.");
        }
        this.a(new jrw[]{jrw2}, false);
    }

    private void b(int n, String string, String string2) {
        if (this.qgF) {
            this.qgG.append("(");
            this.qgG.append(lfn.rkl[n]);
            this.qgG.append(") ");
            this.qgG.append(string);
            this.qgG.append(": ");
            this.qgG.append(string2);
            this.qgG.append("\n");
        }
        lfn.b(n, string, string2);
    }

    private void a(String string, Throwable throwable) {
        if (this.qgF) {
            this.qgG.append("(");
            this.qgG.append(lfn.rkl[5]);
            this.qgG.append(") ");
            this.qgG.append(string);
            this.qgG.append(": ");
            this.qgG.append(lfn.b(string, throwable));
            this.qgG.append("\n");
        }
        lfn.log(string, throwable);
    }

    private boolean j(int n, List<ej> list) {
        assert (n > 0);
        assert (list != null);
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            ej ej2 = list.get(i);
            if (ej2.getType() != n) continue;
            return true;
        }
        return false;
    }

    private boolean bV(List<ej> list) {
        Map<Integer, ej> map = lcn.emw();
        for (ej ej2 : list) {
            if (map.containsKey(ej2.getType())) {
                this.b(5, "SFAttributeInfoHarvester", "containsDuplicateAttributes() Duplicate attribute found: '" + ej2.getName() + "'");
                return true;
            }
            map.put(ej2.getType(), ej2);
        }
        return false;
    }

    private void a(int n, kxn kxn2, List<ej> list) {
        assert (n > 0);
        assert (kxn2 != null);
        assert (list != null);
        assert (!list.isEmpty());
        kxt[] kxtArray = list.iterator();
        block5: while (kxtArray.hasNext()) {
            ej ej2 = kxtArray.next();
            if (kxn2.aaR(ej2.getType())) continue;
            kxtArray.remove();
            if (!ep.aE((int)ej2.getType())) continue;
            if (ej2.getDataType() == 1) {
                if (cug.uy((int)n)) continue;
                throw new bg("Resource '" + this.ResourceTree.getName(n) + " contains illegal enchantment attribute.");
            }
            switch (kxn2.qgK) {
                case qgM: {
                    continue block5;
                }
                case qgN: {
                    if (ep.aY((int)ej2.getType())) continue block5;
                    this.b(5, "SFAttributeInfoHarvester", "filterAttributeList() Attribute '" + ej2.getName() + "' should be removed.");
                    continue block5;
                }
                case qgO: {
                    this.b(5, "SFAttributeInfoHarvester", "filterAttributeList() Attribute '" + ej2.getName() + "' should be removed.");
                    continue block5;
                }
            }
            throw new bg("Invalid attributeconfigtype found: " + (Object)((Object)kxn2.qgK));
        }
        if (list.isEmpty()) {
            throw new bg("AttributeList is empty after filtering.");
        }
        if (!kxn2.eil() && list.size() != kxn2.qgL.length) {
            this.b(5, "SFAttributeInfoHarvester", "filterAttributeList() AttList.size=" + list.size() + " RuleForProperties.Length=" + kxn2.qgL.length);
        }
        kxtArray = kxn2.qgL;
        int n2 = kxtArray.length;
        for (int i = 0; i < n2; ++i) {
            boolean bl = false;
            Iterator<ej> iterator = list.iterator();
            while (iterator.hasNext()) {
                ej ej3 = iterator.next();
                if (!kxtArray[i].aaR(ej3.getType())) continue;
                bl = true;
                if (kxtArray[i].qgQ) break;
                iterator.remove();
                break;
            }
            if (bl) continue;
            this.b(5, "SFAttributeInfoHarvester", "filterAttributeList() Attribute '" + kxtArray[i].getPropertyName() + "' was not found.");
        }
    }

    private List<ej> a(int n, kxn kxn2, jrw jrw2) {
        assert (n > 0);
        assert (kxn2 != null);
        if (jrw2 == null) {
            throw new bg("ResourceFile is null.");
        }
        if (!jrw2.exists()) {
            throw new bg("SFFile '" + jrw2 + "' was not found.");
        }
        try {
            Document document = jsy.n(jrw2);
            jsy.a(document, oRy);
            Node node = jsy.d("SFResource", document);
            List<ej> list = this.oRz.cH(node);
            if (list == null || list.isEmpty()) {
                this.b(0, "SFAttributeInfoHarvester", "getAttributes() Resource '" + this.ResourceTree.getName(n) + "' contains no attributes.");
                return lcn.abH(0);
            }
            if (this.bV(list)) {
                throw new bg("Resource '" + this.ResourceTree.getName(n) + "' contains a duplicate attribute.");
            }
            this.a(n, kxn2, list);
            return list;
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + jrw2.getName() + "' failed.", bg2);
        }
    }

    private kxn aaP(int n) {
        int n2 = n;
        do {
            Integer n3;
            kxn kxn2;
            if ((kxn2 = this.qgC.get(n3 = new Integer(n2))) == null || kxn2.aaS(n2)) continue;
            return kxn2;
        } while ((n2 = this.ResourceTree.uW(n2)) > 0);
        return null;
    }

    private int a(int n, jrw jrw2) {
        assert (n > 0);
        if (jrw2 == null) {
            throw new bg("ResourceFile is null.");
        }
        if (!jrw2.exists()) {
            throw new bg("SFFile '" + jrw2 + "' was not found.");
        }
        try {
            Document document = jsy.n(jrw2);
            jsy.a(document, oRy);
            Node node = jsy.d("SFResource", document);
            Node node2 = jsy.d("SFQuantity", node);
            int n2 = jsy.r(node2);
            if (n2 <= 0) {
                throw new bg("Resource '" + this.ResourceTree.getName(n) + "' has invalid quantity.");
            }
            return n2;
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + jrw2.getName() + "' failed.", bg2);
        }
    }

    private void xP(boolean bl) {
        Object object;
        String string;
        if (bl) {
            string = "xml-files/gamelogicinfo/effecttree.xml";
            object = new juf();
            ((juf)object).uc(string);
            string = "xml-files/gamelogicinfo/resourcetree.xml";
            ((juf)object).uf(string);
            string = "xml-files/gamelogicinfo/skilltree.xml";
            ((juf)object).ug(string);
            try {
                string = "xml-files/common/enchanting/enchanting info list.xml";
                kba kba2 = new kba();
                kba2.wb(string);
            }
            catch (bg bg2) {
                throw new bs("Parsing of file '" + string + "' failed.", bg2);
            }
        }
        string = lcw.qLb + "xml-files/common/crafting/" + "attribute harvester rules.xml";
        try {
            object = new kxp();
            this.qgC = ((kxp)object).uH(string);
        }
        catch (bg bg3) {
            throw new bs("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private void a(jrw[] jrwArray, boolean bl) {
        if (jrwArray == null || jrwArray.length == 0) {
            throw new bg("Files array is null or empty.");
        }
        List<Object> list = lcn.emv();
        String string = null;
        int n = jrwArray.length;
        for (int i = 0; i < n; ++i) {
            try {
                string = jrwArray[i].getName();
                string = string.substring(0, string.length() - 4);
                int n2 = this.ResourceTree.getType(string);
                if (n2 <= 0) {
                    this.b(1, "SFAttributeInfoHarvester", "loadResourceAttributeInfoMap() Skipping file '" + string + "'");
                    continue;
                }
                if (this.ResourceTree.isDescendant(n2, cug.fsD)) {
                    this.b(1, "SFAttributeInfoHarvester", "loadResourceAttributeInfoMap() Skipping file '" + string + "'");
                    continue;
                }
                lgw lgw2 = (lgw)this.ResourceTree.acv(n2);
                if (!lgw2.erK()) {
                    lfn.b(5, "SFAttributeInfoHarvester", "loadResourceAttributeInfoMap() Resource '" + lgw2.getName() + "' should not have a resourcefile.");
                    continue;
                }
                if (this.aaQ(n2)) continue;
                kxn kxn2 = this.aaP(n2);
                if (kxn2 == null) {
                    throw new bg("No filterrule defined for resource '" + this.ResourceTree.getName(n2) + "'");
                }
                assert (kxn2.qgL != null);
                list = this.a(n2, kxn2, jrwArray[i]);
                boolean bl2 = true;
                if (list.isEmpty() && (bl2 = kxn2.eik())) {
                    throw new bg("Resource '" + string + "' contains no attributes.");
                }
                Integer n3 = new Integer(n2);
                if (this.qgD.containsKey(n3)) {
                    throw new bg("ResourceAttributeInfoMap already contains info for resource '" + string + "'");
                }
                ej[] ejArray = new ej[list.size()];
                int n4 = 0;
                Object object = list.iterator();
                while (object.hasNext()) {
                    ejArray[n4] = (ej)object.next();
                    if (ejArray[n4] instanceof ez) {
                        ejArray[n4] = ejArray[n4].fn();
                    }
                    ++n4;
                }
                if (bl2) {
                    object = new cuf(n2);
                    ((cuf)object).f(ejArray);
                    this.qgD.put(n3, (cuf)object);
                    this.b(0, "SFAttributeInfoHarvester", "loadResourceAttributeInfoMap() Added " + object);
                } else {
                    this.b(2, "SFAttributeInfoHarvester", "loadResourceAttributeInfoMap() Checked resource '" + this.ResourceTree.getName(n2) + "'");
                }
                int n5 = this.a(n2, jrwArray[i]);
                if (n5 <= 1) continue;
                if (this.qgE.containsKey(n3)) {
                    throw new bg("ResourceVendorInfoMap already contains info for resource '" + string + "'");
                }
                cum cum2 = new cum(n2, n5);
                this.qgE.put(n3, cum2);
                this.b(0, "SFAttributeInfoHarvester", "loadResourceAttributeInfoMap() Added " + cum2);
                continue;
            }
            catch (bg bg2) {
                if (bl) {
                    this.b(5, "SFAttributeInfoHarvester", "loadResourceAttributeInfoMap() Parsing of file '" + string + "' failed.");
                    this.a("SFAttributeInfoHarvester", bg2);
                    continue;
                }
                throw new bg("Parsing of file '" + string + "' failed.", bg2);
            }
        }
    }

    private boolean aaQ(int n) {
        return n < 0;
    }

    private Element a(Document document, cuf cuf2) {
        assert (cuf2.arJ() != null);
        assert (cuf2.arJ().length > 0);
        Element element = document.createElement("SFResourceAttributeInfo");
        element.appendChild(this.pdI.e(document, cuf2.ResourceType));
        int n = cuf2.arJ().length;
        for (int i = 0; i < n; ++i) {
            element.appendChild(this.oRX.a(document, cuf2.arJ()[i]));
        }
        return element;
    }

    private Element a(Document document, cum cum2) {
        assert (cum2.ResourceType > 0);
        assert (cum2.asi > 0);
        Element element = document.createElement("ResourceVendorInfo");
        element.setAttribute("ResourceName", cum2.pa());
        element.setAttribute("Quantity", Integer.toString(cum2.asi));
        return element;
    }

    private void xo(String string) {
        assert (string != null);
        this.b(1, "SFAttributeInfoHarvester", "writeResourceAttributeInfoMap() FilePath='" + string + "'");
        Document document = this.oQa.dSD();
        Element element = this.oQa.a(document, "XML", oRy);
        document.appendChild(element);
        for (cuf cuf2 : this.qgD.values()) {
            element.appendChild(this.a(document, cuf2));
        }
        jsz.a(document, new jrw(string));
    }

    private void xp(String string) {
        assert (string != null);
        this.b(1, "SFAttributeInfoHarvester", "writeResourceVendorInfoMap() FilePath='" + string + "'");
        Document document = this.oQa.dSD();
        Element element = this.oQa.a(document, "XML", oRy);
        document.appendChild(element);
        for (cum cum2 : this.qgE.values()) {
            element.appendChild(this.a(document, cum2));
        }
        jsz.a(document, new jrw(string));
    }
}

