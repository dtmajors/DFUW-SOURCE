/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jyi {
    public static final String oWs = "CameraPath";
    public static final String pam = "Duration";
    public static final String pan = "RotationStart";
    public static final String pao = "RotationEnd";
    public static final String pap = "DoRotation";
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();
    private jta oQa = new jta();

    public void a(String string, lll lll2) {
        assert (lll2 != null);
        assert (string != null);
        jrw jrw2 = new jrw(lcw.qLb + "worldbuilder/camera paths/" + string);
        Document document = this.par.dSD();
        Element element = this.par.a(document, oWs, this.paq);
        document.appendChild(element);
        element.appendChild(this.oQa.a(document, lll2.getDuration(), pam));
        element.appendChild(this.oQa.a(document, lll2.euK(), pan));
        element.appendChild(this.oQa.a(document, lll2.euJ(), pao));
        element.appendChild(this.oQa.a(document, lll2.euL(), pap));
        int n = 0;
        for (ljq ljq2 : lll2.euI()) {
            Element element2 = this.oQa.a(document, ljq2, "SFPosition");
            element2.setAttribute("Index", Integer.toString(n));
            element.appendChild(element2);
            ++n;
        }
        lfn.b(0, this.getClass().getName(), "The Filename is: " + jrw2);
        Object object = null;
        object = jrw2.getAbsolutePath();
        jrw2 = new jrw((String)object);
        jsz.a(document, jrw2);
    }
}

