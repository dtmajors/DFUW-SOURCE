/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class mkt
extends JPanel {
    boolean DDT = false;
    JLabel I = new JLabel();
    JTextField DEo = new JTextField(6);
    FlowLayout DDV = new FlowLayout(2);
    boolean DDW = true;

    public mkt() {
        try {
            this.eDv();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public mkt(String string, String string2) {
        this.DDW = true;
        this.I.setText(string);
        this.DEo.setText(string2);
        this.eDv();
    }

    public mkt(String string, String string2, boolean bl) {
        this.DDW = bl;
        this.I.setText(string);
        this.DEo.setText(string2);
        this.eDv();
    }

    private void eDv() {
        this.setLayout(this.DDV);
        this.DEo.setBackground(Color.WHITE);
        this.DEo.setOpaque(true);
        this.DEo.addKeyListener(new a(this, null));
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

    public void setEditable(boolean bl) {
        this.DEo.setEditable(bl);
    }
}

