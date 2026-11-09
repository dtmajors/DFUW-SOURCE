/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bpr
 */
import java.util.Iterator;
import java.util.Map;

public class box
extends btk {
    private final bpr dyz;
    private final bot dyq;
    private final Map<Integer, bpd> dyA = lcn.emw();
    private int dyB = 0;

    public box(bot bot2, bpr bpr2) {
        this.dyq = bot2;
        this.dyz = bpr2;
    }

    public void b(bok bok2, ldv ldv2, int[] nArray, int[] nArray2, gdl gdl2) {
        assert (gdl2 != null);
        assert (bok2 != null);
        assert (nArray != null && nArray2 != null && nArray.length == nArray2.length);
        assert (ldv2 != null);
        if (gdl2 == null || bok2 == null || ldv2 == null || nArray == null || nArray2 == null || nArray.length != nArray2.length) {
            lfn.b(5, "SFQuestItemRemoverManager", "removeInventoryItems() Invalid parameters.");
            if (bok2 != null) {
                this.dyq.in(bok2.asw());
            }
            return;
        }
        bop bop2 = bok2.lp(bok2.asy());
        if (bop2 == null) {
            lfn.b(5, "SFQuestItemRemoverManager", "removeInventoryItems() Quest with index :" + bok2.asy() + " does not exist for Complex Quest :" + bok2.qM());
            this.dyq.in(bok2.asw());
            assert (false);
            return;
        }
        if (!(bop2 instanceof bon) && !(bop2 instanceof bol)) {
            this.dyq.in(bok2.asw());
            assert (false);
            return;
        }
        this.a(true, bop2);
        fnc fnc2 = (fnc)this.MessageDelegator.h(8005, this.getGUID(), bok2.asz());
        fnc2.hsP = true;
        fnc2.bqd = nArray;
        fnc2.iIY = nArray2;
        fnc2.aqs = this.dyB;
        fnc2.b(bqy.dHJ);
        this.MessageDelegator.F(fnc2);
        bpd bpd2 = new bpd(gdl2, ldv2, bok2);
        this.dyA.put(this.dyB, bpd2);
        ++this.dyB;
    }

    private void a(fnd fnd2) {
        int n = fnd2.aqs;
        bpd bpd2 = this.dyA.remove(n);
        if (bpd2 == null) {
            lfn.b(5, "SFQuestItemRemoverManager", "handleInventoryResourceRemoveItemsResponseMessage() Could not find the entry in the ItemMap for this message : " + n + " Can not happen!");
            assert (false);
            return;
        }
        if (!fnd2.iQM) {
            if (bpd2.dyQ != null) {
                bop bop2 = bpd2.dyQ.lp(bpd2.dyQ.asy());
                this.a(false, bop2);
                this.dyz.g(bpd2.dyP, this.dyq.a(bpd2.dyQ), bpd2.dyQ.qM());
                this.dyq.in(bpd2.dyQ.asw());
            }
            lfn.b(5, "SFQuestItemRemoverManager", "handleInventoryResourceRemoveItemsResponseMessage() System could not remove all the items.");
            return;
        }
        bok bok2 = bpd2.dyQ;
        if (bok2 == null) {
            lfn.b(5, "SFQuestItemRemoverManager", "handleInventoryResourceRemoveItemsResponseMessage() Complex Quest IS NULL!!!!");
            assert (false);
            return;
        }
        bop bop3 = bok2.lp(bok2.asy());
        if (bop3 == null) {
            lfn.b(5, "SFQuestItemRemoverManager", "handleInventoryResourceRemoveItemsResponseMessage() Quest IS NULL!!!!");
            assert (false);
            return;
        }
        if (!(bop3 instanceof bon) && !(bop3 instanceof bol)) {
            this.dyq.in(bok2.asw());
            assert (false) : "Invalid QuestType [" + bop3.asH() + "]";
            return;
        }
        int n2 = 0;
        boq boq2 = (boq)bop3;
        int[] nArray = new int[boq2.asW().size()];
        Iterator<Integer> iterator = boq2.asW().keySet().iterator();
        while (iterator.hasNext()) {
            nArray[n2] = iterator.next();
            ++n2;
        }
        gdd gdd2 = (gdd)this.MessageDelegator.h(10262, this.getGUID(), bok2.asz());
        gdd2.IP(2);
        gdd2.ap(nArray);
        gdd2.qd(bok2.asA());
        gdd2.iy(bok2.asw());
        gdd2.IQ(bop3.asH());
        this.MessageDelegator.F(gdd2);
        this.dyq.in(bok2.asw());
        this.dyq.im(bok2.asw());
        this.dyq.a(bok2, bop3.asN());
        this.dyz.a(bok2, (gdp)bpd2.dyO);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        block0 : switch (dxq2.bEz()) {
            case 8006: {
                this.a((fnd)dxq2);
                break;
            }
            case 11034: {
                gre gre2 = (gre)dxq2;
                int n = gre2.bWS();
                int n2 = gre2.bWR();
                switch (n2) {
                    case 8005: {
                        bpd bpd2 = this.dyA.remove(n);
                        if (bpd2 == null) {
                            lfn.b(5, "SFQuestItemRemoverManager", "receiveMessage() Could not find the entry in the ItemMap for this message : " + n + " Can not happen!");
                            assert (false);
                            return;
                        }
                        lfn.b(5, "SFQuestItemRemoverManager", "receiveMessage() MessageTag : " + n + " remove request failed for player :" + bpd2.dyP);
                        bok bok2 = bpd2.dyQ;
                        if (bok2 != null) {
                            bop bop2 = bok2.lp(bok2.asy());
                            this.a(false, bop2);
                        }
                        this.dyq.in(bpd2.dyQ.asw());
                        break block0;
                    }
                }
                lfn.b(5, "SFQuestItemRemoverManager", "receiveMessage() Unhandled error message :" + dxq2.getClass().getName());
                assert (false);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(boolean bl2, bop bop2) {
        if (bop2 == null) {
            return;
        }
        if (bop2 instanceof bon) {
            bon bon2 = (bon)bop2;
            bon2.dH(bl2);
            return;
        }
        if (bop2 instanceof bol) {
            bol bol2 = (bol)bop2;
            bol2.dH(bl2);
            return;
        }
    }
}

