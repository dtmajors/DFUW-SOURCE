/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 */
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class mxm
extends mkx
implements ActionListener {
    lfn ga = lfn.eqw();
    private aux DEC = null;
    private mxn ETO = null;
    private mxo ETP = null;
    private mjn ETQ = null;
    private Document cn = null;
    private DefaultMutableTreeNode ETR = null;
    private TreePath ETS = null;
    private jrw ETT = null;
    private jta oQa = new jta();
    private boolean ETU = false;

    public mxm(jrw jrw2) {
        this.ETT = jrw2;
        lfn.b(2, this.getClass().getName(), "Absolute path SFFile: " + jrw2.getAbsolutePath());
        this.setTitle("Edit XML SFFile");
        this.setSize(400, 300);
        this.ETO = new mxn(this);
        try {
            this.cn = jsy.n(jrw2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
        }
        this.ETQ = new mjn(this.cn);
        this.ETQ.addMouseListener(new a(this));
        JScrollPane jScrollPane = new JScrollPane(this.ETQ);
        this.DGa.add((Component)jScrollPane, "Center");
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    protected void eSV() {
        this.ETQ.revalidate();
    }

    @Override
    protected void z(ActionEvent actionEvent) {
        if (this.ETU) {
            boolean bl = this.eSX();
            if (bl) {
                this.dispose();
            }
        } else {
            this.dispose();
        }
    }

    @Override
    protected void E(ActionEvent actionEvent) {
        if (this.ETU) {
            this.eSX();
        }
    }

    @Override
    protected void A(ActionEvent actionEvent) {
        if (this.ETU) {
            int n2 = JOptionPane.showInternalConfirmDialog(this, "Close window and lose all changes?", "Close XML Editor Dialog", 0);
            if (n2 == 0) {
                this.dispose();
            }
        } else {
            this.dispose();
        }
    }

    public void eSW() {
        this.ETP = null;
        this.ETQ.a(this.ETQ.getNode(this.ETR), (DefaultMutableTreeNode)this.ETS.getLastPathComponent());
    }

    private boolean eSX() {
        Object object;
        mkb mkb2 = null;
        int n2 = 0;
        try {
            mkb2 = new mkb(this.ETT.getAbsolutePath());
            object = new myr("xml", "XML Files");
            mkb2.addChoosableFileFilter((FileFilter)object);
            mkb2.Ci(".xml");
            mkb2.setSelectedFile(this.ETT);
            n2 = mkb2.showSaveDialog(this);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            return false;
        }
        if (n2 == 0) {
            object = mkb2.eDc();
            if (object == null) {
                return false;
            }
        } else {
            return false;
        }
        jsz.a(this.cn, (jrw)object);
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("Edit Node")) {
            this.eSZ();
        } else if (actionEvent.getActionCommand().equals("Add Node")) {
            this.elP();
        } else if (actionEvent.getActionCommand().equals("Add Attribute")) {
            this.eOL();
        } else if (actionEvent.getActionCommand().equals("Delete Node")) {
            this.eSY();
        } else if (actionEvent.getActionCommand().equals("Repaint Tree")) {
            lfn.b(0, this.getClass().getName(), "Repainting Tree!");
            this.ETQ.updateUI();
        }
    }

    private void eSY() {
        if (this.ETR != null) {
            lfn.b(0, this.getClass().getName(), "Deleting node!");
            this.ETR.removeFromParent();
            this.ETQ.treeDidChange();
            this.ETQ.updateUI();
        }
    }

    private void eSZ() {
        if (this.ETR != null) {
            if (this.ETP == null) {
                if (this.ETR != null) {
                    Node node = this.ETQ.getNode(this.ETR);
                    if (node != null) {
                        this.ETP = new mxo(this, node);
                        this.getDesktopPane().add(this.ETP);
                        this.ETP.setVisible(true);
                        this.ETU = true;
                    } else {
                        lfn.b(5, this.getClass().getName(), "DomTree.getNode(SelectedNode) == null. Cannot open EditNode window!");
                    }
                } else {
                    lfn.b(5, this.getClass().getName(), "SelectedNode == null. Cannot open EditNode window!");
                }
            } else {
                JOptionPane.showInternalMessageDialog(this, "Close other Node Dialog first!", "Error: Node Dialog already opened", 0);
                try {
                    this.ETP.setSelected(true);
                }
                catch (PropertyVetoException propertyVetoException) {
                    propertyVetoException.printStackTrace();
                }
                this.ETP.requestFocus();
            }
        }
    }

    private void eOL() {
        String string;
        String string2;
        Element element;
        if (this.ETR != null && (element = (Element)this.ETQ.getNode(this.ETR)) != null && (string2 = JOptionPane.showInternalInputDialog(this, "Enter name of new Attribute:", "Enter Attribute name", 3)) != null && (string = JOptionPane.showInternalInputDialog(this, "Enter value of new Attribute:", "Enter Attribute value", 3)) != null) {
            element.setAttribute(string2, string);
            this.ETQ.a(element, this.ETR);
            lfn.b(0, this.getClass().getName(), "Adding attrib [" + string2 + "], value [" + string + "]");
        }
    }

    private void elP() {
        if (this.ETR != null) {
            Element element = null;
            String string = JOptionPane.showInternalInputDialog(this, "Enter name of new node:", "Enter node name", 3);
            if (string != null) {
                Element element2 = null;
                Object[] objectArray = new String[]{"EMTPY", "SFVector3", "SFColor", "SFString", "SFInteger", "SFLong", "SFFloat", "SFBool"};
                Object object = JOptionPane.showInputDialog(this, "Choose type of node:", "Choose node type", 3, null, objectArray, objectArray[0]);
                if (object != null) {
                    for (int i = 0; i < objectArray.length; ++i) {
                        if (object.equals("SFFloat")) {
                            element2 = this.oQa.a(this.cn, 0.0f);
                            continue;
                        }
                        if (object.equals("SFVector3")) {
                            element2 = this.oQa.a(this.cn, new ljq(0.0f, 0.0f, 0.0f));
                            continue;
                        }
                        if (object.equals("SFString")) {
                            element2 = this.oQa.c(this.cn, "enter text");
                            continue;
                        }
                        if (object.equals("SFInteger")) {
                            element2 = this.oQa.a(this.cn, 0);
                            continue;
                        }
                        if (object.equals("SFLong")) {
                            element2 = this.oQa.a(this.cn, 0L);
                            continue;
                        }
                        if (object.equals("SFColor")) {
                            element2 = this.oQa.a(this.cn, new lcq(0.0f, 0.0f, 0.0f, 0.0f));
                            continue;
                        }
                        if (!object.equals("SFBool")) continue;
                        element2 = this.oQa.a(this.cn, false);
                    }
                    if (element2 != null) {
                        element = this.cn.createElement(string);
                        element.appendChild(element2);
                        Node node = this.ETQ.getNode(this.ETR);
                        Node node2 = node.appendChild(element);
                        DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode();
                        DefaultMutableTreeNode defaultMutableTreeNode2 = new DefaultMutableTreeNode();
                        this.ETR.add(defaultMutableTreeNode);
                        this.ETQ.a(element, defaultMutableTreeNode);
                        defaultMutableTreeNode.add(defaultMutableTreeNode2);
                        this.ETQ.a(element2, defaultMutableTreeNode2);
                        this.ETQ.updateUI();
                        lfn.b(0, this.getClass().getName(), "Adding node [" + element.getClass().getName() + "], type[" + element.getNodeType() + " to:" + this.ETQ.getNode(this.ETR).getClass().getName() + ", type[" + node.getNodeType() + "]");
                        this.ETU = true;
                    } else {
                        element = this.cn.createElement(string);
                        Node node = this.ETQ.getNode(this.ETR);
                        Node node3 = node.appendChild(element);
                        DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode();
                        this.ETR.add(defaultMutableTreeNode);
                        this.ETQ.a(element, defaultMutableTreeNode);
                        this.ETQ.updateUI();
                        lfn.b(0, this.getClass().getName(), "Adding node [" + string + "]");
                        this.ETU = true;
                    }
                }
            }
        }
    }

    static /* synthetic */ mxo a(mxm mxm2) {
        return mxm2.ETP;
    }

    static /* synthetic */ mxn b(mxm mxm2) {
        return mxm2.ETO;
    }

    static /* synthetic */ mjn c(mxm mxm2) {
        return mxm2.ETQ;
    }

    static /* synthetic */ TreePath a(mxm mxm2, TreePath treePath) {
        mxm2.ETS = treePath;
        return mxm2.ETS;
    }

    static /* synthetic */ TreePath d(mxm mxm2) {
        return mxm2.ETS;
    }

    static /* synthetic */ DefaultMutableTreeNode a(mxm mxm2, DefaultMutableTreeNode defaultMutableTreeNode) {
        mxm2.ETR = defaultMutableTreeNode;
        return mxm2.ETR;
    }
}

