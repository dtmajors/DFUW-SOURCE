/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ari
 *  cug
 *  lcw
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.JTextComponent;

public class mpq
extends JInternalFrame {
    private List<JComboBox> DWv = lcn.emv();
    private JPanel DWw;
    private JButton DWx;
    private JPanel DWy;
    private JTextField DWz;
    private JScrollPane ah;
    private dsc DWA;

    public mpq(dsc dsc2) {
        this.DWA = dsc2;
        this.b();
        this.c();
    }

    private void b() {
        this.ah = new JScrollPane();
        this.DWw = new JPanel();
        this.DWy = new JPanel();
        this.DWz = new JTextField();
        this.DWx = new JButton();
        this.setClosable(true);
        this.setResizable(true);
        this.setTitle("Object Properties...");
        this.DWw.setBorder(BorderFactory.createTitledBorder("Properties..."));
        GroupLayout groupLayout = new GroupLayout(this.DWw);
        this.DWw.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 423, Short.MAX_VALUE));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 307, Short.MAX_VALUE));
        this.ah.setViewportView(this.DWw);
        this.DWy.setBorder(BorderFactory.createTitledBorder("Template"));
        this.DWz.setEditable(false);
        this.DWx.setText("Save As Template");
        GroupLayout groupLayout2 = new GroupLayout(this.DWy);
        this.DWy.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.DWz, -2, 216, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DWx).addContainerGap(72, Short.MAX_VALUE)));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.DWz, -2, -1, -2).addComponent(this.DWx)).addContainerGap(-1, Short.MAX_VALUE)));
        GroupLayout groupLayout3 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout3);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout3.createSequentialGroup().addContainerGap().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.ah, GroupLayout.Alignment.LEADING, -1, 435, Short.MAX_VALUE).addComponent(this.DWy, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE)).addContainerGap()));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addComponent(this.DWy, -2, 46, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ah, -1, 335, Short.MAX_VALUE).addContainerGap()));
        this.pack();
    }

    private void c() {
        this.DWz.setText(this.DWA.bxy());
        this.DWx.addActionListener(new ActionListener(this){
            final /* synthetic */ mpq DWB;
            {
                this.DWB = mpq2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpq.a(this.DWB);
            }
        });
        this.eIL();
    }

    private void eIK() {
        Object object;
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(lcw.qLb + "xml-files/");
            object = new myr("xml", "XML Files");
            mkb2.addChoosableFileFilter((FileFilter)object);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(2);
            n = mkb2.showDialog(this, "Choose File");
        }
        catch (Exception exception) {
            lfn.print("FileChooser exception: " + exception);
            return;
        }
        if (n != 0) {
            return;
        }
        object = mkb2.eDc();
        if (object == null) {
            return;
        }
        String string = ((File)object).getAbsolutePath();
        this.DWA.jg(string);
    }

    private void eIL() {
        mjc mjc2 = mje.DCk.get(this.DWA.bxv());
        this.setTitle(mjc2.getName() + " Properties...");
        this.DWw.setLayout(new BoxLayout(this.DWw, 1));
        int n = 0;
        for (int i = 0; i < mjc2.ezw().size(); ++i) {
            mjc.b b2 = mjc2.ezw().get(i);
            if (b2.Type == mjc.c.Dzy.ordinal()) continue;
            JPanel jPanel = new JPanel();
            jPanel.setLayout(new FlowLayout(0));
            jPanel.add(new JLabel(b2.Name));
            jPanel.setVisible(!b2.Dzs);
            Object object = this.DWA.getValue(b2.Name);
            mjc.c c2 = mjc.c.getValueByOrdinal(b2.Type);
            block0 : switch (c2) {
                case Dzu: {
                    Object object2 = new JTextField();
                    ((JComponent)object2).setPreferredSize(new Dimension(40, 18));
                    jPanel.add((Component)object2);
                    if (object != null) {
                        ((JTextComponent)object2).setText(object.toString());
                    } else {
                        ((JTextComponent)object2).setText("0");
                    }
                    ((JTextField)object2).addActionListener(new ActionListener(this, jPanel, b2, (JTextField)object2){
                        final /* synthetic */ JPanel DWC;
                        final /* synthetic */ mjc.b DWD;
                        final /* synthetic */ JTextField DDz;
                        final /* synthetic */ mpq DWB;
                        {
                            this.DWB = mpq2;
                            this.DWC = jPanel;
                            this.DWD = b2;
                            this.DDz = jTextField;
                        }

                        public void actionPerformed(ActionEvent actionEvent) {
                            mpq.a(this.DWB, this.DWC, this.DWD.Name, Float.valueOf(this.DDz.getText()));
                        }
                    });
                    JSlider jSlider = new JSlider();
                    jPanel.add(jSlider);
                    float f = 0.1f;
                    jSlider.setMinimum((int)(((Float)b2.Dzn).floatValue() / f));
                    jSlider.setMaximum((int)(((Float)b2.Dzo).floatValue() / f));
                    mjm.a(jSlider, (JTextField)object2, 10.0f);
                    break;
                }
                case Dzv: {
                    Object object2 = new JTextField();
                    ((JComponent)object2).setPreferredSize(new Dimension(40, 18));
                    jPanel.add((Component)object2);
                    if (object != null) {
                        ((JTextComponent)object2).setText(object.toString());
                    } else {
                        ((JTextComponent)object2).setText("0");
                    }
                    ((JTextField)object2).addActionListener(new ActionListener(this, jPanel, b2, (JTextField)object2){
                        final /* synthetic */ JPanel DWC;
                        final /* synthetic */ mjc.b DWD;
                        final /* synthetic */ JTextField DDz;
                        final /* synthetic */ mpq DWB;
                        {
                            this.DWB = mpq2;
                            this.DWC = jPanel;
                            this.DWD = b2;
                            this.DDz = jTextField;
                        }

                        public void actionPerformed(ActionEvent actionEvent) {
                            mpq.a(this.DWB, this.DWC, this.DWD.Name, Integer.valueOf(this.DDz.getText()));
                        }
                    });
                    break;
                }
                case Dzx: 
                case Dzw: {
                    Object object2 = new JTextField();
                    ((JComponent)object2).setPreferredSize(new Dimension(180, 18));
                    jPanel.add((Component)object2);
                    if (object != null) {
                        ((JTextComponent)object2).setText(object.toString());
                    } else {
                        ((JTextComponent)object2).setText("");
                    }
                    ((JTextField)object2).addActionListener(new ActionListener(this, jPanel, b2, (JTextField)object2){
                        final /* synthetic */ JPanel DWC;
                        final /* synthetic */ mjc.b DWD;
                        final /* synthetic */ JTextField DDz;
                        final /* synthetic */ mpq DWB;
                        {
                            this.DWB = mpq2;
                            this.DWC = jPanel;
                            this.DWD = b2;
                            this.DDz = jTextField;
                        }

                        public void actionPerformed(ActionEvent actionEvent) {
                            mpq.a(this.DWB, this.DWC, this.DWD.Name, this.DDz.getText());
                        }
                    });
                    if (b2.Type != mjc.c.Dzx.ordinal()) break;
                    JButton jButton = new JButton("...");
                    jPanel.add(jButton);
                    jButton.addActionListener(new ActionListener(this, b2, (JTextField)object2){
                        final /* synthetic */ mjc.b DWD;
                        final /* synthetic */ JTextField DDz;
                        final /* synthetic */ mpq DWB;
                        {
                            this.DWB = mpq2;
                            this.DWD = b2;
                            this.DDz = jTextField;
                        }

                        public void actionPerformed(ActionEvent actionEvent) {
                            String string = this.DWD.Dzp;
                            if (string == null) {
                                string = "xml";
                            }
                            mpq.a(this.DWB, this.DDz, string);
                        }
                    });
                    break;
                }
                case Dzz: 
                case DzA: {
                    Object object2 = new JComboBox<String>(b2.Dzq);
                    jPanel.add((Component)object2);
                    if (b2.Type == mjc.c.Dzz.ordinal()) {
                        ((JComboBox)object2).setSelectedIndex((Integer)object);
                    } else if (b2.Type == mjc.c.DzA.ordinal()) {
                        for (int j = 0; j < b2.Dzq.length; ++j) {
                            if (!b2.Dzq[j].equals(object)) continue;
                            ((JComboBox)object2).setSelectedIndex(j);
                            break;
                        }
                    }
                    ((JComboBox)object2).addActionListener(new ActionListener(this, b2, jPanel, (JComboBox)object2){
                        final /* synthetic */ mjc.b DWD;
                        final /* synthetic */ JPanel DWC;
                        final /* synthetic */ JComboBox DWE;
                        final /* synthetic */ mpq DWB;
                        {
                            this.DWB = mpq2;
                            this.DWD = b2;
                            this.DWC = jPanel;
                            this.DWE = jComboBox;
                        }

                        public void actionPerformed(ActionEvent actionEvent) {
                            if (this.DWD.Type == mjc.c.Dzz.ordinal()) {
                                mpq.a(this.DWB, this.DWC, this.DWD.Name, this.DWE.getSelectedIndex());
                            } else if (this.DWD.Type == mjc.c.DzA.ordinal()) {
                                mpq.a(this.DWB, this.DWC, this.DWD.Name, (String)this.DWE.getSelectedItem());
                            }
                        }
                    });
                    break;
                }
                case DzB: {
                    Vector<String> vector;
                    Object object2 = mjc.a.valueOf(b2.Dzr);
                    switch (8.Dzg[((Enum)object2).ordinal()]) {
                        case 1: {
                            if (b2.Dzq != null && b2.Dzq.length != 0) break;
                            ArrayList<String> arrayList = lcn.abH(fy.TF.size());
                            Collection<List<bsv>> collection = fy.TF.values();
                            for (List list : collection) {
                                for (Object object3 : list) {
                                    btd btd2 = (btd)object3;
                                    if (btd2 == null || btd2.axo() == null || btd2.axo().trim().isEmpty()) continue;
                                    arrayList.add(btd2.axo());
                                }
                            }
                            b2.Dzq = arrayList.toArray(new String[arrayList.size()]);
                            break;
                        }
                        case 2: {
                            if (b2.Dzq != null && b2.Dzq.length != 0) break;
                            ArrayList<String> arrayList = lcn.emv();
                            ler ler2 = lea.enW().acv(cug.fgG);
                            vector = lea.enW().a(ler2, false, true);
                            for (Object object4 : vector) {
                                arrayList.add(((ler)object4).getName());
                            }
                            b2.Dzq = arrayList.toArray(new String[arrayList.size()]);
                        }
                    }
                    List<String> list = Arrays.asList(b2.Dzq);
                    Collections.sort(list);
                    JComboBox<String> jComboBox3 = new JComboBox<String>(list.toArray(new String[list.size()]));
                    jPanel.add(jComboBox3);
                    switch (8.Dzg[((Enum)object2).ordinal()]) {
                        case 1: {
                            Object object4;
                            Object object3;
                            Object object5 = object = object != null && !object.toString().endsWith(".xml") ? object + ".xml" : object;
                            if (object != null) {
                                jComboBox3.setSelectedItem(object);
                            } else {
                                jComboBox3.setSelectedIndex(-1);
                            }
                            vector = new Vector<String>();
                            if (object != null && !object.toString().replace(".xml", "").isEmpty()) {
                                vector.addAll(this.CL(object.toString()));
                            }
                            JComboBox jComboBox = new JComboBox(vector);
                            jComboBox.setPreferredSize(new Dimension(150, 18));
                            jPanel.add(jComboBox);
                            object4 = this.DWA.getValue("MonsterName");
                            if (object4 != null) {
                                jComboBox.setSelectedItem(object4.toString());
                            } else {
                                jComboBox.setSelectedIndex(-1);
                            }
                            object3 = this.DWA.getValue("MonsterNumber");
                            int n2 = object3 != null && !object3.toString().trim().isEmpty() ? Integer.parseInt(this.DWA.getValue("MonsterNumber").toString()) : 0;
                            JTextField jTextField = new JTextField();
                            jTextField.setPreferredSize(new Dimension(40, 18));
                            jTextField.setText(String.valueOf(n2));
                            JSlider jSlider = new JSlider();
                            jSlider.setMinimum(0);
                            jSlider.setMaximum(30);
                            mjm.a(jSlider, jTextField, 1.0f);
                            jSlider.setValue(n2);
                            jPanel.add(jTextField);
                            jPanel.add(jSlider);
                            jTextField.addActionListener(new ActionListener(this, jSlider, jTextField, jPanel){
                                final /* synthetic */ JSlider DDB;
                                final /* synthetic */ JTextField DDz;
                                final /* synthetic */ JPanel DWC;
                                final /* synthetic */ mpq DWB;
                                {
                                    this.DWB = mpq2;
                                    this.DDB = jSlider;
                                    this.DDz = jTextField;
                                    this.DWC = jPanel;
                                }

                                public void actionPerformed(ActionEvent actionEvent) {
                                    this.DDB.setValue((int)Float.valueOf(this.DDz.getText()).floatValue());
                                    mpq.a(this.DWB, this.DWC, "MonsterNumber", this.DDB.getValue());
                                }
                            });
                            jComboBox3.addActionListener(new ActionListener(this, jPanel, b2, jComboBox3, vector, jComboBox, jSlider, jTextField){
                                final /* synthetic */ JPanel DWC;
                                final /* synthetic */ mjc.b DWD;
                                final /* synthetic */ JComboBox DWE;
                                final /* synthetic */ Vector DWI;
                                final /* synthetic */ JComboBox DWJ;
                                final /* synthetic */ JSlider DDB;
                                final /* synthetic */ JTextField DDz;
                                final /* synthetic */ mpq DWB;
                                {
                                    this.DWB = mpq2;
                                    this.DWC = jPanel;
                                    this.DWD = b2;
                                    this.DWE = jComboBox;
                                    this.DWI = vector;
                                    this.DWJ = jComboBox2;
                                    this.DDB = jSlider;
                                    this.DDz = jTextField;
                                }

                                public void actionPerformed(ActionEvent actionEvent) {
                                    mpq.a(this.DWB, this.DWC, this.DWD.Name, (String)this.DWE.getSelectedItem());
                                    this.DWI.clear();
                                    this.DWI.add("");
                                    this.DWI.addAll(mpq.a(this.DWB, (String)this.DWE.getSelectedItem()));
                                    this.DWJ.setSelectedIndex(0);
                                    this.DWJ.revalidate();
                                    this.DDB.setValue(0);
                                    this.DDz.setText("0");
                                }
                            });
                            jComboBox.addActionListener(new ActionListener(this, jPanel, jComboBox){
                                final /* synthetic */ JPanel DWC;
                                final /* synthetic */ JComboBox DWJ;
                                final /* synthetic */ mpq DWB;
                                {
                                    this.DWB = mpq2;
                                    this.DWC = jPanel;
                                    this.DWJ = jComboBox;
                                }

                                public void actionPerformed(ActionEvent actionEvent) {
                                    mpq.a(this.DWB, this.DWC, "MonsterName", (String)this.DWJ.getSelectedItem());
                                }
                            });
                            break block0;
                        }
                        case 3: {
                            jComboBox3.setSelectedItem(object);
                            jComboBox3.addActionListener(new ActionListener(this, jPanel, b2, jComboBox3){
                                final /* synthetic */ JPanel DWC;
                                final /* synthetic */ mjc.b DWD;
                                final /* synthetic */ JComboBox DWE;
                                final /* synthetic */ mpq DWB;
                                {
                                    this.DWB = mpq2;
                                    this.DWC = jPanel;
                                    this.DWD = b2;
                                    this.DWE = jComboBox;
                                }

                                public void actionPerformed(ActionEvent actionEvent) {
                                    mpq.a(this.DWB, this.DWC, this.DWD.Name, (String)this.DWE.getSelectedItem());
                                }
                            });
                            break block0;
                        }
                        case 2: {
                            jComboBox3.setSelectedItem(object);
                            jComboBox3.addActionListener(new ActionListener(this, jPanel, b2, jComboBox3){
                                final /* synthetic */ JPanel DWC;
                                final /* synthetic */ mjc.b DWD;
                                final /* synthetic */ JComboBox DWE;
                                final /* synthetic */ mpq DWB;
                                {
                                    this.DWB = mpq2;
                                    this.DWC = jPanel;
                                    this.DWD = b2;
                                    this.DWE = jComboBox;
                                }

                                public void actionPerformed(ActionEvent actionEvent) {
                                    mpq.a(this.DWB, this.DWC, this.DWD.Name, (String)this.DWE.getSelectedItem());
                                }
                            });
                            break block0;
                        }
                        case 4: {
                            jComboBox3.setSelectedItem(object);
                            jComboBox3.addActionListener(new ActionListener(this, jPanel, b2, jComboBox3){
                                final /* synthetic */ JPanel DWC;
                                final /* synthetic */ mjc.b DWD;
                                final /* synthetic */ JComboBox DWE;
                                final /* synthetic */ mpq DWB;
                                {
                                    this.DWB = mpq2;
                                    this.DWC = jPanel;
                                    this.DWD = b2;
                                    this.DWE = jComboBox;
                                }

                                public void actionPerformed(ActionEvent actionEvent) {
                                    mpq.a(this.DWB, this.DWC, this.DWD.Name, (String)this.DWE.getSelectedItem());
                                }
                            });
                            break block0;
                        }
                    }
                    jComboBox3.addActionListener(new ActionListener(this, jPanel, b2, jComboBox3){
                        final /* synthetic */ JPanel DWC;
                        final /* synthetic */ mjc.b DWD;
                        final /* synthetic */ JComboBox DWE;
                        final /* synthetic */ mpq DWB;
                        {
                            this.DWB = mpq2;
                            this.DWC = jPanel;
                            this.DWD = b2;
                            this.DWE = jComboBox;
                        }

                        public void actionPerformed(ActionEvent actionEvent) {
                            mpq.a(this.DWB, this.DWC, this.DWD.Name, (String)this.DWE.getSelectedItem());
                        }
                    });
                    break;
                }
                case DzC: {
                    Object object2 = new JCheckBox("", true);
                    ((AbstractButton)object2).addActionListener(new ActionListener(this, jPanel, b2, (JCheckBox)object2){
                        final /* synthetic */ JPanel DWC;
                        final /* synthetic */ mjc.b DWD;
                        final /* synthetic */ JCheckBox DWF;
                        final /* synthetic */ mpq DWB;
                        {
                            this.DWB = mpq2;
                            this.DWC = jPanel;
                            this.DWD = b2;
                            this.DWF = jCheckBox;
                        }

                        public void actionPerformed(ActionEvent actionEvent) {
                            mpq.a(this.DWB, this.DWC, this.DWD.Name, this.DWF.isSelected());
                        }
                    });
                    jPanel.add((Component)object2);
                    break;
                }
                case Dzy: {
                    break;
                }
                default: {
                    assert (false) : "Unhandled event type : " + b2.Type;
                    break;
                }
            }
            ++n;
            this.a(jPanel, b2.Name);
            this.DWw.add(jPanel);
        }
        this.setPreferredSize(new Dimension(500, Math.min(800, n * 40 + 100)));
        this.pack();
    }

    private Vector<String> CL(String string) {
        Vector<String> vector = new Vector<String>();
        ArrayList arrayList = lcn.abH(fy.TF.size());
        Collection<List<bsv>> collection = fy.TF.values();
        block0: for (List<bsv> list : collection) {
            for (bsv bsv2 : list) {
                jxl jxl2;
                ari ari2;
                btd btd2 = (btd)bsv2;
                if (!btd2.axo().equalsIgnoreCase(string) || (ari2 = (jxl2 = new jxl()).vk(btd2.axo())) == null) continue;
                if (btd2.axo() != null && !btd2.axo().isEmpty()) {
                    vector.addAll(ari2.Rp().keySet());
                }
                if (ari2.Rt() == null) continue block0;
                vector.add(ari2.Rt());
                continue block0;
            }
        }
        return vector;
    }

    private void a(JPanel jPanel, String string) {
        boolean bl = this.DWA.je(string);
        jPanel.setBorder(BorderFactory.createLineBorder(bl ? Color.red : Color.blue));
        if (bl) {
            JButton jButton = new JButton("Revert");
            jPanel.add(jButton);
            jButton.addActionListener(new ActionListener(this, string){
                final /* synthetic */ String DWG;
                final /* synthetic */ mpq DWB;
                {
                    this.DWB = mpq2;
                    this.DWG = string;
                }

                public void actionPerformed(ActionEvent actionEvent) {
                    mpq.b(this.DWB).jf(this.DWG);
                    mpq.c(this.DWB).removeAll();
                    mpq.d(this.DWB);
                }
            });
            jPanel.updateUI();
        }
    }

    private void a(JPanel jPanel, String string, Object object) {
        boolean bl = this.DWA.je(string);
        this.DWA.setValue(string, object);
        if (!bl) {
            this.a(jPanel, string);
        }
    }

    private void a(JTextField jTextField, String string) {
        Object object;
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(lcw.qLb + string);
            object = new myr("xml", "XML Files");
            mkb2.addChoosableFileFilter((FileFilter)object);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(2);
            n = mkb2.showDialog(this, "Choose File");
        }
        catch (Exception exception) {
            lfn.print("FileChooser exception: " + exception);
            return;
        }
        if (n != 0) {
            return;
        }
        object = mkb2.eDc();
        if (object == null) {
            return;
        }
        String string2 = ((File)object).getAbsolutePath();
        string2 = string2.substring(lcw.qLb.length() + 4);
        string2 = string2.replace('\\', '/');
        jTextField.setText(string2);
        for (ActionListener actionListener : jTextField.getActionListeners()) {
            actionListener.actionPerformed(null);
        }
    }

    static /* synthetic */ void a(mpq mpq2) {
        mpq2.eIK();
    }

    static /* synthetic */ void a(mpq mpq2, JPanel jPanel, String string, Object object) {
        mpq2.a(jPanel, string, object);
    }

    static /* synthetic */ void a(mpq mpq2, JTextField jTextField, String string) {
        mpq2.a(jTextField, string);
    }

    static /* synthetic */ Vector a(mpq mpq2, String string) {
        return mpq2.CL(string);
    }

    static /* synthetic */ dsc b(mpq mpq2) {
        return mpq2.DWA;
    }

    static /* synthetic */ JPanel c(mpq mpq2) {
        return mpq2.DWw;
    }

    static /* synthetic */ void d(mpq mpq2) {
        mpq2.eIL();
    }
}

