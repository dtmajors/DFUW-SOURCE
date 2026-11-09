/*
 * Decompiled with CFR.
 */
public class ckq
extends ckp {
    private cks eGZ = null;
    private fuk eHa = null;
    private double bBf = 0.0;

    public ckq() {
        super(false);
    }

    private void a(fuk fuk2) {
        if (this.eGZ == null) {
            this.eHa = fuk2;
            return;
        }
        this.bBf = fuk2.bBf;
        this.eGZ.a(fuk2.iWZ, fuk2.oV, fuk2.SpecialEffectType);
    }

    protected void aIw() {
        super.aIw();
        boolean bl = this.fi().af(1408).getBooleanValue();
        this.eGZ = new cks(this);
        this.eGZ.fy(bl);
        this.eGZ.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eGZ);
        if (this.eHa != null) {
            this.eGZ.a(this.eHa.iWZ, this.eHa.oV, this.eHa.SpecialEffectType);
            this.eHa = null;
        }
    }

    public void initialize() {
        super.initialize();
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1045: {
                this.a((fuk)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void b(eq eq2, boolean bl) {
        super.b(eq2, bl);
        if (eq2.getType() == 1408 && this.eGZ != null) {
            this.eGZ.fw(eq2.getBooleanValue());
        }
    }

    public void cleanUp() {
        super.cleanUp();
        if (this.eGZ != null) {
            this.eGZ.remove();
            this.eGZ = null;
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.eGZ != null) {
            this.eGZ.doTick(ldz2);
        }
    }

    public double Hz() {
        return this.bBf;
    }
}

