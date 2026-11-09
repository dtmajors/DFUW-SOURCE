/*
 * Decompiled with CFR.
 */
import java.util.Enumeration;
import javax.swing.tree.DefaultMutableTreeNode;

public class moo
extends DefaultMutableTreeNode {
    public static final int SINGLE_SELECTION = 0;
    public static final int DSQ = 4;
    protected int selectionMode;
    protected boolean isSelected;
    protected int DSR = 0;

    public moo() {
        this(null);
    }

    public moo(Object object) {
        this(object, true, false);
    }

    public moo(Object object, boolean bl, boolean bl2) {
        super(object, bl);
        this.isSelected = bl2;
        this.setSelectionMode(4);
    }

    public void setSelectionMode(int n) {
        this.selectionMode = n;
    }

    public int getSelectionMode() {
        return this.selectionMode;
    }

    public void setSelected(boolean bl) {
        this.isSelected = bl;
        if (this.selectionMode == 4 && this.children != null) {
            Enumeration enumeration = this.children.elements();
            while (enumeration.hasMoreElements()) {
                moo moo2 = (moo)enumeration.nextElement();
                moo2.setSelected(bl);
            }
        }
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    @Override
    public void setUserObject(Object object) {
        if (object instanceof Boolean) {
            this.setSelected((Boolean)object);
        } else {
            super.setUserObject(object);
        }
    }

    public int eHG() {
        return this.DSR;
    }

    public void afd(int n) {
        this.DSR = n;
    }
}

