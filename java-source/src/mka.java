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

public class mka {
    lfn ga = lfn.eqw();
    mkt DEr = null;
    mkt DEs = null;
    mkt DEx = null;
    JButton DEt = null;
    JButton qtg = null;
    lek DEy = null;
    JDialog DEv = null;

    private void c() {
    }

    public lek a(Frame frame, String string, String string2) {
        if (this.DEy == null) {
            this.DEy = new lek(3, 3, 3);
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
        this.DEr = new mkt("X", Integer.toString(this.DEy.cf));
        jPanel2.add(this.DEr);
        this.DEs = new mkt("Y", Integer.toString(this.DEy.cg));
        jPanel2.add(this.DEs);
        this.DEx = new mkt("Z", Integer.toString(this.DEy.riS));
        jPanel2.add(this.DEx);
        JPanel jPanel3 = new JPanel(new FlowLayout());
        this.DEv.getContentPane().add((Component)jPanel3, "South");
        this.DEt = new JButton("OK");
        this.DEt.addActionListener(new ActionListener(this){
            final /* synthetic */ mka DEz;
            {
                this.DEz = mka2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.DEz.z(actionEvent);
            }
        });
        jPanel3.add(this.DEt);
        this.qtg = new JButton("Cancel");
        this.qtg.addActionListener(new ActionListener(this){
            final /* synthetic */ mka DEz;
            {
                this.DEz = mka2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.DEz.A(actionEvent);
            }
        });
        jPanel3.add(this.qtg);
        this.DEv.setSize(new Dimension(250, 200));
        this.DEv.setVisible(true);
        return this.DEy;
    }

    public void m(lek lek2) {
        this.DEy = lek2;
        if (this.DEr != null && this.DEs != null && this.DEx != null) {
            this.DEr.Cf(Integer.toString(lek2.cf));
            this.DEs.Cf(Integer.toString(lek2.cg));
            this.DEx.Cf(Integer.toString(lek2.riS));
        }
    }

    protected void z(ActionEvent actionEvent) {
        try {
            int n = Integer.parseInt(this.DEr.eCU());
            int n2 = Integer.parseInt(this.DEs.eCU());
            int n3 = Integer.parseInt(this.DEx.eCU());
            this.DEy = new lek(n, n2, n3);
            this.DEv.dispose();
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, this.getClass().getName(), "Wrong number format!");
        }
    }

    protected void A(ActionEvent actionEvent) {
        this.DEv.dispose();
    }
}

