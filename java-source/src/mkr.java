/*
 * Decompiled with CFR.
 */
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mkr
extends JPanel {
    lfn ga = lfn.eqw();
    private boolean DDT = false;
    private lej DEu = null;
    private String DFI = "X";
    private String DFJ = "X";
    private String Title = "Integer2 panel";
    private mkt DFK = null;
    private mkt DFL = null;

    public mkr() {
        this("no title", new lej(0, 0));
    }

    public mkr(String string, lej lej2) {
        this.DEu = lej2;
        this.Title = string;
        this.eDs();
    }

    public mkr(String string, lej lej2, String string2, String string3) {
        this.DEu = lej2;
        this.Title = string;
        this.DFI = string2;
        this.DFJ = string3;
        this.eDs();
    }

    private void eDs() {
        assert (this.DEu != null) : "Cannot initialize with null Integer2!";
        this.setLayout(new FlowLayout());
        JLabel jLabel = new JLabel(this.Title);
        this.add(jLabel);
        this.DFK = new mkt(this.DFI, Integer.toString(this.DEu.getX()));
        this.add(this.DFK);
        this.DFL = new mkt(this.DFJ, Integer.toString(this.DEu.getY()));
        this.add(this.DFL);
    }

    public lej eDt() {
        int n = 0;
        try {
            n = Integer.parseInt(this.DFK.eCU());
        }
        catch (Exception exception) {
            System.out.println("The XLnT string is not Integer compatible!");
        }
        this.DEu.RH(n);
        try {
            n = Integer.parseInt(this.DFL.eCU());
        }
        catch (Exception exception) {
            System.out.println("The YLnT string is not Integer compatible!");
        }
        this.DEu.RI(n);
        return this.DEu;
    }

    public void j(lej lej2) {
        this.DEu = lej2;
        this.DFK.Cf(Integer.toString(this.DEu.getX()));
        this.DFL.Cf(Integer.toString(this.DEu.getY()));
    }

    public boolean hasChanged() {
        if (this.DFK.hasChanged() || this.DFL.hasChanged()) {
            this.DDT = true;
        }
        boolean bl = this.DDT;
        this.DDT = false;
        return bl;
    }
}

