/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class cfh<K, V extends Comparable<V>>
extends LinkedHashMap<K, V> {
    public cfh() {
    }

    public cfh(Map<K, V> map) {
        super(map);
    }

    public void aNq() {
        LinkedList linkedList = new LinkedList(this.entrySet());
        Collections.sort(linkedList, new Comparator<Map.Entry<K, V>>(this){
            final /* synthetic */ cfh euu;
            {
                this.euu = cfh2;
            }

            public int compare(Map.Entry<K, V> entry, Map.Entry<K, V> entry2) {
                return ((Comparable)entry.getValue()).compareTo(entry2.getValue());
            }
        });
        Collections.reverse(linkedList);
        this.clear();
        for (Map.Entry entry : linkedList) {
            this.put(entry.getKey(), entry.getValue());
        }
    }

    public void print() {
    }
}

