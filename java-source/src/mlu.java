/*
 * Decompiled with CFR.
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;

public class mlu
extends mkx {
    private mkt DKS = new mkt("Delta Time Per Unit", "0");
    private mkn DKT = new mkn("Set Name", "n/a");
    private mjr DKU;
    private lkd DKV;
    private Dimension DKW = new Dimension(350, 200);

    public mlu(lkd lkd2) {
        super(true);
        this.DKV = lkd2;
        this.r();
        this.pack();
    }

    private void r() {
        JPanel jPanel = new JPanel(new FlowLayout(0));
        this.DKT.Cf(this.DKV.dZF());
        jPanel.add(this.DKT);
        this.DKU = new mjr("Distance Timer Type", (Object[])lkd.rqj, this.DKV.dZn());
        jPanel.add(this.DKU);
        this.DKS.Cf(Double.toString(this.DKV.dZo()));
        jPanel.add(this.DKS);
        this.DGa.add(jPanel);
    }

    @Override
    protected void eDD() {
        int n;
        if (this.DKU.hasChanged() && (n = this.DKU.getSelectedIndex()) != -1) {
            this.DKV.Xs(n);
        }
        if (this.DKS.hasChanged()) {
            this.DKV.dK(Double.parseDouble(this.DKS.eCU()));
        }
    }
}

