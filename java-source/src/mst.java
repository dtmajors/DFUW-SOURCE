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

public class mst
extends mss
implements msk {
    private chf Evb;
    private JTextField Evc;
    private JLabel Evd;
    private JButton Eve;
    private msj Evf;
    private JPanel Evg = new JPanel(new FlowLayout(0));

    public mst(msf msf2) {
        super(msf2);
        this.Evb = (chf)msf2.eNq().eyU;
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
        this.eOd();
        this.eOg();
    }

    @Override
    public mss eOc() {
        return this;
    }

    @Override
    public void eOd() {
        if (this.Evb.ResourceType != -1) {
            this.Evc.setText(lea.enW().getName(this.Evb.ResourceType));
        } else {
            this.Evc.setText("");
        }
    }

    public void eOg() {
        this.Eve.addActionListener(new ActionListener(this){
            final /* synthetic */ mst Evh;
            {
                this.Evh = mst2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mst.a(this.Evh, new msj(mst.a(this.Evh)));
                mst.b(this.Evh).e(mst.a(this.Evh));
            }
        });
    }

    @Override
    public boolean eNC() {
        return super.eNC() || !(this.Evb.ResourceType == -1 ? this.Evc.getText().trim().equals("") : this.Evc.getText().equals(lea.enW().getName(this.Evb.ResourceType)));
    }

    @Override
    public void save() {
        super.save();
        this.Evb.ResourceType = lea.enW().getType(this.Evc.getText());
    }

    @Override
    public Element c(Element element, Document document) {
        super.c(element, document);
        if (!this.Evc.getText().trim().equals("")) {
            Element element2 = document.createElement("ResourceName");
            element2.setAttribute("Value", this.Evc.getText());
            element.appendChild(element2);
        }
        return element;
    }

    @Override
    public /* synthetic */ JPanel eNX() {
        return this.eOc();
    }

    static /* synthetic */ msj a(mst mst2, msj msj2) {
        mst2.Evf = msj2;
        return mst2.Evf;
    }

    static /* synthetic */ JTextField a(mst mst2) {
        return mst2.Evc;
    }

    static /* synthetic */ msj b(mst mst2) {
        return mst2.Evf;
    }
}

