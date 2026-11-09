/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

class mue
implements TreeModel {
    Object EGe;
    String EGf;

    public mue(List list, String string) {
        this.EGe = list;
        this.EGf = string;
    }

    public mue(List list, List list2, String string) {
        this.EGe = new muf();
        ((muf)this.EGe).EGg = list;
        ((muf)this.EGe).EGh = list2;
        this.EGf = string;
    }

    public String ePE() {
        return this.EGf;
    }

    @Override
    public Object getChild(Object object, int n) {
        cto[] ctoArray;
        if (object instanceof muf) {
            return n == 0 ? ((muf)object).EGg : ((muf)object).EGh;
        }
        if (object instanceof ArrayList) {
            return ((ArrayList)object).get(n);
        }
        if (object instanceof cto && (ctoArray = ((cto)object).fgf) != null) {
            return ctoArray[n];
        }
        return null;
    }

    @Override
    public void addTreeModelListener(TreeModelListener treeModelListener) {
    }

    @Override
    public int getChildCount(Object object) {
        if (object instanceof muf) {
            return 2;
        }
        if (object instanceof ArrayList) {
            return ((ArrayList)object).size();
        }
        if (object instanceof cto && ((cto)object).fgf != null) {
            return ((cto)object).fgf.length;
        }
        return 0;
    }

    @Override
    public int getIndexOfChild(Object object, Object object2) {
        cto[] ctoArray;
        if (object instanceof muf) {
            muf muf2 = (muf)object;
            if (object2 == muf2.EGg) {
                return 0;
            }
            if (object2 == muf2.EGh) {
                return 1;
            }
            return -1;
        }
        if (object instanceof ArrayList) {
            ArrayList arrayList = (ArrayList)object;
            for (int i = 0; i < arrayList.size(); ++i) {
                if (arrayList.get(i) != object2) continue;
                return i;
            }
            return -1;
        }
        if (object instanceof cto && (ctoArray = ((cto)object).fgf) != null) {
            int n = 0;
            if (n < ctoArray.length) {
                if (ctoArray[n] == object2) {
                    // empty if block
                }
                return n;
            }
            return -1;
        }
        return -1;
    }

    @Override
    public Object getRoot() {
        return this.EGe;
    }

    @Override
    public boolean isLeaf(Object object) {
        if (object instanceof muf) {
            return false;
        }
        if (object instanceof cto && ((cto)object).fgf != null && ((cto)object).fgf.length > 0) {
            return false;
        }
        return !(object instanceof ArrayList) || ((ArrayList)object).size() <= 0;
    }

    @Override
    public void removeTreeModelListener(TreeModelListener treeModelListener) {
    }

    @Override
    public void valueForPathChanged(TreePath treePath, Object object) {
    }
}

