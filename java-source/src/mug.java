/*
 * Decompiled with CFR.
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.tree.TreePath;

public class mug
extends JPanel {
    private JTree EGi;
    ChangeListener EGj;
    private JButton EGk;

    public mug() {
        this.setLayout(new BorderLayout(0, 0));
        JPanel jPanel = new JPanel();
        FlowLayout flowLayout = (FlowLayout)jPanel.getLayout();
        flowLayout.setAlignment(0);
        this.add((Component)jPanel, "South");
        JButton jButton = new JButton("+");
        jButton.addActionListener(new ActionListener(this){
            final /* synthetic */ mug EGl;
            {
                this.EGl = mug2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EGl.cr(actionEvent);
            }
        });
        jPanel.add(jButton);
        JButton jButton2 = new JButton("-");
        jButton2.addActionListener(new ActionListener(this){
            final /* synthetic */ mug EGl;
            {
                this.EGl = mug2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EGl.cq(actionEvent);
            }
        });
        jPanel.add(jButton2);
        JButton jButton3 = new JButton("Modify");
        jButton3.addActionListener(new ActionListener(this){
            final /* synthetic */ mug EGl;
            {
                this.EGl = mug2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EGl.cp(actionEvent);
            }
        });
        jPanel.add(jButton3);
        this.EGk = new JButton("Reload");
        this.EGk.setEnabled(false);
        jPanel.add(this.EGk);
        JScrollPane jScrollPane = new JScrollPane();
        this.add((Component)jScrollPane, "Center");
        this.EGi = new JTree();
        this.EGi.setShowsRootHandles(true);
        jScrollPane.setViewportView(this.EGi);
        this.EGi.setModel(new mue(lcn.emv(), null));
        this.EGi.setCellRenderer(new mud());
        this.EGi.getSelectionModel().setSelectionMode(1);
        this.EGi.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mug EGl;
            {
                this.EGl = mug2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                if (mouseEvent.getClickCount() == 2) {
                    this.EGl.y(mouseEvent);
                } else {
                    super.mouseClicked(mouseEvent);
                }
            }
        });
    }

    protected void y(MouseEvent mouseEvent) {
        Object object = this.EGi.getLastSelectedPathComponent();
        if (object != null) {
            this.aP(object);
        }
    }

    protected void cp(ActionEvent actionEvent) {
        Object object = this.EGi.getLastSelectedPathComponent();
        if (object != null) {
            this.aP(object);
        }
    }

    private void aP(Object object) {
        Object object2;
        muc muc2 = new muc((Frame)SwingUtilities.getWindowAncestor(this), object);
        muc2.setModal(true);
        muc2.setVisible(true);
        Object object3 = muc2.getItem();
        if (object3 == null) {
            return;
        }
        TreePath treePath = this.EGi.getSelectionPath();
        if (treePath == null) {
            return;
        }
        Object[] objectArray = treePath.getPath();
        if (objectArray == null) {
            return;
        }
        if (objectArray.length < 2) {
            return;
        }
        Object object4 = objectArray[objectArray.length - 1];
        Object object5 = objectArray[objectArray.length - 2];
        if (object5 instanceof ArrayList) {
            ((ArrayList)object5).remove(object4);
            ((ArrayList)object5).add(object3);
        } else if (object5 instanceof cto) {
            object2 = (cto)object5;
            assert (((cto)object2).fgf != null);
            List<cto> list = Arrays.asList(((cto)object2).fgf);
            list.remove(object4);
            list.add((cto)object3);
            ((cto)object2).fgf = (cto[])list.toArray();
        }
        if (this.EGj != null) {
            object2 = new ChangeEvent(this.EGi.getModel().getRoot());
            this.EGj.stateChanged((ChangeEvent)object2);
        }
        this.EGi.updateUI();
        this.ePF();
    }

    protected void cq(ActionEvent actionEvent) {
        Object object;
        TreePath treePath = this.EGi.getSelectionPath();
        if (treePath == null) {
            return;
        }
        Object[] objectArray = treePath.getPath();
        if (objectArray == null) {
            return;
        }
        if (objectArray.length < 2) {
            return;
        }
        Object object2 = objectArray[objectArray.length - 1];
        Object object3 = objectArray[objectArray.length - 2];
        if (object3 instanceof ArrayList) {
            ((ArrayList)object3).remove(object2);
        } else if (object3 instanceof cto) {
            object = (cto)object3;
            assert (((cto)object).fgf != null);
            List<cto> list = Arrays.asList(((cto)object).fgf);
            list.remove(object2);
            ((cto)object).fgf = (cto[])list.toArray();
        }
        if (this.EGj != null) {
            object = new ChangeEvent(this.EGi.getModel().getRoot());
            this.EGj.stateChanged((ChangeEvent)object);
        }
        this.EGi.updateUI();
    }

    public void h(ActionListener actionListener) {
        this.EGk.addActionListener(actionListener);
        this.EGk.setEnabled(true);
    }

    public void addChangeListener(ChangeListener changeListener) {
        this.EGj = changeListener;
    }

    protected void cr(ActionEvent actionEvent) {
        muc muc2 = new muc((Frame)SwingUtilities.getWindowAncestor(this), (Object)null);
        muc2.setModal(true);
        muc2.setVisible(true);
        Object object = muc2.getItem();
        if (object == null) {
            return;
        }
        if (object instanceof cto) {
            Object object2;
            Object object3 = this.EGi.getLastSelectedPathComponent();
            if (object3 == null) {
                object2 = this.EGi.getModel().getRoot();
                assert (object2 instanceof List) : "root node is not a List!";
                object3 = object2;
            }
            if (object3 instanceof ArrayList) {
                ((ArrayList)object3).add(object);
            } else if (object3 instanceof cto) {
                object2 = (cto)object3;
                if (((cto)object2).fgf == null) {
                    ((cto)object2).fgf = new cto[1];
                    ((cto)object2).fgf[0] = (cto)object;
                } else {
                    ArrayList<cto> arrayList = new ArrayList<cto>(Arrays.asList(((cto)object2).fgf));
                    arrayList.add((cto)object);
                    cto[] ctoArray = (cto[])arrayList.toArray();
                    ((cto)object2).fgf = ctoArray;
                }
            }
            if (this.EGj != null) {
                object2 = new ChangeEvent(this.EGi.getModel().getRoot());
                this.EGj.stateChanged((ChangeEvent)object2);
            }
            this.EGi.updateUI();
        } else if (object instanceof ArrayList) {
            TreePath treePath = this.EGi.getSelectionPath();
            assert (treePath.getPathComponent(0) instanceof List) : "root node is not a List!";
            List list = (List)treePath.getPathComponent(0);
            list.add(object);
            if (this.EGj != null) {
                ChangeEvent changeEvent = new ChangeEvent(this.EGi.getModel().getRoot());
                this.EGj.stateChanged(changeEvent);
            }
            this.EGi.updateUI();
        } else {
            lfn.b(5, this.getClass().getSimpleName(), "handleAddButtonClicked: invalid class type of returned value of SFLootableItemEditDialog");
        }
    }

    public void a(List list, List list2, String string) {
        assert (list != null) : "LootableItemSet is null!!!";
        if (list == null) {
            return;
        }
        this.EGi.setModel(new mue(list, list2, string));
        this.ePF();
    }

    private void ePF() {
        for (int i = 0; i < this.EGi.getRowCount(); ++i) {
            this.EGi.expandRow(i);
        }
    }

    public Object getSelectedItem() {
        return this.EGi.getLastSelectedPathComponent();
    }
}

