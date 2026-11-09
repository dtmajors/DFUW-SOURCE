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
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class jyo {
    private static final String TC = "SFHarvestableObjectsWriter";
    private static final lju fzk = new lju(0, 1);
    private static final String oYt = lcw.qLb + "xml-files/server/gamelogicinfo/" + "harvestable_objects.xml";
    private final lju paq = new lju(0, 1);
    private final jzc par = new jzc();
    private final jta oQa = new jta();

    public void V(Map<Integer, Map<ldv, bsz>> map) {
        jrw jrw2 = new jrw(oYt).dRW();
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(lcw.qLb + "level/" + "harvestable_objects.bin");
        }
        catch (FileNotFoundException fileNotFoundException) {
            lfn.b(5, TC, "writeFile() :Failed to open generic dynamic objects file for writing!");
            return;
        }
        lhd lhd2 = new lhd(new DataOutputStream(fileOutputStream));
        jyo.c(lhd2, map);
        try {
            fileOutputStream.close();
        }
        catch (IOException iOException) {
            lfn.b(5, "writeFile", "writeGenericDynamicObjectsFile() : failed to flush the stream!!");
        }
    }

    private Node i(Document document, Node node, bsv bsv2) {
        Element element = null;
        if (bsv2 instanceof bsz) {
            Element element2 = document.createElement("SFLevelObjectHarvestable");
            node.appendChild(element2);
            bsz bsz2 = (bsz)bsv2;
            element = this.oQa.a(document, bsz2.dKv);
            element2.appendChild(element);
            element = this.oQa.a(document, bsz2.Position, "Position");
            element2.appendChild(element);
            element = this.oQa.a(document, bsz2.dKu, "Resource");
            element2.appendChild(element);
        }
        return element;
    }

    public static void c(lhd lhd2, Map<Integer, Map<ldv, bsz>> map) {
        lhd2.acN(0);
        int n = map.size();
        n = lhd2.c(n, 0);
        Integer[] integerArray = new Integer[n];
        integerArray = map.keySet().toArray(integerArray);
        int n2 = map.size();
        n2 = lhd2.c(n2, 0);
        Integer[] integerArray2 = new Integer[n2];
        integerArray2 = map.keySet().toArray(integerArray2);
        for (int i2 = 0; i2 < n2; ++i2) {
            if (integerArray2[i2] == null) {
                integerArray2[i2] = new Integer(0);
            }
            integerArray2[i2] = lhd2.c(integerArray2[i2], 0);
            Map<ldv, bsz> map2 = map.get(integerArray2[i2]);
            if (map2 == null) {
                map2 = lcn.emw();
                map.put(integerArray2[i2], map2);
            }
            int n3 = map2.size();
            n3 = lhd2.c(n3, 0);
            bsz[] bszArray = null;
            if (!lhd2.eqA()) {
                bszArray = map2.values().toArray(new bsz[map2.size()]);
            }
            for (int i3 = 0; i3 < n3; ++i3) {
                bsz bsz2 = null;
                bsz2 = lhd2.eqA() ? new bsz() : bszArray[i3];
                bsz2.a(lhd2);
                if (!lhd2.eqA()) continue;
                map2.put(ldv.aw(bsz2.dKv), bsz2);
            }
        }
    }
}

