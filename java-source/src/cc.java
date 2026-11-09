/*
 * Decompiled with CFR.
 */
import javax.swing.tree.DefaultMutableTreeNode;

public class cc
extends DefaultMutableTreeNode {
    public static final int fO = 1;
    public static final int fP = 2;
    public static final int fQ = 3;
    public static final int fR = 4;
    public static final int fS = 5;
    public static final int fT = 6;
    public static final int OTHER = 7;
    private String[] fU = new String[]{"", "Class", "Name", "Type", "", "", "", ""};
    private int fV = -1;
    private String eQ = null;
    private Object fW = null;
    private boolean fX = false;

    public cc(String string, int n) {
        this.eQ = string;
        this.fV = n;
    }

    public cc(String string, int n, Object object) {
        this.eQ = string;
        this.fV = n;
        this.fW = object;
    }

    public int getNodeType() {
        return this.fV;
    }

    public void k(int n) {
        this.fV = n;
    }

    public String getNodeName() {
        return this.eQ;
    }

    public void w(String string) {
        this.eQ = string;
    }

    public Object ao() {
        return this.fW;
    }

    public void b(Object object) {
        this.fW = object;
    }

    public boolean ap() {
        return this.fX;
    }

    public void j(boolean bl) {
        this.fX = bl;
    }

    public boolean isField() {
        return this.getParent() != null && ((cc)this.getParent()).getNodeName().equals("Field") && (this.fV == 1 || this.fV == 4);
    }

    public boolean aq() {
        return this.getParent() != null && ((cc)this.getParent()).getNodeName().equals("ListItem") && (this.fV == 1 || this.fV == 4);
    }

    public boolean ar() {
        cc cc2 = (cc)this.getParent();
        return cc2 != null && cc2.getNodeName().equals("Entry") && cc2.getFirstChild().equals(this) && (this.fV == 1 || this.fV == 4);
    }

    public boolean as() {
        cc cc2 = (cc)this.getParent();
        return cc2 != null && cc2.getNodeName().equals("Entry") && !cc2.getFirstChild().equals(this) && (this.fV == 1 || this.fV == 4);
    }

    public cc at() {
        if (this.fV == 1) {
            return this;
        }
        if (this.getParent() != null) {
            return ((cc)this.getParent()).at();
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.fU[this.fV].equals("")) {
            stringBuilder.append(this.fU[this.fV]);
            stringBuilder.append(": ");
        }
        if (this.fX) {
            stringBuilder.append(this.eQ);
        } else {
            stringBuilder.append(this.getClassName());
        }
        return stringBuilder.toString();
    }

    public String getClassName() {
        int n = this.eQ.lastIndexOf(".");
        if (n > 0) {
            return this.eQ.substring(n + 1);
        }
        return this.eQ;
    }
}

