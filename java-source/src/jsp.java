/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jsp {
    private jxa nVq = new jxa();
    private jsy nVr = new jsy();
    private String nVs;
    private String nVt;
    private String nVu;
    private String nVv;
    private String nVw;
    private String nVx;
    private String nVy;
    private String nVz;
    private String nVA;
    private String nVB;
    private String nVC;
    private String nVD = "engine-files.xml";
    private String nVE;
    private String nVF;
    private String nVG;
    private String nVH;
    private jtd nVI = new jtd();
    private List nVJ = lcn.emv();
    private String nVK = "C:\\dump\\dfdata";
    private String nVL = lcw.qLb;
    private jsq nVM = new jsq();
    private List nVN = lcn.emv();
    private String bP = "[a-zA-Z][a-fA-F]{0,1}[0-9]{2}";
    private String nUS = "terrain_";
    private jrz nVO;

    public jsp() {
        this.nVs = this.nVL + "mesh/";
        this.nVt = this.nVL + "texture/";
        this.nVC = this.nVL + "texture/dds/";
        this.nVu = this.nVL + "xml/shader/";
        this.nVv = this.nVL + "collision/";
        this.nVw = this.nVL + "shader" + "/";
        this.nVx = this.nVL + "xml-files/objectspace/";
        this.nVy = this.nVL + "xml-files/client/";
        this.nVz = this.nVL + "xml-files/server/";
        this.nVA = this.nVL + "xml-files/gamelogicinfo/";
        this.nVB = this.nVL + "bitmap/";
        this.nVD = this.nVL + "worldbuilder/dump-lists/" + this.nVD;
        this.nVE = this.nVL + "veg/";
        this.nVF = this.nVL + "mesh/shf/";
        this.nVG = this.nVL + "xml/sfsh/";
        this.nVH = this.nVL + "xml/detailtexture/";
    }

    public void a(List list, String string, jsq jsq2, jrz jrz2) {
        this.nVO = jrz2;
        this.nVM = jsq2;
        this.c(list, string);
    }

    public void a(List list, String string, jsq jsq2) {
        this.nVM = jsq2;
        this.c(list, string);
    }

    public void b(List list, String string) {
        this.c(list, string);
    }

    private void c(List list, String string) {
        this.nVK = string;
        ArrayList<jrw> arrayList = lcn.emv();
        arrayList.addAll(list);
        for (jrw jrw2 : list) {
            String string2 = jry.tr(jrw2.getAbsolutePath());
            if (!this.nVI.tO(string2).equals("SFWorldData")) continue;
            this.nVJ.clear();
            arrayList.addAll(this.l(jrw2));
            arrayList.add(jrw2);
            for (String string3 : this.nVJ) {
                jrw jrw3 = new jrw(this.nVx + string3);
                arrayList.add(jrw3);
                lfn.b(0, this.getClass().getName(), "copyFilesToDump() : Adding OSFile: " + jrw3);
            }
        }
        this.bJ(arrayList);
    }

    private List l(jrw jrw2) {
        String string = this.nVL + "xml/";
        HashSet hashSet = null;
        jxd jxd2 = new jxd();
        jxz jxz2 = new jxz();
        Map<String, Map<ldv, amf>> map = jxz2.d(jrw2, false);
        ArrayList<jrw> arrayList = lcn.emv();
        if (map != null) {
            this.nVJ.addAll(jxz2.dUJ());
            String string2 = null;
            amf amf22 = null;
            Iterator<Map<ldv, amf>> iterator = map.values().iterator();
            while (iterator.hasNext()) {
                for (amf amf22 : iterator.next().values()) {
                    string2 = amf22.getObjectDescriptionFilename();
                    if (string2 != null && !string2.equals("n/a") && !string2.equals("")) {
                        arrayList.add(new jrw(string + string2));
                    }
                    this.nVN.addAll(this.u(amf22));
                }
            }
            lfn.b(0, this.getClass().getName(), "getObjectsFromWorldDataFile() : \n\n\n ExtraDataFilenames Size = " + this.nVN.size());
            this.bM(arrayList);
            hashSet = new HashSet(arrayList);
            arrayList = new ArrayList(hashSet);
            Collections.sort(arrayList);
        } else {
            lfn.b(0, "SFUniqueFileFinder", "findUniqueObjectsInObjectSpace() : Could not load Worlddatafile");
        }
        return arrayList;
    }

    private void bJ(List list) {
        jrw jrw2;
        Object object2;
        ArrayList<String> arrayList = lcn.emv();
        for (Object object2 : list) {
            if (object2 instanceof jrw) {
                arrayList.add(((jrw)object2).getAbsolutePath());
                continue;
            }
            arrayList.add((String)object2);
        }
        lfn.b(0, this.getClass().getName(), "XMLFileStrings.size() = " + arrayList.size());
        List list2 = this.bK(arrayList);
        lfn.b(0, this.getClass().getName(), "------------ Found These Files ----------");
        object2 = list2.iterator();
        while (object2.hasNext()) {
            jrw2 = (jrw)object2.next();
            if (!jrw2.exists()) continue;
            lfn.b(0, this.getClass().getName(), "XXX Found file: " + jrw2);
        }
        lfn.b(0, this.getClass().getName(), "------------ Did not Find these Files ----------");
        object2 = list2.iterator();
        while (object2.hasNext()) {
            jrw2 = (jrw)object2.next();
            if (jrw2.exists()) continue;
            lfn.b(4, this.getClass().getName(), "NOT Found file: " + jrw2 + "...");
            object2.remove();
        }
        lfn.b(0, this.getClass().getName(), "------ COPY COPY -----");
        object2 = null;
        jrw2 = new jrw(this.nVK);
        if (!jrw2.exists()) {
            jrw2.mkdir();
        }
        int n = 0;
        int n2 = list2.size();
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            ++n;
            jrw jrw3 = (jrw)iterator.next();
            String string = jrw3.toString();
            String string2 = string.substring(0, this.nVL.length());
            string = string.substring(this.nVL.length() - 1);
            if (string2.equalsIgnoreCase(this.nVL)) {
                string = this.nVK + string;
                object2 = new jrw(string);
                jry.a((jrw)object2, jrw3);
                if (this.nVO != null) {
                    this.nVO.A(n, n2, ((File)object2).getName());
                    continue;
                }
                float f = (float)n * 100.0f / (float)n2;
                lfn.b(0, "SFFileDumpUtility", "copyObjectFilesToDump() : Copying (" + f + "%).. ");
                continue;
            }
            lfn.b(5, this.getClass().getName(), "Something is Wrong with this SFFile: " + jrw3);
        }
    }

    private List bK(List list) {
        int n;
        ArrayList<jrw> arrayList;
        List<Object> list2 = lcn.emv();
        Object object = null;
        for (String string : list) {
            jrw jrw2 = new jrw(string);
            if (jrw2.exists()) {
                lfn.b(0, this.getClass().getName(), "findFilesForObject() : SFFile [" + jrw2 + "] Being processed!");
                Document document = null;
                try {
                    Object object2;
                    Object object3;
                    Object object4;
                    document = jsy.n(jrw2);
                    if (this.tv(jrw2.getName())) {
                        this.nVM.uN(true);
                        object = this.nVq.n(document);
                        if (object != null) {
                            lfn.b(0, this.getClass().getSimpleName(), "findFilesForObject() : Is Terrain XML, so terrain-specific stuff");
                            object = ((String)object).substring(0, ((String)object).lastIndexOf("."));
                            object4 = (String)object + "_detail_textures.xml";
                            object3 = new jrw(this.nVH + (String)object4);
                            if (((File)object3).exists()) {
                                lfn.b(0, this.getClass().getSimpleName(), "findFilesForObject() : Copying DetailTextuee file: " + (String)object4);
                                list2.add(object3);
                            }
                            if (((File)(object2 = new jrw(this.nVE + (String)object + ".sfv"))).exists()) {
                                lfn.b(0, this.getClass().getSimpleName(), "findFilesForObject() : Copying DetailTextuee file: " + object2);
                                list2.add(object2);
                            }
                        }
                        lfn.b(0, this.getClass().getSimpleName(), "findFilesForObject() : Copying Terrain tile material xml file");
                        object4 = new jrw(this.nVL + "worldbuilder/vegetation/" + jrw2.getName());
                        if (((File)object4).exists()) {
                            lfn.b(0, this.getClass().getSimpleName(), "findFilesForObject() : Found TileMatFile = " + ((File)object4).getAbsolutePath());
                            list2.add(object4);
                        }
                        lfn.b(0, this.getClass().getSimpleName(), "findFilesForObject() : Did not Find TileMatFile = " + ((File)object4).getAbsolutePath());
                    }
                    if (this.nVM.dSk()) {
                        list2.add(jrw2);
                    }
                    if ((object4 = jsy.a("SFObject", (Node)document)) == null) continue;
                    if (this.nVM.dSi()) {
                        object = this.nVq.n(document);
                        if (object != null) {
                            list2.add(new jrw(this.nVs + (String)object));
                        } else {
                            object3 = this.nVq.p(document);
                            object2 = object3.iterator();
                            while (object2.hasNext()) {
                                String string2 = (String)object2.next();
                                list2.add(new jrw(this.nVs + string2));
                            }
                        }
                    }
                    if (this.nVM.dSm() && (object = this.nVq.l(document)) != null) {
                        object3 = new jrw(this.nVu + (String)object);
                        list2.add(object3);
                        object = this.nVq.r(jrw2);
                        if (object != null) {
                            list2.add(new jrw(this.nVw + (String)object));
                        }
                    }
                    if (this.nVM.dSj()) {
                        object3 = null;
                        object3 = jxa.q(document);
                        if (object3 != null) {
                            for (int i = 0; i < ((Object)object3).length; ++i) {
                                object = object3[i];
                                if (object == null || ((String)object).equals("")) continue;
                                list2.add(new jrw(this.nVt + (String)object));
                                object = ((String)object).substring(0, ((String)object).lastIndexOf("."));
                                list2.add(new jrw(this.nVt + (String)object + ".dds"));
                                list2.add(new jrw(this.nVt + "dds" + "/" + (String)object + ".dds"));
                            }
                        }
                    }
                    if (this.nVM.dSg() && !(object3 = this.nVq.r(document)).isEmpty()) {
                        Iterator iterator = object3.iterator();
                        while (iterator.hasNext()) {
                            list2.add(new jrw(this.nVv + (String)iterator.next()));
                        }
                    }
                    if ((object3 = this.nVq.o(document)) == null) continue;
                    list2.add(new jrw(this.nVL + "xml/" + (String)object3));
                    lfn.b(0, this.getClass().getSimpleName(), "findFilesForObject() : Adding HitConfig to dump: " + (String)object3);
                    continue;
                }
                catch (bo bo2) {
                    lfn.b(5, "SFMeshFileparser", "getActiveMeshFilename() : Exception: " + bo2);
                    return null;
                }
            }
            lfn.b(4, this.getClass().getName(), "findFilesForObject() : The SFFile [" + jrw2 + "] Does not exist!");
        }
        if (this.nVM.dSl()) {
            arrayList = lcn.emv();
            jry.a(new jrw(this.nVu), null, arrayList, true);
            list2.addAll(arrayList);
            arrayList = lcn.emv();
            jry.a(new jrw(this.nVw), null, arrayList, true);
            list2.addAll(arrayList);
        }
        if (this.nVM.dSn()) {
            arrayList = lcn.emv();
            jry.a(new jrw(this.nVy), null, arrayList, true);
            list2.addAll(arrayList);
            arrayList = lcn.emv();
            jry.a(new jrw(this.nVz), null, arrayList, true);
            list2.addAll(arrayList);
            arrayList = lcn.emv();
            jry.a(new jrw(this.nVA), null, arrayList, true);
            list2.addAll(arrayList);
        }
        if (this.nVM.dSp()) {
            arrayList = lcn.emv();
            jry.a(new jrw(this.nVB), null, arrayList, true);
            list2.addAll(arrayList);
            arrayList = lcn.emv();
            jry.a(new jrw(this.nVt), (FileFilter)new jsm("gui_"), arrayList, true);
            list2.addAll(arrayList);
        }
        if (this.nVM.dSq()) {
            list2.addAll(this.dSf());
        }
        if (this.nVM.dSs()) {
            arrayList = lcn.emv();
            jry.a(new jrw(this.nVE), null, arrayList, true);
            list2.addAll(arrayList);
            arrayList = lcn.emv();
            jry.a(new jrw(this.nVC), (FileFilter)new jsm("veg_"), arrayList, true);
            list2.addAll(arrayList);
        }
        if (this.nVM.dSr()) {
            arrayList = lcn.emv();
            jry.a(new jrw(this.nVF), null, arrayList, true);
            list2.addAll(arrayList);
            arrayList = lcn.emv();
            jry.a(new jrw(this.nVG), null, arrayList, true);
            list2.addAll(arrayList);
        }
        object = null;
        for (n = 0; n < this.nVN.size(); ++n) {
            object = (String)this.nVN.get(n);
            if (object == null) continue;
            list2.add(new jrw((String)object));
        }
        list2 = this.bL(list2);
        n = list2.size();
        ++n;
        lfn.b(0, "SFUniqueFileFinder", "creatfindFilesForObject() : **DONE** Found [" + list2.size() + "] files!");
        return list2;
    }

    private List bL(List arrayList) {
        HashSet hashSet = new HashSet(arrayList);
        arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        return arrayList;
    }

    private List u(amf amf2) {
        ArrayList<String> arrayList = lcn.emv();
        if (amf2 != null) {
            int n = amf2.getObjectType();
            switch (n) {
                case 51: {
                    String[] stringArray = ((drc)amf2).buY();
                    for (int i = 0; i < stringArray.length; ++i) {
                        arrayList.add(this.nVt + stringArray[i]);
                    }
                    lfn.b(0, this.getClass().getName(), "getExtraObjectData() : GOT [" + stringArray.length + "] CLOUDs !!\n\n\n");
                    break;
                }
                case 60: {
                    lfn.b(0, "SFUniqueFileFinder", "getExtraObjectData() : \n\n\nGOT LOGICOBJECT_DESCRIPTION\n\n\n");
                    String string = amf2.getObjectDescriptionFilename();
                    if (string == null || string.equals("") || string.equals("n/a")) break;
                    string = this.nVL + "xml-files/object/logicobject/" + string;
                    arrayList.add(string);
                    break;
                }
            }
        }
        return arrayList;
    }

    private List dSf() {
        mza mza2 = new mza();
        List list = mza2.ao(new jrw(this.nVD));
        if (list != null) {
            for (int i = 0; i < list.size(); ++i) {
                lfn.b(0, this.getClass().getName(), "copyEngineFiles() : Engine SFFile =" + list.get(i));
            }
        } else {
            lfn.b(4, this.getClass().getName(), "copyEngineFiles() : FileList for Dump was null!");
        }
        return list;
    }

    private boolean tv(String string) {
        String string2 = jry.tu(string);
        if (!(string2 = string2.toLowerCase()).startsWith(this.nUS)) {
            return false;
        }
        return Pattern.matches(this.bP, string2 = string2.substring(this.nUS.length()));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void bM(List list) {
        if (list instanceof ArrayList) {
            ArrayList arrayList = (ArrayList)((ArrayList)list).clone();
            if (arrayList.isEmpty()) return;
            Iterator iterator = arrayList.iterator();
            Object e = iterator.next();
            iterator.remove();
            Object object = null;
            int n = 1;
            while (iterator.hasNext()) {
                object = iterator.next();
                if (!object.equals(e)) continue;
                iterator.remove();
                ++n;
            }
            lfn.b(0, "SFUniqueFileFinder", "findDuplicateObjectCount() : Found [" + n + "] references to [" + e + "]");
            if (arrayList.isEmpty()) return;
            this.bM(arrayList);
            return;
        } else {
            lfn.b(5, "SFUniqueFileFinder", "findDuplicateObjectCount() : Cannot fint DUPE-COUNT. Only ArrayList objects supported!");
        }
    }
}

