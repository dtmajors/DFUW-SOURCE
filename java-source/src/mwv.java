/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  dqk
 *  lcw
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections.MultiHashMap;
import org.w3c.dom.Document;

public class mwv {
    private final String bzv = lcw.qLb + "xml-files/server/gamelogicinfo/quests/" + "questtargets.xml";
    private final jxd oXG = new jxd();
    private final jxa EgA = new jxa();
    private final XStream ERR = new XStream(new DomDriver());

    public void eSz() {
        this.ERR.setMode(1001);
        this.ERR.setClassLoader(r.cr);
        Annotations.configureAliases(this.ERR, mwu.class);
        String string = this.ERR.toXML(this.eSA());
        Document document = jsy.tL(string);
        jsz.a(document, new jrw(this.bzv));
    }

    private List<mwu> eSA() {
        String string;
        Object object;
        Map<ldv, amf> map;
        jrw[] jrwArray = new jrw[]{new jrw(lcw.qLb + "xml-files/objectspace/built_tiles/"), new jrw(lcw.qLb + "xml-files/objectspace/dungeons/")};
        ArrayList<mwu> arrayList = lcn.emv();
        MultiHashMap multiHashMap = (MultiHashMap)lcn.emB();
        Map<String, jrw> map2 = lcn.emw();
        for (jrw object2 : jrwArray) {
            map = new a(this);
            jry.a(object2, (FileFilter)((Object)map), map2, true);
        }
        for (Map.Entry entry : map2.entrySet()) {
            jrw jrw2 = (jrw)entry.getValue();
            String string2 = (String)entry.getKey();
            map = this.oXG.c(jrw2, false);
            if (map == null || map.isEmpty()) continue;
            for (amf amf2 : map.values()) {
                if (!(amf2 instanceof dqk)) continue;
                object = ((dqk)amf2).av();
                string = amf2.getObjectDescriptionFilename();
                multiHashMap.put(string, new lfs<String, ljq>(string2, (ljq)object));
            }
        }
        for (String string2 : multiHashMap.keySet()) {
            boolean bl;
            String string3 = this.EgA.y(new jrw(lcw.qLb + "xml/" + string2));
            int n = lea.enW().getType(string3);
            if (!lea.enW().isDescendant(n, cug.fqy)) continue;
            map = multiHashMap.getCollection(string2);
            Iterator<Object> iterator = map.iterator();
            boolean bl2 = bl = map.size() > 1;
            while (iterator.hasNext()) {
                object = (lfs)iterator.next();
                string = (String)((lfs)object).getFirst();
                ljq ljq2 = (ljq)((lfs)object).eqz();
                mwu mwu2 = new mwu();
                if (bl) {
                    mwu2.FileName = string2.substring(0, string2.indexOf(".xml")) + "_" + string + ".xml";
                    mwu2.DisplayName = string3 + "_" + string;
                } else {
                    mwu2.FileName = string2;
                    mwu2.DisplayName = string3;
                }
                mwu2.Position = ljq2;
                mwu2.Tile = string;
                arrayList.add(mwu2);
            }
        }
        return arrayList;
    }
}

