/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class bpf
extends bpe {
    private ldv dyV = null;
    private String dyW = null;
    private boolean bKW = false;
    private boolean dyX = true;
    protected boolean dyY = false;

    public void a(String string, boolean bl2, boolean bl3) {
        if (bl2 || bl3) {
            this.dyY = true;
            return;
        }
        fjx fjx2 = (fjx)this.MessageDelegator.h(11790, this.getGUID(), lcr.qEm);
        fjx2.ga(string);
        fjx2.jM(true);
        this.MessageDelegator.F(fjx2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11791: {
                fjy fjy2 = (fjy)dxq2;
                if (fjy2.atp().eny() != lcr.qAC.eny() && fjy2.atn().eny() != lcr.qAC.eny()) {
                    this.iz(fjy2.atn());
                    this.dyV = fjy2.atp();
                    this.dyY = true;
                    return;
                }
                this.bKW = true;
                this.dyX = false;
                this.dyW = fjy2.arX();
                break;
            }
            case 11034: {
                this.bKW = true;
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public int atm() {
        return 2;
    }

    @Override
    public boolean atk() {
        return this.bKW;
    }

    @Override
    public boolean atl() {
        return this.dyY;
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    public String ato() {
        return this.dyW;
    }

    public void fU(String string) {
        this.dyW = string;
    }

    public ldv atp() {
        return this.dyV;
    }

    public void iA(ldv ldv2) {
        this.dyV = ldv2;
    }

    public boolean atq() {
        return this.dyX;
    }
}

