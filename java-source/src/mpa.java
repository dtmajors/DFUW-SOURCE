/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  lcw
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileFilter;
import org.jdesktop.layout.GroupLayout;

public class mpa
extends JInternalFrame {
    private JButton DUf;
    private JTextField DUg;
    private JTextField DUh;
    private JTextField DUi;
    private JTextField DUj;
    private JTextField DUk;
    private JButton DUl;
    private JButton DUm;
    private JButton DUn;
    private JTextField DUo;
    private JComboBox u;
    private JTextField DUp;
    private JTextField DUq;
    private JLabel I;
    private JLabel P;
    private JLabel Q;
    private JLabel R;
    private JLabel S;
    private JLabel T;
    private JLabel U;
    private JLabel V;
    private JLabel Z;
    private JPanel aa;
    private JPanel bN;
    private JPanel ac;
    private JScrollPane ah;
    private JTextArea DUr;
    private ldv DUs = null;
    private axs DUt = null;

    public mpa() {
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.I = new JLabel();
        this.P = new JLabel();
        this.Q = new JLabel();
        this.DUh = new JTextField();
        this.DUg = new JTextField();
        this.DUj = new JTextField();
        this.R = new JLabel();
        this.DUi = new JTextField();
        this.DUm = new JButton();
        this.S = new JLabel();
        this.DUp = new JTextField();
        this.DUf = new JButton();
        this.T = new JLabel();
        this.DUo = new JTextField();
        this.U = new JLabel();
        this.DUq = new JTextField();
        this.V = new JLabel();
        this.DUk = new JTextField();
        this.Z = new JLabel();
        this.u = new JComboBox();
        this.bN = new JPanel();
        this.DUl = new JButton();
        this.DUn = new JButton();
        this.ac = new JPanel();
        this.ah = new JScrollPane();
        this.DUr = new JTextArea();
        this.setClosable(true);
        this.setMaximizable(true);
        this.setResizable(true);
        this.setTitle("City Converter");
        this.aa.setBorder(BorderFactory.createTitledBorder("Details.."));
        this.I.setText("City OS:");
        this.P.setText("City name:");
        this.Q.setText("City Radius:");
        this.DUh.setEditable(false);
        this.DUj.setEditable(false);
        this.DUj.setText("100");
        this.R.setText("Position:");
        this.DUi.setEditable(false);
        this.DUm.setText("Get Seleted ObjectSpace");
        this.DUm.addActionListener(new ActionListener(this){
            final /* synthetic */ mpa DUu;
            {
                this.DUu = mpa2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpa.a(this.DUu, actionEvent);
            }
        });
        this.S.setText("Strategic Value:");
        this.DUp.setText("0");
        this.DUf.setText("Calc Powercost value");
        this.DUf.addActionListener(new ActionListener(this){
            final /* synthetic */ mpa DUu;
            {
                this.DUu = mpa2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpa.b(this.DUu, actionEvent);
            }
        });
        this.T.setText("PowerCost Value: ");
        this.DUo.setEditable(false);
        this.U.setText("TOTAL VALUE:");
        this.DUq.setEditable(false);
        this.V.setText("City Type:");
        this.DUk.setEditable(false);
        this.DUk.setText("none");
        this.Z.setText("City Race Type:");
        this.u.setModel(new DefaultComboBoxModel<String>(new String[]{"Select..", "Alfar", "Dwarf", "Human", "Mahirim", "Mirdain", "Ork"}));
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (Component)this.Z).add(2, (Component)this.T).add(2, (Component)this.S).add(2, (Component)this.R).add(2, (Component)this.Q).add(2, (Component)this.P).add(2, (Component)this.I)).add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add(4, 4, 4).add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.DUp, -1, 254, Short.MAX_VALUE).add((Component)this.DUi, -1, 254, Short.MAX_VALUE).add((Component)this.DUj, -1, 254, Short.MAX_VALUE).add((Component)this.DUg, -1, 254, Short.MAX_VALUE).add((Component)this.DUh, -1, 254, Short.MAX_VALUE)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(1, false).add((Component)this.DUm).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.V).addPreferredGap(0).add((Component)this.DUk)))).add((GroupLayout.Group)groupLayout.createSequentialGroup().addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.DUo, -1, 109, Short.MAX_VALUE).addPreferredGap(0).add((Component)this.DUf).addPreferredGap(0).add((Component)this.U).addPreferredGap(0).add((Component)this.DUq, -2, 85, -2)).add((Component)this.u, -2, 156, -2)))).add(189, 189, 189)));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.I).add((Component)this.DUh, -2, -1, -2).add((Component)this.DUm)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.P).add((Component)this.DUg, -2, -1, -2).add((Component)this.V).add((Component)this.DUk, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(2).add((Component)this.Q).add((Component)this.DUj, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.R).add((Component)this.DUi, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.S).add((Component)this.DUp, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.T).add((Component)this.DUo, -2, -1, -2).add((Component)this.DUf).add((Component)this.U).add((Component)this.DUq, -2, -1, -2)).addPreferredGap(1).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.Z).add((Component)this.u, -2, -1, -2)).addContainerGap(-1, Short.MAX_VALUE)));
        this.bN.setBorder(BorderFactory.createTitledBorder("Actions"));
        this.DUl.setText("Convert To City File");
        this.DUl.addActionListener(new ActionListener(this){
            final /* synthetic */ mpa DUu;
            {
                this.DUu = mpa2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpa.c(this.DUu, actionEvent);
            }
        });
        this.DUn.setText("Mass Convert All Cities");
        GroupLayout groupLayout2 = new GroupLayout((Container)this.bN);
        this.bN.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((Component)this.DUl).addPreferredGap(1).add((Component)this.DUn, -2, 200, -2).addContainerGap(357, Short.MAX_VALUE)));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.DUl).add((Component)this.DUn)).addContainerGap(-1, Short.MAX_VALUE)));
        this.ac.setBorder(BorderFactory.createTitledBorder("Log.."));
        this.DUr.setColumns(20);
        this.DUr.setRows(5);
        this.ah.setViewportView(this.DUr);
        GroupLayout groupLayout3 = new GroupLayout((Container)this.ac);
        this.ac.setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((Component)this.ah, -1, 704, Short.MAX_VALUE));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((Component)this.ah, -1, 213, Short.MAX_VALUE));
        GroupLayout groupLayout4 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout4);
        groupLayout4.setHorizontalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout4.createParallelGroup(2).add(1, (Component)this.aa, -1, -1, Short.MAX_VALUE).add(1, (Component)this.ac, -1, -1, Short.MAX_VALUE).add(1, (Component)this.bN, -1, -1, Short.MAX_VALUE)).addContainerGap()));
        groupLayout4.setVerticalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((Component)this.aa, -2, -1, -2).addPreferredGap(0).add((Component)this.bN, -2, -1, -2).addPreferredGap(0, 10, Short.MAX_VALUE).add((Component)this.ac, -2, -1, -2).addContainerGap()));
        this.pack();
    }

    private void bc(ActionEvent actionEvent) {
        this.eIg();
    }

    private void bd(ActionEvent actionEvent) {
        this.eIe();
    }

    private void be(ActionEvent actionEvent) {
        this.eId();
    }

    private void c() {
        this.u.setModel(new DefaultComboBoxModel<axn.a>(axn.a.values()));
        mpa mpa2 = this;
        this.DUn.addActionListener(new ActionListener(this, mpa2){
            final /* synthetic */ Component DUv;
            final /* synthetic */ mpa DUu;
            {
                this.DUu = mpa2;
                this.DUv = component;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (JOptionPane.showConfirmDialog(this.DUv, "are you sure you wanto to convert all cities?", "Confirmation", 0) == 0) {
                    SwingUtilities.invokeLater(new Runnable(this){
                        final /* synthetic */ 4 DUw;
                        {
                            this.DUw = var1_1;
                        }

                        public void run() {
                            this.DUw.DUu.eIh();
                        }
                    });
                }
            }
        });
    }

    private void eId() {
        Object object;
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(lcw.qLb + "xml-files/objectspace/");
            object = new myr("xml", "XML Files");
            mkb2.Ci(".xml");
            mkb2.addChoosableFileFilter((FileFilter)object);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(0);
            mkb2.setDialogType(0);
            n = mkb2.showOpenDialog(this);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            return;
        }
        object = mkb2.eDc();
        if (object == null || n != 0) {
            return;
        }
        String string = ((File)object).getAbsolutePath().toLowerCase().replace('/', '\\');
        String string2 = lcw.qLb + "xml-files/objectspace/";
        if (!string.startsWith(string2 = string2.toLowerCase().replace('/', '\\'))) {
            JOptionPane.showMessageDialog(this, "SFFile must be in Objectspace directory!");
            return;
        }
        string = string.substring(string2.length(), string.length());
        this.DUh.setText(string);
    }

    private void eIe() {
        this.DUt = null;
        if (this.DUg.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "City needs a name to be converted!");
            return;
        }
        if (this.DUh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "City needs an ObjectSpace to be converted from!");
            return;
        }
        axn.a a2 = (axn.a)((Object)this.u.getSelectedItem());
        if (a2 == null || a2 == axn.a.csr) {
            JOptionPane.showMessageDialog(this, "Select Race for City!");
            return;
        }
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/objectspace/" + this.DUh.getText());
        jxd jxd2 = new jxd();
        Map<ldv, amf> map = jxd2.c(jrw2, true);
        ArrayList<amf> arrayList = new ArrayList<amf>(map.values());
        axn axn2 = new axn();
        this.DUt = axn2.a(arrayList, a2);
        this.DUr.setText(axn2.XH());
        this.DUr.revalidate();
        if (this.DUt == null) {
            return;
        }
        this.DUk.setText(ayb.values()[this.DUt.YJ()].name());
        this.DUo.setText(Float.toString(axn2.XI()));
        this.DUj.setText(Float.toString(this.DUt.Xu()));
        int n = 0;
        try {
            n = Integer.parseInt(this.DUp.getText());
        }
        catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this, "Stratigic value must be an interger number! Not saving");
            return;
        }
        int n2 = (int)axn2.XI() + n;
        this.DUt.iq(n2);
        this.DUq.setText(Integer.toString(n2));
        this.eIf();
    }

    private void eIf() {
        if (this.DUt == null) {
            JOptionPane.showMessageDialog(this, "No city converted in memory. Convert a city first!");
            return;
        }
        this.DUt.eK(this.DUg.getText());
        this.DUt.setID(lpd.BH(this.DUg.getText()));
        String string = this.DUt.getID() + ".xml";
        jyj jyj2 = new jyj();
        jyj2.vE(string);
        jyk jyk2 = new jyk();
        jyk2.a(string, this.DUt);
        String string2 = "City saved as [" + string + "]";
        JOptionPane.showMessageDialog(this, string2);
        this.DUr.setText(this.DUr.getText() + "\n" + string2);
    }

    private void eIg() {
        if (this.DUt == null) {
            JOptionPane.showMessageDialog(this, "No city converted in memory. Convert a city first!");
            return;
        }
        float f2 = Float.parseFloat(this.DUo.getText());
        int n = 0;
        try {
            n = Integer.parseInt(this.DUp.getText());
        }
        catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this, "Stratigic value must be an interger number! Not saving");
            return;
        }
        int n2 = (int)f2 + n;
        this.DUt.iq(n2);
        this.DUq.setText(Integer.toString(n2));
        this.eIf();
    }

    public void eIh() {
        jrw[] jrwArray;
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/objectspace/built_tiles/");
        for (jrw jrw3 : jrwArray = jrw2.dRT()) {
            jrw[] jrwArray2;
            for (jrw jrw4 : jrwArray2 = jrw3.dRT()) {
                String string;
                Object object;
                if (!jrw4.getName().toLowerCase().contains("clan")) continue;
                jxd jxd2 = new jxd();
                Map<ldv, amf> map = jxd2.c(jrw4, true);
                ArrayList<amf> arrayList = new ArrayList<amf>(map.values());
                axn.a[] aArray = new axn.a[]{axn.a.cst, axn.a.csu, axn.a.csw, axn.a.css, axn.a.csv, axn.a.csx};
                int n = -1;
                axn.a a2 = axn.a.css;
                Map<axn.a, Integer> map2 = lcn.emw();
                for (amf amf2 : arrayList) {
                    if (!(amf2 instanceof dqk)) continue;
                    object = (dqk)amf2;
                    string = object.getMeshXML().toLowerCase();
                    for (axn.a a3 : aArray) {
                        if (!string.contains(a3.toString().toLowerCase())) continue;
                        Integer n2 = (Integer)map2.get((Object)a3);
                        if (n2 == null) {
                            n2 = 0;
                        }
                        n2 = n2 + 1;
                        map2.put(a3, n2);
                        if (n2 <= n && n != -1) continue;
                        a2 = a3;
                        n = n2;
                    }
                }
                lfn.b(5, "SFCityConverterDialog", "autoConvert() :****************Converting " + jrw4.getAbsolutePath() + " as an " + a2.toString() + " city.");
                axn axn2 = new axn();
                axs object22 = axn2.a(arrayList, a2);
                this.DUr.setText(this.DUr.getText() + "\n\n" + jrw4.getAbsolutePath() + " as " + (Object)((Object)a2) + axn2.XH());
                this.DUr.revalidate();
                if (object22 == null) {
                    lfn.b(5, "SFCityConverterDialog", "autoConvert() :os " + jrw4.getAbsolutePath() + " is not a valid clan city.");
                    continue;
                }
                object = lcw.ea((ljq)object22.Xv());
                if (object == null) {
                    lfn.b(5, "SFCityConverterDialog", "autoConvert() :os " + jrw4.getAbsolutePath() + " is not a valid clan city.");
                    continue;
                }
                object22.iq((int)axn2.XI());
                object22.eK((String)object);
                object22.setID(lpd.BH((String)object));
                string = object22.getID() + ".xml";
                jyj jyj2 = new jyj();
                jyj2.vE(string);
                jyk jyk2 = new jyk();
                jyk2.a(string, object22);
                String string2 = "City saved as [" + string + "]";
                this.DUr.setText(this.DUr.getText() + "\n" + string2);
                this.DUr.updateUI();
            }
        }
        JOptionPane.showMessageDialog(this, "Done");
    }

    static /* synthetic */ void a(mpa mpa2, ActionEvent actionEvent) {
        mpa2.be(actionEvent);
    }

    static /* synthetic */ void b(mpa mpa2, ActionEvent actionEvent) {
        mpa2.bc(actionEvent);
    }

    static /* synthetic */ void c(mpa mpa2, ActionEvent actionEvent) {
        mpa2.bd(actionEvent);
    }
}

