/*
 * Decompiled with CFR.
 */
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class mks
extends JPanel {
    lfn ga = lfn.eqw();
    private boolean DDT = false;
    private lek DEy = null;
    private mkx DFB = null;
    private mkt DFK = null;
    private mkt DFL = null;
    private mkt DFM = null;

    public mks(mkx mkx2, String string, lek lek2) {
        this.DFB = mkx2;
        this.DEy = lek2;
        this.setLayout(new FlowLayout());
        this.setBorder(new EtchedBorder());
        JLabel jLabel = new JLabel(string);
        this.add(jLabel);
        this.DFK = new mkt("X", Integer.toString(this.DEy.getX()));
        this.add(this.DFK);
        this.DFL = new mkt("Y", Integer.toString(this.DEy.getY()));
        this.add(this.DFL);
        this.DFM = new mkt("Z", Integer.toString(this.DEy.eqe()));
        this.add(this.DFM);
    }

    public lek eDu() {
        int n = 0;
        try {
            n = Integer.parseInt(this.DFK.eCU());
        }
        catch (Exception exception) {
            System.out.println("The XLnT string is not Integer compatible!");
        }
        this.DEy.cf = n;
        try {
            n = Integer.parseInt(this.DFL.eCU());
        }
        catch (Exception exception) {
            System.out.println("The YLnT string is not Integer compatible!");
        }
        this.DEy.cg = n;
        try {
            n = Integer.parseInt(this.DFM.eCU());
        }
        catch (Exception exception) {
            System.out.println("The ZLnT string is not Integer compatible!");
        }
        this.DEy.riS = n;
        return this.DEy;
    }

    public boolean hasChanged() {
        if (this.DFK.hasChanged() || this.DFL.hasChanged() || this.DFM.hasChanged()) {
            this.DDT = true;
        }
        boolean bl = this.DDT;
        this.DDT = false;
        return bl;
    }
}

