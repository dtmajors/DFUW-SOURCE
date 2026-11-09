/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class boz
extends btk {
    private static final Random bSe = new Random(System.nanoTime());
    private final boy dyD;
    private final Map<Integer, bok> dyE = lcn.emw();
    private int dyF = 0;

    public boz(boy boy2) {
        this.dyD = boy2;
    }

    public void a(bok bok2, dty dty2) {
    }

    public void a(bok bok2, dty dty2, int n, ldv ldv2) {
        int n2 = bok2.asy();
        due due2 = dty2.Ce(n2);
        if (due2 == null) {
            lfn.b(5, "SFQuestRewarder", "rewardSubQuest() SFSimpleQuestDefinition for number " + n2 + " For SFComplexQuestDefinition " + dty2.Name + " is NULL");
            assert (false);
            return;
        }
        dtz.b[] bArray = due2.Rewards;
        if (bArray == null || bArray.length == 0) {
            lfn.b(5, "SFQuestRewarder", "rewardSubQuest() NO Rewards here : " + due2.Name);
            return;
        }
        ArrayList<lil<Integer, Integer, Boolean>> arrayList = lcn.emv();
        lil<int[], int[], float[]> lil2 = due2.bAU();
        float f2 = bSe.nextFloat();
        float f3 = 0.0f;
        boolean bl2 = false;
        for (int i = 0; i < ((int[])lil2.reX).length; ++i) {
            int n3 = ((int[])lil2.reX)[i];
            int n4 = ((int[])lil2.reY)[i];
            float f4 = ((float[])lil2.reZ)[i];
            if (f4 != 1.0f && bl2) continue;
            if (f4 != 1.0f) {
                float f5 = f4;
                if (f2 >= (f3 += f5)) continue;
                bl2 = true;
                continue;
            }
            if (bok2.asD() && lea.enW().isDescendant(n3, cug.fkb)) {
                int n5 = due2.bAR();
                int n6 = due2.aCE();
                n4 += cug.a.getGoldRewardPieces(n6, n - n5);
            }
            arrayList.add(new lil<Integer, Integer, Boolean>(n3, n4, Boolean.FALSE));
        }
        int[] nArray = new int[arrayList.size()];
        int[] nArray2 = new int[arrayList.size()];
        boolean[] blArray = new boolean[arrayList.size()];
        for (int i = 0; i < arrayList.size(); ++i) {
            lil lil3 = (lil)arrayList.get(i);
            nArray[i] = (Integer)lil3.reX;
            nArray2[i] = (Integer)lil3.reY;
            blArray[i] = (Boolean)lil3.reZ;
        }
        fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.getGUID(), bok2.asz());
        fmz2.bqd = nArray;
        fmz2.iIY = nArray2;
        fmz2.aqs = this.dyF;
        fmz2.b(bqy.dGv);
        this.MessageDelegator.F(fmz2);
        this.dyE.put(this.dyF, bok2);
        ++this.dyF;
        this.dyD.a(ldv2, nArray, nArray2, blArray);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7956: {
                fna fna2 = (fna)dxq2;
                int n = fna2.aqs;
                if (!this.dyE.containsKey(n)) {
                    lfn.b(5, "SFQuestRewarder", "receiveMessage() Could not find the entry in the CreateResourceRequestMap for this message. Can not happen!");
                    assert (false);
                    return;
                }
                if (fna2.iQK) break;
                this.dyE.remove(n);
                lfn.b(5, "SFQuestRewarder", "receiveMessage Resource Creation Failed.Probably someone will complain for this prety soon");
                assert (false);
                return;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

