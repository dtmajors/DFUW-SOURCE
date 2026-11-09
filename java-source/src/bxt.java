/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cew
 *  cxd
 */
import java.util.ArrayList;

public class bxt
extends bxs {
    private static final boolean dtQ = false;
    private bzc dYn = null;
    private bzc dYo = null;
    double dZc = 0.0;

    public bxt(cop cop2) {
        super(cop2);
    }

    @Override
    public bzc aDe() {
        return this.dYn;
    }

    @Override
    public boolean isServerObject() {
        return false;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dYn = new bzc();
    }

    @Override
    public final void a(bzc bzc2) {
        ceg ceg2;
        cya cya2;
        cew cew2;
        if (bzc2.eds.length > 0 && (cew2 = (cew)this.MessageDelegator.bzx().bzt().d(hso.cxK().bAn().gYY)) != null && cew2.aJN() != null && cew2.aJX() != null && (cya2 = (cya)cew2.aJX().yG(cxd.fHG)) != null && cya2.isActive() && cya2.bev() && (ceg2 = (ceg)cew2.aJN()).aKS() != null && ceg2.aKS().equals(this.dZb.getGUID())) {
            Object object;
            ArrayList<Integer> arrayList = null;
            ArrayList<ldv> arrayList2 = null;
            for (int i = 0; i < bzc2.eds.length; ++i) {
                object = bzc2.eds[i];
                bvm bvm2 = (bvm)this.MessageDelegator.bzx().bzt().d((ldv)object);
                if (bvm2 == null || bvm2.aze() == null || !(bvm2.aze() instanceof coq)) continue;
                coq coq2 = (coq)bvm2.aze();
                if (arrayList == null) {
                    arrayList = lcn.emv();
                }
                if (arrayList2 == null) {
                    arrayList2 = lcn.emv();
                }
                arrayList.add(coq2.az());
                arrayList2.add(coq2.aXC());
            }
            if (arrayList != null && arrayList2 != null && this.MessageDelegator.arc().rgz > this.dZc + 2.0) {
                this.dZc = this.MessageDelegator.arc().rgz;
                lfn.b(5, "SFBoatStateManagerClient", "notifyPhysicsStateUpdated() boat contact");
                ecc ecc2 = (ecc)this.MessageDelegator.h(3087, this.GUID, this.dZb.aXC());
                ecc2.i(arrayList2.toArray(new ldv[arrayList2.size()]));
                object = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); ++i) {
                    object[i] = (Integer)arrayList.get(i);
                }
                ecc2.P((int[])object);
                this.MessageDelegator.E(ecc2);
            }
        }
    }

    @Override
    public final void b(bzc bzc2) {
        assert (bzc2 != null);
        if (this.dYn.equals(bzc2)) {
            return;
        }
        this.dYo = this.dYn;
        this.dYn = bzc2;
        if (this.dYo.edp != this.dYn.edp) {
            switch (this.dYn.edp) {
                case 0: {
                    this.b(byw.c.ecx);
                    break;
                }
                case 1: {
                    this.b(byw.c.ecy);
                    break;
                }
                case 2: {
                    this.b(byw.c.ecz);
                    break;
                }
                case 3: {
                    this.b(byw.c.ecA);
                    break;
                }
            }
        }
        if (this.dYn.edl != this.dYo.edl) {
            if (this.dYn.edl) {
                this.b(byw.c.ebZ);
            } else {
                this.b(byw.c.eca);
            }
        }
        if (this.dYn.edn != this.dYo.edn && !this.dYo.edn) {
            this.b(byw.c.ebY);
        }
    }

    public final void aDR() {
        this.ecS.aEP().setDefaultValues();
        this.dYn = new bzc();
        this.dYo = null;
    }

    @Override
    protected void a(byw.d d2, byz byz2) {
        switch (d2) {
            case ecQ: {
                float f2 = this.FZ();
                this.dZb.cL(f2);
                break;
            }
            default: {
                super.a(d2, byz2);
            }
        }
    }

    private float FZ() {
        cdb cdb2;
        float f2 = 10.0f;
        if (this.dZb instanceof coq && (cdb2 = ((coq)this.dZb).aVz()) != null) {
            f2 = cie.a(cdb2, f2);
        }
        return f2;
    }

    @Override
    protected void b(int n, String string, String string2) {
    }
}

