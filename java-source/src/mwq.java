/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ari
 *  lcw
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;

public class mwq {
    private static final String bzv = lcw.qLb + "xml-files/server/gamelogicinfo/quests/" + "questspawnpoints.xml";
    private static final jxl oT = new jxl();
    private XStream oSy;

    public void eSp() {
        lea.epf().clear();
        List<mwp> list = this.eSq();
        this.oSy = new XStream(new DomDriver());
        this.oSy.setMode(1001);
        this.oSy.setClassLoader(r.cr);
        Annotations.configureAliases(this.oSy, mwp.class);
        String string = this.oSy.toXML(list);
        Document document = jsy.tL(string);
        jsz.a(document, new jrw(bzv));
    }

    private List<mwp> eSq() {
        ArrayList<mwp> arrayList = lcn.emv();
        for (Integer n : fy.TF.keySet()) {
            List<bsv> list = fy.TF.get(n);
            for (int i = 0; i < list.size(); ++i) {
                btd btd2 = (btd)list.get(i);
                String string = btd2.axo();
                ljq ljq2 = btd2.av();
                ari ari2 = oT.vk(string);
                assert (ari2 != null);
                if (ari2 == null) continue;
                mwp mwp2 = new mwp();
                mwp2.Filename = string;
                mwp2.Position = ljq2;
                mwp2.Radius = ari2.getRadius();
                if (ari2.Rp() != null) {
                    mwp2.MonsterList.addAll(ari2.Rp().keySet());
                } else {
                    lfn.b(5, "SFQuestSpawnpointObjectsConverter", "createSpawnpointInfoMap() Spawnpoint :" + string + " has no monsters.");
                }
                arrayList.add(mwp2);
            }
        }
        return arrayList;
    }
}

