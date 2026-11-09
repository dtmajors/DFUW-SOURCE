/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import spenefett.hid.gui.serialization.dto.SFSalvageableResourceDTO;
import spenefett.hid.gui.serialization.dto.SFSalvageableResourcesDTO;

public abstract class ifd {
    protected bsh lQU = null;
    protected int lQV = 0;
    protected int iNh = -1;
    protected ctu lQW = null;
    protected int lQX = -1;
    protected float lQY = 1.0f;
    protected int lQZ = 0;
    protected int[] lRa = null;
    protected ldv iJE = null;

    public ldv getTargetObjectGUID() {
        return this.lQU.getGUID();
    }

    public int cRR() {
        return this.lQU == null ? -1 : this.lQU.az();
    }

    public String cRS() {
        return this.lQU == null ? "" : lea.enW().getName(this.lQU.az());
    }

    public int bPL() {
        return this.iNh;
    }

    public String cRT() {
        return lea.enW().getName(this.iNh);
    }

    public int cRU() {
        return this.lQX;
    }

    public float cRV() {
        return this.lQY;
    }

    public int Qx(int n) {
        return cug.we((int)n) ? Math.max(1, (int)((float)this.lQZ * 0.9f)) : this.lQZ;
    }

    public int cRW() {
        return this.lQV;
    }

    public String cRX() {
        return this.lQU == null ? "" : lxy.tAV.bD(this.lQV).exA();
    }

    public abstract boolean cRY();

    public abstract String cRZ();

    protected abstract float cSa();

    public hwo cSb() {
        return new hwo(this.lQU);
    }

    public String cSc() {
        return this.lRa == null || this.lRa.length == 0 ? "" : lxy.tod.bD(this.lRa[0], 1).exA();
    }

    public ldv cSd() {
        return this.lQU == null ? null : this.lQU.AW();
    }

    protected ifd(bsh bsh2) {
        this.lQU = bsh2;
    }

    protected boolean cSe() {
        this.lQV = this.lQU.vf();
        this.lQW = cwy.bm(cxd.fLs, this.iNh);
        if (this.lQW == null) {
            return false;
        }
        if (this.lQW.bbI() == null || this.lQW.bbI().length != 1) {
            return false;
        }
        this.lQX = this.lQW.bbI()[0].SkillType;
        this.lQY = this.lQW.bbI()[0].SkillLevel;
        this.lQZ = 0;
        for (ctm object : this.lQW.Ingredients) {
            if (object.ResourceType != cug.fkb) continue;
            this.lQZ += object.asi;
        }
        ArrayList arrayList = lcn.emv();
        for (cut cut2 : lea.yq(true).keySet()) {
            if (cut2.fyi != this.lQX) continue;
            arrayList.add(cut2);
        }
        this.lRa = new int[arrayList.size()];
        int n = 0;
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            cut cut2 = (cut)iterator.next();
            this.lRa[n++] = cut2.bcb();
        }
        if (this.lRa.length == 0) {
            lfn.b(5, "SFSalvageableItem", "setupItem() : Failed to Locate Workstation for Required Crafting Skill!!!... Required Crafting Skill = " + lea.enZ().getName(this.lQX));
            return false;
        }
        return true;
    }

    public boolean Qy(int n) {
        if (this.lRa == null || this.lRa.length == 0) {
            return false;
        }
        for (int j = 0; j < this.lRa.length; ++j) {
            if (this.lRa[j] != n) continue;
            return true;
        }
        return false;
    }

    public double a(cxy cxy2, int n) {
        return cxy2 == null || this.lQW == null ? 0.0 : cwy.a((cxc)((Object)cxy2), this.lQW, n, 1, 0);
    }

    public SFSalvageableResourcesDTO b(cxy cxy2, int n) {
        SFSalvageableResourcesDTO sFSalvageableResourcesDTO = new SFSalvageableResourcesDTO();
        sFSalvageableResourcesDTO.resources = lcn.emv();
        if (this.lQW == null || this.lQW.Ingredients == null || this.lQW.Ingredients.length == 0) {
            return sFSalvageableResourcesDTO;
        }
        float f = cxy2 == null ? 0.0f : cxy2.bgt() + cxy2.bgu() * cxy2.Bt() / 100.0f;
        f *= this.cSa();
        float f2 = cug.we((int)n) ? 0.05f : 0.0f;
        for (int i2 = 0; i2 < this.lQW.Ingredients.length; ++i2) {
            if (this.lQW.Ingredients[i2].ResourceType == cug.fkb) continue;
            SFSalvageableResourceDTO sFSalvageableResourceDTO = new SFSalvageableResourceDTO();
            sFSalvageableResourcesDTO.resources.add(sFSalvageableResourceDTO);
            sFSalvageableResourceDTO.quantity = this.lQW.Ingredients[i2].asi;
            sFSalvageableResourceDTO.resourceName = lxy.tod.bD(this.lQW.Ingredients[i2].ResourceType, 1).exA();
            sFSalvageableResourceDTO.chance = (int)((f * this.lQW.Ingredients[i2].fgb + f2) * 100.0f);
            sFSalvageableResourceDTO.hasBonus = cug.we((int)n);
        }
        return sFSalvageableResourcesDTO;
    }

    public abstract boolean a(ifd var1);

    public abstract void K(bsh var1);

    public abstract boolean L(bsh var1);

    public int hashCode() {
        return this.lQU == null ? 0 : this.lQU.getGUID().hashCode();
    }

    public abstract boolean equals(Object var1);

    public static boolean M(bsh bsh2) {
        return cug.wk((int)bsh2.az());
    }

    public static ifd N(bsh bsh2) {
        ifd ifd2 = null;
        if (!ifd.M(bsh2)) {
            return ifd2;
        }
        ifd2 = cug.wm((int)bsh2.az()) ? new ife(bsh2) : new iff(bsh2);
        if (!ifd2.cSe()) {
            ifd2 = null;
        }
        return ifd2;
    }

    public static boolean a(hxb hxb2, hxd hxd2) {
        if (hxb2 == null) {
            return false;
        }
        if (hxd2 == null) {
            return false;
        }
        Map<ldv, bsh> map = hxd2.cCO();
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (bsh bsh2 : map.values()) {
            ifd ifd2;
            if (!(lea.enW().isDescendant(bsh2.az(), cug.fjP) ? ifd.a(hxb2, hxb2.ri(bsh2.getGUID())) : (ifd2 = ifd.N(bsh2)) != null)) continue;
            return true;
        }
        return false;
    }

    public static List<ifd> b(hxb hxb2, hxd hxd2) {
        ArrayList<ifd> arrayList = lcn.emv();
        if (hxb2 == null) {
            return arrayList;
        }
        if (hxd2 == null) {
            return arrayList;
        }
        Map<ldv, bsh> map = hxd2.cCO();
        if (map == null || map.isEmpty()) {
            return arrayList;
        }
        for (bsh bsh2 : map.values()) {
            if (lea.enW().isDescendant(bsh2.az(), cug.fjP)) {
                arrayList.addAll(ifd.b(hxb2, hxb2.ri(bsh2.getGUID())));
                continue;
            }
            ifd ifd2 = ifd.N(bsh2);
            if (ifd2 == null) continue;
            arrayList.add(ifd2);
        }
        return arrayList;
    }

    public boolean rz(ldv ldv2) {
        return false;
    }
}

