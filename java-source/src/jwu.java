/*
 * Decompiled with CFR.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Map;

public class jwu {
    private static final String TC = "SFHarvestableObjectsParser";
    private static final lju fzk = new lju(0, 1);
    private static final String oYt = "xml-files/server/gamelogicinfo/harvestable_objects.xml";

    public Map<Integer, Map<ldv, bsz>> dUt() {
        Map<Integer, Map<ldv, bsz>> map = lcn.emw();
        byte[] byArray = null;
        byArray = loi.exd().readFile("level/harvestable_objects.bin");
        if (byArray == null) {
            lfn.b(5, "SFDynamicObjectsParser", "readHarvestableObjects() :Failed to open dynamic harvestabel object file for reading!");
            return map;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        lhd lhd2 = new lhd(new DataInputStream(byteArrayInputStream));
        jyo.c(lhd2, map);
        return map;
    }

    public static void dUu() {
        byte[] byArray = null;
        byArray = loi.exd().readFile("level/harvestable_objects.bin");
        if (byArray == null) {
            lfn.b(5, "SFDynamicObjectsParser", "readHarvestableObjects() :Failed to open dynamic harvestabel object file for reading!");
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        lhd lhd2 = new lhd(new DataInputStream(byteArrayInputStream));
        Map<Integer, Map<ldv, bsz>> map = lcn.emw();
        jyo.c(lhd2, map);
        if (!map.isEmpty()) {
            Map<ldv, bsz> map2 = lea.epH();
            for (Map<ldv, bsz> map3 : map.values()) {
                for (Map.Entry<ldv, bsz> entry : map3.entrySet()) {
                    map2.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }
}

