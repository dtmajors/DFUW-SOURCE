/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hje
implements jor,
lbr {
    private static final hbe jzX = hbe.jAM;
    private final hjo kxD;
    public final int jEO;
    public final int jEP;
    private hdv kxE;
    private final ArrayList<ej> kxF = new ArrayList();
    private final List<ej> kbO = Collections.unmodifiableList(this.kxF);
    private hdu kmX;

    public hje(hjo hjo2, int n, int n2) {
        this.kxD = hjo2;
        this.jEO = n;
        this.jEP = n2;
    }

    public final void dispose() {
    }

    public final boolean cmS() {
        if (this.kxE == null) {
            return false;
        }
        this.kxE = null;
        this.kmX = null;
        this.kxF.clear();
        return true;
    }

    public final boolean a(hje hje2) {
        assert (this.kxD == hje2.kxD);
        hdv hdv2 = this.kxE;
        this.kxE = hje2.kxE;
        hje2.kxE = hdv2;
        ArrayList<ej> arrayList = new ArrayList<ej>(this.kxF);
        this.kxF.clear();
        this.kxF.addAll(hje2.kxF);
        hje2.kxF.clear();
        hje2.kxF.addAll(arrayList);
        hdu hdu2 = this.kmX;
        this.kmX = hje2.kmX;
        hje2.kmX = hdu2;
        return true;
    }

    public final hdu cmT() {
        return this.kmX;
    }

    public final boolean m(hdu hdu2) {
        if (hdu2 == this.kmX) {
            return false;
        }
        this.kmX = hdu2;
        if (this.kmX != null) {
            this.kxE = this.kmX.kaW;
            this.kxF.clear();
            for (ej ej2 : this.kmX.getAttributes()) {
                int n = ej2.getDataType();
                if (n != 0 && n != 2 && n != 3) continue;
                this.kxF.add(ej2);
            }
        }
        return true;
    }

    public final hdv cmU() {
        return this.kxE;
    }

    public final List<ej> getAttributes() {
        return this.kbO;
    }

    @Override
    public final void a(jov jov2, boolean bl) {
        assert (lda.by(jov2));
        if (bl) {
            this.kxD.cz(this.jEP, this.jEO);
        }
    }

    @Override
    public final boolean a(lfu lfu2) {
        boolean bl = false;
        hdv hdv2 = lfu2.a("Class", this.kxE, hdv.Persistor);
        if (!lin.i(hdv2, this.kxE)) {
            assert (lfu2.eqA());
            this.kxE = hdv2;
            bl = true;
        }
        int n = this.kxF.size();
        n = lfu2.ad("AttributeCount", n);
        if (lfu2.eqA()) {
            this.kxF.clear();
        }
        for (int i = 0; i < n; ++i) {
            ej ej2 = lfu2.eqA() ? null : this.kxF.get(i);
            ej2 = this.a(lfu2.zC("Attribute" + (i + 1)), ej2);
            if (!lfu2.eqA()) continue;
            this.kxF.add(ej2);
        }
        return bl;
    }

    private ej a(lfu lfu2, ej ej2) {
        int n = ej2 == null ? 0 : ej2.getType();
        n = lfu2.ad("type", n);
        if (lfu2.eqA()) {
            int n2 = ep.aL((int)n);
            switch (n2) {
                case 0: {
                    ej2 = new eq();
                    break;
                }
                case 2: {
                    ej2 = new et();
                    break;
                }
                case 3: {
                    ej2 = new ew();
                    break;
                }
                default: {
                    ej2 = new et();
                    assert (false);
                    break;
                }
            }
            ej2.setType(n);
        } else assert (ej2 != null);
        Object object = ej2.getValue();
        object = lfu2.f("value", object);
        ej2.setValue(object);
        return ej2;
    }
}

