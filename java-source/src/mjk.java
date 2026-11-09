/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 */
import java.awt.event.ActionEvent;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class mjk
extends kdy {
    private kff DCG = null;
    private aux DCH = new aux();

    public mjk() {
        this.DCH.setVisible(true);
        this.DCH.a(this);
    }

    public void doTick(ldz ldz2) {
        this.Z();
    }

    public void a(dxq dxq2) {
        if (dxq2.bED() == 4096) {
            int n = this.pir.size();
            for (int i = 0; i < n; ++i) {
                kee kee2 = null;
                kee2 = (kee)this.pir.get(i);
                if (kee2.dVG() != 301) continue;
                ((kfs)kee2).p((hac)dxq2);
            }
        } else {
            int n = this.pir.size();
            for (int i = 0; i < n; ++i) {
                kee kee3 = null;
                kee3 = (kee)this.pir.get(i);
                if (kee3.dVG() != 12) continue;
                ((kfl)kee3).p(dxq2);
            }
        }
    }

    public void actionPerformed(ActionEvent actionEvent) {
        lfn.b(0, "", "Action!");
    }

    @Override
    public void a(kee kee2) {
        super.a(kee2);
        if (kee2.dVG() == 14) {
            this.DCG = (kff)kee2;
        }
    }

    public void Z() {
        this.ezL();
        kee kee2 = null;
        int n = this.piq.size();
        for (int i = 0; i < n; ++i) {
            kee2 = (kee)this.piq.get(i);
            if (kee2.dVG() == 301 && !kee2.isEmpty()) {
                this.a((kfs)kee2);
                continue;
            }
            if (kee2.dVG() != 28 || kee2.isEmpty()) continue;
            this.a((kfo)kee2);
        }
    }

    private void ezL() {
        if (this.DCG != null) {
            while (!this.DCG.isEmpty()) {
                this.DCH.b(this.DCG.dVW());
            }
        }
    }

    private void a(kfs kfs2) {
        while (!kfs2.isEmpty()) {
            haa haa2;
            hac hac2 = (hac)kfs2.getObject();
            if (hac2 == null) continue;
            if (hac2.bEz() == 4126 && (haa2 = (haa)hac2).bYE() != null) {
                SwingUtilities.invokeLater(new Runnable(this, haa2){
                    haa DCI;
                    final /* synthetic */ haa DCJ;
                    final /* synthetic */ mjk DCK;
                    {
                        this.DCK = mjk2;
                        this.DCJ = haa2;
                        this.DCI = this.DCJ;
                    }

                    public void run() {
                        this.DCI.bYE().a(this.DCI.bYF(), this.DCI.getData());
                    }
                });
            }
            if (hac2.bEz() == 4098) {
                this.a((haz)hac2);
            }
            if (hac2.bYL() == 19) {
                this.DCH.aU(hac2.av());
                this.DCH.eV(hac2.getRotation());
            }
            if (hac2.bEz() == 4125) {
                this.DCH.a((gzy)hac2);
            }
            if (hac2.bEz() != 4097) continue;
            if (hac2.bYU() != null) {
                hac2.bYU().d(hac2);
                continue;
            }
            this.DCH.b(hac2);
        }
    }

    private void a(haz haz2) {
        if (haz2.caF()) {
            if (haz2.getMessageType() == 2) {
                JOptionPane.showMessageDialog(this.DCH.getContentPane(), haz2.caD(), haz2.caE(), 0);
            } else if (haz2.getMessageType() == 1) {
                JOptionPane.showMessageDialog(this.DCH.getContentPane(), haz2.caD(), haz2.caE(), 2);
            } else if (haz2.getMessageType() == 0) {
                try {
                    JOptionPane.showMessageDialog(this.DCH.getContentPane(), haz2.caD(), haz2.caE(), 1);
                }
                catch (Exception exception) {
                    System.out.println("What fucking exception!! -->" + exception.getStackTrace());
                }
            } else if (haz2.getMessageType() == 3) {
                this.DCH.c(haz2);
                return;
            }
        }
        this.DCH.Ca(haz2.caD());
        this.DCH.b(haz2);
    }

    private void a(kfo kfo2) {
        while (!kfo2.isEmpty()) {
            this.DCH.ak((Map)kfo2.getObject());
        }
    }
}

