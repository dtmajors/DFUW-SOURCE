/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.binary;

import com.thoughtworks.xstream.io.binary.ReaderDepthState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class ReaderDepthState {
    private static final String EMPTY_STRING = "";
    private State current;

    ReaderDepthState() {
    }

    public void push() {
        State newState = new State(null);
        newState.parent = this.current;
        this.current = newState;
    }

    public void pop() {
        this.current = this.current.parent;
    }

    public String getName() {
        return this.current.name;
    }

    public void setName(String name) {
        this.current.name = name;
    }

    public String getValue() {
        return this.current.value == null ? EMPTY_STRING : this.current.value;
    }

    public void setValue(String value) {
        this.current.value = value;
    }

    public boolean hasMoreChildren() {
        return this.current.hasMoreChildren;
    }

    public void setHasMoreChildren(boolean hasMoreChildren) {
        this.current.hasMoreChildren = hasMoreChildren;
    }

    public void addAttribute(String name, String value) {
        Attribute attribute = new Attribute(null);
        attribute.name = name;
        attribute.value = value;
        if (this.current.attributes == null) {
            this.current.attributes = new ArrayList();
        }
        this.current.attributes.add(attribute);
    }

    public String getAttribute(String name) {
        if (this.current.attributes == null) {
            return null;
        }
        Iterator iterator = this.current.attributes.iterator();
        while (iterator.hasNext()) {
            Attribute attribute = (Attribute)iterator.next();
            if (!attribute.name.equals(name)) continue;
            return attribute.value;
        }
        return null;
    }

    public String getAttribute(int index) {
        if (this.current.attributes == null) {
            return null;
        }
        Attribute attribute = (Attribute)this.current.attributes.get(index);
        return attribute.value;
    }

    public String getAttributeName(int index) {
        if (this.current.attributes == null) {
            return null;
        }
        Attribute attribute = (Attribute)this.current.attributes.get(index);
        return attribute.name;
    }

    public int getAttributeCount() {
        return this.current.attributes == null ? 0 : this.current.attributes.size();
    }

    public Iterator getAttributeNames() {
        if (this.current.attributes == null) {
            return Collections.EMPTY_SET.iterator();
        }
        Iterator attributeIterator = this.current.attributes.iterator();
        return new Iterator(this, attributeIterator){
            private final /* synthetic */ Iterator val$attributeIterator;
            private final /* synthetic */ ReaderDepthState this$0;
            {
                this.this$0 = readerDepthState;
                this.val$attributeIterator = iterator;
            }

            public boolean hasNext() {
                return this.val$attributeIterator.hasNext();
            }

            public Object next() {
                Attribute attribute = (Attribute)this.val$attributeIterator.next();
                return attribute.name;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}

