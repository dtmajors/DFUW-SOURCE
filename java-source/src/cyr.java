/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cew
 *  cug
 *  dtc
 *  lcw
 */
public class cyr
extends cyq {
    private dtc agw = null;

    @Override
    public void initialize() {
        super.initialize();
        this.agw = this.MessageDelegator.bzx().bzt();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4623: {
                this.a((gjd)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gjd gjd2) {
        amf amf2 = this.agw.d(gjd2.hC);
        if (amf2 == null) {
            return;
        }
        if (!(amf2 instanceof cdb)) {
            return;
        }
        cdb cdb2 = (cdb)amf2;
        if (lcw.emZ() && gjd2.jja != null) {
            if (cdb2.az() == cug.fhf) {
                return;
            }
            gjd2.jja.nm(0.25f);
        }
        ljq ljq2 = gjd2.jja;
        if (cdb2 instanceof cew) {
            boolean bl;
            cew cew2 = (cew)cdb2;
            if (cew2.fi() != null && (bl = cew2.fi().ag(12688))) {
                return;
            }
            bl = cew2.aIq();
            boolean bl2 = cew2.km(gjd2.jiZ);
            if (bl && !bl2) {
                return;
            }
            float f2 = 1.0f - cew2.fi().al(13264);
            ljq2.nm(f2);
        }
        cdb2.aJN().aL(ljq2);
    }
}

