/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hlv
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class hlw
extends hnu {
    private final b kKV;
    private final boolean kKW;
    private boolean Initialized;

    public hlw(hlv hlv2, String string, lgg lgg2, lhf lhf2, b b2, hnu.b ... bArray) {
        this(hlv2, string, lgg2, lhf2, b2, true, new ArrayList<hnu.b>(Arrays.asList(bArray)));
    }

    private hlw(hlv hlv2, String string, lgg lgg2, lhf lhf2, b b2, boolean bl, List<hnu.b> list) {
        this(hlv2, string, lgg2, lhf2, b2, list);
        assert (lda.yk(bl));
        assert (list.size() == 0);
    }

    public hlw(hlv hlv2, String string, lgg lgg2, lhf lhf2, b b2, List<hnu.b> list) {
        super((hnc)hlv2, string, lgg2, lhf2, b2.kKX, list);
        boolean bl = false;
        Iterator<hnu.b> iterator = list.iterator();
        while (iterator.hasNext()) {
            hnu.b b3 = iterator.next();
            if (!(b3 instanceof a)) continue;
            bl = ((a)b3).kKW;
            iterator.remove();
        }
        this.kKV = b2;
        this.kKW = bl;
    }

    public final b cpF() {
        return this.kKV;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected lcq cfJ() {
        float f2;
        lcq lcq2 = super.cfJ();
        if (!this.kKW && !this.isFocusOwner()) {
            lcq2 = this.ceM().kIn.kED;
        }
        if (!ldq.ai(f2 = this.cfN(), 1.0f)) {
            lcq2 = new lcq(lcq2.r, lcq2.g, lcq2.b, lcq2.a * f2);
        }
        return lcq2;
    }

    protected float cfN() {
        return 1.0f;
    }

    protected boolean cpG() {
        return this.kKW || this.isFocusOwner();
    }

    protected hlv ceM() {
        return (hlv)this.kLu;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

