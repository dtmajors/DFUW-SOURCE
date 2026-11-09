/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jyz {
    private final String pau = lcw.qLb + "xml-files/object/animation/transitions/";
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();

    public void b(lkz lkz2) {
        jrw jrw2 = new jrw(this.pau + lkz2.euH());
        this.a(lkz2, jrw2);
    }

    public void a(lkz lkz2, jrw jrw2) {
        Object var3_3 = null;
        Document document = this.par.dSD();
        Element element = this.par.a(document, "SFAnimationTransitionTemplate", this.paq);
        document.appendChild(element);
        Element element2 = this.par.a(document, lkz2, true);
        element.appendChild(element2);
        lfn.b(0, this.getClass().getName(), "The Filename is: " + jrw2);
        String string = null;
        if (jrw2 == null) {
            string = this.pau + lkz2.euH();
            jrw2 = new jrw(string);
        }
        jsz.a(document, jrw2);
    }
}

