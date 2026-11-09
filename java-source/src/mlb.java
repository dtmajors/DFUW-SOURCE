/*
 * Decompiled with CFR.
 */
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mlb
extends JPanel {
    private String DGF = "Status bar shows info about worldbuilder status";
    private JLabel DGG = null;

    public mlb() {
        this.setLayout(new FlowLayout(0));
        this.setBorder(BorderFactory.createLoweredBevelBorder());
        this.setToolTipText(this.DGF);
        this.DGG = new JLabel("Status : Worldbuilder ready.", 2);
        this.add(this.DGG);
    }

    public void Cq(String string) {
        this.DGG.setText(string);
    }
}

