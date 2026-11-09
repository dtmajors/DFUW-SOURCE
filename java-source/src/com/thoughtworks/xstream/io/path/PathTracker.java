/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.path;

import com.thoughtworks.xstream.io.path.Path;
import java.util.HashMap;
import java.util.Map;

public class PathTracker {
    private int pointer;
    private int capacity;
    private String[] pathStack;
    private Map[] indexMapStack;
    private Path currentPath;

    public PathTracker() {
        this(16);
    }

    public PathTracker(int initialCapacity) {
        this.capacity = Math.max(1, initialCapacity);
        this.pathStack = new String[this.capacity];
        this.indexMapStack = new Map[this.capacity];
    }

    public void pushElement(String name) {
        if (this.pointer + 1 >= this.capacity) {
            this.resizeStacks(this.capacity * 2);
        }
        this.pathStack[this.pointer] = name;
        HashMap<String, Integer> indexMap = this.indexMapStack[this.pointer];
        if (indexMap == null) {
            this.indexMapStack[this.pointer] = indexMap = new HashMap<String, Integer>();
        }
        if (indexMap.containsKey(name)) {
            indexMap.put(name, new Integer((Integer)indexMap.get(name) + 1));
        } else {
            indexMap.put(name, new Integer(1));
        }
        ++this.pointer;
        this.currentPath = null;
    }

    public void popElement() {
        this.indexMapStack[this.pointer] = null;
        this.currentPath = null;
        --this.pointer;
    }

    public String getCurrentPath() {
        return this.getPath().toString();
    }

    private void resizeStacks(int newCapacity) {
        String[] newPathStack = new String[newCapacity];
        Map[] newIndexMapStack = new Map[newCapacity];
        int min = Math.min(this.capacity, newCapacity);
        System.arraycopy(this.pathStack, 0, newPathStack, 0, min);
        System.arraycopy(this.indexMapStack, 0, newIndexMapStack, 0, min);
        this.pathStack = newPathStack;
        this.indexMapStack = newIndexMapStack;
        this.capacity = newCapacity;
    }

    public Path getPath() {
        if (this.currentPath == null) {
            String[] chunks = new String[this.pointer + 1];
            chunks[0] = "";
            for (int i = 0; i < this.pointer; ++i) {
                Integer integer = (Integer)this.indexMapStack[i].get(this.pathStack[i]);
                int index = integer;
                if (index > 1) {
                    StringBuffer chunk = new StringBuffer(this.pathStack[i].length() + 6);
                    chunk.append(this.pathStack[i]).append('[').append(index).append(']');
                    chunks[i + 1] = chunk.toString();
                    continue;
                }
                chunks[i + 1] = this.pathStack[i];
            }
            this.currentPath = new Path(chunks);
        }
        return this.currentPath;
    }
}

