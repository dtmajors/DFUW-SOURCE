/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class moy
extends JInternalFrame {
    private JButton DTI;
    private JButton DTJ;
    private JTextField DTK;
    private JTextField DTL;
    private JTextField DTM;
    private JLabel I;
    private JLabel P;
    private JLabel Q;
    private aux DEC = null;
    private static float DTN = 0.25f;
    private static float DTO = 450.0f;
    private static int DTP = 50;

    public moy() {
        this.b();
        this.c();
    }

    private void b() {
        this.I = new JLabel();
        this.DTL = new JTextField();
        this.P = new JLabel();
        this.DTM = new JTextField();
        this.Q = new JLabel();
        this.DTK = new JTextField();
        this.DTI = new JButton();
        this.DTJ = new JButton();
        this.setTitle("Camera Parameters");
        this.I.setText("Camera Far Plane:");
        this.P.setText("Camera Near Plane:");
        this.Q.setText("Camera FOV:");
        this.DTI.setText("Apply");
        this.DTJ.setText("Cancel");
        GroupLayout groupLayout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(groupLayout.createSequentialGroup().addComponent(this.DTI).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DTJ)).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(this.I, -2, 103, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DTL, -2, 116, -2)).addGroup(groupLayout.createSequentialGroup().addComponent(this.P, -2, 103, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DTM, -2, 116, -2)).addGroup(groupLayout.createSequentialGroup().addComponent(this.Q, -2, 103, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DTK, -2, 116, -2)))).addContainerGap(38, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I).addComponent(this.DTL, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.P).addComponent(this.DTM, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Q).addComponent(this.DTK, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.DTI).addComponent(this.DTJ))));
        this.pack();
    }

    public void c() {
        this.DTM.setText(String.valueOf(DTN));
        this.DTL.setText(String.valueOf(DTO));
        this.DTK.setText(String.valueOf(DTP));
        this.setClosable(true);
        this.DTJ.addActionListener(new ActionListener(this){
            final /* synthetic */ moy DTQ;
            {
                this.DTQ = moy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.DTQ.setVisible(false);
            }
        });
        this.DTI.addActionListener(new ActionListener(this){
            final /* synthetic */ moy DTQ;
            {
                this.DTQ = moy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                moy.a(this.DTQ);
            }
        });
    }

    public aux eDR() {
        return this.DEC;
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    private void eIb() {
        DTN = Float.parseFloat(this.DTM.getText());
        DTO = Float.parseFloat(this.DTL.getText());
        DTP = Integer.parseInt(this.DTK.getText());
        kir kir2 = (kir)this.DEC.ii(2054);
        kir2.wD(false);
        kir2.oG(lcr.rg);
        kir2.XZ(19);
        kir2.hb((float)Math.toRadians(DTP));
        kir2.gZ(DTN);
        kir2.ha(DTO);
        mje.DBn = DTO;
        mje.DBo = DTN;
        this.DEC.a((khd)kir2, null, null);
    }

    static /* synthetic */ void a(moy moy2) {
        moy2.eIb();
    }
}

