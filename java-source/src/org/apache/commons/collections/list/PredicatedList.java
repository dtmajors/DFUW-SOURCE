/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections.Predicate;
import org.apache.commons.collections.collection.PredicatedCollection;
import org.apache.commons.collections.list.PredicatedList;

public class PredicatedList
extends PredicatedCollection
implements List {
    private static final long serialVersionUID = -5722039223898659102L;

    public static List decorate(List list, Predicate predicate) {
        return new PredicatedList(list, predicate);
    }

    protected PredicatedList(List list, Predicate predicate) {
        super(list, predicate);
    }

    protected List getList() {
        return (List)this.getCollection();
    }

    public Object get(int index) {
        return this.getList().get(index);
    }

    public int indexOf(Object object) {
        return this.getList().indexOf(object);
    }

    public int lastIndexOf(Object object) {
        return this.getList().lastIndexOf(object);
    }

    public Object remove(int index) {
        return this.getList().remove(index);
    }

    public void add(int index, Object object) {
        this.validate(object);
        this.getList().add(index, object);
    }

    public boolean addAll(int index, Collection coll) {
        Iterator it = coll.iterator();
        while (it.hasNext()) {
            this.validate(it.next());
        }
        return this.getList().addAll(index, coll);
    }

    public ListIterator listIterator() {
        return this.listIterator(0);
    }

    public ListIterator listIterator(int i) {
        return new PredicatedListIterator(this, this.getList().listIterator(i));
    }

    public Object set(int index, Object object) {
        this.validate(object);
        return this.getList().set(index, object);
    }

    public List subList(int fromIndex, int toIndex) {
        List sub = this.getList().subList(fromIndex, toIndex);
        return new PredicatedList(sub, this.predicate);
    }

    static /* synthetic */ void access$001(PredicatedList x0, Object x1) {
        super.validate(x1);
    }

    static /* synthetic */ void access$101(PredicatedList x0, Object x1) {
        super.validate(x1);
    }
}

