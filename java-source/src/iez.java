/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  ifb
 */
import spenefett.hid.gui.serialization.dto.SFGUIElementListDTO;
import spenefett.hid.gui.serialization.dto.SFGUIFolderListDTO;

public class iez
extends hzk {
    private ifb lPH;

    protected iez(ifb ifb2) {
        super("CraftingContainerWindow", "CraftingContainerWindow.swf");
        this.lPH = ifb2;
    }

    void remove(int n, int n2) {
        this.a("remove", new Object[]{n, n2});
    }

    void a(int n, SFGUIElementListDTO sFGUIElementListDTO) {
        this.a("insert", new Object[]{n, sFGUIElementListDTO});
    }

    void a(SFGUIFolderListDTO sFGUIFolderListDTO) {
        this.a("updateFolders", new Object[]{sFGUIFolderListDTO});
    }

    public void kq(float f) {
        this.a("setWidth", new Object[]{Float.valueOf(f)});
    }

    public hyn s(int n, int n2, String string) {
        return this.lPH.v(n, n2, string);
    }

    protected void cBa() {
        super.cBa();
        iez.cyJ().cHQ().cQR();
    }

    protected void cEa() {
        super.cEa();
    }

    protected boolean cEm() {
        return true;
    }

    protected void h(int n, int n2, String string) {
        this.lPH.w(n, n2, string);
    }

    protected void i(int n, int n2, String string) {
        this.lPH.u(n, n2, string);
    }

    @Override
    protected boolean og(String string) {
        return this.lPH.qa(string);
    }

    @Override
    protected ifg of(String string) {
        return this.lPH.qb(string);
    }

    protected boolean cFu() {
        return this.lPH.cQS();
    }

    private void cQN() {
        this.N(this.cEN().W / this.cEJ(), this.cEN().H / this.cDc());
        this.cER();
        int n = (int)this.cEN().W;
        int n2 = (int)this.cEN().H;
        this.a("setSize", new Object[]{n, n2});
    }
}

