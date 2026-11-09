/*
 * Decompiled with CFR.
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class mtf
extends mss
implements msk {
    private JTextField EvK;
    private JLabel EvJ;
    private JButton EvL;
    private JPanel EvM = new JPanel(new FlowLayout(0));
    private msj Evf;
    private JSpinner Ext;
    private JLabel Exu = new JLabel("Skill Level");
    private JPanel Exv = new JPanel(new FlowLayout(0));
    chs Exw;

    public mtf(msf msf2) {
        super(msf2);
        this.Exw = (chs)msf2.eNq().eyU;
        this.Ext = new JSpinner();
        this.Exu.setPreferredSize(this.Eqd);
        this.Exv.add(this.Exu);
        this.Exv.add(this.Ext);
        this.add(this.Exv);
        this.Evf = new msj();
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
        this.eOd();
        this.eOg();
    }

    private void eOg() {
        this.EvL.addActionListener(new ActionListener(this){
            final /* synthetic */ mtf Exx;
            {
                this.Exx = mtf2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtf.a(this.Exx, new msj(mtf.a(this.Exx)));
                mtf.b(this.Exx).f(mtf.a(this.Exx));
            }
        });
    }

    @Override
    public mss eOc() {
        return this;
    }

    @Override
    public void eOd() {
        this.Ext.setValue(Float.valueOf(this.Exw.SkillLevel));
    }

    @Override
    public boolean eNC() {
        return super.eNC() || !(this.Exw.SkillType == -1 ? this.EvK.getText().trim().equals("") : this.EvK.getText().equals(lea.enZ().getName(this.Exw.SkillType))) || this.Exw.SkillLevel != Float.parseFloat(this.Ext.getValue().toString());
    }

    @Override
    public void save() {
        super.save();
        this.Exw.SkillType = lea.enZ().getType(this.EvK.getText());
        this.Exw.SkillLevel = Float.parseFloat(this.Ext.getValue().toString());
    }

    @Override
    public Element c(Element element, Document document) {
        Element element2;
        super.c(element, document);
        if (!this.EvK.getText().trim().equals("")) {
            element2 = document.createElement("SkillName");
            element2.setAttribute("Value", this.EvK.getText());
            element.appendChild(element2);
        }
        element2 = document.createElement("Level");
        element2.setAttribute("Value", Float.toString(this.Exw.SkillLevel));
        element.appendChild(element2);
        return element;
    }

    @Override
    public /* synthetic */ JPanel eNX() {
        return this.eOc();
    }

    static /* synthetic */ msj a(mtf mtf2, msj msj2) {
        mtf2.Evf = msj2;
        return mtf2.Evf;
    }

    static /* synthetic */ JTextField a(mtf mtf2) {
        return mtf2.EvK;
    }

    static /* synthetic */ msj b(mtf mtf2) {
        return mtf2.Evf;
    }
}

