/*
 * Decompiled with CFR.
 */
public abstract class hdv
implements lbq {
    protected static final hbe jzX = hbe.jAM;
    public static final lbs<hdv> Persistor = new lbs<hdv>(){
        static final /* synthetic */ boolean $assertionsDisabled;

        public hdv a(lfu lfu2, hdv hdv2) {
            int n;
            int n2 = hdv.d(hdv2);
            if (n2 == (n = lfu2.ad("Type", n2))) {
                return hdv2;
            }
            n2 = n;
            if (n2 == -1) {
                return null;
            }
            if (!$assertionsDisabled && !lfu2.eqA()) {
                throw new AssertionError();
            }
            return hdv.LU(n2);
        }

        static {
            $assertionsDisabled = !hdv.class.desiredAssertionStatus();
        }
    };
    public final int Type;

    public static int a(int n, b b2) {
        assert (n != -1);
        int n2 = n;
        if (b2 == b.kbd) {
            n2 = -(n2 + 1);
        }
        return n2;
    }

    public static int LS(int n) {
        assert (n != -1);
        int n2 = n;
        if (n2 < -1) {
            n2 = -n2 - 1;
        }
        return n2;
    }

    public static b LT(int n) {
        assert (n != -1);
        if (n < -1) {
            return b.kbd;
        }
        return b.kbe;
    }

    private static int a(hdv hdv2) {
        if (hdv2 == null) {
            return -1;
        }
        b b2 = hdv2 instanceof hdw ? b.kbe : b.kbd;
        return hdv.a(hdv2.Type, b2);
    }

    protected static hdv LU(int n) {
        assert (n != -1);
        int n2 = hdv.LS(n);
        b b2 = hdv.LT(n);
        return hdv.b(n2, b2);
    }

    protected static hdv b(int n, b b2) {
        switch (b2) {
            case kbd: {
                if (lea.enZ().contains(n)) {
                    return new hdx(n);
                }
                return null;
            }
            case kbe: {
                if (lea.enW().contains(n)) {
                    return new hdw(n);
                }
                return null;
            }
        }
        assert (false);
        return null;
    }

    public hdv(int n) {
        assert (n != -1);
        assert (this.ceo().acv(n) != null);
        this.Type = n;
    }

    public hdv(int n, boolean bl) {
        assert (lda.yk(bl));
        this.Type = n;
    }

    public abstract b cef();

    public final hdv ceg() {
        ler ler2 = this.cep();
        if (ler2 == null) {
            return null;
        }
        ler2 = this.ceo().i(ler2);
        if (ler2 == null) {
            return null;
        }
        int n = ler2.getType();
        return this.LV(n);
    }

    public final boolean b(hdv hdv2) {
        return this.ceo().k(this.Type, hdv2.Type, true);
    }

    public final boolean c(hdu hdu2) {
        return this.b(hdu2.kaW);
    }

    public final String ceh() {
        ler ler2 = this.cep();
        if (ler2 == null) {
            return "";
        }
        String string = ler2.getName();
        if (string == null) {
            return "";
        }
        return string;
    }

    public final lip cdY() {
        return this.cee();
    }

    public final lip cei() {
        ler ler2 = this.cep();
        if (ler2 == null) {
            return ljg.roH;
        }
        lip lip2 = ler2.awP();
        if (lip2 == null) {
            return ljg.roH;
        }
        return lip2;
    }

    public final boolean c(hdv hdv2) {
        return this.Type == hdv2.Type;
    }

    public abstract lhu atw();

    public abstract lhu cej();

    public final lhu cek() {
        hdv hdv2 = this;
        do {
            lhu lhu2;
            if ((lhu2 = hdv2.cej()) == null) continue;
            return lhu2;
        } while ((hdv2 = hdv2.ceg()) != null);
        return null;
    }

    public abstract boolean awQ();

    public abstract lcf awS();

    public abstract lgs awT();

    public abstract lgs cel();

    public final boolean j(lgg lgg2) {
        return this.ck(lgg2.cf, lgg2.cg);
    }

    public abstract boolean ck(int var1, int var2);

    public abstract hdu a(hel var1, ldv var2);

    public final hdv cem() {
        ler ler2 = this.cep();
        if (ler2 == null) {
            return null;
        }
        ler ler3 = this.ceo().g(ler2);
        if (ler3 == null) {
            return null;
        }
        return this.LV(ler3.getType());
    }

    public final hdv cen() {
        ler ler2 = this.cep();
        if (ler2 == null) {
            return null;
        }
        ler ler3 = this.ceo().h(ler2);
        if (ler3 == null) {
            return null;
        }
        return this.LV(ler3.getType());
    }

    public boolean equals(Object object) {
        if (object instanceof hdv) {
            return this.c((hdv)object);
        }
        assert (false);
        return false;
    }

    public int hashCode() {
        return this.Type;
    }

    public String toString() {
        return null;
    }

    protected abstract hdv LV(int var1);

    protected abstract les ceo();

    protected lip cee() {
        ler ler2 = this.cep();
        if (ler2 == null) {
            return ljg.roH;
        }
        lip lip2 = ler2.awO();
        if (lip2 == null) {
            return ljg.roH;
        }
        return lip2;
    }

    private ler cep() {
        ler ler2 = this.ceo().acv(this.Type);
        if (ler2 == null) {
            // empty if block
        }
        return ler2;
    }

    static /* synthetic */ int d(hdv hdv2) {
        return hdv.a(hdv2);
    }
}

