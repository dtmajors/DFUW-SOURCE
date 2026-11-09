/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections.MultiHashMap;

public class cgg {
    private final Map<String, Float> exb = lcn.emw();
    private final Map<Integer, cgq> exc = lcn.emw();
    private final Map<String, cgq> exd = lcn.emw();
    private final Map<Integer, List<cgr>> exe = lcn.emw();
    private final Map<String, cgu> exf = lcn.emw();
    private final Map<Integer, cgu> exg = lcn.emw();
    private final Map<String, cgr> exh = lcn.emw();
    private final Map<Integer, cgr> exi = lcn.emw();
    private final Map<cgi, List<cgr>> exj = lcn.emw();
    private final MultiHashMap exk = (MultiHashMap)lcn.emB();
    private final Map<Integer, List<cgw>> exl = lcn.emw();

    public void c(String string, float f2) {
        this.exb.put(string.toLowerCase(), Float.valueOf(f2));
    }

    public float hk(String string) {
        for (Map.Entry<String, Float> entry : this.exb.entrySet()) {
            if (!entry.getKey().equalsIgnoreCase(string)) continue;
            return entry.getValue().floatValue();
        }
        return 0.0f;
    }

    public void a(cgq cgq2) {
        assert (!this.exc.containsKey(cgq2.adk)) : " Duplicate GroupIndex : " + cgq2.adk + " GroupName : " + cgq2.Name;
        assert (!this.exd.containsKey(cgq2.Name.toLowerCase())) : "Duplicate GroupName : " + cgq2.Name;
        this.exc.put(cgq2.adk, cgq2);
        this.exd.put(cgq2.Name.toLowerCase(), cgq2);
        Map<Integer, cgu> map = cgq2.eyF;
        for (cgu cgu2 : map.values()) {
            assert (!this.exg.containsKey(cgu2.adk)) : "Duplicate SubGroupIndex : " + cgu2.adk + " SubGroupName : " + cgu2.Name;
            assert (!this.exf.containsKey(cgu2.Name.toLowerCase())) : "Duplicate SubGroupName : " + cgu2.Name;
            this.exg.put(cgu2.adk, cgu2);
            this.exf.put(cgu2.Name.toLowerCase(), cgu2);
            Map<Integer, cgr> map2 = cgu2.eyH;
            for (cgr cgr2 : map2.values()) {
                assert (!this.exi.containsKey(cgr2.adk)) : "Duplicate FeatIndex : " + cgr2.adk + " FeatName : " + cgr2.Name;
                assert (!this.exh.containsKey(cgr2.Name.toLowerCase())) : "Duplicate FeatName : " + cgr2.Name;
                List<cgr> list = this.exe.get(cgq2.adk);
                if (list == null) {
                    list = lcn.emv();
                    this.exe.put(cgq2.adk, list);
                }
                list.add(cgr2);
                this.exi.put(cgr2.adk, cgr2);
                this.exh.put(cgr2.Name.toLowerCase(), cgr2);
                che che2 = cgr2.eyU;
                List<cgr> list2 = this.exj.get((Object)che2.aOG());
                if (list2 == null) {
                    list2 = lcn.emv();
                    this.exj.put(che2.aOG(), list2);
                }
                list2.add(cgr2);
                for (String string : cgr2.eyN) {
                    this.exk.put((Object)cgh.getTagByName(string), cgr2);
                }
            }
        }
    }

    public void b(cgq cgq2) {
        Map<Integer, cgu> map = cgq2.eyF;
        for (cgu cgu2 : map.values()) {
            this.exg.put(cgu2.adk, cgu2);
            this.exf.put(cgu2.Name.toLowerCase(), cgu2);
            Map<Integer, cgr> map2 = cgu2.eyH;
            for (cgr cgr2 : map2.values()) {
                if (this.exi.containsKey(cgr2.adk) || this.exh.containsKey(cgr2.Name.toLowerCase())) continue;
                List<cgr> list = this.exe.get(cgq2.adk);
                if (list == null) {
                    list = lcn.emv();
                    this.exe.put(cgq2.adk, list);
                }
                list.add(cgr2);
                this.exi.put(cgr2.adk, cgr2);
                this.exh.put(cgr2.Name.toLowerCase(), cgr2);
                che che2 = cgr2.eyU;
                List<cgr> list2 = this.exj.get((Object)che2.aOG());
                if (list2 == null) {
                    list2 = lcn.emv();
                    this.exj.put(che2.aOG(), list2);
                }
                list2.add(cgr2);
                for (String string : cgr2.eyN) {
                    this.exk.put((Object)cgh.getTagByName(string), cgr2);
                }
            }
        }
    }

