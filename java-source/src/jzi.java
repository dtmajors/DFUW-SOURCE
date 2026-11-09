/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  jzc
 *  lcw
 *  lkv
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jzi {
    private final String pau = lcw.qLb + "xml-files/object/animation/";
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();
    private jta oQa = new jta();
    private final String paH = "DefaultName";
    private final String paI = "partfile_default.xml";
    private final String paJ = "statefile_default.xml";
    private final String paK = "transitionfile_default.xml";
    private final String paL = "xml/animations/".substring("xml/".length());

    public void a(bvf bvf2, jrw jrw2, boolean bl) {
        if (bvf2 != null) {
            Object object;
            List<lkp> list;
            Object object2;
            Document document = this.par.dSD();
            Element element = this.par.a(document, "SFAnimationTemplate", this.paq);
            Element element2 = null;
            document.appendChild(element);
            element2 = this.oQa.a(document, bvf2.getObjectDescriptionFilename(), "SFWorldMeshObject");
            element.appendChild(element2);
            element2 = this.oQa.a(document, bvf2.azE().euH(), "SFAnimationTransitionTemplateReference");
            element.appendChild(element2);
            element2 = bvf2.azy() != null ? this.oQa.a(document, bvf2.azy().bsl(), "SFAnimationPartTemplateReference") : this.oQa.a(document, "", "SFAnimationPartTemplateReference");
            element.appendChild(element2);
            element2 = this.oQa.a(document, bvf2.azA().bsl(), "SFAnimationStateTemplateReference");
            element.appendChild(element2);
            if (bvf2.azz() != null) {
                element2 = this.oQa.a(document, bvf2.azz().bsl(), "SFAnimationDistanceTimerTemplateReference");
                element.appendChild(element2);
            }
            Object object3 = lcn.emw();
            Object object4 = bvf2.azA().eue();
            Map<String, List<lkp>> map = object4.iterator();
            while (map.hasNext()) {
                object2 = map.next();
                list = ((lkr)object2).etZ();
                if (list == null || list.isEmpty()) continue;
                object = lkv.adr((int)((lkr)object2).etO());
                object3.put(object, list);
            }
            if (!object3.isEmpty()) {
                map = jry.tu(jrw2.getName()) + "_effects.xml";
                element2 = this.oQa.a(document, (String)((Object)map), "SFAnimationEffectReference");
                element.appendChild(element2);
            }
            object3 = null;
            if (jrw2 == null) {
                object3 = this.pau + bvf2.ayY();
                jrw2 = new jrw((String)object3);
            }
            jsz.a(document, jrw2);
            if (bl) {
                if (bvf2.azE().euH() != null) {
                    object4 = new jyz();
                    ((jyz)object4).b(bvf2.azE());
                }
                if (bvf2.azy() != null) {
                    object4 = new jzg();
                    ((jzg)object4).b(bvf2.azy());
                }
                if (bvf2.azA().bsl() != null) {
                    object4 = new jzh();
                    ((jzh)object4).b(bvf2.azA());
                }
                if (bvf2.azz() != null && bvf2.azz().bsl() != null) {
                    object4 = new jze();
                    ((jze)object4).b(bvf2.azz());
                }
                if (bvf2.azz() != null && bvf2.azz().bsl() != null) {
                    object4 = new jze();
                    ((jze)object4).b(bvf2.azz());
                }
                object4 = new jzf();
                map = lcn.emw();
                object2 = bvf2.azA().eue();
                list = object2.iterator();
                while (list.hasNext()) {
                    object = (lkr)list.next();
                    List<lkp> list2 = ((lkr)object).etZ();
                    if (list2 == null || list2.isEmpty()) continue;
                    String string = lkv.adr((int)((lkr)object).etO());
                    map.put(string, list2);
                }
                list = jry.tu(jrw2.getName()) + "_effects.xml";
                if (!map.isEmpty()) {
                    ((jzf)object4).e(map, (String)((Object)list));
                }
            }
        }
    }

    public void aj(String string, String string2) {
        if (string2 == null) {
            string2 = "partfile_default.xml";
        }
        Document document = this.par.dSD();
        Element element = this.par.a(document, "SFAnimationTemplate", this.paq);
        Element element2 = null;
        document.appendChild(element);
        element2 = this.oQa.a(document, "DefaultName", "Name");
        element.appendChild(element2);
        element2 = this.oQa.a(document, this.paL + string, "SFWorldMeshObject");
        element.appendChild(element2);
        element2 = this.oQa.a(document, "transitionfile_default.xml", "SFAnimationTransitionTemplateReference");
        element.appendChild(element2);
        element2 = this.oQa.a(document, string2, "SFAnimationPartTemplateReference");
        element.appendChild(element2);
        element2 = this.oQa.a(document, "statefile_default.xml", "SFAnimationStateTemplateReference");
        element.appendChild(element2);
        element2 = this.oQa.a(document, "statefile_default.xml", "SFAnimationStateTemplateReference");
        element.appendChild(element2);
        jrw jrw2 = new jrw(this.pau + string);
        jsz.a(document, jrw2);
    }
}

