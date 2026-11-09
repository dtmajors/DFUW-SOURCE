/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class mse
extends JPanel {
    private JCheckBox EpW;
    private JTextField EpX;
    private JComboBox EpY;
    private JTextField EpZ;
    private JButton DEp;
    private JTextField Eqa;
    private JLabel I;
    private JLabel P;
    private JLabel Q;
    private JPanel aa;
    private JPanel bN;
    private JPanel ac;
    private bes Eqb;

    public mse() {
        this.b();
    }

    private void b() {
        this.aa = new JPanel();
        this.EpX = new JTextField();
        this.DEp = new JButton();
        this.bN = new JPanel();
        this.I = new JLabel();
        this.EpY = new JComboBox();
        this.P = new JLabel();
        this.Eqa = new JTextField();
        this.EpW = new JCheckBox();
        this.ac = new JPanel();
        this.Q = new JLabel();
        this.EpZ = new JTextField();
        this.aa.setBorder(BorderFactory.createTitledBorder("File"));
        this.DEp.setText("...");
        this.DEp.addActionListener(new ActionListener(this){
            final /* synthetic */ mse Eqc;
            {
                this.Eqc = mse2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mse.a(this.Eqc, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout(this.aa);
        this.aa.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap().addComponent(this.EpX, -1, 312, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DEp).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.EpX, -2, -1, -2).addComponent(this.DEp)).addContainerGap(8, Short.MAX_VALUE)));
        this.bN.setBorder(BorderFactory.createTitledBorder("Time"));
        this.I.setText("Hours:");
        this.EpY.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
        this.P.setText("Minutes:");
        this.Eqa.setText("00");
        GroupLayout groupLayout2 = new GroupLayout(this.bN);
        this.bN.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.I).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.EpY, -2, -1, -2).addGap(18, 18, 18).addComponent(this.P).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Eqa, -2, 31, -2).addContainerGap(-1, Short.MAX_VALUE)));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I).addComponent(this.EpY, -2, -1, -2).addComponent(this.P).addComponent(this.Eqa, -2, -1, -2)).addContainerGap(-1, Short.MAX_VALUE)));
        this.ac.setBorder(BorderFactory.createTitledBorder("Fade-in time"));
        this.Q.setText("Minutes:");
        this.EpZ.setText("60");
        GroupLayout groupLayout3 = new GroupLayout(this.ac);
        this.ac.setLayout(groupLayout3);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout3.createSequentialGroup().addContainerGap(-1, Short.MAX_VALUE).addComponent(this.Q).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EpZ, -2, 35, -2).addContainerGap()));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.EpZ, -2, -1, -2).addComponent(this.Q)).addContainerGap(-1, Short.MAX_VALUE)));
        GroupLayout groupLayout4 = new GroupLayout(this);
        this.setLayout(groupLayout4);
        groupLayout4.setHorizontalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout4.createSequentialGroup().addContainerGap().addComponent(this.EpW).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.aa, -1, -1, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bN, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ac, -2, -1, -2).addContainerGap()));
        groupLayout4.setVerticalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.EpW).addComponent(this.bN, -1, -1, Short.MAX_VALUE).addComponent(this.ac, -1, -1, Short.MAX_VALUE).addComponent(this.aa, 0, 58, Short.MAX_VALUE)).addContainerGap(-1, Short.MAX_VALUE)));
    }

    private void aj(ActionEvent actionEvent) {
        this.eNn();
    }

    public void a(bes bes2) {
        this.Eqb = bes2;
        this.EpX.setText(this.Eqb.Filename);
        int n = this.Eqb.dec;
        assert (n < 1440);
        int n2 = this.Eqb.dec / 60;
        int n3 = this.Eqb.dec % 60;
        String string = Integer.toString(n2);
        if (n2 < 10) {
            string = "0" + string;
        }
        this.EpY.setSelectedItem(string);
        this.Eqa.setText(Integer.toString(n3));
        this.EpZ.setText(Integer.toString(this.Eqb.ded));
    }

    public boolean eNm() {
        int n = -1;
        try {
            n = Integer.parseInt(this.Eqa.getText());
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        int n2 = -1;
        try {
            n2 = Integer.parseInt((String)this.EpY.getSelectedItem());
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        int n3 = -1;
        try {
            n3 = Integer.parseInt(this.EpZ.getText());
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        if (n == -1 || n2 == -1 || n3 == -1) {
            return false;
        }
        this.Eqb.dec = n = n2 * 60 + n;
        this.Eqb.ded = n3;
        return true;
    }

    private void eNn() {
        jrw jrw2;
        mkb mkb2 = null;
        int n = 0;
        try {
            jrw2 = new jrw(lcw.qLb + "xml-files/objectspace/environment/");
            mkb2 = new mkb(jrw2);
            myr myr2 = new myr("xml", "XML Files");
            mkb2.Ci(".xml");
            mkb2.addChoosableFileFilter(myr2);
            mkb2.setFileSelectionMode(0);
            n = mkb2.showDialog(this, "Choose File");
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            return;
        }
        jrw2 = mkb2.eDc();
        if (jrw2 == null || n != 0) {
            return;
        }
        this.Eqb.Filename = jrw2.getName();
        this.EpX.setText(this.Eqb.Filename);
    }

    public String bsl() {
        return this.Eqb.Filename;
    }

    public boolean eNo() {
        return this.EpW.isSelected();
    }

    static /* synthetic */ void a(mse mse2, ActionEvent actionEvent) {
        mse2.aj(actionEvent);
    }
}

