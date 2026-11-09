/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bz
 *  dtc
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class kea {
    public static String piz = bz.class.getName();
    public static String piA = jsa.class.getName();
    public static String piB = hbb.class.getName();
    public static String piC = dtc.class.getName();
    public static String piD = bd.class.getName();
    public static String piE = jog.class.getName();
    public static final String piF = mjf.class.getName();
    public static final kea piG = new kea();
    private kef piH = new kef();
    private Map<String, kdw> piI = lcn.emw();
    private boolean hbk = false;
    private int piJ = 0;
    private final int piK = 25;
    private int piL = 0;
    private final int piM = 25;

    private kea() {
    }

    public static kea dVE() {
        return piG;
    }

    public void a(kdw kdw2) {
        if (kdw2 == null) {
            assert (false);
            throw new bs("Module is null!");
        }
        if (kdw2.dVu() == null) {
            assert (false);
            throw new bs("ModuleIdentity is null!");
        }
        String string = kdw2.dVu().getName();
        if (!this.piI.containsKey(string)) {
            this.piI.put(string, kdw2);
        }
    }

    public void cleanUp() {
        for (kdw kdw2 : this.piI.values()) {
            this.b(kdw2);
            kdw2.cleanUp();
        }
    }

    public void b(kdw kdw2) {
        this.piI.remove(kdw2.dVu().getName());
    }

    public boolean dVF() {
        if (!this.hbk) {
            ++this.piJ;
            boolean bl = true;
            for (kdw kdw2 : this.piI.values()) {
                int n = kdw2.c(kdw.a.pid);
                if (n == 102) assert (false);
                if (n == 103) {
                    bl = false;
                }
                if (n == 101 && kdw2.dVt() != kdw.a.pid) continue;
            }
            if (!bl && this.piJ < 25) {
                return false;
            }
            this.hbk = true;
            return false;
        }
        boolean bl = true;
        for (kdw kdw3 : this.piI.values()) {
            int n = kdw3.c(kdw.a.pic);
            if (n == 102) assert (false);
            if (n == 103) {
                bl = false;
            }
            if (n == 101 && kdw3.dVt() != kdw.a.pic) continue;
        }
        ++this.piL;
        if (!bl && this.piL < 25) {
            return false;
        }
        for (kdw kdw3 : this.piI.values()) {
            this.b(kdw3);
            kdw3.cleanUp();
        }
        return true;
    }

    public kee d(String string, String string2, int n, int n2) {
        kdw kdw2 = null;
        kdw kdw3 = null;
        boolean bl = false;
        boolean bl2 = false;
        int n3 = string.lastIndexOf(".") + 1;
        int n4 = string2.lastIndexOf(".") + 1;
        kee kee2 = this.piH.fK(n, n2);
        if (kee2 != null) {
            if (!string.equals("")) {
                kdw2 = this.piI.get(string);
                if (kdw2 != null) {
                    kee2.wF(string);
                    if (this.piH.a(kdw2.dVu(), n)) {
                        bl = true;
                    }
                }
            } else {
                bl = true;
            }
            if (!string2.equals("")) {
                kdw3 = this.piI.get(string2);
                if (kdw3 != null) {
                    kee2.wG(string2);
                    if (this.piH.a(kdw3.dVu(), n)) {
                        bl2 = true;
                    }
                }
            } else {
                bl2 = true;
            }
            if (bl && bl2) {
                if (kdw2 != null) {
                    kdw2.a(kee2, kdw2.dVu().getLevel());
                }
                if (kdw3 != null) {
                    kdw3.a(kee2, kdw3.dVu().getLevel());
                }
            }
        }
        return kee2;
    }

    public void a(kdz kdz2, kee kee2) {
        if (kdz2.getName().equals(kee2.dVI())) {
            this.piH.e(kee2);
            String string = kee2.dVJ();
            kdw kdw2 = this.piI.get(string);
            kdw2.d(kee2);
        }
    }

    public int a(String string, lef lef2, lef lef3) {
        kdw kdw2 = null;
        if (!this.piI.containsKey(string)) {
            return -1;
        }
        kdw2 = this.piI.get(string);
        kdw2.a(lef2, lef3);
        return 0;
    }

    public List<kdw> W(String string, int n) {
        kdw kdw2 = null;
        if (!this.piI.containsKey(string)) {
            return null;
        }
        kdw2 = this.piI.get(string);
        ArrayList<kdw> arrayList = lcn.emv();
        int n2 = kdw2.dVu().getLevel();
        if (n2 < n) {
            try {
                this.a(kdw2.dVu(), n, arrayList);
            }
            catch (bm bm2) {
                throw new bs(bm2);
            }
        }
        return arrayList;
    }

    private int a(kdz kdz2, int n, List<kdw> list) {
        Map<Integer, List<kdx>> map = kdz2.dVC();
        kdw kdw2 = null;
        ArrayList<kee> arrayList = lcn.emv();
        if (map != null && map.size() != 0 && kdz2.getLevel() < n) {
            List<kdx> list2 = map.get(new Integer(n));
            kdx kdx2 = null;
            for (int i = 0; i < list2.size(); ++i) {
                kdx2 = list2.get(i);
                int n2 = kdx2.dVz();
                String string = kdx2.getModuleName();
                if (!this.piI.containsKey(string)) {
                    throw new bm(kdz2.getName() + " not initialized!. Dependent module [" + string + "] has not been registered!");
                }
                kdw2 = this.piI.get(string);
                if (kdw2.dVu().getLevel() < n) {
                    this.a(kdw2.dVu(), kdx2.dVz(), list);
                } else {
                    list.add(kdw2);
                }
                if (kdx2.dVy() == 1) continue;
                kee kee2 = this.piH.fK(2, kdx2.getDirection());
                if (kee2 == null) {
                    lfn.b(5, "SFModuleManager", "checkDependencies() INIT PIPE IS NULL!");
                    assert (false);
                    return -1;
                }
                kdw2.a(kee2, n2);
                arrayList.add(kee2);
            }
        }
        kdw2 = this.piI.get(kdz2.getName());
        kdw2.a(arrayList, n);
        list.add(kdw2);
        return 0;
    }

    public void d(kdw.a a2) {
        for (kdw kdw2 : this.piI.values()) {
            kdw2.c(a2);
        }
        if (a2 == kdw.a.pic) {
            for (kdw kdw2 : this.piI.values()) {
                if (kdw2.dVt() == kdw.a.pic) continue;
                return;
            }
            for (kdw kdw2 : this.piI.values()) {
                kdw2.cleanUp();
            }
        }
    }

    public boolean e(kdw.a a2) {
        for (kdw kdw2 : this.piI.values()) {
            if (kdw2.a(a2)) continue;
            return false;
        }
        return true;
    }

    public void a(String string, ldz ldz2) {
        kdw kdw2 = this.piI.get(string);
        if (kdw2 != null) {
            kdw2.e(ldz2);
        } else assert (false);
    }
}

