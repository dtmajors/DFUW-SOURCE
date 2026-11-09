/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 */
public class bkp
extends bke {
    public bkp() {
        this.dsy = bkd.a.dsk;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2.bEz() != 9227) {
            this.Vc();
            return;
        }
        fcw fcw2 = (fcw)fdo2;
        amf amf2 = this.MessageDelegator.bzx().bzt().d(fcw2.aZG);
        if (amf2 == null || !(amf2 instanceof cdb)) {
            this.Vc();
            return;
        }
        cdb cdb2 = (cdb)amf2;
        ldv ldv2 = cdb2.jk().bhh();
        gix gix2 = (gix)this.MessageDelegator.h(4637, this.GUID, ldv2);
        gix2.cT(new ljq(1.0f, 1.0f - fcw2.Magnitude, 1.0f));
        gix2.setTargetObjectGUID(new ldv(0L));
        this.MessageDelegator.F(gix2);
    }
}

