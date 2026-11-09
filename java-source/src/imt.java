/*
 * Decompiled with CFR.
 */
import java.util.List;

public class imt
extends inx {
    private static final int mkI = 16;
    private List<inj> mkJ = lcn.emv();

    public imt(List<inj> list) {
        super("DragMultipleWindow", "J2FWindow.swf");
        this.mkJ.addAll(list);
    }

    public List<inj> deB() {
        return this.mkJ;
    }

    @Override
    public void cCu() {
        super.cCu();
        this.dhJ().a(irl.dnr());
        this.dhJ().W(this.cGT());
        this.dhJ().W(this.cGU());
        this.dhJ().W(new iwy());
        this.pack();
    }

    private ipf cGT() {
        ipk ipk2 = new ipk(0);
        ipk2.hz(0.75f);
        return ipk2;
    }

    private ipf cGU() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(this.deC());
        ipx2.W(this.deD());
        return ipx2;
    }

    private ipf deC() {
        ipx ipx2 = ipx.a(ire.muk, 4, new ipf[0]);
        for (int i = 0; i < this.mkJ.size() && i < 16; ++i) {
            inj inj2 = this.mkJ.get(i);
            ipb ipb2 = new ipb(inj2.dey().cCU(), 32, 32);
            ipx2.W(ipb2);
        }
        return ipx2;
    }

    private ipf deD() {
        if (this.mkJ.size() <= 16) {
            return null;
        }
        return new ist(isf.mwN, 13, 0xABABAB, "+" + (this.mkJ.size() - 16));
    }
}

