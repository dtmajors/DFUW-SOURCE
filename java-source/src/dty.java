/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.ArrayList;
import java.util.List;

@XStreamAlias(value="SFComplexQuest")
public class dty
extends dtz {
    public String FactionAvatar = "";
    public boolean OneTimeOnly;
    public long AvailabilityTimeWindow = 0L;
    public boolean RestartIfFailed;
    public boolean RestartIfCancelled;
    public boolean HighScoreRecording;
    public int[] SolvedQuestsRequirement = new int[0];
    public int[] SubQuestIDs = new int[0];
    private ldv ComplexQuestGUID = null;

    public ldv bAE() {
        if (this.ComplexQuestGUID == null) {
            this.ComplexQuestGUID = new ldv(0, 0, this.ID);
        }
        return this.ComplexQuestGUID;
    }

    public due Ce(int n) {
        return lea.eoU().bZ(this.ID, n);
    }

    public List<due> bAF() {
        ArrayList<due> arrayList = lcn.abH(this.SubQuestIDs.length);
        for (int n : this.SubQuestIDs) {
            due due2 = lea.eoU().Cg(n);
            arrayList.add(due2);
        }
        return arrayList;
    }

    public boolean qU() {
        boolean bl;
        int n = this.SubQuestIDs.length;
        if (n != 1) {
            return false;
        }
        due due2 = lea.eoU().Cg(this.SubQuestIDs[0]);
        boolean bl2 = bl = due2.Type == dud.hdQ;
        if (!bl) {
            return false;
        }
        int n2 = due2.TargetedResources.length;
        if (n2 != 1) {
            return false;
        }
        int n3 = due2.TargetedResources[0].LeastTargets;
        if (n3 == -1) {
            return false;
        }
        return due2.bAQ();
    }

    public boolean bAG() {
        if (this.OneTimeOnly) {
            return false;
        }
        return this.AvailabilityTimeWindow != -1L;
    }

    public long bAH() {
        return this.AvailabilityTimeWindow;
    }

    public void Z(long l2) {
        this.AvailabilityTimeWindow = l2;
    }

    public boolean bAI() {
        List<due> list = this.bAF();
        for (due due2 : list) {
            if (!due2.bAQ()) continue;
            return true;
        }
        return false;
    }

    @Override
    public String getDisplayName() {
        if (this.DisplayName != null) {
            return this.DisplayName.bD(this.getParameters()).exA();
        }
        this.DisplayName = lpd.rHs.BE("Quest." + this.Name.replace("", "_").toLowerCase() + "_DisplayName");
        return this.DisplayName != null ? this.DisplayName.bD(this.getParameters()).exA() : "";
    }

    @Override
    public Object[] getParameters() {
        return null;
    }
}

