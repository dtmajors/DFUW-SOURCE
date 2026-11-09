/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;

public class mxb {
    private final String ERT = lcw.qLb + "xml-files/server/gamelogicinfo/quests/" + "questvendors.xml";
    private final String DHC = lcw.qLb + "/" + "xml-files/server/vendor/" + "vendors/";
    private final mut DHB = new mut();
    private final XStream ERR = new XStream(new DomDriver());

    public void eSB() {
        this.ERR.setMode(1001);
        this.ERR.setClassLoader(r.cr);
        Annotations.configureAliases(this.ERR, mww.class);
        String string = this.ERR.toXML(this.eSC());
        Document document = jsy.tL(string);
        jsz.a(document, new jrw(this.ERT));
    }

    private List<mww> eSC() {
        ArrayList<mww> arrayList = lcn.emv();
        for (Integer n : fy.TG.keySet()) {
            bta bta2 = null;
            jrw jrw2 = null;
            String string = null;
            List<bsv> list = fy.TG.get(n);
            for (int i = 0; i < list.size(); ++i) {
                bta2 = (bta)list.get(i);
                string = bta2.axo();
                jrw2 = new jrw(this.DHC + string);
                this.DHB.V(jrw2);
                mww mww2 = new mww();
                mww2.DisplayName = this.DHB.getVendorName();
                mww2.Position = bta2.av();
                mww2.QuestList.addAll(this.DHB.eQi());
                arrayList.add(mww2);
            }
        }
        return arrayList;
    }
}

