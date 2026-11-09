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

public class mtk
extends mss
implements msk {
    private chx ExP;
    private JTextField Evc;
    private JLabel Evd;
    private JButton Eve;
    private msj Evf;
    private JCheckBox ExQ = new JCheckBox();
    private JCheckBox ExR = new JCheckBox();
    private JLabel ExS = new JLabel("Deposit");
    private JLabel ExT = new JLabel("Unique");
    private JPanel Evg = new JPanel(new FlowLayout(0));
    private JPanel EuK = new JPanel(new GridLayout(2, 3));
    private JPanel ExU = new JPanel(new FlowLayout(0));
    private JPanel ExV = new JPanel(new FlowLayout(0));
    private JLabel ExW;
    private JTextField ExX;
    private JButton ExY;
    private JPanel ExZ = new JPanel(new FlowLayout(0));

    public mtk(msf msf2) {
        super(msf2);
        this.ExP = (chx)msf2.eNq().eyU;
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
        this.ExW = new JLabel();
        this.ExX = new JTextField(24);
        this.ExY = new JButton();
        this.ExW.setText("ContainerTargetResource Name");
        this.ExX.setText("");
        this.ExY.setText("Change ContainerTargetResource");
        this.ExW.setPreferredSize(this.Eqd);
        this.ExZ.add(this.ExW);
        this.ExZ.add(this.ExX);
        this.ExZ.add(this.ExY);
        this.add(this.ExZ);
        this.ExS.setPreferredSize(this.Eqd);
        this.ExU.add(this.ExS);
        this.ExU.add(this.ExQ);
        this.ExT.setPreferredSize(this.Eqd);
        this.ExV.add(this.ExT);
        this.ExV.add(this.ExR);
        this.EuK.add(this.ExU);
        this.EuK.add(this.ExV);
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
        if (this.ExP.ResourceType != -1) {
            this.Evc.setText(lea.enW().getName(this.ExP.ResourceType));
        } else {
            this.Evc.setText("");
        }
        if (this.ExP.eAk != -1) {
            this.ExX.setText(lea.enW().getName(this.ExP.eAk));
        } else {
            this.ExX.setText("");
        }
        this.ExQ.setSelected(this.ExP.eAj);
        this.ExR.setSelected(this.ExP.eyI);
    }

    public void eOg() {
        this.Eve.addActionListener(new ActionListener(this){
            final /* synthetic */ mtk Eya;
            {
                this.Eya = mtk2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtk.a(this.Eya, new msj(mtk.a(this.Eya)));
                mtk.b(this.Eya).e(mtk.a(this.Eya));
            }
        });
        this.ExY.addActionListener(new ActionListener(this){
            final /* synthetic */ mtk Eya;
            {
                this.Eya = mtk2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtk.a(this.Eya, new msj(mtk.c(this.Eya)));
                mtk.b(this.Eya).e(mtk.c(this.Eya));
            }
        });
    }

    @Override
    public boolean eNC() {
        return !(!super.eNC() && (this.ExP.ResourceType == -1 ? this.Evc.getText().trim().equals("") : this.Evc.getText().equals(lea.enW().getName(this.ExP.ResourceType))) && (this.ExP.eAk == -1 ? this.ExX.getText().trim().equals("") : this.ExX.getText().equals(lea.enW().getName(this.ExP.eAk))) && (this.ExP.eAj ? this.ExQ.isSelected() : !this.ExQ.isSelected()) && (!this.ExP.eyI ? !this.ExR.isSelected() : this.ExR.isSelected()));
    }

    @Override
    public void save() {
        super.save();
        this.ExP.ResourceType = lea.enW().getType(this.Evc.getText());
        this.ExP.eAk = lea.enW().getType(this.ExX.getText());
        this.ExP.eAj = this.ExQ.isSelected();
        this.ExP.eyI = this.ExR.isSelected();
    }

    @Override
    public Element c(Element element, Document document) {
        super.c(element, document);
        Element element2 = document.createElement("Deposit");
        element2.setAttribute("Value", this.ExP.eAj ? "true" : "false");
        element.appendChild(element2);
        element2 = document.createElement("Unique");
        element2.setAttribute("Value", this.ExP.eyI ? "true" : "false");
        element.appendChild(element2);
        if (!this.Evc.getText().trim().equals("")) {
            element2 = document.createElement("ResourceName");
            element2.setAttribute("Value", this.Evc.getText());
            element.appendChild(element2);
        }
        if (!this.ExX.getText().trim().equals("")) {
            element2 = document.createElement("ContainerResourceName");
            element2.setAttribute("Value", this.ExX.getText());
            element.appendChild(element2);
        }
        return element;
    }

    @Override
    public /* synthetic */ JPanel eNX() {
        return this.eOc();
    }

    static /* synthetic */ msj a(mtk mtk2, msj msj2) {
        mtk2.Evf = msj2;
        return mtk2.Evf;
    }

    static /* synthetic */ JTextField a(mtk mtk2) {
        return mtk2.Evc;
    }

    static /* synthetic */ msj b(mtk mtk2) {
        return mtk2.Evf;
    }

    static /* synthetic */ JTextField c(mtk mtk2) {
        return mtk2.ExX;
    }
}

