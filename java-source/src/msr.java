/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import java.awt.FlowLayout;
import java.util.Collection;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class msr
extends msw
implements msk {
    private JPanel EuD;
    private JCheckBox EuE;
    private JLabel EuF;
    private Vector<String> EuG = new Vector();
    private JComboBox Euw;
    private JLabel Euy;
    private Vector<String> EuH = new Vector();
    private JComboBox EuI;
    private JLabel EuJ;
    private JPanel EuK;
    private JPanel EuL;
    private JPanel EuM;
    private JPanel DLh;
    private chd EuN;

    public msr(msf msf2) {
        super(msf2);
        this.EuN = (chd)msf2.eNq().eyU;
        this.EuK = new JPanel(new FlowLayout(0));
        this.EuL = new JPanel(new FlowLayout(0));
        this.EuM = new JPanel(new FlowLayout(0));
        this.DLh = new JPanel(new FlowLayout(0));
        this.EuF = new JLabel("Is Toggled On");
        this.EuE = new JCheckBox();
        this.EuL.add(this.EuF);
        this.EuL.add(this.EuE);
        this.EuK.add(this.EuL);
        this.add(this.EuK);
        Collection collection = ep.fz().values();
        for (eo eo2 : collection) {
            this.EuG.add(eo2.Name);
        }
        this.Euw = new JComboBox<String>(this.EuG);
        this.Euy = new JLabel("Attribute Type");
        this.EuM.add(this.Euy);
        this.EuM.add(this.Euw);
        this.add(this.EuM);
        cgy[] cgyArray = cgy.values();
        for (int i = 0; i < cgyArray.length; ++i) {
            this.EuH.add(cgyArray[i].name());
        }
        this.EuI = new JComboBox<String>(this.EuH);
        this.EuJ = new JLabel("Effect Type");
        this.DLh.add(this.EuJ);
        this.DLh.add(this.EuI);
        this.add(this.DLh);
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
        if (this.EuN.ezJ == null) {
            System.out.println("Trigger.EffectType == null creating new Trigger.EffectType with default value.");
            this.EuN.ezJ = cgy.getValueByOrdinal(1);
        }
        this.EuE.setSelected(this.EuN.ezK);
        this.a(this.Euw, this.EuN);
        this.b(this.EuI, this.EuN);
    }

    private void a(JComboBox jComboBox, chd chd2) {
        String string = ep.aM((int)chd2.bnM);
        for (int i = 0; i < jComboBox.getModel().getSize(); ++i) {
            if (jComboBox.getModel().getElementAt(i).toString() != string) continue;
            jComboBox.setSelectedIndex(i);
            break;
        }
    }

    private void b(JComboBox jComboBox, chd chd2) {
        String string = cgy.getValueByOrdinal(chd2.ezJ.ordinal()).name();
        for (int i = 0; i < jComboBox.getModel().getSize(); ++i) {
            if (jComboBox.getModel().getElementAt(i).toString() != string) continue;
            jComboBox.setSelectedIndex(i);
            break;
        }
    }

    @Override
    public boolean eNC() {
        return super.eNC() || ep.aM((int)this.EuN.bnM) != this.Euw.getSelectedItem().toString() || cgy.getValueByOrdinal(this.EuN.ezJ.ordinal()).name() != this.EuI.getSelectedItem().toString() || this.EuN.ezK != this.EuE.isSelected();
    }

    @Override
    public void save() {
        super.save();
        this.EuN.bnM = ep.as((String)this.Euw.getSelectedItem().toString());
        this.EuN.ezJ = cgy.getValueByName(this.EuI.getSelectedItem().toString());
        this.EuN.ezK = this.EuE.isSelected();
    }

    @Override
    public Element c(Element element, Document document) {
        super.c(element, document);
        Element element2 = document.createElement("AttributeName");
        element2.setAttribute("Value", ep.aM((int)this.EuN.bnM));
        element.appendChild(element2);
        element2 = document.createElement("EffectName");
        element2.setAttribute("Value", this.EuN.ezJ.name());
        element.appendChild(element2);
        element2 = document.createElement("Active");
        element2.setAttribute("Value", this.EuN.ezK ? "true" : "false");
        element.appendChild(element2);
        return element;
    }

    @Override
    public /* synthetic */ JPanel eNX() {
        return this.eOc();
    }
}

