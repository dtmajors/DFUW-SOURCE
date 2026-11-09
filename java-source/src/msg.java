/*
 * Decompiled with CFR.
 */
import javax.swing.tree.DefaultMutableTreeNode;

public class msg
extends DefaultMutableTreeNode {
    public msg() {
    }

    public msg(Object object) {
        super(object);
    }

    @Override
    public String toString() {
        if (this.userObject == null) {
            return null;
        }
        if (this.userObject.getClass().getName().endsWith("SFFeatInfoXML")) {
            return ((cgr)this.userObject).Name;
        }
        if (this.userObject.getClass().getName().endsWith("SFFeatGroupInfoXML")) {
            return ((cgq)this.userObject).Name;
        }
        if (this.userObject.getClass().getName().endsWith("SFFeatSubGroupInfoXML")) {
            return ((cgu)this.userObject).Name;
        }
        return this.userObject.toString();
    }

    public String getType() {
        if (this.userObject == null) {
            return null;
        }
        if (this.userObject.getClass().getName().endsWith("SFFeatInfoXML")) {
            return "Feat";
        }
        if (this.userObject.getClass().getName().endsWith("SFFeatGroupInfoXML")) {
            return "Group";
        }
        if (this.userObject.getClass().getName().endsWith("SFFeatSubGroupInfoXML")) {
            return "SubGroup";
        }
        return this.userObject.toString();
    }

    public int getIndex() {
        if (this.userObject == null) {
            return -1;
        }
        if (this.userObject.getClass().getName().endsWith("SFFeatInfoXML")) {
            return ((cgr)this.userObject).adk;
        }
        if (this.userObject.getClass().getName().endsWith("SFFeatGroupInfoXML")) {
            return ((cgq)this.userObject).adk;
        }
        if (this.userObject.getClass().getName().endsWith("SFFeatSubGroupInfoXML")) {
            return ((cgu)this.userObject).adk;
        }
        return -1;
    }

    public Object eNr() {
        return this.userObject;
    }
}

