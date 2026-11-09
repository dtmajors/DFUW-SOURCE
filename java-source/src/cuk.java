/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  lcr
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class cuk
extends btk {
    private Map<Integer, gfw> fxJ = lcn.emw();
    private Map<Integer, lfs> fxK = lcn.emw();
    private Map<Integer, gjl> fxL = lcn.emw();
    private int Qs = 1;
    private les ResourceTree = lea.enW();

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4609: {
                this.a((giz)dxq2);
                break;
            }
            case 6145: {
                this.a((gfm)dxq2);
                break;
            }
            case 6147: {
                this.a((ggb)dxq2);
                break;
            }
            case 6148: {
                this.a((gfk)dxq2);
                break;
            }
            case 6150: {
                this.a((gfu)dxq2);
                break;
            }
            case 11527: {
                this.b((fon)dxq2);
                break;
            }
            case 11530: {
                this.a((foa)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(foa foa2) {
        gfw gfw2 = this.fxJ.remove(foa2.aVk());
        if (gfw2 instanceof lfs) {
            lfs lfs2 = (lfs)((Object)gfw2);
            gfk gfk2 = (gfk)lfs2.reX;
            List list = (List)lfs2.reY;
            assert (list != null);
            assert (list.isEmpty());
            assert (gfk2 != null);
            this.a(gfk2.aO(), (cbx[])null, gfk2.aVk());
        } else if (gfw2 instanceof gfu) {
            gfu gfu2 = (gfu)gfw2;
            this.b(gfu2.aO(), gfu2.ResourceType, true, gfu2.aVk());
        } else {
            gfm gfm2 = (gfm)gfw2;
            if (gfm2 == null) {
                lfn.b(5, "SFResourceManager", "handleIOFailureMessage() CreateMessage is null for MessageTag=" + foa2.aVk());
                return;
            }
            this.a(gfm2.aO(), (cbx)null, gfm2.aVk());
        }
    }

    private void b(fon fon2) {
        amf amf2 = (amf)fon2.iSe;
        if (amf2 == null) {
            lfn.b(5, "SFResourceManager", "handleLoadedObjectIOMessage() LoadedObject is null.");
            assert (false);
            return;
        }
        if (amf2 instanceof cxc) {
            this.a(fon2.aqs, (cxc)amf2);
        } else if (amf2 instanceof cbx) {
            this.a(fon2.aqs, (cbx)amf2);
        } else {
            lfn.b(5, "SFResourceManager", "handleLoadedObjectIOMessage() Unhandled object: " + amf2.getClass().getName() + " GUID=" + amf2.getGUID());
        }
    }

    private void a(int n, cbx cbx2) {
        assert (cbx2 != null);
        lfs lfs2 = this.fxK.get(n);
        if (lfs2 != null) {
            gfk gfk2 = (gfk)lfs2.reX;
            List list = (List)lfs2.reY;
            lgw lgw2 = (lgw)this.ResourceTree.acv(cbx2.az());
            if (lgw2.auW()) {
                if (gfk2.asi > 0) {
                    cbx2.do(gfk2.asi);
                    cbx2.aIt();
                }
            } else if (cbx2.vf() != 1) {
                lfn.b(5, "SFResourceManager", "handleLoadedResource(MULTI) Invalid quantity found in non-stackable resource.");
                lfn.b(5, "SFResourceManager", "handleLoadedResource(MULTI) " + cbx2);
                cbx2.do(1);
            }
            list.add(cbx2);
            if (list.size() != gfk2.jgk) {
                return;
            }
            cbx[] cbxArray = list.toArray(new cbx[list.size()]);
            this.a(gfk2.aO(), cbxArray, gfk2.aVk());
            this.fxK.remove(n);
            return;
        }
        gfw gfw2 = this.fxJ.remove(n);
        if (gfw2 instanceof gfm) {
            gfm gfm2 = (gfm)gfw2;
            lgw lgw3 = (lgw)this.ResourceTree.acv(cbx2.az());
            if (lgw3.auW()) {
                if (gfm2.asi > 0) {
                    cbx2.do(gfm2.asi);
                    cbx2.aIt();
                }
            } else if (cbx2.vf() != 1) {
                lfn.b(5, "SFResourceManager", "handleLoadedResource(SINGLE) Invalid quantity found in non-stackable resource.");
                lfn.b(5, "SFResourceManager", "handleLoadedResource(SINGLE) " + cbx2);
                cbx2.do(1);
            }
            this.a(gfm2.aO(), cbx2, gfm2.aVk());
        } else {
            gfu gfu2 = (gfu)gfw2;
            if (gfu2 == null) {
                lfn.b(5, "SFResourceManager", "handleLoadedResource() LoadMessage is null for MessageTag=" + n);
                return;
            }
            this.b(gfu2.aO(), gfu2.ResourceType, true, gfu2.aVk());
        }
    }

    private void a(int n, cxc cxc2) {
        assert (cxc2 != null);
        giz giz2 = (giz)this.fxL.remove(n);
        if (giz2 == null) {
            lfn.b(5, "SFResourceManager", "handleLoadedSkill() SkillMessage is null for MessageTag=" + n);
            return;
        }
        if (giz2.SkillLevel > 0.0f) {
            if (giz2.SkillLevel > 100.0f) {
                cxc2.ag(100.0f);
            } else if (giz2.SkillLevel < 1.0f) {
                cxc2.ag(1.0f);
            } else {
                cxc2.ag(giz2.SkillLevel);
            }
        } else {
            cxc2.ag(1.0f);
        }
        gja gja2 = (gja)this.MessageDelegator.h(4610, this.GUID, giz2.aO());
        gja2.sk(n);
        gja2.gcr = cxc2;
        this.MessageDelegator.F(gja2);
    }

    private void a(gfm gfm2) {
        foo foo2 = (foo)this.MessageDelegator.h(11526, this.GUID, lcr.qzt);
        foo2.pM(this.GUID);
        foo2.setServerObject(true);
        foo2.setObjectType(62);
        foo2.R(true);
        foo2.sk(this.Qs++);
        foo2.fn(gfm2.ResourceType);
        foo2.Hd(gfm2.iSi);
        foo2.pL(gfm2.Yc);
        foo2.hC(gfm2.gb);
        foo2.lh(true);
        this.MessageDelegator.F(foo2);
        this.fxJ.put(foo2.aVk(), gfm2);
    }

    private void a(gfk gfk2) {
        Object object;
        if (gfk2.jgk <= 0) {
            lfn.b(5, "SFResourceManager", "handleResourceCreateMultiMessage() NumberOfResources is invalid.");
            gfl gfl2 = (gfl)this.MessageDelegator.h(6149, this.GUID, gfk2.aO());
            gfl2.aqs = gfk2.aqs;
            gfl2.jgl = null;
            this.MessageDelegator.F(gfl2);
            return;
        }
        int n = this.Qs++;
        for (int i = 0; i < gfk2.jgk; ++i) {
            object = (foo)this.MessageDelegator.h(11526, this.GUID, lcr.qzt);
            ((fob)object).pM(this.GUID);
            ((foo)object).setServerObject(true);
            ((foo)object).setObjectType(62);
            ((foo)object).R(true);
            ((foo)object).sk(n);
            ((foo)object).fn(gfk2.ResourceType);
            ((foo)object).Hd(gfk2.iSi);
            ((fob)object).pL(gfk2.Yc);
            ((foo)object).hC(gfk2.gb);
            ((fob)object).lh(true);
            this.MessageDelegator.F((dxq)object);
        }
        ArrayList arrayList = lcn.abH(gfk2.jgk);
        object = new lfs(gfk2, arrayList);
        this.fxK.put(n, (lfs)object);
    }

    private void a(gfu gfu2) {
        foo foo2 = (foo)this.MessageDelegator.h(11526, this.GUID, lcr.qzt);
        foo2.pM(this.GUID);
        foo2.setServerObject(true);
        foo2.setObjectType(62);
        foo2.R(true);
        foo2.sk(this.Qs++);
        foo2.fn(gfu2.ResourceType);
        foo2.Hd(0);
        foo2.pL(null);
        foo2.hC(null);
        foo2.lh(true);
        this.MessageDelegator.F(foo2);
        this.fxJ.put(foo2.aVk(), gfu2);
    }

    private void a(ggb ggb2) {
        if (ggb2.jbX == null) {
            lfn.b(5, "SFResourceManager", "handleResourceRemoveMessage() OwnerObjectGUID is null.");
            return;
        }
        if (ggb2.gb == null) {
            lfn.b(5, "SFResourceManager", "handleResourceRemoveMessage() ResourceGUID is null.");
            return;
        }
        if (ggb2.ResourceType <= 0) {
            lfn.b(5, "SFResourceManager", "handleResourceRemoveMessage() ResourceType is invalid.");
            return;
        }
        if ((float)ggb2.asi <= 0.0f) {
            lfn.b(5, "SFResourceManager", "handleResourceRemoveMessage() Quantity is invalid.");
            return;
        }
    }

    private void a(giz giz2) {
        foo foo2 = (foo)this.MessageDelegator.h(11526, this.GUID, lcr.qzt);
        foo2.pM(this.GUID);
        foo2.setServerObject(true);
        foo2.setObjectType(56);
        foo2.R(true);
        foo2.sk(this.Qs++);
        foo2.fn(giz2.SkillType);
        foo2.Hd(giz2.iSi);
        foo2.pL(giz2.Yc);
        foo2.lh(true);
        this.MessageDelegator.F(foo2);
        this.fxL.put(foo2.aVk(), giz2);
    }

    private void a(ldv ldv2, cbx[] cbxArray, int n) {
        gfl gfl2 = (gfl)this.MessageDelegator.h(6149, this.GUID, ldv2);
        gfl2.aqs = n;
        gfl2.jgl = cbxArray;
        this.MessageDelegator.F(gfl2);
    }

    private void a(ldv ldv2, cbx cbx2, int n) {
        gfn gfn2 = (gfn)this.MessageDelegator.h(6146, this.GUID, ldv2);
        gfn2.aqs = n;
        gfn2.dtF = cbx2;
        this.MessageDelegator.F(gfn2);
    }

    private void b(ldv ldv2, int n, boolean bl, int n2) {
        gfv gfv2 = (gfv)this.MessageDelegator.h(6151, this.GUID, ldv2);
        gfv2.aqs = n2;
        gfv2.ResourceType = n;
        gfv2.jgq = bl;
        this.MessageDelegator.F(gfv2);
    }
}

