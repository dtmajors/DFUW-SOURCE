/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ing
extends ihs {
    private String mlV;
    private Map<cwz, ine> mlW = lcn.emw();
    private imr mkM;
    private izu lUW;
    private izm mlX;
    private ios mlY;
    private ios mlZ;

    public ing(imr imr2) {
        super("InventoryCraftingMenuWindow" + imr2.dem().ddF().exA(), "J2FWindow.swf");
        this.OQ(jnz.nGi);
        this.U(500.0f, 400.0f);
        this.a(ire.mul);
        this.mkM = imr2;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.p(44, 0, 36, 120);
        this.a(null, 0, 0, 0, lxb.tmN.bD(new Object[0]));
        this.cXE().a(irl.dnr());
        this.cXE().W(this.cGT());
        this.cXE().W(this.cGU());
    }

    @Override
    protected iox cGl() {
        return null;
    }

    private ipf cGT() {
        return ipx.a(this.cXH(), this.cXI(), this.dhN(), this.dhO(), new iqa(this, "/dfdata/texture/gui/j2f/inventory/crafting_calculator/inv_bg_crafting_menu.png", 220, 0, 120, 120, iqb.mtp){
            final /* synthetic */ ing mma;
            {
                this.mma = ing2;
                super(string, n, n2, n3, n4, iqb2);
            }

            public void kh(float f) {
                this.hz(f);
            }
        });
    }

    private ipf cGU() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(new ist(isf.mwO, 18, 12357465, this.mkM.dem().ddF().exA()));
        ipx2.W(new ipk(0x313131, 500, 1));
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx ipx3 = ipx.l(new ipf[0]);
        ipx2.W(ipx3);
        ipx3.W(ipx.c(this.cWb()));
        ipx3.W(ipx.a(4, 1, new ipf[0]));
        ipx3.W(ipx.d(this.cKR()));
        ipx3.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(new ipk(0x313131, 500, 1));
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(new ist(isf.mwO, 16, 12357465, lxb.tmP.bD(new Object[0])));
        ipx2.W(ipx.c(this.dgg()));
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(new ipk(0x313131, 500, 1));
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx ipx4 = ipx.l(new ipf[0]);
        ipx2.W(ipx4);
        ipx4.W(ipx.d(this.dgh()));
        if (!this.mkM.dem().ddi()) {
            ipx4.W(ipx.a(8, 1, new ipf[0]));
            ipx4.W(ipx.d(new ipk(0x313131, 1, 26)));
            ipx4.W(ipx.a(8, 1, new ipf[0]));
            ipx4.W(ipx.d(this.dgi()));
        }
        return ipx2;
    }

    private ipf cWb() {
        this.lUW = new izu(this){
            final /* synthetic */ ing mma;
            {
                this.mma = ing2;
            }

            public void od(String string) {
                super.od(string);
                ing.a(this.mma, string);
            }
        };
        this.lUW.dqb().a(isf.mwN, 12);
        this.lUW.due().a(isf.mwN, 12);
        this.lUW.due().o(lxb.tmO.bD(new Object[0]));
        return this.lUW;
    }

    private ipf cKR() {
        return new iwi(this){
            final /* synthetic */ ing mma;
            {
                this.mma = ing2;
            }

            public void cLq() {
                ing.a(this.mma);
            }
        };
    }

    private ipf dgg() {
        this.mlX = new izm();
        this.mlX.Td(5);
        return this.mlX;
    }

    private ipf dgh() {
        this.mlY = new iwp(this, lxb.tmQ.bD(new Object[0]), "/dfdata/texture/gui/j2f/inventory/crafting_calculator/button_ic_check/button_ic_check_disabled.png", "/dfdata/texture/gui/j2f/inventory/crafting_calculator/button_ic_check/button_ic_check_normal.png", "/dfdata/texture/gui/j2f/inventory/crafting_calculator/button_ic_check/button_ic_check_hover.png", "/dfdata/texture/gui/j2f/inventory/crafting_calculator/button_ic_check/button_ic_check_pushing.png"){
            final /* synthetic */ ing mma;
            {
                this.mma = ing2;
                super(loz2, string, string2, string3, string4);
            }

            public void cLq() {
                ing.b(this.mma);
            }
        };
        this.mlY.rF(false);
        return this.mlY;
    }

    private ipf dgi() {
        this.mlZ = new iwp(this, lxb.tmR.bD(new Object[0]), "/dfdata/texture/gui/j2f/inventory/crafting_calculator/button_ic_backpack/button_ic_backpack_disabled.png", "/dfdata/texture/gui/j2f/inventory/crafting_calculator/button_ic_backpack/button_ic_backpack_normal.png", "/dfdata/texture/gui/j2f/inventory/crafting_calculator/button_ic_backpack/button_ic_backpack_hover.png", "/dfdata/texture/gui/j2f/inventory/crafting_calculator/button_ic_backpack/button_ic_backpack_pushing.png"){
            final /* synthetic */ ing mma;
            {
                this.mma = ing2;
                super(loz2, string, string2, string3, string4);
            }

            public void cLq() {
                ing.c(this.mma);
            }
        };
        this.mlZ.rF(false);
        return this.mlZ;
    }

    private void dgj() {
        this.mlW.clear();
        this.mlX.removeAllItems();
        if (this.mlV == null || this.mlV.isEmpty()) {
            return;
        }
        Map<Integer, List<cwz>> map = cwy.bfk();
        for (List<cwz> list : map.values()) {
            this.bw(list);
        }
        if (this.mlX.sU().isEmpty()) {
            this.mlX.c(new iuh(iqo.dmS(), new ist(isf.mwO, 14, 0xABABAB, lxb.tmT.bD(new Object[0]))));
        }
    }

    private void bw(List<cwz> list) {
        if (list != null) {
            for (cwz cwz2 : list) {
                this.a(cwz2);
            }
        }
    }

    private void a(cwz cwz2) {
        if (cwz2.bfp().contains(this.mlV) && cwz2.bfr()) {
            ine ine2 = new ine(this, cwz2, this.mkM){
                final /* synthetic */ ing mma;
                {
                    this.mma = ing2;
                    super(cwz2, imr2);
                }

                public void dgb() {
                    ing.d(this.mma);
                }
            };
            this.mlX.c(new iuh(iqo.dmT(), ipx.a(1, 4, new ipf[0]), new ipk(0x313131, 1, 1), ipx.a(1, 4, new ipf[0])));
            this.mlW.put(cwz2, ine2);
            this.mlX.c(ine2);
        }
        this.bw(cwz2.getChildren());
    }

    private void dgk() {
        boolean bl = false;
        for (Map.Entry<cwz, ine> entry : this.mlW.entrySet()) {
            ine ine2 = entry.getValue();
            if (ine2.dfZ() <= 0) continue;
            bl = true;
            break;
        }
        this.mlY.rF(bl);
    }

    private void oO(String string) {
        this.mlV = string.toLowerCase();
        this.dgj();
        this.dgk();
    }

    private void dfH() {
        this.lUW.setText("");
        this.mlV = null;
        this.dgj();
    }

    private void dgl() {
        this.dgk();
        if (this.mlZ != null) {
            this.mlZ.rF(false);
        }
    }

    private void dgm() {
        List<iua> list = this.mlX.sU();
        Set<Integer> set = lcn.emx();
        for (iua iua2 : list) {
            Object object;
            if (!(iua2 instanceof ine) || ((ine)(object = (ine)iua2)).dfZ() <= 0) continue;
            ((inf)object).dgf().j(set);
        }
        Map<Integer, Integer> map = this.mkM.dem().o(set);
        int n = 0;
        for (iua iua3 : list) {
            int n2;
            ine ine2;
            if (!(iua3 instanceof ine) || (ine2 = (ine)iua3).dfZ() <= 0) continue;
            Map<Integer, Integer> map2 = lcn.emw();
            int n3 = 0;
            for (n2 = 0; n2 < ine2.dfZ(); n2 += 1) {
                if (!ine2.dgf().c(map, map2)) continue;
                ine2.dgf().F(map);
                ++n3;
            }
            int n4 = n2 = n3 == ine2.dfZ() ? 1 : 0;
            if (n2) {
                ++n;
            }
            ine2.a(n3, n2 != 0, map2);
        }
        if (this.mlZ != null) {
            this.mlZ.rF(!this.mkM.dem().ddi() && n > 0);
        }
    }

    private void dgn() {
        List<iua> list = this.mlX.sU();
        Set<Integer> set = lcn.emx();
        for (iua iua2 : list) {
            ine ine2;
            if (!(iua2 instanceof ine) || !(ine2 = (ine)iua2).vA()) continue;
            ine2.dgf().j(set);
        }
        Map<Integer, Integer> map = this.mkM.dem().o(set);
        this.mkM.dem().L(map);
        this.dfH();
    }

    static /* synthetic */ void a(ing ing2, String string) {
        ing2.oO(string);
    }

    static /* synthetic */ void a(ing ing2) {
        ing2.dfH();
    }

    static /* synthetic */ void b(ing ing2) {
        ing2.dgm();
    }

    static /* synthetic */ void c(ing ing2) {
        ing2.dgn();
    }

    static /* synthetic */ void d(ing ing2) {
        ing2.dgl();
    }
}

