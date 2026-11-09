/*
 * Decompiled with CFR.
 */
public class ajv
extends akh
implements dbk {
    private int bpZ = 0;
    private boolean bqa = false;

    public ajv() {
        this.bog = ajb.b.boV;
    }

    public int CU() {
        return this.bpZ;
    }

    public void fO(int n) {
        this.bpZ = n;
    }

    public boolean CV() {
        return this.bqa;
    }

    public void ba(boolean bl) {
        this.bqa = bl;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        ajv ajv2 = (ajv)aja2;
        ajv2.fO(this.bpZ);
        ajv2.ba(this.bqa);
    }

    @Override
    public void fP(int n) {
        if (this.bqa) {
            if (this.bpZ != n) {
                this.bqv = false;
                this.Dp();
            }
        } else if (this.bpZ == n) {
            this.bqv = false;
            this.Dp();
        }
    }

    @Override
    public int zg() {
        return this.boj.zg();
    }

    @Override
    public void a(ddu ddu2) {
        assert (!this.bqw);
        assert (ddu2 != null);
        if (this.boj.bep() != null) {
            this.bqx = this.boj.bep().akX;
            if (this.bqx == null) {
                return;
            }
            this.boj.jk().bhj().a(this, this.bqx);
            this.bqw = true;
        }
    }

    @Override
    public void CA() {
    }
}

