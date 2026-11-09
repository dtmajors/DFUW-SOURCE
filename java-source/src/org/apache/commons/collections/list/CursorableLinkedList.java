/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.list;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections.list.AbstractLinkedList;
import org.apache.commons.collections.list.CursorableLinkedList;

public class CursorableLinkedList
extends AbstractLinkedList
implements Serializable {
    private static final long serialVersionUID = 8836393098519411393L;
    protected transient List cursors = new ArrayList();

    public CursorableLinkedList() {
        this.init();
    }

    public CursorableLinkedList(Collection coll) {
        super(coll);
    }

    protected void init() {
        super.init();
        this.cursors = new ArrayList();
    }

    public Iterator iterator() {
        return super.listIterator(0);
    }

    public ListIterator listIterator() {
        return this.cursor(0);
    }

    public ListIterator listIterator(int fromIndex) {
        return this.cursor(fromIndex);
    }

    public Cursor cursor() {
        return this.cursor(0);
    }

    public Cursor cursor(int fromIndex) {
        Cursor cursor = new Cursor(this, fromIndex);
        this.registerCursor(cursor);
        return cursor;
    }

    protected void updateNode(AbstractLinkedList.Node node, Object value) {
        super.updateNode(node, value);
        this.broadcastNodeChanged(node);
    }

    protected void addNode(AbstractLinkedList.Node nodeToInsert, AbstractLinkedList.Node insertBeforeNode) {
        super.addNode(nodeToInsert, insertBeforeNode);
        this.broadcastNodeInserted(nodeToInsert);
    }

    protected void removeNode(AbstractLinkedList.Node node) {
        super.removeNode(node);
        this.broadcastNodeRemoved(node);
    }

    protected void removeAllNodes() {
        if (this.size() > 0) {
            Iterator it = this.iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
        }
    }

    protected void registerCursor(Cursor cursor) {
        Iterator it = this.cursors.iterator();
        while (it.hasNext()) {
            WeakReference ref = (WeakReference)it.next();
            if (ref.get() != null) continue;
            it.remove();
        }
        this.cursors.add(new WeakReference<Cursor>(cursor));
    }

    protected void unregisterCursor(Cursor cursor) {
        Iterator it = this.cursors.iterator();
        while (it.hasNext()) {
            WeakReference ref = (WeakReference)it.next();
            Cursor cur = (Cursor)ref.get();
            if (cur == null) {
                it.remove();
                continue;
            }
            if (cur != cursor) continue;
            ref.clear();
            it.remove();
            break;
        }
    }

    protected void broadcastNodeChanged(AbstractLinkedList.Node node) {
        Iterator it = this.cursors.iterator();
        while (it.hasNext()) {
            WeakReference ref = (WeakReference)it.next();
            Cursor cursor = (Cursor)ref.get();
            if (cursor == null) {
                it.remove();
                continue;
            }
            cursor.nodeChanged(node);
        }
    }

    protected void broadcastNodeRemoved(AbstractLinkedList.Node node) {
        Iterator it = this.cursors.iterator();
        while (it.hasNext()) {
            WeakReference ref = (WeakReference)it.next();
            Cursor cursor = (Cursor)ref.get();
            if (cursor == null) {
                it.remove();
                continue;
            }
            cursor.nodeRemoved(node);
        }
    }

    protected void broadcastNodeInserted(AbstractLinkedList.Node node) {
        Iterator it = this.cursors.iterator();
        while (it.hasNext()) {
            WeakReference ref = (WeakReference)it.next();
            Cursor cursor = (Cursor)ref.get();
            if (cursor == null) {
                it.remove();
                continue;
            }
            cursor.nodeInserted(node);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        this.doWriteObject(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.doReadObject(in);
    }
}

