/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class mub
extends JDialog
implements ActionListener,
PropertyChangeListener {
    private static final String EFu = "Tag name already exists!";
    private static final String EFv = "Rank must be between [-1 (ignore) and 11]";
    private static final String EFw = "Min rank cannot be greater than Max rank";
    private static final String EFx = "OK";
    private static final String EFy = "Cancel";
    ctn EFz;
    private JTextField EFA;
    private JFormattedTextField EFB;
    private JFormattedTextField EFC;
    int EFD;
    int EFE;
    String EFF;

    public mub(Frame frame, ctn ctn2) {
        super(frame);
        JPanel jPanel = new JPanel();
        FlowLayout flowLayout = (FlowLayout)jPanel.getLayout();
        flowLayout.setAlignment(0);
        this.getContentPane().add((Component)jPanel, "South");
        JButton jButton = new JButton(EFx);
        jButton.setActionCommand(EFx);
        jButton.addActionListener(this);
        jPanel.add(jButton);
        JButton jButton2 = new JButton(EFy);
        jButton2.setActionCommand(EFy);
        jButton2.addActionListener(this);
        jPanel.add(jButton2);
        JPanel jPanel2 = new JPanel();
        FlowLayout flowLayout2 = (FlowLayout)jPanel2.getLayout();
        flowLayout2.setAlignment(0);
        this.getContentPane().add((Component)jPanel2, "Center");
        JLabel jLabel = new JLabel("Name:");
        jPanel2.add(jLabel);
        this.EFA = new JTextField();
        jPanel2.add(this.EFA);
        this.EFA.setColumns(20);
        JLabel jLabel2 = new JLabel("Min Rank:");
        jPanel2.add(jLabel2);
        this.EFB = new JFormattedTextField();
        this.EFB.setColumns(5);
        this.EFB.setValue(new Integer(-1));
        jPanel2.add(this.EFB);
        JLabel jLabel3 = new JLabel("Max Rank:");
        jPanel2.add(jLabel3);
        this.EFC = new JFormattedTextField();
        this.EFC.setColumns(5);
        this.EFC.setValue(new Integer(-1));
        jPanel2.add(this.EFC);
        this.EFz = ctn2;
        if (ctn2 != null) {
            this.EFA.setText(ctn2.Name);
            this.EFB.setValue(new Integer(ctn2.fgd));
            this.EFC.setValue(new Integer(ctn2.fge));
        }
        this.EFB.addPropertyChangeListener(this);
        this.EFC.addPropertyChangeListener(this);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand() == EFy) {
            this.EFz = null;
            this.setVisible(false);
            this.dispose();
        } else if (actionEvent.getActionCommand() == EFx) {
            String string = this.EFA.getText();
            boolean bl = this.Dx(string);
            if (!bl) {
                JOptionPane.showMessageDialog(this, "Tag name already exists! Choose another name", "Invalid Tag Name", 0);
                return;
            }
            int n = ((Number)this.EFB.getValue()).intValue();
            int n2 = ((Number)this.EFC.getValue()).intValue();
            if (!this.afG(n) || !this.afG(n2)) {
                JOptionPane.showMessageDialog(this, EFv, "Invalid rank", 0);
                return;
            }
            if (!this.gw(n, n2)) {
                JOptionPane.showMessageDialog(this, "Min rank must less or equal to max rank", "Invalid rank", 0);
                return;
            }
            if (this.EFz == null) {
                this.EFz = new ctn();
            }
            this.EFz.Name = string;
            this.EFz.fgd = n;
            this.EFz.fge = n2;
            this.setVisible(false);
            this.dispose();
        }
    }

    public ctn ePD() {
        return this.EFz;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        if (propertyChangeEvent.getSource() == this.EFA) {
            String string = this.EFA.getText();
            boolean bl = this.Dx(string);
            this.EFA.setForeground(bl ? Color.black : Color.red);
            this.EFA.setToolTipText(bl ? null : EFu);
        } else if (propertyChangeEvent.getSource() == this.EFB && propertyChangeEvent.getPropertyName().equals("value")) {
            int n = ((Number)this.EFB.getValue()).intValue();
            boolean bl = this.afG(n);
            this.EFB.setForeground(bl ? Color.black : Color.red);
            this.EFB.setToolTipText(bl ? null : EFv);
            if (!bl) {
                return;
            }
            int n2 = ((Number)this.EFC.getValue()).intValue();
            boolean bl2 = this.gw(n, n2);
            this.EFB.setForeground(bl2 ? Color.black : Color.red);
            this.EFC.setForeground(bl2 ? Color.black : Color.red);
            this.EFB.setToolTipText(bl2 ? null : EFw);
            this.EFC.setToolTipText(bl2 ? null : EFw);
        } else if (propertyChangeEvent.getSource() == this.EFC && propertyChangeEvent.getPropertyName().equals("value")) {
            int n = ((Number)this.EFC.getValue()).intValue();
            boolean bl = this.afG(n);
            this.EFB.setForeground(bl ? Color.black : Color.red);
            this.EFB.setToolTipText(bl ? null : EFv);
            if (!bl) {
                return;
            }
            int n3 = ((Number)this.EFB.getValue()).intValue();
            boolean bl3 = this.gw(n3, n);
            this.EFB.setForeground(bl3 ? Color.black : Color.red);
            this.EFC.setForeground(bl3 ? Color.black : Color.red);
            this.EFB.setToolTipText(bl3 ? null : EFw);
            this.EFC.setToolTipText(bl3 ? null : EFw);
        }
    }

    private boolean afG(int n) {
        return n >= -1 && n <= 11;
    }

    private boolean gw(int n, int n2) {
        return n == -1 || n2 == -1 || n <= n2;
    }

    private boolean Dx(String string) {
        Set<String> set = lea.eoK().keySet();
        boolean bl = set.contains(string) && (this.EFz == null || !this.EFz.Name.equals(string));
        return !bl;
    }
}

