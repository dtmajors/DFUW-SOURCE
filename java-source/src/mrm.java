/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class mrm
extends mkx {
    private JButton EkN;
    private JComboBox EjX;
    private JTextField Ekq;
    private JTextField Eks;
    private JTextField Ekt;
    private JTextField Eku;
    private JLabel I;
    private JLabel J;
    private JLabel K;
    private JLabel P;
    private JLabel Z;
    private dsq EkO;

    public mrm(dsq dsq2) {
        this.EkO = dsq2;
        this.b();
        this.c();
    }

    private void b() {
        this.I = new JLabel();
        this.P = new JLabel();
        this.Eku = new JTextField();
        this.EkN = new JButton();
        this.EjX = new JComboBox();
        this.Z = new JLabel();
        this.Ekq = new JTextField();
        this.J = new JLabel();
        this.Eks = new JTextField();
        this.K = new JLabel();
        this.Ekt = new JTextField();
        this.setClosable(true);
        this.setTitle("Water Object Properties...");
        this.I.setText("Water Level:");
        this.P.setText("WaterType:");
        this.Eku.setHorizontalAlignment(4);
        this.Eku.setText("215");
        this.EkN.setText("Ok");
        this.EjX.setModel(new DefaultComboBoxModel<String>(new String[]{"Water", "Tar", "Acid", "Swamp", "Lava"}));
        this.EjX.addActionListener(new ActionListener(this){
            final /* synthetic */ mrm EkP;
            {
                this.EkP = mrm2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mrm.a(this.EkP, actionEvent);
            }
        });
        this.Z.setText("GridResolution");
        this.Ekq.setText("80");
        this.J.setText("TranspStart");
        this.Eks.setText("60");
        this.K.setText("TranspEnd");
        this.Ekt.setText("255");
        GroupLayout groupLayout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.P, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE).addComponent(this.I, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE)).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.J).addComponent(this.Z)).addGap(24, 24, 24).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.Eku, -1, 74, Short.MAX_VALUE).addComponent(this.EjX, 0, -1, Short.MAX_VALUE).addComponent(this.Eks).addComponent(this.Ekq, -1, 73, Short.MAX_VALUE).addComponent(this.EkN, GroupLayout.Alignment.TRAILING).addComponent(this.Ekt))).addComponent(this.K)).addContainerGap(49, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I).addComponent(this.Eku, -2, -1, -2)).addGap(18, 18, 18).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.P).addComponent(this.EjX, -2, -1, -2)).addGap(26, 26, 26).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Ekq, -2, -1, -2).addComponent(this.Z)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.J).addComponent(this.Eks, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.K).addComponent(this.Ekt, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE).addComponent(this.EkN).addContainerGap()));
        this.pack();
    }

    private void bA(ActionEvent actionEvent) {
    }

    private void c() {
        this.setLayer(JLayeredPane.MODAL_LAYER);
        this.EkN.addActionListener(new ActionListener(this){
            final /* synthetic */ mrm EkP;
            {
                this.EkP = mrm2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EkP.cDP();
                this.EkP.setVisible(false);
            }
        });
        this.eKi();
    }

    void eKi() {
        this.Eku.setText(String.valueOf(this.EkO.byu()));
        this.EjX.setSelectedIndex(this.EkO.byy());
        this.Eks.setText(String.valueOf(this.EkO.byw()));
        this.Ekt.setText(String.valueOf(this.EkO.byx()));
        this.Ekq.setText(String.valueOf(this.EkO.byv()));
    }

    void cDP() {
        this.EkO.iu(Float.parseFloat(this.Eku.getText()));
        this.EkO.BS(this.EjX.getSelectedIndex());
        this.EkO.BQ(Integer.parseInt(this.Eks.getText()));
        this.EkO.BR(Integer.parseInt(this.Ekt.getText()));
        this.EkO.BP(Integer.parseInt(this.Ekq.getText()));
    }

    static /* synthetic */ void a(mrm mrm2, ActionEvent actionEvent) {
        mrm2.bA(actionEvent);
    }
}

