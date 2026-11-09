/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class ill
extends btk
implements hvx,
hwb,
hwf {
    private Map<ldv, img> mig = lcn.emw();

    @Override
    public void initialize() {
        super.initialize();
        this.ddf();
        hso.cxK().cxP().cyZ().a((hvx)this);
        hso.cxK().cxP().cyZ().a((hwf)this);
        hso.cxK().cxP().cyZ().cAk().a(this);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null) {
            hso.cxK().cxP().cyZ().b((hvx)this);
            hso.cxK().cxP().cyZ().b((hwf)this);
            if (hso.cxK().cxP().cyZ().cAk() != null) {
                hso.cxK().cxP().cyZ().cAk().b(this);
            }
        }
    }

    public void b(gnx gnx2, hxd hxd2) {
        imd imd2 = null;
        switch (gnx2.big) {
            case dEn: {
                return;
            }
            case dEo: {
                imd2 = new ilo(gnx2.big);
                break;
            }
            case dEq: 
            case dEr: {
                imd2 = new ils(gnx2.big);
                break;
            }
            case dEp: 
            case dER: 
            case dES: {
                imd2 = new ilp(gnx2.big);
                break;
            }
            default: {
                imd2 = new ilr(gnx2.big);
            }
        }
        this.mig.put(gnx2.aXQ, imd2);
        ilw.ddy().ddz().c(imd2);
        hso.cxK().cxP().cyJ().cHw().a(hyc.lmI, true);
        hso.cxK().a(jnz.nFI);
        inc.b(imd2);
    }

    public void d(gnv gnv2) {
        img img2 = this.mig.get(gnv2.aXQ);
        if (img2 == null) {
            return;
        }
        img2.ddB();
    }

    public void b(ldv ldv2, hxd hxd2) {
        ilw.ddy().ddz().c(ldv2, hxd2);
    }

    @Override
    public void m(alu alu2) {
        ilw.ddy().lYs.V(alu2);
    }

    @Override
    public void n(alu alu2) {
        ilw.ddy().lYt.V(alu2);
    }

    @Override
    public void a(List<hvz> list, List<hvz> list2, List<hvz> list3) {
    }

    @Override
    public void a(hvz hvz2, List<Integer> list, List<Integer> list2) {
    }

    @Override
    public int cAQ() {
        return 0;
    }

    @Override
    public void a(List<hvz> list, float[] fArray) {
    }

    @Override
    public void a(hvz hvz2, float[] fArray) {
    }

    @Override
    public void qt() {
    }

    @Override
    public void a(bsh bsh2, cxc cxc2) {
    }

    @Override
    public void czV() {
    }

    @Override
    public void q(ej ej2) {
        ilw.ddy().miH.V(ej2);
    }

    @Override
    public void cf(cxc cxc2) {
    }

    @Override
    public void ck(cxc cxc2) {
    }

    @Override
    public void cl(cxc cxc2) {
    }

    @Override
    public void a(cxc cxc2, float f, double d2) {
        ilw.ddy().miI.c(cxc2, Float.valueOf(f), d2);
    }

    @Override
    public void c(cxc cxc2, boolean bl) {
    }

    @Override
    public void i(cxc cxc2, int n) {
    }

    private void ddf() {
        ilw.ddy().ddz().c(new iln());
    }
}

