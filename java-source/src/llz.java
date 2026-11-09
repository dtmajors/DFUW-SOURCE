/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class llz<K, V>
implements Map<K, V> {
    public final Map<K, V> rEk;

    public llz(Map<K, V> map) {
        this.rEk = map;
    }

    @Override
    public int size() {
        return this.rEk.size();
    }

    @Override
    public boolean isEmpty() {
        return this.rEk.isEmpty();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.rEk.containsKey(object);
    }

    @Override
    public boolean containsValue(Object object) {
        return this.rEk.containsValue(object);
    }

    @Override
    public V get(Object object) {
        return this.rEk.get(object);
    }

    @Override
    public V put(K k, V v) {
        return this.rEk.put(k, v);
    }

    @Override
    public V remove(Object object) {
        return this.rEk.remove(object);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        this.rEk.putAll(map);
    }

    @Override
    public void clear() {
        this.rEk.clear();
    }

    @Override
    public Set<K> keySet() {
        return this.rEk.keySet();
    }

    @Override
    public Collection<V> values() {
        return this.rEk.values();
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return this.rEk.entrySet();
    }

    @Override
    public boolean equals(Object object) {
        return ((Object)this.rEk).equals(object);
    }

    @Override
    public int hashCode() {
        return ((Object)this.rEk).hashCode();
    }
}

