/*
 * Decompiled with CFR.
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.dnd.DropTarget;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;

public class mkg
extends JPanel
implements mxy {
    private mkf DFm = null;
    private int DFn = 25;
    private List DFo;
    private String Title;
    private boolean DFp;
    private JLabel DFq;
    private boolean DFr = false;
    private boolean DFs;

    public mkg(Object[] objectArray, String string) {
        this.DFm = new mkf(objectArray);
        this.Title = string;
        this.DFr = true;
        this.eDo();
    }

    public mkg(Object[] objectArray, String string, boolean bl) {
        this.DFm = new mkf(objectArray);
        this.Title = string;
        this.DFp = bl;
        this.DFr = true;
        this.eDo();
    }

    public mkg(List list, String string, boolean bl) {
        this.DFp = bl;
        this.DFm = new mkf();
        this.DFm.setModel(new DefaultListModel());
        for (int i = 0; i < list.size(); ++i) {
            ((DefaultListModel)this.DFm.getModel()).addElement(list.get(i));
        }
        this.Title = string;
        this.DFo = list;
        this.eDo();
    }

    public mkg(Object[] objectArray) {
        this(objectArray, "List");
        this.DFr = true;
    }

    public void eDo() {
        JComponent jComponent;
        assert (this.DFm != null) : "Cannot initialize component if ObjectList is null!";
        this.DFm.a(this);
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createEtchedBorder());
        if (this.DFp) {
            jComponent = new JPanel(new FlowLayout());
            this.DFq = new JLabel(this.Title);
            jComponent.add(this.DFq);
            this.add((Component)jComponent, "North");
        }
        jComponent = new JScrollPane(this.DFm);
        this.DFm.setVisibleRowCount(this.DFn);
        this.add((Component)jComponent, "Center");
    }

    @Override
    public void setDropTarget(DropTarget dropTarget) {
        this.DFm.setDropTarget(dropTarget);
    }

    public void addListSelectionListener(ListSelectionListener listSelectionListener) {
        this.DFm.addListSelectionListener(listSelectionListener);
    }

    public void a(MouseListener mouseListener) {
        this.DFm.addMouseListener(mouseListener);
    }

    public int eDp() {
        return this.DFm.getSelectedIndex();
    }

    public Object eDq() {
        return this.DFm.getSelectedValue();
    }

    public JList getList() {
        return this.DFm;
    }

    public void setListData(Object[] objectArray) {
        this.DFm.setListData(objectArray);
    }

    public void setTitle(String string) {
        this.Title = string;
        this.DFq.setText(this.Title);
    }

    public void addItem(Object object) {
        if (!this.DFr) {
            ((DefaultListModel)this.DFm.getModel()).addElement(object);
            this.DFm.ensureIndexIsVisible(this.DFm.getModel().getSize() - 1);
        } else {
            lfn.b(5, "SFJListPanel", "addItem() : Cannot add item. Static Array is used!");
        }
    }

    public void removeItem(int n) {
        if (!this.DFr) {
            ((DefaultListModel)this.DFm.getModel()).removeElementAt(n);
        } else {
            lfn.b(5, "SFJListPanel", "removeItem() : Cannot remove item. Static Array is used!");
        }
    }

    public void clear() {
        if (!this.DFr) {
            ((DefaultListModel)this.DFm.getModel()).clear();
        }
    }

    @Override
    public void addMouseListener(MouseListener mouseListener) {
        this.DFm.addMouseListener(mouseListener);
    }

    public void setVisibleRowCount(int n) {
        this.DFn = n;
        if (this.DFm != null) {
            this.DFm.setVisibleRowCount(n);
        }
    }

    @Override
    public void a(String string, double d2, double d3) {
        lfn.b(0, this.getClass().getName(), "dropString called with String: " + string);
        jrw jrw2 = new jrw(string);
        if (this.DFs) {
            this.addItem(jrw2.getName());
        } else {
            lfn.b(4, this.getClass().getName(), "dropString() : Not Drop Enabled!");
        }
    }

    public final void setDropEnabled(boolean bl) {
        this.DFs = bl;
    }

    public final String getTitle() {
        return this.Title;
    }

    public final void Cm(String string) {
        this.DFm.Cl(string);
    }

    public final void b(mjx mjx2) {
        this.DFm.a(mjx2);
    }
}

