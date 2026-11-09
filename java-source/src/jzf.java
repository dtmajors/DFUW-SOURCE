/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class jzf {
    private final String pau = lcw.qLb + "xml-files/object/animation/effects/";
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();
    private jta oQa = new jta();

    public void e(Map map, String string) {
        assert (map != null) : "AnimationEffects is null!";
        assert (string != null) : "SFFile is null!";
        Document document = this.par.dSD();
        Element element = this.par.a(document, "SFAnimationEffects", this.paq);
        Element element2 = null;
        Object var6_6 = null;
        document.appendChild(element);
        Element element3 = document.createElement("EffectList");
        element.appendChild(element3);
        for (Map.Entry entry : map.entrySet()) {
            String string2 = (String)entry.getKey();
            List list = (List)entry.getValue();
            element2 = document.createElement("AnimationState");
            element2.setAttribute("StateName", string2);
            element3.appendChild(element2);
            for (lkp lkp2 : list) {
                this.a(document, element2, string2, lkp2);
            }
        }
        String string3 = this.pau + string;
        jsz.a(document, new jrw(string3));
    }

    private Element a(Document document, Node node, String string, lkp lkp2) {
        ljq ljq2;
        String string2 = del.zU(lkp2.etN());
        assert (!string2.equals(""));
        if (string2.startsWith("se_animaudio:")) {
            return null;
        }
        Element element = document.createElement("Effect");
        node.appendChild(element);
        element.setAttribute("EffectName", string2);
        element.setAttribute("StartTime", Float.toString(lkp2.getStartTime()));
        if (lkp2.emu() != null) {
            element.setAttribute("BoneName", lkp2.emu());
        }
        if ((ljq2 = lkp2.getOffset()) != null && !ljq2.isZero()) {
            element.appendChild(this.oQa.a(document, lkp2.getOffset(), "Offset"));
        }
        return element;
    }
}

