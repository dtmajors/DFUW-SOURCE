/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  dqk
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class axn {
    private String[] csi = new String[]{"r_Clan Laboratory", "r_Clan Smithy", "r_Clan Fighters Guild", "r_Clan Mages Guild", "r_Clan General Store"};
    private String[] csj = new String[]{"r_clan structures", "r_Bindstones", "r_Clan Stationary Guns"};
    private String csk = "";
    private float csl;
    public static final String csm = "r_clanstone city";
    public static final String csn = "r_clanstone hamlet";
    public static final String cso = "^r_.*u[0-9]{1,2}$";

    public axs a(List<amf> list, a a2) {
        Object object;
        String string;
        ljq ljq2 = null;
        float f = 0.0f;
        axs axs2 = new axs();
        ArrayList<axq> arrayList = lcn.emv();
        for (amf object22 : list) {
            Object f2;
            Object n;
            String bl;
            if (!(object22 instanceof dqk)) continue;
            if (object22 instanceof dsn) {
                ljq2 = ((dsn)((Object)object22)).av();
                f = ((dsn)((Object)object22)).getRadius();
                bl = "Setting City Position ->" + ljq2 + ", and Radius = " + f;
                this.csk = this.csk + "\n" + bl;
            }
            if ((bl = object22.getObjectDescriptionFilename()).contains("clan_building_smithery_01")) {
                // empty if block
            }
            string = this.eG(bl);
            if (object22 instanceof dqk && (n = (dqk)object22).az() == cug.fpz) {
                string = lea.enW().getName(n.az());
            }
            if (string == null) {
                n = "Object [" + object22.getClass().getSimpleName() + " | " + object22.getObjectDescriptionFilename() + "] does not have a resource entry.";
                this.csk = this.csk + "\n" + (String)n;
                continue;
            }
            int map = lea.enW().getType(string);
            if (map == -1) {
                n = "Object [" + object22.getClass().getSimpleName() + " | " + string + "] does not have a valid resource type.";
                this.csk = this.csk + "\n" + (String)n;
                continue;
            }
            assert (object22 instanceof dqk);
            n = (dqk)object22;
            if (map == cug.fpz) {
                f2 = new clq(map, n.av(), n.aw());
                axs2.a((clq)f2);
                continue;
            }
            f2 = new axq();
            ((axq)f2).eI(string);
            ((axq)f2).c(n.av());
            ((axq)f2).a(n.aw());
            assert (n.getGUID() != null) : "WMO GUID is null for WMO = " + n;
            ((axq)f2).dr(n.getGUID());
            arrayList.add((axq)f2);
        }
        axs2.V(arrayList);
        if (ljq2 == null) {
            object = "City Position is null after processing objects. This city needs a Sphere shape object!";
            this.csk = this.csk + "\n" + (String)object;
            return null;
        }
        axs2.al(ljq2);
        axs2.X(f);
        if (arrayList.isEmpty()) {
            object = "No resources to Convert. Invalid city!";
            this.csk = this.csk + "\n" + (String)object;
            return null;
        }
        object = this.a(axs2);
        if (object == ayb.cvi) {
            // empty if block
        }
        axs2.iD(((Enum)object).ordinal());
        axs axs3 = this.a((ayb)((Object)object), a2);
        boolean bl = this.a(axs2, axs3);
        if (!bl) {
            string = "City is not Valid! Check debug info.";
            this.csk = this.csk + "\n" + string;
            return null;
        }
        string = "City is Valid. Copying city element infos from default ruleset to new city.";
        this.csk = this.csk + "\n" + string;
        Map<String, axq> map = this.T(axs3.YG());
        int n = 0;
        float f2 = 0.0f;
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int n2;
            axq axq2 = (axq)iterator.next();
            axq axq3 = map.get(axq2.Yp());
            if (axq3 == null) {
                boolean ljq3 = false;
                for (axq axq4 : map.values()) {
                    int n3 = lea.enW().getType(axq4.Yp());
                    n2 = lea.enW().getType(axq2.Yp());
                    ljq3 = lea.enW().isDescendant(n2, n3);
                    if (!ljq3) continue;
                    string = "Resource [" + axq2.Yp() + "] is Descentdant of [" + axq4.Yo() + "]. Setting that resource as copy-elem";
                    this.csk = this.csk + "\n" + string;
                    axq3 = axq4;
                    break;
                }
                if (!ljq3) {
                    string = "Resource [" + axq2.Yp() + "] not found in default ruleset, so skipping.";
                    this.csk = this.csk + "\n" + string;
                    iterator.remove();
                    continue;
                }
            }
            assert (axq3 != null);
            ljq ljq3 = axq2.av();
            lgl lgl2 = axq2.aw();
            ldv ldv2 = axq2.YD();
            axq2.c(axq3);
            axq2.dr(ldv2);
            if (axq3.Yz() == null) {
                // empty if block
            }
            if (axq2.Yz() == null) {
                // empty if block
            }
            axq2.c(ljq3);
            axq2.a(lgl2);
            ++n;
            String string2 = this.eE(axq2.Yp());
            n2 = lea.enW().getType(string2);
            lgw lgw2 = (lgw)lea.enW().acv(n2);
            if (lgw2 != null) {
                f2 += lgw2.erL();
            } else {
                return null;
            }
            if (!this.i(n2, lgw2.getName()) || this.a(axq2)) continue;
            string = "Element for Resource [" + axq2.Yp() + "] does not have required AttachPoints";
            this.csk = this.csk + "\n" + string;
        }
        this.csl = f2;
        axs2.V(arrayList);
        return axs2;
    }

    private String eE(String string) {
        String string2 = string;
        int n = 99;
        for (int i = 1; i < n; ++i) {
            String string3 = string + " u" + i;
            if (!lea.enW().contains(string3)) break;
            string2 = string3;
        }
        return string2;
    }

    private boolean a(axq axq2) {
        String string;
        int n;
        String string2;
        int n2;
        int n3 = lea.enW().getType(axq2.Yp());
        lgw lgw2 = (lgw)lea.enW().acv(n3);
        if (lgw2 == null) {
            return false;
        }
        String string3 = jry.tp(lgw2.bBt());
        if (!this.eF(string3)) {
            return false;
        }
        int n4 = 99;
        for (n2 = 1; n2 < n4; ++n2) {
            string2 = axq2.Yp() + " u" + n2;
            if (!lea.enW().contains(string2)) break;
            n = lea.enW().getType(string2);
            lgw2 = (lgw)lea.enW().acv(n);
            if (lgw2 == null) {
                return false;
            }
            string = jry.tp(lgw2.bBt());
            if (!this.eF(string)) {
                return false;
            }
            if (this.i(n, lgw2.getName())) continue;
            return false;
        }
        n4 = 99;
        for (n2 = 1; n2 < n4; ++n2) {
            string2 = axq2.Yp() + " d" + n2;
            if (!lea.enW().contains(string2)) break;
            n = lea.enW().getType(string2);
            lgw2 = (lgw)lea.enW().acv(n);
            if (lgw2 == null) {
                return false;
            }
            string = jry.tp(lgw2.bBt());
            if (!this.eF(string)) {
                return false;
            }
            if (this.i(n, lgw2.getName())) continue;
            return false;
        }
        String string4 = axq2.Yp() + " Rubble";
        if (lea.enW().contains(string4)) {
            n4 = lea.enW().getType(string4);
            lgw2 = (lgw)lea.enW().acv(n4);
            if (lgw2 == null) {
                return false;
            }
            if (!this.i(n4, lgw2.getName())) {
                return false;
            }
        }
        return true;
    }

    private boolean eF(String string) {
        Map<String, Map<String, eh>> map = lea.eor();
        Map<String, eh> map2 = map.get(string);
        if (map2 == null || map2.isEmpty()) {
            return false;
        }
        if (!map2.containsKey("AttachPoint_Structure Spawn Delta")) {
            return false;
        }
        for (String string2 : this.csi) {
            if (!string.contains(string2) || map2.containsKey("AttachPoint_Structure Vendor 01")) continue;
            return false;
        }
        return !string.contains("clan_guard_tower") || map2.containsKey("AttachPoint_GuardTower Fire 01");
    }

    private boolean i(int n, String string) {
        amm amm2 = lea.eoN().get(n);
        if (amm2 == null) {
            String string2 = "Element for Resource [" + n + "] does not have StructureInfo";
            this.csk = this.csk + "\n" + string2;
            return false;
        }
        return true;
    }

    private ayb a(axs axs2) {
        ayb ayb2 = ayb.cvi;
        for (axq axq2 : axs2.YG()) {
            String string = axq2.Yp().toLowerCase();
            if (string.equals(csm)) {
                assert (ayb2 == ayb.cvi) : "CityType already set!";
                ayb2 = ayb.cvj;
                continue;
            }
            if (!string.equals(csn)) continue;
            assert (ayb2 == ayb.cvi) : "CityType already set!";
            ayb2 = ayb.cvk;
        }
        return ayb2;
    }

    private boolean a(axs axs2, axs axs3) {
        boolean bl = true;
        Map<String, axq> map = this.T(axs3.YG());
        Map<String, axq> map2 = this.T(axs2.YG());
        for (String string : map2.keySet()) {
            axq axq2 = map.get(string);
            if (axq2 == null) {
                String string2 = "Resource  [" + string + "] for new City is not in default ruleset, so skipping.";
                this.csk = this.csk + "\n" + string2;
                continue;
            }
            bl = this.a(axq2, map2, map);
            if (bl) continue;
        }
        return bl;
    }

    private boolean a(axq axq2, Map<String, axq> map, Map<String, axq> map2) {
        List<lfs<String, Integer>> list = axq2.YA();
        for (lfs<String, Integer> lfs2 : list) {
            Object object;
            if (!map.containsKey(lfs2.reX)) {
                object = lea.enW().getName(axq2.Yo());
                String string = "Level1 Resource [" + (String)lfs2.reX + "] is missing for Resource [" + (String)object + "]";
                this.csk = this.csk + "\n" + string;
                return false;
            }
            object = map2.get(lfs2.reX);
            if (this.a((axq)object, map, map2)) continue;
            return false;
        }
        return true;
    }

    private axs a(ayb ayb2, a a2) {
        axs axs2 = null;
        jwj jwj2 = new jwj();
        switch (ayb2) {
            case cvj: {
                switch (a2) {
                    case csr: {
                        assert (false);
                        break;
                    }
                    case css: {
                        axs2 = jwj2.uJ("alfar_default_city.xml");
                        break;
                    }
                    case cst: {
                        axs2 = jwj2.uJ("dwarf_default_city.xml");
                        break;
                    }
                    case csu: {
                        axs2 = jwj2.uJ("human_default_city.xml");
                        break;
                    }
                    case csv: {
                        axs2 = jwj2.uJ("mahirim_default_city.xml");
                        break;
                    }
                    case csw: {
                        axs2 = jwj2.uJ("mirdain_default_city.xml");
                        break;
                    }
                    case csx: {
                        axs2 = jwj2.uJ("ork_default_city.xml");
                    }
                }
                break;
            }
            case cvk: {
                switch (a2) {
                    case csr: {
                        assert (false);
                        break;
                    }
                    case css: {
                        axs2 = jwj2.uJ("alfar_default_hamlet.xml");
                        break;
                    }
                    case cst: {
                        axs2 = jwj2.uJ("dwarf_default_hamlet.xml");
                        break;
                    }
                    case csu: {
                        axs2 = jwj2.uJ("human_default_hamlet.xml");
                        break;
                    }
                    case csv: {
                        axs2 = jwj2.uJ("mahirim_default_hamlet.xml");
                        break;
                    }
                    case csw: {
                        axs2 = jwj2.uJ("mirdain_default_hamlet.xml");
                        break;
                    }
                    case csx: {
                        axs2 = jwj2.uJ("ork_default_hamlet.xml");
                    }
                }
                break;
            }
        }
        assert (axs2 != null);
        return axs2;
    }

    private Map<String, axq> T(List<axq> list) {
        Map<String, axq> map = lcn.emw();
        for (axq axq2 : list) {
            map.put(axq2.Yp(), axq2);
        }
        return map;
    }

    private String eG(String string) {
        int n;
        String string2 = null;
        for (n = 0; n < this.csj.length; ++n) {
            lgw lgw2;
            int n2 = lea.enW().getType(this.csj[n]);
            if (n2 <= 0) {
                // empty if block
            }
            if ((lgw2 = lea.enW().ab(n2, string)) == null) continue;
            string2 = lgw2.getName();
            break;
        }
        if (string2 == null) {
            return null;
        }
        if (Pattern.matches(cso, string2 = string2.toLowerCase()) && (n = string2.lastIndexOf(" u")) != -1) {
            string2 = string2.substring(0, n);
        }
        return string2;
    }

    public String XH() {
        return this.csk;
    }

    public float XI() {
        return this.csl;
    }
}

