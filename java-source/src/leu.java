/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class leu {
    public static <K, V extends Comparable<V>> List<Map.Entry<K, V>> ag(Map<K, V> map) {
        ArrayList<Map.Entry<K, V>> arrayList = new ArrayList<Map.Entry<K, V>>(map.entrySet());
        Collections.sort(arrayList, new b(null));
        return arrayList;
    }

    public static List<Map.Entry<Integer, lil<String, Float, Float>>> ah(Map<Integer, lil<String, Float, Float>> map) {
        ArrayList<Map.Entry<Integer, lil<String, Float, Float>>> arrayList = new ArrayList<Map.Entry<Integer, lil<String, Float, Float>>>(map.entrySet());
        Collections.sort(arrayList, new a(null));
        return arrayList;
    }
}

