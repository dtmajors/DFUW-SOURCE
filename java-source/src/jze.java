/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class jze {
    private final String pau = lcw.qLb + "xml-files/object/animation/transitions/";
    private lju paq = new lju(0, 1);
    private jta oQa = new jta();

    public void b(lke lke2) {
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/object/animation/distancetimers/" + lke2.bsl());
        this.a(lke2, jrw2);
    }

    public void a(lke lke2, jrw jrw2) {
        assert (lke2 != null) : "AnimationdistanceTimerManager is null!";
        Document document = this.oQa.dSD();
        Element element = this.oQa.a(document, "SFAnimationDistanceTimerTemplate", this.paq);
        Element element2 = null;
        Object var6_6 = null;
        document.appendChild(element);
        lfn.b(0, this.getClass().getName(), "Creating SFAnimationDistanceTimerManager Node :" + lke2);
        element2 = document.createElement("AnimationDistanceTimerList");
        element.appendChild(element2);
        List<lkd> list = lke2.etp();
        for (lkd lkd2 : list) {
            this.a(document, element2, lkd2);
        }
        lfn.b(0, this.getClass().getName(), "The Filename is: " + jrw2);
        Object object = null;
        if (jrw2 == null) {
            object = this.pau + lke2.bsl();
            jrw2 = new jrw((String)object);
        }
        jsz.a(document, jrw2);
    }

    private Element a(Document document, Node node, lkd lkd2) {
        Element element = null;
        Element element2 = document.createElement("AnimationDistanceTimer");
        node.appendChild(element2);
        Element element3 = this.oQa.a(document, lkd2.dZn(), "AnimationDistanceTimerType");
        element2.appendChild(element3);
        element3 = this.oQa.a(document, lkd2.dZF(), "AnimationDistanceTimerSetName");
        element2.appendChild(element3);
        element3 = this.oQa.a(document, lkd2.dZo(), "AnimationDistanceTimerDeltaTimePerUnit");
        element2.appendChild(element3);
        return element;
    }
}

