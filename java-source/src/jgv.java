/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  hvy
 *  hyn
 *  hzo
 */
import java.util.Map;
import spenefett.hid.gui.serialization.dto.SFSocialPlayerDTO;
import spenefett.hid.gui.serialization.dto.SFSocialPlayerListDTO;
import spenefett.hid.gui.serialization.dto.SFSocialStringsDTO;

public class jgv
extends hzk
implements hvx,
hwf,
hyy.c {
    private boolean nbx = false;
    private jgs nby = null;
    private jas nbz = null;
    private jar nbA = null;
    private jaq nbB = null;
    private jgr lxx = null;
    private jgt nbC = null;

    public jgv(jgr jgr2) {
        super("SocialWindow", "Social.swf");
        this.OQ(jnz.nGi);
        this.a(hya.lmu, true);
        this.a(hyb.lmC);
        assert (jgr2 != null);
        this.lxx = jgr2;
    }

    public void initialize() {
        super.initialize();
        hyy hyy2 = jgv.cyJ().cHx();
        hvy hvy2 = hso.cxK().cxP().cyZ();
        if (hyy2 != null) {
            hyy2.a(hyy.a.lrM, this);
        }
        if (hvy2 != null) {
            hvy2.a((hwf)this);
            hvy2.a((hvx)this);
        }
        if (ls.isEnabled()) {
            this.nby = new jgs();
            this.nbB = new jaq(new hyq(this, hyy2){
                final /* synthetic */ hyy nbD;
                final /* synthetic */ jgv nbE;
                {
                    this.nbE = jgv2;
                    this.nbD = hyy2;
                }

                public void s(hyn hyn2) {
                    jgv.a(this.nbE).setVisible(false);
                    if (this.nbD != null) {
                        this.nbD.a(hyy.b.lvd, 0);
                    }
                }
            }, this.nby);
            this.nbB.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a((amf)((Object)this.nbB));
            this.nbB.ql(false);
            this.nbB.setVisible(false);
        } else if (hyy2 != null) {
            hyy2.a(hyy.b.lvd, false);
        }
    }

    public void cleanUp() {
        hvy hvy2 = hso.cxK().cxP().cyZ();
        hyy hyy2 = jgv.cyJ().cHx();
        if (hvy2 != null) {
            hvy2.b((hwf)this);
            hvy2.b((hvx)this);
        }
        if (hyy2 != null) {
            hyy2.b(hyy.a.lrM);
        }
        super.cleanUp();
    }

    public void cBa() {
        super.cBa();
        jgv.cyJ().cHx().a(hyy.b.luZ, 1);
        this.a(jgt.nbd);
        this.dFb();
        this.resetMessage();
    }

    protected void cEc() {
        if (this.cEU()) {
            this.ts(false);
        } else {
            hyy hyy2 = jgv.cyJ().cHx();
            if (hyy2 != null) {
                hyy2.a(hyy.b.lvd, 0);
            }
        }
    }

    protected void b(jnz jnz2, jnz jnz3) {
        if (this.cEU()) {
            this.ts(false);
        }
    }

    protected void cEj() {
        this.a("setSearchInputFocus", new Object[]{false});
    }

    public hyn s(int n, int n2, String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = string.split(";");
        if (stringArray.length < 7 || stringArray[0] == null || stringArray[0].isEmpty()) {
            return null;
        }
        jgu jgu2 = jgu.getValueFromId(stringArray[0]);
        if (jgu2 == null) {
            return null;
        }
        lfs<String, String> lfs2 = jgu.expandStrings(jgu2);
        float f = Float.valueOf(stringArray[5]).floatValue();
        float f2 = Float.valueOf(stringArray[6]).floatValue();
        String string2 = "<font size='12'>" + ((String)lfs2.reX).toUpperCase() + "</font>";
        String string3 = lfs2.reY == null ? null : "<font size='12'>" + (String)lfs2.reY + "</font>";
        iae iae2 = new iae(iae.a(string2, string3, 0, 0, 0, 0, new String[0]), n - (int)f, n2 - (int)(f2 += (float)n2 >= jgv.cxO().cHk().H / 2.0f ? -55.0f : 55.0f));
        return iae2;
    }

    protected void cEk() {
        this.dFa();
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 31489: {
                this.a((gkr)dxq2);
                break;
            }
            case 31490: {
                this.b((gks)dxq2);
                break;
            }
            case 31492: {
                assert (false);
                break;
            }
            case 31494: {
                this.f((gky)dxq2);
                break;
            }
            case 34313: {
                this.b((frc)dxq2);
                break;
            }
            case 34314: {
                this.a((fqu)dxq2);
                break;
            }
            case 34320: {
                this.a((fra)dxq2);
                break;
            }
            case 34321: {
                this.a((frb)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void b(hyy.b b2, int n) {
        hzo hzo2 = (hzo)jgv.cxO();
        switch (b2) {
            case luX: {
                this.setVisible(false);
                hzo2.cHw().duC();
                break;
            }
            case luZ: {
                if (n == 1) {
                    this.a(jgt.nbd);
                }
                if (this.nbB == null || !this.nbB.isVisible()) break;
                this.nbB.setVisible(false);
                break;
            }
            case lva: {
                if (n == 1) {
                    this.a(jgt.nbf);
                }
                if (this.nbB == null || !this.nbB.isVisible()) break;
                this.nbB.setVisible(false);
                break;
            }
            case lvb: {
                if (n == 1) {
                    this.a(jgt.nbe);
                }
                if (this.nbB == null || !this.nbB.isVisible()) break;
                this.nbB.setVisible(false);
                break;
            }
            case lve: {
                this.to(n == 1);
                break;
            }
            case lvf: {
                this.tp(n == 1);
                break;
            }
            case lvd: {
                assert (ls.isEnabled());
                if (this.nbB == null) break;
                this.nbB.setVisible(n == 1);
                break;
            }
        }
    }

    @Override
    public boolean cGG() {
        return true;
    }

    @Override
    public boolean cGH() {
        return true;
    }

    private void a(gkr gkr2) {
        SFSocialPlayerDTO sFSocialPlayerDTO = jgr.d(gkr2);
        sFSocialPlayerDTO.removeToggleOn = this.lxx.dET();
        sFSocialPlayerDTO.blockToggleOn = this.lxx.dEU();
        sFSocialPlayerDTO.summonAvailable = this.lxx.dEV();
        switch (gkr2.bFP()) {
            case 16: {
                this.c(this.lxx.dEQ(), sFSocialPlayerDTO, "removeSentRequests");
                this.c(this.lxx.dER(), sFSocialPlayerDTO, "removeReceivedRequests");
                this.c(this.lxx.dEM(), sFSocialPlayerDTO, "removeFriends");
                this.c(this.lxx.dEO(), sFSocialPlayerDTO, "removeBlocked", this.lxx.dES());
                break;
            }
            case 0: {
                this.b(this.lxx.dEM(), sFSocialPlayerDTO, "updateFriends");
                hso.cxK().cxP().v(mab.tZO.bD(sFSocialPlayerDTO.firstName + " " + sFSocialPlayerDTO.lastName));
                break;
            }
            case 1: {
                this.b(this.lxx.dEM(), sFSocialPlayerDTO, "updateFriends");
                hso.cxK().cxP().v(mab.tZP.bD(sFSocialPlayerDTO.firstName + " " + sFSocialPlayerDTO.lastName));
                break;
            }
            case 2: {
                this.a(this.lxx.dEQ(), sFSocialPlayerDTO, "insertSentRequests");
                break;
            }
            case 3: {
                this.c(this.lxx.dEQ(), sFSocialPlayerDTO, "removeSentRequests");
                break;
            }
            case 4: {
                this.c(this.lxx.dER(), sFSocialPlayerDTO, "removeReceivedRequests");
                break;
            }
            case 5: {
                this.c(this.lxx.dER(), sFSocialPlayerDTO, "removeReceivedRequests");
                this.a(this.lxx.dEM(), sFSocialPlayerDTO, "insertFriends");
                break;
            }
            case 6: {
                this.c(this.lxx.dEQ(), sFSocialPlayerDTO, "removeSentRequests");
                this.c(this.lxx.dER(), sFSocialPlayerDTO, "removeReceivedRequests");
                this.c(this.lxx.dEM(), sFSocialPlayerDTO, "removeFriends");
                this.a(this.lxx.dEO(), sFSocialPlayerDTO, "insertBlocked", this.lxx.dES());
                break;
            }
            case 7: {
                this.c(this.lxx.dEO(), sFSocialPlayerDTO, "removeBlocked", this.lxx.dES());
                break;
            }
            case 8: {
                this.c(this.lxx.dEM(), sFSocialPlayerDTO, "removeFriends");
                break;
            }
            case 9: {
                if (!this.cEU()) {
                    this.ts(true);
                }
                if (this.nbC != jgt.nbf) {
                    this.d(hyy.b.lva, true);
                }
                this.a(this.lxx.dER(), sFSocialPlayerDTO, "insertReceivedRequests");
                break;
            }
            case 10: {
                this.c(this.lxx.dER(), sFSocialPlayerDTO, "removeReceivedRequests");
                break;
            }
            case 11: {
                this.c(this.lxx.dEQ(), sFSocialPlayerDTO, "removeSentRequests");
                break;
            }
            case 12: {
                this.c(this.lxx.dEQ(), sFSocialPlayerDTO, "removeSentRequests");
                this.a(this.lxx.dEM(), sFSocialPlayerDTO, "insertFriends");
                break;
            }
            case 13: {
                this.c(this.lxx.dEQ(), sFSocialPlayerDTO, "removeSentRequests");
                this.c(this.lxx.dER(), sFSocialPlayerDTO, "removeReceivedRequests");
                this.c(this.lxx.dEM(), sFSocialPlayerDTO, "removeFriends");
                break;
            }
            case 14: {
                break;
            }
            case 15: {
                this.c(this.lxx.dEM(), sFSocialPlayerDTO, "removeFriends");
                break;
            }
            case 18: {
                this.b(this.lxx.dEM(), sFSocialPlayerDTO, "updateFriends");
                break;
            }
            case 19: {
                this.b(this.lxx.dEQ(), sFSocialPlayerDTO, "updateSentRequests");
                break;
            }
            case 20: {
                this.b(this.lxx.dER(), sFSocialPlayerDTO, "updateReceivedRequests");
                break;
            }
            case 21: {
                this.b(this.lxx.dEO(), sFSocialPlayerDTO, "updateBlocked");
                break;
            }
            case 22: {
                if (this.nby != null) {
                    this.nby.a(gkr2.qd(), gkr2.iU(), gkr2.pN(), gkr2.qf());
                }
                if (this.nbA != null) {
                    this.nbA.C(gkr2.iU(), gkr2.qf());
                }
                if (this.nbB != null) {
                    this.nbB.updateWindow();
                }
                jgv.cxP().w(mch.uut.bD(new Object[0]));
                break;
            }
            case 25: {
                if (this.nby != null) {
                    this.nby.a(gkr2.qd(), gkr2.iU(), gkr2.pN(), gkr2.qf());
                }
                if (this.nbB != null) {
                    this.nbB.updateWindow();
                }
                jgv.cxP().w(mch.uuK.bD(gkr2.iU()));
                break;
            }
            case 23: {
                if (this.nby != null) {
                    this.nby.jK(gkr2.qd());
                }
                if (this.nbB != null) {
                    this.nbB.updateWindow();
                }
                jgv.cxP().w(mch.uup.bD(new Object[0]));
                break;
            }
            case 26: {
                if (this.nby != null) {
                    this.nby.jK(gkr2.qd());
                }
                if (this.nbB != null) {
                    this.nbB.updateWindow();
                }
                jgv.cxP().w(mch.uuN.bD(new Object[0]));
                break;
            }
            case 24: {
                if (this.nby != null) {
                    this.nby.b(gkr2.qd(), gkr2.iU(), gkr2.pN(), gkr2.qf());
                }
                if (this.nbB != null) {
                    this.nbB.updateWindow();
                }
                if (this.nbA != null) {
                    this.nbA.C(gkr2.iU(), gkr2.qf());
                }
                jgv.cxP().w(gkr2.qf() ? mch.uuv.bD(new Object[0]) : mch.uuw.bD(new Object[0]));
                break;
            }
            case 27: {
                if (this.nby != null) {
                    this.nby.b(gkr2.qd(), gkr2.iU(), gkr2.pN(), gkr2.qf());
                }
                if (this.nbB != null) {
                    this.nbB.updateWindow();
                }
                jgv.cxP().w(gkr2.qf() ? mch.uuG.bD(gkr2.iU()) : mch.uuH.bD(gkr2.iU()));
                break;
            }
            case 30: {
                if (this.nby != null) {
                    this.nby.b(gkr2.qd(), gkr2.iU(), gkr2.pN(), gkr2.qf());
                }
                if (this.nbB == null) break;
                this.nbB.updateWindow();
                break;
            }
            case 28: {
                if (this.nby != null) {
                    this.nby.b(gkr2.qd(), gkr2.iU(), gkr2.pN(), gkr2.qf());
                }
                if (this.nbB == null) break;
                this.nbB.updateWindow();
                break;
            }
            case 29: {
                if (this.nby != null) {
                    this.nby.b(gkr2.qd(), gkr2.iU(), gkr2.pN(), gkr2.qf());
                }
                if (this.nbB == null) break;
                this.nbB.updateWindow();
                break;
            }
            case 31: {
                if (this.nby != null) {
                    this.nby.jK(gkr2.qd());
                    if (this.nbB != null) {
                        this.nbB.updateWindow();
                    }
                    if (this.nby.bRA()) {
                        jgv.cxP().w(mch.uux.bD(gkr2.iU()));
                        this.sk(gkr2.iU());
                        return;
                    }
                }
                jgv.cxP().w(mch.uuI.bD(gkr2.iU()));
                break;
            }
            case 32: {
                if (this.nby == null || !this.nby.bRA()) break;
                jgv.cxP().w(mch.uuy.bD(gkr2.iU()));
                break;
            }
        }
    }

    private void b(gks gks2) {
        switch (gks2.bVI()) {
            case 0: {
                this.lxx.a(this.lxx.dEM(), jgr.a(gks2, this.lxx), this.lxx, gks2.bVI());
                if (!this.cDj()) break;
                this.a(this.lxx.dEM(), "insertFriends");
                break;
            }
            case 1: {
                this.lxx.a(this.lxx.dEQ(), jgr.a(gks2, this.lxx), this.lxx, gks2.bVI());
                if (!this.cDj()) break;
                this.a(this.lxx.dEQ(), "insertSentRequests");
                break;
            }
            case 2: {
                this.lxx.a(this.lxx.dER(), jgr.a(gks2, this.lxx), this.lxx, gks2.bVI());
                if (this.lxx.dER().list.size() > 0) {
                    if (!this.cEU()) {
                        this.ts(true);
                    }
                    if (this.nbC != jgt.nbf) {
                        this.d(hyy.b.lva, true);
                    }
                }
                if (!this.cDj()) break;
                this.a(this.lxx.dER(), "insertReceivedRequests");
                break;
            }
            case 3: {
                this.lxx.a(this.lxx.dEO(), jgr.a(gks2, this.lxx), this.lxx, gks2.bVI());
                if (!this.cDj()) break;
                this.a(this.lxx.dEO(), "insertBlocked");
                break;
            }
            case 5: {
                if (this.nby != null) {
                    this.nby.a(gks2.bFJ(), gks2.bFK(), gks2.bRz(), gks2.bFL());
                }
                if (this.nbB == null) break;
                this.nbB.updateWindow();
                break;
            }
            case 4: {
                if (this.nby != null) {
                    this.nby.a(gks2.bFJ(), gks2.bFK(), gks2.bRz(), gks2.bFL());
                }
                if (this.nbB == null) break;
                this.nbB.updateWindow();
                break;
            }
            default: {
                assert (false) : "List Type : " + gks2.bVI();
                break;
            }
        }
    }

    private void a(SFSocialPlayerListDTO sFSocialPlayerListDTO, String string) {
        if (!sFSocialPlayerListDTO.list.isEmpty()) {
            int n = sFSocialPlayerListDTO.list.size() / 30 + (sFSocialPlayerListDTO.list.size() % 30 != 0 ? 1 : 0);
            for (int i = 0; i < n; ++i) {
                int n2 = i * 30;
                int n3 = (i + 1) * 30 < sFSocialPlayerListDTO.list.size() ? (i + 1) * 30 : sFSocialPlayerListDTO.list.size();
                SFSocialPlayerListDTO sFSocialPlayerListDTO2 = new SFSocialPlayerListDTO();
                sFSocialPlayerListDTO2.list.addAll(sFSocialPlayerListDTO.list.subList(n2, n3));
                jgr.sort(sFSocialPlayerListDTO2.list);
                this.a(string, new Object[]{n2, sFSocialPlayerListDTO2});
            }
        }
    }

    private void f(gky gky2) {
        if (gky2.isc == null || gky2.isc.length == 0) {
            this.setMessage(lye.tDp.bD(new Object[0]).exA());
        } else {
            this.setMessage(null);
        }
        if (this.nbC == jgt.nbd) {
            this.lxx.b(gky2);
            this.a("replaceFriendsSearch", new Object[]{this.lxx.dEN()});
        } else if (this.nbC == jgt.nbe) {
            this.lxx.d(gky2);
            this.a("replaceBlockedSearch", new Object[]{this.lxx.dEP()});
        }
        this.setConfirmButtonEnabled();
    }

    private void sj(String string) {
        gkx gkx2 = (gkx)this.MessageDelegator.h(31493, this.GUID, hso.cxK().bAn().Tr);
        gkx2.jkM = string;
        this.MessageDelegator.F(gkx2);
    }

    private void a(ldv ldv2, String string, int n) {
        if (ldv2 == null || string == null || string.isEmpty()) {
            return;
        }
        if (n == 0 ? this.lxx.rL(ldv2) || this.lxx.rN(ldv2) || this.lxx.rM(ldv2) || this.lxx.rO(ldv2) : n == 5 && this.lxx.rN(ldv2)) {
            return;
        }
        gkt gkt2 = (gkt)this.MessageDelegator.h(31491, this.GUID, hso.cxK().bAn().Tr);
        gkt2.YN = ldv2;
        gkt2.YL = string;
        gkt2.ed = n;
        this.MessageDelegator.F(gkt2);
    }

    private void a(SFSocialPlayerDTO sFSocialPlayerDTO, int n) {
        if (sFSocialPlayerDTO == null) {
            return;
        }
        this.a(new ldv(Long.valueOf(sFSocialPlayerDTO.GUID)), sFSocialPlayerDTO.firstName + " " + sFSocialPlayerDTO.lastName, n);
    }

    private void a(SFSocialPlayerListDTO sFSocialPlayerListDTO, int n, boolean bl) {
        if (sFSocialPlayerListDTO == null || sFSocialPlayerListDTO.list == null) {
            return;
        }
        SFSocialPlayerDTO sFSocialPlayerDTO = null;
        for (int i = 0; i < sFSocialPlayerListDTO.list.size(); ++i) {
            sFSocialPlayerDTO = sFSocialPlayerListDTO.list.get(i);
            if (bl) {
                if (sFSocialPlayerDTO == null || !sFSocialPlayerDTO.selected) continue;
                this.a(sFSocialPlayerDTO, n);
                continue;
            }
            this.a(sFSocialPlayerDTO, n);
        }
    }

    private void a(jgt jgt2) {
        if (jgt2 != null && jgt2 != this.nbC) {
            this.nbC = jgt2;
            if (this.nbC == jgt.nbf) {
                this.d(hyy.b.lva, false);
            }
            this.a("setPanelVisible", new Object[]{this.nbC.cck});
        }
    }

    private void to(boolean bl) {
        this.lxx.to(bl);
        this.dFc();
    }

    private void tp(boolean bl) {
        this.lxx.tp(bl);
        this.dFc();
    }

    private void tq(boolean bl) {
        this.lxx.tq(bl);
        this.a("updateFriends", new Object[]{this.lxx.dEM()});
    }

    private void a(SFSocialPlayerListDTO sFSocialPlayerListDTO, SFSocialPlayerDTO sFSocialPlayerDTO, String string) {
        this.a(sFSocialPlayerListDTO, sFSocialPlayerDTO, string, null);
    }

    private void a(SFSocialPlayerListDTO sFSocialPlayerListDTO, SFSocialPlayerDTO sFSocialPlayerDTO, String string, Map<String, SFSocialPlayerDTO> map) {
        if (sFSocialPlayerListDTO == null || sFSocialPlayerDTO == null || string == null || string.isEmpty()) {
            return;
        }
        SFSocialPlayerListDTO sFSocialPlayerListDTO2 = new SFSocialPlayerListDTO();
        sFSocialPlayerListDTO2.list.add(sFSocialPlayerDTO);
        sFSocialPlayerListDTO.list.add(sFSocialPlayerDTO);
        if (map != null) {
            map.put(jgr.b(sFSocialPlayerDTO), sFSocialPlayerDTO);
        }
        this.a(string, new Object[]{sFSocialPlayerListDTO.list.size() - 1, sFSocialPlayerListDTO2});
    }

    private void b(SFSocialPlayerListDTO sFSocialPlayerListDTO, SFSocialPlayerDTO sFSocialPlayerDTO, String string) {
        this.b(sFSocialPlayerListDTO, sFSocialPlayerDTO, string, null);
    }

    private void b(SFSocialPlayerListDTO sFSocialPlayerListDTO, SFSocialPlayerDTO sFSocialPlayerDTO, String string, Map<String, SFSocialPlayerDTO> map) {
        if (sFSocialPlayerListDTO == null || sFSocialPlayerDTO == null || string == null || string.isEmpty()) {
            return;
        }
        SFSocialPlayerDTO sFSocialPlayerDTO2 = this.c(sFSocialPlayerListDTO, sFSocialPlayerDTO.GUID);
        if (sFSocialPlayerDTO2 != null) {
            SFSocialPlayerListDTO sFSocialPlayerListDTO2 = new SFSocialPlayerListDTO();
            sFSocialPlayerListDTO2.list.add(sFSocialPlayerDTO);
            sFSocialPlayerListDTO.list.set(sFSocialPlayerListDTO.list.indexOf(sFSocialPlayerDTO2), sFSocialPlayerDTO);
            if (map != null) {
                map.put(jgr.b(sFSocialPlayerDTO), sFSocialPlayerDTO);
            }
            this.a(string, new Object[]{sFSocialPlayerListDTO2});
        }
    }

    private void c(SFSocialPlayerListDTO sFSocialPlayerListDTO, SFSocialPlayerDTO sFSocialPlayerDTO, String string) {
        this.c(sFSocialPlayerListDTO, sFSocialPlayerDTO, string, null);
    }

    private void c(SFSocialPlayerListDTO sFSocialPlayerListDTO, SFSocialPlayerDTO sFSocialPlayerDTO, String string, Map<String, SFSocialPlayerDTO> map) {
        if (sFSocialPlayerListDTO == null || sFSocialPlayerDTO == null || string == null || string.isEmpty()) {
            return;
        }
        sFSocialPlayerDTO = this.c(sFSocialPlayerListDTO, sFSocialPlayerDTO.GUID);
        if (sFSocialPlayerDTO != null) {
            int n = sFSocialPlayerListDTO.list.indexOf(sFSocialPlayerDTO);
            sFSocialPlayerListDTO.list.remove(n);
            if (map != null) {
                map.remove(jgr.b(sFSocialPlayerDTO));
            }
            this.a(string, new Object[]{n, 1});
        }
    }

    private void b(SFSocialPlayerListDTO sFSocialPlayerListDTO, String string) {
        if (sFSocialPlayerListDTO == null || string == null || string.isEmpty()) {
            return;
        }
        this.a(string, new Object[]{0, sFSocialPlayerListDTO.list.size()});
        sFSocialPlayerListDTO.list.clear();
    }

    private SFSocialPlayerDTO c(SFSocialPlayerListDTO sFSocialPlayerListDTO, String string) {
        if (sFSocialPlayerListDTO == null || string == null || string.isEmpty()) {
            return null;
        }
        for (int i = 0; i < sFSocialPlayerListDTO.list.size(); ++i) {
            SFSocialPlayerDTO sFSocialPlayerDTO = sFSocialPlayerListDTO.list.get(i);
            if (sFSocialPlayerDTO == null || !string.equals(sFSocialPlayerDTO.GUID)) continue;
            return sFSocialPlayerDTO;
        }
        return null;
    }

    private void dFa() {
        SFSocialStringsDTO sFSocialStringsDTO = new SFSocialStringsDTO();
        sFSocialStringsDTO.friendsTitle = lyd.tDc.bD(new Object[0]).exA();
        sFSocialStringsDTO.blockedTitle = lyd.tDd.bD(new Object[0]).exA();
        sFSocialStringsDTO.requestsTitle = lyd.tDe.bD(new Object[0]).exA();
        sFSocialStringsDTO.sentRequestsTitle = lyd.tDg.bD(new Object[0]).exA();
        sFSocialStringsDTO.receivedRequestsTitle = lyd.tDh.bD(new Object[0]).exA();
        sFSocialStringsDTO.playerListHeader = lyd.tDf.bD(new Object[0]).exA();
        sFSocialStringsDTO.addButtonLabel = lye.tDj.bD(new Object[0]).exA();
        sFSocialStringsDTO.searchPrompt = lye.tDk.bD(new Object[0]).exA();
        sFSocialStringsDTO.sendRequestButtonLabel = lye.tDl.bD(new Object[0]).exA();
        sFSocialStringsDTO.blockPlayerButtonLabel = lye.tDm.bD(new Object[0]).exA();
        this.a("setStrings", new Object[]{sFSocialStringsDTO});
    }

    private void dFb() {
        this.a(this.lxx.dEM(), "insertFriends");
        this.a(this.lxx.dEN(), "insertFriendsSearch");
        this.a(this.lxx.dEO(), "insertBlocked");
        this.a(this.lxx.dEP(), "insertBlockedSearch");
        this.a(this.lxx.dEQ(), "insertSentRequests");
        this.a(this.lxx.dER(), "insertReceivedRequests");
    }

    private void dFc() {
        this.a("updateFriends", new Object[]{this.lxx.dEM()});
        this.a("updateFriendsSearch", new Object[]{this.lxx.dEN()});
        this.a("updateBlocked", new Object[]{this.lxx.dEO()});
        this.a("updateBlockedSearch", new Object[]{this.lxx.dEP()});
        this.a("updateSentRequests", new Object[]{this.lxx.dEQ()});
        this.a("updateReceivedRequests", new Object[]{this.lxx.dER()});
    }

    private void tr(boolean bl) {
        this.a("setConfirmButtonEnabled", new Object[]{bl});
    }

    private void setMessage(String string) {
        this.a("setMessage", new Object[]{string});
    }

    private void ts(boolean bl) {
        jah jah2;
        hzo hzo2 = jgv.cyJ();
        if (hzo2 != null && (jah2 = hzo2.cHw()) != null) {
            jah2.d(hyc.lmS, bl);
        }
    }

    private void d(hyy.b b2, boolean bl) {
        hyy hyy2;
        hzo hzo2 = jgv.cyJ();
        if (hzo2 != null && (hyy2 = hzo2.cHx()) != null) {
            hyy2.c(b2, bl);
        }
    }

    private SFSocialPlayerListDTO d(SFSocialPlayerListDTO sFSocialPlayerListDTO, String string) {
        if (sFSocialPlayerListDTO == null) {
            return null;
        }
        if (string == null || string.isEmpty()) {
            return sFSocialPlayerListDTO;
        }
        SFSocialPlayerListDTO sFSocialPlayerListDTO2 = new SFSocialPlayerListDTO();
        SFSocialPlayerDTO sFSocialPlayerDTO = null;
        String string2 = null;
        for (int i = 0; i < sFSocialPlayerListDTO.list.size(); ++i) {
            sFSocialPlayerDTO = sFSocialPlayerListDTO.list.get(i);
            if (sFSocialPlayerDTO == null || (string2 = sFSocialPlayerDTO.firstName + " " + sFSocialPlayerDTO.lastName).indexOf(string) == -1) continue;
            sFSocialPlayerListDTO2.list.add(sFSocialPlayerDTO);
        }
        return sFSocialPlayerListDTO2;
    }

    @llk
    private void setPlayerSelected(String string, boolean bl) {
        if (this.nbC == jgt.nbd) {
            this.lxx.F(string, bl);
        } else if (this.nbC == jgt.nbe) {
            this.lxx.G(string, bl);
        }
        this.setConfirmButtonEnabled();
    }

    @llk
    private void submitSearch(String string, boolean bl) {
        if (this.nbC != jgt.nbd && this.nbC != jgt.nbe) {
            return;
        }
        if (bl) {
            if (this.nbC == jgt.nbd) {
                this.a("replaceFriends", new Object[]{this.d(this.lxx.dEM(), string)});
            } else if (this.nbC == jgt.nbe) {
                this.a("replaceBlocked", new Object[]{this.d(this.lxx.dEO(), string)});
            }
        } else {
            this.setMessage(lye.tDo.bD(new Object[0]).exA());
            this.sj(string);
        }
    }

    @llk
    private void confirmSelection() {
        if (this.nbC == jgt.nbd) {
            this.a(this.lxx.dEN(), 0, true);
            this.b(this.lxx.dEN(), "removeFriendsSearch");
        } else if (this.nbC == jgt.nbe) {
            this.a(this.lxx.dEP(), 5, true);
            this.b(this.lxx.dEP(), "removeBlockedSearch");
        }
    }

    @llk
    private void acceptFriendRequest(String string) {
        this.a(this.c(this.lxx.dER(), string), 2);
    }

    @llk
    private void cancelFriendRequest(String string) {
        this.a(this.c(this.lxx.dEQ(), string), 1);
    }

    @llk
    private void rejectFriendRequest(String string) {
        this.a(this.c(this.lxx.dER(), string), 3);
    }

    @llk
    private void removeFriend(String string) {
        this.a(this.c(this.lxx.dEM(), string), 4);
    }

    @llk
    private void removeBlocked(String string) {
        this.a(this.c(this.lxx.dEO(), string), 6);
    }

    @llk
    private void blockPlayer(String string) {
        SFSocialPlayerDTO sFSocialPlayerDTO = null;
        switch (this.nbC) {
            case nbd: {
                sFSocialPlayerDTO = this.c(this.lxx.dEM(), string);
                if (sFSocialPlayerDTO != null) break;
                sFSocialPlayerDTO = this.c(this.lxx.dEN(), string);
                break;
            }
            case nbe: {
                sFSocialPlayerDTO = this.c(this.lxx.dEP(), string);
                break;
            }
            case nbf: {
                sFSocialPlayerDTO = this.c(this.lxx.dER(), string);
                break;
            }
        }
        if (sFSocialPlayerDTO != null) {
            this.a(sFSocialPlayerDTO, 5);
        }
    }

    @llk
    private void summonPlayer(String string) {
        SFSocialPlayerDTO sFSocialPlayerDTO = this.c(this.lxx.dEM(), string);
        if (sFSocialPlayerDTO == null) {
            return;
        }
        if (hso.cxK().bAn() == null) {
            return;
        }
        gjt gjt2 = (gjt)this.MessageDelegator.h(4617, this.getGUID(), hso.cxK().bAn().gYY);
        gjt2.SkillType = cxd.fHi;
        gjt2.YL = sFSocialPlayerDTO.firstName + " " + sFSocialPlayerDTO.lastName;
        this.MessageDelegator.F(gjt2);
    }

    @llk
    public void whisperPlayer(String string) {
        SFSocialPlayerDTO sFSocialPlayerDTO = null;
        switch (this.nbC) {
            case nbd: {
                sFSocialPlayerDTO = this.c(this.lxx.dEM(), string);
                if (sFSocialPlayerDTO != null) break;
                sFSocialPlayerDTO = this.c(this.lxx.dEN(), string);
                break;
            }
            case nbe: {
                sFSocialPlayerDTO = this.c(this.lxx.dEO(), string);
                if (sFSocialPlayerDTO != null) break;
                sFSocialPlayerDTO = this.c(this.lxx.dEP(), string);
                break;
            }
            case nbf: {
                sFSocialPlayerDTO = this.c(this.lxx.dEQ(), string);
                if (sFSocialPlayerDTO != null) break;
                sFSocialPlayerDTO = this.c(this.lxx.dER(), string);
                break;
            }
        }
        if (sFSocialPlayerDTO == null) {
            return;
        }
        jgv.cyJ().oh(sFSocialPlayerDTO.firstName + " " + sFSocialPlayerDTO.lastName);
    }

    @llk
    private void setConfirmButtonEnabled() {
        if (this.nbC == jgt.nbd) {
            this.tr(jgr.h(this.lxx.dEN()) > 0);
        } else if (this.nbC == jgt.nbe) {
            this.tr(jgr.h(this.lxx.dEP()) > 0);
        }
    }

    @llk
    private void resetMessage() {
        this.setMessage(lye.tDn.bD(new Object[0]).exA());
    }

    @Override
    public void a(cxc cxc2, float f, double d2) {
        hvy hvy2 = hso.cxK().cxP().cyZ();
        if (hvy2 != null) {
            cxc cxc3 = hvy2.ht(cxd.fHi);
            if (cxc3 != null && cxc2 != null && cxc3.equals(cxc2)) {
                Boolean bl = f <= 0.0f;
                if (this.lxx.dEV() != bl.booleanValue()) {
                    this.tq(bl);
                }
            }
            if (this.nbB != null && cxc2.zg() == cxd.fHh) {
                this.nbB.a(f, d2);
            }
        }
    }

    @Override
    public void c(cxc cxc2, boolean bl) {
        cxc cxc3;
        hvy hvy2 = hso.cxK().cxP().cyZ();
        if (hvy2 != null && (cxc3 = hvy2.ht(cxd.fHi)) != null && cxc2 != null && cxc3.equals(cxc2) && this.lxx.dEV() != bl) {
            this.tq(bl);
        }
    }

    private void a(frb frb2) {
        this.nbx = frb2.pL();
        this.dFd();
    }

    private void dFd() {
        hyy hyy2 = jgv.cyJ().cHx();
        if (hyy2 != null && jgv.cxP().cyZ() != null) {
            boolean bl = jgv.cxP().cyZ().abF() < ls.pz();
            boolean bl2 = jgv.cxP().cyZ().abF() >= ls.py();
            boolean bl3 = this.nbx;
            hyy2.b(hyy.b.lvd, !bl && bl2 || bl3);
        }
    }

    private void a(fra fra2) {
        if (!ls.isEnabled() || !this.nbx) {
            assert (false) : "Enabled : " + ls.isEnabled() + " SystemOpenForApprentices : " + this.nbx;
            return;
        }
        assert (this.nbA == null);
        this.nbA = new jar(new hyq(this){
            final /* synthetic */ jgv nbE;
            {
                this.nbE = jgv2;
            }

            public void s(hyn hyn2) {
                jgv.a(this.nbE, null);
            }
        });
        this.nbA.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)((Object)this.nbA));
        this.nbA.setVisible(true);
    }

    private void b(frc frc2) {
        assert (ls.isEnabled());
        if (this.nby != null) {
            this.nby.a(frc2);
        }
        if (this.nbB != null) {
            this.nbB.dvJ();
        }
        if (this.nbz != null && !this.nby.dEZ()) {
            this.nbz.close();
            this.nbz = null;
        }
    }

    private void a(fqu fqu2) {
        this.sk(fqu2.bRu());
    }

    private void sk(String string) {
        assert (this.nbz == null);
        this.nbz = new jas(string, new hyq(this){
            final /* synthetic */ jgv nbE;
            {
                this.nbE = jgv2;
            }

            public void s(hyn hyn2) {
                int n = jgv.b(this.nbE).bRq();
                String string = jgv.b(this.nbE).dvR();
                fqk fqk2 = (fqk)jgv.c(this.nbE).h(34319, this.nbE.getGUID(), hso.cxK().bAn().Tr);
                fqk2.jf(n);
                fqk2.kJ(string);
                jgv.d(this.nbE).E(fqk2);
            }
        });
        this.nbz.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)((Object)this.nbz));
        this.nbz.setVisible(true);
    }

    @Override
    public void q(ej ej2) {
        if (ej2 == null || ej2.getType() != 12048) {
            return;
        }
        if (this.nbB != null) {
            this.nbB.kO(((et)ej2).fN());
        }
        this.dFd();
    }

    public boolean si(String string) {
        return this.nby == null ? false : this.nby.si(string);
    }

    @Override
    public void a(bsh bsh2, cxc cxc2) {
    }

    @Override
    public void czV() {
    }

    @Override
    public void cf(cxc cxc2) {
    }

    @Override
    public void ck(cxc cxc2) {
    }

    @Override
    public void cl(cxc cxc2) {
    }

    @Override
    public void i(cxc cxc2, int n) {
    }

    public hyn dFe() {
        return this.nbA;
    }

    static /* synthetic */ jaq a(jgv jgv2) {
        return jgv2.nbB;
    }

    static /* synthetic */ jar a(jgv jgv2, jar jar2) {
        jgv2.nbA = jar2;
        return jgv2.nbA;
    }

    static /* synthetic */ jas b(jgv jgv2) {
        return jgv2.nbz;
    }

    static /* synthetic */ dxr c(jgv jgv2) {
        return jgv2.MessageDelegator;
    }

    static /* synthetic */ dxr d(jgv jgv2) {
        return jgv2.MessageDelegator;
    }
}

