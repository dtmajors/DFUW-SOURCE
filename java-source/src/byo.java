/*
 * Decompiled with CFR.
 */
public class byo
extends bym {
    private boolean dYV = false;
    private boolean dYW = false;

    public byo(cdv cdv2) {
        super(cdv2);
    }

    @Override
    public boolean aEa() {
        return this.dYV;
    }

    @Override
    protected void a(byz byz2) {
        switch (byz2.eda) {
            case 1: 
            case 2: 
            case 5: {
                break;
            }
            case 3: 
            case 4: {
                if (!this.dYW) break;
                this.dYW = false;
                ((cdv)this.dZk).aKm();
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    protected void aEb() {
        if (this.dYV) {
            this.dYW = true;
        }
    }
}

