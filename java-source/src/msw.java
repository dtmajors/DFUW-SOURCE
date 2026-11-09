/*
 * Decompiled with CFR.
 */
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public abstract class msw
extends mss
implements msk {
    private chi EvO;
    private JTextField Evc;
    private JLabel Evd;
    private JButton Eve;
    private Vector EvD = new Vector();
    private JComboBox EvE = new JComboBox(this.EvD);
    private JLabel EvF = new JLabel("Skill Type");
    private JTextField EvP;
    private JLabel EvQ;
    private JButton EvR;
    private msj Evf;
    private Vector<String> EvS = new Vector();
    private JComboBox EvT = new JComboBox<String>(this.EvS);
    private JComboBox EvU = new JComboBox<String>(this.EvS);
    private JComboBox EvV = new JComboBox<String>(this.EvS);
    private JComboBox EvW = new JComboBox<String>(this.EvS);
    private JComboBox EvX = new JComboBox<String>(this.EvS);
    private JComboBox EvY = new JComboBox<String>(this.EvS);
    private JLabel EvZ = new JLabel("Is Event Source");
    private JLabel Ewa = new JLabel("Reveived");
    private JLabel Ewb = new JLabel("Belong to Enemy Clan");
    private JLabel Ewc = new JLabel("There is active Challenge");
    private JLabel Ewd = new JLabel("Structure in Challenged City");
    private JLabel Ewe = new JLabel("Belong in same Clan");
    private JComboBox Ewf;
    private Vector<String> Ewg = new Vector();
    private JPanel Evg = new JPanel(new FlowLayout(0));
    private JPanel Ewh = new JPanel(new FlowLayout(0));
    private JPanel EuK = new JPanel(new GridLayout(2, 3));
    private JPanel Ewi = new JPanel(new FlowLayout(0));
    private JPanel Ewj = new JPanel(new FlowLayout(0));
    private JPanel Ewk = new JPanel(new FlowLayout(0));
    private JPanel Ewl = new JPanel(new FlowLayout(0));
    private JPanel Ewm = new JPanel(new FlowLayout(0));
    private JPanel Ewn = new JPanel(new FlowLayout(0));
    private JPanel Ewo = new JPanel(new FlowLayout(0));
    private JLabel Ewp;
    private JLabel EvJ;
    private JTextField EvK;
    private JButton EvL;
    private JPanel EvM = new JPanel(new FlowLayout(0));

    public msw(msf msf2) {
        super(msf2);
        this.EvO = (chi)msf2.eNq().eyU;
        this.Evf = new msj();
        this.EvS.add("False");
        this.EvS.add("True");
        this.EvS.add("Don't Care");
        this.Ewg.add("Don't Care");
        this.Ewg.add("0");
        this.Ewg.add("1");
        this.Ewg.add("2");
        this.Ewg.add("3");
        this.Ewg.add("4");
        this.Ewg.add("5");
        this.Ewg.add("6");
        this.Ewg.add("7");
        this.Ewg.add("8");
        this.Ewg.add("9");
        this.Ewg.add("10");
        this.Ewg.add("11");
        this.EvQ = new JLabel();
        this.EvP = new JTextField(24);
        this.EvR = new JButton();
        this.EvQ.setText("Weapon Name");
        this.EvP.setText("");
        this.EvR.setText("Change Weapon");
        this.EvQ.setPreferredSize(this.Eqd);
        this.Ewh.add(this.EvQ);
        this.Ewh.add(this.EvP);
        this.Ewh.add(this.EvR);
        this.add(this.Ewh);
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
        this.Ewp = new JLabel();
        this.Ewf = new JComboBox<String>(this.Ewg);
        this.Ewp.setText("Resource Rank");
        this.Ewp.setPreferredSize(this.Eqd);
        this.Ewo.add(this.Ewp);
        this.Ewo.add(this.Ewf);
        this.add(this.Ewo);
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
        this.EvZ.setPreferredSize(this.Eqd);
        this.Ewi.add(this.EvZ);
        this.Ewi.add(this.EvT);
        this.Ewa.setPreferredSize(this.Eqd);
        this.Ewj.add(this.Ewa);
        this.Ewj.add(this.EvU);
        this.Ewb.setPreferredSize(this.Eqd);
        this.Ewk.add(this.Ewb);
        this.Ewk.add(this.EvV);
        this.Ewc.setPreferredSize(this.Eqd);
        this.Ewl.add(this.Ewc);
        this.Ewl.add(this.EvW);
        this.Ewd.setPreferredSize(this.Eqd);
        this.Ewm.add(this.Ewd);
        this.Ewm.add(this.EvX);
        this.Ewe.setPreferredSize(this.Eqd);
        this.Ewn.add(this.Ewe);
        this.Ewn.add(this.EvY);
        this.EuK.add(this.Ewi);
        this.EuK.add(this.Ewj);
        this.EuK.add(this.Ewk);
        this.EuK.add(this.Ewl);
        this.EuK.add(this.Ewm);
        this.EuK.add(this.Ewn);
        this.add(this.EuK);
        this.eOg();
    }

    @Override
    public mss eOc() {
        return this;
    }

    @Override
    public void eOd() {
        if (this.EvO.ezX != -1) {
            this.EvP.setText(lea.enW().getName(this.EvO.ezX));
        } else {
            this.EvP.setText("");
        }
        if (this.EvO.ResourceType != -1) {
            this.Evc.setText(lea.enW().getName(this.EvO.ResourceType));
        } else {
            this.Evc.setText("");
        }
        if (this.EvO.SkillType != -1) {
            this.EvK.setText(lea.enZ().getName(this.EvO.SkillType));
        } else {
            this.EvK.setText("");
        }
        if (this.EvO.ezW != -1) {
            this.Ewf.setSelectedIndex(this.EvO.ezW + 1);
        } else {
            this.Ewf.setSelectedIndex(0);
        }
        if (this.EvO.ezQ == null) {
            System.out.println("Trigger.IsEventSource==null creating new with default values");
            this.EvO.ezQ = new cgc(true, true);
            this.EvO.ezQ.bZR = true;
        }
        if (this.EvO.ezR == null) {
            System.out.println("Trigger.Received==null creating new with default values");
            this.EvO.ezR = new cgc(true, true);
            this.EvO.ezR.bZR = true;
        }
        if (this.EvO.ezS == null) {
            System.out.println("Trigger.BelongToEnemyClan==null creating new with default values");
            this.EvO.ezS = new cgc(true, true);
            this.EvO.ezS.bZR = true;
        }
        if (this.EvO.ezT == null) {
            System.out.println("Trigger.ThereIsActiveChallenge==null creating new with default values");
            this.EvO.ezT = new cgc(true, true);
            this.EvO.ezT.bZR = true;
        }
        if (this.EvO.ezU == null) {
            System.out.println("Trigger.StructureInChallengedCity==null creating new with default values");
            this.EvO.ezU = new cgc(true, true);
            this.EvO.ezU.bZR = true;
        }
        if (this.EvO.ezV == null) {
            System.out.println("Trigger.BelongInSameClan==null creating new with default values");
            this.EvO.ezV = new cgc(true, true);
            this.EvO.ezV.bZR = true;
        }
        this.EvT.setSelectedIndex(this.EvO.ezQ == null ? 2 : (this.EvO.ezQ.bZR ? 2 : (this.EvO.ezQ.Pp ? 1 : 0)));
        this.EvU.setSelectedIndex(this.EvO.ezR == null ? 2 : (this.EvO.ezR.bZR ? 2 : (this.EvO.ezR.Pp ? 1 : 0)));
        this.EvV.setSelectedIndex(this.EvO.ezS == null ? 2 : (this.EvO.ezS.bZR ? 2 : (this.EvO.ezS.Pp ? 1 : 0)));
        this.EvW.setSelectedIndex(this.EvO.ezT == null ? 2 : (this.EvO.ezT.bZR ? 2 : (this.EvO.ezT.Pp ? 1 : 0)));
        this.EvX.setSelectedIndex(this.EvO.ezU == null ? 2 : (this.EvO.ezU.bZR ? 2 : (this.EvO.ezU.Pp ? 1 : 0)));
        this.EvY.setSelectedIndex(this.EvO.ezV == null ? 2 : (this.EvO.ezV.bZR ? 2 : (this.EvO.ezV.Pp ? 1 : 0)));
    }

    private void a(JComboBox jComboBox, chi chi2) {
        String string = chi2.aOG().toString();
        for (int i = 0; i < jComboBox.getModel().getSize(); ++i) {
            if (jComboBox.getModel().getElementAt(i).toString() != string) continue;
            jComboBox.setSelectedIndex(i);
            break;
        }
    }

    public void eOg() {
        this.EvR.addActionListener(new ActionListener(this){
            final /* synthetic */ msw Ewq;
            {
                this.Ewq = msw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msw.a(this.Ewq, new msj(msw.a(this.Ewq)));
                msw.b(this.Ewq).d(msw.a(this.Ewq));
            }
        });
        this.Eve.addActionListener(new ActionListener(this){
            final /* synthetic */ msw Ewq;
            {
                this.Ewq = msw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msw.a(this.Ewq, new msj(msw.c(this.Ewq)));
                msw.b(this.Ewq).e(msw.c(this.Ewq));
            }
        });
        this.EvL.addActionListener(new ActionListener(this){
            final /* synthetic */ msw Ewq;
            {
                this.Ewq = msw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msw.a(this.Ewq, new msj(msw.d(this.Ewq)));
                msw.b(this.Ewq).f(msw.d(this.Ewq));
            }
        });
    }

    @Override
    public boolean eNC() {
        return !(!super.eNC() && (this.EvO.ezX == -1 ? this.EvP.getText().trim().equals("") : this.EvP.getText().equals(lea.enW().getName(this.EvO.ezX))) && (this.EvO.ResourceType == -1 ? this.Evc.getText().trim().equals("") : this.Evc.getText().equals(lea.enW().getName(this.EvO.ResourceType))) && (this.EvO.SkillType == -1 ? this.EvK.getText().trim().equals("") : this.EvK.getText().equals(lea.enZ().getName(this.EvO.SkillType))) && (this.EvO.ezW == -1 ? this.Ewf.getSelectedIndex() == 0 : this.Ewf.getSelectedIndex() == this.EvO.ezW + 1) && (this.EvO.ezQ.bZR ? this.EvT.getSelectedIndex() == 2 : (this.EvO.ezQ.Pp ? this.EvT.getSelectedIndex() == 1 : this.EvT.getSelectedIndex() == 0)) && (this.EvO.ezR.bZR ? this.EvU.getSelectedIndex() == 2 : (this.EvO.ezR.Pp ? this.EvU.getSelectedIndex() == 1 : this.EvU.getSelectedIndex() == 0)) && (this.EvO.ezS.bZR ? this.EvV.getSelectedIndex() == 2 : (this.EvO.ezS.Pp ? this.EvV.getSelectedIndex() == 1 : this.EvV.getSelectedIndex() == 0)) && (this.EvO.ezT.bZR ? this.EvW.getSelectedIndex() == 2 : (this.EvO.ezT.Pp ? this.EvW.getSelectedIndex() == 1 : this.EvW.getSelectedIndex() == 0)) && (this.EvO.ezU.bZR ? this.EvX.getSelectedIndex() == 2 : (this.EvO.ezU.Pp ? this.EvX.getSelectedIndex() == 1 : this.EvX.getSelectedIndex() == 0)) && (this.EvO.ezV.bZR ? this.EvY.getSelectedIndex() == 2 : (this.EvO.ezV.Pp ? this.EvY.getSelectedIndex() == 1 : this.EvY.getSelectedIndex() == 0)));
    }

    @Override
    public void save() {
        super.save();
        this.EvO.ezX = lea.enW().getType(this.EvP.getText());
        this.EvO.ResourceType = lea.enW().getType(this.Evc.getText());
        this.EvO.SkillType = lea.enZ().getType(this.EvK.getText());
        this.EvO.ezW = this.Ewf.getSelectedIndex() == 0 ? -1 : this.Ewf.getSelectedIndex() - 1;
        if (this.EvT.getSelectedIndex() == 2) {
            this.EvO.ezQ.bZR = true;
        } else {
            this.EvO.ezQ.bZR = false;
            this.EvO.ezQ.Pp = this.EvT.getSelectedIndex() != 0;
        }
        if (this.EvU.getSelectedIndex() == 2) {
            this.EvO.ezR.bZR = true;
        } else {
            this.EvO.ezR.bZR = false;
            this.EvO.ezR.Pp = this.EvU.getSelectedIndex() != 0;
        }
        if (this.EvV.getSelectedIndex() == 2) {
            this.EvO.ezS.bZR = true;
        } else {
            this.EvO.ezS.bZR = false;
            this.EvO.ezS.Pp = this.EvV.getSelectedIndex() != 0;
        }
        if (this.EvW.getSelectedIndex() == 2) {
            this.EvO.ezT.bZR = true;
        } else {
            this.EvO.ezT.bZR = false;
            this.EvO.ezT.Pp = this.EvW.getSelectedIndex() != 0;
        }
        if (this.EvX.getSelectedIndex() == 2) {
            this.EvO.ezU.bZR = true;
        } else {
            this.EvO.ezU.bZR = false;
            this.EvO.ezU.Pp = this.EvX.getSelectedIndex() != 0;
        }
        if (this.EvY.getSelectedIndex() == 2) {
            this.EvO.ezV.bZR = true;
        } else {
            this.EvO.ezV.bZR = false;
            this.EvO.ezV.Pp = this.EvY.getSelectedIndex() != 0;
        }
    }

    @Override
    public Element c(Element element, Document document) {
        Element element2;
        super.c(element, document);
        if (!this.EvO.ezV.bZR) {
            element2 = document.createElement("BelongInSameClan");
            element2.setAttribute("Value", this.EvO.ezV.Pp ? "true" : "false");
            element.appendChild(element2);
        }
        if (!this.EvO.ezS.bZR) {
            element2 = document.createElement("BelongToEnemyClan");
            element2.setAttribute("Value", this.EvO.ezS.Pp ? "true" : "false");
            element.appendChild(element2);
        }
        if (!this.EvO.ezQ.bZR) {
            element2 = document.createElement("IsEventSource");
            element2.setAttribute("Value", this.EvO.ezQ.Pp ? "true" : "false");
            element.appendChild(element2);
        }
        if (!this.EvO.ezR.bZR) {
            element2 = document.createElement("Received");
            element2.setAttribute("Value", this.EvO.ezR.Pp ? "true" : "false");
            element.appendChild(element2);
        }
        if (!this.EvO.ezT.bZR) {
            element2 = document.createElement("ThereIsActiveChallenge");
            element2.setAttribute("Value", this.EvO.ezT.Pp ? "true" : "false");
            element.appendChild(element2);
        }
        if (!this.EvO.ezU.bZR) {
            element2 = document.createElement("StructureInChallengedCity");
            element2.setAttribute("Value", this.EvO.ezU.Pp ? "true" : "false");
            element.appendChild(element2);
        }
        if (!this.EvP.getText().trim().equals("")) {
            element2 = document.createElement("WeaponName");
            element2.setAttribute("Value", this.EvP.getText());
            element.appendChild(element2);
        }
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
        if (this.Ewf.getSelectedIndex() != 0) {
            element2 = document.createElement("ResourceRank");
            element2.setAttribute("Value", this.Ewf.getSelectedItem().toString());
            element.appendChild(element2);
        }
        return element;
    }

    @Override
    public /* synthetic */ JPanel eNX() {
        return this.eOc();
    }

    static /* synthetic */ msj a(msw msw2, msj msj2) {
        msw2.Evf = msj2;
        return msw2.Evf;
    }

    static /* synthetic */ JTextField a(msw msw2) {
        return msw2.EvP;
    }

    static /* synthetic */ msj b(msw msw2) {
        return msw2.Evf;
    }

    static /* synthetic */ JTextField c(msw msw2) {
        return msw2.Evc;
    }

    static /* synthetic */ JTextField d(msw msw2) {
        return msw2.EvK;
    }
}

