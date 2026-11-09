/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  ep
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.ArrayList;
import java.util.List;

@XStreamAlias(value="SFSimpleQuest")
public class due
extends dtz {
    public String QuestEndNpcName = null;
    public String QuestEndTargetMarkerCaption = null;
    public boolean ShowMarkerOnTarget = false;
    public boolean NonAliveTarget = false;
    private String TimeLimit = null;
    public transient int[] hdV = null;
    public boolean SurvivalMode = false;
    private boolean ChainQuest = false;
    public String QuestFinishedText = null;
    public String QuestDiaryText = null;
    public String UseSkillMessage = "";
    public boolean OverrideTextProgression = false;
    public dtz.a[] TargetedResources = new dtz.a[0];
    public dtz.b[] Rewards = new dtz.b[0];
    public String SkillName = "";
    public int SkillType = -1;
    @XStreamAlias(value="Marker")
    public duc[] Markers = null;
    public boolean LinkedSpawnpoints = false;
    private transient List<dub> hdW = null;

    public long bAN() {
        this.bAP();
        return this.hdV != null ? (long)(this.hdV[0] * 3600 + this.hdV[1] * 60 + this.hdV[2]) : 0L;
    }

    public String bAO() {
        return this.TimeLimit;
    }

    public void jx(String string) {
        this.TimeLimit = string;
        this.bAP();
    }

    private void bAP() {
        block4: {
            if (this.TimeLimit == null || this.TimeLimit.trim().equals("")) {
                return;
            }
            if (this.hdV != null) {
                return;
            }
            this.hdV = new int[3];
            String[] stringArray = this.TimeLimit.split(":");
            try {
                this.hdV[0] = Integer.parseInt(stringArray[0]);
                this.hdV[1] = Integer.parseInt(stringArray[1]);
                this.hdV[2] = Integer.parseInt(stringArray[2]);
            }
            catch (NumberFormatException numberFormatException) {
                if ($assertionsDisabled) break block4;
                throw new AssertionError((Object)("Time Limit Format : " + this.TimeLimit));
            }
        }
    }

    public boolean bAQ() {
        return this.TimeLimit != null && !this.TimeLimit.trim().equals("");
    }

    public int bAR() {
        return this.TargetedResources[0].LeastTargets;
    }

    public int aCE() {
        return lea.enW().getType(this.TargetedResources[0].ResourceName);
    }

    public int Cm(int n) {
        for (int i = 0; i < this.TargetedResources.length; ++i) {
            if (!lea.enW().isDescendant(n, this.TargetedResources[i].az())) continue;
            return this.TargetedResources[i].Amount;
        }
        lfn.b(5, "SFSimpleQuestDefinition", "getResourceTypeRequiredQuantity Resource [" + n + "] is not a targeted item");
        return 0;
    }

    public int Cn(int n) {
        String string = lea.enW().getName(n);
        if (string == null) {
            return 0;
        }
        int n2 = lea.enW().getType(string);
        for (int i = 0; i < this.TargetedResources.length; ++i) {
            String string2 = this.TargetedResources[i].ResourceName;
            int n3 = lea.enW().getType(string2);
            if (!lea.enW().isDescendant(n2, n3)) continue;
            return n3;
        }
        return 0;
    }

    public int[] bAS() {
        int[] nArray = new int[this.TargetedResources.length];
        for (int i = 0; i < this.TargetedResources.length; ++i) {
            nArray[i] = this.TargetedResources[i].az();
        }
        return nArray;
    }

    public int bAT() {
        return lea.enW().getType(this.TargetedResources[0].ResourceName);
    }

    public lil<int[], int[], float[]> bAU() {
        lil<int[], int[], float[]> lil2 = new lil<int[], int[], float[]>(new int[this.Rewards.length], new int[this.Rewards.length], new float[this.Rewards.length]);
        for (int i = 0; i < this.Rewards.length; ++i) {
            ((int[])lil2.reX)[i] = lea.enW().getType(this.Rewards[i].ResourceName);
            ((int[])lil2.reY)[i] = this.Rewards[i].Amount;
            ((float[])lil2.reZ)[i] = this.Rewards[i].Probability;
        }
        return lil2;
    }

    public int ata() {
        if (this.SkillType == -1) {
            this.SkillType = lea.enZ().getType(this.SkillName);
        }
        return this.SkillType;
    }

    public boolean asP() {
        return this.ChainQuest;
    }

    public void dB(boolean bl) {
        switch (this.Type) {
            case hdS: 
            case hdQ: {
                this.ChainQuest = bl;
                break;
            }
            default: {
                if (bl) {
                    lfn.b(5, "SFSimpleQuestDefinition", "setChainQuest() Only A Use Skill On Object Quest Or A Kill Quest Can Be A Chain Quest.Quest Name [" + this.Name + "] QuestID [" + this.ID + "]");
                    assert (false);
                }
                this.ChainQuest = false;
            }
        }
    }

    public void jJ(boolean bl) {
        if (this.Markers == null) {
            return;
        }
        if (this.hdW != null && !bl) {
            return;
        }
        if (this.hdW == null) {
            this.hdW = lcn.emv();
        } else {
            this.hdW.clear();
        }
        block6: for (duc duc2 : this.Markers) {
            mqm.a a2 = mqm.a.getValueByName(duc2.bAM());
            dub dub2 = null;
            switch (a2) {
                case Eee: {
                    Object object = mws.DQ(duc2.getFileName());
                    if (object == null) {
                        lfn.b(5, "SFSimpleQuestDefinition", "setupMarkers() Spawnpoint Attributes are null for : " + duc2.getFileName());
                        assert (false);
                        continue block6;
                    }
                    if (((lfs)object).reX == null) {
                        lfn.b(5, "SFSimpleQuestDefinition", "setupMarkers() Position for Spawnpoint : " + duc2.getFileName() + " and for quest : " + this.Name + " is NULL.");
                        assert (false);
                        continue block6;
                    }
                    if (((lfs)object).reY == null) {
                        lfn.b(5, "SFSimpleQuestDefinition", "setupMarkers() Radius for Spawnpoint : " + duc2.getFileName() + " and for quest : " + this.Name + " is NULL.");
                        assert (false);
                        continue block6;
                    }
                    dub2 = new dub(duc2.Caption, (ljq)((lfs)object).reX, bpk.getOrdinalByName(duc2.MarkerIconType), a2.ordinal(), ((Float)((lfs)object).reY).floatValue(), duc2.isVisible());
                    break;
                }
                case Eei: {
                    Object object = mws.DS(duc2.getFileName());
                    if (object == null) {
                        lfn.b(5, "SFSimpleQuestDefinition", "setupMarkers() Position for Quest Item : " + duc2.getFileName() + " and for quest : " + this.Name + " is NULL.");
                        assert (false);
                        continue block6;
                    }
                    dub2 = new dub(duc2.Caption, (ljq)object, bpk.getOrdinalByName(duc2.MarkerIconType), a2.ordinal(), 0.0f, duc2.isVisible());
                    break;
                }
                case Eej: {
                    Object object = mws.DS(duc2.getFileName());
                    if (object == null) {
                        lfn.b(5, "SFSimpleQuestDefinition", "setupMarkers() Position for Portal : " + duc2.getFileName() + " and for quest : " + this.Name + " is NULL.");
                        assert (false);
                        continue block6;
                    }
                    dub2 = new dub(duc2.Caption, (ljq)object, bpk.getOrdinalByName(duc2.MarkerIconType), a2.ordinal(), 0.0f, duc2.isVisible());
                    break;
                }
                case Eel: {
                    if (duc2.av() == null) {
                        lfn.b(5, "SFSimpleQuestDefinition", "setupMarkers() Position Free Marker : " + duc2.getFileName() + " and for quest : " + this.Name + " is NULL.");
                        assert (false);
                        continue block6;
                    }
                    dub2 = new dub(duc2.Caption, duc2.av(), bpk.getOrdinalByName(duc2.MarkerIconType), a2.ordinal(), 0.0f, duc2.isVisible());
                    break;
                }
                default: {
                    lfn.b(5, "SFSimpleQuestDefinition", "setupMarkers() Unknown Quest Market Type [" + duc2.bAM() + "]");
                    assert (false);
                    continue block6;
                }
            }
            assert (dub2 != null);
            this.hdW.add(dub2);
        }
        this.bAV();
    }

    private void bAV() {
        ljq ljq2;
        if (this.QuestEndNpcName == null || this.QuestEndNpcName.trim().equals("")) {
            return;
        }
        if (this.ChainQuest) {
            return;
        }
        if (!this.ShowMarkerOnTarget) {
            return;
        }
        assert (this.QuestEndTargetMarkerCaption != null);
        assert (!this.QuestEndTargetMarkerCaption.trim().equals(""));
        ljq ljq3 = ljq2 = !this.NonAliveTarget ? mws.DR(this.QuestEndNpcName) : mws.DT(this.QuestEndNpcName);
        if (ljq2 == null) {
            lfn.b(5, "SFSimpleQuestDefinition", "createMarkers()  Quest :" + this.Name + " Position is null for Marker : " + this.QuestEndTargetMarkerCaption);
            return;
        }
        int n = -1;
        switch (this.Type) {
            case hdO: {
                n = bpk.dzR.ordinal();
                break;
            }
            case hdR: {
                n = bpk.dzQ.ordinal();
                break;
            }
            default: {
                n = bpk.dzP.ordinal();
            }
        }
        dub dub2 = new dub(this.QuestEndTargetMarkerCaption, ljq2, n, mqm.a.Eed.ordinal(), 0.0f, true);
        this.hdW.add(dub2);
    }

    public List<dub> Co(int n) {
        if (this.hdW == null || this.hdW.isEmpty()) {
            return null;
        }
        ArrayList<dub> arrayList = lcn.emv();
        for (int i = 0; i < this.hdW.size(); ++i) {
            if (this.hdW.get((int)i).Type != n) continue;
            arrayList.add(this.hdW.get(i));
        }
        return arrayList;
    }

    public List<dub> bAW() {
        if (this.hdW == null || this.hdW.isEmpty()) {
            return null;
        }
        ArrayList<dub> arrayList = lcn.emv();
        block3: for (dub dub2 : this.hdW) {
            bpk bpk2 = bpk.getValueByOrdinal(dub2.Type);
            switch (bpk2) {
                case dzR: 
                case dzQ: 
                case dzP: {
                    continue block3;
                }
            }
            arrayList.add(dub2);
        }
        return arrayList;
    }

    public List<dub> bAX() {
        if (this.hdW == null || this.hdW.isEmpty()) {
            return null;
        }
        ArrayList<dub> arrayList = lcn.emv();
        for (dub dub2 : this.hdW) {
            if (dub2.aln != mqm.a.Eee.ordinal()) continue;
            arrayList.add(dub2);
        }
        return arrayList;
    }

    public List<dub> bAY() {
        return this.hdW;
    }

    @Override
    public String getDisplayName() {
        if (this.DisplayName != null) {
            return this.DisplayName.bD(this.getParameters()).exA();
        }
        this.DisplayName = lpd.rHs.BE("Quest.Simple." + this.Name.replace(" ", "_").toLowerCase() + "_DisplayName");
        return this.DisplayName != null ? this.DisplayName.bD(this.getParameters()).exA() : "";
    }

    @Override
    public Object[] getParameters() {
        if (this.Parameters != null) {
            return this.Parameters;
        }
        switch (this.Type) {
            case hdN: {
                due due2 = this;
                int n = cug.fkp;
                String string = ep.aM((int)2112);
                int n2 = cug.fkp;
                int n3 = cxd.fIx;
                int n4 = cug.fkp;
                int n5 = cug.fkp;
                String string2 = "";
                String string3 = "";
                String string4 = "";
                this.Parameters = new Object[]{n, n2, n3, n4, n5, 0, "", "", "", string};
                break;
            }
            case hdO: {
                due due3 = this;
                int n = cug.fkp;
                String string = ep.aM((int)2112);
                int n6 = cug.fkp;
                int n7 = cxd.fIx;
                int n8 = cug.fkp;
                int n9 = cug.fkp;
                String string5 = "";
                String string6 = "";
                String string7 = "";
                this.Parameters = new Object[]{n, n6, n7, n8, n9, 0, "", "", "", string};
                break;
            }
            case hdP: {
                due due4 = this;
                int n = cug.fkp;
                String string = ep.aM((int)2112);
                int n10 = cug.fkp;
                int n11 = cxd.fIx;
                int n12 = cug.fkp;
                int n13 = cug.fkp;
                String string8 = "";
                String string9 = "";
                String string10 = "";
                this.Parameters = new Object[]{n, n10, n11, n12, n13, 0, "", "", "", string};
                break;
            }
            case hdQ: {
                due due5 = this;
                int n = cug.fkp;
                String string = ep.aM((int)2112);
                int n14 = cug.fkp;
                int n15 = cxd.fIx;
                String string11 = "";
                int n16 = cug.fkp;
                int n17 = cug.fkp;
                String string12 = "";
                String string13 = "";
                this.Parameters = new Object[]{n, n14, n15, n16, n17, 0, "", "", "", string};
                break;
            }
            case hdR: {
                due due6 = this;
                int n = cug.fkp;
                String string = ep.aM((int)2112);
                int n18 = cug.fkp;
                int n19 = cxd.fIx;
                int n20 = cug.fkp;
                int n21 = cug.fkp;
                String string14 = "";
                String string15 = "";
                String string16 = "";
                this.Parameters = new Object[]{n, n18, n19, n20, n21, 0, "", "", "", string};
                break;
            }
            case hdS: {
                due due7 = this;
                int n = cug.fkp;
                String string = ep.aM((int)2112);
                int n22 = cug.fkp;
                int n23 = cxd.fIx;
                int n24 = cug.fkp;
                int n25 = cug.fkp;
                String string17 = "";
                String string18 = "";
                String string19 = "";
                this.Parameters = new Object[]{n, n22, n23, n24, n25, 0, "", "", "", string};
                break;
            }
        }
        return this.Parameters;
    }
}

