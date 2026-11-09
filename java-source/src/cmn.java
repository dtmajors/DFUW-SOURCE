/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;

@XStreamAlias(value="HarvestingInfo")
public class cmn {
    private String ResourceName;
    private float PersonalBankProbability;
    private int OpenAllAtPopulation;
    private int OpenResourceMonolithPerPlayers;
    private String PlayerSpecialEffect;
    private List<a> HarvestingItemList = lcn.emv();

    public a eC(float f) {
        assert (this.HarvestingItemList != null);
        float f2 = 0.0f;
        int n = this.HarvestingItemList.size();
        for (int i = 0; i < n; ++i) {
            if (!((f2 += this.HarvestingItemList.get(i).Probability) >= f)) continue;
            return this.HarvestingItemList.get(i);
        }
        return null;
    }

    public final String pa() {
        return this.ResourceName;
    }

    public final float aTl() {
        return this.PersonalBankProbability;
    }

    public final String aTm() {
        return this.PlayerSpecialEffect;
    }

    public final int aTn() {
        return this.OpenAllAtPopulation;
    }

    public final int aTo() {
        return this.OpenResourceMonolithPerPlayers;
    }
}

