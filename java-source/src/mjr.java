/*
 * Decompiled with CFR.
 */
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mjr
extends JPanel
implements ActionListener {
    private boolean DDT = false;
    private int ksh = 0;
    JComboBox DDU = null;
    JLabel I = new JLabel();
    FlowLayout DDV = new FlowLayout(2);
    private boolean DDW = true;

    public mjr(String string, Object[] objectArray, boolean bl) {
        this(string, objectArray, 0, bl);
    }

    public mjr(String string, Object[] objectArray) {
        this(string, objectArray, 0, true);
    }

    public mjr(String string, Object[] objectArray, int n) {
        this(string, objectArray, n, true);
    }

    public mjr(String string, Object[] objectArray, int n, boolean bl) {
        this.DDW = bl;
        if (n < objectArray.length) {
            this.ksh = n;
        }
        this.setLayout(this.DDV);
        this.I.setText(string);
        this.DDU = new JComboBox<Object>(objectArray);
        this.DDU.setSelectedIndex(this.ksh);
        this.DDU.addActionListener(this);
        this.add((Component)this.I, null);
        this.add((Component)this.DDU, null);
        if (this.DDW) {
            this.setBorder(BorderFactory.createEtchedBorder());
        }
    }

    public mjr(String string, Object[] objectArray, Object object) {
        this.DDW = true;
        this.setLayout(this.DDV);
        this.I.setText(string);
        this.DDU = new JComboBox<Object>(objectArray);
        this.DDU.setSelectedItem(object);
        this.DDU.addActionListener(this);
        this.add((Component)this.I, null);
        this.add((Component)this.DDU, null);
        if (this.DDW) {
            this.setBorder(BorderFactory.createEtchedBorder());
        }
    }

    public String eCQ() {
        return this.I.getText();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object = actionEvent.getSource();
        if (object == this.DDU) {
            this.DDT = true;
            this.ksh = this.DDU.getSelectedIndex();
        }
    }

    public boolean hasChanged() {
        boolean bl = this.DDT;
        this.DDT = false;
        return bl;
    }

    public int getSelectedIndex() {
        return this.DDU.getSelectedIndex();
    }

    public void setSelectedIndex(int n) {
        this.DDU.setSelectedIndex(n);
    }

    public Object getSelectedItem() {
        return this.DDU.getSelectedItem();
    }

    public void a(ActionListener actionListener) {
        this.DDU.addActionListener(actionListener);
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        this.DDU.setEnabled(bl);
    }
}

