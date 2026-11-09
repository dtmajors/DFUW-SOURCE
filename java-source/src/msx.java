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

public class msx
extends mss
implements msk {
    private chj Ewr;
    private JTextField Ews;
    private JLabel Ewt;
    private JButton Ewu;
    private msj Evf;
    private JCheckBox Ewv = new JCheckBox();
    private JLabel Eww = new JLabel("Dungeon");
    private JPanel Ewx = new JPanel(new FlowLayout(0));
    private JPanel EuK = new JPanel(new GridLayout(2, 3));
    private JPanel Ewy = new JPanel(new FlowLayout(0));

    public msx(msf msf2) {
        super(msf2);
        this.Ewr = (chj)msf2.eNq().eyU;
        this.Evf = new msj();
        this.Ewt = new JLabel();
        this.Ews = new JTextField(24);
        this.Ewu = new JButton();
        this.Ewt.setText("Area Name");
        this.Ews.setText("");
        this.Ewu.setText("Change Area");
        this.Ewt.setPreferredSize(this.Eqd);
        this.Ewx.add(this.Ewt);
        this.Ewx.add(this.Ews);
        this.Ewx.add(this.Ewu);
        this.add(this.Ewx);
        this.Eww.setPreferredSize(this.Eqd);
        this.Ewy.add(this.Eww);
        this.Ewy.add(this.Ewv);
        this.EuK.add(this.Ewy);
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
        if (this.Ewr.ezY != null) {
            this.Ews.setText(this.Ewr.ezY);
        } else {
            this.Ews.setText("");
        }
        this.Ewv.setSelected(this.Ewr.abr);
    }

    public void eOg() {
        this.Ewu.addActionListener(new ActionListener(this){
            final /* synthetic */ msx Ewz;
            {
                this.Ewz = msx2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msx.a(this.Ewz, new msj(msx.a(this.Ewz)));
                msx.b(this.Ewz).h(msx.a(this.Ewz));
            }
        });
    }

    @Override
    public boolean eNC() {
        return super.eNC() || !(this.Ewr.ezY == null ? this.Ews.getText().trim().equals("") : this.Ews.getText().equals(this.Ewr.ezY)) || !(!this.Ewr.abr ? !this.Ewv.isSelected() : this.Ewv.isSelected());
    }

    @Override
    public void save() {
        super.save();
        this.Ewr.ezY = this.Ews.getText();
        this.Ewr.abr = this.Ewv.isSelected();
    }

    @Override
    public Element c(Element element, Document document) {
        super.c(element, document);
        Element element2 = document.createElement("Dungeon");
        element2.setAttribute("Value", this.Ewr.abr ? "true" : "false");
        element.appendChild(element2);
        if (!this.Ews.getText().trim().equals("")) {
            element2 = document.createElement("Area");
            element2.setAttribute("Value", this.Ews.getText());
            element.appendChild(element2);
        }
        return element;
    }

    @Override
    public /* synthetic */ JPanel eNX() {
        return this.eOc();
    }

    static /* synthetic */ msj a(msx msx2, msj msj2) {
        msx2.Evf = msj2;
        return msx2.Evf;
    }

    static /* synthetic */ JTextField a(msx msx2) {
        return msx2.Ews;
    }

    static /* synthetic */ msj b(msx msx2) {
        return msx2.Evf;
    }
}

