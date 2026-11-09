/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class atm
extends ato {
    public static final int bYJ = ber.ddU;
    public static final int bYK = 0;
    public static final int bYL = 100;
    private int bYM = bYJ;

    @Override
    public void a(atk atk2) {
        if (atk2.Vj().getValue() != this.Vr()) {
            this.id(atk2.Vj().getValue());
            this.Vs();
        }
    }

    public int Vr() {
        return this.bYM;
    }

    public int id(int n) {
        this.bYM = n;
        if (this.bYM < 0) {
            this.bYM = 0;
        }
        if (this.bYM > 100) {
            this.bYM = 100;
        }
        return this.bYM;
    }

    private void Vs() {
        faq faq2 = (faq)this.MessageDelegator.h(1808, this.GUID, lcr.qDY);
        faq2.MusicVolume = (float)this.Vr() / 100.0f;
        this.MessageDelegator.I(faq2);
    }
}

