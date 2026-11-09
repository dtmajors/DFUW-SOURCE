/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class cno {
    public void a(cnv cnv2) {
        cnv2.eOT = 0.0;
        PriorityQueue<cnv> priorityQueue = new PriorityQueue<cnv>();
        priorityQueue.add(cnv2);
        while (!priorityQueue.isEmpty()) {
            cnv cnv3 = (cnv)priorityQueue.poll();
            for (cnm cnm2 : cnv3.eOS) {
                cnv cnv4 = cnm2.eOw;
                double d2 = cnm2.eOx;
                double d3 = cnv3.eOT + d2;
                if (!(d3 < cnv4.eOT)) continue;
                priorityQueue.remove(cnv4);
                cnv4.eOT = d3;
                cnv4.eOU = cnv3;
                priorityQueue.add(cnv4);
            }
        }
    }

    public List<cnv> b(cnv cnv2) {
        ArrayList<cnv> arrayList = new ArrayList<cnv>();
        cnv cnv3 = cnv2;
        while (cnv3 != null) {
            arrayList.add(cnv3);
            cnv3 = cnv3.eOU;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}

