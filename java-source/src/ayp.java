/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  cug
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import spenefett.hid.gui.serialization.dto.SFCityElementDTO;
import spenefett.hid.gui.serialization.dto.SFClanCityBlueprintDTO;
import spenefett.hid.gui.serialization.dto.SFClanHoldingDetailsDTO;

public class ayp {
    private ldv GUID = null;
    private String ID = null;
    private int Type = ayb.cvi.ordinal();
    private ljq Position = null;
    private float Radius = 0.0f;
    private int crZ = 0;
    private ldv aDn = null;
    private String aDo = null;
    private ldv aDp = null;
    private String czS = null;
    private int czT = cla.eHl.ordinal();
    private int czU = ayx.cCo.ordinal();
    private int czV = ayx.cCo.ordinal();
    private aze[] czW = null;
    private ayz[] czX = null;
    private int czY = 0;
    private int czZ = azf.cEa.ordinal();
    private int aGh = azh.cEi.ordinal();
    private boolean cAa = false;
    private double cAb = 0.0;
    private boolean cAc = false;
    private static int cAd = 0;

    public ldv getGUID() {
        return this.GUID;
    }

    public String getID() {
        return this.ID;
    }

    public ayb abi() {
        return ayb.getValueByOrdinal(this.Type);
    }

    public ljq av() {
        return this.Position;
    }

    public float getRadius() {
        return this.Radius;
    }

    public int Xx() {
        return this.crZ;
    }

    public ldv abj() {
        return this.aDn;
    }

    public String abk() {
        return this.aDo;
    }

    public ldv YS() {
        return this.aDp;
    }

    public cla abl() {
        return cla.getValueByOrdinal(this.czT);
    }

    public ayx abm() {
        return ayx.getValueByOrdinal(this.czU);
    }

    public ayx abn() {
        return ayx.getValueByOrdinal(this.czV);
    }

    public aze[] abo() {
        return this.czW;
    }

    public ayz[] abp() {
        return this.czX;
    }

    public int abq() {
        return this.czY;
    }

    public boolean es(ldv ldv2) {
        for (int i = 0; i < this.czX.length; ++i) {
            if (!this.czX[i].ach().equals(ldv2)) continue;
            return true;
        }
        return false;
    }

    public azf Zr() {
        return azf.getValueByOrdinal(this.czZ);
    }

    public azh abr() {
        return azh.getValueByOrdinal(this.aGh);
    }

    public boolean abs() {
        return this.cAa;
    }

    public double abt() {
        return this.cAb;
    }

    public boolean abu() {
        return this.cAc;
    }

    @Deprecated
    public ayp() {
    }

    public ayp(ayd ayd2, azb azb2) {
        bbr bbr2 = ayd2.dR(azb2.YS());
        this.GUID = azb2.acm();
        this.ID = azb2.Xt();
        this.Type = azb2.Xz().ordinal();
        this.Position = azb2.Xv();
        this.Radius = azb2.Xu();
        this.crZ = (int)azb2.acq();
        this.aDn = ayd2.getGUID();
        this.aDo = ayd2.iV();
        this.aDp = bbr2 == null ? null : bbr2.abB();
        this.czS = bbr2 == null ? null : bbr2.iP() + " " + bbr2.iR();
        this.czT = ayd2.er(azb2.acm()).ordinal();
        this.czU = ayd2.ee(azb2.acm()).ordinal();
        this.czV = ayd2.ef(azb2.acm()).ordinal();
        this.czW = azb2.acs();
        this.czX = azb2.abp();
        this.czY = azb2.acp();
        this.czZ = ayd2.ed(azb2.acm()).ordinal();
        this.aGh = ayd2.em(this.GUID).ordinal();
        this.cAb = ayd2.ek(this.GUID);
        this.cAa = ayd2.el(this.GUID);
        this.cAc = ayd2.en(this.GUID);
    }

