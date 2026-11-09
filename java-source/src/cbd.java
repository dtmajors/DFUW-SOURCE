/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.awt.Color;
import java.util.List;
import java.util.Map;

public class cbd
extends cbc
implements bto {
    private Map<Integer, cbh> eit = lcn.emw();
    private int dj = 0;
    private ldv aXZ = null;
    private boolean eiu = false;
    private boolean eiv = false;
    private boolean dOL = true;
    public boolean eiw = false;
    private List<cbi> bhn = lcn.emv();
    dqe eix = new dqe(this);
    private boolean eiy;
    private fxy eiz = null;

    @Override
    public final void cleanUp() {
        assert (lcr.mOy != null);
        super.cleanUp();
        if (!this.dOL) {
            return;
        }
        this.eix.cleanUp();
        for (cbh object2 : this.eit.values()) {
            if (object2.eiJ.eip == null) continue;
            this.a(object2.eiJ);
        }
        fwy fwy2 = (fwy)this.MessageDelegator.h(17943, this.GUID, lcr.acL);
        this.MessageDelegator.F(fwy2);
        fwn fwn2 = (fwn)this.MessageDelegator.h(17950, this.GUID, lcr.qCi);
        fwn2.ila = false;
        fwn2.iZm = true;
        fwn2.afF = null;
        this.MessageDelegator.F(fwn2);
        lcr.mOy = null;
    }

    @Override
    public final void doTick(ldz ldz2) {
        if (!this.dOL) {
            return;
        }
        if (this.eiv || this.eiu) {
            this.aHl();
            this.eiv = false;
            this.eiu = false;
            this.eiw = false;
        }
        this.eix.bsY();
    }

    @Override
    public final void initialize() {
        assert (lcr.mOy == null);
        super.initialize();
        fxs fxs2 = (fxs)this.MessageDelegator.h(17946, this.GUID, lcr.qzp);
        this.MessageDelegator.F(fxs2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 4866: {
                this.handleLineContainmentResponse((kuj)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    public final void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11009: {
                this.a((gqb)dxq2);
                break;
            }
            case 11033: {
                this.b((gsl)dxq2);
                break;
            }
            case 17945: {
                this.a((fxy)dxq2);
                break;
            }
            case 17947: {
                this.a((fxt)dxq2);
                break;
            }
            case 2574: {
                this.b((ffj)dxq2);
                break;
            }
            case 17952: {
                this.a((fwz)dxq2);
                break;
            }
            case 17953: {
                this.a((fxa)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void b(ffj ffj2) {
        if (this.dOL == ffj2.dOL) {
            lfn.b(5, "SFPartyClient", "handleGuiStateChangedMessage() GuiCreated has not changed.");
            return;
        }
        this.dOL = ffj2.dOL;
        this.eix.iu(this.dOL);
        if (this.dOL) {
            fws fws2 = (fws)this.MessageDelegator.h(17942, this.GUID, lcr.acL);
            fws2.cRI = this.aXZ;
            this.MessageDelegator.F(fws2);
            this.eiu = true;
            this.eiv = true;
            this.eiw = true;
        }
    }

    private void a(fxt fxt2) {
        this.dOL = fxt2.dOL;
        this.eix.iu(this.dOL);
        if (!this.dOL) {
            return;
        }
        fws fws2 = (fws)this.MessageDelegator.h(17942, this.GUID, lcr.acL);
        fws2.cRI = this.aXZ;
        this.MessageDelegator.F(fws2);
    }

    private void a(fxy fxy2) {
        if (this.eiz != null) {
            return;
        }
        if (fxy2.gNT == 0) {
            assert (fxy2.gNU != null) : "Null position while adding waypoint";
            this.eiy = fxy2.gNU.y < -1000.0f;
            ljq ljq2 = new ljq(fxy2.gNU.x, fxy2.gNU.y + (float)(this.eiy ? 1 : 1500), fxy2.gNU.rlV);
            ljq ljq3 = new ljq(0.0f, -1.0f, 0.0f);
            this.eiz = fxy2;
            this.b(ljq2, ljq3, this.eiy ? 3.0f : 1000.0f);
            return;
        }
        this.b(fxy2);
    }

    private void b(fxy fxy2) {
        fxy2.f(this.GUID);
        fxy2.on(lcr.O((int)this.dj, (ldv)this.GUID));
        this.MessageDelegator.F(fxy2);
    }

    private void b(ljq ljq2, ljq ljq3, float f2) {
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.ca(ljq2);
        kji2.cq(ljq3);
        kji2.setLength(f2);
        this.MessageDelegator.a(kji2);
    }

    private void aHl() {
        assert (this.dOL);
        this.bhn.clear();
        for (cbh object : this.eit.values()) {
            if (!object.dQm) {
                if (!object.aHr()) continue;
                object.dQm = true;
            }
            cbi cbi2 = object.aHs();
            this.bhn.add(cbi2);
            if (this.eiu) {
                this.a(object.eiJ, object.afF);
            }
            object.aXX = false;
        }
        if (this.eiv && !this.bhn.isEmpty()) {
            cbi[] cbiArray = this.bhn.toArray(new cbi[this.bhn.size()]);
            fxx fxx2 = (fxx)this.MessageDelegator.h(17944, this.GUID, lcr.acL);
            fxx2.jaP = cbiArray;
            this.MessageDelegator.F(fxx2);
        }
    }

    private void a(int n, ldv ldv2, int n2, int n3, int n4, boolean bl, alu[] aluArray, boolean bl2, boolean bl3, boolean bl4) {
        assert (n > 0);
        assert (ldv2 != null);
        assert (n3 > 0);
        if (this.eit.containsKey(n)) {
            lfn.b(5, "SFPartyClient", "createPartyMember() MemberInfo for member " + n + " already exists.");
            return;
        }
        cbb cbb2 = new cbb();
        cbb2.eip = null;
        cbb2.Position = new ljq(0.0f, 0.0f, 0.0f);
        cbb2.dzN = new lhu(16, 16, "gui/targeticons/take.dds");
        cbb2.eiq = null;
        lgw lgw2 = (lgw)lea.enW().acv(n3);
        lhu lhu2 = new lhu(64, 64, lgw2.enm());
        cbh cbh2 = new cbh();
        cbh2.aYa = n;
        cbh2.afF = lcr.ak((ldv)ldv2, (int)this.GUID.ib());
        cbh2.ResourceType = n3;
        cbh2.dMU = lhu2;
        cbh2.dMT = new lcq(Color.pink);
        cbh2.Qw = n2;
        cbh2.eiJ = cbb2;
        cbh2.dQm = false;
        cbh2.eiH = bl;
        cbh2.eiI = n4;
        cbh2.aXY = aluArray;
        cbh2.aXX = bl2;
        cbh2.RoundRobinExcluded = bl3;
        cbh2.aYe = bl4;
        this.eit.put(cbh2.aYa, cbh2);
        this.eiu = true;
        this.eiv = true;
        fwn fwn2 = (fwn)this.MessageDelegator.h(17950, this.GUID, lcr.qCi);
        fwn2.ila = true;
        fwn2.afF = cbh2.afF;
        this.MessageDelegator.F(fwn2);
    }

    private void a(cbb cbb2) {
        assert (this.dOL);
        assert (cbb2 != null);
        assert (cbb2.eip != null);
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
        ffb2.iKO = ffb.a.iKT;
        ffb2.dbx = cbb2.eip;
        ffb2.ResourceType = cug.flV;
        this.MessageDelegator.F(ffb2);
        this.MessageDelegator.oa(cbb2.eip);
        cbb2.eip = null;
    }

    private void ox(int n) {
        assert (n > 0);
        cbh cbh2 = this.eit.remove(n);
        if (cbh2 == null) {
            lfn.b(5, "SFPartyClient", "removePartyMemberInfo() Could not find memberinfo for member " + n);
            return;
        }
        if (cbh2.dQm && cbh2.eiJ.eip != null && this.dOL) {
            this.a(cbh2.eiJ);
        }
        this.eiu = true;
        this.eiv = true;
        fwn fwn2 = (fwn)this.MessageDelegator.h(17950, this.GUID, lcr.qCi);
        fwn2.ila = false;
        fwn2.afF = cbh2.afF;
        this.MessageDelegator.F(fwn2);
    }

    private void a(cbb cbb2, ldv ldv2) {
        assert (this.dOL);
        assert (cbb2 != null);
        assert (cbb2.eiq != null);
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
        if (cbb2.eip == null) {
            ffb2.iKO = ffb.a.iKR;
            cbb2.eip = this.MessageDelegator.bzv();
        } else {
            ffb2.iKO = this.eiw ? ffb.a.iKR : ffb.a.iKS;
        }
        ffb2.dbx = cbb2.eip;
        ffb2.iKP = cbb2.eiq;
        ffb2.dzN = cbb2.dzN;
        ffb2.ResourceType = cug.flV;
        ffb2.iKQ = cbb2.Position;
        ffb2.eir = cbb2.eir;
        ffb2.eis = cbb2.eis;
        ffb2.Rs = ldv2;
        this.MessageDelegator.F(ffb2);
    }

    private void a(int n, int n2, int n3, boolean bl, alu[] aluArray, boolean bl2, boolean bl3, boolean bl4) {
        Object object;
        assert (n > 0);
        if (bl4) {
            object = this.eit.values().iterator();
            while (object.hasNext()) {
                cbh cbh2 = (cbh)object.next();
                cbh2.aYe = false;
            }
        }
        if ((object = this.eit.get(n)) == null) {
            lfn.b(5, "SFPartyClient", "updatePartyMemberInfo() Could not find memberinfo for member " + n);
            return;
        }
        ((cbh)object).Qw = n2;
        ((cbh)object).eiI = n3;
        ((cbh)object).eiH = bl;
        ((cbh)object).aXY = aluArray;
        ((cbh)object).aXX = bl2;
        ((cbh)object).RoundRobinExcluded = bl3;
        ((cbh)object).aYe = bl4;
        this.eiv = true;
    }

    private void a(vl vl2) {
        assert (vl2 != null);
        assert (vl2.Uo > 0);
        assert (vl2.aXP > 0);
        if (this.aXZ == null) {
            this.aXZ = vl2.aXZ;
        }
        if ((vl2.aXP & 1) > 0) {
            this.a(vl2.aYa, vl2.afF, vl2.Qw, vl2.ResourceType, vl2.aYc, vl2.aYb, vl2.aXY, vl2.aXX, vl2.aYd, vl2.aYe);
        }
        if ((vl2.aXP & 2) > 0 && !this.eit.containsKey(vl2.aYa)) {
            this.a(vl2.aYa, vl2.afF, vl2.Qw, vl2.ResourceType, vl2.aYc, vl2.aYb, vl2.aXY, vl2.aXX, vl2.aYd, vl2.aYe);
        }
        if ((vl2.aXP & 8) > 0) {
            this.a(vl2.aYa, vl2.Qw, vl2.aYc, vl2.aYb, vl2.aXY, vl2.aXX, vl2.aYd, vl2.aYe);
        }
        if ((vl2.aXP & 4) > 0) {
            this.ox(vl2.aYa);
        }
    }

    private void a(gqb gqb2) {
        assert (this.Initialized);
        if (gqb2.bhL <= 0) {
            lfn.b(5, "SFPartyClient", "handleSystemCompositeUpdateMessage() StateObjectID is invalid.");
            return;
        }
        if (gqb2.joY == null) {
            lfn.b(5, "SFPartyClient", "handleSystemCompositeUpdateMessage() PropertyUpdates array is null.");
            return;
        }
        cbh cbh2 = this.eit.get(gqb2.bhL);
        if (cbh2 == null) {
            lfn.b(5, "SFPartyClient", "handleSystemCompositeUpdateMessage() Could not find memberinfo for member " + gqb2.bhL);
            return;
        }
        cbb cbb2 = cbh2.eiJ;
        assert (cbb2 != null);
        boolean bl = false;
        boolean bl2 = false;
        block9: for (uk uk2 : gqb2.joY) {
            switch (uk2.Uo) {
                case 5: {
                    Object object = ((uj)uk2).aWo;
                    if (object == null) {
                        lfn.b(5, "SFPartyClient", "handleSystemCompositeUpdateMessage() DataArray is null.");
                        continue block9;
                    }
                    ljq ljq2 = ((lgj)object).eqI();
                    this.eiu = cbb2.Position == null || cbb2.Position.x != ljq2.x || cbb2.Position.rlV != ljq2.rlV;
                    cbb2.Position = ljq2;
                    continue block9;
                }
                case 1: {
                    cbh2.FirstName = ((uo)uk2).Value;
                    bl = true;
                    bl2 = true;
                    continue block9;
                }
                case 2: {
                    cbh2.LastName = ((uo)uk2).Value;
                    bl = true;
                    bl2 = true;
                    continue block9;
                }
                case 3: {
                    cbh2.add = ((uo)uk2).Value;
                    bl2 = true;
                    continue block9;
                }
                case 4: {
                    cbh2.bnj = ((uo)uk2).Value;
                    bl2 = true;
                    continue block9;
                }
                case 352: {
                    Object object = (uz)uk2;
                    cbh2.aGr = ((uz)object).Pz;
                    cbh2.aGA = ((uz)object).aXs;
                    bl2 = true;
                    continue block9;
                }
                case 11536: {
                    int n;
                    Object object = ((uo)uk2).Value;
                    cbh2.eiI = n = lea.epx().hv((String)object);
                    bl2 = true;
                    continue block9;
                }
                default: {
                    lfn.b(5, "SFPartyClient", "handleSystemCompositeUpdateMessage() Unhandled propertyupdate received: " + uk2);
                    assert (false);
                    return;
                }
            }
        }
        if (bl) {
            cbb2.eiq = new ljg(cbh2.FirstName + " " + cbh2.LastName);
        }
        this.eiv = bl2;
    }

    private void b(gsl gsl2) {
        if (gsl2.joY == null) {
            lfn.b(5, "SFPartyClient", "handleSystemSubscriptionEventMessage() PropertyUpdates array is null.");
            return;
        }
        if (!this.Initialized) {
            this.dj = gsl2.aO().ib();
        }
        uk[] ukArray = gsl2.joY;
        int n = ukArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            if (ukArray[i2].Uo == 1) {
                this.eix.b(((ur)ukArray[i2]).aXm);
                continue;
            }
            if (ukArray[i2] instanceof vl) {
                this.a((vl)ukArray[i2]);
                continue;
            }
            lfn.b(5, "SFPartyClient", "handleSystemSubscriptionEventMessage() Unhandled propertyupdate received: " + ukArray[i2].getClass().getName());
            lfn.b(5, "SFPartyClient", "handleSystemSubscriptionEventMessage() PropertyID=" + ukArray[i2].Uo);
        }
    }

    private void a(fwz fwz2) {
        int n = fwz2.bGi();
        switch (n) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                break;
            }
            default: {
                assert (false) : "Unhandled operation type : " + n;
                return;
            }
        }
        fwz2.on(this.aXZ);
        this.MessageDelegator.F(fwz2);
    }

    private void a(fxa fxa2) {
    }

    private void handleLineContainmentResponse(kuj kuj2) {
        if (this.eiz == null) {
            return;
        }
        if (kuj2.ilP.length < 1) {
            lfn.b(5, this.getClass().getSimpleName(), "_handleLineContainmentResponse() : zero length positions result");
            this.eiz = null;
            return;
        }
        int n = -1;
        float f2 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < kuj2.bqd.length; ++i2) {
            if (!lea.enW().isDescendant(kuj2.bqd[i2], cug.fqn) && kuj2.bqd[i2] != cug.fkr && (!this.eiy || !lea.enW().isDescendant(kuj2.bqd[i2], cug.fkp)) || !(kuj2.pJh[i2] < f2)) continue;
            f2 = kuj2.pJh[i2];
            n = i2;
        }
        if (n < 0) {
            lfn.b(5, this.getClass().getSimpleName(), "_handleLineContainmentResponse() : no intersection wi");
            this.eiz = null;
            return;
        }
        ljq ljq2 = kuj2.ilP[n];
        assert (ljq2 != null) : "No position found";
        this.eiz.gNU = ljq2;
        this.b(this.eiz);
        this.eiz = null;
    }

    public final ldv aHm() {
        return this.aXZ;
    }
}

