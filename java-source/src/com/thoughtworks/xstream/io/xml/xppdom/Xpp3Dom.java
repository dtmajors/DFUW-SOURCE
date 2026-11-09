/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io.xml.xppdom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Xpp3Dom {
    protected String name;
    protected String value;
    protected Map attributes;
    protected List childList;
    protected Map childMap;
    protected Xpp3Dom parent;

    public Xpp3Dom(String name) {
        this.name = name;
        this.childList = new ArrayList();
        this.childMap = new HashMap();
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String[] getAttributeNames() {
        if (null == this.attributes) {
            return new String[0];
        }
        return this.attributes.keySet().toArray(new String[0]);
    }

    public String getAttribute(String name) {
        return null != this.attributes ? (String)this.attributes.get(name) : null;
    }

    public void setAttribute(String name, String value) {
        if (null == this.attributes) {
            this.attributes = new HashMap();
        }
        this.attributes.put(name, value);
    }

    public Xpp3Dom getChild(int i) {
        return (Xpp3Dom)this.childList.get(i);
    }

    public Xpp3Dom getChild(String name) {
        return (Xpp3Dom)this.childMap.get(name);
    }

    public void addChild(Xpp3Dom xpp3Dom) {
        xpp3Dom.setParent(this);
        this.childList.add(xpp3Dom);
        this.childMap.put(xpp3Dom.getName(), xpp3Dom);
    }

    public Xpp3Dom[] getChildren() {
        if (null == this.childList) {
            return new Xpp3Dom[0];
        }
        return this.childList.toArray(new Xpp3Dom[0]);
    }

    public Xpp3Dom[] getChildren(String name) {
        if (null == this.childList) {
            return new Xpp3Dom[0];
        }
        ArrayList<Xpp3Dom> children = new ArrayList<Xpp3Dom>();
        int size = this.childList.size();
        for (int i = 0; i < size; ++i) {
            Xpp3Dom configuration = (Xpp3Dom)this.childList.get(i);
            if (!name.equals(configuration.getName())) continue;
            children.add(configuration);
        }
        return children.toArray(new Xpp3Dom[0]);
    }

    public int getChildCount() {
        if (null == this.childList) {
            return 0;
        }
        return this.childList.size();
    }

    public Xpp3Dom getParent() {
        return this.parent;
    }

    public void setParent(Xpp3Dom parent) {
        this.parent = parent;
    }
}

