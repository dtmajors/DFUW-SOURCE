/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.list;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.collection.TransformedCollection;
import org.apache.commons.collections.list.TransformedList;

public class TransformedList
extends TransformedCollection
implements List {
    private static final long serialVersionUID = 1077193035000013141L;

    public static List decorate(List list, Transformer transformer) {
        return new TransformedList(list, transformer);
    }

    protected TransformedList(List list, Transformer transformer) {
        super(list, transformer);
    }

    protected List getList() {
        return (List)this.collection;
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
        object = this.transform(object);
        this.getList().add(index, object);
    }

    public boolean addAll(int index, Collection coll) {
        coll = this.transform(coll);
        return this.getList().addAll(index, coll);
    }

    public ListIterator listIterator() {
        return this.listIterator(0);
    }

    public ListIterator listIterator(int i) {
        return new TransformedListIterator(this, this.getList().listIterator(i));
    }

    public Object set(int index, Object object) {
        object = this.transform(object);
        return this.getList().set(index, object);
    }

    public List subList(int fromIndex, int toIndex) {
        List sub = this.getList().subList(fromIndex, toIndex);
        return new TransformedList(sub, this.transformer);
    }

    static /* synthetic */ Object access$001(TransformedList x0, Object x1) {
        return super.transform(x1);
    }

    static /* synthetic */ Object access$101(TransformedList x0, Object x1) {
        return super.transform(x1);
    }
}

