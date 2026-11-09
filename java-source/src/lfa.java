/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.commons.collections.MultiMap;

public class lfa
implements MultiMap {
    private TreeMap<Object, List> rkb = new TreeMap();

    @Override
    public void clear() {
        this.rkb.clear();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.rkb.containsKey(object);
    }

    @Override
    public boolean containsValue(Object object) {
        List list = (List)this.get(object);
        if (list == null) {
            return false;
        }
        return list.contains(object);
    }

    public Set entrySet() {
        return this.rkb.entrySet();
    }

    public Object firstKey() {
        if (this.rkb.isEmpty()) {
            return null;
        }
        return this.rkb.firstKey();
    }

    @Override
    public Object get(Object object) {
        return this.rkb.get(object);
    }

    @Override
    public boolean isEmpty() {
        return this.rkb.isEmpty();
    }

    public Set keySet() {
        return this.rkb.keySet();
    }

    @Override
    public Object put(Object object, Object object2) {
        LinkedList<Object> linkedList = (LinkedList<Object>)this.get(object);
        if (linkedList == null) {
            linkedList = lcn.emA();
            this.rkb.put(object, linkedList);
        }
        linkedList.add(object2);
        return object2;
    }

    public void putAll(Map map) {
        if (map == null) {
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        if (map instanceof lfa) {
            for (Map.Entry<Object, List> entry : this.rkb.entrySet()) {
                Object object = entry.getKey();
                List list = entry.getValue();
                for (Object e2 : list) {
                    this.put(object, e2);
                }
            }
        } else {
            for (Map.Entry<Object, List> entry : this.rkb.entrySet()) {
                this.put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override
    public Object remove(Object object) {
        List list = this.rkb.remove(object);
        if (list == null) {
            return null;
        }
        return list;
    }

    @Override
    public Object remove(Object object, Object object2) {
        List list = (List)this.get(object);
        if (list == null) {
            return null;
        }
        if (!list.remove(object2)) {
            return null;
        }
        if (list.isEmpty()) {
            this.rkb.remove(object);
        }
        return object2;
    }

    @Override
    public int size() {
        return this.rkb.size();
    }

    @Override
    public Collection values() {
        return this.rkb.values();
    }

    public String brB() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Content of multimap:\n");
        for (Map.Entry<Object, List> entry : this.rkb.entrySet()) {
            stringBuilder.append("Key: ");
            stringBuilder.append(entry.getKey());
            stringBuilder.append("\n");
            List list = entry.getValue();
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                stringBuilder.append("  Value(");
                stringBuilder.append(i);
                stringBuilder.append("): ");
                stringBuilder.append(list.get(i));
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}

