/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class jbu
extends btk {
    private static final String TC = "SFQuestController";
    private buw mPM = null;
    private List<Integer> dza = lcn.emv();
    private Map<Integer, a> baH = lcn.emw();

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 10259: {
                this.a((gdm)dxq2);
                break;
            }
            case 10263: {
                this.a((gdn)dxq2);
            }
        }
    }

    private void a(gdm gdm2) {
        if (!gdm2.jeN) {
            if (this.mPM == null) {
                lfn.b(5, TC, "handleQuestTimeClientUpdateMessage() QuestID :" + gdm2.ayK + " is not active anymore but there is no time window open.");
                assert (false);
                return;
            }
            this.MessageDelegator.hd(this.mPM.getGUID());
            this.mPM = null;
            return;
        }
        if (this.mPM != null) {
            lfn.b(5, TC, "handleQuestTimeClientUpdateMessage() QuestID :" + gdm2.ayK + " is active again but there is a time window open already.");
            assert (false);
            return;
        }
        this.mPM = new buw(gdm2.ayK, gdm2.oV, gdm2.jeO);
        this.mPM.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.mPM);
    }

    private void a(gdn gdn2) {
        Object var2_2 = null;
        if (var2_2 == null) {
            lfn.b(5, TC, "handleQuestUpdateQuestStateClientMessage() Invalid parameters.");
            return;
        }
        block6: for (void var6_6 : var2_2) {
            int n = var6_6.mb;
            int n2 = var6_6.aDf;
            int n3 = var6_6.mPN;
            int[] nArray = var6_6.ioG;
            int[] nArray2 = var6_6.rlX;
            dty dty2 = lea.eoU().Cf(n2);
            if (dty2 == null) {
                lfn.b(5, TC, "handleQuestUpdateQuestStateClientMessage() There is no complex quest with id : " + n2);
                assert (false);
                continue;
            }
            mq mq2 = mq.getValueByOrdinal(n);
            switch (mq2) {
                case azr: {
                    Object object = dty2.Ce(n3);
                    if (object == null) {
                        lfn.b(5, TC, "handleQuestUpdateQuestStateClientMessage() There is no simple quest with index : " + n3 + " in complex quest : " + dty2.Name);
                        assert (false);
                        continue block6;
                    }
                    a a2 = null;
                    ArrayList<b> arrayList = null;
                    if (!gdn2.jeP) {
                        dtz.a[] aArray = ((due)object).TargetedResources;
                        if (aArray != null) {
                            arrayList = lcn.abH(aArray.length);
                            for (dtz.a a3 : aArray) {
                                int n4 = a3.az();
                                int n5 = a3.Amount;
                                arrayList.add(new b(this, n4, 0, n5));
                            }
                        }
                        a2 = new a(this, n2, n3, arrayList);
                        this.baH.put(n2, a2);
                        continue block6;
                    }
                    a2 = this.baH.get(n2);
                    if (a2 == null) {
                        lfn.b(5, TC, "handleQuestUpdateQuestStateClientMessage() There is no active quest with ID : " + n2);
                        assert (false);
                        continue block6;
                    }
                    for (int i = 0; i < nArray.length; ++i) {
                        int n6 = nArray[i];
                        int n7 = nArray2[i];
                        a2.fl(n6, n7);
                    }
                    continue block6;
                }
                case azt: {
                    Object object = this.baH.remove(n2);
                    if (object != null) continue block6;
                    lfn.b(5, TC, "handleQuestUpdateQuestStateClientMessage() Quest : " + n2 + " is not in active list.");
                    assert (false);
                    return;
                }
                case azu: {
                    Object object = this.baH.remove(n2);
                    if (object == null) {
                        lfn.b(5, TC, "handleQuestUpdateQuestStateClientMessage() Quest : " + n2 + " is not in active list.");
                        assert (false);
                        return;
                    }
                    if (this.dza.contains(n2)) {
                        return;
                    }
                    this.dza.add(n2);
                    continue block6;
                }
                case azs: {
                    Object object = this.baH.remove(n2);
                    if (object != null) continue block6;
                    lfn.b(5, TC, "handleQuestUpdateQuestStateClientMessage() Quest : " + n2 + " is not in active list.");
                    assert (false);
                    return;
                }
            }
        }
    }
}

