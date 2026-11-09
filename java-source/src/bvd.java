/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  lcr
 */
import java.util.Iterator;
import java.util.List;

public abstract class bvd
extends btk
implements bto {
    protected final bve.a dQn;
    protected ldv dJs = null;
    protected String FileName = null;
    protected ljq Position = null;
    protected lgl Rotation = null;
    protected int ResourceType = 0;
    private boolean dQo = false;
    private bwe dQp = null;
    protected cbx Qg = null;
    private List<dxq> dQq = null;
    private List<bwl> dQr = null;

    public bvd(bve.a a2) {
        assert (a2 != null);
        this.dQn = a2;
        this.ObjectType = 5;
    }

    public final bve.a aza() {
        return this.dQn;
    }

    public final ldv axa() {
        return this.dJs;
    }

    public final String getFileName() {
        return this.FileName;
    }

    public final void setFileName(String string) {
        this.ObjectDescriptionFilename = this.FileName = string;
    }

    public final ljq av() {
        if (this.Position == null) {
            return null;
        }
        return new ljq(this.Position);
    }

    public final ljq azb() {
        return this.Position;
    }

    public final void c(ljq ljq2) {
        this.Position = ljq2;
        if (!this.Initialized) {
            return;
        }
        if (this.isReadyToRun()) {
            kky kky2 = (kky)this.MessageDelegator.h(1025);
            kky2.ts(this.GUID);
            kky2.hC(this.dJs);
            kky2.pHF = 8;
            kky2.pHG = this.Position.x;
            kky2.pHH = this.Position.y;
            kky2.pHI = this.Position.rlV;
            kky2.rb = this.Rotation.x;
            kky2.rc = this.Rotation.y;
            kky2.rd = this.Rotation.rlV;
            kky2.pHJ = this.Rotation.rlW;
            this.MessageDelegator.a(kky2);
        } else {
            this.a(new bwl(1));
        }
    }

    public final void aX(ljq ljq2) {
        this.Position = ljq2;
    }

    public final lgl aw() {
        if (this.Rotation == null) {
            return null;
        }
        return new lgl(this.Rotation);
    }

    public final lgl azc() {
        return this.Rotation;
    }

    public final void d(ljq ljq2) {
        this.a(new lgl(ljq2));
    }

    public final void a(lgl lgl2) {
        this.Rotation = lgl2;
        if (!this.Initialized) {
            return;
        }
        if (this.isReadyToRun()) {
            kky kky2 = (kky)this.MessageDelegator.h(1025);
            kky2.ts(this.GUID);
            kky2.hC(this.dJs);
            kky2.pHF = 32;
            kky2.rb = this.Rotation.x;
            kky2.rc = this.Rotation.y;
            kky2.rd = this.Rotation.rlV;
            kky2.pHJ = this.Rotation.rlW;
            this.MessageDelegator.a(kky2);
        } else {
            this.a(new bwl(2));
        }
    }

    public final void h(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public final int az() {
        return this.ResourceType;
    }

    public final void l(int n) {
        this.ResourceType = n;
        if (!this.Initialized) {
            return;
        }
        if (this.isReadyToRun()) {
            this.azp();
        }
        if (this.isServerObject()) {
            gyl gyl2 = (gyl)this.MessageDelegator.h(12041, this.GUID, lcr.qAI);
            gyl2.ija = 2;
            gyl2.ResourceType = this.ResourceType;
            this.MessageDelegator.F(gyl2);
        }
    }

    public final boolean azd() {
        return this.dQo;
    }

    public final void ep(boolean bl) {
        this.dQo = bl;
    }

    public final cbx aze() {
        return this.Qg;
    }

    public final void a(cbx cbx2) {
        this.Qg = cbx2;
        if (this.Qg != null) {
            this.ResourceType = this.Qg.az();
            if (this.Initialized && this.isReadyToRun()) {
                this.azp();
            }
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.dJs != null) {
            this.apM();
        }
    }

    public bvd azf() {
        bvd bvd2 = bvt.c(this.dQn);
        this.c(bvd2);
        return bvd2;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.dQq != null) {
            this.azn();
        }
        if (this.dQr != null && this.isReadyToRun()) {
            this.azo();
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.azh();
    }

    public abstract boolean ayZ();

    @Override
    public final boolean isReadyToRun() {
        return this.ayZ();
    }

    public abstract boolean isServerObject();

    public final void aY(ljq ljq2) {
        kky kky2 = (kky)this.MessageDelegator.h(1025);
        kky2.ts(this.GUID);
        kky2.pHF = 64;
        kky2.hC(this.dJs);
        lgl lgl2 = new lgl(ljq2);
        kky2.rb = lgl2.x;
        kky2.rc = lgl2.y;
        kky2.rd = lgl2.rlV;
        kky2.pHJ = lgl2.rlW;
        this.MessageDelegator.a(kky2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1028: {
                this.a((ftz)dxq2);
                break;
            }
            case 1029: {
                this.a((fua)dxq2);
                break;
            }
            case 1034: {
                this.a((fug)dxq2);
                break;
            }
            case 1039: {
                this.a((ftw)dxq2);
                break;
            }
            case 5635: {
                this.b((fut)dxq2);
                break;
            }
            case 6917: {
                this.a((gio)dxq2);
                break;
            }
            case 6918: {
                this.a((gil)dxq2);
                break;
            }
            case 6919: {
                this.a((gim)dxq2);
                break;
            }
            case 11033: {
                gsl gsl2 = (gsl)dxq2;
                this.a(gsl2.joY);
                break;
            }
            case 11079: {
                gso gso2 = (gso)dxq2;
                this.a(new uk[]{gso2.bXc()});
                break;
            }
            case 5640: {
                if (this.Qg != null) {
                    this.Qg.receiveMessage(dxq2);
                    break;
                }
                lfn.b(5, "SFMeshObject", "receiveMessage() PhysicalObject is null for " + this.GUID);
                break;
            }
            case 18733: {
                if (this.Qg == null) break;
                this.Qg.receiveMessage(dxq2);
                break;
            }
            case 18735: {
                if (this.Qg == null) break;
                this.Qg.receiveMessage(dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public final void receiveResourceResponse(ktf ktf2) {
        if (ktf2.egN() == 1) {
            ksv ksv2 = (ksv)ktf2;
            if (ksv2.getResult() == 0) {
                this.dJs = ksv2.oq();
                this.azk();
            } else {
                lfn.b(5, "SFMeshObject", "receiveResourceResponse() Could not assemble object " + this.GUID + " FileName='" + this.FileName + "' Result=" + ksv2.getResult());
                lfn.b(5, "SFMeshObject", "receiveResourceResponse() ErrorString='" + ksv2.getErrorString() + "'");
                this.azl();
                this.MessageDelegator.hd(this.GUID);
            }
        } else if (ktf2.egN() == 4) {
            ksw ksw2 = (ksw)ktf2;
            if (ksw2.getResult() == 0) {
                this.dJs = ksw2.oq();
                this.Position = ksw2.av();
                this.Rotation = ksw2.aw();
                this.azk();
            } else {
                this.azl();
                lfn.b(5, "SFMeshObject", "receiveResourceResponse() COULD NOT SFResourceAssembleSpawnResponse ASSEMBLE OBJECT");
            }
        } else {
            super.receiveResourceResponse(ktf2);
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 1029: {
                this.a((kuu)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    public final void azg() {
        assert (this.isServerObject());
        assert (this.ayZ());
        kkx kkx2 = (kkx)this.MessageDelegator.h(1040);
        kkx2.ec = this.GUID;
        kkx2.iBr = true;
        kkx2.Rs = this.dJs;
        this.MessageDelegator.a(kkx2);
    }

    public final void g(ljq ljq2, lgl lgl2) {
        this.Position = ljq2;
        this.Rotation = lgl2;
        if (this.Initialized && this.isReadyToRun()) {
            kky kky2 = (kky)this.MessageDelegator.h(1025);
            kky2.ts(this.GUID);
            kky2.hC(this.dJs);
            kky2.pHF = 8;
            kky2.pHG = this.Position.x;
            kky2.pHH = this.Position.y;
            kky2.pHI = this.Position.rlV;
            kky2.rb = this.Rotation.x;
            kky2.rc = this.Rotation.y;
            kky2.rd = this.Rotation.rlV;
            kky2.pHJ = this.Rotation.rlW;
            this.MessageDelegator.a(kky2);
        }
    }

    public final void eq(boolean bl) {
        if (this.Initialized && this.isReadyToRun()) {
            kla kla2 = (kla)this.MessageDelegator.h(1028);
            kla2.ts(this.GUID);
            kla2.HW(2);
            kla2.hC(this.dJs);
            kla2.setVisible(bl);
            this.MessageDelegator.a(kla2);
        } else {
            lfn.b(5, "SFMeshObject", "setVisibility() Object " + this.GUID + " is not assembled yet.");
        }
    }

    public final void er(boolean bl) {
        if (this.Initialized && this.isReadyToRun()) {
            kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
            kmj2.ts(this.GUID);
            kmj2.Zf(1);
            kmj2.hC(this.dJs);
            kmj2.aO(bl);
            this.MessageDelegator.a(kmj2);
        } else {
            lfn.b(5, "SFMeshObject", "setIsCollider() Object " + this.GUID + " is not assembled yet.");
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": ");
        stringBuilder.append(this.dQn.name());
        if (this.GUID != null) {
            stringBuilder.append(" GUID=");
            stringBuilder.append(this.GUID);
        }
        if (this.GUID != null && this.dJs != null && !ldv.au(this.GUID, this.dJs)) {
            stringBuilder.append(" EngineGUID=");
            stringBuilder.append(this.dJs);
        }
        stringBuilder.append(" FileName='");
        stringBuilder.append(this.FileName);
        stringBuilder.append("' Position=");
        stringBuilder.append(this.Position);
        stringBuilder.append(" Rotation=");
        stringBuilder.append(this.Rotation);
        return stringBuilder.toString();
    }

    protected final void x(dxq dxq2) {
        assert (this.Initialized);
        assert (!this.isReadyToRun());
        if (this.dQp == null) {
            this.dQp = new bwe();
        }
        this.dQp.y(dxq2);
    }

    protected abstract void azh();

    protected final void azi() {
        assert (this.Initialized);
        assert (this.isReadyToRun());
        if (this.dQp != null) {
            List<dxq> list = this.dQp.aBc();
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                this.receiveMessage(list.get(i));
            }
            this.dQp = null;
        }
    }

    protected void azj() {
    }

    protected void c(bvd bvd2) {
        bvd2.setFileName(this.FileName);
        bvd2.c(this.av());
        bvd2.a(this.aw());
        bvd2.l(this.ResourceType);
    }

    protected void azk() {
        this.azj();
        this.azi();
    }

    protected final void azl() {
        this.dQo = true;
    }

    protected void a(kuu kuu2) {
        if (!kuu2.qeh) {
            lfn.b(5, "SFMeshObject", "handleObjectMoveToValidParkingPositionResponse() Parking failed for " + this.toString());
            return;
        }
        this.Position = kuu2.qei;
        this.Rotation = kuu2.qej;
        gyl gyl2 = (gyl)this.MessageDelegator.h(12041, this.GUID, lcr.qAI);
        gyl2.ija = 1;
        gyl2.Position = this.Position;
        gyl2.Rotation = this.Rotation;
        this.MessageDelegator.F(gyl2);
    }

    public final void azm() {
        if (!this.isServerObject()) {
            return;
        }
        gyl gyl2 = (gyl)this.MessageDelegator.h(12041, this.getGUID(), lcr.qAI);
        gyl2.ija = 1;
        gyl2.Position = this.Position;
        gyl2.Rotation = this.Rotation;
        this.MessageDelegator.F(gyl2);
    }

    protected void a(uk uk2) {
        switch (uk2.Uo) {
            case 1: {
                this.setFileName(((uo)uk2).Value);
                break;
            }
            case 2: {
                this.c(((uq)uk2).Qi);
                break;
            }
            case 3: {
                this.a(((um)uk2).aXj);
                break;
            }
            case 4: {
                this.l(((uh)uk2).PC);
                break;
            }
            default: {
                lfn.b(5, "SFMeshObject", "handlePropertyUpdate() Invalid propertyupdate received: " + uk2.vF());
                assert (false);
                return;
            }
        }
    }

    private void a(bwl bwl2) {
        if (this.dQr == null) {
            this.dQr = lcn.abH(2);
        }
        this.dQr.add(bwl2);
    }

    private void azn() {
        assert (this.dQq != null);
        Iterator<dxq> iterator = this.dQq.iterator();
        block3: while (iterator.hasNext()) {
            dxq dxq2 = iterator.next();
            switch (dxq2.bEz()) {
                case 5636: {
                    fuu fuu2 = (fuu)dxq2;
                    assert ((fuu2.iXt & 1) > 0);
                    if (this.Qg == null) continue block3;
                    fuu2.dtj = this.Qg.getGUID();
                    this.MessageDelegator.F(fuu2);
                    iterator.remove();
                    continue block3;
                }
            }
            lfn.b(5, "SFMeshObject", "checkStoredMessages() Unhandled stored message provided: " + dxq2.getClass().getName());
            iterator.remove();
        }
        if (this.dQq.isEmpty()) {
            this.dQq = null;
        }
    }

    private void azo() {
        assert (this.dQr != null);
        Iterator<bwl> iterator = this.dQr.iterator();
        while (iterator.hasNext()) {
            bwl bwl2 = iterator.next();
            switch (bwl2.dVm) {
                case 1: {
                    this.c(this.Position);
                    break;
                }
                case 2: {
                    this.a(this.Rotation);
                    break;
                }
                default: {
                    lfn.b(5, "SFMeshObject", "checkUpdatedProperties() Unhandled updated property provided: " + bwl2);
                }
            }
            iterator.remove();
        }
        if (this.dQr.isEmpty()) {
            this.dQr = null;
        }
    }

    private void b(fut fut2) {
        fuu fuu2 = (fuu)this.MessageDelegator.h(5636, this.GUID, fut2.aO());
        this.MessageDelegator.b(fut2, fuu2);
        fuu2.iXt = fut2.bSm();
        if ((fut2.bSm() & 1) > 0) {
            if (this.Qg != null) {
                fuu2.dtj = this.Qg.getGUID();
            } else if (fut2.iXu && fut2.bSm() == 1) {
                if (this.dQq == null) {
                    this.dQq = lcn.abH(2);
                }
                this.dQq.add(fuu2);
                return;
            }
        }
        if ((fut2.bSm() & 4) > 0) {
            fuu2.Uj = this.dJs;
        }
        this.MessageDelegator.F(fuu2);
    }

    private void a(ftw ftw2) {
        switch (ftw2.imk) {
            case 1: {
                if (ftw2.Position == null) {
                    lfn.b(5, "SFMeshObject", "handleObjectMovementMessage() Position is null.");
                    return;
                }
                this.c(ftw2.Position);
                break;
            }
            case 2: {
                if (ftw2.Rotation == null) {
                    lfn.b(5, "SFMeshObject", "handleObjectMovementMessage() Rotation is null.");
                    return;
                }
                this.a(ftw2.Rotation);
                break;
            }
            case 3: {
                if (ftw2.Position == null) {
                    lfn.b(5, "SFMeshObject", "handleObjectMovementMessage() Position is null.");
                    return;
                }
                if (ftw2.Rotation == null) {
                    lfn.b(5, "SFMeshObject", "handleObjectMovementMessage() Rotation is null.");
                    return;
                }
                this.g(ftw2.Position, ftw2.Rotation);
                break;
            }
            case 4: {
                if (ftw2.Rotation == null) {
                    lfn.b(5, "SFMeshObject", "handleObjectMovementMessage() Rotation is null.");
                    return;
                }
                this.Rotation.Y(new lgl(ftw2.Rotation));
                this.a(this.Rotation);
                break;
            }
            default: {
                lfn.b(5, "SFMeshObject", "handleObjectMovementMessage() Invalid movementtype provided: " + ftw2.imk);
                return;
            }
        }
        if (ftw2.aZa > 0 && cug.vX((int)this.ResourceType) && this instanceof bwi) {
            if (arw.bRW) {
                return;
            }
            lgj lgj2 = new lgj(ftw2.aZa, this.av(), this.aw(), false);
            ((bwi)((Object)this)).b(lgj2);
        }
    }

    private void a(ftz ftz2) {
        ftz ftz3 = (ftz)this.MessageDelegator.h(1028, this.GUID, ftz2.aO());
        this.MessageDelegator.b(ftz2, ftz3);
        ftz3.Position = this.av();
        ftz3.Rotation = this.aw();
        this.MessageDelegator.F(ftz3);
    }

    private void a(fua fua2) {
        if (!this.isReadyToRun()) {
            this.x(fua2);
            return;
        }
        switch (fua2.bSd()) {
            case 2: {
                this.eq(fua2.isVisible());
                break;
            }
            case 4: {
                this.er(fua2.bmv());
                break;
            }
            case 3: {
                lfn.b(5, "SFMeshObject", "handleObjectPropertyMessage() ReloadMesh is not supported!");
                break;
            }
            default: {
                lfn.b(5, "SFMeshObject", "handleObjectPropertyMessage() Unhandled ObjectPropertyRequestType provided: " + fua2.bSd());
                return;
            }
        }
    }

    private void a(uk[] ukArray) {
        if (ukArray == null) {
            lfn.b(5, "SFMeshObject", "handlePropertyUpdates() PropertyUpdates array is null for object " + this.GUID);
            return;
        }
        int n = ukArray.length;
        for (int i = 0; i < n; ++i) {
            this.a(ukArray[i]);
        }
    }

    private void a(fug fug2) {
        assert (this.Initialized);
        if (fug2.iWH <= 0) {
            lfn.b(5, "SFMeshObject", "handleResourceTypeModifyMessage() ModifyMessageType is invalid.");
            return;
        }
        if (fug2.ResourceType <= 0) {
            lfn.b(5, "SFMeshObject", "handleResourceTypeModifyMessage() ResourceType is invalid.");
            return;
        }
        if (!lea.enW().contains(fug2.ResourceType)) {
            lfn.b(5, "SFMeshObject", "handleResourceTypeModifyMessage() ResourceType is invalid.");
            return;
        }
        this.l(fug2.ResourceType);
    }

    private void apM() {
        assert (this.Initialized);
        assert (this.dJs != null);
        klb klb2 = (klb)this.MessageDelegator.h(1026);
        klb2.ec = this.GUID;
        klb2.iWE = klb.iHB;
        klb2.hC(this.dJs);
        this.MessageDelegator.a(klb2);
    }

    private void azp() {
        assert (this.Initialized);
        assert (this.isReadyToRun());
        assert (this.dJs != null);
        if (this.isScheduledForRemoval()) {
            lfn.b(5, "SFMeshObject", "sendObjectTypeModifyRequest() MeshObject is scheduled for removal.");
            return;
        }
        kll kll2 = (kll)this.MessageDelegator.h(1035);
        kll2.ts(this.GUID);
        kll2.hC(this.dJs);
        kll2.YR(1);
        kll2.setObjectType(this.ResourceType);
        this.MessageDelegator.a(kll2);
    }

    private void a(gil gil2) {
        assert (this.Initialized);
        if (gil2.jiF == null) {
            lfn.b(5, "SFMeshObject", "handleShaderSetMaterialMessage() Materials array is null for object " + this.GUID);
            return;
        }
        if (!this.isReadyToRun()) {
            this.x(gil2);
            return;
        }
        for (duq duq2 : gil2.jiF) {
            dur dur2 = duq2.bBm();
            this.a(dur2.aFZ(), dur2.aFO(), duq2.aFP()[0]);
        }
    }

    private void a(gim gim2) {
        assert (this.Initialized);
        if (!this.isReadyToRun()) {
            this.x(gim2);
            return;
        }
        this.a(gim2.bhh, gim2.eeC, gim2.eeH);
    }

    private void a(gio gio2) {
        assert (this.Initialized);
        if (gio2.jiG == null) {
            lfn.b(5, "SFMeshObject", "handleShaderSetShaderMessage() Shaders array is null for object " + this.GUID);
            return;
        }
        if (!this.isReadyToRun()) {
            this.x(gio2);
            return;
        }
        for (dut dut2 : gio2.jiG) {
            this.a(dut2.aFZ(), dut2.aHa(), dut2.aGZ(), dut2.aFO());
            if (dut2.aFV() == null) continue;
            this.a(dut2.aFZ(), dut2.aFO(), dut2.aFV());
        }
    }

    private void a(int n, int n2, dus dus2) {
        Object object;
        assert (this.isReadyToRun());
        assert (this.dJs != null);
        assert (dus2 != null);
        if (dus2.bBn() != null) {
            object = dus2.bBn();
            ((ljr)object).x = 1.0f - ((ljr)object).x;
            ((ljr)object).rlV = 1.0f - ((ljr)object).rlV;
            ((ljr)object).rlW = 1.0f - ((ljr)object).rlW;
        }
        object = (kps)this.MessageDelegator.h(3589);
        ((khd)object).ts(this.GUID);
        ((kpz)object).hC(this.dJs);
        if (n < 0) {
            ((kpz)object).eA(0);
            ((kps)object).aan(0);
            if (dus2.bBn() != null) {
                ((kps)object).aam(((kps)object).efu() | 4);
                ((kps)object).f(dus2.bBn());
            }
            if (dus2.bBo() != null) {
                ((kps)object).aam(((kps)object).efu() | 1);
                ((kps)object).g(dus2.bBo());
            }
            if (dus2.getPower() > 0.0f) {
                ((kps)object).aam(((kps)object).efu() | 2);
                ((kps)object).setPower(dus2.getPower());
            }
        } else {
            ((kpz)object).eA(n);
            ((kps)object).aan(n2);
            if (dus2.bBn() != null) {
                ((kps)object).aam(((kps)object).efu() | 0x20);
                ((kps)object).f(dus2.bBn());
            }
            if (dus2.bBo() != null && !dus2.bBo().esJ()) {
                ((kps)object).aam(((kps)object).efu() | 8);
                ((kps)object).g(dus2.bBo());
            }
            if (dus2.getPower() > 0.0f) {
                ((kps)object).aam(((kps)object).efu() | 0x10);
                ((kps)object).setPower(dus2.getPower());
            }
        }
        this.MessageDelegator.a((khd)object);
    }

    private void a(int n, String string, boolean bl, int n2) {
        assert (this.isReadyToRun());
        assert (this.dJs != null);
        assert (n >= 0);
        assert (string != null);
        assert (n2 >= 0);
        kpt kpt2 = (kpt)this.MessageDelegator.h(3585);
        kpt2.ts(this.GUID);
        kpt2.hC(this.dJs);
        kpt2.eA(n);
        kpt2.gW(string);
        if (bl) {
            kpt2.JD(17);
            kpt2.mc(true);
        } else {
            kpt2.JD(18);
            kpt2.oo(n2);
            kpt2.mc(false);
        }
        this.MessageDelegator.a(kpt2);
    }

    private void a(int n, int n2, String string) {
        assert (this.isReadyToRun());
        assert (this.dJs != null);
        assert (n >= 0);
        assert (n2 >= 0);
        assert (string != null);
        kpu kpu2 = (kpu)this.MessageDelegator.h(3588);
        kpu2.ts(this.GUID);
        kpu2.hC(this.dJs);
        kpu2.JE(2);
        kpu2.eA(n);
        kpu2.JF(n2);
        kpu2.kW(string);
        this.MessageDelegator.a(kpu2);
    }
}

