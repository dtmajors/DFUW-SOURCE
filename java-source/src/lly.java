/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class lly<K, V>
extends llz<K, V> {
    public final Set<K> rEi;
    public final Collection<V> rEj;

    public lly(Map<K, V> map) {
        super(map);
        this.rEi = Collections.unmodifiableSet(map.keySet());
        this.rEj = Collections.unmodifiableCollection(map.values());
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
        return this.rEi;
    }

    @Override
    public Collection<V> values() {
        return this.rEj;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return new lma(super.entrySet());
    }
}

