/*
 * Decompiled with CFR.
 */
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class msv
extends mss
implements msk {
    private chh EvC;
    private JTextField Evc;
    private JLabel Evd;
    private JButton Eve;
    private Vector EvD = new Vector();
    private JComboBox EvE = new JComboBox(this.EvD);
    private JLabel EvF = new JLabel("Skill Type");
    private msj Evf;
    private JCheckBox EvG = new JCheckBox();
    private JLabel EvH = new JLabel("Failure");
    private JPanel Evg = new JPanel(new FlowLayout(0));
    private JPanel EuK = new JPanel(new GridLayout(2, 3));
    private JPanel EvI = new JPanel(new FlowLayout(0));
    private JLabel EvJ;
    private JTextField EvK;
    private JButton EvL;
    private JPanel EvM = new JPanel(new FlowLayout(0));

    public msv(msf msf2) {
        super(msf2);
        this.EvC = (chh)msf2.eNq().eyU;
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
        this.EvH.setPreferredSize(this.Eqd);
        this.EvI.add(this.EvH);
        this.EvI.add(this.EvG);
        this.EuK.add(this.EvI);
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
        if (this.EvC.ResourceType != -1) {
            this.Evc.setText(lea.enW().getName(this.EvC.ResourceType));
        } else {
            this.Evc.setText("");
        }
        if (this.EvC.SkillType != -1) {
            this.EvK.setText(lea.enZ().getName(this.EvC.SkillType));
        } else {
            this.EvK.setText("");
        }
        this.EvG.setSelected(this.EvC.ezP);
    }

    public void eOg() {
        this.Eve.addActionListener(new ActionListener(this){
            final /* synthetic */ msv EvN;
            {
                this.EvN = msv2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msv.a(this.EvN, new msj(msv.a(this.EvN)));
                msv.b(this.EvN).e(msv.a(this.EvN));
            }
        });
        this.EvL.addActionListener(new ActionListener(this){
            final /* synthetic */ msv EvN;
            {
                this.EvN = msv2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msv.a(this.EvN, new msj(msv.c(this.EvN)));
                msv.b(this.EvN).f(msv.c(this.EvN));
            }
        });
    }

    @Override
    public boolean eNC() {
        return !(!super.eNC() && (this.EvC.ResourceType == -1 ? this.Evc.getText().trim().equals("") : this.Evc.getText().equals(lea.enW().getName(this.EvC.ResourceType))) && (this.EvC.SkillType == -1 ? this.EvK.getText().trim().equals("") : this.EvK.getText().equals(lea.enZ().getName(this.EvC.SkillType))) && (!this.EvC.ezP ? !this.EvG.isSelected() : this.EvG.isSelected()));
    }

    @Override
    public void save() {
        super.save();
        this.EvC.ResourceType = lea.enW().getType(this.Evc.getText());
        this.EvC.SkillType = lea.enZ().getType(this.EvK.getText());
        this.EvC.ezP = this.EvG.isSelected();
    }

    @Override
    public Element c(Element element, Document document) {
        super.c(element, document);
        Element element2 = document.createElement("Failure");
        element2.setAttribute("Value", this.EvC.ezP ? "true" : "false");
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

    static /* synthetic */ msj a(msv msv2, msj msj2) {
        msv2.Evf = msj2;
        return msv2.Evf;
    }

    static /* synthetic */ JTextField a(msv msv2) {
        return msv2.Evc;
    }

    static /* synthetic */ msj b(msv msv2) {
        return msv2.Evf;
    }

    static /* synthetic */ JTextField c(msv msv2) {
        return msv2.EvK;
    }
}

