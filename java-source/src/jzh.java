/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class jzh {
    private final String pau = lcw.qLb + "xml-files/object/animation/states/";
    private lju paq = new lju(0, 3);
    private jzc par = new jzc();
    private jta oQa = new jta();

    public void b(lks lks2) {
        jrw jrw2 = new jrw(this.pau + lks2.bsl());
        this.a(lks2, jrw2);
    }

    public void a(lks lks2, jrw jrw2) {
        assert (lks2 != null) : "AnimationStateList is null!";
        Document document = this.par.dSD();
        Element element = this.par.a(document, "SFAnimationStateTemplate", this.paq);
        Element element2 = null;
        Object var6_6 = null;
        document.appendChild(element);
        lfn.b(0, this.getClass().getName(), "Creating SFAnimationPartTemplate Node :" + lks2);
        element2 = this.oQa.a(document, lks2.getName(), "Name");
        element.appendChild(element2);
        element2 = document.createElement("AnimationStateList");
        element.appendChild(element2);
        List<lkr> list = lks2.eue();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            this.a(document, element2, list.get(i2));
        }
        lfn.b(0, this.getClass().getName(), "The Filename is: " + jrw2);
        String string = null;
        if (jrw2 == null) {
            string = this.pau + lks2.bsl();
            jrw2 = new jrw(string);
        }
        jsz.a(document, jrw2);
    }

    private Element a(Document document, Node node, lkr lkr2) {
        Element element;
        Element element2;
        Object object;
        Element element3 = null;
        Element element4 = document.createElement("AnimationState");
        node.appendChild(element4);
        element4.setAttribute("ID", Integer.toString(lkr2.etO()));
        element4.setAttribute("SetName", lkr2.getSetName());
        element4.setAttribute("Partial", Boolean.toString(lkr2.isPartial()));
        element4.setAttribute("Loop", Boolean.toString(lkr2.isLooping()));
        element4.setAttribute("RemovePartial", Boolean.toString(lkr2.etR()));
        element4.setAttribute("PlaybackType", Integer.toString(lkr2.etV()));
        element4.setAttribute("Duration", Float.toString(lkr2.etP()));
        element4.setAttribute("Speed", Float.toString(lkr2.bEX()));
        element4.setAttribute("StopAtPosition", Boolean.toString(lkr2.etY()));
        element4.setAttribute("StopPositionNormalized", Float.toString(lkr2.etX()));
        element4.setAttribute("FallbackState", Boolean.toString(lkr2.eub()));
        element4.setAttribute("HideWeapon", Boolean.toString(lkr2.euc()));
        if (lkr2.etS() != null && !lkr2.etS().isEmpty()) {
            object = lkr2.etS();
            element2 = document.createElement("AlternativeSets");
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                element = document.createElement("AlternativeSet");
                element.setAttribute("SetName", string);
                element2.appendChild(element);
            }
            element4.appendChild(element2);
        }
        if (lkr2.etW() != null && lkr2.etW().length != 0) {
            object = lkr2.etW();
            element2 = document.createElement("ChainedStates");
            for (int i2 = 0; i2 < ((Object)object).length; ++i2) {
                Object object2 = object[i2];
                element = document.createElement("ChainedState");
                element.setAttribute("StateID", Integer.toString((int)object2));
                element2.appendChild(element);
            }
            element4.appendChild(element2);
        }
        return element3;
    }
}

