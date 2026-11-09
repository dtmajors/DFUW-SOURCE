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

public class mta
extends mss
implements msk {
    private chm EwT;
    private JTextField Evc;
    private JLabel Evd;
    private JButton Eve;
    private JTextField EwU;
    private JLabel EwV;
    private JButton EwW;
    private msj Evf;
    private JPanel Evg = new JPanel(new FlowLayout(0));
    private JPanel EwX = new JPanel(new FlowLayout(0));

    public mta(msf msf2) {
        super(msf2);
        this.EwT = (chm)msf2.eNq().eyU;
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
        this.EwV = new JLabel();
        this.EwU = new JTextField(24);
        this.EwW = new JButton();
        this.EwV.setText("NodeResource Name");
        this.EwU.setText("");
        this.EwW.setText("Change NodeResource");
        this.EwV.setPreferredSize(this.Eqd);
        this.EwX.add(this.EwV);
        this.EwX.add(this.EwU);
        this.EwX.add(this.EwW);
        this.add(this.Evg);
        this.add(this.EwX);
        this.eOd();
        this.eOg();
    }

    @Override
    public mss eOc() {
        return this;
    }

    @Override
    public void eOd() {
        if (this.EwT.ResourceType != -1) {
            this.Evc.setText(lea.enW().getName(this.EwT.ResourceType));
        } else {
            this.Evc.setText("");
        }
        if (this.EwT.eAc != -1) {
            this.EwU.setText(lea.enW().getName(this.EwT.eAc));
        } else {
            this.EwU.setText("");
        }
    }

    public void eOg() {
        this.Eve.addActionListener(new ActionListener(this){
            final /* synthetic */ mta EwY;
            {
                this.EwY = mta2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mta.a(this.EwY, new msj(mta.a(this.EwY)));
                mta.b(this.EwY).e(mta.a(this.EwY));
            }
        });
        this.EwW.addActionListener(new ActionListener(this){
            final /* synthetic */ mta EwY;
            {
                this.EwY = mta2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mta.a(this.EwY, new msj(mta.c(this.EwY)));
                mta.b(this.EwY).e(mta.c(this.EwY));
            }
        });
    }

    @Override
    public boolean eNC() {
        return super.eNC() || !(this.EwT.ResourceType == -1 ? this.Evc.getText().trim().equals("") : this.Evc.getText().equals(lea.enW().getName(this.EwT.ResourceType))) || !(this.EwT.eAc == -1 ? this.EwU.getText().trim().equals("") : this.EwU.getText().equals(lea.enW().getName(this.EwT.eAc)));
    }

    @Override
    public void save() {
        super.save();
        this.EwT.ResourceType = lea.enW().getType(this.Evc.getText());
        this.EwT.eAc = lea.enW().getType(this.EwU.getText());
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
        if (!this.EwU.getText().trim().equals("")) {
            element2 = document.createElement("NodeResourceName");
            element2.setAttribute("Value", this.EwU.getText());
            element.appendChild(element2);
        }
        return element;
    }

    @Override
    public /* synthetic */ JPanel eNX() {
        return this.eOc();
    }

    static /* synthetic */ msj a(mta mta2, msj msj2) {
        mta2.Evf = msj2;
        return mta2.Evf;
    }

    static /* synthetic */ JTextField a(mta mta2) {
        return mta2.Evc;
    }

    static /* synthetic */ msj b(mta mta2) {
        return mta2.Evf;
    }

    static /* synthetic */ JTextField c(mta mta2) {
        return mta2.EwU;
    }
}

