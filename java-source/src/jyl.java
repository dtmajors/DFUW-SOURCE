/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class jyl {
    private static final boolean bC = false;
    private static final String pas = lcw.qLb + "xml-files/zones/";
    private final lju paq = new lju(0, 1);
    private final jzc par = new jzc();
    private final jta oQa = new jta();
    private boolean oXt;

    public jyl() {
    }

    public jyl(boolean bl) {
        this.oXt = bl;
    }

    private String dUL() {
        String string = "";
        if (this.oXt) {
            string = "filtered_";
        }
        return string;
    }

    public void a(Map<Integer, List<bsv>> map, bsv.a a2) {
        jrw jrw2 = null;
        switch (a2) {
            case dKj: {
                jrw2 = new jrw(pas + this.dUL() + "dynamic_objects_bindstones.xml").dRW();
                break;
            }
            case dKk: {
                jrw2 = new jrw(pas + this.dUL() + "dynamic_objects_guardtowers.xml").dRW();
                break;
            }
            case dKh: {
                jrw2 = new jrw(pas + this.dUL() + "dynamic_objects_vendors.xml").dRW();
                break;
            }
            case dKl: {
                jrw2 = new jrw(pas + this.dUL() + "dynamic_objects_portals.xml").dRW();
                break;
            }
            case dKi: {
                jrw2 = new jrw(pas + this.dUL() + "dynamic_objects_spawnpoints.xml").dRW();
                break;
            }
            case dKg: {
                jrw2 = new jrw(pas + this.dUL() + "dynamic_objects_effects.xml").dRW();
                break;
            }
            case dKn: {
                jrw2 = new jrw(pas + this.dUL() + "dynamic_objects_sound_emitters.xml").dRW();
                break;
            }
            case dKo: {
                jrw2 = new jrw(pas + this.dUL() + "dynamic_objects_teleport_chambers.xml").dRW();
                break;
            }
            default: {
                lfn.b(4, this.getClass().getSimpleName(), "Cannot write dynamic file for type: " + (Object)((Object)a2));
                return;
            }
        }
        Document document = this.par.dSD();
        Object object = this.par.a(document, "SFLevelInfoFile", this.paq);
        Element element = null;
        document.appendChild((Node)object);
        if (a2 == bsv.a.dKi) {
            Element element2 = document.createElement("Group");
            Attr object2 = document.createAttribute("Id");
            object2.setNodeValue("1");
            element2.setAttributeNode(object2);
            object.appendChild(element2);
            object = element2;
        }
        for (Integer n : map.keySet()) {
            Element element2 = document.createElement("Level");
            element = this.oQa.a(document, n, "Guid");
            element2.appendChild(element);
            Element element3 = document.createElement("LevelObjectList");
            element2.appendChild(element3);
            this.a(document, element3, map.get(n), a2);
            if (!element3.hasChildNodes()) continue;
            object.appendChild(element2);
        }
        jsz.a(document, jrw2);
    }

    private void a(Document document, Node node, List<bsv> list, bsv.a a2) {
        if (list == null) {
            lfn.b(4, this.getClass().getSimpleName(), "createDynamicObjectNodesForLevel() : Objects is null for Type = " + (Object)((Object)a2));
            return;
        }
        for (bsv bsv2 : list) {
            switch (a2) {
                case dKg: {
                    this.a(document, node, bsv2);
                    break;
                }
                case dKh: {
                    this.b(document, node, bsv2);
                    break;
                }
                case dKi: {
                    this.g(document, node, bsv2);
                    break;
                }
                case dKj: {
                    this.c(document, node, bsv2);
                    break;
                }
                case dKk: {
                    this.d(document, node, bsv2);
                    break;
                }
                case dKl: {
                    this.e(document, node, bsv2);
                    break;
                }
                case dKn: {
                    this.h(document, node, bsv2);
                    break;
                }
                case dKm: {
                    break;
                }
                case dKo: {
                    this.f(document, node, bsv2);
                }
            }
        }
    }

    private void a(Document document, Node node, bsv bsv2) {
        if (bsv2 instanceof bte) {
            Element element = document.createElement("SFLevelObjectSpecialEffect");
            node.appendChild(element);
            bte bte2 = (bte)bsv2;
            int n = bte2.CD();
            String string = del.zU(n);
            if (string == null) {
                lfn.b(5, this.getClass().getSimpleName(), "createEffectNode() : Invalid EffectType. Could not save SpecialEffect  =" + n);
                return;
            }
            Element element2 = this.oQa.a(document, string, "SFEffectType");
            element.appendChild(element2);
            if (bte2.getSourcePosition() != null) {
                element2 = this.oQa.a(document, bte2.getSourcePosition(), "SourcePosition");
                element.appendChild(element2);
            }
            if (bte2.getTargetPosition() != null) {
                element2 = this.oQa.a(document, bte2.getTargetPosition(), "TargetPosition");
                element.appendChild(element2);
            }
        }
    }

    private void b(Document document, Node node, bsv bsv2) {
        if (bsv2 instanceof bta) {
            Element element = document.createElement("SFLevelObjectInteraction");
            node.appendChild(element);
            bta bta2 = (bta)bsv2;
            Element element2 = this.oQa.c(document, bta2.getGUID());
            element.appendChild(element2);
            element2 = this.oQa.a(document, bta2.av(), "Position");
            element.appendChild(element2);
            element2 = this.oQa.a(document, bta2.getRotation(), "Rotation");
            element.appendChild(element2);
            element2 = this.oQa.a(document, bta2.axo(), "DescriptionFilename");
            element.appendChild(element2);
        }
    }

    private void c(Document document, Node node, bsv bsv2) {
        if (bsv2 instanceof bsw) {
            Element element = document.createElement("SFLevelObjectBindstone");
            node.appendChild(element);
            bsw bsw2 = (bsw)bsv2;
            Element element2 = this.oQa.a(document, bsw2.av(), "Position");
            element.appendChild(element2);
            element2 = this.oQa.a(document, bsw2.getRotation(), "Rotation");
            element.appendChild(element2);
            element2 = this.oQa.a(document, bsw2.pa(), "SFResourceName");
            element.appendChild(element2);
            element2 = this.oQa.a(document, bsw2.axm(), "EnglishName");
            element.appendChild(element2);
            element2 = this.oQa.a(document, bsw2.getID(), "ID");
            element.appendChild(element2);
        }
    }

    private void d(Document document, Node node, bsv bsv2) {
        if (bsv2 instanceof bsy) {
            Element element = document.createElement("SFLevelObjectGuardTower");
            node.appendChild(element);
            bsy bsy2 = (bsy)bsv2;
            Element element2 = this.oQa.a(document, bsy2.av(), "Position");
            element.appendChild(element2);
            element2 = this.oQa.a(document, bsy2.getRotation(), "Rotation");
            element.appendChild(element2);
            element2 = this.oQa.a(document, bsy2.pa(), "SFResourceName");
            element.appendChild(element2);
        }
    }

    private void e(Document document, Node node, bsv bsv2) {
        if (bsv2 instanceof btb) {
            ljq[] ljqArray;
            Element element = document.createElement("SFLevelObjectPortal");
            node.appendChild(element);
            btb btb2 = (btb)bsv2;
            Element element2 = this.oQa.a(document, btb2.Position, "Position");
            element.appendChild(element2);
            element2 = this.oQa.a(document, btb2.my, "Rotation");
            element.appendChild(element2);
            element2 = this.oQa.a(document, btb2.ResourceName, "SFResourceName");
            element.appendChild(element2);
            element2 = this.oQa.a(document, lpd.BH(btb2.ID), "ID");
            element.appendChild(element2);
            element2 = this.oQa.a(document, btb2.dKs, "EnglishName");
            element.appendChild(element2);
            element2 = this.oQa.a(document, btb2.dKz, "KeyResource");
            element.appendChild(element2);
            element2 = this.oQa.a(document, btb2.dKy, "NeedsKey");
            element.appendChild(element2);
            element2 = this.oQa.a(document, btb2.dKA, "Folder");
            element.appendChild(element2);
            element2 = document.createElement("Targets");
            element.appendChild(element2);
            for (ljq ljq2 : ljqArray = btb2.dKx) {
                Element element3 = this.oQa.a(document, ljq2, "Target");
                element2.appendChild(element3);
            }
        }
    }

    private void f(Document document, Node node, bsv bsv2) {
        if (bsv2 instanceof btf) {
            Element element = document.createElement("SFLevelObjectTeleportChamber");
            node.appendChild(element);
            btf btf2 = (btf)bsv2;
            Element element2 = this.oQa.a(document, btf2.Position, "Position");
            element.appendChild(element2);
            element2 = this.oQa.a(document, btf2.my, "Rotation");
            element.appendChild(element2);
            element2 = this.oQa.a(document, btf2.ResourceName, "SFResourceName");
            element.appendChild(element2);
            element2 = this.oQa.a(document, btf2.dKs, "EnglishName");
            element.appendChild(element2);
            element2 = this.oQa.a(document, lpd.BH(btf2.ID), "ID");
            element.appendChild(element2);
        }
    }

    private void g(Document document, Node node, bsv bsv2) {
        if (bsv2 instanceof btd) {
            Element element = document.createElement("SFLevelObjectSpawnPoint");
            node.appendChild(element);
            btd btd2 = (btd)bsv2;
            Element element2 = this.oQa.c(document, btd2.getGUID());
            element.appendChild(element2);
            element2 = this.oQa.a(document, btd2.av(), "Position");
            element.appendChild(element2);
            element2 = this.oQa.a(document, btd2.axo(), "DescriptionFilename");
            element.appendChild(element2);
        }
    }

    private void h(Document document, Node node, bsv bsv2) {
        if (bsv2 instanceof btc) {
            btc btc2 = (btc)bsv2;
            node.appendChild(btc2.a(document, this.oQa));
        }
    }

    public void T(Map<Integer, List<dfq>> map) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(lcw.qLb + "level/" + "dynamic_objects_lights.bin");
        }
        catch (FileNotFoundException fileNotFoundException) {
            lfn.b(5, "SFDynamicObjectsWriter", "writeDynamicLightsFile() :Failed to open dynamic lights file for writing!");
            return;
        }
        lhd lhd2 = new lhd(new DataOutputStream(fileOutputStream));
        jyl.a(lhd2, map);
        try {
            fileOutputStream.close();
        }
        catch (IOException iOException) {
            lfn.b(5, "SFDynamicObjectsWriter", "writeDynamicLightsFile() : failed to flush the stream!!");
        }
    }

    public static void a(lhd lhd2, Map<Integer, List<dfq>> map) {
        dez dez2 = new dez();
        lhd2.acN(0);
        int n = map.size();
        n = lhd2.c(n, 0);
        Integer[] integerArray = new Integer[n];
        integerArray = map.keySet().toArray(integerArray);
        for (int i2 = 0; i2 < n; ++i2) {
            if (integerArray[i2] == null) {
                integerArray[i2] = new Integer(0);
            }
            integerArray[i2] = lhd2.c(integerArray[i2], 0);
            List<dfq> list = map.get(integerArray[i2]);
            if (list == null) {
                list = lcn.emv();
                map.put(integerArray[i2], list);
            }
            int n2 = list.size();
            n2 = lhd2.c(n2, 0);
            for (int i3 = 0; i3 < n2; ++i3) {
                dfq dfq2 = null;
                if (lhd2.eqA()) {
                    dfq2 = (dfq)dez2.Af(28);
                    list.add(dfq2);
                } else {
                    dfq2 = list.get(i3);
                }
                dfq2.a(lhd2);
            }
        }
    }

    public void U(Map<Integer, Map<Integer, List<bsx>>> map) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(lcw.qLb + "level/" + "dynamic_objects_generic.bin");
        }
        catch (FileNotFoundException fileNotFoundException) {
            lfn.b(5, "SFDynamicObjectsWriter", "writeGenericDynamicFile() :Failed to open generic dynamic objects file for writing!");
            return;
        }
        lhd lhd2 = new lhd(new DataOutputStream(fileOutputStream));
        jyl.b(lhd2, map);
        try {
            fileOutputStream.close();
        }
        catch (IOException iOException) {
            lfn.b(5, "SFDynamicObjectsWriter", "writeGenericDynamicObjectsFile() : failed to flush the stream!!");
        }
        jrw jrw2 = new jrw(pas + this.dUL() + "dynamic_objects_generic.xml").dRW();
        Document document = this.par.dSD();
        Element element = this.par.a(document, "SFLevelInfoFile", this.paq);
        Element element2 = null;
        document.appendChild(element);
        ArrayList<String> arrayList = lcn.emv();
        for (Integer object : map.keySet()) {
            fy.a a2 = fy.a.getValue(object);
            Element element3 = document.createElement("ObjectType");
            element2 = this.oQa.a(document, object);
            element3.appendChild(element2);
            Map<Integer, List<bsx>> map2 = map.get(object);
            for (Integer n : map2.keySet()) {
                Element element4 = document.createElement("Level");
                element2 = this.oQa.a(document, n, "Guid");
                element4.appendChild(element2);
                Element element5 = document.createElement("LevelObjectList");
                element4.appendChild(element5);
                List<bsx> list = map2.get(n);
                for (bsx bsx2 : list) {
                    Element element6 = document.createElement("GenericObject");
                    for (Map.Entry<String, Object> entry : bsx2.axn().entrySet()) {
                        Object object2;
                        Element element7 = document.createElement(entry.getKey());
                        if (entry.getValue() instanceof ljq) {
                            object2 = (ljq)entry.getValue();
                            element7.appendChild(this.oQa.a(document, (ljq)object2));
                        }
                        if (entry.getValue() instanceof String) {
                            if (a2 == fy.a.TS) {
                                object2 = ((String)entry.getValue()).replace(".xml", "");
                                if (entry.getKey().equalsIgnoreCase(mjc.a.Dzh.name()) && !arrayList.contains(((String)object2).toLowerCase())) {
                                    arrayList.add(((String)object2).toLowerCase());
                                }
                            }
                            object2 = (String)entry.getValue();
                            element7.appendChild(this.oQa.c(document, (String)object2));
                        }
                        if (entry.getValue() instanceof Float) {
                            object2 = (Float)entry.getValue();
                            element7.appendChild(this.oQa.a(document, ((Float)object2).floatValue()));
                        }
                        if (entry.getValue() instanceof Integer) {
                            object2 = (Integer)entry.getValue();
                            element7.appendChild(this.oQa.a(document, (Integer)object2));
                        }
                        element6.appendChild(element7);
                    }
                    element5.appendChild(element6);
                }
                Map<Integer, List<bsx>> map3 = map.get(element4);
                if (!element5.hasChildNodes()) continue;
                element3.appendChild(element4);
            }
            element.appendChild(element3);
        }
        jsz.a(document, jrw2);
        if (!arrayList.isEmpty()) {
            jrw2 = new jrw(lcw.qLb + "xml-files/server/gamelogicinfo/" + "spawnpoints_with_gate.xml").dRW();
            document = this.par.dSD();
            element = this.par.a(document, "SFSpawnPoints", this.paq);
            element2 = null;
            document.appendChild(element);
            for (String string : arrayList) {
                element2 = this.oQa.a(document, string, "SFSpawnPoint");
                element.appendChild(element2);
            }
        }
        jsz.a(document, jrw2);
    }

    public static void b(lhd lhd2, Map<Integer, Map<Integer, List<bsx>>> map) {
        lhd2.acN(0);
        int n = map.size();
        n = lhd2.c(n, 0);
        Integer[] integerArray = new Integer[n];
        integerArray = map.keySet().toArray(integerArray);
        for (int i2 = 0; i2 < n; ++i2) {
            if (integerArray[i2] == null) {
                integerArray[i2] = new Integer(0);
            }
            integerArray[i2] = lhd2.c(integerArray[i2], 0);
            Map<Integer, List<bsx>> map2 = map.get(integerArray[i2]);
            if (map2 == null) {
                map2 = lcn.emw();
                map.put(integerArray[i2], map2);
            }
            int n2 = map2.size();
            n2 = lhd2.c(n2, 0);
            Integer[] integerArray2 = new Integer[n2];
            integerArray2 = map2.keySet().toArray(integerArray2);
            for (int i3 = 0; i3 < n2; ++i3) {
                if (integerArray2[i3] == null) {
                    integerArray2[i3] = new Integer(0);
                }
                integerArray2[i3] = lhd2.c(integerArray2[i3], 0);
                List<bsx> list = map2.get(integerArray2[i3]);
                if (list == null) {
                    list = lcn.emv();
                    map2.put(integerArray2[i3], list);
                }
                int n3 = list.size();
                n3 = lhd2.c(n3, 0);
                for (int i4 = 0; i4 < n3; ++i4) {
                    bsx bsx2 = null;
                    if (lhd2.eqA()) {
                        bsx2 = new bsx();
                        list.add(bsx2);
                    } else {
                        bsx2 = list.get(i4);
                    }
                    bsx2.a(lhd2);
                }
            }
        }
    }
}

