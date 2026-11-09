/*
 * Decompiled with CFR.
 */
public class jfh
extends iqg {
    public jfh(ioa ioa2, joa joa2) {
        super("BlueprintsDropDownMenu", "RolesWindow.swf", ioa2, joa2);
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.dmO().W(ipx.a(1, 7, new ipf[0]));
        for (int i = 0; i < jen.dzL().dzN().dAj(); ++i) {
            jew jew2 = jen.dzL().dzN().Uj(i);
            if (jew2 == null) continue;
            if (i > 0) {
                this.dmO().W(ipx.a(1, 2, new ipf[0]));
            }
            this.dmO().W(new jfi(jew2));
        }
        this.dmO().W(ipx.a(1, 5, new ipf[0]));
        this.pack();
    }

    @Override
    protected ipf cMs() {
        return ipx.j(new ipb("blueprint_dropdown_start"), ipx.c(new ipf[0]), new ipb("blueprint_dropdown_end"));
    }
}

