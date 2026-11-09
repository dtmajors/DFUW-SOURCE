/*
 * Decompiled with CFR.
 */
public class jjq
extends iai {
    private String _name;
    private int npz;

    public jjq(int n, int n2, String string, int n3) {
        super("WorldMapTeleportChamberSelectionWindow", "WorldMapTeleportChamberSelectionWindow.swf", n, n2, 16, 16);
        this._name = string;
        this.npz = n3;
    }

    @Override
    public void cBa() {
        super.cBa();
        this.a(hya.lmt, true);
        this.a(hya.lmv, true);
        this.a(hya.lmw, true);
        this.cJU();
    }

    @Override
    protected void cJU() {
        this.a("setTeleport", new Object[]{this._name.toUpperCase(), lzc.tNT.bD(this.npz, "r_gold").exA().toUpperCase(), lzc.tNR.bD(new Object[0]).exA().toUpperCase(), lzc.tNS.bD(new Object[0]).exA().toUpperCase()});
    }

    @llk
    private void _accept() {
        jjq.cyJ().cHB().sD(this._name);
    }

    @llk
    private void _reject() {
        jjq.cyJ().cHB().dKj();
    }
}

