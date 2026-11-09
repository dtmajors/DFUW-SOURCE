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

public class msz
extends mss
implements msk {
    private Vector EwK;
    private JComboBox EwL;
    private JLabel EwM = new JLabel("GUI Action");
    private JPanel EwN = new JPanel(new FlowLayout(0));
    private Vector EwO;
    private JComboBox EwP;
    private JLabel EwQ = new JLabel("Map Marker Type");
    private JPanel EwR = new JPanel(new FlowLayout(0));
    chl EwS;

    public msz(msf msf2) {
        super(msf2);
        this.EwS = (chl)msf2.eNq().eyU;
        this.EwK = new Vector();
        for (cja enum_ : cja.values()) {
            this.EwK.add(enum_.name());
        }
        this.EwL = new JComboBox(this.EwK);
        this.EwM.setPreferredSize(this.Eqd);
        this.EwN.add(this.EwM);
        this.EwN.add(this.EwL);
        this.add(this.EwN);
        this.EwO = new Vector();
        for (Enum enum_ : jjk.values()) {
            this.EwO.add(enum_.name());
        }
        this.EwP = new JComboBox(this.EwO);
        this.EwQ.setPreferredSize(this.Eqd);
        this.EwR.add(this.EwQ);
        this.EwR.add(this.EwP);
        this.add(this.EwR);
        this.eOd();
    }

    @Override
    public mss eOc() {
        return this;
    }

    @Override
    public void eOd() {
        if (this.EwS.eAa == null) {
            System.out.println("This.GUIAction == null creating a new one with default values.");
            this.EwS.eAa = cja.eDq;
        }
        this.b(this.EwL, this.EwS);
        this.b(this.EwP, this.EwS);
    }

    private void a(JComboBox jComboBox, chl chl2) {
        jjk jjk2 = jjk.getValueByOrdinal(chl2.eAb);
        for (int i = 0; i < jComboBox.getModel().getSize(); ++i) {
            if (jComboBox.getModel().getElementAt(i).toString() != jjk.getValueByOrdinal(chl2.eAb).name()) continue;
            jComboBox.setSelectedIndex(i);
            break;
        }
    }

    private void b(JComboBox jComboBox, chl chl2) {
        cja cja2 = chl2.eAa;
        for (int i = 0; i < jComboBox.getModel().getSize(); ++i) {
            if (jComboBox.getModel().getElementAt(i).toString() != cja2.name()) continue;
            jComboBox.setSelectedIndex(i);
            break;
        }
    }

    @Override
    public boolean eNC() {
        return super.eNC() || !this.EwS.eAa.name().equals(this.EwL.getSelectedItem().toString().trim()) || this.EwS.eAb != jjk.getValueByName(this.EwP.getSelectedItem().toString().trim()).ordinal();
    }

    @Override
    public void save() {
        super.save();
        this.EwS.eAb = jjk.getValueByName(this.EwP.getSelectedItem().toString()).ordinal();
        this.EwS.eAa = cja.getValueByName(this.EwL.getSelectedItem().toString());
    }

    @Override
    public Element c(Element element, Document document) {
        super.c(element, document);
        Element element2 = document.createElement("Action");
        element2.setAttribute("Value", this.EwS.eAa.toString());
        element.appendChild(element2);
        element2 = document.createElement("MapMarkerGroupType");
        element2.setAttribute("Value", jjk.getValueByOrdinal(this.EwS.eAb).name());
        element.appendChild(element2);
        return element;
    }

    @Override
    public /* synthetic */ JPanel eNX() {
        return this.eOc();
    }
}

