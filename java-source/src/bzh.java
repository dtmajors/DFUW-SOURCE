/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 */
public class bzh
extends bzf {
    private static final boolean dtQ = false;
    private boolean edL = false;
    private boolean edM = false;

    public bzh(cex cex2) {
        super((cev)cex2);
    }

    @Override
    public boolean aEa() {
        return this.edL;
    }

    @Override
    protected void a(byz byz2) {
        switch (byz2.eda) {
            case 1: 
            case 2: 
            case 5: 
            case 6: {
                break;
            }
            case 3: 
            case 4: {
                if (!this.edM) break;
                this.edM = false;
                ((cex)this.bnF).aME();
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    protected void aEb() {
        if (this.edL) {
            this.edM = true;
        }
    }

    @Override
    protected void b(int n, String string, String string2) {
    }
}

