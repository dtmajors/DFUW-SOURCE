/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.set;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.collection.CompositeCollection;
import org.apache.commons.collections.set.CompositeSet;

public class CompositeSet
extends CompositeCollection
implements Set {
    public CompositeSet() {
    }

    public CompositeSet(Set set) {
        super(set);
    }

    public CompositeSet(Set[] sets) {
        super(sets);
    }

    public synchronized void addComposited(Collection c2) {
        if (!(c2 instanceof Set)) {
            throw new IllegalArgumentException("Collections added must implement java.util.Set");
        }
        Iterator i = this.getCollections().iterator();
        while (i.hasNext()) {
            Set set = (Set)i.next();
            Collection intersects = CollectionUtils.intersection(set, c2);
            if (intersects.size() <= 0) continue;
            if (this.mutator == null) {
                throw new UnsupportedOperationException("Collision adding composited collection with no SetMutator set");
            }
            if (!(this.mutator instanceof SetMutator)) {
                throw new UnsupportedOperationException("Collision adding composited collection to a CompositeSet with a CollectionMutator instead of a SetMutator");
            }
            ((SetMutator)this.mutator).resolveCollision(this, set, (Set)c2, intersects);
            if (CollectionUtils.intersection(set, c2).size() <= 0) continue;
            throw new IllegalArgumentException("Attempt to add illegal entry unresolved by SetMutator.resolveCollision()");
        }
        super.addComposited(new Collection[]{c2});
    }

    public synchronized void addComposited(Collection c2, Collection d2) {
        if (!(c2 instanceof Set)) {
            throw new IllegalArgumentException("Argument must implement java.util.Set");
        }
        if (!(d2 instanceof Set)) {
            throw new IllegalArgumentException("Argument must implement java.util.Set");
        }
        this.addComposited(new Set[]{(Set)c2, (Set)d2});
    }

    public synchronized void addComposited(Collection[] comps) {
        int i = comps.length - 1;
        while (i >= 0) {
            this.addComposited(comps[i]);
            --i;
        }
    }

    public void setMutator(CompositeCollection.CollectionMutator mutator) {
        super.setMutator(mutator);
    }

    public boolean remove(Object obj) {
        Iterator i = this.getCollections().iterator();
        while (i.hasNext()) {
            Set set = (Set)i.next();
            if (!set.contains(obj)) continue;
            return set.remove(obj);
        }
        return false;
    }

    public boolean equals(Object obj) {
        Set set;
        return obj instanceof Set && (set = (Set)obj).containsAll(this) && set.size() == this.size();
    }

    public int hashCode() {
        int code = 0;
        Iterator i = this.iterator();
        while (i.hasNext()) {
            Object next = i.next();
            code += next != null ? next.hashCode() : 0;
        }
        return code;
    }
}

