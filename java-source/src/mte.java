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

public class mte
extends mss
implements msk {
    private chr Exr;
    private JTextField Evc;
    private JLabel Evd;
    private JButton Eve;
    private msj Evf;
    private JPanel Evg = new JPanel(new FlowLayout(0));

    public mte(msf msf2) {
        super(msf2);
        this.Exr = (chr)msf2.eNq().eyU;
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
        if (this.Exr.ResourceType != -1) {
            this.Evc.setText(lea.enW().getName(this.Exr.ResourceType));
        } else {
            this.Evc.setText("");
        }
    }

    public void eOg() {
        this.Eve.addActionListener(new ActionListener(this){
            final /* synthetic */ mte Exs;
            {
                this.Exs = mte2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mte.a(this.Exs, new msj(mte.a(this.Exs)));
                mte.b(this.Exs).e(mte.a(this.Exs));
            }
        });
    }

    @Override
    public boolean eNC() {
        return super.eNC() || !(this.Exr.ResourceType == -1 ? this.Evc.getText().trim().equals("") : this.Evc.getText().equals(lea.enW().getName(this.Exr.ResourceType)));
    }

    @Override
    public void save() {
        super.save();
        this.Exr.ResourceType = lea.enW().getType(this.Evc.getText());
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

    static /* synthetic */ msj a(mte mte2, msj msj2) {
        mte2.Evf = msj2;
        return mte2.Evf;
    }

    static /* synthetic */ JTextField a(mte mte2) {
        return mte2.Evc;
    }

    static /* synthetic */ msj b(mte mte2) {
        return mte2.Evf;
    }
}