    public ayp(ldv ldv2) {
        this.GUID = new ldv(lcr.qAC.ib(), lcr.qAC.enw(), cAd);
        this.ID = "Test Holding " + cAd++;
        this.Type = lgp.erA().cS(lgp.erA().nextFloat()) ? ayb.cvj.ordinal() : ayb.cvk.ordinal();
        this.Position = new ljq(lgp.erA().nextFloat() * 16384.0f - 8192.0f, 0.0f, lgp.erA().nextFloat() * 16384.0f - 8192.0f);
        this.Radius = 0.0f;
        this.crZ = (int)(lgp.erA().nextFloat() * 1000.0f) + 1000;
        this.aDn = ldv2;
        this.aDo = "Some Clan!";
        this.aDp = null;
        this.czT = (int)(lgp.erA().nextFloat() * (float)(cla.values().length - 1));
        this.czU = (int)(lgp.erA().nextFloat() * (float)(ayx.values().length - 1));
        this.czW = new aze[0];
        this.czX = new ayz[10];
        for (int i = 0; i < this.czX.length; ++i) {
            this.czX[i] = new ayz(new ldv(1, 2, 3), "Test Citizen " + (i + 1), 1, 1, new ldv(3, 2, 1), "Test Citizen Clan " + (i + 1));
        }
        this.czY = 0;
        this.czZ = (int)(lgp.erA().nextFloat() * (float)(azf.values().length - 1));
        this.aGh = (int)(lgp.erA().nextFloat() * (float)(azh.values().length - 1));
        this.cAa = false;
        this.cAb = 0.0;
        this.cAc = false;
    }

    public void j(ldv ldv2, String string) {
        this.aDp = ldv2;
        this.czS = string;
    }

    public void iT(int n) {
        this.czY = n;
    }

    public void b(cla cla2) {
        this.czT = cla2 == null ? this.czT : cla2.ordinal();
    }

    public void a(ayx ayx2) {
        this.czU = ayx2 == null ? this.czU : ayx2.ordinal();
    }

    public void b(ayx ayx2) {
        this.czV = ayx2 == null ? this.czV : ayx2.ordinal();
    }

    public void a(azf azf2) {
        this.czZ = azf2 == null ? this.czZ : azf2.ordinal();
    }

    public Set<aze> a(aze aze2) {
        for (int i = 0; i < this.czW.length; ++i) {
            if (this.czW[i].getID() != aze2.getID()) continue;
            this.czW[i] = aze2;
            break;
        }
        Set<aze> set = lcn.emx();
        set.add(aze2);
        for (int i = 0; i < this.czW.length; ++i) {
            boolean bl;
            if (this.czW[i].acK() || this.czW[i].acO() == null || this.czW[i].acO().length == 0) continue;
            boolean bl2 = false;
            boolean bl3 = -1 != 0;
            for (bl = false; bl < this.czW[i].acO().length; bl += 1) {
                if (this.czW[i].acO()[bl] != aze2.az()) continue;
                bl2 = true;
                bl3 = bl;
                break;
            }
            if (!bl2) continue;
            if (!aze2.acK() || !aze2.isEnabled() || aze2.XS() < this.czW[i].acP()[bl3]) {
                if (!this.czW[i].acL()) continue;
                this.czW[i].ct(false);
                set.add(this.czW[i]);
                continue;
            }
            if (this.czW[i].acO().length == 1) {
                if (this.czW[i].acL()) continue;
                this.czW[i].ct(true);
                set.add(this.czW[i]);
                continue;
            }
            bl = true;
            for (int j = 0; j < this.czW[i].acO().length; ++j) {
                if (this.czW[i].acO()[j] == aze2.az()) continue;
                for (int k = 0; k < this.czW.length; ++k) {
                    if (this.czW[k].az() != this.czW[i].acO()[j] || this.czW[k].acK() && this.czW[k].isEnabled() && !this.czW[k].acR() && this.czW[k].XS() >= this.czW[i].acP()[j]) continue;
                    bl = false;
                    break;
                }
                if (!bl) break;
            }
            if (this.czW[i].acL() == bl) continue;
            this.czW[i].ct(bl);
            set.add(this.czW[i]);
        }
        return set;
    }

