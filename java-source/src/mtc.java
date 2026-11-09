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

public class mtc
extends msw
implements msk {
    private Vector<String> EvS = new Vector();
    private JComboBox Exe = new JComboBox<String>(this.EvS);
    private JLabel Exf;
    private Vector<String> Exg = new Vector();
    private JComboBox Exh;
    private JLabel Exi;
    private JPanel EuK;
    private JPanel Exj;
    private JPanel Exk;
    private cho Exl;

    public mtc(msf msf2) {
        super(msf2);
        this.Exl = (cho)msf2.eNq().eyU;
        this.EvS.add("False");
        this.EvS.add("True");
        this.EvS.add("Don't Care");
        this.EuK = new JPanel(new FlowLayout(0));
        this.Exj = new JPanel(new FlowLayout(0));
        this.Exk = new JPanel(new FlowLayout(0));
        this.Exf = new JLabel("Is Monolith Registered");
        this.Exj.add(this.Exf);
        this.Exj.add(this.Exe);
        this.EuK.add(this.Exj);
        this.add(this.EuK);
        for (cha cha2 : cha.values()) {
            this.Exg.add(cha2.name());
        }
        this.Exh = new JComboBox<String>(this.Exg);
        this.Exi = new JLabel("Life Mode State");
        this.Exk.add(this.Exi);
        this.Exk.add(this.Exh);
        this.add(this.Exk);
        this.eOd();
        this.eOe();
    }

    @Override
    public mss eOc() {
        return this;
    }

    public void eOe() {
    }

    @Override
    public void eOd() {
        super.eOd();
        if (this.Exl.eAe != null) {
            this.Exe.setSelectedIndex(this.Exl.eAe.bZR ? 2 : (this.Exl.eAe.Pp ? 1 : 0));
        } else {
            this.Exl.eAe = new cgc(false, true);
            this.Exl.eAe.bZR = true;
            try {
                this.Exe.setSelectedIndex(this.Exl.eAe.bZR ? 2 : (this.Exl.eAe.Pp ? 1 : 0));
            }
            catch (NullPointerException nullPointerException) {
                nullPointerException.printStackTrace();
            }
        }
        this.a(this.Exh, this.Exl);
    }

    private void a(JComboBox jComboBox, cho cho2) {
        String string = cha.getValueByOrdinal(cho2.dtZ).name();
        for (int i = 0; i < jComboBox.getModel().getSize(); ++i) {
            if (jComboBox.getModel().getElementAt(i).toString() != string) continue;
            jComboBox.setSelectedIndex(i);
            break;
        }
    }

    @Override
    public boolean eNC() {
        return super.eNC() || !(this.Exl.eAe.bZR ? this.Exe.getSelectedIndex() == 2 : (this.Exl.eAe.Pp ? this.Exe.getSelectedIndex() == 1 : this.Exe.getSelectedIndex() == 0)) || cha.getValueByOrdinal(this.Exl.dtZ) != cha.getValueByName(this.Exh.getSelectedItem().toString());
    }

    @Override
    public void save() {
        super.save();
        if (this.Exe.getSelectedIndex() == 2) {
            this.Exl.eAe.bZR = true;
        } else {
            this.Exl.eAe.bZR = false;
            this.Exl.eAe.Pp = this.Exe.getSelectedIndex() != 0;
        }
        this.Exl.dtZ = cha.getValueByName(this.Exh.getSelectedItem().toString()).ordinal();
    }

    @Override
    public Element c(Element element, Document document) {
        super.c(element, document);
        Element element2 = document.createElement("LifeMode");
        element2.setAttribute("Value", cha.getValueByOrdinal(this.Exl.dtZ).name());
        element.appendChild(element2);
        if (!this.Exl.eAe.bZR) {
            element2 = document.createElement("MonolithRegistered");
            element2.setAttribute("Value", this.Exl.eAe.Pp ? "true" : "false");
            element.appendChild(element2);
        }
        return element;
    }

    @Override
    public /* synthetic */ JPanel eNX() {
        return this.eOc();
    }
}

