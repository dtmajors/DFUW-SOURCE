/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jnk
 */
import java.util.Set;

public class jni
extends jnl {
    ayk sO(ldv ldv2) {
        if (!this.nDv.dNI()) {
            return null;
        }
        for (int j = 0; j < this.nDF.abd().length; ++j) {
            if (!this.nDF.abd()[j].getGUID().equals(ldv2)) continue;
            return this.nDF.abd()[j];
        }
        return null;
    }

    boolean sP(ldv ldv2) {
        if (!this.nDv.dNI()) {
            return false;
        }
        for (int j = 0; j < this.nDF.abd().length; ++j) {
            if (!this.nDF.abd()[j].getGUID().equals(ldv2)) continue;
            return this.nDF.abd()[j].aaZ() != null;
        }
        return false;
    }

    jni(jng jng2, jnr jnr2, dmn dmn2, jnk jnk2) {
        super(jng2, jnr2, dmn2, jnk2);
    }

    @Override
    void dNE() {
        this.nDF = this.nDv.dNJ();
    }

    @Override
    void dNF() {
        this.nDF = this.nDv.dNJ();
    }

    @Override
    void bqx() {
        this.nDF = null;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bED() == 32000) {
            this.a((eqr)dxq2);
            return;
        }
        super.receiveMessage(dxq2);
    }

    private void a(eqr eqr2) {
        switch (eqr2.bHc()) {
            case 1281: {
                this.a((eou)eqr2);
                break;
            }
            case 1282: {
                this.a((eoy)eqr2);
                break;
            }
            case 1283: {
                this.a((eov)eqr2);
                break;
            }
            case 1284: {
                this.a((eox)eqr2);
                break;
            }
            case 1285: {
                this.a((eow)eqr2);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleClanClientUpdateMessage() : Unknown Update Type (" + eqr2.bHc() + ") Received!!!");
                assert (false);
                return;
            }
        }
    }

    private void a(eou eou2) {
        this.nDF.a(eou2.bKj());
        Set<hus> set = this.nDC.c(hus.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hus hus2 : set) {
                hus2.cyC();
            }
            this.nDC.ir(false);
        }
    }

    private void a(eoy eoy2) {
        ayk ayk2 = this.sO(eoy2.ajD());
        if (ayk2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientControlPointVulnerableMessage() : Update Received, But Control-Point Not Found!!!");
            return;
        }
        ayk2.co(true);
    }

    private void a(eov eov2) {
        this.nDF.eG(eov2.ajD());
        Set<hus> set = this.nDC.c(hus.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hus hus2 : set) {
                hus2.cyC();
            }
            this.nDC.ir(false);
        }
    }

    private void a(eox eox2) {
        ayk ayk2 = this.sO(eox2.ajD());
        if (ayk2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientControlPointResourceStealingStartedMessage() : Update Received, But Control-Point Not Found!!!");
            return;
        }
        ayk2.i(eox2.aaZ(), eox2.aaY());
        Set<htj> set = this.nDC.c(htj.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (htj htj2 : set) {
                htj2.d(ayk2);
            }
            this.nDC.ir(false);
        }
    }

    private void a(eow eow2) {
        ayk ayk2 = this.sO(eow2.ajD());
        if (ayk2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientControlPointResourceStealingEndedMessage() : Update Received, But Control-Point Not Found!!!");
            return;
        }
        ayk2.aba();
        Set<htj> set = this.nDC.c(htj.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (htj htj2 : set) {
                htj2.d(ayk2);
            }
            this.nDC.ir(false);
        }
    }
}

