/*
 * Decompiled with CFR.
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class mkv
extends JPanel {
    FlowLayout DDV = new FlowLayout();
    JLabel I = new JLabel();
    JTextField DEo = new JTextField();

    public mkv() {
        try {
            this.eDy();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void eDy() {
        this.setLayout(this.DDV);
        this.I.setText("jLabel1");
        this.DEo.setPreferredSize(new Dimension(120, 21));
        this.DEo.setText("jTextField1");
        this.DDV.setAlignment(0);
        this.setPreferredSize(new Dimension(170, 52));
        this.add((Component)this.I, null);
        this.add((Component)this.DEo, null);
    }
}

