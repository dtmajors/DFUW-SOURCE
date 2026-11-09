/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 */
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class mkd
extends JPanel {
    lfn ga = lfn.eqw();
    jrw DEB = null;
    private aux DEC = null;
    private String DEE = null;

    public mkd(String string) {
        mkb mkb2 = new mkb(string, false);
        mkb2.setControlButtonsAreShown(false);
        this.setLayout(new BorderLayout());
        this.add(mkb2);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    public String eDa() {
        return this.DEE;
    }

    public void Ci(String string) {
        this.DEE = string;
    }
}

