/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  dqk
 *  dta
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class mri
extends JInternalFrame {
    private static mri EiL = null;
    private ldv[] EiM = null;
    private aux DEC = null;
    private JSlider EiN = null;
    private JSlider EiO = null;
    private had EiP = new had();
    private Vector<JButton> EiQ = null;
    private int EiR = 0;
    private JTextField EiS = null;
    private JCheckBox EiT = null;
    private a EiU = null;
    private JCheckBox EiV = null;
    private JCheckBox EiW = null;
    private JCheckBox EiX = null;
    private JList EiY = null;
    private int[] pXF = null;
    private Map<Integer, mrk> EiZ = lcn.emw();
    private JCheckBox Eja = null;
    int Ejb = -1;

    public static mri eKu() {
        return EiL;
    }

    public mri(aux aux2) {
        this.DEC = aux2;
        mje.DAR = mje.a.DCt;
        this.eKw();
        this.eDJ();
        EiL = this;
    }

    public float getRadius() {
        return (float)this.EiN.getValue() / 100.0f;
    }

    public void setRadius(float f) {
        this.EiN.setValue((int)(f * 100.0f));
    }

    public float bnS() {
        return (float)this.EiO.getValue() / 100.0f;
    }

    public void gL(float f) {
        this.EiO.setValue((int)(f * 100.0f));
    }

    public void hq(float f) {
        this.EiS.setText(String.valueOf(f));
        this.eKA();
    }

    public void afk(int n) {
        if (n == -1) {
            return;
        }
        this.EiY.setSelectedIndex(n);
        this.eKA();
    }

    public void eKv() {
        this.EiX.setSelected(!this.EiX.isSelected());
        this.eKA();
    }

    public void afl(int n) {
        JButton jButton = this.EiQ.get(n);
        for (int i = 0; i < this.EiQ.size(); ++i) {
            JButton jButton2 = this.EiQ.get(i);
            jButton2.setSelected(false);
            if (jButton2 != jButton) continue;
            this.EiR = i;
        }
        jButton.setSelected(true);
        EiL.eKA();
    }

    private void eDJ() {
        this.setClosable(true);
        this.setSize(new Dimension(670, 500));
        JToolBar jToolBar = new JToolBar("Terrain Tools...");
        this.EiQ = new Vector();
        this.EiQ.add(new JButton("Add(A)"));
        this.EiQ.add(new JButton("Flatten(F)"));
        this.EiQ.add(new JButton("Smooth(S)"));
        this.EiQ.add(new JButton("Move(M)"));
        this.EiQ.add(new JButton("Set(D)"));
        this.EiQ.add(new JButton("Select(U)"));
        for (JButton jComponent2 : this.EiQ) {
            jComponent2.addActionListener(new ActionListener(this){
                final /* synthetic */ mri Ejc;
                {
                    this.Ejc = mri2;
                }

                public void actionPerformed(ActionEvent actionEvent) {
                    JButton jButton = (JButton)actionEvent.getSource();
                    for (int i = 0; i < mri.a(this.Ejc).size(); ++i) {
                        if (mri.a(this.Ejc).get(i) != jButton) continue;
                        this.Ejc.afl(i);
                        return;
                    }
                }
            });
            jToolBar.add(jComponent2);
        }
        this.EiQ.get(0).setSelected(true);
        this.EiR = 0;
        this.EiN = new JSlider();
        this.EiN.setMinimum(1);
        this.EiN.setMaximum(50000);
        this.EiN.setValue(5000);
        this.EiN.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                mri.b(this.Ejc);
            }
        });
        JPanel jPanel = new JPanel(new FlowLayout(0));
        jPanel.add(new JLabel("Brush Radius(R):"));
        jPanel.add(this.EiN);
        this.EiO = new JSlider();
        this.EiO.setMinimum(1);
        this.EiO.setMaximum(50);
        this.EiO.setValue(10);
        this.EiO.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                mri.b(this.Ejc);
            }
        });
        JPanel jPanel2 = new JPanel(new FlowLayout(0));
        jPanel2.add(new JLabel("Brush Strength(T):"));
        jPanel2.add(this.EiO);
        this.EiS = new JTextField("0");
        this.EiS.setPreferredSize(new Dimension(50, 18));
        JPanel jPanel3 = new JPanel(new FlowLayout(0));
        jPanel3.add(new JLabel("Height(ALT):"));
        jPanel3.add(this.EiS);
        this.EiS.addActionListener(new ActionListener(this){
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mri.b(mri.eKB());
            }
        });
        this.EiS.addFocusListener(new FocusListener(this){
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
            }

            public void focusGained(FocusEvent focusEvent) {
            }

            public void focusLost(FocusEvent focusEvent) {
                mri.b(mri.eKB());
            }
        });
        this.EiT = new JCheckBox("Absolute Height");
        this.EiT.addActionListener(new ActionListener(this){
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mri.b(mri.eKB());
            }
        });
        jPanel3.add(this.EiT);
        this.EiV = new JCheckBox("Use Surface Normal");
        this.EiV.addActionListener(new ActionListener(this){
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mri.b(mri.eKB());
            }
        });
        jPanel3.add(this.EiV);
        this.EiW = new JCheckBox("Show Light");
        this.EiW.setSelected(false);
        this.EiW.addActionListener(new ActionListener(this){
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mri.b(mri.eKB());
            }
        });
        jPanel3.add(this.EiW);
        this.EiX = new JCheckBox("Wireframe(W)");
        this.EiX.setSelected(false);
        this.EiX.addActionListener(new ActionListener(this){
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mri.b(mri.eKB());
            }
        });
        jPanel3.add(this.EiX);
        JButton jButton = new JButton("Save");
        jButton.addActionListener(new ActionListener(this){
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (JOptionPane.showConfirmDialog((Component)mri.c(this.Ejc), "Are you sure you want to save the terrain mesh? Original file can only be recovered from network.") == 0) {
                    kra kra2 = (kra)mri.c(this.Ejc).ii(4101);
                    mri.c(this.Ejc).a((khd)kra2, null, null);
                }
            }
        });
        jPanel3.add(jButton);
        Vector<String> vector = new Vector<String>();
        vector.add("Linear");
        vector.add("Squared");
        vector.add("InvSquared");
        vector.add("Constant");
        this.EiU = new a(this, null);
        this.EiU.setMaximumSize(new Dimension(100, 100));
        this.EiU.setPreferredSize(new Dimension(100, 100));
        this.EiU.setSize(new Dimension(100, 100));
        JComboBox jComboBox = new JComboBox(vector);
        jComboBox.setMaximumSize(new Dimension(100, 18));
        jComboBox.addActionListener(new ActionListener(this, jComboBox){
            final /* synthetic */ JComboBox Ejd;
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
                this.Ejd = jComboBox;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                JComboBox jComboBox = this.Ejd;
                int n = jComboBox.getSelectedIndex();
                mri.d(this.Ejc).afm(n);
                mri.b(this.Ejc);
            }
        });
        jComboBox.setSelectedIndex(2);
        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new BoxLayout(jPanel4, 3));
        this.add(jPanel4);
        jPanel4.add(jToolBar);
        jPanel4.add(jPanel3);
        jPanel4.add(jPanel);
        jPanel4.add(jPanel2);
        jPanel4.add(this.EiU);
        jPanel4.add(jComboBox);
        JButton jButton2 = new JButton("RecreatePhysics");
        jPanel4.add(jButton2);
        jButton2.addActionListener(new ActionListener(this){
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                kqx kqx2 = (kqx)mri.c(this.Ejc).ii(4100);
                mri.c(this.Ejc).a((khd)kqx2, null, null);
            }
        });
        JButton jButton3 = new JButton("Fit To Road");
        jPanel4.add(jButton3);
        jButton3.addActionListener(new ActionListener(this){
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (mqy.Ehm == null) {
                    return;
                }
                if (!mqy.Ehm.isVisible()) {
                    return;
                }
                dsj dsj2 = mqy.Ehm.eJW();
                kqr kqr2 = (kqr)mri.c(this.Ejc).ii(4105);
                kqr2.pWI = dsj2.bya();
                kqr2.pWJ = true;
                haa.a a2 = new haa.a(this){
                    final /* synthetic */ 5 Eje;
                    {
                        this.Eje = var1_1;
                    }

                    public void a(ktv ktv2, Object object) {
                        if (mqy.Ehm != null) {
                            dsj dsj2 = mqy.Ehm.eJW();
                            dsj2.ir(dsj2.bxS() + 50.0f);
                            dsj2.bxN();
                            kqr kqr2 = (kqr)mri.c(this.Eje.Ejc).ii(4105);
                            kqr2.pWI = dsj2.bya();
                            kqr2.pWJ = false;
                            mri.c(this.Eje.Ejc).a((khd)kqr2, new haa.a(this){
                                final /* synthetic */ 1 Ejf;
                                {
                                    this.Ejf = var1_1;
                                }

                                public void a(ktv ktv2, Object object) {
                                    dsj dsj2 = mqy.Ehm.eJW();
                                    dsj2.ir(dsj2.bxS() - 50.0f);
                                    dsj2.bxN();
                                }
                            }, null);
                        }
                    }
                };
                mri.c(this.Ejc).a((khd)kqr2, a2, null);
            }
        });
        jPanel4.add(this.eKx());
        this.addInternalFrameListener(new InternalFrameListener(this){
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
            }

            public void internalFrameActivated(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameClosed(InternalFrameEvent internalFrameEvent) {
                mri.e(null);
                mje.DAR = mje.a.DCn;
            }

            public void internalFrameClosing(InternalFrameEvent internalFrameEvent) {
                mri.f(this.Ejc).setValue(1);
                mri.b(this.Ejc);
            }

            public void internalFrameDeactivated(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameDeiconified(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameIconified(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameOpened(InternalFrameEvent internalFrameEvent) {
            }
        });
    }

    private void eKw() {
        String string = "xml/terrain/TerrainMaterials.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (Exception exception) {
            lfn.b(5, this.getClass().getName(), "parseGlobalMaterials() : error parsing global materials" + exception);
            return;
        }
        NodeList nodeList = document.getElementsByTagName("SFMaterial");
        if (nodeList.getLength() == 0) {
            lfn.b(5, this.getClass().getName(), "parseGlobalMaterials() : no SFMaterial node found ");
            return;
        }
        for (int i = 0; i < nodeList.getLength(); ++i) {
            Node node;
            Node node2 = nodeList.item(i);
            Node node3 = node2.getAttributes().getNamedItem("ID");
            Integer n = 0;
            if (node3 != null && node3.getNodeValue() != null) {
                n = Integer.valueOf(node3.getNodeValue());
            }
            if ((node = jsy.e("Far", node2)) == null) continue;
            Node node4 = node.getAttributes().getNamedItem("Texture");
            if (node4 == null) {
                return;
            }
            String string2 = node4.getNodeValue();
            this.EiZ.put(n, new mrk(string2));
        }
        document.getChildNodes();
    }

    private JPanel eKx() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, 1));
        jPanel.setBorder(BorderFactory.createTitledBorder("Material painting..."));
        this.EiY = new JList();
        this.EiY.setModel(new AbstractListModel(this){
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
            }

            public Object getElementAt(int n) {
                if (mri.g(this.Ejc) == null || n < 0 || n >= mri.g(this.Ejc).length) {
                    return "Material not loaded yet";
                }
                mrk mrk2 = (mrk)mri.h(this.Ejc).get(mri.g(this.Ejc)[n]);
                if (mrk2 == null) {
                    return "no glob mat at " + n;
                }
                return n + 1 + ":" + mrk2.DisplayName;
            }

            public int getSize() {
                return 8;
            }
        });
        this.EiY.addListSelectionListener(new ListSelectionListener(this){
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
            }

            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                mri.b(this.Ejc);
            }
        });
        this.Eja = new JCheckBox("Paint Textures Mode ");
        jPanel.add(this.Eja);
        JScrollPane jScrollPane = new JScrollPane(this.EiY);
        jScrollPane.setPreferredSize(new Dimension(400, 570));
        jPanel.add(jScrollPane);
        this.Eja.addActionListener(new ActionListener(this){
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                boolean bl = true;
                if (mri.i(this.Ejc).isSelected()) {
                    bl = false;
                    mri.a(this.Ejc, 4);
                } else {
                    mri.a(this.Ejc, 0);
                }
                ((JButton)mri.a(this.Ejc).get(1)).setEnabled(bl);
                ((JButton)mri.a(this.Ejc).get(3)).setEnabled(bl);
                ((JButton)mri.a(this.Ejc).get(5)).setEnabled(bl);
                mri.b(this.Ejc);
            }
        });
        JButton jButton = new JButton("Change Material");
        jButton.addActionListener(new ActionListener(this){
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                int n = mri.j(this.Ejc).getSelectedIndex();
                if (n == -1) {
                    return;
                }
                this.Ejc.Ejb = -1;
                mri.k(this.Ejc);
                if (this.Ejc.Ejb != -1) {
                    mri.g((mri)this.Ejc)[n] = this.Ejc.Ejb;
                    krc krc2 = (krc)mri.c(this.Ejc).ii(4104);
                    krc2.pXF = (int[])mri.g(this.Ejc).clone();
                    mri.c(this.Ejc).a((khd)krc2, null, null);
                    mri.j(this.Ejc).updateUI();
                    mri.j(this.Ejc).repaint();
                }
            }
        });
        jPanel.add(jButton);
        return jPanel;
    }

    public boolean eKy() {
        Vector<String> vector = new Vector<String>();
        Vector<amf> vector2 = new Vector<amf>();
        for (dta dta2 : this.DEC.am().values()) {
            for (amf amf2 : dta2.bzr()) {
                String string = amf2.getObjectDescriptionFilename();
                if (!string.contains("terrain/ter") || string.contains("surf") || string.contains("water")) continue;
                vector.add(string);
                vector2.add(amf2);
            }
        }
        if (vector.size() == 0) {
            return false;
        }
        if (vector.size() == 1) {
            this.z((amf)vector2.get(0));
            return true;
        }
        String string = (String)JOptionPane.showInternalInputDialog(this, "Please pick mesh whose palette will be editable.", "Pick pallette mesh", 1, null, vector.toArray(), vector.get(0));
        if (string != null) {
            int n;
            for (n = 0; n < vector.size() && !((String)vector.get(n)).equals(string); ++n) {
            }
            this.z((amf)vector2.get(n));
            return true;
        }
        return false;
    }

    public void close() {
        EiL = null;
        this.dispose();
    }

    private void eKz() {
        Object object;
        aux aux2 = this.DEC;
        JDialog jDialog = new JDialog((Frame)aux2, true);
        jDialog.setTitle("Global Materials");
        jDialog.setSize(new Dimension(300, 700));
        JPanel jPanel = new JPanel(new BorderLayout());
        Vector<String> vector = new Vector<String>();
        for (int i = 0; i < this.EiZ.size(); ++i) {
            object = this.EiZ.get(i);
            if (object != null) {
                vector.add(((mrk)object).DisplayName);
                continue;
            }
            vector.add("error not found");
        }
        JList jList = new JList(vector);
        object = new JScrollPane(jList);
        JPanel jPanel2 = new JPanel(new FlowLayout(1));
        JButton jButton = new JButton("Ok");
        jButton.addActionListener(new ActionListener(this, jList, jDialog){
            final /* synthetic */ JList DVy;
            final /* synthetic */ JDialog DVz;
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
                this.DVy = jList;
                this.DVz = jDialog;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.Ejc.Ejb = this.DVy.getSelectedIndex();
                this.DVz.dispose();
            }
        });
        JButton jButton2 = new JButton("Cancel");
        jButton2.addActionListener(new ActionListener(this, jDialog){
            final /* synthetic */ JDialog DVz;
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
                this.DVz = jDialog;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.DVz.dispose();
            }
        });
        jPanel2.add(jButton);
        jPanel2.add(jButton2);
        jPanel.add((Component)object, "Center");
        jPanel.add((Component)jPanel2, "South");
        jDialog.add(jPanel);
        this.Ejb = -1;
        jDialog.setVisible(true);
    }

    public void z(amf amf2) {
        Object object2;
        if (!(amf2 instanceof dqk)) {
            lfn.b(5, this.getClass().getName(), "setEditedMesh() : object not a woldmesh object");
        }
        dqk dqk2 = (dqk)amf2;
        ArrayList<ldv> arrayList = lcn.emv();
        arrayList.add(dqk2.axa());
        for (Object object2 : this.DEC.am().values()) {
            for (amf amf3 : object2.bzr()) {
                String string = amf3.getObjectDescriptionFilename();
                if (!string.contains("terrain/ter") || string.contains("surf") || string.contains("water") || ldv.au(dqk2.getGUID(), amf3.getGUID())) continue;
                arrayList.add(amf3.getGUID());
            }
        }
        this.EiM = new ldv[arrayList.size()];
        arrayList.toArray(this.EiM);
        this.setTitle("Terrain Mesh Editor...Currently editing:" + dqk2.getObjectDescriptionFilename());
        this.eKA();
        kqs kqs2 = (kqs)this.DEC.ii(4103);
        object2 = new haa.a(this){
            final /* synthetic */ mri Ejc;
            {
                this.Ejc = mri2;
            }

            public void a(ktv ktv2, Object object) {
                kwz kwz2 = (kwz)ktv2;
                mri.a(this.Ejc, (int[])kwz2.pXF.clone());
                mri.j(this.Ejc).updateUI();
                mri.j(this.Ejc).repaint();
                mri.j(this.Ejc).setSelectedIndex(0);
            }
        };
        this.DEC.a((khd)kqs2, (haa.a)object2, null);
    }

    private void eKA() {
        if (this.EiM == null || this.EiM.length == 0 || this.EiM[0] == null) {
            lfn.b(5, this.getClass().getName(), "setBrushPropertiesInEngine() : Engine guid is invalid or null. can not send set brush properties request");
            return;
        }
        krb krb2 = (krb)this.DEC.ii(4097);
        krb2.Radius = this.getRadius();
        krb2.bWP = (float)this.EiO.getValue() / 10.0f;
        krb2.pXa = this.EiM;
        krb2.pXb = this.EiR;
        Float f = Float.valueOf(this.EiS.getText());
        krb2.gPt = f == null ? 0.0f : f.floatValue();
        krb2.pXc = this.EiT.isSelected();
        krb2.pXd = this.EiU.eKC();
        krb2.pXe = this.EiV.isSelected();
        krb2.pXf = this.EiW.isSelected();
        krb2.pXg = this.EiX.isSelected();
        krb2.pXh = this.EiY.getSelectedIndex();
        if (krb2.pXh < 0 || krb2.pXh > 7) {
            krb2.pXh = 0;
        }
        this.DEC.a((khd)krb2, null, null);
    }

    static /* synthetic */ Vector a(mri mri2) {
        return mri2.EiQ;
    }

    static /* synthetic */ void b(mri mri2) {
        mri2.eKA();
    }

    static /* synthetic */ mri eKB() {
        return EiL;
    }

    static /* synthetic */ aux c(mri mri2) {
        return mri2.DEC;
    }

    static /* synthetic */ a d(mri mri2) {
        return mri2.EiU;
    }

    static /* synthetic */ mri e(mri mri2) {
        EiL = mri2;
        return EiL;
    }

    static /* synthetic */ JSlider f(mri mri2) {
        return mri2.EiN;
    }

    static /* synthetic */ int[] g(mri mri2) {
        return mri2.pXF;
    }

    static /* synthetic */ Map h(mri mri2) {
        return mri2.EiZ;
    }

    static /* synthetic */ JCheckBox i(mri mri2) {
        return mri2.Eja;
    }

    static /* synthetic */ int a(mri mri2, int n) {
        mri2.EiR = n;
        return mri2.EiR;
    }

    static /* synthetic */ JList j(mri mri2) {
        return mri2.EiY;
    }

    static /* synthetic */ void k(mri mri2) {
        mri2.eKz();
    }

    static /* synthetic */ int[] a(mri mri2, int[] nArray) {
        mri2.pXF = nArray;
        return nArray;
    }
}

