/*
 * Decompiled with CFR.
 */
public class ccv
extends cct {
    private static final float dpr = 10.0f;
    private dpx emh = null;
    private bfu elg = new bfu(this);
    private cbq elf = null;

    public dpx aJb() {
        return this.emh;
    }

    public void a(dpx dpx2) {
        this.emh = dpx2;
    }

    public bfu aJc() {
        return this.elg;
    }

    public cbq aIL() {
        return this.elf;
    }

    public void a(cbq cbq2) {
        this.elf = cbq2;
    }

    public ccv() {
        super(true);
    }

    public void initialize() {
        super.initialize();
        this.aIw();
    }

    public void cleanUp() {
        this.elf = null;
        if (this.elg != null) {
            this.elg.cleanUp();
            this.elg = null;
        }
        super.cleanUp();
    }

    public void aJd() {
        this.fi().b(12336, this.emh.getID());
        this.fi().b(12304, this.emh.bqi());
        this.fi().b(12320, this.emh.bsb() == null ? "" : this.emh.bsb());
        this.fi().a(12400, this.emh.bsz());
        this.fi().c(12368, this.emh.bsH());
        this.fi().i(12752, this.emh.bsx());
        this.fi().i(12768, this.emh.bsw());
        this.fi().b(12784, this.emh.bsA());
        this.fi().b(12800, this.emh.bsB());
        switch (this.emh.bsd()) {
            case gND: {
                this.fi().i(12352, dpy.gND.ordinal());
                this.fi().a(12384, 0.0);
                break;
            }
            case gNE: {
                this.fi().i(12352, dpy.gNE.ordinal());
                this.fi().a(12384, this.emh.aeY());
                break;
            }
            case gNF: {
                this.fi().i(12352, dpy.gNF.ordinal());
                this.fi().a(12384, 0.0);
            }
        }
    }

    public void aJe() {
        switch (this.emh.bsd()) {
            case gND: {
                this.fi().i(12352, dpy.gND.ordinal());
                this.fi().a(12384, 0.0);
                break;
            }
            case gNE: {
                this.fi().i(12352, dpy.gNE.ordinal());
                this.fi().a(12384, this.emh.aeY());
                break;
            }
            case gNF: {
                this.fi().i(12352, dpy.gNF.ordinal());
                this.fi().a(12384, 0.0);
            }
        }
    }

    public void aJf() {
        this.fi().b(12304, this.emh.bqi());
        this.fi().b(12320, this.emh.bsb() == null ? "" : this.emh.bsb());
    }

    public void aJg() {
        this.fi().b(12320, this.emh.bsb() == null ? "" : this.emh.bsb());
    }

    public void aJh() {
        this.fi().a(12400, this.emh.bsz());
        this.fi().c(12368, this.emh.bsH());
    }

    public void aJi() {
        this.fi().i(12752, this.emh.bsx());
        this.fi().i(12768, this.emh.bsw());
        this.fi().c(12368, this.emh.bsH());
    }

    public void aJj() {
        this.fi().i(12752, this.emh.bsx());
        this.fi().i(12768, this.emh.bsw());
        this.fi().b(12784, this.emh.bsA());
        this.fi().b(12800, this.emh.bsB());
    }

    public void aJk() {
        this.fi().i(12752, this.emh.bsx());
        this.fi().i(12768, this.emh.bsw());
        this.fi().a(12400, this.emh.bsz());
        this.fi().c(12368, this.emh.bsH());
        this.fi().b(12784, this.emh.bsA());
        this.fi().b(12800, this.emh.bsB());
    }

    public void fA(boolean bl) {
        ez ez2 = (ez)this.fi().ae(352);
        if (ez2 == null) {
            return;
        }
        ez2.a(bl ? ep.a.Pg : ep.a.Pe);
    }

    public void fB(boolean bl) {
        ej ej2 = this.fi().ae(352);
        if (ej2 == null) {
            return;
        }
        if (!(ej2 instanceof ex)) {
            return;
        }
        ((ex)ej2).y(bl);
    }

    public void aJl() {
        this.fB(true);
        ej ej2 = this.fi().ae(352);
        if (ej2 == null) {
            return;
        }
        if (!(ej2 instanceof ex)) {
            return;
        }
        ((ex)ej2).o(10.0f);
    }

    public void aqw() {
        this.fB(true);
        ej ej2 = this.fi().ae(352);
        if (ej2 == null) {
            return;
        }
        if (!(ej2 instanceof ex)) {
            return;
        }
        ((ex)ej2).ga();
    }

    public boolean aJm() {
        return this.fi().al(352) < this.fi().ai(354);
    }

    public void f(et et2) {
        if (this.elf != null) {
            if (!this.elf.b(this, et2)) {
                return;
            }
            this.elf.b(this);
        }
        super.f(et2);
    }

    public void d(et et2, float f2) {
        if (this.elf != null) {
            this.elf.a(this, et2);
        }
        super.d(et2, f2);
    }

    public /* synthetic */ bfq aIv() {
        return this.aJc();
    }
}

