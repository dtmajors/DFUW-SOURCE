/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.path;

import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.WriterWrapper;
import com.thoughtworks.xstream.io.path.PathTracker;

public class PathTrackingWriter
extends WriterWrapper {
    private final PathTracker pathTracker;

    public PathTrackingWriter(HierarchicalStreamWriter writer, PathTracker pathTracker) {
        super(writer);
        this.pathTracker = pathTracker;
    }

    public void startNode(String name) {
        this.pathTracker.pushElement(name);
        super.startNode(name);
    }

    public void startNode(String name, Class clazz) {
        this.pathTracker.pushElement(name);
        super.startNode(name, clazz);
    }

    public void endNode() {
        super.endNode();
        this.pathTracker.popElement();
    }
}

