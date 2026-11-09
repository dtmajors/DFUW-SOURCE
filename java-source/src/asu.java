/*
 * Decompiled with CFR.
 */
public class asu
extends asw {
    public asu(ldv ldv2, ldv ldv3, int n) {
        super(ldv2, ldv3, n, true);
    }

    @Override
    public void initialize() {
        this.UU();
        super.initialize();
    }

    @Override
    protected void a(fbf fbf2) {
        Boolean bl;
        bfn bfn2 = fbf2.iIb;
        if (bfn2 == null) {
            assert (false);
            return;
        }
        switch (bfn2.Type) {
            case 5: 
            case 6: 
            case 7: {
                bl = true;
                break;
            }
            case 9: {
                bl = false;
                break;
            }
            default: {
                bl = null;
            }
        }
        if (bl == null) {
            return;
        }
        this.b(new arx(bl, this.bRN, this.bRL));
    }
}

