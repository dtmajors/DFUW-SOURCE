/*
 * Decompiled with CFR.
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class mth
extends mss
implements msk {
    private chu ExG;
    private JTextField Evc;
    private JLabel Evd;
    private JButton Eve;
    private JTextField ExH;
    private JLabel ExI;
    private JButton ExJ;
    private msj Evf;
    private JPanel Evg = new JPanel(new FlowLayout(0));
    private JPanel ExK = new JPanel(new FlowLayout(0));

    public mth(msf msf2) {
        super(msf2);
        this.ExG = (chu)msf2.eNq().eyU;
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
        this.ExI = new JLabel();
        this.ExH = new JTextField(24);
        this.ExJ = new JButton();
        this.ExI.setText("MonsterResource Name");
        this.ExH.setText("");
        this.ExJ.setText("Change MonsterResource");
        this.ExI.setPreferredSize(this.Eqd);
        this.ExK.add(this.ExI);
        this.ExK.add(this.ExH);
        this.ExK.add(this.ExJ);
        this.add(this.Evg);
        this.add(this.ExK);
        this.eOd();
        this.eOg();
    }

    @Override
    public mss eOc() {
        return this;
    }

    @Override
    public void eOd() {
        if (this.ExG.ResourceType != -1) {
            this.Evc.setText(lea.enW().getName(this.ExG.ResourceType));
        } else {
            this.Evc.setText("");
        }
        if (this.ExG.bBh != -1) {
            this.ExH.setText(lea.enW().getName(this.ExG.bBh));
        } else {
            this.ExH.setText("");
        }
    }

    public void eOg() {
        this.Eve.addActionListener(new ActionListener(this){
            final /* synthetic */ mth ExL;
            {
                this.ExL = mth2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mth.a(this.ExL, new msj(mth.a(this.ExL)));
                mth.b(this.ExL).e(mth.a(this.ExL));
            }
        });
        this.ExJ.addActionListener(new ActionListener(this){
            final /* synthetic */ mth ExL;
            {
                this.ExL = mth2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mth.a(this.ExL, new msj(mth.c(this.ExL)));
                mth.b(this.ExL).e(mth.c(this.ExL));
            }
        });
    }

    @Override
    public boolean eNC() {
        return super.eNC() || !(this.ExG.ResourceType == -1 ? this.Evc.getText().trim().equals("") : this.Evc.getText().equals(lea.enW().getName(this.ExG.ResourceType))) || !(this.ExG.bBh == -1 ? this.ExH.getText().trim().equals("") : this.ExH.getText().equals(lea.enW().getName(this.ExG.bBh)));
    }

    @Override
    public void save() {
        super.save();
        this.ExG.ResourceType = lea.enW().getType(this.Evc.getText());
        this.ExG.bBh = lea.enW().getType(this.ExH.getText());
    }

    @Override
    public Element c(Element element, Document document) {
        Element element2;
        super.c(element, document);
        if (!this.Evc.getText().trim().equals("")) {
            element2 = document.createElement("ResourceName");
            element2.setAttribute("Value", this.Evc.getText());
            element.appendChild(element2);
        }
        if (!this.ExH.getText().trim().equals("")) {
            element2 = document.createElement("NodeResourceName");
            element2.setAttribute("Value", this.ExH.getText());
            element.appendChild(element2);
        }
        return element;
    }

    @Override
    public /* synthetic */ JPanel eNX() {
        return this.eOc();
    }

    static /* synthetic */ msj a(mth mth2, msj msj2) {
        mth2.Evf = msj2;
        return mth2.Evf;
    }

    static /* synthetic */ JTextField a(mth mth2) {
        return mth2.Evc;
    }

    static /* synthetic */ msj b(mth mth2) {
        return mth2.Evf;
    }

    static /* synthetic */ JTextField c(mth mth2) {
        return mth2.ExH;
    }
}

