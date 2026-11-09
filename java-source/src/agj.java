/*
 * Decompiled with CFR.
 */
public abstract class agj {
    private static final Integer bhV = new Integer(0);
    private ahu.b Ul = null;
    private Integer bhW = bhV;
    protected boolean bhX = false;
    protected a[] bhY = null;

    public agj(ahu.b b2) {
        this.Ul = b2;
    }

    public final ahu.b AI() {
        return this.Ul;
    }

    public final int AJ() {
        return this.bhW;
    }

    public final void eS(int n) {
        this.bhW = new Integer(n);
    }

    public final Integer AK() {
        return this.bhW;
    }

    public final boolean AL() {
        return this.bhX;
    }

    public final void gt() {
        assert (this.bhY != null);
        StringBuilder stringBuilder = new StringBuilder("Content of: ");
        stringBuilder.append(this.getClass().getSimpleName());
        int n = this.bhY.length;
        for (int i = 0; i < n; ++i) {
            stringBuilder.append("EventTime[");
            stringBuilder.append(i);
            stringBuilder.append("]: ");
            stringBuilder.append(this.bhY[i]);
        }
    }

    public final String getEventPropertyName() {
        return this.Ul.name();
    }

    public abstract vd eD(int var1);

    public final int eT(int n) {
        a a2 = this.eW(n);
        if (a2 == null) {
            return 0;
        }
        return a2.aWg;
    }

    public final void J(int n, int n2) {
        assert (n > 0);
        assert (n2 >= 0);
        a a2 = this.eW(n);
        if (a2 == null) {
            return;
        }
        a2.aWg = n2;
        if (n == 2) {
            this.bhX = false;
        } else if (n == 4) {
            this.bhX = true;
        }
        if (a2 instanceof b) {
            b b2 = (b)a2;
            a2 = this.eW(b2.bib);
            if (a2 == null) {
                return;
            }
            a2.reset();
        }
    }

    public final void eU(int n) {
        a a2 = this.eW(n);
        if (a2 == null) {
            return;
        }
        a2.reset();
    }

    protected final String eV(int n) {
        switch (n) {
            case 1: {
                return "AddedPropertyEvent";
            }
            case 4: {
                return "RemovedPropertyEvent";
            }
            case 8: {
                return "UpdatedPropertyEvent";
            }
            case 2: {
                return "AddedPropertyAgainEvent";
            }
            case 16: {
                return "CostChangedEvent";
            }
            case 32: {
                return "DurabilityChangedEvent";
            }
            case 64: {
                return "ParentChangedEvent";
            }
            case 128: {
                return "QuantityChangedEvent";
            }
            case 256: {
                return "WeightChangedEvent";
            }
            case 512: {
                return "AttachedObjectEvent";
            }
            case 1024: {
                return "DetachedObjectEvent";
            }
            case 2048: {
                return "SheathedObjectEvent";
            }
            case 4096: {
                return "UnsheathedObjectEvent";
            }
            case 8192: {
                return "DepositedObjectEvent";
            }
            case 16384: {
                return "WithdrewObjectEvent";
            }
            case 32768: {
                return "ChangedSlotEvent";
            }
        }
        return "Undefined eventtype provided: " + n;
    }

    protected final a eW(int n) {
        assert (this.bhY != null);
        int n2 = this.bhY.length;
        for (int i = 0; i < n2; ++i) {
            if (this.bhY[i].aXP != n) continue;
            return this.bhY[i];
        }
        return null;
    }

    protected final boolean eX(int n) {
        return n == -1;
    }
}

