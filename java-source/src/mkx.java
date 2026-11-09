/*
 * Decompiled with CFR.
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public abstract class mkx
extends JInternalFrame {
    protected Dimension DFY = new Dimension(250, 200);
    protected JPanel DFZ = new JPanel();
    protected JPanel DGa = new JPanel();
    protected JPanel DGb = new JPanel();
    protected BorderLayout DGc = new BorderLayout();
    protected BorderLayout DGd = new BorderLayout();
    protected BorderLayout DGe = new BorderLayout();
    protected FlowLayout DDV = new FlowLayout();
    protected JButton DEt = new JButton();
    protected JButton qtg = new JButton();
    protected JButton DGf = new JButton();
    private boolean DGg = true;

    public mkx(boolean bl) {
        this.DGg = bl;
        this.r();
    }

    public mkx() {
        this.r();
    }

    private void r() {
        this.setTitle("SFPlainDialog");
        this.setClosable(false);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setMaximizable(true);
        this.setDefaultCloseOperation(2);
        this.setMinimumSize(this.DFY);
        this.getContentPane().setLayout(this.DGc);
        this.DFZ.setLayout(this.DGd);
        this.DGb.setLayout(this.DDV);
        this.DDV.setAlignment(0);
        this.DGa.setLayout(this.DGe);
        this.getContentPane().add((Component)this.DFZ, "Center");
        this.DFZ.add((Component)this.DGb, "South");
        if (this.DGg) {
            this.DEt.setToolTipText("Close dialog and apply changes");
            this.DEt.setText("OK");
            this.DEt.addActionListener(new ActionListener(this){
                final /* synthetic */ mkx DGh;
                {
                    this.DGh = mkx2;
                }

                public void actionPerformed(ActionEvent actionEvent) {
                    this.DGh.z(actionEvent);
                }
            });
            this.qtg.setToolTipText("Discard changes since last apply");
            this.qtg.setText("Cancel");
            this.qtg.addActionListener(new ActionListener(this){
                final /* synthetic */ mkx DGh;
                {
                    this.DGh = mkx2;
                }

                public void actionPerformed(ActionEvent actionEvent) {
                    this.DGh.A(actionEvent);
                }
            });
            this.DGf.setToolTipText("Apply changes");
            this.DGf.setText("Apply");
            this.DGf.addActionListener(new ActionListener(this){
                final /* synthetic */ mkx DGh;
                {
                    this.DGh = mkx2;
                }

                public void actionPerformed(ActionEvent actionEvent) {
                    this.DGh.E(actionEvent);
                }
            });
            this.DGb.add((Component)this.DEt, null);
            this.DGb.add((Component)this.qtg, null);
            this.DGb.add((Component)this.DGf, null);
        }
        this.DFZ.add((Component)this.DGa, "Center");
        this.pack();
    }

    public boolean eDC() {
        return this.DGg;
    }

    public void setControlButtonsAreShown(boolean bl) {
        this.DGg = bl;
    }

    protected void z(ActionEvent actionEvent) {
        this.eDD();
        this.dispose();
    }

    protected void E(ActionEvent actionEvent) {
        this.eDD();
    }

    protected void A(ActionEvent actionEvent) {
        this.dispose();
    }

    protected void eDD() {
        lfn.b(5, "SFPlainDialog", "ApplyChanges() : Applying no changes here!");
    }
}

