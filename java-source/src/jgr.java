/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import spenefett.hid.gui.serialization.dto.SFSocialPlayerDTO;
import spenefett.hid.gui.serialization.dto.SFSocialPlayerListDTO;

public class jgr {
    private List<SFSocialPlayerListDTO> naN = lcn.emv();
    private SFSocialPlayerListDTO naO = new SFSocialPlayerListDTO();
    private SFSocialPlayerListDTO naP = new SFSocialPlayerListDTO();
    private SFSocialPlayerListDTO naQ = new SFSocialPlayerListDTO();
    private SFSocialPlayerListDTO naR = new SFSocialPlayerListDTO();
    private SFSocialPlayerListDTO naS = new SFSocialPlayerListDTO();
    private SFSocialPlayerListDTO naT = new SFSocialPlayerListDTO();
    private Map<String, SFSocialPlayerDTO> naU = lcn.emw();
    private boolean naV = false;
    private boolean naW = false;
    private boolean lKI = false;

    public jgr() {
        this.naN.add(this.naO);
        this.naN.add(this.naP);
        this.naN.add(this.naQ);
        this.naN.add(this.naR);
        this.naN.add(this.naS);
        this.naN.add(this.naT);
    }

    public SFSocialPlayerListDTO dEM() {
        return this.naO;
    }

    public SFSocialPlayerListDTO dEN() {
        return this.naP;
    }

    public SFSocialPlayerListDTO dEO() {
        return this.naQ;
    }

    public SFSocialPlayerListDTO dEP() {
        return this.naR;
    }

    public SFSocialPlayerListDTO dEQ() {
        return this.naS;
    }

    public SFSocialPlayerListDTO dER() {
        return this.naT;
    }

    public Map<String, SFSocialPlayerDTO> dES() {
        return this.naU;
    }

    public void a(SFSocialPlayerListDTO sFSocialPlayerListDTO) {
        if (sFSocialPlayerListDTO != null) {
            this.naN.remove(this.naO);
            this.naO = sFSocialPlayerListDTO;
            this.naN.add(this.naO);
        }
    }

    public void b(SFSocialPlayerListDTO sFSocialPlayerListDTO) {
        if (sFSocialPlayerListDTO != null) {
            this.naN.remove(this.naP);
            this.naP = sFSocialPlayerListDTO;
            this.naN.add(this.naP);
        }
    }

    public void a(gky gky2) {
        this.naN.remove(this.naP);
        this.naP = jgr.e(gky2);
        this.naN.add(this.naP);
    }

    public void b(gky gky2) {
        jgr.g(this.naP);
        this.a(this.naP, jgr.e(gky2), this, -1);
    }

    public void c(SFSocialPlayerListDTO sFSocialPlayerListDTO) {
        if (sFSocialPlayerListDTO != null) {
            this.naN.remove(this.naQ);
            this.naQ = sFSocialPlayerListDTO;
            this.naU = jgr.bD(this.naQ.list);
            this.naN.add(this.naQ);
        }
    }

    public void d(SFSocialPlayerListDTO sFSocialPlayerListDTO) {
        if (sFSocialPlayerListDTO != null) {
            this.naN.remove(this.naR);
            this.naR = sFSocialPlayerListDTO;
            this.naN.add(this.naR);
        }
    }

    public void c(gky gky2) {
        this.naN.remove(this.naR);
        this.naR = jgr.e(gky2);
        this.naN.add(this.naR);
    }

    public void d(gky gky2) {
        jgr.g(this.naR);
        this.a(this.naR, jgr.e(gky2), this, -1);
    }

    public void e(SFSocialPlayerListDTO sFSocialPlayerListDTO) {
        if (sFSocialPlayerListDTO != null) {
            this.naN.remove(this.naS);
            this.naS = sFSocialPlayerListDTO;
            this.naN.add(this.naS);
        }
    }

    public void f(SFSocialPlayerListDTO sFSocialPlayerListDTO) {
        if (sFSocialPlayerListDTO != null) {
            this.naN.remove(this.naT);
            this.naT = sFSocialPlayerListDTO;
            this.naN.add(this.naT);
        }
    }

