/*
 * Decompiled with CFR.
 */
public class cci
extends ccc {
    private String bhD = null;
    private String bhE = null;
    private ljq bhF = null;
    private ayb bhH = ayb.cvi;
    private float bhG = 0.0f;
    private double elH = 0.0;

    public cci() {
        super(false);
        this.ObjectType = 100;
        this.elc = new bwc(false);
    }

    public String aIQ() {
        return this.bhE;
    }

    public void cA(String string) {
        this.bhE = string;
        if (this.MessageDelegator != null) {
            this.elH = this.MessageDelegator.arc().rgz;
        }
    }

    public String Xt() {
        return this.bhD;
    }

    public void cz(String string) {
        this.bhD = string;
        if (this.MessageDelegator != null) {
            this.elH = this.MessageDelegator.arc().rgz;
        }
    }

    public ljq Xv() {
        return this.bhF;
    }

    public void al(ljq ljq2) {
        this.bhF = ljq2;
    }

    public float Xu() {
        return this.bhG;
    }

    public void X(float f2) {
        this.bhG = f2;
    }

    public ayb Xz() {
        return this.bhH;
    }

    public void a(ayb ayb2) {
        this.bhH = ayb2 == null ? this.bhH : ayb2;
    }

    public double aIR() {
        return this.elH;
    }

    protected void a(uk uk2) {
        switch (uk2.Uo) {
            case 3: {
                this.cz(((uo)uk2).Value);
                break;
            }
            case 4: {
                this.cA(((uo)uk2).Value);
                break;
            }
            case 5: {
                this.al(((uq)uk2).Qi);
                break;
            }
            case 6: {
                this.X(((ue)uk2).Pz);
                break;
            }
            case 7: {
                this.a(ayb.getValueByOrdinal(((uh)uk2).PC));
                break;
            }
            default: {
                super.a(uk2);
            }
        }
    }

    @Override
    protected void aIw() {
        super.aIw();
    }
}

