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
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jus {
    public static final String oSt = "QuestIndex";
    public static final String oSu = "Name";
    public static final String oSv = "Filename";
    public static final String oSw = "SimpleQuest";
    public static final String oSx = "ComplexQuest";
    private XStream oSy;

    private void aS() {
        if (this.oSy != null) {
            return;
        }
        this.oSy = new XStream(new DomDriver());
        this.oSy.setClassLoader(r.cr);
        Annotations.configureAliases(this.oSy, dtz.class);
        Annotations.configureAliases(this.oSy, dty.class);
        Annotations.configureAliases(this.oSy, due.class);
        Annotations.configureAliases(this.oSy, dtz.a.class);
        Annotations.configureAliases(this.oSy, dtz.b.class);
    }

    public void a(dtz dtz2, String string) {
        this.aS();
        String string2 = this.oSy.toXML(dtz2);
        Document document = jsy.tL(string2);
        String string3 = lcw.qLb + "xml-files/gamelogicinfo/quests/simple/" + string;
        if (dtz2.Type == dud.hdM) {
            string3 = lcw.qLb + "xml-files/gamelogicinfo/quests/complex/" + string;
        }
        jsz.a(document, new jrw(string3));
    }

    public dtz uj(String string) {
        return this.ul("xml-files/gamelogicinfo/quests/complex/" + string);
    }

    public dtz uk(String string) {
        return this.ul("xml-files/gamelogicinfo/quests/simple/" + string);
    }

    public dtz ul(String string) {
        this.aS();
        String string2 = "";
        try {
            string2 = jry.ti(string);
        }
        catch (FileNotFoundException fileNotFoundException) {
            throw new bg(fileNotFoundException);
        }
        catch (IOException iOException) {
            throw new bg(iOException);
        }
        Object object = this.oSy.fromXML(string2);
        assert (object instanceof dtz);
        return (dtz)object;
    }

    public void N(Map<dty, List<due>> map) {
        jta jta2 = new jta();
        Document document = jta2.dSD();
        Element element = jta2.a(document, oSt, new lju(0, 1, 0));
        document.appendChild(element);
        for (Map.Entry<dty, List<due>> entry : map.entrySet()) {
            dty dty2 = entry.getKey();
            List<due> list = entry.getValue();
            Element element2 = document.createElement(oSx);
            element2.setAttribute(oSv, dty2.Filename);
            for (due due2 : list) {
                Element element3 = document.createElement(oSw);
                element3.setAttribute(oSv, due2.Filename);
                element2.appendChild(element3);
            }
            element.appendChild(element2);
        }
        String string = lcw.qLb + "xml-files/gamelogicinfo/quests/" + "questindex.xml";
        jsz.b(document, string);
    }
}

