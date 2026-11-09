/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jdesktop.layout.GroupLayout;

public class moq
extends JInternalFrame {
    private mku DSV;
    private JButton qtg;
    private JButton DSW;
    private JButton DEt;
    private JTextField DSX;
    private JLabel I;
    private JPanel aa;
    private aux DEC;
    private ljq Position;
    private String DSY;

    public moq() {
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.DSV = new mku();
        this.DSW = new JButton();
        this.I = new JLabel();
        this.DSX = new JTextField();
        this.DEt = new JButton();
        this.qtg = new JButton();
        this.setTitle("Set Spawnposition for level");
        this.DSW.setText("Get Camera Position");
        this.DSW.addActionListener(new ActionListener(this){
            final /* synthetic */ moq DSZ;
            {
                this.DSZ = moq2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                moq.a(this.DSZ, actionEvent);
            }
        });
        this.I.setText("Tile Name:");
        this.DEt.setText("Ok");
        this.DEt.addActionListener(new ActionListener(this){
            final /* synthetic */ moq DSZ;
            {
                this.DSZ = moq2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                moq.b(this.DSZ, actionEvent);
            }
        });
        this.qtg.setText("Cancel");
        this.qtg.addActionListener(new ActionListener(this){
            final /* synthetic */ moq DSZ;
            {
                this.DSZ = moq2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                moq.c(this.DSZ, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.DSV, -2, -1, -2).addPreferredGap(0).add((Component)this.DSW)).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.I).addPreferredGap(0).add((Component)this.DSX, -1, 379, Short.MAX_VALUE)).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.DEt).addPreferredGap(0, 323, Short.MAX_VALUE).add((Component)this.qtg))).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.DSW).add((Component)this.DSV, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.I).add((Component)this.DSX, -2, -1, -2)).addPreferredGap(0, -1, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.DEt).add((Component)this.qtg)).addContainerGap()));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((Component)this.aa, -1, -1, Short.MAX_VALUE).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((Component)this.aa, -2, -1, -2).addContainerGap(15, Short.MAX_VALUE)));
        this.pack();
    }

    private void aM(ActionEvent actionEvent) {
        this.DSV.cL(mje.DBl);
    }

    private void I(ActionEvent actionEvent) {
        this.eHH();
    }

    private void H(ActionEvent actionEvent) {
        this.eHI();
    }

    private void c() {
        this.DSV.cL(mje.DBl);
    }

    private void eHH() {
        this.eAJ();
        this.dispose();
    }

    private void eHI() {
        this.Position = null;
        this.DSY = null;
        this.dispose();
    }

    public ljq av() {
        return this.Position;
    }

    public String eHJ() {
        return this.DSY;
    }

    private void eAJ() {
        ljq ljq2 = this.DSV.bSh();
        String string = this.DSX.getText();
        jxp jxp2 = new jxp();
        Map<String, List<ljq>> map = jxp2.dUE();
        List<ljq> list = map.get(string = string.toLowerCase());
        if (list == null) {
            list = lcn.emv();
        }
        list.clear();
        list.add(ljq2);
        map.put(string, list);
        jyx jyx2 = new jyx();
        jyx2.W(map);
        JOptionPane.showMessageDialog(this, "Saved CamPos " + ljq2 + " for Tile Zone [" + string + "]");
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(moq moq2, ActionEvent actionEvent) {
        moq2.aM(actionEvent);
    }

    static /* synthetic */ void b(moq moq2, ActionEvent actionEvent) {
        moq2.I(actionEvent);
    }

    static /* synthetic */ void c(moq moq2, ActionEvent actionEvent) {
        moq2.H(actionEvent);
    }
}

