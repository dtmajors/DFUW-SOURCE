/*
 * Decompiled with CFR.
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class lck<K, V>
extends LinkedHashMap<K, V> {
    private final int qwd;

    public lck(int n) {
        this.qwd = n;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
        return this.size() > this.qwd;
    }
}