    public Collection<cgr> a(cgh cgh2) {
        return this.exk.getCollection((Object)cgh2);
    }

    public void aNZ() {
        for (cgr cgr2 : this.exi.values()) {
            cgt cgt2 = cgr2.eyK;
            if (cgt2 == null || cgt2.aCN == null || cgt2.aCN.size() <= 0) continue;
            List<cgw> list = this.exl.get(cgr2.adk);
            if (list == null) {
                list = lcn.emv();
            }
            for (cgw cgw2 : cgt2.aCN) {
                switch (cgw2.ezk) {
                    case eyB: 
                    case eyA: 
                    case eyz: {
                        list.add(cgw2);
                    }
                }
            }
            this.exl.put(cgr2.adk, list);
        }
    }

    public cgu hl(String string) {
        return this.exf.get(string.toLowerCase());
    }

    public cgu pT(int n) {
        return this.exg.get(n);
    }

    public List<cgr> a(int n, cgi cgi2) {
        List<cgr> list = this.exe.get(n);
        if (list == null) {
            return null;
        }
        ArrayList<cgr> arrayList = lcn.abH(list.size());
        for (cgr cgr2 : list) {
            che che2 = cgr2.eyU;
            if (che2.aOG() != cgi2) continue;
            arrayList.add(cgr2);
        }
        return arrayList;
    }

    public List<cgr> a(cgi cgi2) {
        return this.exj.get((Object)cgi2);
    }

    public cgr pU(int n) {
        return this.exi.get(n);
    }

    public cgr hm(String string) {
        return this.exh.get(string.toLowerCase());
    }

    public Map<Integer, cgr> aOa() {
        return this.exi;
    }

    public Map<Integer, cgu> aOb() {
        return this.exg;
    }

    public Map<Integer, cgq> aOc() {
        return this.exc;
    }

    public cgt b(int n, float f2, float f3) {
        cgq cgq2 = this.exc.get(n);
        if (cgq2 == null) {
            return null;
        }
        cgt cgt2 = cgq2.eyK;
        if (cgt2 == null) {
            return null;
        }
        float f4 = cgt2.ezo;
        if (f2 >= f4 && f4 > f3) {
            return cgt2;
        }
        return null;
    }

    public int hn(String string) {
        cgq cgq2 = this.exd.get(string.toLowerCase());
        return cgq2 != null ? cgq2.adk : -1;
    }

    public cgq ho(String string) {
        return this.exd.get(string.toLowerCase());
    }

    public List<cgr> b(cgi cgi2) {
        return this.exj.get((Object)cgi2);
    }

    public cgq pV(int n) {
        return this.exc.get(n);
    }

    public final Map<Integer, cgq> aOd() {
        return this.exc;
    }

    public final Map<Integer, cgu> aOe() {
        return this.exg;
    }

    public float du(int n) {
        cgr cgr2 = this.exi.get(n);
        return cgr2 != null ? cgr2.eyV.ezc : 0.0f;
    }

    public Map<String, Float> aOf() {
        return this.exb;
    }

    @Deprecated
    public String pW(int n) {
        cgr cgr2 = this.exi.get(n);
        assert (cgr2 != null);
        return cgr2 != null ? cgr2.Name : "";
    }

    public boolean pX(int n) {
        cgr cgr2 = this.pU(n);
        if (cgr2 == null) {
            return false;
        }
        if (cgr2.bdP) {
            return true;
        }
        cgu cgu2 = this.pT(cgr2.eyL);
        if (cgu2 == null) {
            return false;
        }
        if (cgu2.bdP) {
            return true;
        }
        cgq cgq2 = this.pV(cgr2.eyG);
        if (cgq2 == null) {
            return false;
        }
        return cgq2.bdP;
    }

    public final Map<Integer, List<cgw>> aOg() {
        return this.exl;
    }

    public final Map<String, cgu> aOh() {
        return this.exf;
    }

    public final Map<String, cgq> aOi() {
        return this.exd;
    }

    public Map<String, cgr> aOj() {
        return this.exh;
    }

    public Map<cgi, List<cgr>> aOk() {
        return this.exj;
    }

    public MultiHashMap aOl() {
        return this.exk;
    }
}

