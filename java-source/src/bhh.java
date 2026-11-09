/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class bhh
extends bgk {
    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("type");
        if (string == null) {
            this.fw("Missing required parameter 'type': Must be one of 'resources', 'roles', 'specializations', 'boosters', 'permissions'");
            return;
        }
        if (string.equals("resources")) {
            this.aph();
        } else if (string.equals("roles")) {
            this.api();
        } else if (string.equals("specializations")) {
            this.apk();
        } else if (string.equals("boosters")) {
            this.apl();
        } else if (string.equals("permissions")) {
            this.apj();
        } else {
            this.fw("Invalid parameter 'type': Must be one of 'resources', 'roles', 'specializations', 'boosters', 'permissions'");
            return;
        }
    }

    private void aph() {
        List<ler> list = lea.enW().a(lea.enW().eqq(), true);
        if (list == null || list.isEmpty()) {
            this.fw("This shouldn't happen");
            return;
        }
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        for (ler ler2 : list) {
            lgw lgw2 = (lgw)ler2;
            if (!cug.ur((int)lgw2.getType())) continue;
            treeMap.put(lgw2.getName(), lgw2.getDescription());
        }
        this.s(treeMap);
    }

    private void api() {
        if (lea.epx() == null) {
            this.fw("This shouldn't happen");
            return;
        }
        if (lea.epx().aQE() == null) {
            this.fw("This shouldn't happen");
            return;
        }
        Collection<cjx> collection = lea.epx().aQE();
        if (collection.isEmpty()) {
            this.fw("This shouldn't happen");
            return;
        }
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        for (cjx cjx2 : collection) {
            treeMap.put("Role" + cjx2.getIndex(), cjx2.getDisplayName());
        }
        this.s(treeMap);
    }

    private void apj() {
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        for (bca bca2 : bca.values()) {
            treeMap.put("Permission" + bca2.getID(), bca2.toString());
        }
        this.s(treeMap);
    }

    private void apk() {
        if (lea.epx() == null) {
            this.fw("This shouldn't happen");
            return;
        }
        if (lea.epx().aQE() == null) {
            this.fw("This shouldn't happen");
            return;
        }
        Collection<cjx> collection = lea.epx().aQE();
        if (collection.isEmpty()) {
            this.fw("This shouldn't happen");
            return;
        }
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        for (cjx cjx2 : collection) {
            Map<Integer, ckd> map = cjx2.aQx();
            if (map == null || map.isEmpty()) {
                this.fw("This shouldn't happen");
                return;
            }
            for (ckd ckd2 : map.values()) {
                treeMap.put("Role" + cjx2.getIndex() + ".Specialization" + ckd2.getIndex(), ckd2.getDisplayName());
            }
        }
        this.s(treeMap);
    }

    private void apl() {
        Map<Integer, ckk> map = lea.epw().aRd();
        if (map == null || map.isEmpty()) {
            this.fw("This shouldn't happen");
            return;
        }
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        for (ckk ckk2 : map.values()) {
            treeMap.put("Booster" + ckk2.getID(), ckk2.getDisplayName());
        }
        this.s(treeMap);
    }
}

