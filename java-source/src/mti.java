/*
 * Decompiled with CFR.
 */
import java.awt.FlowLayout;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class mti
extends mss
implements msk {
    private Vector EwZ;
    private JComboBox Exa;
    private JLabel Exb = new JLabel("Attribute Type");
    private JPanel Exc = new JPanel(new FlowLayout(0));
    chv ExM;

    public mti(msf msf2) {
        super(msf2);
        this.ExM = (chv)msf2.eNq().eyU;
        this.EwZ = new Vector();
        for (chb chb2 : chb.values()) {
            this.EwZ.add(chb2.name());
        }
        this.Exa = new JComboBox(this.EwZ);
        this.Exb.setPreferredSize(this.Eqd);
        this.Exc.add(this.Exb);
        this.Exc.add(this.Exa);
        this.add(this.Exc);
        this.eOd();
    }

    @Override
    public mss eOc() {
        return this;
    }

    @Override
    public void eOd() {
        if (this.ExM.eAi == null) {
            System.out.println("Trigger.Action == null creating new Trigger.Action with default value");
            this.ExM.eAi = chb.ezD;
        }
        this.a(this.Exa, this.ExM);
    }

    private void a(JComboBox jComboBox, chv chv2) {
        chb chb2 = chv2.eAi;
        for (int i = 0; i < jComboBox.getModel().getSize(); ++i) {
            if (jComboBox.getModel().getElementAt(i).toString() != chb2.toString()) continue;
            jComboBox.setSelectedIndex(i);
            break;
        }
    }

    @Override
    public boolean eNC() {
        return super.eNC() || !this.ExM.eAi.toString().equals(this.Exa.getSelectedItem().toString());
    }

    @Override
    public void save() {
        super.save();
        this.ExM.eAi = chb.getValueByName(this.Exa.getSelectedItem().toString());
    }

    @Override
    public Element c(Element element, Document document) {
        super.c(element, document);
        Element element2 = document.createElement("Action");
        element2.setAttribute("Value", this.ExM.eAi.toString());
        element.appendChild(element2);
        return element;
    }

    @Override
    public /* synthetic */ JPanel eNX() {
        return this.eOc();
    }
}

