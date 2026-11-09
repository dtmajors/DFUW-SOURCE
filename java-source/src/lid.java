/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class lid<E> {
    private TreeMap<Long, E> aHm = lcn.emG();

    private long f(double d2, boolean bl) {
        long l = (long)(d2 * 1000.0);
        if (!bl) {
            return l;
        }
        while (this.aHm.containsKey(l)) {
            ++l;
        }
        return l;
    }

    public void a(double d2, E e2) {
        long l = this.f(d2, true);
        this.aHm.put(l, e2);
    }

    public E b(double d2, E e2) {
        long l = this.f(d2, false);
        Iterator<Long> iterator = this.aHm.tailMap(l).keySet().iterator();
        while (iterator.hasNext()) {
            Long l2 = iterator.next();
            E e3 = this.aHm.get(l2);
            if (e3 != e2) continue;
            iterator.remove();
            return e3;
        }
        return null;
    }

    public E c(double d2, E e2) {
        long l = this.f(d2, false);
        Iterator<Long> iterator = this.aHm.tailMap(l).keySet().iterator();
        while (iterator.hasNext()) {
            Long l2 = iterator.next();
            E e3 = this.aHm.get(l2);
            if (!e3.equals(e2)) continue;
            iterator.remove();
            return e3;
        }
        return null;
    }

    public void clear() {
        this.aHm.clear();
    }

    public E eg(double d2) {
        if (this.aHm.isEmpty()) {
            return null;
        }
        long l = this.f(d2, false);
        if (this.aHm.firstKey() <= l) {
            return this.aHm.remove(this.aHm.firstKey());
        }
        return null;
    }

    public List<E> eh(double d2) {
        if (this.aHm.isEmpty()) {
            return null;
        }
        long l = this.f(d2, false);
        if (this.aHm.firstKey() > l) {
            return null;
        }
        Collection<E> collection = this.aHm.headMap(l + 1L).values();
        ArrayList<E> arrayList = lcn.abH(collection.size());
        arrayList.addAll(collection);
        collection.clear();
        return arrayList;
    }

    public boolean isEmpty() {
        return this.aHm.isEmpty();
    }

    public int size() {
        return this.aHm.size();
    }

    public void gt() {
        if (this.aHm.isEmpty()) {
            return;
        }
        int n = 1;
        for (Map.Entry<Long, E> entry : this.aHm.entrySet()) {
            E e2 = entry.getValue();
            if (!(e2 instanceof List)) continue;
            lfn.b(0, "", "Key(" + n++ + "): " + entry.getKey());
            lfn.b(0, "", "Values: [");
            List list = (List)e2;
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                lfn.b(0, "  ", "" + iterator.next());
            }
            lfn.b(0, "", "]");
        }
    }
}

