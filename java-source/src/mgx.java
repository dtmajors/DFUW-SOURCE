/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  lkv
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class mgx {
    public static String Dws = null;
    public static String Dwt = null;
    public static String Dwu = null;

    private mgx() {
    }

    public static boolean M(jrw jrw2) {
        bvf bvf2 = (bvf)new jyg(false).d(jrw2.getName(), bve.a.dQu);
        if (bvf2 == null) {
            Dws = "Could not parse Animation SFFile ->" + jrw2.getName();
            return false;
        }
        return mgx.d(bvf2.azA());
    }

    public static boolean d(lks lks2) {
        Dws = "";
        boolean bl = true;
        kat kat2 = new kat();
        List<String> list = null;
        try {
            list = kat2.dUl();
        }
        catch (bo bo2) {
            bo2.printStackTrace();
            Dws = "RequiredStates fil not parsed!";
            return false;
        }
        List<lkr> list2 = lks2.eue();
        ArrayList<String> arrayList = lcn.emv();
        for (lkr object : list2) {
            String string = lkv.adr((int)object.etO());
            if (string == null) {
                Dws = Dws + "Invalid StateID = " + object.etO() + "\n";
                bl = false;
                continue;
            }
            string = string.toLowerCase();
            arrayList.add(string);
        }
        if (!bl) {
            return bl;
        }
        for (String string : list) {
            if (arrayList.contains(string)) continue;
            Dws = Dws + "State not mapped = " + string + "\n";
            bl = false;
        }
        for (String string : arrayList) {
            if (list.contains(string)) continue;
            Dws = Dws + "State mapped, but not in ReqList = " + string + ".  *Update ReqList file?*\n";
            bl = false;
        }
        return bl;
    }

    public static boolean d(bvf bvf2) {
        boolean bl = true;
        Dwu = "";
        if (bvf2.azw() == null) {
            Dwu = Dwu + "\nAnimation [" + bvf2.ayY() + "] does not have it's SetManager initialized!";
            return false;
        }
        if (bvf2.azw().etK().isEmpty()) {
            Dwu = Dwu + "\nAnimation [" + bvf2.ayY() + "] has an empty Set-list. No good!!";
            return false;
        }
        List<lkr> list = bvf2.azA().eue();
        for (lkr lkr2 : list) {
            Object object;
            if (lkr2.getSetName() == null) {
                object = lkv.adr((int)lkr2.etO());
                Dwu = Dwu + "\nState [" + (String)object + "] has invalid setname [null]!";
                bl = false;
            }
            object = bvf2.azw().etK();
            boolean bl2 = false;
            Object object2 = object.iterator();
            while (object2.hasNext()) {
                lkl lkl2 = (lkl)object2.next();
                if (!lkl2.dZF().equalsIgnoreCase(lkr2.getSetName())) continue;
                bl2 = true;
                break;
            }
            if (bl2) continue;
            object2 = lkv.adr((int)lkr2.etO());
            Dwu = Dwu + "\nState [" + (String)object2 + "] refers to non-existing set [" + lkr2.getSetName() + "] !";
            bl = false;
        }
        return bl;
    }

    public static boolean BS(String string) {
        Object object;
        boolean bl = true;
        Dwt = "";
        Map<String, eh> map2 = ei.ao(string);
        assert (map2 != null);
        String[] stringArray = new String[]{"AttachPoint Character Crouch Eye Center", "AttachPoint Character Eye Center"};
        for (int i = 0; i < stringArray.length; ++i) {
            object = map2.get(stringArray[i]);
            if (object == null) {
                Dwt = Dwt + "Could not find Attachpoin = " + stringArray[i] + "\n";
                bl = false;
                continue;
            }
            if (!((eh)object).fb().isZero()) continue;
            Dwt = Dwt + "AttachPoint has ZERO translation = " + ((eh)object).getName() + "\n";
            bl = false;
        }
        kas kas2 = new kas();
        object = null;
        try {
            object = kas2.dUl();
        }
        catch (bo bo2) {
            bo2.printStackTrace();
            Dwt = "RequiredStates file not parsed!";
            return false;
        }
        ArrayList<String> arrayList = lcn.emv();
        for (Map.Entry<String, eh> object2 : map2.entrySet()) {
            arrayList.add(object2.getKey().toLowerCase());
        }
        if (!bl) {
            return bl;
        }
        Iterator<Map.Entry<String, eh>> iterator = object.iterator();
        while (iterator.hasNext()) {
            String string2 = (String)((Object)iterator.next());
            if (arrayList.contains(string2)) continue;
            Dwt = Dwt + "Missing attachpoint = " + string2 + "\n";
            bl = false;
        }
        for (String string3 : arrayList) {
            if (object.contains(string3)) continue;
            Dwt = Dwt + "Attachpoint mapped, but not in ReqList = " + string3 + ".  *Update ReqList?*\n";
            bl = false;
        }
        return bl;
    }
}