    public void a(ayz ayz2) {
        if (ayz2 == null) {
            return;
        }
        ArrayList<ayz> arrayList = lcn.emv();
        for (int i = 0; i < this.czX.length; ++i) {
            arrayList.add(this.czX[i]);
        }
        arrayList.add(ayz2);
        this.czX = arrayList.toArray(new ayz[arrayList.size()]);
    }

    public void et(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        ArrayList<ayz> arrayList = lcn.emv();
        for (int i = 0; i < this.czX.length; ++i) {
            if (this.czX[i].ach().equals(ldv2)) continue;
            arrayList.add(this.czX[i]);
        }
        this.czX = arrayList.toArray(new ayz[arrayList.size()]);
    }

    public void b(ayz ayz2) {
        if (ayz2 == null) {
            return;
        }
        for (int i = 0; i < this.czX.length; ++i) {
            if (!this.czX[i].ach().equals(ayz2.ach())) continue;
            this.czX[i] = ayz2;
            return;
        }
    }

    public void a(azh azh2, double d2, boolean bl, boolean bl2) {
        if (azh2 == null) {
            return;
        }
        this.aGh = azh2.ordinal();
        this.cAb = d2;
        this.cAa = bl;
        this.cAc = bl2;
    }

    public void iU(int n) {
        this.crZ = n;
    }

    public SFClanHoldingDetailsDTO a(ljq ljq2, ays ays2, jng jng2, jnr jnr2, dmn dmn2, ldz ldz2) {
        ljq ljq3 = new ljq(this.Position.x, 0.0f, this.Position.rlV);
        ljq ljq4 = ljq2 == null ? null : new ljq(ljq2.x, 0.0f, ljq2.rlV);
        float f = (float)Math.round((ljq4 == null ? 0.0f : ljq3.ez(ljq4)) * 100.0f) / 100.0f;
        SFClanHoldingDetailsDTO sFClanHoldingDetailsDTO = new SFClanHoldingDetailsDTO();
        sFClanHoldingDetailsDTO.id = this.ID;
        sFClanHoldingDetailsDTO.name = lvm.sWY.bD(this.ID).exA();
        sFClanHoldingDetailsDTO.type = this.Type;
        sFClanHoldingDetailsDTO.location = new lis(this.Position).esy();
        sFClanHoldingDetailsDTO.distance = f >= 1000.0f ? Float.toString((float)Math.round(f / 100.0f) / 10.0f) + "km" : Math.round(f) + "m";
        sFClanHoldingDetailsDTO.ownerName = this.aDo;
        sFClanHoldingDetailsDTO.guardTowerPolicy = this.czT;
        sFClanHoldingDetailsDTO.bankAccessPolicy = this.czU;
        sFClanHoldingDetailsDTO.marketAccessPolicy = this.czV;
        sFClanHoldingDetailsDTO.mayor = ays2 == null ? null : ays2.abM();
        sFClanHoldingDetailsDTO.mayorName = this.czS;
        sFClanHoldingDetailsDTO.citizens = lcn.emv();
        for (ayz ayz2 : this.czX) {
            sFClanHoldingDetailsDTO.citizens.add(ayz2.eL(this.aDn));
        }
        sFClanHoldingDetailsDTO.maxCitizens = this.czY;
        sFClanHoldingDetailsDTO.playersClansHolding = jng2.sz(this.aDn);
        sFClanHoldingDetailsDTO.gateControlPolicy = this.czZ;
        sFClanHoldingDetailsDTO.protectionActive = dmn2 == null ? false : dmn2.nc(this.GUID);
        sFClanHoldingDetailsDTO.conquestActive = jnr2 == null ? false : jnr2.sZ(this.GUID);
        sFClanHoldingDetailsDTO.vulnerable = jnr2 == null ? false : jnr2.ta(this.GUID);
        sFClanHoldingDetailsDTO.protectionCostStrings = lcn.emv();
        sFClanHoldingDetailsDTO.protectionCostStringsWithAssetDamage = lcn.emv();
        for (azh azh2 : azh.values()) {
            sFClanHoldingDetailsDTO.protectionCostStrings.add(lwa.tcN.bD(jng.itG.a(ayb.getValueByOrdinal(this.Type), azh2, false, this.crZ)).exA());
            sFClanHoldingDetailsDTO.protectionCostStringsWithAssetDamage.add(lwa.tcN.bD(jng.itG.a(ayb.getValueByOrdinal(this.Type), azh2, true, this.crZ)).exA());
        }
        sFClanHoldingDetailsDTO.selectedProtection = this.aGh;
        sFClanHoldingDetailsDTO.protectionAvailable = !sFClanHoldingDetailsDTO.protectionActive && ldz2.rgz >= this.cAb;
        sFClanHoldingDetailsDTO.protectionAutoRenews = this.cAa;
        sFClanHoldingDetailsDTO.protectionIncludesAssetDamage = this.cAc;
        return sFClanHoldingDetailsDTO;
    }

