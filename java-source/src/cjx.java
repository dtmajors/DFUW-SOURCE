/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class cjx {
    private boolean avz;
    private int adk;
    private String Name;
    private String DisplayName;
    private String jD;
    private String eEO;
    private cjv eEP;
    private List<Integer> eEQ = lcn.abH(3);
    private Map<Integer, ckd> eER = lcn.abI(8);
    private TreeMap<bqm.d, ckg> eES = lcn.emG();
    private Map<Integer, Float> eET = lcn.abI(3);
    private Map<bqm.d, cfg.a> eEU = lcn.emw();

    public int getIndex() {
        return this.adk;
    }

    public void setIndex(int n) {
        this.adk = n;
    }

    public String aQu() {
        return this.eEO;
    }

    public void ht(String string) {
        this.eEO = string;
    }

    public cjv aQv() {
        return this.eEP;
    }

    public void b(cjv cjv2) {
        this.eEP = cjv2;
    }

    public List<Integer> aQw() {
        return this.eEQ;
    }

    public void av(List<Integer> list) {
        this.eEQ = list;
    }

    public Map<Integer, ckd> aQx() {
        return this.eER;
    }

    public void A(Map<Integer, ckd> map) {
        this.eER = map;
    }

    public TreeMap<bqm.d, ckg> aQy() {
        return this.eES;
    }

    public Map<bqm.d, cfg.a> aQz() {
        return this.eEU;
    }

    public void a(TreeMap<bqm.d, ckg> treeMap) {
        this.eES = treeMap;
    }

    public Map<Integer, Float> aQA() {
        return this.eET;
    }

    public void B(Map<Integer, Float> map) {
        this.eET = map;
    }

    public ckd qQ(int n) {
        return this.eER.get(n);
    }

    public final String getDescription() {
        return this.jD;
    }

    public final void setDescription(String string) {
        this.jD = string;
    }

    public final String getDisplayName() {
        return this.DisplayName;
    }

    public final void setDisplayName(String string) {
        this.DisplayName = string;
    }

    public final String getName() {
        return this.Name;
    }

    public final void setName(String string) {
        this.Name = string;
    }

    public int aT(int n, int n2) {
        for (Map.Entry<Integer, ckd> entry : this.eER.entrySet()) {
            if (entry.getValue().aQL() != n || entry.getValue().aQM() != n2) continue;
            return entry.getKey();
        }
        return -1;
    }

    public boolean isEnabled() {
        return this.avz;
    }

    public void setEnabled(boolean bl) {
        this.avz = bl;
    }
}

