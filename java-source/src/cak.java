/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public class cak {
    public static final int eeP = 1;
    public static final int eeQ = 8;
    public static final String eeR = "ShaderDefault.xml";
    public static final String eeS = "dds\\texture_of_doom_01.dds";
    public static final c[] eeT = new c[]{c.ega, c.egb, c.egc, c.egd, c.ege, c.egf, c.egg, c.egh, c.egi, c.egj};
    private static final String eeU = "ShaderAnim.xml";
    private static final String eeV = "ShaderAnimArmor.xml";
    private static final String eeW = "ShaderAnimCharNew.xml";
    private static final String eeX = "ShaderAnimHair.xml";
    private static final String eeY = "ShaderAnimOrkFace.xml";
    private static final String eeZ = "ShaderHair.xml";
    private static final String efa = "ShaderHairCKey.xml";
    private static final String efb = "shaderhairckeynew.xml";
    private static final String efc = "ShaderHair_Volume.xml";
    private static final String efd = "ShaderHair_VolumeCKey.xml";
    private static final String efe = "ShaderBeardCKey.xml";
    public static final int eff = 0;
    public static final int efg = 1;
    public static final int efh = 2;
    public static final int efi = 3;
    public static final int efj = 4;
    public static final int efk = 4;
    public static final int efl = 8;
    public static final int efm = 8;
    public static final int efn = 1;
    public static final int efo = 4;
    private static final String[] efp = new String[]{"Subset Head", "Subset Torso", "Subset Arms", "Subset Legs", "Subset Template Head", "Subset Template Torso", "Subset Template Arms", "Subset Template Legs", "Subset Determination Head", "Subset Determination Torso", "Subset Determination Arms", "Subset Determination Legs"};
    private static les ResourceTree = lea.enW();
    private static cak efq = new cak();

    public static int[] gS(String string) {
        if (string == null) {
            lfn.b(5, "SFPaperdollConstants", "getShaderAttributeTypes() ShaderName is null.");
            return null;
        }
        if (string.equalsIgnoreCase(eeU)) {
            return new int[]{352, 354};
        }
        if (string.equalsIgnoreCase(eeV)) {
            return new int[]{1232, 1234};
        }
        if (string.equalsIgnoreCase(eeW)) {
            return new int[]{352, 354};
        }
        return null;
    }

    public static f[] o(int n, String string) {
        if (cug.wB((int)n)) {
            return new f[]{f.ehf, f.ehg};
        }
        if (ResourceTree.k(n, cug.fjH, false)) {
            if (cak.gU(string)) {
                return new f[]{f.ehc};
            }
            return null;
        }
        if (ResourceTree.k(n, cug.fjR, false)) {
            if (cak.gU(string)) {
                return new f[]{f.ehc};
            }
            return null;
        }
        if (ResourceTree.k(n, cug.fjU, false)) {
            if (string.equalsIgnoreCase(eeU) || string.equalsIgnoreCase(eeW) || string.equalsIgnoreCase(eeY)) {
                return new f[]{f.ehd, f.ehe};
            }
            return null;
        }
        if (ResourceTree.k(n, cug.fkc, false)) {
            if (cak.gU(string)) {
                return new f[]{f.ehc};
            }
            return null;
        }
        if (ResourceTree.k(n, cug.fkg, false)) {
            if (cak.gU(string)) {
                return new f[]{f.ehc};
            }
            return null;
        }
        if (ResourceTree.k(n, cug.fgJ, false)) {
            if (string.equalsIgnoreCase(eeU) || string.equalsIgnoreCase(eeW) || string.equalsIgnoreCase(eeY)) {
                return new f[]{f.ehd, f.ehe};
            }
            if (string.equalsIgnoreCase(eeX) || string.equalsIgnoreCase(efe)) {
                return new f[]{f.ehc};
            }
            return null;
        }
        if (ResourceTree.k(n, cug.fkL, false)) {
            if (cak.gU(string)) {
                return new f[]{f.ehc};
            }
            return null;
        }
        if (cak.gU(string)) {
            return new f[]{f.ehc};
        }
        return null;
    }

    public static String[] gT(String string) {
        int n = lea.enW().getType(string);
        if (!ResourceTree.k(n, cug.fia, false)) {
            lfn.b(5, "SFPaperdollConstants", "getNPCNamesForResourceType() ResourceType is invalid.");
            return null;
        }
        Map<can, cam> map = lea.ack(n);
        if (map == null) {
            lfn.b(5, "SFPaperdollConstants", "getNPCNamesForResourceType() PaperdollItemMap is null.");
            return null;
        }
        if (map.isEmpty()) {
            return new String[0];
        }
        ArrayList<String> arrayList = lcn.emv();
        for (cap object : map.keySet()) {
            if (!object.pa().equalsIgnoreCase(string)) continue;
            arrayList.add(object.Yq());
        }
        for (Map.Entry entry : lea.epm().entrySet()) {
            if (((caz)entry.getValue()).az() != n) continue;
            arrayList.add(bqm.md((Integer)entry.getKey()));
        }
        Iterator<Object> iterator = new String[arrayList.size()];
        Collections.sort(arrayList);
        arrayList.toArray((T[])iterator);
        return iterator;
    }

    public static boolean gU(String string) {
        if (string.equalsIgnoreCase(eeX)) {
            return true;
        }
        if (string.equalsIgnoreCase(eeZ)) {
            return true;
        }
        if (string.equalsIgnoreCase(efa)) {
            return true;
        }
        if (string.equalsIgnoreCase(efb)) {
            return true;
        }
        if (string.equalsIgnoreCase(efc)) {
            return true;
        }
        if (string.equalsIgnoreCase(efd)) {
            return true;
        }
        return string.equalsIgnoreCase(efe);
    }

    public static int gV(String string) {
        if (string == null) {
            lfn.b(5, "SFInventoryConstants", "getSubsetID() SubsetName is null.");
            return -1;
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            if (!efp[i2].equalsIgnoreCase(string)) continue;
            return i2;
        }
        lfn.b(5, "SFInventoryConstants", "getSubsetID() SubsetName '" + string + "' is invalid.");
        return -1;
    }

    public static String os(int n) {
        if (n < 0 || n >= efp.length) {
            lfn.b(5, "SFInventoryConstants", "getSubsetName() SubsetID is invalid.");
            return null;
        }
        return efp[n];
    }

    public static String[] aGg() {
        String[] stringArray = new String[4];
        int n = stringArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            stringArray[i2] = efp[i2];
        }
        return stringArray;
    }

    public static String[] a(boolean bl, int n, boolean bl2) {
        if (n <= 0) {
            return null;
        }
        if (ResourceTree.isDescendant(n, cug.fiL)) {
            bqm.d d2 = bqm.d.getWeaponType(n);
            switch (d2) {
                case AXE: 
                case CLUB: 
                case SITHRA: 
                case SWORD: {
                    if (bl2) {
                        return new String[]{"AttachPoint_Pelvis Left"};
                    }
                    return new String[]{"AttachPoint_Weapon"};
                }
                case BOW: {
                    if (bl2) {
                        return new String[]{"AttachPoint_Ribcage Back Bow"};
                    }
                    if (bl) {
                        return new String[]{"AttachPoint_Weapon Bow"};
                    }
                    return new String[]{"AttachPoint_Weapon"};
                }
                case GREATAXE: 
                case GREATCLUB: 
                case GREATSWORD: 
                case SIEGE_WEAPON: {
                    if (bl2) {
                        return new String[]{"AttachPoint_Pelvis Left"};
                    }
                    if (bl) {
                        return new String[]{"AttachPoint_Weapon TwoHanded"};
                    }
                    return new String[]{"AttachPoint_Weapon"};
                }
                case KNIVES: {
                    if (bl2) {
                        return new String[]{"AttachPoint_Pelvis Left", "AttachPoint_Pelvis Right"};
                    }
                    if (!bl) {
                        return new String[]{"AttachPoint_Weapon", "AttachPoint_Weapon Left"};
                    }
                    return new String[]{"AttachPoint_Knives Right", "AttachPoint_Weapon Left"};
                }
                case MAGIC_STAFF: {
                    if (bl2) {
                        return new String[]{"AttachPoint_Ribcage Back Staff"};
                    }
                    if (bl) {
                        return new String[]{"AttachPoint_Weapon Staff"};
                    }
                    return new String[]{"AttachPoint_Weapon"};
                }
                case NATURAL_BOW: 
                case NATURAL_MAGIC_STAFF: 
                case NATURAL_MELEE: {
                    return null;
                }
                case POLEARM: {
                    if (bl2) {
                        return new String[]{"AttachPoint_Ribcage Back"};
                    }
                    if (bl) {
                        return new String[]{"AttachPoint_Weapon Halberd"};
                    }
                    return new String[]{"AttachPoint_Weapon"};
                }
                case THROWABLE_WEAPON: {
                    if (bl2) {
                        return new String[]{"AttachPoint_Pelvis Left"};
                    }
                    if (bl) {
                        return new String[]{"AttachPoint_Weapon Grenade"};
                    }
                    return new String[]{"AttachPoint_Weapon"};
                }
            }
            lfn.b(5, "SFPaperdollConstants", "getAttachPointNames() Invalid weapontype provided: " + (Object)((Object)d2) + " for resource=" + n);
            return null;
        }
        if (ResourceTree.isDescendant(n, cug.fkF)) {
            if (bl2) {
                return new String[]{"AttachPoint_Shield"};
            }
            return null;
        }
        if (ResourceTree.isDescendant(n, cug.fmO)) {
            if (bl2) {
                return new String[]{"AttachPoint_Pelvis Left"};
            }
            if (n == cug.fmR || n == cug.fmS) {
                return new String[]{"AttachPoint Shovel"};
            }
            return new String[]{"AttachPoint_Weapon"};
        }
        lfn.b(5, "SFPaperdollConstants", "getAttachPointNames() Invalid resourcetype provided: '" + ResourceTree.getName(n) + "'");
        return null;
    }

    public static boolean u(int n, boolean bl) {
        return cak.a(false, n, bl) != null;
    }

    private cak() {
    }

    public static boolean e(bzs bzs2) {
        if (bzs2.auO() != c.egs) {
            return false;
        }
        return !lea.enW().isDescendant(bzs2.ResourceType, cug.fjo) && !lea.enW().isDescendant(bzs2.ResourceType, cug.fjp) && !lea.enW().isDescendant(bzs2.ResourceType, cug.fjq);
    }
}