    public SFClanCityBlueprintDTO abv() {
        SFClanCityBlueprintDTO sFClanCityBlueprintDTO = new SFClanCityBlueprintDTO();
        sFClanCityBlueprintDTO.name = lvm.sWY.bD(this.ID).exA();
        sFClanCityBlueprintDTO.mapTitle = lvz.tcl.bD(this.ID).exA();
        sFClanCityBlueprintDTO.elements = lcn.emv();
        sFClanCityBlueprintDTO.builtValuesTitle = lvz.tcr.bD(new Object[0]).exA();
        sFClanCityBlueprintDTO.prerequisitesTitle = lvz.tcs.bD(new Object[0]).exA();
        sFClanCityBlueprintDTO.healthString = lvz.tct.bD(new Object[0]).exA();
        sFClanCityBlueprintDTO.stateStringEnabled = lvz.tcu.bD(new Object[0]).exA();
        sFClanCityBlueprintDTO.stateStringDisabled = lvz.tcv.bD(new Object[0]).exA();
        sFClanCityBlueprintDTO.upgradeLevelString = lvz.tcw.bD(new Object[0]).exA();
        float f = Float.MAX_VALUE;
        float f2 = Float.MAX_VALUE;
        float f3 = -3.4028235E38f;
        float f4 = -3.4028235E38f;
        for (aze aze2 : this.czW) {
            if (aze2.acM().x + lcw.fyn.x < f) {
                f = aze2.acM().x + lcw.fyn.x;
            } else if (aze2.acM().x + lcw.fyn.x > f3) {
                f3 = aze2.acM().x + lcw.fyn.x;
            }
            if (aze2.acM().rlV + lcw.fyn.rlV < f2) {
                f2 = aze2.acM().rlV + lcw.fyn.rlV;
                continue;
            }
            if (!(aze2.acM().rlV + lcw.fyn.rlV > f4)) continue;
            f4 = aze2.acM().rlV + lcw.fyn.rlV;
        }
        sFClanCityBlueprintDTO.x = f3 - f;
        sFClanCityBlueprintDTO.y = f4 - f2;
        sFClanCityBlueprintDTO.minX = f;
        sFClanCityBlueprintDTO.minY = f2;
        for (aze aze2 : this.czW) {
            String string = aze2.pa().toLowerCase();
            if ((string = string.replaceAll(" ", "")).startsWith("r_wonder") || string.compareTo("r_clanenchantmentwheel") == 0 || string.compareTo("r_clansummoningritualaltar") == 0) continue;
            SFCityElementDTO sFCityElementDTO = new SFCityElementDTO();
            sFCityElementDTO.resourceName = string;
            sFCityElementDTO.category = aze2.acJ().ordinal();
            sFCityElementDTO.x = (aze2.acM().x + lcw.fyn.x - sFClanCityBlueprintDTO.minX) / sFClanCityBlueprintDTO.x;
            sFCityElementDTO.y = 1.0f - (aze2.acM().rlV + lcw.fyn.rlV - sFClanCityBlueprintDTO.minY) / sFClanCityBlueprintDTO.y;
            sFCityElementDTO.rotation = aze2.aw().eqT().y;
            sFCityElementDTO.currentLevel = aze2.XS();
            sFCityElementDTO.maxLevel = aze2.XT();
            sFCityElementDTO.built = aze2.acK();
            sFCityElementDTO.buildable = aze2.acL();
            sFCityElementDTO.id = aze2.getID();
            sFCityElementDTO.displayName = lvz.tcm.bD(aze2.pa()).exA();
            sFCityElementDTO.description = lvz.tcn.bD(aze2.pa()).exA();
            sFCityElementDTO.costString = lvz.tco.bD(aze2.acN(), cug.fqf).exA();
            sFCityElementDTO.actionString = aze2.acK() ? lvz.tcq.bD(aze2.pa()).exA() : lvz.tcp.bD(aze2.pa()).exA();
            sFCityElementDTO.prerequisiteResourceNames = lcn.emv();
            sFCityElementDTO.prerequisiteResourceDisplayNames = lcn.emv();
            sFCityElementDTO.prerequisiteLevels = lcn.emv();
            for (int i = 0; i < aze2.acO().length; ++i) {
                String string2 = lea.enW().getName(aze2.acO()[i]).toLowerCase();
                string2 = string2.replaceAll(" ", "");
                sFCityElementDTO.prerequisiteResourceNames.add(string2);
                sFCityElementDTO.prerequisiteResourceDisplayNames.add(lvz.tcm.bD(aze2.acO()[i]).exA());
                sFCityElementDTO.prerequisiteLevels.add(aze2.acP()[i]);
            }
            sFCityElementDTO.enabled = aze2.isEnabled();
            sFCityElementDTO.modifying = aze2.acR();
            sFCityElementDTO.currentHealth = aze2.Yd();
            sFCityElementDTO.maximumHealth = aze2.acQ();
            sFClanCityBlueprintDTO.elements.add(sFCityElementDTO);
        }
        return sFClanCityBlueprintDTO;
    }

