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

public class mtd
extends mss
implements msk {
    private Vector Exm;
    private JComboBox Exn;
    private JLabel Exo = new JLabel("Transaction Type");
    private JPanel Exp = new JPanel(new FlowLayout(0));
    chq Exq;

    public mtd(msf msf2) {
        super(msf2);
        this.Exq = (chq)msf2.eNq().eyU;
        this.Exm = new Vector();
        for (tv tv2 : tv.values()) {
            this.Exm.add(tv2.name());
        }
        this.Exn = new JComboBox(this.Exm);
        this.Exo.setPreferredSize(this.Eqd);
        this.Exp.add(this.Exo);
        this.Exp.add(this.Exn);
        this.add(this.Exp);
        this.eOd();
    }

    @Override
    public mss eOc() {
        return this;
    }

    @Override
    public void eOd() {
        if (tv.getValueByOrdinal(this.Exq.cZn) == null) {
            System.out.println("Trigger.TransactionType == null creating a new one with default value");
            this.Exq.cZn = 1;
        }
        this.a(this.Exn, this.Exq);
    }

    private void a(JComboBox jComboBox, chq chq2) {
        tv tv2 = tv.getValueByOrdinal(chq2.cZn);
        for (int i = 0; i < jComboBox.getModel().getSize(); ++i) {
            if (jComboBox.getModel().getElementAt(i).toString() != tv2.toString()) continue;
            jComboBox.setSelectedIndex(i);
            break;
        }
    }

    @Override
    public boolean eNC() {
        return super.eNC() || !tv.getValueByOrdinal(this.Exq.cZn).name().equals(this.Exn.getSelectedItem().toString());
    }

    @Override
    public void save() {
        super.save();
        this.Exq.cZn = tv.getValueByName(this.Exn.getSelectedItem().toString()).ordinal();
    }

    @Override
    public Element c(Element element, Document document) {
        super.c(element, document);
        Element element2 = document.createElement("Transaction");
        element2.setAttribute("Value", tv.getValueByOrdinal(this.Exq.cZn).name());
        element.appendChild(element2);
        return element;
    }

    @Override
    public /* synthetic */ JPanel eNX() {
        return this.eOc();
    }
}

