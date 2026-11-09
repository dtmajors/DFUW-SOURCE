/*
 * Decompiled with CFR.
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class mko
extends JPanel {
    private boolean DDT = false;
    private JLabel I = new JLabel();
    private JTextField DEo = new JTextField(2);
    private FlowLayout DDV = new FlowLayout();
    private Dimension DFx = new Dimension(30, 20);

    public mko(String string, String string2) {
        this.I.setText(string);
        this.DEo.setBorder(BorderFactory.createLoweredBevelBorder());
        this.DEo.setText(string2);
        this.DEo.addKeyListener(new a(this, null));
        this.setLayout(this.DDV);
        this.add((Component)this.I, null);
        this.add((Component)this.DEo, null);
    }

    public String eCQ() {
        return this.I.getText();
    }

    public String eCU() {
        return this.DEo.getText();
    }

    public void Cf(String string) {
        this.DEo.setText(string);
    }

    public boolean hasChanged() {
        boolean bl = this.DDT;
        this.DDT = false;
        return bl;
    }

    static /* synthetic */ boolean a(mko mko2, boolean bl) {
        mko2.DDT = bl;
        return mko2.DDT;
    }
}