    public boolean dET() {
        return this.naV;
    }

    public void to(boolean bl) {
        if (this.naV == bl) {
            return;
        }
        this.naV = bl;
        for (int i = 0; i < this.naN.size(); ++i) {
            this.a(this.naN.get(i), this.naV);
        }
    }

    public boolean dEU() {
        return this.naW;
    }

    public void tp(boolean bl) {
        if (this.naW == bl) {
            return;
        }
        this.naW = bl;
        for (int i = 0; i < this.naN.size(); ++i) {
            this.b(this.naN.get(i), this.naW);
        }
    }

    public boolean dEV() {
        return this.lKI;
    }

    public void tq(boolean bl) {
        if (this.lKI == bl) {
            return;
        }
        this.lKI = bl;
        for (int i = 0; i < this.naN.size(); ++i) {
            this.c(this.naN.get(i), this.lKI);
        }
    }

    public void F(String string, boolean bl) {
        this.a(this.naP, string, bl);
    }

    public void G(String string, boolean bl) {
        this.a(this.naR, string, bl);
    }

    private void a(SFSocialPlayerListDTO sFSocialPlayerListDTO, boolean bl) {
        if (sFSocialPlayerListDTO == null) {
            return;
        }
        for (int i = 0; i < sFSocialPlayerListDTO.list.size(); ++i) {
            sFSocialPlayerListDTO.list.get((int)i).removeToggleOn = bl;
        }
    }

    private void b(SFSocialPlayerListDTO sFSocialPlayerListDTO, boolean bl) {
        if (sFSocialPlayerListDTO == null) {
            return;
        }
        for (int i = 0; i < sFSocialPlayerListDTO.list.size(); ++i) {
            sFSocialPlayerListDTO.list.get((int)i).blockToggleOn = bl;
        }
    }

    private void c(SFSocialPlayerListDTO sFSocialPlayerListDTO, boolean bl) {
        if (sFSocialPlayerListDTO == null) {
            return;
        }
        for (int i = 0; i < sFSocialPlayerListDTO.list.size(); ++i) {
            sFSocialPlayerListDTO.list.get((int)i).summonAvailable = bl;
        }
    }

    private void a(SFSocialPlayerListDTO sFSocialPlayerListDTO, String string, boolean bl) {
        if (sFSocialPlayerListDTO == null || string == null || string.isEmpty()) {
            return;
        }
        SFSocialPlayerDTO sFSocialPlayerDTO = null;
        for (int i = 0; i < sFSocialPlayerListDTO.list.size(); ++i) {
            sFSocialPlayerDTO = sFSocialPlayerListDTO.list.get(i);
            if (!string.equals(sFSocialPlayerDTO.GUID)) continue;
            sFSocialPlayerDTO.selected = bl;
            break;
        }
    }

    public static String a(SFSocialPlayerDTO sFSocialPlayerDTO) {
        if (sFSocialPlayerDTO == null) {
            return null;
        }
        return sFSocialPlayerDTO.firstName + " " + sFSocialPlayerDTO.lastName;
    }

    public static String b(SFSocialPlayerDTO sFSocialPlayerDTO) {
        String string = jgr.a(sFSocialPlayerDTO);
        if (string == null) {
            return null;
        }
        return string.toLowerCase();
    }

    public static Map<String, SFSocialPlayerDTO> bD(List<SFSocialPlayerDTO> list) {
        Map<String, SFSocialPlayerDTO> map = lcn.emw();
        if (list == null) {
            return map;
        }
        for (SFSocialPlayerDTO sFSocialPlayerDTO : list) {
            map.put(jgr.b(sFSocialPlayerDTO), sFSocialPlayerDTO);
        }
        return map;
    }

