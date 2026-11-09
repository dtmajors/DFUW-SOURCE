/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  lcr
 */
public class cca {
    public static void q(cbx cbx2) {
        if (cug.vN((int)cbx2.az())) {
            cca.s(cbx2);
        }
    }

    public static void r(cbx cbx2) {
    }

    private static void s(cbx cbx2) {
        fh fh2;
        if (!cbx2.isServerObject()) {
            return;
        }
        ej ej2 = cbx2.jm().ae(10976);
        if (ej2 == null) {
            fh2 = new fh();
            fh2.setType(10976);
            fh2.L(new ljq(ljq.roQ));
            cbx2.jm().b((ej)fh2);
            ej2 = fh2;
        }
        if (!(ej2 instanceof fh)) {
            lfn.b(5, "SFPhysicalObjectSetup", "initTreasureMap(): MAP_POSITION isn't a Vector3 attribute");
            assert (false);
            return;
        }
        fh2 = (fh)ej2;
        if (fh2.gy() == null) {
            lfn.b(5, "SFPhysicalObjectSetup", "initTreasureMap(): MAP_POSITION attribute contains null Vector3");
            fh2.L(new ljq(ljq.roQ));
        }
        if (lin.i(fh2.gy(), ljq.roQ)) {
            ggc ggc2 = (ggc)cbx2.getMessageDelegator().h(6165, cbx2.getGUID(), lcr.qBa);
            ggc2.l(cbx2.az());
            cbx2.getMessageDelegator().E(ggc2);
        }
    }
}

