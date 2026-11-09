/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class jim
extends ihm {
    private jhw ngU;
    private Map<jhv, iuz> ngV = lcn.emw();
    private Map<jia, iuz> ngW = lcn.emw();
    private Map<jhz, iuz> ngX = lcn.emw();

    public jim(ioa ioa2, joa joa2, jhw jhw2) {
        super("UnlockablesFilterPopupWindow", "UnlockablesWindow.swf", ioa2, joa2, 2, 3);
        this.ngU = jhw2.dGH();
    }

    @Override
    public void cCu() {
        super.cCu();
        this.p(36, 1, 36, 50);
        this.cXE().a(iqo.dmT());
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(new ist(isf.mwO, 18, 12357465, lyy.tLY.bD(new Object[0])));
        this.dHt();
        this.cXE().W(ipx.a(1, 8, new ipf[0]));
        this.cXE().W(ipx.d(new ipk(0x313131, 166, 1)));
        this.cXE().W(ipx.a(1, 3, new ipf[0]));
        this.cXE().W(new ist(isf.mwO, 18, 12357465, lyy.tLZ.bD(new Object[0])));
        this.dHu();
        this.dHv();
        this.cXE().W(ipx.a(1, 6, new ipf[0]));
        this.cXE().W(this.cZm());
    }

    @Override
    protected ipf cMs() {
        return new iqa("/dfdata/texture/gui/j2f/gearguise/gear_guise_filter_bg.png", 36, 1, 36, 100);
    }

    @Override
    protected ihn cVF() {
        return null;
    }

    protected void d(jhw jhw2) {
    }

    private void dHt() {
        int n = 0;
        for (jhv jhv2 : jhv.values()) {
            if (n > 0) {
                this.cXE().W(ipx.a(1, 4, new ipf[0]));
            }
            this.cXE().W(this.a(jhv2));
            ++n;
        }
    }

    private ipf a(jhv jhv2) {
        iuz iuz2 = new iuz(isf.mwO, 14, 0xABABAB, jhv2.nfT.bD(new Object[0]), 0x313131, 20);
        iuz2.c(new ipb(jhv2.cCU(), 22, 22), 0);
        iuz2.c(ipx.a(4, 1, new ipf[0]), 1);
        iuz2.W(ipx.a(8, 1, new ipf[0]));
        iuz2.hX(this.ngU.nfY.contains((Object)jhv2));
        this.ngV.put(jhv2, iuz2);
        return iuz2;
    }

    private void dHu() {
        int n = 0;
        for (jia jia2 : jia.values()) {
            if (n > 0) {
                this.cXE().W(ipx.a(1, 4, new ipf[0]));
            }
            this.cXE().W(this.b(jia2));
            ++n;
        }
    }

    private ipf b(jia jia2) {
        iuz iuz2 = new iuz(isf.mwO, 14, 0xABABAB, jia2.nfT.bD(new Object[0]), 0x313131, 20);
        iuz2.c(new ipb(jia2.cCU(), 22, 22), 0);
        iuz2.c(ipx.a(4, 1, new ipf[0]), 1);
        iuz2.W(ipx.a(8, 1, new ipf[0]));
        iuz2.hX(this.ngU.mQq.contains((Object)jia2));
        this.ngW.put(jia2, iuz2);
        return iuz2;
    }

    private void dHv() {
        for (jhz jhz2 : jhz.values()) {
            this.cXE().W(ipx.a(1, 4, new ipf[0]));
            this.cXE().W(this.a(jhz2));
        }
    }

    private ipf a(jhz jhz2) {
        iuz iuz2 = new iuz(isf.mwO, 14, 0xABABAB, jhz2.nfT.bD(new Object[0]), 0x313131, 20);
        iuz2.c(new ipb(jhz2.cCU(), 22, 22), 0);
        iuz2.c(ipx.a(4, 1, new ipf[0]), 1);
        iuz2.W(ipx.a(8, 1, new ipf[0]));
        iuz2.hX(this.ngU.nfZ.contains((Object)jhz2));
        this.ngX.put(jhz2, iuz2);
        return iuz2;
    }

    private ipf cZm() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cZn()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dya()));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        return ipx2;
    }

    private ipf cZn() {
        return new iur(this){
            final /* synthetic */ jim ngY;
            {
                this.ngY = jim2;
            }

            public void cLq() {
                this.ngY.close();
                jim.a(this.ngY);
            }
        };
    }

    private ipf dya() {
        return new ivc(this){
            final /* synthetic */ jim ngY;
            {
                this.ngY = jim2;
            }

            public void cLq() {
                this.ngY.close();
            }
        };
    }

    private void _accept() {
        for (Map.Entry<jhv, iuz> entry : this.ngV.entrySet()) {
            if (entry.getValue().dir()) {
                this.ngU.nfY.add(entry.getKey());
                continue;
            }
            this.ngU.nfY.remove((Object)entry.getKey());
        }
        for (Map.Entry<Enum, iuz> entry : this.ngW.entrySet()) {
            if (entry.getValue().dir()) {
                this.ngU.mQq.add((jia)entry.getKey());
                continue;
            }
            this.ngU.mQq.remove(entry.getKey());
        }
        for (Map.Entry<Enum, iuz> entry : this.ngX.entrySet()) {
            if (entry.getValue().dir()) {
                this.ngU.nfZ.add((jhz)entry.getKey());
                continue;
            }
            this.ngU.nfZ.remove(entry.getKey());
        }
        this.d(this.ngU);
    }

    static /* synthetic */ void a(jim jim2) {
        jim2._accept();
    }
}

