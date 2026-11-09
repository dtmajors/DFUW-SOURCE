/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.AbstractListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kzn
extends JFrame {
    private JButton qol;
    private JList qom;
    private JLabel I;
    private JScrollPane ah;
    List<Map<String, Node>> qon = new ArrayList<Map<String, Node>>();
    List<Document> qoo = new ArrayList<Document>();
    Vector<String> qop = new Vector();
    String[] qoq = new String[]{"paperdollitems_human male.xml", "paperdollitems_alfar male.xml", "paperdollitems_mirdain male.xml", "paperdollitems_mahirim male.xml", "paperdollitems_dwarf male.xml", "paperdollitems_ork male.xml", "paperdollitems_human female.xml", "paperdollitems_alfar female.xml", "paperdollitems_mirdain female.xml", "paperdollitems_mahirim female.xml", "paperdollitems_dwarf female.xml", "paperdollitems_ork female.xml"};
    String[] qor = new String[]{"hum_m", "alfar_m", "mirdain_m", "mahirim_m", "dwarf_m", "ork_m", "hum_f", "alfar_f", "mirdain_f", "mahirim_f", "dwarf_f", "ork_f"};

    public kzn() {
        this.b();
        this.c();
    }

    private void b() {
        this.ah = new JScrollPane();
        this.qom = new JList();
        this.qol = new JButton();
        this.I = new JLabel();
        this.setDefaultCloseOperation(3);
        this.setTitle("PaperdollCloner");
        this.qom.setModel(new AbstractListModel(this){
            String[] qos;
            final /* synthetic */ kzn qot;
            {
                this.qot = kzn2;
                this.qos = new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
            }

            public int getSize() {
                return this.qos.length;
            }

            public Object getElementAt(int n) {
                return this.qos[n];
            }
        });
        this.ah.setViewportView(this.qom);
        this.qol.setText("Clone Selected Items");
        this.I.setText("Contents of human paperdoll");
        GroupLayout groupLayout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ah, -1, 323, Short.MAX_VALUE).addComponent(this.I, -2, 170, -2).addComponent(this.qol, -2, 162, -2)).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(12, 12, 12).addComponent(this.I).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ah, -1, 281, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.qol).addContainerGap()));
        this.pack();
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new kzn().setVisible(true);
            }
        });
    }

    private void c() {
        this.ekg();
        this.qom.setListData(this.qop);
        this.qol.addActionListener(new ActionListener(this){
            final /* synthetic */ kzn qot;
            {
                this.qot = kzn2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                kzn.a(this.qot);
            }
        });
    }

    private void ekg() {
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = jtf.dSE();
        }
        catch (ParserConfigurationException parserConfigurationException) {
            parserConfigurationException.printStackTrace();
        }
        TreeSet<String> treeSet = new TreeSet<String>();
        for (int i2 = 0; i2 < this.qoq.length; ++i2) {
            Document object = jsy.tK("xml-files/common/paperdoll/" + this.qoq[i2]);
            this.qon.add(new HashMap());
            this.qoo.add(object);
            Node node = object.getFirstChild();
            NodeList nodeList = node.getChildNodes();
            for (int i3 = 0; i3 < nodeList.getLength(); ++i3) {
                Node node2 = nodeList.item(i3);
                if (!node2.getNodeName().equals("SFPaperdollItem")) continue;
                String string = node2.getAttributes().getNamedItem("ResourceName").getNodeValue().toLowerCase();
                this.qon.get(i2).put(string, node2);
                if (i2 != 0) continue;
                treeSet.add(string);
            }
        }
        for (String string : treeSet) {
            this.qop.add(string);
        }
    }

    private void ekh() {
        int n;
        int[] nArray = this.qom.getSelectedIndices();
        for (n = 0; n < nArray.length; ++n) {
            String string = this.qop.get(nArray[n]);
            for (int i2 = 0; i2 < 2; ++i2) {
                for (int i3 = 1; i3 < 6; ++i3) {
                    int n2 = i2 * 6 + i3;
                    int n3 = i2 * 6;
                    Node node = this.qon.get(n2).get(string);
                    if (node != null) {
                        node.getParentNode().removeChild(node);
                        this.qon.get(n2).remove(string);
                    }
                    Node node2 = this.qon.get(n3).get(string).cloneNode(true);
                    this.qoo.get(n2).adoptNode(node2);
                    this.qoo.get(n2).getFirstChild().appendChild(node2);
                    this.qon.get(n2).put(string, node2);
                }
            }
        }
        for (n = 0; n < 12; ++n) {
            if (n == 0 || n == 6) continue;
            jsz.b(this.qoo.get(n), lcw.qLb + "xml-files/common/paperdoll/" + this.qoq[n]);
        }
    }

    static /* synthetic */ void a(kzn kzn2) {
        kzn2.ekh();
    }
}

