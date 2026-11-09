/*
 * Decompiled with CFR.
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mjz {
    lfn ga = lfn.eqw();
    mkt DEr = null;
    mkt DEs = null;
    JButton DEt = null;
    JButton qtg = null;
    lej DEu = null;
    JDialog DEv = null;

    private void c() {
    }

    public lej a(Frame frame, String string, String string2, String string3, String string4) {
        if (this.DEu == null) {
            this.DEu = new lej(0, 0);
        }
        this.DEv = new JDialog(frame);
        this.DEv.setTitle(string);
        this.DEv.setModal(true);
        this.DEv.getContentPane().setLayout(new BorderLayout());
        JPanel jPanel = new JPanel(new FlowLayout());
        this.DEv.getContentPane().add((Component)jPanel, "North");
        jPanel.add(new JLabel(string2));
        JPanel jPanel2 = new JPanel(new FlowLayout());
        this.DEv.getContentPane().add((Component)jPanel2, "Center");
        this.DEr = new mkt(string3, Integer.toString(this.DEu.getX()));
        jPanel2.add(this.DEr);
        this.DEs = new mkt(string4, Integer.toString(this.DEu.getY()));
        jPanel2.add(this.DEs);
        JPanel jPanel3 = new JPanel(new FlowLayout());
        this.DEv.getContentPane().add((Component)jPanel3, "South");
        this.DEt = new JButton("OK");
        this.DEt.addActionListener(new ActionListener(this){
            final /* synthetic */ mjz DEw;
            {
                this.DEw = mjz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.DEw.z(actionEvent);
            }
        });
        jPanel3.add(this.DEt);
        this.qtg = new JButton("Cancel");
        this.qtg.addActionListener(new ActionListener(this){
            final /* synthetic */ mjz DEw;
            {
                this.DEw = mjz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.DEw.A(actionEvent);
            }
        });
        jPanel3.add(this.qtg);
        this.DEv.setSize(new Dimension(250, 200));
        this.DEv.setVisible(true);
        return this.DEu;
    }

    public void i(lej lej2) {
        this.DEu = lej2;
        if (this.DEr != null && this.DEs != null) {
            this.DEr.Cf(Integer.toString(lej2.getX()));
            this.DEs.Cf(Integer.toString(lej2.getY()));
        }
    }

    protected void z(ActionEvent actionEvent) {
        try {
            int n = Integer.parseInt(this.DEr.eCU());
            int n2 = Integer.parseInt(this.DEs.eCU());
            this.DEu = new lej(n, n2);
            this.DEv.dispose();
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, this.getClass().getName(), "Wrong number format!");
        }
    }

    protected void A(ActionEvent actionEvent) {
        this.DEu = null;
        this.DEv.dispose();
    }
}

