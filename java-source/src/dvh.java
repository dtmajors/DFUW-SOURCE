/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class dvh
extends btk
implements bto,
dwb {
    private static final int hfq = 50;
    private boolean hfr = false;
    private dvj hfs = null;
    private dwc hft = null;
    private dxd hfu = null;
    private dxf hfv = null;
    private dwf hfw = null;
    private int hfx = 0;
    private Queue<gnh> hfy = null;
    private int hfz = 0;
    private boolean UK = false;
    private final Map<ldv, a> dhK = lcn.emw();
    private final Map<Integer, List<a>> dhL = lcn.emw();
    public static final int hfA = 12;
    public static final int hfB = 13;

    public dvh() {
        this.hfy = lcn.emA();
    }

    @Override
    public void cleanUp() {
        if (this.hfs != null) {
            this.MessageDelegator.hd(this.hfs.getGUID());
        }
        if (this.hft != null) {
            this.MessageDelegator.hd(this.hft.getGUID());
        }
        if (this.hfu != null) {
            this.MessageDelegator.hd(this.hfu.getGUID());
        }
        if (this.hfv != null) {
            this.MessageDelegator.hd(this.hfv.getGUID());
        }
        if (this.hfw != null) {
            this.MessageDelegator.hd(this.hfw.getGUID());
        }
        super.cleanUp();
    }

    @Override
    public void initialize() {
        super.initialize();
        if (this.getGUID().ib() == 102) {
            this.hfr = true;
            this.hfs = new dvj(this);
            this.hfs.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.hfs);
            this.hft = new dwc(this);
            this.hft.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.hft);
            this.hfu = new dxd(this);
            this.hfu.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.hfu);
            this.hfv = new dxf(this);
            this.hfv.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.hfv);
            this.hfw = new dwf(this);
            this.hfw.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.hfw);
            this.bBx();
            dvg.a(this);
            this.bBy();
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.UK) {
            this.UK = false;
            throw new RuntimeException("requested by external command");
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n;
        if (!this.hfr) {
            return;
        }
        if (dxq2.bEz() == 8713) {
            return;
        }
        if (dxq2.bEz() == 11119) {
            this.UK = true;
            return;
        }
        switch (dxq2.bEz()) {
            case 12545: {
                this.b((fbb)dxq2);
                return;
            }
            case 12547: {
                this.b((fbg)dxq2);
                return;
            }
        }
        if (dxq2.bED() == 3584) {
            this.a((gnh)dxq2);
            if (this.hfx >= 20) {
                this.hfy.add((gnh)dxq2);
                int n2 = this.hfy.size();
                if (n2 % 50 == 0 && this.hfz < n2) {
                    lfn.b(4, "SFStatsModule", "receiveMessage() : Pending Message Queue Size Increased to " + n2);
                    this.hfz = n2;
                }
                return;
            }
            n = this.hfy.size();
            if (n % 50 == 0 && this.hfz > n) {
                lfn.b(2, "SFStatsModule", "receiveMessage() : Pending Message Queue Size Decreased to " + n);
                this.hfz = n;
            }
        }
        n = 0;
        if (this.hfw != null && this.hfw.r(dxq2)) {
            this.hfw.receiveMessage(dxq2);
            n = 1;
        }
        if (this.hfs.r(dxq2)) {
            this.hfs.receiveMessage(dxq2);
            n = 1;
        }
        if (this.hft.r(dxq2)) {
            this.hft.receiveMessage(dxq2);
            n = 1;
        }
        if (this.hfu.r(dxq2)) {
            this.hfu.receiveMessage(dxq2);
            n = 1;
        }
        if (this.hfv.r(dxq2)) {
            this.hfv.receiveMessage(dxq2);
            n = 1;
        }
        if (n == 0) {
            super.receiveMessage(dxq2);
        }
    }

    private void bBx() {
        String string = dvx.bCo();
        if (string == null) {
            lfn.b(5, this.getClass().getSimpleName(), "setAllPlayersToLoggedOut() : Failed to generate SQL to set all players' states to logged-out!!!");
            assert (false);
            return;
        }
        this.a(new dvz(string));
    }

    private void bBy() {
        String string = dvx.bCp();
        if (string == null) {
            lfn.b(5, this.getClass().getSimpleName(), "recreateHighscoreTables() : Failed to generate SQL to start the high-score management system!!!");
            assert (false);
            return;
        }
        this.a(new dvz(string));
    }

    public void a(dvy dvy2) {
        if (dvy2 == null) {
            return;
        }
        if (dvy2.getGUID() == null) {
            dvy2.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(dvy2);
        }
        dvy2.a(this);
        if (dvy2.bCh()) {
            ++this.hfx;
        } else {
            lfn.b(5, this.getClass().getSimpleName(), "handleNewDatabaseWorker() : Worker failed to start work!... Worker = " + dvy2);
            assert (false);
        }
    }

    @Override
    public void b(dvy dvy2) {
        if (dvy2 == null) {
            return;
        }
        --this.hfx;
        lfn.b(5, this.getClass().getSimpleName(), "workFailed() : Database worker failed to complete its work!!!... Worker = " + dvy2);
        assert (false);
        this.MessageDelegator.hd(dvy2.getGUID());
        while (!this.hfy.isEmpty() && this.hfx < 20) {
            this.receiveMessage(this.hfy.poll());
        }
    }

    @Override
    public void c(dvy dvy2) {
        if (dvy2 == null) {
            return;
        }
        --this.hfx;
        this.MessageDelegator.hd(dvy2.getGUID());
        while (!this.hfy.isEmpty() && this.hfx < 20) {
            this.receiveMessage(this.hfy.poll());
        }
    }

    private void b(fbb fbb2) {
        if (fbb2.iHR == null) {
            lfn.b(5, "SFEventManager", "handleAddEventListenerMessage() EventListenerGUID is null.");
            return;
        }
        if (fbb2.dhI == null || fbb2.dhI.length == 0) {
            lfn.b(5, "SFEventManager", "handleAddEventListenerMessage() EventTypes array is null or empty.");
            return;
        }
        if (this.dhK.containsKey(fbb2.iHR)) {
            lfn.b(5, "SFEventManager", "handleAddEventListenerMessage() EventListener " + fbb2.iHR + " is already added.");
            return;
        }
        a a2 = new a(this);
        a2.GUID = fbb2.iHR;
        a2.dhI = fbb2.dhI;
        a2.bqd = fbb2.bqd;
        this.a(a2);
    }

    private void a(a a2) {
        assert (a2 != null);
        int[] nArray = a2.dhI;
        int n = nArray.length;
        for (int i = 0; i < n; ++i) {
            this.a(a2, nArray[i]);
        }
        this.dhK.put(a2.GUID, a2);
    }

    private void a(a a2, int n) {
        assert (a2 != null);
        assert (n > 0);
        List<a> list = this.dhL.get(n);
        if (list == null) {
            list = lcn.abH(3);
            this.dhL.put(n, list);
        }
        if (list.contains(a2)) {
            lfn.b(5, this.getClass().getSimpleName(), "registerEventListener() Listener " + a2.GUID + " has already been registered.");
            assert (false);
            return;
        }
        list.add(a2);
    }

    private void b(fbg fbg2) {
        if (fbg2.iHR == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleRemoveEventListenerMessage() EventListenerGUID is null.");
            return;
        }
        a a2 = this.dhK.remove(fbg2.iHR);
        if (a2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleRemoveEventListenerMessage() EventListener " + fbg2.iHR + " was not found.");
            return;
        }
        int[] nArray = a2.dhI;
        int n = nArray.length;
        for (int i = 0; i < n; ++i) {
            this.b(a2, nArray[i]);
        }
    }

    private void b(a a2, int n) {
        assert (a2 != null);
        assert (n > 0);
        List<a> list = this.dhL.get(n);
        if (list == null) {
            lfn.b(5, this.getClass().getSimpleName(), "unregisterEventListener() Unable to remove listener " + a2.GUID + " from event '" + bfo.eV(n) + "'");
            return;
        }
        if (!list.remove(a2)) {
            lfn.b(5, this.getClass().getSimpleName(), "unregisterEventListener() Listener " + a2.GUID + " was not listening to event '" + bfo.eV(n) + "'");
            assert (false);
            return;
        }
        if (list.isEmpty()) {
            this.dhL.remove(n);
        }
    }

    private void a(gnh gnh2) {
        switch (gnh2.bEz()) {
            case 3591: {
                bfn bfn2 = this.cc(((gnm)gnh2).jnd, 5);
                this.c(bfn2);
                break;
            }
        }
    }

    private bfn cc(int n, int n2) {
        bfn bfn2 = new bfn();
        bfn2.dhr = n;
        bfn2.Type = n2;
        bfn2.aYF = lcr.qAC;
        bfn2.akX = lcr.qAC;
        return bfn2;
    }

    private void c(bfn bfn2) {
        assert (bfn2 != null);
        List<a> list = this.dhL.get(bfn2.Type);
        if (list == null) {
            return;
        }
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            int[] nArray;
            a a2 = list.get(i);
            for (int n2 : nArray = a2.bqd) {
                if (!lea.enW().isDescendant(bfn2.dhr, n2)) continue;
                this.a(a2.GUID, bfn2);
            }
        }
    }

    private void a(ldv ldv2, bfn bfn2) {
        assert (ldv2 != null);
        assert (bfn2 != null);
        fbf fbf2 = (fbf)this.MessageDelegator.h(12548, this.getGUID(), ldv2);
        fbf2.iIb = bfn2;
        fbf2.Tr = lcr.qAC;
        fbf2.aDk = lcr.qAC;
        fbf2.ade = lcr.qAC;
        fbf2.cRI = lcr.qAC;
        fbf2.Position = new ljq();
        this.MessageDelegator.F(fbf2);
    }
}

