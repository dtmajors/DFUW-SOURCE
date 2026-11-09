/*
 * Decompiled with CFR.
 */
public class cig
extends cif {
    private static final String TC = "SFPlayerPerksManagerClient";

    public cig(cev cev2) {
        super(cev2);
    }

    public final void a(uk uk2) {
        assert (uk2 instanceof vm);
        vm vm2 = (vm)uk2;
        if ((vm2.aXP & 1) > 0 || (vm2.aXP & 2) > 0) {
            this.qk(vm2.aYf);
            return;
        }
        if ((vm2.aXP & 8) > 0) {
            this.a(vm2.aYf, vm2.aYg, vm2.aYh, vm2.Active);
            return;
        }
        if ((vm2.aXP & 4) > 0) {
            this.ql(vm2.aYf);
            return;
        }
        assert (false) : "PerkPU : " + vm2;
    }

    private void a(int n, int n2, long l, boolean bl) {
        cib cib2 = cib.getValueByOrdinal(n);
        if (cib2 == null) {
            lfn.b(5, TC, "updatePerk() perk type : " + n + " is invalid");
            assert (false);
            return;
        }
        cia cia2 = this.eBl.qe(n);
        if (cia2 == null) {
            lfn.b(5, TC, "updatePerk()  there is no related info object for player perk type : " + (Object)((Object)cib2));
            assert (false);
            return;
        }
        chz chz2 = (chz)this.eBm.get(n);
        if (chz2 == null) {
            lfn.b(5, TC, "updatePerk()  player does not posses perk : " + (Object)((Object)cib2));
            assert (false);
            return;
        }
        chz2.setActive(bl);
        chz2.qc(n2);
        chz2.v(l);
        if (bl) {
            this.eBn.put(n, chz2);
        } else {
            this.eBn.remove(n);
        }
        this.a(cbx.a.ekN);
    }

    @Override
    public boolean isServerObject() {
        return false;
    }
}