    public static SFSocialPlayerDTO d(gkr gkr2) {
        if (gkr2 == null || gkr2.qd() == null || gkr2.iU() == null || gkr2.iU().isEmpty()) {
            return null;
        }
        SFSocialPlayerDTO sFSocialPlayerDTO = new SFSocialPlayerDTO();
        String[] stringArray = jgr.sg(gkr2.iU());
        if (stringArray == null) {
            return null;
        }
        sFSocialPlayerDTO.GUID = String.valueOf(gkr2.qd().eny());
        sFSocialPlayerDTO.firstName = stringArray[0];
        sFSocialPlayerDTO.lastName = stringArray[1];
        sFSocialPlayerDTO.online = gkr2.qf();
        sFSocialPlayerDTO.changed = true;
        return sFSocialPlayerDTO;
    }

    public static SFSocialPlayerListDTO a(gks gks2, jgr jgr2) {
        SFSocialPlayerListDTO sFSocialPlayerListDTO = new SFSocialPlayerListDTO();
        SFSocialPlayerDTO sFSocialPlayerDTO = null;
        String[] stringArray = null;
        if (gks2 == null || jgr2 == null) {
            return sFSocialPlayerListDTO;
        }
        int n = gks2.bVI();
        ldv[] ldvArray = gks2.bFJ();
        String[] stringArray2 = gks2.bFK();
        boolean[] blArray = gks2.bFL();
        if (n == -1 || ldvArray == null || stringArray2 == null) {
            return sFSocialPlayerListDTO;
        }
        if (ldvArray.length != stringArray2.length) {
            return sFSocialPlayerListDTO;
        }
        if (blArray != null && blArray.length != ldvArray.length) {
            return sFSocialPlayerListDTO;
        }
        for (int i = 0; i < ldvArray.length; ++i) {
            sFSocialPlayerDTO = new SFSocialPlayerDTO();
            stringArray = jgr.sg(stringArray2[i]);
            if (stringArray == null) continue;
            sFSocialPlayerDTO.GUID = String.valueOf(ldvArray[i].eny());
            sFSocialPlayerDTO.firstName = stringArray[0];
            sFSocialPlayerDTO.lastName = stringArray[1];
            sFSocialPlayerDTO.changed = true;
            if (blArray != null) {
                sFSocialPlayerDTO.online = blArray[i];
            }
            sFSocialPlayerDTO.removeToggleOn = jgr2.dET();
            sFSocialPlayerDTO.blockToggleOn = jgr2.dEU();
            sFSocialPlayerDTO.summonAvailable = jgr2.dEV();
            sFSocialPlayerListDTO.list.add(sFSocialPlayerDTO);
        }
        jgr.sort(sFSocialPlayerListDTO.list);
        return sFSocialPlayerListDTO;
    }

    public static SFSocialPlayerListDTO e(gky gky2) {
        SFSocialPlayerListDTO sFSocialPlayerListDTO = new SFSocialPlayerListDTO();
        SFSocialPlayerDTO sFSocialPlayerDTO = null;
        String[] stringArray = null;
        if (gky2 == null || gky2.isc == null || gky2.hlz == null || gky2.isc.length != gky2.hlz.length) {
            return sFSocialPlayerListDTO;
        }
        for (int i = 0; i < gky2.isc.length; ++i) {
            sFSocialPlayerDTO = new SFSocialPlayerDTO();
            stringArray = jgr.sg(gky2.hlz[i]);
            if (stringArray == null) continue;
            sFSocialPlayerDTO.GUID = String.valueOf(gky2.isc[i].eny());
            sFSocialPlayerDTO.firstName = stringArray[0];
            sFSocialPlayerDTO.lastName = stringArray[1];
            sFSocialPlayerDTO.changed = true;
            sFSocialPlayerListDTO.list.add(sFSocialPlayerDTO);
        }
        jgr.sort(sFSocialPlayerListDTO.list);
        return sFSocialPlayerListDTO;
    }

    public static String[] sg(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        String[] stringArray = string.split(" ");
        if (stringArray.length != 2 || stringArray[0] == null || stringArray[1] == null || stringArray[0].isEmpty() || stringArray[1].isEmpty()) {
            return null;
        }
        return stringArray;
    }

