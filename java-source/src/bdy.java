/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class bdy
extends btk
implements bto {
    private static final lfo ct = new lfo("Confirmation Server");
    private final Map<ldv, est> dbV = new HashMap<ldv, est>();
    private final eso dbW = new eso();
    private final List<ldv> dbX = lcn.abH(5);
    private final Map<ldv, esu> dbY = new HashMap<ldv, esu>();
    private boolean Initialized;
    private ldv dbZ;
    private boolean dca;

    public bdy() {
        this.setGUID(lcr.aTZ);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void doTick(ldz ldz2) {
        Iterator<esu> iterator;
        assert (this.Initialized);
        assert (lda.by(ldz2));
        LinkedList<Cloneable> linkedList = new LinkedList<Cloneable>();
        if (!lcw.qOR) {
            for (ldv ldv2 : this.dbV.keySet()) {
                iterator = this.dbV.get(ldv2);
                if (!(ldz2.rgz > ((est)((Object)iterator)).iBv.bsD)) continue;
                linkedList.add(ldv2);
            }
        } else {
            for (ldv n : this.dbY.keySet()) {
                iterator = this.dbY.get(n);
                if (!(ldz2.rgz > ((esu)((Object)iterator)).iBw.bsD)) continue;
                linkedList.add(n);
            }
        }
        if (!this.dbX.isEmpty()) {
            int n = this.dbX.size();
            for (int i = 0; i < n; ++i) {
                iterator = this.dbX.get(i);
                linkedList.add((Cloneable)((Object)iterator));
            }
            this.dbX.clear();
        }
        for (ldv n : linkedList) {
            if (!lcw.qOR) {
                iterator = this.dbV.get(n);
                this.a(esv.a(this.dbW, ((dxq)((Object)iterator)).aO(), new bdx(n), ((est)((Object)iterator)).aqs));
                this.dbV.remove(n);
            } else {
                iterator = this.dbY.get(n);
                this.a(esv.a(this.dbW, ((dxq)((Object)iterator)).aO(), new bdx(n), ((esu)((Object)iterator)).aqs));
                this.dbY.remove(n);
            }
            this.dca = true;
        }
        if (this.dca) {
            if (this.dbZ != null) {
                Object[] objectArray;
                if (!lcw.qOR) {
                    void var4_12;
                    objectArray = new bdq[this.dbV.size()];
                    boolean bl = false;
                    for (est est2 : this.dbV.values()) {
                        objectArray[++var4_12] = est2.iBv;
                    }
                    assert (var4_12 == objectArray.length);
                    this.a(esp.a(this.dbW, this.dbZ, (bdq[])objectArray));
                } else {
                    void var4_14;
                    objectArray = new bdt[this.dbY.size()];
                    boolean bl = false;
                    for (esu esu2 : this.dbY.values()) {
                        objectArray[++var4_14] = esu2.iBw;
                    }
                    assert (var4_14 == objectArray.length);
                    this.a(esq.a(this.dbW, this.dbZ, (bdt[])objectArray));
                }
            }
            this.dca = false;
        }
    }

    @Override
    public void initialize() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.initialize();
    }

    @Override
    public void cleanUp() {
        assert (this.Initialized);
        super.cleanUp();
        this.Initialized = false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        assert (this.Initialized);
        switch (dxq2.bEz()) {
            case 18177: {
                this.a((esr)dxq2);
                break;
            }
            case 18179: {
                this.a((est)dxq2);
                break;
            }
            case 18183: {
                this.a((esu)dxq2);
                break;
            }
            case 18181: {
                this.a((esw)dxq2);
                break;
            }
            case 18182: {
                this.a((ess)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(esr esr2) {
        if (esr2.ila) {
            assert (this.dbZ == null);
            this.dbZ = esr2.aO();
        } else {
            assert (this.dbZ == esr2.aO());
            this.dbZ = null;
        }
    }

    private void a(ess ess2) {
        ldv ldv2 = ess2.aO();
        if (!lcw.qOR) {
            if (!this.dbV.containsKey(ldv2)) {
                lfn.b(5, "SFConfirmationServer", "handleConfirmationRemoveMessage() OLDGUID There is no pending request for " + ldv2);
                return;
            }
        } else if (!this.dbY.containsKey(ldv2)) {
            lfn.b(5, "SFConfirmationServer", "handleConfirmationRemoveMessage() NEWGUI There is no pending request for " + ldv2);
            return;
        }
        this.dbX.add(ldv2);
    }

    private void a(est est2) {
        assert (!lcw.qOR);
        ldv ldv2 = est2.iBv.dbx;
        if (ldv2 == null) {
            return;
        }
        if (this.dbV.containsKey(ldv2)) {
            return;
        }
        this.dbV.put(ldv2, est2);
        this.dca = true;
    }

    private void a(esu esu2) {
        assert (lcw.qOR);
        ldv ldv2 = esu2.iBw.ev;
        if (ldv2 == null) {
            return;
        }
        if (this.dbY.containsKey(ldv2)) {
            return;
        }
        ldv ldv3 = esu2.iBw.Ri;
        int n = esu2.iBw.ed;
        for (esu esu3 : this.dbY.values()) {
            ldv ldv4 = esu3.iBw.Ri;
            int n2 = esu3.iBw.ed;
            if (!ldv4.equals(ldv3) || n != n2) continue;
            this.a(esv.a(this.dbW, esu2.aO(), new bdx(ldv2), esu3.aqs));
            return;
        }
        this.dbY.put(ldv2, esu2);
        this.dca = true;
    }

    private void a(esw esw2) {
        bdv bdv2 = esw2.iBx;
        ldv ldv2 = bdv2.dbT;
        if (!lcw.qOR) {
            est est2 = this.dbV.remove(ldv2);
            if (est2 == null) {
                ct.error("no request found for " + ldv2 + ", ConfirmationSatisfyMessage=" + esw2);
                return;
            }
            this.a(esv.a(this.dbW, est2.aO(), bdv2, est2.aqs));
        } else {
            esu esu2 = this.dbY.remove(ldv2);
            if (esu2 == null) {
                ct.error("no request found for " + ldv2 + ", ConfirmationSatisfyMessage=" + esw2);
                return;
            }
            this.a(esv.a(this.dbW, esu2.aO(), bdv2, esu2.aqs));
        }
        this.dca = true;
    }

    private void a(dxq dxq2) {
        this.MessageDelegator.F(dxq2);
    }
}

