/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class mpj
extends JFileChooser
implements ActionListener {
    private final String DVl = lcw.qLb + "xml-files/server/";
    private mpd DVm = new mpd(this);
    private JList DVn;

    public mpj() {
        super.setUI(this.DVm);
        this.setFileSelectionMode(0);
        this.setCurrentDirectory(new jrw(this.DVl));
        this.DVm.eIk().addActionListener(this);
        this.DVm.eIl().addActionListener(this);
        this.DVm.eIj().addActionListener(this);
    }

    public void afg(int n) {
        new a(this, n).start();
    }

    public mpd eIu() {
        return this.DVm;
    }

    public jrw eDc() {
        File file = super.getSelectedFile();
        if (file == null) {
            return null;
        }
        return new jrw(file.getAbsolutePath());
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            String string = this.eDc().getAbsolutePath();
            String string2 = this.eDc().getName();
            if (actionEvent.getSource() == this.DVm.eIk()) {
                if (this.eDc().exists()) {
                    this.aK(string, JOptionPane.showInputDialog(this, (Object)("New name for :" + string2)));
                }
                return;
            }
            if (actionEvent.getSource() == this.DVm.eIl()) {
                if (this.eDc().exists()) {
                    this.aL(JOptionPane.showInputDialog(this, (Object)("Destination SFFile Name for :" + string2)), string);
                }
                return;
            }
            if (actionEvent.getSource() == this.DVm.eIj()) {
                if (this.eDc().exists()) {
                    this.CK(string);
                }
                return;
            }
        }
        catch (Exception exception) {
            lfn.b(0, this.getClass().getName(), "Can not alter directories");
        }
    }

    private void CK(String string) {
        jrw jrw2 = new jrw(string);
        if (jrw2.exists()) {
            if (jrw2.canWrite()) {
                if (jrw2.isDirectory()) {
                    JOptionPane.showMessageDialog(this, string + " is a directory");
                } else if (JOptionPane.showConfirmDialog(this, "Are you sure you want to delete " + jrw2.getAbsolutePath() + "?") == 0) {
                    if (jrw2.delete()) {
                        this.DVm.eIo().setText("");
                        this.rescanCurrentDirectory();
                    } else {
                        JOptionPane.showMessageDialog(this, "Something wrong.Couldn't delete the file :" + jrw2.getAbsolutePath());
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Write Protected :" + string);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No such file or directory :" + jrw2.getName());
        }
    }

    private void aK(String string, String string2) {
        if (string2 != null) {
            string2 = jry.tl(string2);
            jrw jrw2 = new jrw(string);
            jrw jrw3 = new jrw(this.getCurrentDirectory() + "/" + string2);
            if (jrw2.renameTo(jrw3)) {
                this.rescanCurrentDirectory();
                this.DVm.eIo().setText(jrw3.getName());
            } else {
                JOptionPane.showMessageDialog(this, "Something wrong.Couldn't rename the file");
            }
        }
    }

    private void aL(String string, String string2) {
        if (string != null && !string.equals("")) {
            string = jry.tl(string);
            jrw jrw2 = new jrw(string2);
            jrw jrw3 = new jrw(this.getCurrentDirectory() + "/" + string);
            this.b(jrw2, jrw3);
            this.rescanCurrentDirectory();
        }
    }

    private void b(jrw jrw2, jrw jrw3) {
        String string;
        int n;
        jry.a(jrw3, jrw2);
        if (jrw2 != null && jrw2.exists() && (n = (string = jrw2.getName()).lastIndexOf(".")) != -1) {
            string = string.substring(0, n);
            lfn.b(0, this.getClass().getName(), "itemCopyButtonPressed() : SourceNoExtension = " + string);
            String string2 = jrw3.getName();
            n = string2.lastIndexOf(".");
            if (n != -1) {
                string2 = string2.substring(0, n);
                lfn.b(0, this.getClass().getName(), "itemCopyButtonPressed() : TargetNoExtension = " + string2);
                int n2 = lea.enW().getType(string2);
                lfn.b(0, this.getClass().getName(), "itemCopyButtonPressed() : ResourceType returned =" + n2);
                if (n2 > 0) {
                    Object object;
                    Document document = null;
                    try {
                        document = jsy.n(jrw3);
                    }
                    catch (bo bo2) {
                        lfn.b(5, this.getClass().getName(), "itemCopyButtonPressed() : Could not Parse Document [" + jrw3 + "] Exception: " + bo2);
                    }
                    if (document != null) {
                        object = jsy.a("SFResourceName", document);
                        object = this.g((Node)object);
                        object.setNodeValue(string2);
                    }
                    jsz.a(document, jrw3);
                    object = (lgw)lea.enW().acv(n2);
                    if (object != null) {
                        ((lgw)object).ys(true);
                        jug jug2 = new jug();
                        jug2.e(lea.enW(), lcw.qLb + "xml-files/gamelogicinfo/" + "resourcetree.xml");
                    } else {
                        lfn.b(4, this.getClass().getName(), "itemCopyButtonPressed() : ResourceFile [" + jrw2 + "] was not found in the ResourceTree! Cannot not set HasResourceFile attribute to TRUE.");
                    }
                } else {
                    lfn.b(5, this.getClass().getName(), "loadResourceFile() : ResourceType returned was less than 0 !");
                }
            }
        }
    }

    private Node g(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            for (int i = 0; i < nodeList.getLength(); ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFString")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("Value");
                return node;
            }
            lfn.print("SFXMLFileParser: Did not find SFString Node for: " + node.getNodeName() + " !");
        }
        return null;
    }

    public void b(KeyListener keyListener) {
        this.a(this, keyListener);
    }

    protected void a(JFileChooser jFileChooser, KeyListener keyListener) {
        Vector<Component> vector = new Vector<Component>();
        Stack<Component> stack = new Stack<Component>();
        stack.push(jFileChooser);
        while (!stack.isEmpty()) {
            Component component = (Component)stack.pop();
            if (!(component instanceof Container)) continue;
            Container container = (Container)component;
            for (int i = 0; i < container.getComponentCount(); ++i) {
                if (container.getComponent(i) instanceof JList) {
                    vector.add(container.getComponent(i));
                    this.DVn = (JList)container.getComponent(i);
                    this.DVn.addKeyListener(keyListener);
                    return;
                }
                stack.push(container.getComponent(i));
            }
        }
    }

    public void b(MouseListener mouseListener) {
        if (this.DVn != null) {
            this.DVn.addMouseListener(mouseListener);
        } else {
            lfn.b(5, this.getClass().getName(), " dialogList Null [keyListener]");
        }
    }

    public JList eIv() {
        return this.DVn;
    }

    @Override
    public /* synthetic */ File getSelectedFile() {
        return this.eDc();
    }
}

