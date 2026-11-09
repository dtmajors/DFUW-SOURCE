/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.SwingWorker;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class amt
extends SwingWorker<Void, Void> {
    public static final String bAF = "C:/DarkFall/Data/Dev/dfdata/xml-files/zones/spawn-distribution/";
    private static final String bAG = "configuration_server_ai";
    private static final String bAH = "C:/DarkFall/Data/Dev/dfdata/xml-files/zones/spawn-distribution/spawnpoints_nodes.xml";
    private static final String bAI = "monsterspawns_ai";
    private static String bAJ = a.bAS.toString();
    private static final myy bAK = new myy();
    private static final String bAL = "worlddata_ai";
    private static final Comparator<String> bAM = new Comparator<String>(){

        public int compare(String string, String string2) {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            if (string.equals(string2)) {
                return 0;
            }
            char[] cArray = string.toCharArray();
            char[] cArray2 = string2.toCharArray();
            int n6 = Math.max(cArray.length, cArray2.length);
            StringBuffer stringBuffer = new StringBuffer();
            StringBuffer stringBuffer2 = new StringBuffer();
            StringBuffer stringBuffer3 = new StringBuffer();
            StringBuffer stringBuffer4 = new StringBuffer();
            StringBuffer stringBuffer5 = new StringBuffer();
            StringBuffer stringBuffer6 = new StringBuffer();
            for (n5 = 0; n5 < n6; ++n5) {
                n4 = n5 >= cArray.length ? 65535 : cArray[n5];
                int n7 = n3 = n5 >= cArray2.length ? 65535 : cArray2[n5];
                if (Character.isDigit((char)n4)) {
                    stringBuffer5.append((char)n4);
                }
                if (Character.isDigit((char)n3)) {
                    stringBuffer6.append((char)n3);
                }
                if (n4 == n3) continue;
                if (stringBuffer5.length() == 0) {
                    stringBuffer.append((char)n4);
                } else {
                    stringBuffer3.append((char)n4);
                }
                if (stringBuffer6.length() == 0) {
                    stringBuffer2.append((char)n3);
                    continue;
                }
                stringBuffer4.append((char)n3);
            }
            if (stringBuffer5.length() == 0 && stringBuffer6.length() == 0) {
                return string.hashCode() - string2.hashCode();
            }
            n5 = stringBuffer.length();
            if (n5 != (n4 = stringBuffer2.length())) {
                return n5 - n4;
            }
            n3 = stringBuffer.toString().hashCode();
            if (n3 != (n2 = stringBuffer2.toString().hashCode())) {
                return n3 - n2;
            }
            int n8 = stringBuffer5.length() == 0 ? 0 : Integer.parseInt(stringBuffer5.toString());
            int n9 = n8 - (n = stringBuffer6.length() == 0 ? 0 : Integer.parseInt(stringBuffer6.toString()));
            if (n9 != 0) {
                return n9;
            }
            return stringBuffer3.toString().hashCode() - stringBuffer4.toString().hashCode();
        }
    };
    private final TreeSet<b> bAN = lcn.emH();
    private final Map<String, btg> bAO = lcn.d(bAM);

    private static void n(String string, String string2) {
        File[] fileArray;
        File file = new File(string);
        for (File file2 : fileArray = file.listFiles(new FileFilter(string2){
            final /* synthetic */ String bAP;
            {
                this.bAP = string;
            }

            public boolean accept(File file) {
                return file.getName().toLowerCase().contains(this.bAP);
            }
        })) {
            file2.delete();
        }
    }

    private static ljq Z(String string) {
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        if (string.contains("_dungeon")) {
            object = string.substring(string.indexOf("_dungeon") + "_dungeon".length());
            stringBuilder.append("xml-files/objectspace/dungeons/").append(string.substring(0, string.indexOf(95))).append("/").append("_dungeon".substring(1)).append(((String)object).substring(0, ((String)object).indexOf(95))).append("/").append(string);
        } else {
            stringBuilder.append("xml-files/objectspace/built_tiles/").append(string.substring(0, string.indexOf(95))).append("/").append(string);
        }
        if (!new File(lcw.qLb + stringBuilder.toString()).isFile()) {
            stringBuilder.setLength(0);
            stringBuilder.append("xml-files/objectspace/sea_tiles/").append(string.substring(0, string.indexOf(95))).append("/").append(string);
        }
        object = jsy.tJ(stringBuilder.toString());
        Node node = jsy.a("SFObjectSpace", (Node)object);
        Node node2 = jsy.a("SpawnPointTemplateReference", node);
        Node node3 = jsy.a("Position", node2);
        return jsy.w(node3);
    }

    public amt(File file, a a2) {
        bAJ = a2 != null && !"".equalsIgnoreCase(a2.toString()) ? a2.toString() : bAJ;
        this.b(file);
        this.Hw();
        jya jya2 = new jya();
        try {
            jya2.dTX();
        }
        catch (bo bo2) {
            bo2.printStackTrace();
        }
        this.bAO.putAll(fy.ax);
        if (this.bAO.size() != fy.ax.size()) {
            arw.ct.error("initialize() The comparator has fucked up!: " + this.bAO.size() + " " + fy.ax.size());
            System.exit(1);
        }
        Iterator<String> iterator = this.bAO.keySet().iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if (!string.contains(bAJ + "_ai")) continue;
            iterator.remove();
        }
    }

    private void a(String string, lgs lgs2, Set<bst> set) {
        lgs lgs3;
        ljq ljq2;
        String string2;
        lej lej2 = lcw.zf((String)string);
        int n = 31;
        if (lej2.getY() > 0 && !"out_of_bounds".equalsIgnoreCase(string2 = lcw.f((lej)new lej(lej2.getX(), lej2.getY() - 1)).toLowerCase())) {
            ljq2 = lcw.zh((String)string2);
            lgs3 = new lgs((int)ljq2.x, (int)ljq2.rlV, (int)lcw.qGD.x, (int)lcw.qGD.rlV);
            if (lgs3.x(lgs2) && set.add(new bst(string2 + ".lvl", this.dH(string2))) && lgs2.cg + lgs2.H > lgs3.cg + lgs3.H) {
                this.a(string2, lgs2, set);
            }
        }
        if (lej2.getY() < 31 && !"out_of_bounds".equalsIgnoreCase(string2 = lcw.f((lej)new lej(lej2.getX(), lej2.getY() + 1)).toLowerCase())) {
            ljq2 = lcw.zh((String)string2);
            lgs3 = new lgs((int)ljq2.x, (int)ljq2.rlV, (int)lcw.qGD.x, (int)lcw.qGD.rlV);
            if (lgs3.x(lgs2) && set.add(new bst(string2 + ".lvl", this.dH(string2))) && lgs2.cg < lgs3.cg) {
                this.a(string2, lgs2, set);
            }
        }
        if (lej2.getX() > 0 && !"out_of_bounds".equalsIgnoreCase(string2 = lcw.f((lej)new lej(lej2.getX() - 1, lej2.getY())).toLowerCase())) {
            ljq2 = lcw.zh((String)string2);
            lgs3 = new lgs((int)ljq2.x, (int)ljq2.rlV, (int)lcw.qGD.x, (int)lcw.qGD.rlV);
            if (lgs3.x(lgs2) && set.add(new bst(string2 + ".lvl", this.dH(string2))) && lgs2.cf + lgs2.rmN > lgs3.cf + lgs3.rmN) {
                this.a(string2, lgs2, set);
            }
        }
        if (lej2.getX() < 31 && !"out_of_bounds".equalsIgnoreCase(string2 = lcw.f((lej)new lej(lej2.getX() + 1, lej2.getY())).toLowerCase())) {
            ljq2 = lcw.zh((String)string2);
            lgs3 = new lgs((int)ljq2.x, (int)ljq2.rlV, (int)lcw.qGD.x, (int)lcw.qGD.rlV);
            if (lgs3.x(lgs2) && set.add(new bst(string2 + ".lvl", this.dH(string2))) && lgs2.cf < lgs3.cf) {
                this.a(string2, lgs2, set);
            }
        }
        if (lej2.getX() > 0 && lej2.getY() > 0 && !"out_of_bounds".equalsIgnoreCase(string2 = lcw.f((lej)new lej(lej2.getX() - 1, lej2.getY() - 1)).toLowerCase())) {
            ljq2 = lcw.zh((String)string2);
            lgs3 = new lgs((int)ljq2.x, (int)ljq2.rlV, (int)lcw.qGD.x, (int)lcw.qGD.rlV);
            if (lgs3.x(lgs2) && set.add(new bst(string2 + ".lvl", this.dH(string2))) && lgs2.cg + lgs2.H > lgs3.cg + lgs3.H && lgs2.cf + lgs2.rmN > lgs3.cf + lgs3.rmN) {
                this.a(string2, lgs2, set);
            }
        }
        if (lej2.getX() < 31 && lej2.getY() > 0 && !"out_of_bounds".equalsIgnoreCase(string2 = lcw.f((lej)new lej(lej2.getX() + 1, lej2.getY() - 1)).toLowerCase())) {
            ljq2 = lcw.zh((String)string2);
            lgs3 = new lgs((int)ljq2.x, (int)ljq2.rlV, (int)lcw.qGD.x, (int)lcw.qGD.rlV);
            if (lgs3.x(lgs2) && set.add(new bst(string2 + ".lvl", this.dH(string2))) && lgs2.cg + lgs2.H > lgs3.cg + lgs3.H && lgs2.cf < lgs3.cf) {
                this.a(string2, lgs2, set);
            }
        }
        if (lej2.getX() > 0 && lej2.getY() < 31 && !"out_of_bounds".equalsIgnoreCase(string2 = lcw.f((lej)new lej(lej2.getX() - 1, lej2.getY() + 1)).toLowerCase())) {
            ljq2 = lcw.zh((String)string2);
            lgs3 = new lgs((int)ljq2.x, (int)ljq2.rlV, (int)lcw.qGD.x, (int)lcw.qGD.rlV);
            if (lgs3.x(lgs2) && set.add(new bst(string2 + ".lvl", this.dH(string2))) && lgs2.cg < lgs3.cg && lgs2.cf + lgs2.rmN > lgs3.cf + lgs3.rmN) {
                this.a(string2, lgs2, set);
            }
        }
        if (lej2.getX() < 31 && lej2.getY() < 31 && !"out_of_bounds".equalsIgnoreCase(string2 = lcw.f((lej)new lej(lej2.getX() + 1, lej2.getY() + 1)).toLowerCase())) {
            ljq2 = lcw.zh((String)string2);
            lgs3 = new lgs((int)ljq2.x, (int)ljq2.rlV, (int)lcw.qGD.x, (int)lcw.qGD.rlV);
            if (lgs3.x(lgs2) && set.add(new bst(string2 + ".lvl", this.dH(string2))) && lgs2.cg < lgs3.cg && lgs2.cf < lgs3.cf) {
                this.a(string2, lgs2, set);
            }
        }
    }

    private void Hw() {
        for (arf arf2 : jvj.dTz()) {
            Set set = (Set)arf2.QG();
            int n = set.size();
            for (b b2 : this.bAN) {
                for (String string : b2.Spawnpoints) {
                    if (!set.contains(string + ".xml")) continue;
                    --n;
                }
                if (n == set.size() || n <= 0) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Node");
                stringBuilder.append(' ');
                stringBuilder.append(b2.Node);
                stringBuilder.append(' ');
                stringBuilder.append("has a broken linked group:");
                for (String string : set) {
                    stringBuilder.append(' ');
                    stringBuilder.append(string);
                }
                arw.ct.error(stringBuilder.toString());
                System.exit(1);
            }
        }
    }

    private int dH(String string) {
        return bAK.Eg(string);
    }

    private void b(File file) {
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        Annotations.configureAliases(xStream, b.class);
        String string = file == null || "".equalsIgnoreCase(file.getName()) ? bAH : file.getAbsolutePath();
        try {
            String string2 = jry.tk(string);
            Object object = xStream.fromXML(string2);
            this.bAN.addAll((Collection)object);
        }
        catch (Exception exception) {
            System.err.println("Parsing of file '" + string + "' failed.");
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected Void doInBackground() {
        String string = lcw.qLb + "xml-files/config/" + bAJ + "/";
        String string2 = lcw.qLb + "xml-files/worlddata/" + bAJ + "/";
        String string3 = lcw.qLb + "xml-files/objectspace/" + bAJ + "/";
        amt.n(string, bAG);
        amt.n(string2, bAL);
        amt.n(string3, bAI);
        String string4 = lcw.qLb + "xml-files/objectspace/" + bAI + "_template" + ".xml";
        String string5 = lcw.qLb + "xml-files/worlddata/" + bAL + "_template" + ".xml";
        String string6 = lcw.qLb + "xml-files/config/" + bAG + "_template" + ".xml";
        jta jta2 = new jta();
        int n = 10000;
        int n2 = this.bAN.size();
        this.setProgress(0);
        while (!this.bAN.isEmpty()) {
            b b2 = this.bAN.pollFirst();
            String string7 = "" + b2.Node;
            String string8 = bAJ + "_ai" + string7;
            btg btg2 = this.bAO.get(string8);
            if (btg2 == null) {
                btg2 = new btg();
                btg2.gl(string8);
                this.bAO.put(string8, btg2);
            }
            try {
                Object object;
                Object object2;
                Object object3;
                Object object4;
                String string9 = string3 + bAI + string7 + ".xml";
                jrx.c(string4, string9, true);
                DocumentBuilder documentBuilder = jtf.dSE();
                Document document = documentBuilder.parse(string9);
                Node node = jsy.a("SFObjectSpace", (Node)document);
                Set<bst> set = lcn.emx();
                for (String string10 : b2.Spawnpoints) {
                    void var21_33;
                    object4 = null;
                    object3 = null;
                    if (string10.contains("_spawns")) {
                        Object object5;
                        Object object6;
                        Object object7;
                        object2 = string10.substring(0, string10.indexOf("_spawns"));
                        object = (String)object2 + ".lvl";
                        btg btg3 = this.bAO.get(object2);
                        if (btg3 != null) {
                            object7 = btg3.axy();
                            object6 = object7.iterator();
                            while (object6.hasNext()) {
                                object5 = object6.next();
                                if (!((String)object).equalsIgnoreCase(((bst)object5).axf())) continue;
                                object3 = object5;
                                break;
                            }
                        }
                        if (object3 == null) continue;
                        Element element = document.createElement("SpawnPointTemplateReference");
                        object7 = amt.Z(string10);
                        object4 = jta2.a(document, (ljq)object7, "Position");
                        element.appendChild((Node)object4);
                        object6 = documentBuilder.parse(lcw.qLb + "xml-files/object/spawnpoint/" + string10);
                        object5 = jsy.b("Radius", (Node)object6);
                        object5 = object5.getAttributes().getNamedItem("Value");
                        float f = Float.parseFloat(object5.getNodeValue());
                        lgs lgs2 = new lgs((int)(((ljq)object7).x - f), (int)(((ljq)object7).rlV - f), (int)(f * 2.0f), (int)(f * 2.0f));
                        if (!((String)object2).contains("_dungeon")) {
                            this.a((String)object2, lgs2, set);
                        }
                    } else {
                        Element element = document.createElement("SpawnTileTemplateReference");
                        object2 = string10.substring(0, string10.indexOf(".xml"));
                        object3 = this.bAO.get(object2).axy().get(0);
                    }
                    object4 = document.createElement("SFInteger");
                    object4.setAttribute("Value", Integer.toString(++n));
                    object2 = document.createElement("Guid");
                    object2.appendChild((Node)object4);
                    var21_33.appendChild((Node)object2);
                    object4 = jta2.a(document, string10, "DescriptionFilename");
                    var21_33.appendChild((Node)object4);
                    node.appendChild((Node)var21_33);
                    jsz.b(document, string9);
                    set.add((bst)object3);
                }
                Set set2 = lcn.emx();
                for (bst bst2 : set) {
                    if (bst2.axh() != null) {
                        object4 = bst2.axh();
                    } else {
                        object4 = new bss();
                        object3 = bst2.axf();
                        object2 = ((String)object3).substring(0, ((String)object3).indexOf(46));
                        if (((String)object2).contains("_dungeon")) {
                            object2 = ((String)object2).substring(0, ((String)object2).indexOf(95));
                        }
                        object = lcw.zh((String)object2);
                        ((bss)object4).dJw = ((ljq)object).x;
                        ((bss)object4).dJx = ((ljq)object).y - 2000.0f;
                        ((bss)object4).dJy = ((ljq)object).rlV;
                        ((bss)object4).dJz = ((ljq)object).x + lcw.qGD.x;
                        ((bss)object4).dJA = ((ljq)object).y + 2000.0f;
                        ((bss)object4).dJB = ((ljq)object).rlV + lcw.qGD.rlV;
                        bst2.a((bss)object4);
                    }
                    set2.add(bst2);
                }
                btg2.an(new ArrayList<bst>());
                btg2.axy().addAll(set2);
                String object62 = string2 + bAL + string7 + ".xml";
                jrx.c(string5, object62, true);
                document = documentBuilder.parse(object62);
                Node node3 = jsy.b("DescriptionFilename", document);
                node3 = jry.g(node3);
                node3.setNodeValue(bAJ + '/' + bAI + string7 + ".xml");
                jsz.b(document, object62);
                object4 = string + bAG + string7 + ".xml";
                jrx.c(string6, (String)object4, true);
                document = documentBuilder.parse((String)object4);
                node = jsy.a("SFConfiguration", (Node)document);
                object3 = jsy.a("WorldDataFileAI", node);
                object3 = jry.g((Node)object3);
                object3.setNodeValue(bAJ + '/' + bAL + string7 + ".xml");
                jsz.b(document, (String)object4);
                object3 = jsy.a("ActiveZone", node);
                object3 = jry.g((Node)object3);
                object3.setNodeValue(string8);
                jsz.b(document, (String)object4);
                object3 = jsy.a("LoadDynamicAIFromLevel", node);
                object3 = jry.h((Node)object3);
                object3.setNodeValue("false");
                jsz.b(document, (String)object4);
                object3 = jsy.a("GamelogicConfigFileName", node);
                object3 = jry.g((Node)object3);
                object3.setNodeValue(bAJ + "/gamelogic_configuration_server.xml");
                jsz.b(document, (String)object4);
                arw.ct.info("Saving files for zone: " + string8);
                int n3 = (int)((float)(n2 - this.bAN.size()) / (float)n2 * 100.0f);
                this.setProgress(n3);
            }
            catch (ParserConfigurationException parserConfigurationException) {
                parserConfigurationException.printStackTrace();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            catch (SAXException sAXException) {
                sAXException.printStackTrace();
            }
            catch (bo bo2) {
                bo2.printStackTrace();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        new jzd().V(this.bAO);
        arw.ct.info("DISTRIBUTION COMPLETED! Have a nice day.");
        return null;
    }
}

