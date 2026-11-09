/*
 * Decompiled with CFR.
 */
import java.util.List;

public class ikl
extends ijc {
    private boolean mgj;
    private boolean mgk;
    private List<ikj> mgl = lcn.emv();

    public ikl() {
        super(true, true, lyu.tKT);
        ipx ipx2 = ipx.l(new ipf[0]);
        this.cXE().W(ipx2);
        ipx2.W(this.a("texture/dds/gui//skillsnew//slayer_barrage.png", this.daD(), this.dcs()));
        ipx2.W(ipx.a(3, 1, new ipf[0]));
        ipx2.W(this.a("texture/dds/gui//skillsnew//archer_salvo.png", this.daD(), this.dcs()));
        ipx2.W(ipx.a(3, 1, new ipf[0]));
        ipx2.W(this.a("texture/dds/gui//skillsnew//water_water_trap.png", this.daD(), this.dcs()));
        ipx2.W(ipx.a(3, 1, new ipf[0]));
        ipx2.W(this.a("texture/dds/gui//skillsnew//chaos_pall_of_pandemonium.png", this.daD(), this.dcs()));
    }

    public boolean dcr() {
        return this.mgj;
    }

    public void qH(boolean bl) {
        this.mgj = bl;
        this.mci.dLF();
    }

    public boolean dcs() {
        return this.mgk;
    }

    public void qI(boolean bl) {
        this.mgk = bl;
        for (ikj ikj2 : this.mgl) {
            ikj2.qG(bl);
        }
        this.mci.dLF();
    }

    @Override
    public ije dae() {
        return new iki(this);
    }

    @Override
    public ikd daf() {
        return ikd.mfw;
    }

    @Override
    public void cZZ() {
        super.cZZ();
        for (ikj ikj2 : this.mgl) {
            ikj2.a(this.daD());
        }
    }

    @Override
    public void daa() {
        for (ikj ikj2 : this.mgl) {
            ikj2.kI(this.daE());
        }
    }

    private ipf a(String string, ijf ijf2, boolean bl) {
        ikj ikj2 = new ikj(string, ijf2, bl);
        this.mgl.add(ikj2);
        return ikj2;
    }
}

