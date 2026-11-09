/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

public class csh
extends btk {
    private csb[] fbc = null;
    private csc[] fbd = null;
    private csb fbe = null;
    private csc fbf = null;
    private List<cse> fbg = lcn.emv();
    private cqx fbh = null;
    private String fbi = null;
    private ldv fbj = null;
    private ldv fbk = null;
    private int fbl = 0;
    private int fbm = 0;
    private boolean fbn = false;
    private boolean fbo = false;
    private boolean fbp = false;

    @Override
    public void initialize() {
        super.initialize();
        this.aZZ();
        this.baa();
        this.aZX();
        this.aZV();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.aZY();
        this.aZW();
    }

    @Override
    public void receiveRenderResponse(kgz kgz2) {
        switch (kgz2.ex) {
            case 5: {
                this.b((kgv)kgz2);
                return;
            }
            case 6: {
                this.a((kgr)kgz2);
                return;
            }
            case 7: {
                this.a((kgs)kgz2);
                return;
            }
            case 2: {
                this.a((kgt)kgz2);
                return;
            }
        }
        super.receiveRenderResponse(kgz2);
    }

    private void aZV() {
        kfz kfz2 = (kfz)this.MessageDelegator.BV(7);
        kfz2.ts(this.getGUID());
        kfz2.Ud = this.fbk = this.MessageDelegator.bzv();
        kfz2.plb = 1;
        this.MessageDelegator.b(kfz2);
    }

    private void aZW() {
        kfz kfz2 = (kfz)this.MessageDelegator.BV(7);
        kfz2.ts(this.getGUID());
        kfz2.Ud = this.fbk;
        kfz2.plb = 2;
        this.MessageDelegator.b(kfz2);
    }

    private void aZX() {
        kge kge2 = (kge)this.MessageDelegator.BV(15);
        kge2.ts(this.getGUID());
        kge2.Ud = this.fbj = this.MessageDelegator.bzv();
        kge2.pmy = 1;
        this.MessageDelegator.b(kge2);
    }

    private void aZY() {
        if (this.fbj == null) {
            return;
        }
        kge kge2 = (kge)this.MessageDelegator.BV(15);
        kge2.ts(this.getGUID());
        kge2.Ud = this.fbj;
        kge2.pmy = 2;
        this.MessageDelegator.b(kge2);
        this.fbj = null;
    }

    private void aZZ() {
        kft kft2 = (kft)this.MessageDelegator.BV(16);
        kft2.ts(this.getGUID());
        this.MessageDelegator.b(kft2);
    }

    private void baa() {
        kfx kfx2 = (kfx)this.MessageDelegator.BV(17);
        kfx2.ts(this.getGUID());
        this.MessageDelegator.b(kfx2);
    }

    private void a(kgt kgt2) {
        lcw.qFT = kgt2.dYX() - kgt2.dYW();
        lcw.qFU = kgt2.dYV() - kgt2.dYY();
        this.fbl = kgt2.dYX() - kgt2.dYW();
        this.fbm = kgt2.dYV() - kgt2.dYY();
    }

    private void b(kgv kgv2) {
        assert (kgv2.Ud != null);
        assert (kgv2.Ud.equals(this.fbj));
        this.fbh.aZN().gV(kgv2.fbb);
        this.fbh.aZQ().hR(csq.p(kgv2.faR, kgv2.faS, kgv2.pqZ));
        this.fbh.aZQ().gT(!kgv2.pra);
        this.fbn = !kgv2.pra;
        this.fbh.aZQ().gU(kgv2.fcO);
        this.fbo = kgv2.fcO;
        this.fbh.aZL().gL(kgv2.faU);
        this.fbh.aZL().gM(kgv2.faV);
        this.fbh.aZL().gN(kgv2.faW);
        this.fbh.aZL().tV(kgv2.faX);
        this.fbh.aZS().gO(kgv2.faY | kgv2.faZ);
        this.fbh.aZM().eN(kgv2.fba);
        this.fbh.aZP().ua(kgv2.TextureFiltering);
        this.fbh.gJ(true);
    }

    private void a(kgr kgr2) {
        this.fbc = kgr2.fbc;
        this.bab();
    }

    private void a(kgs kgs2) {
        this.fbd = kgs2.fbd;
        this.bab();
    }

    private void bab() {
        Iterator<Object> iterator;
        int n;
        if (this.fbc == null) {
            return;
        }
        if (this.fbd == null) {
            return;
        }
        for (n = 0; n < this.fbc.length; ++n) {
            if (!this.fbc[n].eZH) continue;
            assert (this.fbe == null);
            this.fbe = this.fbc[n];
        }
        for (n = 0; n < this.fbd.length; ++n) {
            iterator = this.fbd[n];
            if (!((csc)((Object)iterator)).eZH || ((csc)((Object)iterator)).eZL != 1) continue;
            assert (this.fbf == null);
            this.fbf = iterator;
        }
        assert (this.fbe != null);
        assert (this.fbf != null);
        assert (this.fbf.eZM != null);
        lfn.b(0, "SFRenderOptionsSensorManager", "checkDeviceAdapters() Number of DMODES: " + this.fbf.eZM.length);
        for (n = 0; n < this.fbf.eZM.length; ++n) {
            iterator = this.fbf.eZM[n];
            if (((cse)((Object)iterator)).eZS != 22 && ((cse)((Object)iterator)).eZS != 21) continue;
            this.fbg.add((cse)((Object)iterator));
        }
        lfn.b(0, "SFRenderOptionsSensorManager", "checkDeviceAdapters() NUMBER OF DISPLAYMODES: " + this.fbg.size());
        SortedMap<Integer, cse> sortedMap = lcn.emD();
        for (cse object : this.fbg) {
            assert (object != null);
            sortedMap.put(new Integer(object.fc * object.fb), object);
        }
        this.fbg.clear();
        for (Map.Entry entry : sortedMap.entrySet()) {
            assert (entry.getValue() != null);
            this.fbg.add((cse)entry.getValue());
        }
        this.fbi = csq.aA(this.fbg);
        this.bac();
    }

    void bac() {
        csq csq2 = this.fbh.aZQ();
        csq2.hS(this.fbi);
        this.fbh.gJ(true);
    }

    public void a(cqx cqx2) {
        this.fbh = cqx2;
    }
}

