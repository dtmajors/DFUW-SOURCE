/*
 * Decompiled with CFR.
 */
import java.util.List;

public class kxh {
    private String add;
    private ldv aDn;
    private final ldv GUID;
    private String Name;
    private List<kxg> aDm = lcn.emv();

    public kxh(ldv ldv2) {
        this.GUID = ldv2;
    }

    public void a(String string, String string2, ldv ldv2) {
        this.aDn = ldv2;
        this.add = string2;
        this.Name = string;
    }

    public ldv getGUID() {
        return this.GUID;
    }

    public String getName() {
        return this.Name;
    }

    public void a(kxg kxg2) {
        this.aDm.add(kxg2);
    }

    public List<kxg> YG() {
        return this.aDm;
    }

    public int eic() {
        return this.aDm.size();
    }
}

