/*
 * Decompiled with CFR.
 */
public class axm
extends axk {
    public void a(uk[] ukArray) {
        assert (ukArray != null);
        int n = ukArray.length;
        for (int i = 0; i < n; ++i) {
            if (ukArray[i] == null) continue;
            this.a(ukArray[i]);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11033: {
                gsl gsl2 = (gsl)dxq2;
                this.a(gsl2.joY);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(uk uk2) {
        switch (uk2.Uo) {
            case 1: {
                this.bhD = ((uo)uk2).Value;
                break;
            }
            case 2: {
                this.crX = ((uo)uk2).Value;
                break;
            }
            case 3: {
                this.bhF = ((uq)uk2).Qi;
                break;
            }
            default: {
                assert (false);
                return;
            }
        }
    }
}

