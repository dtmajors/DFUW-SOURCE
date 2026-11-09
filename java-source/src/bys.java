/*
 * Decompiled with CFR.
 */
public class bys
extends byq {
    private static final boolean dtQ = false;
    private boolean dZr = false;
    private boolean dZs = false;

    public bys(cpg cpg2) {
        super(cpg2);
    }

    @Override
    public boolean aEa() {
        return this.dZr;
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
                if (!this.dZs) break;
                this.dZs = false;
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    protected void aEb() {
        if (this.dZr) {
            this.dZs = true;
        }
    }

    @Override
    protected void b(int n, String string, String string2) {
    }
}

