/*
 * Decompiled with CFR.
 */
public class hsb
extends hrz {
    private String Name = "";
    private int Size;
    private int kNc;
    private boolean kNd;

    public hsb(hsi hsi2, String string) {
        super(hsi2, string, 1, 2, 0);
    }

    public final void setName(String string) {
        assert ((this.cxf() & 1) != 0);
        assert (string.length() > 0);
        if (this.Name.equals(string)) {
            return;
        }
        this.Name = string;
    }

    public final void setSize(int n) {
        assert ((this.cxf() & 1) != 0);
        if (this.Size == n) {
            return;
        }
        this.Size = n;
    }

    public final void Ol(int n) {
        assert ((this.cxf() & 1) != 0);
        if (this.kNc == n) {
            return;
        }
        this.kNc = n;
    }

    public final void hL(boolean bl) {
        assert ((this.cxf() & 1) != 0);
        if (this.kNd == bl) {
            return;
        }
        this.kNd = bl;
    }

    @Override
    protected void cxd() {
        assert (this.Name.length() > 0);
        knq knq2 = (knq)this.Oj(261);
        int n = this.cxf();
        if ((n & 1) != 0) {
            knq2.wD(true);
        }
        knq2.Zw(n);
        if ((n & 1) != 0) {
            knq2.iK(this.Name);
            knq2.zY(this.Size);
            knq2.zZ(this.kNc);
            knq2.hL(this.kNd);
            knq2.Aa(0);
        }
        this.b(knq2);
    }

    @Override
    protected void b(ktl ktl2, knt knt2) {
        knq knq2;
        if (knt2 instanceof knq && ((knq2 = (knq)knt2).eej() & 1) != 0) {
            switch (ktl2.getResult()) {
                case 0: {
                    this.cxg();
                    return;
                }
            }
        }
        super.b(ktl2, knt2);
    }
}

