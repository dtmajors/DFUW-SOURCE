/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class cnt
extends cnp {
    public static final boolean eOJ = true;
    private final Map<Integer, gpu> eOK = lcn.emw();
    private final List<btf> eOL = lcn.emv();
    private int Qs = 0;
    private boolean bdP = false;
    private Map<ldv, a> eOM = lcn.emw();

    public cnt() {
        super(true);
        Map<Integer, List<bsv>> map = fy.TL;
        Collection<List<bsv>> collection = map.values();
        for (List<bsv> list : collection) {
            for (bsv bsv2 : list) {
                btf btf2 = (btf)bsv2;
                this.eOL.add(btf2);
            }
        }
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24582: {
                this.a((gtz)dxq2);
                break;
            }
            case 12812: {
                this.a((eeg)dxq2);
                break;
            }
            case 11113: {
                this.a((gpt)dxq2);
                break;
            }
            case 7982: {
                this.a((fnf)dxq2);
                break;
            }
            case 11034: {
                this.handleSystemMessageSendingErrorMessage((gre)dxq2);
                break;
            }
            case 9251: {
                this.a((fdu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gtz gtz2) {
        if (gtz2.jrN == null) {
            lfn.b(5, "SFTeleportChamberServer", "handleTeleporterAccessRequestMessage(): Message.TeleportationChamberGUID is null");
            assert (false);
            return;
        }
        if (gtz2.diQ == null) {
            lfn.b(5, "SFTeleportationChamberManager", "handleTeleporterAccessRequestMessage(): Message.PlayerPSOGUID is null");
            assert (false);
            return;
        }
        if (this.eOM.containsKey(gtz2.diQ)) {
            lfn.b(5, "SFTeleportationChamberManager", "handleTeleporterAccessRequestMessage(): Already have a session for " + gtz2.diQ);
            assert (false);
            return;
        }
        ldv ldv2 = lcr.tP((ldv)gtz2.diQ);
        a a2 = new a(this, ldv2);
        a2.afF = gtz2.YN;
        this.eOM.put(gtz2.diQ, a2);
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), gtz2.diQ);
        eef2.hsP = true;
        eef2.aqs = gtz2.diQ.enw();
        this.MessageDelegator.F(eef2);
    }

    private void a(eeg eeg2) {
        int n = eeg2.aVk();
        ldv ldv2 = lcr.abW((int)n);
        a a2 = this.eOM.get(ldv2);
        if (a2 == null) {
            lfn.b(5, "SFTeleportationChamberManager", "handleCharacterNamedPropertiesResponseMessage(): Could not find request for PSOGUID " + ldv2);
            assert (false);
            return;
        }
        if (!eeg2.qf()) {
            this.eOM.remove(ldv2);
            return;
        }
        if (eeg2.bGd()) {
            this.eOM.remove(ldv2);
            this.c(5, eeg2.jr(), ldv2, -1);
            return;
        }
        ljq ljq2 = eeg2.av();
        if (ljq2 == null) {
            this.eOM.remove(ldv2);
            this.c(0, eeg2.jr(), ldv2, -1);
            return;
        }
        float f2 = Math.abs(this.aAG().av().ez(ljq2));
        if (f2 > 22.0f) {
            this.eOM.remove(ldv2);
            this.c(0, eeg2.jr(), ldv2, -1);
            return;
        }
        a2.RB = eeg2.jr();
        double d2 = eeg2.bGf();
        if (a2.eON) {
            if (d2 != -1.0 && d2 + 600.0 > this.MessageDelegator.arc().rgz) {
                this.eOM.remove(ldv2);
                this.c(6, a2.RB, ldv2, -1);
                return;
            }
            if (a2.eOO == null) {
                this.eOM.remove(ldv2);
                assert (false);
                return;
            }
            if (this.bdP) {
                this.eOM.remove(ldv2);
                this.c(1, a2.RB, ldv2, -1);
                return;
            }
            int n2 = lea.az(this.aUK(), a2.eOO);
            if (n2 == 0) {
                this.eOM.remove(ldv2);
                return;
            }
            fne fne2 = (fne)this.MessageDelegator.h(7981, this.getGUID(), ldv2);
            fne2.hsP = true;
            fne2.ResourceType = cug.bbP();
            fne2.asi = n2;
            fne2.aqs = n;
            fne2.b(bqy.dHw);
            this.MessageDelegator.F(fne2);
            this.bdP = true;
            return;
        }
        ljq[] ljqArray = new ljq[this.eOL.size()];
        String[] stringArray = new String[this.eOL.size()];
        int[] nArray = new int[this.eOL.size()];
        int n3 = 0;
        for (btf object2 : this.eOL) {
            ljqArray[n3] = object2.Position;
            stringArray[n3] = object2.dKs;
            nArray[n3] = lea.ay(this.aUK(), object2.dKs);
            ++n3;
        }
        ldv ldv3 = new ldv(a2.RB, lcr.qDC.enw(), lcr.qDC.enx());
        gpu gpu2 = (gpu)this.MessageDelegator.h(11112, this.getGUID(), ldv3);
        gpu2.iLb = stringArray;
        gpu2.iLc = ljqArray;
        gpu2.iLd = nArray;
        gpu2.hsP = true;
        gpu2.iLa = this.aUK();
        gpu2.iLe = d2 != -1.0 ? d2 + 600.0 : -1.0;
        gpu2.aqs = n;
        this.eOK.put(this.Qs, gpu2);
        fdt fdt2 = (fdt)this.MessageDelegator.h(9250, this.getGUID(), a2.afF);
        fdt2.sk(this.Qs++);
        fdt2.kU(true);
        fdt2.cz(10.0);
        fdt2.kT(true);
        this.MessageDelegator.F(fdt2);
        this.eOM.remove(ldv2);
    }

    private void a(fdu fdu2) {
        gpu gpu2 = this.eOK.remove(fdu2.aVk());
        if (gpu2 == null) {
            return;
        }
        if (fdu2.bOA()) {
            this.MessageDelegator.F(gpu2);
        } else {
            this.c(2, gpu2.amk().ib(), lcr.abW((int)gpu2.aqs), -1);
        }
    }

    private void a(gpt gpt2) {
        int n = gpt2.aVk();
        ldv ldv2 = lcr.abW((int)n);
        ldv ldv3 = lcr.tP((ldv)ldv2);
        a a2 = this.eOM.get(ldv2);
        if (a2 != null) {
            lfn.b(5, "SFTeleportationChamberManager", "handleSystemClientClanTeleportationPortalSelectedMessage(): Could not find request for " + ldv2);
            assert (false);
            return;
        }
        if (gpt2.eOO == null) {
            int n2 = gpt2.aO().ib();
            this.c(2, n2, ldv2, -1);
            return;
        }
        a2 = new a(this, ldv3);
        this.eOM.put(ldv2, a2);
        a2.eON = true;
        a2.eOO = gpt2.eOO;
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), ldv2);
        eef2.hsP = true;
        eef2.aqs = n;
        this.MessageDelegator.F(eef2);
    }

    private void a(fnf fnf2) {
        int n = fnf2.aVk();
        ldv ldv2 = lcr.abW((int)n);
        a a2 = this.eOM.get(ldv2);
        if (a2 == null) {
            lfn.b(5, "SFTeleportationChamberManager", "handleInventoryResourceRemoveResponseMessage(): Could not find request for " + ldv2);
            assert (false);
            return;
        }
        this.bdP = false;
        if (!fnf2.iQM) {
            int n2 = lea.ay(this.aUK(), a2.eOO);
            if (n2 == 0) {
                this.eOM.remove(ldv2);
                return;
            }
            this.eOM.remove(ldv2);
            this.c(3, a2.RB, ldv2, n2);
            return;
        }
        ljq ljq2 = null;
        for (btf btf2 : this.eOL) {
            if (!btf2.dKs.equals(a2.eOO)) continue;
            ljq2 = new ljq(btf2.Position);
            ljq2.x = (float)((double)ljq2.x + (3.5 + 2.0 * Math.random()));
            ljq2.rlV = (float)((double)ljq2.rlV + (3.5 + 2.0 * Math.random()));
            break;
        }
        if (ljq2 == null) {
            lfn.b(5, "SFTeleportationChamberManager", "handleInventoryResourceRemoveResponseMessage(): Could not find CityPortalInfo for " + a2.eOO);
            this.eOM.remove(ldv2);
            assert (false);
            return;
        }
        gqt gqt2 = (gqt)this.MessageDelegator.h(11052, this.getGUID(), a2.Ts);
        gqt2.a(hx.a.aeK);
        gqt2.Position = ljq2;
        gqt2.jpO = true;
        this.MessageDelegator.F(gqt2);
        this.eOM.remove(ldv2);
    }

    public void handleSystemMessageSendingErrorMessage(gre gre2) {
        int n = gre2.jqc;
        int n2 = gre2.jqd;
        ldv ldv2 = lcr.abW((int)n2);
        int n3 = -1;
        a a2 = this.eOM.remove(ldv2);
        if (a2 == null) {
            assert (gre2.jqc == 11104);
            n3 = gre2.bWU().ib();
        } else {
            n3 = a2.RB;
        }
        assert (n3 != -1);
        switch (n) {
            case 11052: 
            case 11112: {
                this.c(1, n3, ldv2, -1);
                break;
            }
            case 7981: {
                this.c(1, n3, ldv2, -1);
                this.bdP = false;
                break;
            }
        }
    }

    private void c(int n, int n2, ldv ldv2, int n3) {
        ldv ldv3 = new ldv(n2, lcr.qDC.enw(), lcr.qDC.enx());
        gua gua2 = (gua)this.MessageDelegator.h(24583, this.getGUID(), ldv3);
        gua2.ew = n;
        gua2.jrO = n3;
        this.MessageDelegator.F(gua2);
        this.eOM.remove(ldv2);
    }
}