    public List<SFCityElementDTO> a(SFClanCityBlueprintDTO sFClanCityBlueprintDTO, Set<aze> set) {
        ArrayList<SFCityElementDTO> arrayList = lcn.emv();
        for (aze aze2 : set) {
            SFCityElementDTO sFCityElementDTO = null;
            for (SFCityElementDTO sFCityElementDTO2 : sFClanCityBlueprintDTO.elements) {
                if (sFCityElementDTO2.id != aze2.getID()) continue;
                sFCityElementDTO = sFCityElementDTO2;
                break;
            }
            if (sFCityElementDTO == null) continue;
            sFCityElementDTO.x = (aze2.acM().x + lcw.fyn.x - sFClanCityBlueprintDTO.minX) / sFClanCityBlueprintDTO.x;
            sFCityElementDTO.y = 1.0f - (aze2.acM().rlV + lcw.fyn.rlV - sFClanCityBlueprintDTO.minY) / sFClanCityBlueprintDTO.y;
            sFCityElementDTO.rotation = aze2.aw().eqT().y;
            sFCityElementDTO.currentLevel = aze2.XS();
            sFCityElementDTO.built = aze2.acK();
            sFCityElementDTO.buildable = aze2.acL();
            sFCityElementDTO.displayName = lvz.tcm.bD(aze2.pa()).exA();
            sFCityElementDTO.description = lvz.tcn.bD(aze2.pa()).exA();
            sFCityElementDTO.costString = lvz.tco.bD(aze2.acN(), cug.fqf).exA();
            sFCityElementDTO.actionString = aze2.acK() ? lvz.tcq.bD(aze2.pa()).exA() : lvz.tcp.bD(aze2.pa()).exA();
            sFCityElementDTO.currentHealth = aze2.Yd();
            sFCityElementDTO.maximumHealth = aze2.acQ();
            sFCityElementDTO.enabled = aze2.isEnabled();
            sFCityElementDTO.modifying = aze2.acR();
            sFCityElementDTO.prerequisiteResourceDisplayNames = lcn.emv();
            sFCityElementDTO.prerequisiteLevels = lcn.emv();
            for (int i = 0; i < aze2.acO().length; ++i) {
                sFCityElementDTO.prerequisiteResourceDisplayNames.add(lvz.tcm.bD(aze2.acO()[i]).exA());
                sFCityElementDTO.prerequisiteLevels.add(aze2.acP()[i]);
            }
            arrayList.add(sFCityElementDTO);
        }
        return arrayList;
    }
}

