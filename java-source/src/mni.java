/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  com.jgraph.graph.DefaultGraphCell$ValueChangeHandler
 */
import com.jgraph.graph.DefaultGraphCell;
import java.io.Serializable;

public class mni
implements DefaultGraphCell.ValueChangeHandler,
Serializable {
    protected Object userObject;

    public mni() {
    }

    public mni(Object object) {
        this.userObject = object;
    }

    public Object getUserObject() {
        return this.userObject;
    }

    public void setUserObject(Object object) {
        this.userObject = object;
    }

    public Object valueChanged(Object object) {
        Object object2 = this.getUserObject();
        this.setUserObject(object);
        return object2;
    }

    public Object clone() {
        return new mni(this.userObject);
    }

    public String toString() {
        return "SFCustomUserObject: Baseclass ";
    }
}

