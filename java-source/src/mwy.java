/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  mrr
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.plaf.InternalFrameUI;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class mwy
extends JDialog {
    private mrr Edv;

    public mwy(Frame frame, boolean bl) {
        super(frame, bl);
    }

    public void a(aux aux2, boolean[] blArray) {
        this.Edv = new mrr(aux2);
        InternalFrameUI internalFrameUI = this.Edv.getUI();
        ((BasicInternalFrameUI)internalFrameUI).setNorthPane(null);
        this.Edv.p(aux2);
        this.Edv.p(blArray);
        this.add((Component)this.Edv);
        this.setSize(new Dimension((int)this.Edv.getSize().getWidth(), (int)this.Edv.getSize().getHeight()));
        this.setTitle("Select a Tile,then select a marker and close the window from x");
        this.setResizable(false);
    }

    public void Ap(boolean bl) {
        this.Edv.setVisible(bl);
        this.Edv.setClosable(false);
        this.Edv.setMaximizable(false);
        this.setVisible(bl);
    }

    public lfs<String, ljq> eSD() {
        duc duc2 = this.Edv.eLR();
        return new lfs<String, ljq>(duc2.Caption, duc2.av());
    }
}

