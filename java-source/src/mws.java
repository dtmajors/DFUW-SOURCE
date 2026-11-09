/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;

public class mws {
    public void eSt() {
        if (lcw.enc()) {
            try {
                new jxh().dUo();
            }
            catch (bo bo2) {
                assert (false);
                bo2.printStackTrace();
            }
        }
        if ((lcw.eng() || lcw.enc() || lcw.enb()) && lcw.qHb) {
            this.eSv();
            this.eSu();
            this.eSw();
        }
        if (lcw.qHa && !lcw.eng()) {
            mwm mwm2 = new mwm();
            mwm2.eRE();
        }
        if (lcw.enc() || lcw.enb()) {
            this.eSx();
        }
    }

    private void eSu() {
        if (lcw.enc() || lcw.eng() || lcw.enb()) {
            XStream xStream = new XStream(new DomDriver());
            xStream.setClassLoader(r.cr);
            Annotations.configureAliases(xStream, mwp.class);
            String string = "xml-files/server/gamelogicinfo/quests/questspawnpoints.xml";
            try {
                Document document = jsy.tJ("xml-files/server/gamelogicinfo/quests/questspawnpoints.xml");
                assert (document != null);
                String string2 = jsz.d(document);
                assert (string2 != null);
                Object object = xStream.fromXML(string2);
                assert (object instanceof List);
                List list = (List)object;
                if (!list.isEmpty()) {
                    Map<String, mwp> map = lea.epf();
                    for (mwp mwp2 : list) {
                        map.put(mwp2.Filename, mwp2);
                    }
                }
            }
            catch (bo bo2) {
                bo2.printStackTrace();
            }
        }
    }

    private void eSv() {
        if (lcw.enc() || lcw.eng() || lcw.enb()) {
            XStream xStream = new XStream(new DomDriver());
            xStream.setClassLoader(r.cr);
            Annotations.configureAliases(xStream, mww.class);
            String string = "xml-files/server/gamelogicinfo/quests/questvendors.xml";
            try {
                Document document = jsy.tJ("xml-files/server/gamelogicinfo/quests/questvendors.xml");
                assert (document != null);
                String string2 = jsz.d(document);
                assert (string2 != null);
                Object object = xStream.fromXML(string2);
                assert (object instanceof List);
                List list = (List)object;
                if (!list.isEmpty()) {
                    Map<String, mww> map = lea.epg();
                    for (mww mww2 : list) {
                        map.put(mww2.DisplayName, mww2);
                    }
                }
            }
            catch (bo bo2) {
                bo2.printStackTrace();
            }
        }
    }

    private void eSw() {
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        xStream.setMode(1001);
        Annotations.configureAliases(xStream, mwu.class);
        String string = "xml-files/server/gamelogicinfo/quests/questtargets.xml";
        try {
            Document document = jsy.tJ("xml-files/server/gamelogicinfo/quests/questtargets.xml");
            assert (document != null);
            String string2 = jsz.d(document);
            assert (string2 != null);
            Object object = xStream.fromXML(string2);
            assert (object instanceof List);
            List list = (List)object;
            if (!list.isEmpty()) {
                Map<String, mwu> map = lea.eph();
                for (mwu mwu2 : list) {
                    map.put(mwu2.DisplayName, mwu2);
                }
            }
        }
        catch (bo bo2) {
            bo2.printStackTrace();
        }
    }

    private void eSx() {
        for (due due2 : lea.eoU().bAK().values()) {
            due2.jJ(false);
        }
    }

    public static lfs<ljq, Float> DQ(String string) {
        mwp mwp2 = lea.epf().get(string);
        if (mwp2 != null) {
            return new lfs<ljq, Float>(mwp2.Position, Float.valueOf(mwp2.Radius));
        }
        return null;
    }

    public static ljq DR(String string) {
        mww mww2 = lea.epg().get(string);
        if (mww2 != null) {
            return mww2.Position;
        }
        return null;
    }

    public static ljq DS(String string) {
        Map<String, mwu> map = lea.eph();
        if (!map.isEmpty()) {
            for (mwu mwu2 : map.values()) {
                if (!mwu2.FileName.equalsIgnoreCase(string)) continue;
                return mwu2.Position;
            }
        }
        return null;
    }

    public static ljq DT(String string) {
        mwu mwu2 = lea.eph().get(string);
        return mwu2 != null ? mwu2.Position : null;
    }

    public static boolean DU(String string) {
        Map<String, mwu> map = lea.eph();
        if (!map.isEmpty()) {
            for (mwu mwu2 : map.values()) {
                if (!mwu2.FileName.equalsIgnoreCase(string)) continue;
                return true;
            }
        }
        return false;
    }

    public static final String DV(String string) {
        Map<String, mwu> map = lea.eph();
        if (!map.isEmpty()) {
            for (mwu mwu2 : map.values()) {
                if (!mwu2.FileName.equalsIgnoreCase(string)) continue;
                return mwu2.DisplayName;
            }
        }
        return null;
    }

    public static final ljq DW(String string) {
        for (Integer n : fy.TJ.keySet()) {
            List<bsv> list = fy.TJ.get(n);
            for (bsv bsv2 : list) {
                btb btb2 = (btb)bsv2;
                String string2 = btb2.dKs;
                if (!string2.equalsIgnoreCase(string)) continue;
                ljq ljq2 = btb2.Position;
                if (!(ljq2.y > 0.0f)) continue;
                return ljq2;
            }
        }
        return null;
    }
}

