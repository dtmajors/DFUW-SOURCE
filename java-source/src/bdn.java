/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 */
import java.util.Iterator;
import java.util.List;

public class bdn
extends bdl {
    private lec daS = null;

    public bdn() {
        this.ObjectType = 38;
        this.daw = 3;
        this.daS = new lec();
    }

    public bdn(lek lek2) {
        this.ObjectType = 38;
        this.daw = 3;
        this.daS = new lec(lek2);
    }

    public void cs(float f) {
        if (this.daS != null) {
            this.daS.dZ(f);
        }
    }

    public void c(lek lek2) {
        boolean bl;
        if (this.daS != null && (bl = this.daS.l(lek2))) {
            amf amf2 = null;
            Iterator iterator = this.day.iterator();
            while (iterator.hasNext()) {
                amf2 = (amf)iterator.next();
                if (this.daS.tn(amf2.getGUID())) continue;
                iterator.remove();
                this.k(amf2);
            }
        }
    }

    public void setShowGrid(boolean bl) {
        if (this.daS != null) {
            this.daS.setShowGrid(bl);
        }
    }

    public lek amp() {
        if (this.daS != null) {
            return this.daS.amp();
        }
        return null;
    }

    public float amr() {
        if (this.daS != null) {
            return (float)this.daS.eqb();
        }
        return 0.0f;
    }

    public lec ams() {
        return this.daS;
    }

    @Override
    public void c(ljq ljq2) {
        this.Position = ljq2;
        if (this.daS != null) {
            this.daS.em(this.Position);
        }
    }

    public void setRotation(ljq ljq2) {
        this.d(ljq2);
    }

    @Override
    public void a(amf amf2) {
        if (this.daB.containsKey(amf2.getGUID())) {
            return;
        }
        dqm dqm2 = null;
        if (amf2 instanceof dqm) {
            dqm2 = (dqm)amf2;
            amf2 = dqm2.buh();
            lek lek2 = dqm2.bug();
            this.a(amf2, lek2);
        } else {
            this.a(amf2, null);
        }
    }

    private void a(amf amf2, lek lek2) {
        if (amf2 != null && (amf2 instanceof dqk || amf2 instanceof btk)) {
            btk btk2 = (btk)amf2;
            btk2.addObserverObject(this.GUID);
            if (lek2 == null) {
                ljq ljq2;
                lek2 = this.daS.epU();
                if (amf2 instanceof ami && (lek2 = this.daS.ek(ljq2 = ((ami)((Object)amf2)).av())) == null) {
                    lek2 = this.daS.epU();
                }
            }
            if (lek2 != null && this.Position != null) {
                if (btk2 instanceof dqk && this.daE) {
                    ((dqk)btk2).c(this.daS.j(lek2));
                } else if (btk2 instanceof bdl && this.daE) {
                    ((bdl)((Object)btk2)).c(this.daS.j(lek2));
                } else if (btk2 instanceof ami && this.daE) {
                    ((ami)((Object)btk2)).c(this.daS.j(lek2));
                }
                this.day.add(amf2);
                this.daB.put(amf2.getGUID(), amf2);
                this.daS.a(lek2, amf2.getGUID());
                if (this.Initialized && this.MessageDelegator != null) {
                    this.MessageDelegator.a(btk2);
                    if (this.Rotation.x != 0.0f || this.Rotation.y != 0.0f || this.Rotation.rlV != 0.0f) {
                        this.a(btk2, this.aw(), this.daS.eqc());
                    }
                }
            }
        }
    }

    @Override
    public int hd(ldv ldv2) {
        amf amf2 = (amf)this.daB.get(ldv2);
        if (amf2 != null) {
            return this.k(amf2);
        }
        return -1;
    }

    private int k(amf amf2) {
        if (!this.day.remove(amf2)) {
            // empty if block
        }
        this.daS.uc(amf2.getGUID());
        this.MessageDelegator.hd(amf2.getGUID());
        this.daB.remove(amf2.getGUID());
        return 0;
    }

    public ljq amt() {
        return this.daS.amt();
    }

    public List d(lek lek2) {
        return this.daS.d(lek2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 9474: {
                this.a((era)dxq2);
                return;
            }
            case 9475: {
                this.a((erb)dxq2);
                return;
            }
            case 9476: {
                this.a((eqz)dxq2);
                return;
            }
            case 1025: {
                this.a((ftv)dxq2);
                return;
            }
            case 1027: {
                this.handleObjectRemoveMessage((fub)dxq2);
                return;
            }
            case 3330: {
                this.a((ewy)dxq2);
                break;
            }
            case 6913: {
                this.a((gif)dxq2);
                break;
            }
            default: {
                btk btk2 = null;
                boolean bl = false;
                int n2 = this.day.size();
                for (int i = 0; i < n2; ++i) {
                    btk2 = (btk)this.day.get(i);
                    btk2.receiveMessage(dxq2);
                    bl = true;
                }
                if (bl) break;
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void a(ewy ewy2) {
        kjn kjn2 = (kjn)this.MessageDelegator.h(2820);
        kjn2.FA(kjn.iEH);
        kjn2.k(new ljq[]{new ljq(this.Position)});
        kjn2.hC(ewy2.oq());
        kjn2.ts(this.GUID);
        this.MessageDelegator.a(kjn2);
    }

    protected void a(ftv ftv2) {
        int n = ftv2.bRZ();
        ljq ljq2 = ftv2.aw().eqT();
        if ((n & 0x20) != 0) {
            this.b(ftv2);
            return;
        }
        if ((n & 2) != 0) {
            if (ftv2.av() == null) {
                ftv2.c(new ljq());
            }
            ftv2.a(new lgl(0.0f, 0.0f, 0.0f, 1.0f));
            this.Position.es(ftv2.av());
        }
        if (ljq2 != null && (ljq2.x != 0.0f || ljq2.y != 0.0f || ljq2.rlV != 0.0f)) {
            ljq ljq3;
            if ((n & 0x20) != 0 || (n & 8) != 0) {
                ljq3 = new ljq(ljq2);
                ljq2.x -= this.Rotation.x;
                ljq2.y -= this.Rotation.y;
                ljq2.rlV -= this.Rotation.rlV;
                this.d(ljq3);
            } else {
                this.Rotation.Y(new lgl(ljq2));
            }
            ljq3 = null;
            int n2 = this.day.size();
            for (int i = 0; i < n2; ++i) {
                ljq3 = this.day.get(i);
                if (!(ljq3 instanceof btk)) continue;
                this.a((btk)((Object)ljq3), this.aw(), this.daS.eqc());
            }
            return;
        }
        ljq ljq4 = ftv2.av();
        if (ljq4 != null && (ljq4.x != 0.0f || ljq4.y != 0.0f || ljq4.rlV != 0.0f)) {
            btk btk2 = null;
            int n3 = this.day.size();
            for (int i = 0; i < n3; ++i) {
                btk2 = (btk)this.day.get(i);
                btk2.receiveMessage(ftv2);
            }
        }
    }

    private void b(ftv ftv2) {
        if (ftv2.bRZ() == 32) {
            if (ftv2.bSb() == 1) {
                ljq ljq2 = new ljq(0.0f, this.Rotation.y, 0.0f);
                ljq ljq3 = new ljq(ljq2);
                ljq2.x -= this.Rotation.x;
                ljq2.y -= this.Rotation.y;
                ljq2.rlV -= this.Rotation.rlV;
                this.d(ljq3);
                Object var4_4 = null;
                int n = this.day.size();
                for (int i = 0; i < n; ++i) {
                    var4_4 = this.day.get(i);
                    if (!(var4_4 instanceof btk)) continue;
                    this.a(var4_4, new lgl(ljq2), this.daS.eqc());
                }
                return;
            }
            if (ftv2.bSb() == 2 || ftv2.bSb() == 3) {
                // empty if block
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(era era2) {
        if (era2.bKV() == 3) {
            amf amf2 = (amf)this.daB.get(era2.bKW());
            if (amf2 != null && amf2 instanceof ami) {
                ami ami2 = (ami)((Object)amf2);
                ljq ljq2 = new ljq(ami2.av());
                lek lek2 = this.daS.a(era2.bKW(), era2.bKY());
                ljq ljq3 = new ljq(this.daS.j(lek2));
                ljq3.et(ljq2);
                ljq ljq4 = era2.getRotation();
                ftv ftv2 = (ftv)this.MessageDelegator.h(1025, this.GUID, amf2.getGUID());
                ftv2.HT(2);
                ftv2.c(ljq3);
                ftv2.a(new lgl(ljq4));
                this.MessageDelegator.I(ftv2);
                return;
            }
            if (amf2 == null) return;
            if (!(amf2 instanceof bdl)) return;
            bdl bdl2 = (bdl)((Object)amf2);
            ljq ljq5 = new ljq(bdl2.av());
            lek lek3 = this.daS.a(era2.bKW(), era2.bKY());
            ljq ljq6 = new ljq(this.daS.j(lek3));
            ljq6.et(ljq5);
            ljq ljq7 = era2.getRotation();
            ftv ftv3 = (ftv)this.MessageDelegator.h(1025, this.GUID, bdl2.getGUID());
            ftv3.HT(2);
            ftv3.c(ljq6);
            ftv3.a(new lgl(ljq7));
            bdl2.receiveMessage(ftv3);
            return;
        }
        if (era2.bKV() == 4) {
            amf amf3 = (amf)this.daB.get(era2.bKW());
            if (amf3 != null && amf3 instanceof dqk) {
                dqk dqk2 = (dqk)amf3;
                ldv ldv2 = this.MessageDelegator.bzv();
                dqk dqk3 = (dqk)dqk2.bum();
                dqk3.setGUID(ldv2);
                lek lek4 = this.daS.ud(era2.bKW());
                this.a((amf)dqk3, lek4);
                ljq ljq8 = new ljq(dqk2.av());
                lek lek5 = this.daS.a(era2.bKW(), era2.bKY());
                ljq ljq9 = new ljq(this.daS.j(lek5));
                ljq9.et(ljq8);
                ljq ljq10 = era2.getRotation();
                ftv ftv4 = (ftv)this.MessageDelegator.h(1025, this.GUID, dqk2.getGUID());
                ftv4.HT(2);
                ftv4.c(ljq9);
                ftv4.a(new lgl(ljq10));
                dqk2.receiveMessage((dxq)ftv4);
                return;
            }
            if (amf3 == null) return;
            if (!(amf3 instanceof bdl)) return;
            return;
        } else {
            if (era2.bKV() == 5) {
                if (era2.amp() == null) return;
                this.c(era2.amp());
                return;
            }
            if (era2.bKV() != 6) return;
            if (era2.bKZ() == null) return;
            this.e(era2.bKZ());
        }
    }

    private void e(lek lek2) {
        if (!this.daS.bKZ().equals(lek2)) {
            this.daS.e(new lek(lek2));
        }
    }

    @Override
    public void ami() {
        ldv ldv2 = null;
        Object var2_2 = null;
        dqk dqk2 = null;
        Object var4_4 = null;
        ljq ljq2 = null;
        ljq ljq3 = null;
        int n = this.day.size();
        for (int i = 0; i < n; ++i) {
            if (!(this.day.get(i) instanceof dqk)) continue;
            dqk2 = (dqk)this.day.get(i);
            ldv2 = dqk2.getGUID();
            ljq2 = this.daS.ue(ldv2);
            ljq3 = new ljq(dqk2.FX());
            this.a(ldv2, ljq2, ljq3);
        }
    }

    @Override
    protected void cU(boolean bl) {
        if (bl) {
            // empty if block
        }
        if (this.daG != null) {
            this.MessageDelegator.hd(this.daG.getGUID());
        }
    }

    @Override
    public void cleanUp() {
        if (this.daG != null) {
            this.MessageDelegator.hd(this.daG.getGUID());
        }
        super.cleanUp();
    }
}

