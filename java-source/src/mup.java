/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcw
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.jdesktop.layout.GroupLayout;
import org.w3c.dom.Document;

public class mup
extends JDialog {
    private JButton DFU;
    private JButton DFV;
    private JButton DNZ;
    private JList DFW;
    private JPanel aa;
    private JScrollPane ah;
    private List<muu> aGu = lcn.emv();
    private String EHg = "";
    private muw.b EHn;
    private JScrollPane EGU = new JScrollPane();
    private JTree EGV;
    private DefaultTreeModel EGW;
    private DefaultMutableTreeNode EoC;
    private les aqN = lea.enZ();
    private ler qro = this.aqN.eqq();
    private aux DEC;

    public mup(Frame frame, boolean bl, muw.b b2) {
        this(frame, bl);
        this.EHn = b2;
    }

    public mup(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.ah = new JScrollPane();
        this.DFW = new JList();
        this.DNZ = new JButton();
        this.DFU = new JButton();
        this.DFV = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Edit Template");
        this.DFW.setModel(new AbstractListModel(this){
            String[] qos;
            final /* synthetic */ mup EHo;
            {
                this.EHo = mup2;
                this.qos = new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
            }

            public int getSize() {
                return this.qos.length;
            }

            public Object getElementAt(int n) {
                return this.qos[n];
            }
        });
        this.ah.setViewportView(this.DFW);
        this.DNZ.setText("Save");
        this.DNZ.addActionListener(new ActionListener(this){
            final /* synthetic */ mup EHo;
            {
                this.EHo = mup2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mup.a(this.EHo, actionEvent);
            }
        });
        this.DFU.setText("Add");
        this.DFU.addActionListener(new ActionListener(this){
            final /* synthetic */ mup EHo;
            {
                this.EHo = mup2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mup.b(this.EHo, actionEvent);
            }
        });
        this.DFV.setText("Remove");
        this.DFV.addActionListener(new ActionListener(this){
            final /* synthetic */ mup EHo;
            {
                this.EHo = mup2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mup.c(this.EHo, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.ah, -1, 308, Short.MAX_VALUE).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.DFU).addPreferredGap(0).add((Component)this.DFV).addPreferredGap(0, 123, Short.MAX_VALUE).add((Component)this.DNZ))).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.ah, -1, 290, Short.MAX_VALUE).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.DNZ).add((Component)this.DFU).add((Component)this.DFV)).addContainerGap()));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        this.pack();
    }

    private void D(ActionEvent actionEvent) {
        this.bmr();
    }

    private void aB(ActionEvent actionEvent) {
        this.eJJ();
    }

    private void C(ActionEvent actionEvent) {
        this.ePM();
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new mup((Frame)new JFrame(), true).setVisible(true);
            }
        });
    }

    private void c() {
        this.ePS();
    }

    private void ePM() {
        mun mun2 = new mun((Frame)this.DEC, true);
        mun2.setLocationRelativeTo(this);
        mun2.setVisible(true);
        String[] stringArray = mun2.ePN();
        if (stringArray == null) {
            return;
        }
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            muu muu2 = new muu();
            muu2.SkillName = string;
            if (this.aGu.contains(muu2)) {
                lfn.b(4, this.getClass().getSimpleName(), "addSkills() : Skill [" + string + "] already in list!");
                continue;
            }
            this.aGu.add(muu2);
        }
        this.ePS();
    }

    private void bmr() {
        muu muu2 = (muu)this.DFW.getSelectedValue();
        if (muu2 == null) {
            return;
        }
        this.aGu.remove(muu2);
        this.ePS();
    }

    public void Q(jrw jrw2) {
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        Annotations.configureAliases(xStream, muu.class);
        String string = "";
        try {
            string = jry.tk(jrw2.getAbsolutePath());
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
        Object object = xStream.fromXML(string);
        assert (object instanceof muu[]);
        this.aGu = new ArrayList<muu>(Arrays.asList((muu[])object));
        this.EHg = jrw2.getName();
        this.ePS();
    }

    private void eJJ() {
        String string = JOptionPane.showInputDialog(this, "Template Name", this.EHg);
        if (string == null || string.equals("")) {
            return;
        }
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        Annotations.configureAliases(xStream, muu.class);
        muu[] muuArray = this.aGu.toArray(new muu[this.aGu.size()]);
        String string2 = lcw.qLb + "/" + "xml-files/server/vendor/";
        String string3 = xStream.toXML(muuArray);
        Document document = jsy.tL(string3);
        switch (this.EHn) {
            case EJd: {
                jsz.a(document, new jrw(string2 + "trainingtemplates/" + string));
            }
        }
    }

    private void ePS() {
        this.DFW.setListData(this.aGu.toArray());
    }

    private void ePQ() {
        JDialog jDialog = new JDialog();
        jDialog.setTitle("Choose Resource");
        JPanel jPanel = new JPanel(new BorderLayout());
        JPanel jPanel2 = new JPanel(new FlowLayout());
        JButton jButton = new JButton("Add Resource");
        JButton jButton2 = new JButton("Close");
        jButton2.addActionListener(new ActionListener(this, jDialog){
            final /* synthetic */ JDialog EtI;
            final /* synthetic */ mup EHo;
            {
                this.EHo = mup2;
                this.EtI = jDialog;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EtI.dispose();
            }
        });
        jPanel2.add(jButton);
        jPanel2.add(jButton2);
        JScrollPane jScrollPane = new JScrollPane();
        this.ePR();
        jScrollPane.getViewport().add(this.EGV);
        jButton.addActionListener(new ActionListener(this){
            final /* synthetic */ mup EHo;
            {
                this.EHo = mup2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                int[] nArray;
                if (!mup.a(this.EHo).isSelectionEmpty() && (nArray = mup.a(this.EHo).getSelectionRows()) != null) {
                    DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)mup.a(this.EHo).getLastSelectedPathComponent();
                    System.out.println("Selected Node :" + defaultMutableTreeNode.getUserObject());
                    muu muu2 = new muu();
                    muu2.SkillName = defaultMutableTreeNode.getUserObject().toString();
                    mup.b(this.EHo).add(muu2);
                    mup.c(this.EHo);
                }
            }
        });
        jPanel.add((Component)jScrollPane, "Center");
        jPanel.add((Component)jPanel2, "South");
        jDialog.add(jPanel);
        jDialog.setModal(true);
        jDialog.setSize(250, 500);
        jDialog.setLocationRelativeTo(this);
        jDialog.setVisible(true);
        this.EGV.revalidate();
    }

    private void ePR() {
        this.EoC = new DefaultMutableTreeNode(this.EHn.toString().toLowerCase());
        les les2 = lea.enW();
        ler ler2 = les2.eqq();
        switch (this.EHn) {
            case EJd: {
                this.a(this.EoC, this.qro, this.aqN);
            }
        }
    }

    private void a(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2, int n) {
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            boolean bl = les2.isDescendant(ler3.getType(), n);
            if (bl) {
                DefaultMutableTreeNode defaultMutableTreeNode2;
                if (les2.g(ler3) == null) {
                    defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                    defaultMutableTreeNode.add(defaultMutableTreeNode2);
                } else {
                    defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                    defaultMutableTreeNode.add(defaultMutableTreeNode2);
                    this.a(defaultMutableTreeNode2, les2, ler3, n);
                }
            }
            ler3 = les2.h(ler3);
        }
        this.EGV = new JTree(defaultMutableTreeNode);
        this.EGV.getSelectionModel().setSelectionMode(1);
    }

    private void a(DefaultMutableTreeNode defaultMutableTreeNode, ler ler2, les les2) {
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            DefaultMutableTreeNode defaultMutableTreeNode2;
            if (les2.g(ler3) == null) {
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
            } else {
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
                this.a(defaultMutableTreeNode2, ler3, les2);
            }
            ler3 = les2.h(ler3);
        }
        this.EGV = new JTree(defaultMutableTreeNode);
        this.EGV.getSelectionModel().setSelectionMode(1);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(mup mup2, ActionEvent actionEvent) {
        mup2.aB(actionEvent);
    }

    static /* synthetic */ void b(mup mup2, ActionEvent actionEvent) {
        mup2.C(actionEvent);
    }

    static /* synthetic */ void c(mup mup2, ActionEvent actionEvent) {
        mup2.D(actionEvent);
    }

    static /* synthetic */ JTree a(mup mup2) {
        return mup2.EGV;
    }

    static /* synthetic */ List b(mup mup2) {
        return mup2.aGu;
    }

    static /* synthetic */ void c(mup mup2) {
        mup2.ePS();
    }
}

