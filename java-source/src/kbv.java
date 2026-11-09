/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 *  lcw
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class kbv {
    private final String pdK = "xml-files/common/specialeffect/effects_for_objects/";
    private final Map<String, Map<Integer, dgj>> pdL = new HashMap<String, Map<Integer, dgj>>();
    private final kbx pdM = new kbx();
    private final kbw pdN = new kbw();

    public void dVc() {
        jrw[] jrwArray;
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/common/specialeffect/effects_for_objects/");
        for (jrw jrw3 : jrwArray = jrw2.dRT()) {
            if (!jrw3.isFile() || !jrw3.getName().endsWith(".xml")) continue;
            String string = jrw3.getName();
            String string2 = "xml-files/common/specialeffect/effects_for_objects/" + string;
            HashMap<Integer, dgj> hashMap = new HashMap<Integer, dgj>();
            try {
                this.pdN.a(string2, hashMap, false, true);
            }
            catch (Exception exception) {
                lfn.b(5, this.getClass().getName(), "loadDataFromXML() : failed to load " + string2 + " because " + exception);
            }
            if (hashMap.isEmpty()) continue;
            this.pdL.put(string, hashMap);
        }
    }

    public void wu(String string) {
        String string2 = string;
        Map<Integer, dgj> map = this.pdL.get(string2);
        Iterator<Map.Entry<Integer, dgj>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, dgj> entry = iterator.next();
            dgj dgj2 = entry.getValue();
            if (!dgj2.getSpecialEffectName().contains("se_animaudio:")) continue;
            iterator.remove();
        }
        this.pdM.g(map, lcw.qLb + "xml-files/common/specialeffect/effects_for_objects/" + string2);
    }

    public final Map<String, Map<Integer, dgj>> dVd() {
        return this.pdL;
    }
}

