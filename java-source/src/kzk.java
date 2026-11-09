/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;

class kzk
extends kzl
implements ActionListener,
ItemListener {
    public duj qoj = null;

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String string = (String)((JComboBox)actionEvent.getSource()).getSelectedItem();
        int n = duk.jB(string);
        this.qoj.Cq(n);
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        this.iNr = !this.iNr;
    }
}