    public static void g(SFSocialPlayerListDTO sFSocialPlayerListDTO) {
        if (sFSocialPlayerListDTO == null || sFSocialPlayerListDTO.list == null) {
            return;
        }
        SFSocialPlayerDTO sFSocialPlayerDTO = null;
        Iterator<SFSocialPlayerDTO> iterator = sFSocialPlayerListDTO.list.iterator();
        while (iterator.hasNext()) {
            sFSocialPlayerDTO = iterator.next();
            if (sFSocialPlayerDTO == null || sFSocialPlayerDTO.selected) continue;
            iterator.remove();
        }
    }

    public void a(SFSocialPlayerListDTO sFSocialPlayerListDTO, SFSocialPlayerListDTO sFSocialPlayerListDTO2, jgr jgr2, int n) {
        if (sFSocialPlayerListDTO == null || sFSocialPlayerListDTO.list == null || sFSocialPlayerListDTO2 == null || sFSocialPlayerListDTO2.list == null || jgr2 == null) {
            return;
        }
        SFSocialPlayerDTO sFSocialPlayerDTO = null;
        for (int i = 0; i < sFSocialPlayerListDTO2.list.size(); ++i) {
            sFSocialPlayerDTO = sFSocialPlayerListDTO2.list.get(i);
            if (sFSocialPlayerDTO == null || jgr.a(sFSocialPlayerListDTO, sFSocialPlayerDTO)) continue;
            sFSocialPlayerDTO.removeToggleOn = jgr2.dET();
            sFSocialPlayerDTO.blockToggleOn = jgr2.dEU();
            sFSocialPlayerDTO.summonAvailable = jgr2.dEV();
            sFSocialPlayerListDTO.list.add(sFSocialPlayerDTO);
        }
        jgr.sort(sFSocialPlayerListDTO.list);
        switch (n) {
            case 0: {
                break;
            }
            case 1: {
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                this.naU.putAll(jgr.bD(sFSocialPlayerListDTO.list));
                break;
            }
            case 4: 
            case 5: {
                break;
            }
        }
        if (n != -1) {
            this.naN.add(sFSocialPlayerListDTO);
        }
    }

    public static boolean a(SFSocialPlayerListDTO sFSocialPlayerListDTO, SFSocialPlayerDTO sFSocialPlayerDTO) {
        if (sFSocialPlayerListDTO == null || sFSocialPlayerListDTO.list == null || sFSocialPlayerDTO == null) {
            return false;
        }
        for (SFSocialPlayerDTO sFSocialPlayerDTO2 : sFSocialPlayerListDTO.list) {
            if (sFSocialPlayerDTO2 == null || sFSocialPlayerDTO2.GUID == null || !sFSocialPlayerDTO2.GUID.equals(sFSocialPlayerDTO.GUID)) continue;
            return true;
        }
        return false;
    }

    public static int h(SFSocialPlayerListDTO sFSocialPlayerListDTO) {
        int n = 0;
        if (sFSocialPlayerListDTO != null && sFSocialPlayerListDTO.list != null) {
            for (SFSocialPlayerDTO sFSocialPlayerDTO : sFSocialPlayerListDTO.list) {
                n += sFSocialPlayerDTO.selected ? 1 : 0;
            }
        }
        return n;
    }

    public static void i(SFSocialPlayerListDTO sFSocialPlayerListDTO) {
        if (sFSocialPlayerListDTO == null) {
            return;
        }
        SFSocialPlayerDTO sFSocialPlayerDTO = null;
        for (int i = 0; i < 50; ++i) {
            sFSocialPlayerDTO = new SFSocialPlayerDTO();
            sFSocialPlayerDTO.GUID = String.valueOf(i);
            sFSocialPlayerDTO.firstName = "first : " + String.valueOf(i) + " : Random " + String.valueOf(Math.random() * 10.0);
            sFSocialPlayerDTO.lastName = "last : " + String.valueOf(i);
            sFSocialPlayerDTO.online = i % 2 == 0;
            sFSocialPlayerDTO.changed = true;
            sFSocialPlayerDTO.removeToggleOn = false;
            sFSocialPlayerDTO.blockToggleOn = false;
            sFSocialPlayerListDTO.list.add(sFSocialPlayerDTO);
        }
        jgr.sort(sFSocialPlayerListDTO.list);
    }

