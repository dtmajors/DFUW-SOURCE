/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.list;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections.list.AbstractLinkedList;

public abstract class AbstractLinkedList
implements List {
    protected transient Node header;
    protected transient int size;
    protected transient int modCount;

    protected AbstractLinkedList() {
    }

    protected AbstractLinkedList(Collection coll) {
        this.init();
        this.addAll(coll);
    }

    protected void init() {
        this.header = this.createHeaderNode();
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public Object get(int index) {
        Node node = this.getNode(index, false);
        return node.getValue();
    }

    public Iterator iterator() {
        return this.listIterator();
    }

    public ListIterator listIterator() {
        return new LinkedListIterator(this, 0);
    }

    public ListIterator listIterator(int fromIndex) {
        return new LinkedListIterator(this, fromIndex);
    }

    public int indexOf(Object value) {
        int i = 0;
        Node node = this.header.next;
        while (node != this.header) {
            if (this.isEqualValue(node.getValue(), value)) {
                return i;
            }
            ++i;
            node = node.next;
        }
        return -1;
    }

    public int lastIndexOf(Object value) {
        int i = this.size - 1;
        Node node = this.header.previous;
        while (node != this.header) {
            if (this.isEqualValue(node.getValue(), value)) {
                return i;
            }
            --i;
            node = node.previous;
        }
        return -1;
    }

    public boolean contains(Object value) {
        return this.indexOf(value) != -1;
    }

    public boolean containsAll(Collection coll) {
        Iterator it = coll.iterator();
        while (it.hasNext()) {
            if (this.contains(it.next())) continue;
            return false;
        }
        return true;
    }

    public Object[] toArray() {
        return this.toArray(new Object[this.size]);
    }

    public Object[] toArray(Object[] array) {
        if (array.length < this.size) {
            Class<?> componentType = array.getClass().getComponentType();
            array = (Object[])Array.newInstance(componentType, this.size);
        }
        int i = 0;
        Node node = this.header.next;
        while (node != this.header) {
            array[i] = node.getValue();
            node = node.next;
            ++i;
        }
        if (array.length > this.size) {
            array[this.size] = null;
        }
        return array;
    }

    public List subList(int fromIndexInclusive, int toIndexExclusive) {
        return new LinkedSubList(this, fromIndexInclusive, toIndexExclusive);
    }

    public boolean add(Object value) {
        this.addLast(value);
        return true;
    }

    public void add(int index, Object value) {
        Node node = this.getNode(index, true);
        this.addNodeBefore(node, value);
    }

    public boolean addAll(Collection coll) {
        return this.addAll(this.size, coll);
    }

    public boolean addAll(int index, Collection coll) {
        Node node = this.getNode(index, true);
        Iterator itr = coll.iterator();
        while (itr.hasNext()) {
            Object value = itr.next();
            this.addNodeBefore(node, value);
        }
        return true;
    }

    public Object remove(int index) {
        Node node = this.getNode(index, false);
        Object oldValue = node.getValue();
        this.removeNode(node);
        return oldValue;
    }

    public boolean remove(Object value) {
        Node node = this.header.next;
        while (node != this.header) {
            if (this.isEqualValue(node.getValue(), value)) {
                this.removeNode(node);
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public boolean removeAll(Collection coll) {
        boolean modified = false;
        Iterator it = this.iterator();
        while (it.hasNext()) {
            if (!coll.contains(it.next())) continue;
            it.remove();
            modified = true;
        }
        return modified;
    }

    public boolean retainAll(Collection coll) {
        boolean modified = false;
        Iterator it = this.iterator();
        while (it.hasNext()) {
            if (coll.contains(it.next())) continue;
            it.remove();
            modified = true;
        }
        return modified;
    }

    public Object set(int index, Object value) {
        Node node = this.getNode(index, false);
        Object oldValue = node.getValue();
        this.updateNode(node, value);
        return oldValue;
    }

    public void clear() {
        this.removeAllNodes();
    }

    public Object getFirst() {
        Node node = this.header.next;
        if (node == this.header) {
            throw new NoSuchElementException();
        }
        return node.getValue();
    }

    public Object getLast() {
        Node node = this.header.previous;
        if (node == this.header) {
            throw new NoSuchElementException();
        }
        return node.getValue();
    }

    public boolean addFirst(Object o) {
        this.addNodeAfter(this.header, o);
        return true;
    }

    public boolean addLast(Object o) {
        this.addNodeBefore(this.header, o);
        return true;
    }

    public Object removeFirst() {
        Node node = this.header.next;
        if (node == this.header) {
            throw new NoSuchElementException();
        }
        Object oldValue = node.getValue();
        this.removeNode(node);
        return oldValue;
    }

    public Object removeLast() {
        Node node = this.header.previous;
        if (node == this.header) {
            throw new NoSuchElementException();
        }
        Object oldValue = node.getValue();
        this.removeNode(node);
        return oldValue;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List other = (List)obj;
        if (other.size() != this.size()) {
            return false;
        }
        ListIterator it1 = this.listIterator();
        ListIterator it2 = other.listIterator();
        while (it1.hasNext() && it2.hasNext()) {
            Object o1 = it1.next();
            Object o2 = it2.next();
            if (o1 == null ? o2 == null : o1.equals(o2)) continue;
            return false;
        }
        return !it1.hasNext() && !it2.hasNext();
    }

    public int hashCode() {
        int hashCode = 1;
        Iterator it = this.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            hashCode = 31 * hashCode + (obj == null ? 0 : obj.hashCode());
        }
        return hashCode;
    }

    public String toString() {
        if (this.size() == 0) {
            return "[]";
        }
        StringBuffer buf = new StringBuffer(16 * this.size());
        buf.append("[");
        Iterator it = this.iterator();
        boolean hasNext = it.hasNext();
        while (hasNext) {
            Object value = it.next();
            buf.append((Object)(value == this ? "(this Collection)" : value));
            hasNext = it.hasNext();
            if (!hasNext) continue;
            buf.append(", ");
        }
        buf.append("]");
        return buf.toString();
    }

    protected boolean isEqualValue(Object value1, Object value2) {
        return value1 == value2 || (value1 == null ? false : value1.equals(value2));
    }

    protected void updateNode(Node node, Object value) {
        node.setValue(value);
    }

    protected Node createHeaderNode() {
        return new Node();
    }

    protected Node createNode(Object value) {
        return new Node(value);
    }

    protected void addNodeBefore(Node node, Object value) {
        Node newNode = this.createNode(value);
        this.addNode(newNode, node);
    }

    protected void addNodeAfter(Node node, Object value) {
        Node newNode = this.createNode(value);
        this.addNode(newNode, node.next);
    }

    protected void addNode(Node nodeToInsert, Node insertBeforeNode) {
        nodeToInsert.next = insertBeforeNode;
        nodeToInsert.previous = insertBeforeNode.previous;
        insertBeforeNode.previous.next = nodeToInsert;
        insertBeforeNode.previous = nodeToInsert;
        ++this.size;
        ++this.modCount;
    }

    protected void removeNode(Node node) {
        node.previous.next = node.next;
        node.next.previous = node.previous;
        --this.size;
        ++this.modCount;
    }

    protected void removeAllNodes() {
        this.header.next = this.header;
        this.header.previous = this.header;
        this.size = 0;
        ++this.modCount;
    }

    protected Node getNode(int index, boolean endMarkerAllowed) throws IndexOutOfBoundsException {
        Node node;
        if (index < 0) {
            throw new IndexOutOfBoundsException("Couldn't get the node: index (" + index + ") less than zero.");
        }
        if (!endMarkerAllowed && index == this.size) {
            throw new IndexOutOfBoundsException("Couldn't get the node: index (" + index + ") is the size of the list.");
        }
        if (index > this.size) {
            throw new IndexOutOfBoundsException("Couldn't get the node: index (" + index + ") greater than the size of the " + "list (" + this.size + ").");
        }
        if (index < this.size / 2) {
            node = this.header.next;
            int currentIndex = 0;
            while (currentIndex < index) {
                node = node.next;
                ++currentIndex;
            }
        } else {
            node = this.header;
            int currentIndex = this.size;
            while (currentIndex > index) {
                node = node.previous;
                --currentIndex;
            }
        }
        return node;
    }

    protected Iterator createSubListIterator(LinkedSubList subList) {
        return this.createSubListListIterator(subList, 0);
    }

    protected ListIterator createSubListListIterator(LinkedSubList subList, int fromIndex) {
        return new LinkedSubListIterator(subList, fromIndex);
    }

    protected void doWriteObject(ObjectOutputStream outputStream) throws IOException {
        outputStream.writeInt(this.size());
        Iterator itr = this.iterator();
        while (itr.hasNext()) {
            outputStream.writeObject(itr.next());
        }
    }

    protected void doReadObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        this.init();
        int size = inputStream.readInt();
        int i = 0;
        while (i < size) {
            this.add(inputStream.readObject());
            ++i;
        }
    }
}

