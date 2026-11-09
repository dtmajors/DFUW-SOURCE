/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class abf
extends abe {
    protected Map<Integer, Integer> bdz = lcn.emw();

    public abf(wy wy2, int n) {
        super(wy2, n, abo.bdK);
    }

    public abf(wy wy2, int n, String string) {
        super(wy2, n, abo.bdK, string);
    }

    @Override
    public void a(int n, int n2, boolean bl, boolean bl2) {
        if (this.bdz.containsKey(n)) {
            lfn.b(5, this.getClass().getSimpleName(), "receiveInput() : Duplicate Input Received!!!... Quest = " + this.wF() + ", Node = " + this + ", In-Edge ID = " + n + ", Input-Value = " + n2);
            assert (false);
            return;
        }
        this.bdz.put(n, n2);
        if (this.bdz.size() == this.yy()) {
            if (!this.wF().isActive()) {
                lfn.b(5, this.getClass().getSimpleName(), "receiveInput() : Quest is Not Active!!!... Quest = " + this.wF() + ", Node = " + this + ", In-Edge ID = " + n + ", Input-Value = " + n2);
                assert (false);
                return;
            }
            this.wF().a(this, bl, bl2);
        }
    }

    @Override
    public aaz h(wy wy2) {
        return this.a(wy2, new abf(wy2, this.getID()));
    }
}

