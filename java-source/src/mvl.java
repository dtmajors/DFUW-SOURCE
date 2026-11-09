/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import org.jdesktop.layout.GroupLayout;

public class mvl
extends JInternalFrame {
    private JTextField EKW;
    private JPanel EKX;
    private JSlider EiN;
    private JTextField EKY;
    private JLabel I;
    private JLabel P;
    private JLabel Q;
    private JPanel aa;
    private mku EKZ;
    private dsn ELa;

    public mvl(dsn dsn2) {
        this.ELa = dsn2;
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.I = new JLabel();
        this.EiN = new JSlider();
        this.P = new JLabel();
        this.EKW = new JTextField();
        this.EKY = new JTextField();
        this.Q = new JLabel();
        this.EKX = new mku(true);
        this.setClosable(true);
        this.setTitle("Sphere Shape Properties");
        this.I.setText("Radius:");
        this.EiN.setMajorTickSpacing(100);
        this.EiN.setMaximum(500);
        this.EiN.setMinorTickSpacing(50);
        this.EiN.setPaintLabels(true);
        this.EiN.setPaintTicks(true);
        this.P.setText("GUID:");
        this.EKW.setEditable(false);
        this.EKY.setHorizontalAlignment(4);
        this.EKY.setText("50.0");
        this.Q.setText("Radius");
        this.EKX.setBorder(BorderFactory.createEtchedBorder());
        GroupLayout groupLayout = new GroupLayout((Container)this.EKX);
        this.EKX.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(0, 319, Short.MAX_VALUE));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(0, 23, Short.MAX_VALUE));
        GroupLayout groupLayout2 = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.I).addPreferredGap(0).add((Component)this.EiN, -1, 377, Short.MAX_VALUE).addContainerGap()).add(2, (GroupLayout.Group)groupLayout2.createSequentialGroup().add((GroupLayout.Group)groupLayout2.createParallelGroup(2).add(1, (Component)this.EKX, -1, -1, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.P).add(11, 11, 11).add((Component)this.EKW, -2, 137, -2).addPreferredGap(1).add((Component)this.Q, -1, 136, Short.MAX_VALUE))).addPreferredGap(0).add((Component)this.EKY, -2, 77, -2).add(21, 21, 21)))));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add(8, 8, 8).add((Component)this.EKX, -2, -1, -2).addPreferredGap(0).add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.P).add((Component)this.EKW, -2, -1, -2).add((Component)this.EKY, -2, -1, -2).add((Component)this.Q)).addPreferredGap(0).add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.I).add((Component)this.EiN, -2, -1, -2)).addContainerGap(-1, Short.MAX_VALUE)));
        GroupLayout groupLayout3 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((Component)this.aa, -1, -1, Short.MAX_VALUE).addContainerGap()));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((Component)this.aa, -2, -1, -2).addContainerGap(36, Short.MAX_VALUE)));
        this.pack();
    }

    private void c() {
        this.EKY.setText(String.valueOf(this.ELa.getRadius()));
        mjm.a(this.EiN, this.EKY, 1.0f);
        this.EKY.addActionListener(new ActionListener(this){
            final /* synthetic */ mvl ELb;
            {
                this.ELb = mvl2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                float f2 = Float.parseFloat(mvl.a(this.ELb).getText());
                if (mvl.b(this.ELb) != null) {
                    mvl.b(this.ELb).setRadius(f2);
                }
            }
        });
        this.EKZ = (mku)this.EKX;
        this.EKZ.a("Center:", this.ELa.av(), false);
        this.EKZ.setVisible(true);
    }

    static /* synthetic */ JTextField a(mvl mvl2) {
        return mvl2.EKY;
    }

    static /* synthetic */ dsn b(mvl mvl2) {
        return mvl2.ELa;
    }
}

