/*
 * Decompiled with CFR.
 */
public class jei
extends hzk
implements bto {
    private double mTX = 0.0;

    public jei(String string, String string2) {
        super(string, string2);
        this.OQ(-1);
        this.a(hyb.lmC);
    }

    public void initialize() {
        super.initialize();
        this.mTX = this.MessageDelegator.arc().rgz;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (lpd.rHs.exL().startsWith("ko")) {
            if (!this.cEU()) {
                if (ldz2.rgz - this.mTX >= 3600.0) {
                    this.mTX = ldz2.rgz;
                    this.setVisible(true);
                    jei.cyJ().updateLayout();
                }
            } else if (ldz2.rgz - this.mTX >= 3.0) {
                this.mTX = ldz2.rgz - 3.0;
                this.setVisible(false);
                jei.cyJ().updateLayout();
            }
        } else if (this.isVisible()) {
            this.setVisible(false);
        }
    }
}

