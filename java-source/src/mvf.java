/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mvg
 */
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.text.NumberFormat;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.LayoutStyle;
import javax.swing.event.ChangeEvent;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

public class mvf
extends JPanel {
    private static boolean EJQ;
    private final mvg EJR;
    private boolean avz;
    private float EJS;
    private int EJT;
    private JLabel Evd;
    JCheckBox EJU;
    JFormattedTextField EJV;
    JButton DFV;
    JSlider DGv;

    public static void Aj(boolean bl) {
        EJQ = bl;
    }

    public mvf(mvg mvg2) {
        this.EJR = mvg2;
        this.b();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof mvf)) {
            return false;
        }
        mvf mvf2 = (mvf)object;
        return !(this.Evd.getText() == null ? mvf2.Evd.getText() != null : !this.Evd.getText().equals(mvf2.Evd.getText()));
    }

    public float eQu() {
        Float f2 = (Float)this.EJV.getValue();
        if (f2 == null) {
            return 0.0f;
        }
        return f2.floatValue();
    }

    public String eQv() {
        return this.Evd.getText();
    }

    public int eQw() {
        return this.DGv.getValue();
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.Evd.getText() == null ? 0 : this.Evd.getText().hashCode());
        return n2;
    }

    @Override
    public boolean isEnabled() {
        return this.avz;
    }

    public boolean eQx() {
        return this.EJU.isSelected();
    }

    @Override
    public void setEnabled(boolean bl) {
        this.EJU.setEnabled(bl);
        this.DGv.setEnabled(bl);
        this.EJV.setEnabled(bl);
        this.avz = bl;
    }

    public void oH(float f2) {
        if (f2 > 1.0f) {
            f2 /= 100.0f;
        }
        this.EJS = f2;
        this.EJV.setValue(Float.valueOf(f2));
    }

    public void DF(String string) {
        this.Evd.setText(string);
    }

    public void afK(int n) {
        this.EJT = n;
        this.DGv.setValue(n);
    }

    private void b() {
        this.Evd = new JLabel();
        this.DGv = new JSlider();
        this.EJV = new JFormattedTextField();
        this.DFV = new JButton();
        this.EJU = new JCheckBox();
        this.setMaximumSize(new Dimension(420, 40));
        this.setMinimumSize(new Dimension(420, 40));
        this.setPreferredSize(new Dimension(420, 40));
        a a2 = new a(this);
        this.Evd.setText("");
        this.EJU.setText("");
        this.EJU.setToolTipText("Select it to hold the value.");
        this.EJU.addActionListener(a2);
        this.EJU.setFocusable(false);
        this.DGv.setMajorTickSpacing(10);
        this.DGv.setMinorTickSpacing(5);
        this.DGv.setMinimum(0);
        this.DGv.setMaximum(100);
        this.DGv.setPaintTrack(true);
        this.DGv.setSnapToTicks(true);
        this.DGv.addChangeListener(a2);
        this.DGv.setFocusable(false);
        this.EJV.setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter(NumberFormat.getPercentInstance())));
        this.EJV.setHorizontalAlignment(11);
        this.EJV.addFocusListener(a2);
        this.DFV.setText("Remove");
        this.DFV.setFocusable(false);
        this.DFV.addActionListener(a2);
        GroupLayout groupLayout = new GroupLayout(this);
        this.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.Evd, -2, 144, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EJU).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DGv, -2, 108, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EJV, -2, 44, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DFV).addContainerGap(-1, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.DGv, -1, -1, Short.MAX_VALUE).addComponent(this.EJU).addComponent(this.Evd, -2, 23, -2).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.EJV, -2, 23, -2).addComponent(this.DFV, -1, -1, Short.MAX_VALUE))).addContainerGap()));
    }

    void cN(ActionEvent actionEvent) {
        this.EJV.setEnabled(!this.EJU.isSelected());
        this.DGv.setEnabled(!this.EJU.isSelected());
    }

    void b(FocusEvent focusEvent) {
        float f2;
        if (EJQ) {
            return;
        }
        String string = this.EJV.getText();
        if (string == null) {
            f2 = 0.0f;
        } else {
            string = string.replace("%", "");
            try {
                f2 = Float.parseFloat(string);
            }
            catch (NumberFormatException numberFormatException) {
                f2 = 0.0f;
            }
            float f3 = f2 % 5.0f;
            int n = Math.round(f3 / 5.0f) * 5;
            f2 = f2 - f3 + (float)n;
            if (f2 > 1.0f) {
                f2 /= 100.0f;
            }
        }
        if (this.EJS == f2) {
            return;
        }
        this.EJV.setValue(Float.valueOf(f2));
        this.EJS = f2;
        EJQ = true;
        this.EJR.a(this, true);
        EJQ = false;
    }

    void cO(ActionEvent actionEvent) {
        this.EJR.a(this);
    }

    void j(ChangeEvent changeEvent) {
        if (EJQ) {
            return;
        }
        if (this.EJT == this.DGv.getValue()) {
            return;
        }
        this.EJT = this.DGv.getValue();
        EJQ = true;
        this.EJR.a(this, false);
        EJQ = false;
    }
}

