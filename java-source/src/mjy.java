/*
 * Decompiled with CFR.
 */
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class mjy
extends JPanel {
    private boolean DDT = false;
    private JLabel I = new JLabel();
    private JTextField DEo = new JTextField(6);
    private FlowLayout DDV = new FlowLayout(2);
    private boolean DDW = true;
    private JButton DEp = new JButton("..");

    public mjy(String string, String string2, boolean bl) {
        this.DDW = bl;
        this.I.setText(string);
        this.DEo.setBorder(BorderFactory.createLoweredBevelBorder());
        this.DEo.setText(string2);
        this.DEo.addKeyListener(new a(this, null));
        this.setLayout(this.DDV);
        this.add((Component)this.I, null);
        this.add((Component)this.DEo, null);
        this.add(this.DEp);
        if (this.DDW) {
            this.setBorder(new EtchedBorder());
        }
    }

    public void b(ActionListener actionListener) {
        this.DEp.addActionListener(actionListener);
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

    public void aeD(int n) {
        this.DEo.setColumns(n);
    }

    public boolean hasChanged() {
        boolean bl = this.DDT;
        this.DDT = false;
        return bl;
    }

    @Override
    public void addKeyListener(KeyListener keyListener) {
        this.DEo.addKeyListener(keyListener);
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        this.DEo.setEnabled(bl);
    }

    static /* synthetic */ boolean a(mjy mjy2, boolean bl) {
        mjy2.DDT = bl;
        return mjy2.DDT;
    }
}