    public boolean rL(ldv ldv2) {
        if (ldv2 == null) {
            return false;
        }
        String string = String.valueOf(ldv2.eny());
        for (SFSocialPlayerDTO sFSocialPlayerDTO : this.naO.list) {
            if (!sFSocialPlayerDTO.GUID.equals(string)) continue;
            return true;
        }
        return false;
    }

    public boolean X(String string, String string2) {
        if (string == null || string.isEmpty() || string2 == null || string2.isEmpty()) {
            return false;
        }
        for (SFSocialPlayerDTO sFSocialPlayerDTO : this.naO.list) {
            if (!sFSocialPlayerDTO.firstName.equals(string) || !sFSocialPlayerDTO.lastName.equals(string2)) continue;
            return true;
        }
        return false;
    }

    public boolean rM(ldv ldv2) {
        if (ldv2 == null) {
            return false;
        }
        String string = String.valueOf(ldv2.eny());
        for (SFSocialPlayerDTO sFSocialPlayerDTO : this.naT.list) {
            if (!sFSocialPlayerDTO.GUID.equals(string)) continue;
            return true;
        }
        return false;
    }

    public boolean rN(ldv ldv2) {
        if (ldv2 == null) {
            return false;
        }
        String string = String.valueOf(ldv2.eny());
        for (SFSocialPlayerDTO sFSocialPlayerDTO : this.naQ.list) {
            if (!sFSocialPlayerDTO.GUID.equals(string)) continue;
            return true;
        }
        return false;
    }

    public boolean sh(String string) {
        if (string == null) {
            return false;
        }
        return this.naU.containsKey(string.toLowerCase());
    }

    public boolean Y(String string, String string2) {
        String string3 = string + " " + string2;
        return this.naU.containsKey(string3.toLowerCase());
    }

    public boolean rO(ldv ldv2) {
        if (ldv2 == null) {
            return false;
        }
        String string = String.valueOf(ldv2.eny());
        for (SFSocialPlayerDTO sFSocialPlayerDTO : this.naS.list) {
            if (!sFSocialPlayerDTO.GUID.equals(string)) continue;
            return true;
        }
        return false;
    }

    public final List<SFSocialPlayerListDTO> dEW() {
        return this.naN;
    }

    public final void bE(List<SFSocialPlayerListDTO> list) {
        this.naN = list;
    }

    public static void sort(List<SFSocialPlayerDTO> list) {
        ArrayList<String> arrayList = lcn.emv();
        Map<SFSocialPlayerDTO, Integer> map = lcn.emw();
        for (int i = 0; i < list.size(); ++i) {
            SFSocialPlayerDTO sFSocialPlayerDTO = list.get(i);
            arrayList.add(sFSocialPlayerDTO.firstName + " " + sFSocialPlayerDTO.lastName);
            map.put(sFSocialPlayerDTO, i);
        }
        Collections.sort(list, new Comparator<SFSocialPlayerDTO>(map, arrayList){
            final /* synthetic */ Map naX;
            final /* synthetic */ List naY;
            {
                this.naX = map;
                this.naY = list;
            }

            public int a(SFSocialPlayerDTO sFSocialPlayerDTO, SFSocialPlayerDTO sFSocialPlayerDTO2) {
                int n = (Integer)this.naX.get(sFSocialPlayerDTO);
                int n2 = (Integer)this.naX.get(sFSocialPlayerDTO2);
                String string = (String)this.naY.get(n);
                String string2 = (String)this.naY.get(n2);
                return string.compareTo(string2);
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((SFSocialPlayerDTO)object, (SFSocialPlayerDTO)object2);
            }
        });
    }
}

