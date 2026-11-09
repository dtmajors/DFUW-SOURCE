/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class mkn
extends JPanel {
    private JLabel I = new JLabel();
    private JTextField DFw = new JTextField();
    private FlowLayout DDV = new FlowLayout(0);
    private boolean DDW = true;

    public mkn(String string, String string2) {
        this(string, string2, true);
    }

    public mkn(String string, String string2, boolean bl) {
        this.DDW = bl;
        if (this.DDW) {
            this.setBorder(BorderFactory.createEtchedBorder());
        }
        this.setLayout(this.DDV);
        this.I.setText(string);
        this.DFw.setText(" " + string2 + " ");
        this.DFw.setBackground(Color.LIGHT_GRAY);
        this.DFw.setOpaque(true);
        this.DFw.setEditable(false);
        this.add((Component)this.I, null);
        this.add((Component)this.DFw, null);
    }

    public String eCQ() {
        return this.I.getText();
    }

    public void Cf(String string) {
        this.DFw.setText(" " + string + " ");
    }
}

