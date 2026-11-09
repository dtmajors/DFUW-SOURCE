/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class kaq {
    public static final lju eM = kae.eM;
    private jta oQa = new jta();
    private les ResourceTree = lea.enW();

    public void h(String string, Map map) {
        lfn.b(0, "SFPaperDollWriter", "writePaperdollItemMap() FilePath: '" + string + "'");
        Document document = this.oQa.dSD();
        Element element = this.oQa.a(document, "XML", eM);
        document.appendChild(element);
        ArrayList<cam> arrayList = lcn.emv();
        Iterator<Object> iterator = map.values().iterator();
        int n = this.ResourceTree.getType("r_Armor Full Plate");
        while (iterator.hasNext()) {
            cam cam2 = (cam)iterator.next();
            arrayList.add(cam2);
        }
        Collections.sort(arrayList, new Comparator(this){
            final /* synthetic */ kaq pbe;
            {
                this.pbe = kaq2;
            }

            public int compare(Object object, Object object2) {
                return ((cam)object).pa().compareTo(((cam)object2).pa());
            }

            public boolean equals(Object object) {
                return false;
            }
        });
        for (cam cam2 : arrayList) {
            Element element2 = this.a(document, cam2);
            element.appendChild(element2);
        }
        jsz.a(document, new jrw(string));
    }

    public void i(String string, Map map) {
        lfn.b(0, "SFPaperDollWriter", "writePaperdollItemNPCMap() FilePath: '" + string + "'");
        Document document = this.oQa.dSD();
        Element element = this.oQa.a(document, "XML", eM);
        document.appendChild(element);
        ArrayList<cao> arrayList = lcn.emv();
        for (cao cao2 : map.values()) {
            arrayList.add(cao2);
        }
        Collections.sort(arrayList, new Comparator(this){
            final /* synthetic */ kaq pbe;
            {
                this.pbe = kaq2;
            }

            public int compare(Object object, Object object2) {
                int n = ((cao)object).pa().compareTo(((cam)object2).pa());
                if (n == 0) {
                    n = ((cao)object).Yq().compareTo(((cao)object2).Yq());
                }
                return n;
            }

            public boolean equals(Object object) {
                return false;
            }
        });
        for (cao cao2 : arrayList) {
            Element element2 = this.a(document, cao2);
            element.appendChild(element2);
        }
        jsz.a(document, new jrw(string));
    }

    private Element a(Document document, cam cam2) {
        assert (cam2 != null);
        Element element = document.createElement("SFPaperdollItem");
        element.setAttribute("ResourceName", cam2.pa());
        cai[] caiArray = cam2.aGi();
        int n = caiArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            element.appendChild(this.a(document, caiArray[i2]));
        }
        return element;
    }

    private Element a(Document document, cao cao2) {
        assert (cao2 != null);
        Element element = document.createElement("SFPaperdollItemNPC");
        element.setAttribute("ResourceName", cao2.pa());
        element.setAttribute("NPCName", cao2.Yq());
        cai[] caiArray = cao2.aGi();
        int n = caiArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            element.appendChild(this.a(document, caiArray[i2]));
        }
        return element;
    }

    private Element a(Document document, cai cai2) {
        assert (cai2 != null);
        Element element = document.createElement("SFMeshItem");
        switch (cai2.aFY()) {
            case eeL: {
                bzu bzu2 = (bzu)cai2;
                this.a(document, bzu2, element);
                element.setAttribute("PriorityLevelName", bzu2.aFC().name());
                element.setAttribute("AttachPointName", bzu2.getAttachPointName());
                element.setAttribute("FileName", bzu2.getFileName());
                break;
            }
            case eeM: {
                caa caa2 = (caa)cai2;
                this.a(document, caa2, element);
                element.setAttribute("PriorityLevelName", caa2.aFI().name());
                break;
            }
            case eeN: {
                cax cax2 = (cax)cai2;
                this.a(document, cax2, element);
                element.setAttribute("PriorityLevelName", cax2.aHc().name());
                element.setAttribute("FileName", cax2.getFileName());
                break;
            }
            default: {
                lfn.b(5, "SFPaperDollWriter", "createSFMeshItemElement() Invalid meshitem found: " + (Object)((Object)cai2.aFY()));
                assert (false);
                break;
            }
        }
        return element;
    }

    private Element a(Document document, cai cai2, Element element) {
        assert (cai2 != null);
        assert (cai2.aGa() != null);
        assert (element != null);
        element.setAttribute("MeshItemName", cai2.getName());
        element.setAttribute("SubsetName", cai2.aGc());
        cah[] cahArray = cai2.aGa();
        int n = cahArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            element.appendChild(this.a(document, cahArray[i2]));
        }
        return element;
    }

    private Element a(Document document, cah cah2) {
        assert (cah2 != null);
        Element element = document.createElement("SFMaterialShaderPair");
        element.setAttribute("MaterialID", Integer.toString(cah2.aFO()));
        element.setAttribute("PriorityLevelName", cah2.aFS().name());
        element.appendChild(this.a(document, cah2.aFT()));
        element.appendChild(this.a(document, cah2.aFU()));
        return element;
    }

    private Element a(Document document, cag cag2) {
        assert (cag2 != null);
        assert (cag2.aFP().length <= 1);
        Element element = document.createElement("SFMaterialItem");
        String[] stringArray = cag2.aFP();
        int n = stringArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            if (i2 == 0) {
                element.setAttribute("TextureName", stringArray[i2]);
                continue;
            }
            element.setAttribute("TextureName" + (i2 + 1), stringArray[i2]);
        }
        return element;
    }

    private Element a(Document document, cav cav2) {
        assert (cav2 != null);
        Element element = document.createElement("SFShaderItem");
        element.setAttribute("ShaderName", cav2.aHa());
        return element;
    }
}

