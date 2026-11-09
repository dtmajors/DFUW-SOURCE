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

public class mtb
extends mss
implements msk {
    private Vector EwZ;
    private JComboBox Exa;
    private JLabel Exb = new JLabel("Attribute Type");
    private JPanel Exc = new JPanel(new FlowLayout(0));
    chn Exd;

    public mtb(msf msf2) {
        super(msf2);
        this.Exd = (chn)msf2.eNq().eyU;
        this.EwZ = new Vector();
        for (cgz cgz2 : cgz.values()) {
            this.EwZ.add(cgz2.name());
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
        if (this.Exd.eAd == null) {
            System.out.println("Trigger.Action==null creating a new one with default value");
            this.Exd.eAd = cgz.ezw;
        }
        this.a(this.Exa, this.Exd);
    }

    private void a(JComboBox jComboBox, chn chn2) {
        cgz cgz2 = chn2.eAd;
        if (cgz2 != null) {
            for (int i = 0; i < jComboBox.getModel().getSize(); ++i) {
                if (jComboBox.getModel().getElementAt(i).toString() != cgz2.toString()) continue;
                jComboBox.setSelectedIndex(i);
                break;
            }
        } else {
            jComboBox.setSelectedIndex(0);
        }
    }

    @Override
    public boolean eNC() {
        return super.eNC() || !this.Exd.eAd.toString().equals(this.Exa.getSelectedItem().toString());
    }

    @Override
    public void save() {
        super.save();
        this.Exd.eAd = cgz.getValueByName(this.Exa.getSelectedItem().toString());
    }

    @Override
    public Element c(Element element, Document document) {
        super.c(element, document);
        Element element2 = document.createElement("Action");
        element2.setAttribute("Value", this.Exd.eAd.toString());
        element.appendChild(element2);
        return element;
    }

    @Override
    public /* synthetic */ JPanel eNX() {
        return this.eOc();
    }
}

