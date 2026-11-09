/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class cnz
extends cnw
implements bto {
    private static final double eOV = 10.0;
    private static final int eOW = 10;
    private static final double eOX = 10.0;
    private cbq elf = null;
    private btn elh = null;
    private bfu elg = new bfu(this);
    private double eOY = 0.0;
    private double eOZ = 0.0;
    private int ePa = 0;
    private int Qs = 0;
    private Map<Integer, guf[]> ePb = lcn.emw();

    public cnz() {
        super(true);
    }

    public final bfq aIv() {
        return this.elg;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.elg.doTick(ldz2);
    }

    public int aUN() {
        return 10;
    }

    protected boolean aUO() {
        if (!this.aIs()) {
            return false;
        }
        if (this.eOZ + 10.0 > this.MessageDelegator.arc().rgz) {
            return false;
        }
        return this.ePa < 10;
    }

    public void initialize() {
        this.eOZ = this.MessageDelegator.arc().rgz;
        super.initialize();
    }

    public void receiveMessage(dxq dxq2) {
        if (this.elh == null || !this.elh.a(dxq2, (btk)((Object)this))) {
            switch (dxq2.bEz()) {
                case 24580: {
                    this.b((gub)dxq2);
                    break;
                }
                case 9251: {
                    this.a((fdu)dxq2);
                    break;
                }
                default: {
                    super.receiveMessage(dxq2);
                }
            }
        }
    }

    public void cleanUp() {
        super.cleanUp();
    }

    public void Hy() {
        this.aIw();
    }

    public final cbq aIL() {
        return this.elf;
    }

    public final void a(cbq cbq2) {
        this.elf = cbq2;
    }

    public final btn aIO() {
        return this.elh;
    }

    public final void a(btn btn2) {
        this.elh = btn2;
    }

    public void f(et et2) {
        if (et2.getType() == 352) {
            bfl bfl2 = (bfl)this.elg.aof();
            if (bfl2 != null) {
                this.elg.a(5, bfl2);
            }
            if (this.elf != null) {
                this.elf.b(this);
            }
        }
        super.f(et2);
    }

    public void d(et et2, float f2) {
        super.d(et2, f2);
        if (this.elf != null) {
            this.elf.a(this, et2);
        }
    }

    protected void aIw() {
        super.aIw();
    }

    private void b(gub gub2) {
        guc guc2 = (guc)this.MessageDelegator.h(24581, this.getGUID(), gub2.aO());
        this.MessageDelegator.b(gub2, guc2);
        if (!this.aUO()) {
            guc2.ew = 1;
            this.MessageDelegator.F(guc2);
            return;
        }
        int n = this.Qs++;
        guf[] gufArray = new guf[]{gub2, guc2};
        this.ePb.put(n, gufArray);
        fdt fdt2 = (fdt)this.MessageDelegator.h(9250, this.GUID, gub2.aZG);
        fdt2.sk(n);
        fdt2.kU(true);
        fdt2.cz(10.0);
        this.MessageDelegator.F(fdt2);
    }

    private void a(fdu fdu2) {
        guf[] gufArray = this.ePb.remove(fdu2.aVk());
        if (gufArray == null) {
            return;
        }
        gub gub2 = (gub)gufArray[0];
        guc guc2 = (guc)gufArray[1];
        guc2.ew = fdu2.bOA() ? 4 : 0;
        this.MessageDelegator.F(guc2);
    }

    public void d(int n, ljq ljq2, lgl lgl2) {
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEb);
        glh2.setSpecialEffectType(n);
        glh2.setSourceObjectGUID(null);
        glh2.setTargetObjectGUID(null);
        glh2.setSourceRotation(lgl2);
        if (lgl2 != null) {
            glh2.JQ(4);
        }
        glh2.setTargetPosition(ljq2);
        this.MessageDelegator.F(glh2);
    }

    public final double aUP() {
        return this.eOY;
    }

    public final void bz(double d2) {
        this.eOY = d2;
    }
}

