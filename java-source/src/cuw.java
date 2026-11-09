/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.Map;

public class cuw
extends btk
implements bto,
cuu {
    private static final int fyy = 750;
    private double fyz = 0.0;
    private final csx fyA;
    private Map<ldv, cuv> fyB = lcn.emw();
    private Map<ldv, cuv> fyC = lcn.emw();
    private boolean fyD = false;
    private boolean did = false;

    public cuw(csx csx2) {
        this.fyA = csx2;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.did && this.MessageDelegator.bzx().bzt().dVA() == kdw.a.phY) {
            this.did = true;
            if (!lcw.enb()) {
                grh grh2 = (grh)this.MessageDelegator.h(11098, this.getGUID(), lcr.hac);
                this.MessageDelegator.F(grh2);
            } else {
                gr gr2 = new gr();
                gr2.aI("GameLogic");
                gr2.bN(300);
                gr[] grArray = new gr[]{gr2};
                gri gri2 = (gri)this.MessageDelegator.h(11099, this.getGUID(), this.getGUID());
                gri2.jqi = grArray;
                this.receiveMessage(gri2);
            }
        }
        if (this.fyD) {
            return;
        }
        if (this.MessageDelegator.bzx().bzt().dVA() == kdw.a.phY && !this.fyA.bbk().isEmpty()) {
            this.bci();
            this.fyD = true;
        }
    }

    public boolean lM(ldv ldv2) {
        cuv cuv2 = this.fyC.get(ldv2);
        if (cuv2 == null) {
            return false;
        }
        return cuv2.bcf();
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    private void bci() {
        for (int i = 0; i < 750; ++i) {
            cuv cuv2 = new cuv(this);
            cuv2.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(cuv2);
            this.fyB.put(cuv2.getGUID(), cuv2);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11099: {
                this.a((gri)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gri gri2) {
        assert (gri2.jqi != null);
        assert (gri2.jqi.length > 0);
        ArrayList<gr> arrayList = lcn.emv();
        for (gr gr2 : gri2.jqi) {
            if (!gr2.ic().equals("GameLogic")) continue;
            arrayList.add(gr2);
        }
        this.fyA.aC(arrayList);
    }

    @Override
    public int bbl() {
        return this.fyA.bbl();
    }

    @Override
    public void a(ldv ldv2, cuv cuv2, ljq ljq2) {
        this.fyC.put(ldv2, cuv2);
    }

    @Override
    public void a(ldv ldv2, cuv cuv2, boolean bl) {
        assert (this.fyC.containsKey(ldv2));
        this.fyC.remove(ldv2);
    }
}

