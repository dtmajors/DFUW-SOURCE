/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JLabel;

public class mpg
implements FocusListener {
    public JLabel DUP;
    private Color DUQ = Color.BLACK;
    private Color DUR = Color.WHITE;
    private Color DUS = new Color(241, 239, 226);

    @Override
    public void focusGained(FocusEvent focusEvent) {
        if (this.DUP != null) {
            this.DUP.setBackground(this.DUQ);
            this.DUP.setForeground(this.DUR);
        }
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        if (this.DUP != null) {
            this.DUP.setBackground(this.DUS);
            this.DUP.setForeground(this.DUQ);
        }
    }

    public mpg(JLabel jLabel) {
        this.DUP = jLabel;
    }

    public void a(JLabel jLabel) {
        this.DUP = jLabel;
    }
}

