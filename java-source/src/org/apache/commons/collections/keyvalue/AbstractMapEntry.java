/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.keyvalue;

import java.util.Map;
import org.apache.commons.collections.keyvalue.AbstractKeyValue;

public abstract class AbstractMapEntry
extends AbstractKeyValue
implements Map.Entry {
    protected AbstractMapEntry(Object key, Object value) {
        super(key, value);
    }

    public Object setValue(Object value) {
        Object answer = this.value;
        this.value = value;
        return answer;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object obj) {
        boolean bl;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry other = (Map.Entry)obj;
        if (this.getKey() == null) {
            if (other.getKey() != null) return false;
            bl = true;
        } else {
            bl = this.getKey().equals(other.getKey());
        }
        if (!bl) return false;
        if (this.getValue() == null) {
            if (other.getValue() != null) return false;
            return true;
        }
        boolean bl2 = this.getValue().equals(other.getValue());
        if (!bl2) return false;
        return true;
    }

    public int hashCode() {
        return (this.getKey() == null ? 0 : this.getKey().hashCode()) ^ (this.getValue() == null ? 0 : this.getValue().hashCode());
    }
}

