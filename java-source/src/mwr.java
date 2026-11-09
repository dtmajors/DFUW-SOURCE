/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;

public class mwr {
    public static final String ERO = lcw.qLb + "xml-files/server/gamelogicinfo/quests/" + "StoryLines.xml";
    public static final String ERP = "xml-files/server/gamelogicinfo/quests/StoryLines.xml";
    public List<String> ERQ = lcn.emv();
    private XStream oSy;

    public mwr() {
        this.eSs();
    }

    private void aS() {
        if (this.oSy != null) {
            return;
        }
        this.oSy = new XStream(new DomDriver());
        this.oSy.setClassLoader(r.cr);
        Annotations.configureAliases(this.oSy, mwr.class);
    }

    private void DO(String string) {
        if (!this.ERQ.contains(string)) {
            this.ERQ.add(string);
        }
    }

    private void DP(String string) {
        if (!this.ERQ.contains(string)) {
            this.ERQ.remove(string);
        }
    }

    private void eSr() {
        this.aS();
        String string = this.oSy.toXML(this.ERQ);
        Document document = jsy.tL(string);
        jsz.a(document, new jrw(ERO));
    }

    public void eSs() {
        this.aS();
        String string = "";
        try {
            string = jry.ti(ERP);
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        Object object = this.oSy.fromXML(string);
        assert (object instanceof ArrayList);
        this.ERQ = (ArrayList)object;
    }
}

