/*
 * Decompiled with CFR.
 */
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.event.ChangeListener;

public class mkl
extends JPanel {
    private boolean DDT = false;
    private JCheckBox DFu = new JCheckBox();
    private FlowLayout DDV = new FlowLayout(0);
    private boolean DDW = true;

    public mkl() {
        this("no label", false, false);
    }

    public mkl(String string, boolean bl) {
        this(string, bl, true);
    }

    public mkl(String string, boolean bl, boolean bl2) {
        this.DDW = bl2;
        if (this.DDW) {
            this.setBorder(BorderFactory.createEtchedBorder());
        }
        this.DFu.setBorder(BorderFactory.createLoweredBevelBorder());
        this.DFu.setText(string);
        this.DFu.addChangeListener(new a(this, null));
        this.DFu.setSelected(bl);
        this.setLayout(this.DDV);
        this.add((Component)this.DFu, null);
    }

    public String eCU() {
        return this.DFu.getText();
    }

    public void Cf(String string) {
        this.DFu.setText(string);
    }

    public boolean hasChanged() {
        boolean bl = this.DDT;
        this.DDT = false;
        return bl;
    }

    public boolean eDr() {
        return this.DFu.isSelected();
    }

    public void zi(boolean bl) {
        this.DFu.setSelected(bl);
    }

    public void addChangeListener(ChangeListener changeListener) {
        if (this.DFu != null) {
            this.DFu.addChangeListener(changeListener);
        }
    }

    public void c(ActionListener actionListener) {
        if (this.DFu != null) {
            this.DFu.addActionListener(actionListener);
        }
    }

    static /* synthetic */ boolean a(mkl mkl2, boolean bl) {
        mkl2.DDT = bl;
        return mkl2.DDT;
    }
}

