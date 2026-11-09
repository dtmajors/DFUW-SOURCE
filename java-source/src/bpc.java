/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bpr
 *  cug
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections.MultiMap;

public class bpc
extends btk {
    public static boolean dyI = true;
    private Map<ldv, dty> dyi = null;
    private final Map<ldv, fks> dyJ = lcn.emw();
    private final MultiMap dyK = lcn.emB();
    private final Map<ldv, lfs<ldv, Map<Integer, Integer>>> dyL = lcn.emw();
    private final Map<ldv, lfs<ldv, Map<Integer, Integer>>> dyM = lcn.emw();
    private final bpr dyN;

    public lil<dty, Integer, Long> a(ldv ldv2, bpg bpg2, ldv ldv3, boolean bl2) {
        List<Integer> list;
        int n;
        int n2;
        dty dty2 = this.dyi.get(ldv3);
        if (dty2 == null) {
            lfn.b(5, "SFQuestVerifier", "verifyQuest() There is no Quest in quest definition map for GUID " + ldv3);
            assert (false);
            return null;
        }
        lil<Object, Object, Object> lil2 = new lil<Object, Object, Object>(null, null, null);
        if (bpg2.dzb.contains(dty2.ID)) {
            lil2.reY = gcr.jdm.ordinal();
            return lil2;
        }
        if (dty2.HighScoreRecording) {
            for (n2 = 0; n2 < bpg2.dzb.size(); ++n2) {
                n = bpg2.dzb.get(n2);
                list = lea.eoU().Cf(n);
                if (!((dty)((Object)list)).HighScoreRecording) continue;
                lil2.reY = gcr.jdq.ordinal();
                return lil2;
            }
        }
        for (n2 = 0; n2 < bpg2.dzb.size(); ++n2) {
            n = bpg2.dzb.get(n2);
            list = lea.eoU().Cf(n);
            List<due> list2 = ((dty)((Object)list)).bAF();
            boolean bl3 = false;
            for (due due2 : list2) {
                if (!due2.bAQ()) continue;
                bl3 = true;
                break;
            }
            List<due> list3 = dty2.bAF();
            for (int i = 0; i < list3.size(); ++i) {
                due due3 = (due)list3.get(i);
                if (!due3.bAQ() || !bl3) continue;
                lil2.reY = gcr.jdr.ordinal();
                return lil2;
            }
        }
        if (bpg2.dyZ.contains(dty2.ID)) {
            lil2.reY = gcr.jdr.ordinal();
            return lil2;
        }
        if (!bl2 && bpg2.dze >= 15) {
            lil2.reY = gcr.jdo.ordinal();
            return lil2;
        }
        if (bpg2.dyL != null && bpg2.dyL.size() > 0) {
            lfs<ldv, Map<Integer, Integer>> lfs2 = new lfs<ldv, Map<Integer, Integer>>(ldv2, bpg2.dyL);
            this.dyL.put(ldv2, lfs2);
        }
        if (bpg2.dyM != null && bpg2.dyM.size() > 0) {
            lfs<ldv, Map<Integer, Integer>> lfs3 = new lfs<ldv, Map<Integer, Integer>>(ldv2, bpg2.dyM);
            this.dyM.put(ldv2, lfs3);
        }
        if (dyI) {
            List<Integer> list4 = bpg2.dza;
            if (list4.contains(dty2.ID)) {
                lil2.reY = gcr.jdn.ordinal();
                return lil2;
            }
            Map<Integer, Long> map = bpg2.dzd;
            if (map.containsKey(dty2.ID)) {
                lil2.reX = dty2;
                lil2.reY = gcr.jds.ordinal();
                lil2.reZ = bpg2.dzd.get(dty2.ID);
                return lil2;
            }
            list = bpg2.dzf;
            if (list.contains(dty2.ID)) {
                lil2.reY = gcr.jdl.ordinal();
                return lil2;
            }
        }
        lil2.reX = dty2;
        lil2.reY = gcr.jdj.ordinal();
        return lil2;
    }

    public Map<Integer, lfs<bpj, Integer>> a(ldv ldv2, bpg bpg2, boolean bl2) {
        Map<Integer, lfs<bpj, Integer>> map = lcn.emw();
        if (this.dyi == null) {
            assert (false) : "QuestDefinitionMap is empty";
            return map;
        }
        int n = 0;
        for (dty dty2 : this.dyi.values()) {
            dty dty3 = lea.eoU().Cf(dty2.ID);
            bpj bpj2 = new bpj();
            if (dty3 == null) {
                assert (false) : "Definition For Quest :" + dty2.ID + " Is NULL.Quest Index File Is Not Commited";
                continue;
            }
            lil<dty, Integer, Long> lil2 = this.a(ldv2, bpg2, dty3.bAE(), bl2);
            if (lil2.reX != null) {
                ljg ljg2 = new ljg(dty3.ShortDescription);
                int n2 = lea.enW().getType(dty3.FactionAvatar);
                bpj2.setGUID(dty3.bAE());
                bpj2.b(ljg2);
                bpj2.lG(n2);
                if (((Integer)lil2.reY).intValue() == gcr.jds.ordinal()) {
                    bpj2.fV(String.valueOf((Long)lil2.reZ));
                }
                ArrayList<lfs<Integer, Integer>> arrayList = lcn.emv();
                int[] nArray = dty3.SubQuestIDs;
                boolean bl3 = false;
                for (int n3 : nArray) {
                    due due2 = lea.eoU().Cg(n3);
                    if (due2 == null) {
                        assert (false) : "QuestIndex File Out Of Sync Quest :" + dty3.Name + " SubID :" + n3;
                        continue;
                    }
                    dtz.b[] bArray = due2.Rewards;
                    if (bArray == null && !due2.asP()) {
                        assert (false) : "Its not a step quest.Specify rewards for it";
                        continue;
                    }
                    if (bArray == null) continue;
                    for (dtz.b b2 : bArray) {
                        int n4 = lea.enW().getType(b2.ResourceName);
                        boolean bl4 = lea.enW().isDescendant(n4, cug.fks);
                        if (bl4) continue;
                        if ((double)b2.Probability == 1.0) {
                            arrayList.add(new lfs<Integer, Integer>(n4, b2.Amount));
                            continue;
                        }
                        bl3 = true;
                    }
                }
                if (bl3) {
                    arrayList.add(new lfs<Integer, Integer>(cug.fkt, 1));
                }
                int n5 = 0;
                int[] nArray2 = new int[arrayList.size()];
                int[] nArray3 = new int[arrayList.size()];
                for (lfs lfs2 : arrayList) {
                    nArray2[n5] = (Integer)lfs2.reX;
                    nArray3[n5] = (Integer)lfs2.reY;
                    ++n5;
                }
                bpj2.s(nArray2);
                bpj2.t(nArray3);
                ljg2 = new ljg(this.dyN.atI().a(dty2, bpg2));
                bpj2.c(ljg2);
                ljg2 = new ljg(dty3.Name);
                bpj2.a(ljg2);
                bpj2.lF(n);
                ++n;
                bpj2.setType(1);
                map.put(dty3.ID, new lfs<bpj, Integer>(bpj2, gcr.jdj.ordinal()));
                continue;
            }
            map.put(dty3.ID, new lfs(null, lil2.reY));
        }
        return map;
    }

    public void a(ldv ldv2, fks fks2) {
        this.dyJ.put(ldv2, fks2);
    }

    public Map<ldv, fks> atd() {
        return this.dyJ;
    }

    public void a(ldv ldv2, fku fku2) {
        this.dyK.put(ldv2, fku2);
    }

    public MultiMap ate() {
        return this.dyK;
    }

    public void v(Map<ldv, dty> map) {
        this.dyi = map;
    }

    public Map<ldv, lfs<ldv, Map<Integer, Integer>>> atf() {
        return this.dyL;
    }

    public Map<ldv, lfs<ldv, Map<Integer, Integer>>> atg() {
        return this.dyM;
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    public bpc(bpr bpr2) {
        this.dyN = bpr2;
    }
}

