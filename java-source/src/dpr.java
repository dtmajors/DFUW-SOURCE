/*
 * Decompiled with CFR.
 */
import java.util.List;

public class dpr {
    private String Filename = null;
    private String ID = null;
    private String dKs = null;
    private ldv GUID = null;
    private dpp gNd = null;
    private List<dpp> gNe = null;
    private List<dpp> gNf = null;

    public String bsl() {
        return this.Filename;
    }

    public void cd(String string) {
        this.Filename = string;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String string) {
        this.ID = string;
    }

    public String axm() {
        return this.dKs;
    }

    public void gh(String string) {
        this.dKs = string;
    }

    public ldv getGUID() {
        return this.GUID;
    }

    public void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public dpp bsm() {
        return this.gNd;
    }

    public List<dpp> bsn() {
        return this.gNe;
    }

    public void aI(List<dpp> list) {
        if (list == null || list.isEmpty()) {
            lfn.b(5, this.getClass().getSimpleName(), "setElementInfos() : ElementInfos parameter is " + (list == null ? "null" : "empty") + " for Village '" + this.ID + "'!!!");
            assert (false);
            return;
        }
        for (dpp dpp2 : list) {
            if (dpp2.aYr()) {
                if (this.gNe == null) {
                    this.gNe = lcn.emA();
                }
                this.gNe.add(dpp2);
                continue;
            }
            if (dpp2.aYq()) {
                this.gNd = dpp2;
                continue;
            }
            lfn.b(5, this.getClass().getSimpleName(), "setElementInfos() : ElementInfo is unrecognised!!!... ElementInfo = " + dpp2);
            assert (false);
        }
        if (this.gNd == null) {
            lfn.b(5, this.getClass().getSimpleName(), "setElementInfos() : No Control-Point found in element infos for Village '" + this.ID + "'!!!");
            assert (false);
        }
        if (this.gNe == null || this.gNe.isEmpty()) {
            lfn.b(5, this.getClass().getSimpleName(), "setElementInfos() : No houses found in element infos!!! for Village '" + this.ID + "'!!!");
            assert (false);
        }
    }
}

