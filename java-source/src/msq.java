/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import java.awt.FlowLayout;
import java.util.Collection;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class msq
extends mss
implements msk {
    private Vector Euv;
    private JComboBox Euw;
    private JSpinner Eux;
    private JLabel Euy = new JLabel("Attribute Type");
    private JLabel Euz = new JLabel("Attribute Level");
    private JPanel EuA = new JPanel(new FlowLayout(0));
    private JPanel EuB = new JPanel(new FlowLayout(0));
    chc EuC;

    public msq(msf msf2) {
        super(msf2);
        this.EuC = (chc)msf2.eNq().eyU;
        this.Euv = new Vector();
        Collection collection = ep.fz().values();
        this.Euv.add("");
        for (eo eo2 : collection) {
            this.Euv.add(eo2.Name);
        }
        this.Eux = new JSpinner();
        this.Euw = new JComboBox(this.Euv);
        this.Euy.setPreferredSize(this.Eqd);
        this.EuA.add(this.Euy);
        this.EuA.add(this.Euw);
        this.Euz.setPreferredSize(this.Eqd);
        this.EuB.add(this.Euz);
        this.EuB.add(this.Eux);
        this.add(this.EuA);
        this.add(this.EuB);
        this.eOd();
    }

    @Override
    public mss eOc() {
        return this;
    }

    @Override
    public void eOd() {
        this.Eux.setValue(Float.valueOf(this.EuC.ezI));
        this.a(this.Euw, this.EuC);
    }

    private void a(JComboBox jComboBox, chc chc2) {
        int n = chc2.bnM;
        if (n == -1) {
            jComboBox.setSelectedIndex(0);
        } else {
            for (int i = 0; i < jComboBox.getModel().getSize(); ++i) {
                if (jComboBox.getModel().getElementAt(i).toString() != ep.aM((int)n)) continue;
                jComboBox.setSelectedIndex(i);
                break;
            }
        }
    }

    @Override
    public boolean eNC() {
        return super.eNC() || this.EuC.bnM != ep.as((String)this.Euw.getSelectedItem().toString()) || this.EuC.ezI != Float.parseFloat(this.Eux.getValue().toString());
    }

    @Override
    public void save() {
        super.save();
        this.EuC.bnM = ep.as((String)this.Euw.getSelectedItem().toString());
        this.EuC.ezI = Float.parseFloat(this.Eux.getValue().toString());
    }

    @Override
    public Element c(Element element, Document document) {
        Element element2;
        super.c(element, document);
        if (this.EuC.bnM != -1) {
            element2 = document.createElement("AttributeName");
            element2.setAttribute("Value", ep.aM((int)this.EuC.bnM));
            element.appendChild(element2);
        }
        element2 = document.createElement("Level");
        element2.setAttribute("Value", Float.toString(this.EuC.ezI));
        element.appendChild(element2);
        return element;
    }

    @Override
    public /* synthetic */ JPanel eNX() {
        return this.eOc();
    }
}

