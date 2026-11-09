/*
 * Decompiled with CFR.
 */
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mkm
extends JPanel {
    JLabel I = new JLabel();
    JLabel P = new JLabel();
    FlowLayout DDV = new FlowLayout();

    public mkm(String string, String string2) {
        this.setBorder(BorderFactory.createEtchedBorder());
        this.setLayout(this.DDV);
        this.I.setFont(new Font("Dialog", 1, 12));
        this.I.setText(string);
        this.P.setBorder(BorderFactory.createLoweredBevelBorder());
        this.P.setText(string2);
        this.add((Component)this.I, null);
        this.add((Component)this.P, null);
    }

    public String eCQ() {
        return this.I.getText();
    }
}

