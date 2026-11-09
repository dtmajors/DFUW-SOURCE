/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.filechooser.FileFilter;

public class msd
extends JInternalFrame {
    private JButton DFU;
    private JComboBox EpB;
    private JTextField EpR;
    private JPanel DNY;
    private JPanel EpS;
    private JButton DEp;
    private JButton DFV;
    private JButton DNZ;
    private JLabel I;
    private JLabel P;
    private JPanel bN;
    private JScrollPane ah;
    private List<mse> EpT = lcn.emv();
    private List<bes> EpU = lcn.emv();

    public msd() {
        this.b();
        this.c();
    }

    private void b() {
        this.EpS = new JPanel();
        this.ah = new JScrollPane();
        this.DNY = new JPanel();
        this.bN = new JPanel();
        this.DFV = new JButton();
        this.DFU = new JButton();
        this.DNZ = new JButton();
        this.DEp = new JButton();
        this.I = new JLabel();
        this.EpR = new JTextField();
        this.P = new JLabel();
        this.EpB = new JComboBox();
        this.setClosable(true);
        this.setMaximizable(true);
        this.setResizable(true);
        this.setTitle("Create Environment Config");
        this.EpS.setLayout(new BorderLayout());
        this.DNY.setLayout(new BoxLayout(this.DNY, 1));
        this.ah.setViewportView(this.DNY);
        this.EpS.add((Component)this.ah, "Center");
        this.DFV.setText("Remove");
        this.DFV.addActionListener(new ActionListener(this){
            final /* synthetic */ msd EpV;
            {
                this.EpV = msd2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msd.a(this.EpV, actionEvent);
            }
        });
        this.DFU.setText("Add");
        this.DFU.addActionListener(new ActionListener(this){
            final /* synthetic */ msd EpV;
            {
                this.EpV = msd2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msd.b(this.EpV, actionEvent);
            }
        });
        this.DNZ.setText("Save");
        this.DNZ.addActionListener(new ActionListener(this){
            final /* synthetic */ msd EpV;
            {
                this.EpV = msd2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msd.c(this.EpV, actionEvent);
            }
        });
        this.DEp.setText("Load");
        this.DEp.addActionListener(new ActionListener(this){
            final /* synthetic */ msd EpV;
            {
                this.EpV = msd2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msd.d(this.EpV, actionEvent);
            }
        });
        this.I.setText("Config Filename:");
        this.EpR.setEditable(false);
        this.P.setText("Allow effect:");
        this.EpB.setModel(new DefaultComboBoxModel<String>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        GroupLayout groupLayout = new GroupLayout(this.bN);
        this.bN.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(this.P).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.EpB, -2, -1, -2)).addGroup(groupLayout.createSequentialGroup().addComponent(this.DFU).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DFV).addGap(18, 18, 18).addComponent(this.I).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EpR, -1, 439, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DEp).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DNZ))).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.P).addComponent(this.EpB, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.DFU).addComponent(this.DFV).addComponent(this.DNZ).addComponent(this.DEp).addComponent(this.I).addComponent(this.EpR, -2, -1, -2)).addContainerGap()));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bN, GroupLayout.Alignment.TRAILING, -1, -1, Short.MAX_VALUE).addComponent(this.EpS, GroupLayout.Alignment.TRAILING, -1, 825, Short.MAX_VALUE)).addContainerGap()));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.EpS, -1, 392, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bN, -2, -1, -2).addContainerGap()));
        this.pack();
    }

    private void C(ActionEvent actionEvent) {
        this.eNk();
    }

    private void D(ActionEvent actionEvent) {
        this.eNl();
    }

    private void aj(ActionEvent actionEvent) {
        this.bCJ();
    }

    private void aB(ActionEvent actionEvent) {
        this.eNj();
    }

    private void c() {
        this.EpB.setModel(new DefaultComboBoxModel<ber.a>(ber.a.values()));
    }

    private void eNk() {
        bes bes2 = new bes(0, 0, "choose file");
        mse mse2 = new mse();
        mse2.a(bes2);
        this.EpT.add(mse2);
        this.EpU.add(bes2);
        this.DNY.add(mse2);
        this.DNY.revalidate();
    }

    private void eNl() {
        ArrayList<bes> arrayList = lcn.emv();
        ArrayList<mse> arrayList2 = lcn.emv();
        for (mse mse2 : this.EpT) {
            if (!mse2.eNo()) continue;
            arrayList2.add(mse2);
            arrayList.add(this.EpU.get(this.EpT.indexOf(mse2)));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        Iterator<mse> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            this.EpU.remove(iterator.next());
        }
        for (mse mse2 : arrayList2) {
            this.EpT.remove(mse2);
            this.DNY.remove(mse2);
        }
        this.DNY.revalidate();
    }

    private void bCJ() {
        Object object;
        jrw jrw2;
        mkb mkb2 = null;
        int n = 0;
        try {
            jrw2 = new jrw(lcw.qLb + "xml-files/object/environment/");
            mkb2 = new mkb(jrw2);
            object = new myr("xml", "XML Files");
            mkb2.Ci(".xml");
            mkb2.addChoosableFileFilter((FileFilter)object);
            mkb2.setFileSelectionMode(0);
            n = mkb2.showDialog(this, "Load Config");
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            return;
        }
        jrw2 = mkb2.eDc();
        if (jrw2 == null || n != 0) {
            return;
        }
        object = new jwo();
        List<bes> list = ((jwo)object).uO(jrw2.getAbsolutePath());
        this.EpB.setSelectedItem((Object)((jwo)object).ant());
        if (list == null) {
            return;
        }
        this.EpU.clear();
        this.EpT.clear();
        this.DNY.removeAll();
        for (bes bes2 : list) {
            mse mse2 = new mse();
            mse2.a(bes2);
            this.DNY.add(mse2);
            this.EpT.add(mse2);
            this.EpU.add(bes2);
        }
        this.revalidate();
        this.EpR.setText(jrw2.getName());
    }

    private void eNj() {
        Object object;
        jrw jrw2;
        for (mse mse2 : this.EpT) {
            if (mse2.eNm()) continue;
            JOptionPane.showMessageDialog(this, "Invalid Values in [" + mse2.bsl() + "]");
            return;
        }
        Object object2 = null;
        int n = 0;
        try {
            jrw2 = new jrw(lcw.qLb + "xml-files/object/environment/");
            object2 = new mkb(jrw2);
            object = new myr("xml", "XML Files");
            ((mkb)object2).Ci(".xml");
            ((JFileChooser)object2).addChoosableFileFilter((FileFilter)object);
            ((JFileChooser)object2).setFileSelectionMode(0);
            n = ((JFileChooser)object2).showSaveDialog(this);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            return;
        }
        jrw2 = ((mkb)object2).eDc();
        if (jrw2 == null || n != 0) {
            return;
        }
        object = new jym();
        int n2 = this.EpB.getSelectedIndex();
        if (n2 == -1) {
            n2 = 0;
        }
        ((jym)object).a(jrw2.getName(), this.EpU, ber.a.values()[n2]);
        this.EpR.setText(jrw2.getName());
    }

    static /* synthetic */ void a(msd msd2, ActionEvent actionEvent) {
        msd2.D(actionEvent);
    }

    static /* synthetic */ void b(msd msd2, ActionEvent actionEvent) {
        msd2.C(actionEvent);
    }

    static /* synthetic */ void c(msd msd2, ActionEvent actionEvent) {
        msd2.aB(actionEvent);
    }

    static /* synthetic */ void d(msd msd2, ActionEvent actionEvent) {
        msd2.aj(actionEvent);
    }
}

