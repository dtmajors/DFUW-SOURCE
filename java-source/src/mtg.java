/*
 * Decompiled with CFR.
 */
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class mtg
extends mss
implements msk {
    private cht Exy;
    private JTextField Evc;
    private JLabel Evd;
    private JButton Eve;
    private JPanel Evg = new JPanel(new FlowLayout(0));
    private msj Evf;
    private JCheckBox Exz = new JCheckBox();
    private JCheckBox ExA = new JCheckBox();
    private JLabel ExB = new JLabel("Duration");
    private JLabel ExC = new JLabel("Distance");
    private JPanel EuK = new JPanel(new GridLayout(2, 3));
    private JPanel ExD = new JPanel(new FlowLayout(0));
    private JPanel ExE = new JPanel(new FlowLayout(0));
    private JLabel EvJ;
    private JTextField EvK;
    private JButton EvL;
    private JPanel EvM = new JPanel(new FlowLayout(0));

    public mtg(msf msf2) {
        super(msf2);
        this.Exy = (cht)msf2.eNq().eyU;
        this.Evf = new msj();
        this.Evd = new JLabel();
        this.Evc = new JTextField(24);
        this.Eve = new JButton();
        this.Evd.setText("Resource Name");
        this.Evc.setText("");
        this.Eve.setText("Change Resource");
        this.Evd.setPreferredSize(this.Eqd);
        this.Evg.add(this.Evd);
        this.Evg.add(this.Evc);
        this.Evg.add(this.Eve);
        this.add(this.Evg);
        this.EvJ = new JLabel();
        this.EvK = new JTextField(24);
        this.EvL = new JButton();
        this.EvJ.setText("Skill Name");
        this.EvK.setText("");
        this.EvL.setText("Change Skill");
        this.EvJ.setPreferredSize(this.Eqd);
        this.EvM.add(this.EvJ);
        this.EvM.add(this.EvK);
        this.EvM.add(this.EvL);
        this.add(this.EvM);
        this.ExB.setPreferredSize(this.Eqd);
        this.ExE.add(this.ExB);
        this.ExE.add(this.Exz);
        this.ExC.setPreferredSize(this.Eqd);
        this.ExD.add(this.ExC);
        this.ExD.add(this.ExA);
        this.EuK.add(this.ExE);
        this.EuK.add(this.ExD);
        this.add(this.EuK);
        this.eOd();
        this.eOg();
    }

    @Override
    public mss eOc() {
        return this;
    }

    @Override
    public void eOd() {
        if (this.Exy.ResourceType != -1) {
            this.Evc.setText(lea.enW().getName(this.Exy.ResourceType));
        } else {
            this.Evc.setText("");
        }
        if (this.Exy.SkillType != -1) {
            this.EvK.setText(lea.enZ().getName(this.Exy.SkillType));
        } else {
            this.EvK.setText("");
        }
        this.Exz.setSelected(this.Exy.eAg);
        this.ExA.setSelected(this.Exy.eAh);
    }

    public void eOg() {
        this.Eve.addActionListener(new ActionListener(this){
            final /* synthetic */ mtg ExF;
            {
                this.ExF = mtg2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtg.a(this.ExF, new msj(mtg.a(this.ExF)));
                mtg.b(this.ExF).e(mtg.a(this.ExF));
            }
        });
        this.EvL.addActionListener(new ActionListener(this){
            final /* synthetic */ mtg ExF;
            {
                this.ExF = mtg2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtg.a(this.ExF, new msj(mtg.c(this.ExF)));
                mtg.b(this.ExF).f(mtg.c(this.ExF));
            }
        });
    }

    @Override
    public boolean eNC() {
        return !(!super.eNC() && (this.Exy.ResourceType == -1 ? this.Evc.getText().trim().equals("") : this.Evc.getText().equals(lea.enW().getName(this.Exy.ResourceType))) && (this.Exy.SkillType == -1 ? this.EvK.getText().trim().equals("") : this.EvK.getText().equals(lea.enZ().getName(this.Exy.SkillType))) && (this.Exy.eAh ? this.ExA.isSelected() : !this.ExA.isSelected()) && (!this.Exy.eAg ? !this.Exz.isSelected() : this.Exz.isSelected()));
    }

    @Override
    public void save() {
        super.save();
        this.Exy.ResourceType = lea.enW().getType(this.Evc.getText());
        this.Exy.SkillType = lea.enZ().getType(this.EvK.getText());
        this.Exy.eAg = this.Exz.isSelected();
        this.Exy.eAh = this.ExA.isSelected();
    }

    @Override
    public Element c(Element element, Document document) {
        super.c(element, document);
        Element element2 = document.createElement("Duration");
        element2.setAttribute("Value", this.Exy.eAg ? "true" : "false");
        element.appendChild(element2);
        element2 = document.createElement("Distance");
        element2.setAttribute("Value", this.Exy.eAh ? "true" : "false");
        element.appendChild(element2);
        if (!this.Evc.getText().trim().equals("")) {
            element2 = document.createElement("ResourceName");
            element2.setAttribute("Value", this.Evc.getText());
            element.appendChild(element2);
        }
        if (!this.EvK.getText().trim().equals("")) {
            element2 = document.createElement("SkillName");
            element2.setAttribute("Value", this.EvK.getText());
            element.appendChild(element2);
        }
        return element;
    }

    @Override
    public /* synthetic */ JPanel eNX() {
        return this.eOc();
    }

    static /* synthetic */ msj a(mtg mtg2, msj msj2) {
        mtg2.Evf = msj2;
        return mtg2.Evf;
    }

    static /* synthetic */ JTextField a(mtg mtg2) {
        return mtg2.Evc;
    }

    static /* synthetic */ msj b(mtg mtg2) {
        return mtg2.Evf;
    }

    static /* synthetic */ JTextField c(mtg mtg2) {
        return mtg2.EvK;
    }
}

