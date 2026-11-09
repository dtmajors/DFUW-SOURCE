/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  brg
 *  cex
 *  cug
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

public class cat
extends caq {
    private Map<cak.c, cad> eih = null;
    private static les ResourceTree = lea.enW();
    private int eii = 0;
    private Map<ldv, Integer> eij = lcn.emw();

    public Map<cak.c, cad> aGP() {
        return this.eih;
    }

    public final void aGQ() {
        if (this.eih == null) {
            return;
        }
        Iterator<cad> iterator = this.eih.values().iterator();
        while (iterator.hasNext()) {
            this.c(iterator.next());
        }
        this.eih = null;
    }

    @Override
    public final void initialize() {
        assert (!this.Initialized);
        assert (!this.ehE);
        assert (this.ehB != null);
        assert (this.ehB.aAG() != null);
        this.Initialized = true;
        this.aGv();
    }

    public final void w(bqs bqs2) {
        assert (bqs2 != null);
        int n = bqs2.az();
        if (ResourceTree.isDescendant(n, cug.fjk) || cug.wz((int)n)) {
            assert (bqs2.Uu());
            assert (bqs2.auQ());
            bzs bzs2 = (bzs)this.eeh.get(bqs2.getGUID());
            if (bzs2 == null) {
                lfn.b(5, "SFPaperdollManagerServer", "notifyDurabilityChanged() Could not find apparelitem " + bqs2.getGUID());
                return;
            }
            bzs2.edX = bqs2.avd();
            gyq gyq2 = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
            gyq2.ija = 4;
            gyq2.aXP = 3;
            gyq2.eet = bzs2.aFw();
            this.MessageDelegator.F(gyq2);
        } else if (ResourceTree.isDescendant(n, cug.fmO)) {
            assert (bqs2.Uu());
            assert (this.eej != null);
            assert (this.eej.GUID.equals(bqs2.getGUID()));
            this.eej.edX = bqs2.avd();
            gyq gyq3 = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
            gyq3.ija = 16;
            gyq3.aXP = 8;
            gyq3.eej = this.eej.aHk();
            this.MessageDelegator.F(gyq3);
        } else if (ResourceTree.isDescendant(n, cug.fiL)) {
            assert (bqs2.Uu());
            assert (this.eej != null);
            assert (this.eej.GUID.equals(bqs2.getGUID()));
            this.eej.edX = bqs2.avd();
            gyq gyq4 = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
            gyq4.ija = 16;
            gyq4.aXP = 8;
            gyq4.eej = this.eej.aHk();
            this.MessageDelegator.F(gyq4);
        }
    }

    public boolean aGR() {
        if (this.eej == null) {
            return true;
        }
        return this.eej.aXT;
    }

    public final boolean c(cad cad2) {
        assert (cad2 != null);
        can can2 = new can(cad2.ResourceType);
        if (!this.ehC.containsKey(can2)) {
            lfn.b(5, "SFPaperdollManagerServer", "notifyFeatureAdded() No paperdollitem mapped to key: " + can2);
            return false;
        }
        cad cad3 = (cad)this.eei.get((Object)cad2.bpW);
        if (cad3 != null) {
            // empty if block
        }
        this.eei.put(cad2.bpW, cad2);
        gyq gyq2 = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
        gyq2.ija = 8;
        gyq2.aXP = 4;
        gyq2.eeB = cad2.aFL();
        this.MessageDelegator.F(gyq2);
        return true;
    }

    public final boolean d(cad cad2) {
        assert (cad2 != null);
        can can2 = new can(cad2.ResourceType);
        if (!this.ehC.containsKey(can2)) {
            lfn.b(5, "SFPaperdollManagerServer", "notifyFeatureRemoved() No paperdollitem mapped to key: " + can2);
            return false;
        }
        cad cad3 = (cad)this.eei.remove((Object)cad2.bpW);
        if (cad3 == null) {
            lfn.b(5, "SFPaperdollManagerServer", "notifyFeatureRemoved() Could not find featureitem for layertype '" + cad2.Eg() + "'");
            return false;
        }
        gyq gyq2 = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
        gyq2.ija = 8;
        gyq2.aXP = 5;
        gyq2.eeB = cad2.aFL();
        this.MessageDelegator.F(gyq2);
        return true;
    }

    public final void h(lcq lcq2) {
        assert (this.HairColor != null);
        assert (lcq2 != null);
        this.HairColor = lcq2;
        if (!this.Initialized) {
            return;
        }
        gyq gyq2 = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
        gyq2.ija = 1;
        gyq2.HairColor = this.HairColor;
        this.MessageDelegator.F(gyq2);
    }

    public final void e(bqs bqs2, boolean bl) {
        Object object;
        cam cam2;
        assert (this.Initialized);
        assert (bqs2 != null);
        assert (!bqs2.auQ());
        bqs2.dQ(true);
        bzs bzs2 = new bzs();
        bzs2.GUID = bqs2.getGUID();
        bzs2.ResourceType = this.ov(bqs2.az());
        bzs2.aYp = bl;
        bzs2.edX = bqs2.avd();
        bzs2.aYr = bqs2.ap(13216);
        this.eij.put(bqs2.getGUID(), bqs2.az());
        if (bl && (cam2 = (cam)this.ehC.get(object = new can(bqs2.az()))) == null) {
            lfn.b(5, "SFPaperdollManagerServer", "notifyItemAttached() No paperdollitem mapped to key: " + object);
            lfn.b(5, "SFPaperdollManagerServer", "notifyItemAttached() Item " + bqs2.getGUID() + " could not be visually attached.");
            return;
        }
        this.eeh.put(bzs2.GUID, bzs2);
        object = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
        ((gyq)object).ija = 4;
        ((gyq)object).aXP = 1;
        ((gyq)object).eet = bzs2.aFw();
        this.MessageDelegator.F((dxq)object);
        if (this.aGn() instanceof cex) {
            cam2 = (cex)this.aGn();
            if (lea.enW().isDescendant(bzs2.ResourceType, cug.fjl) || lea.enW().isDescendant(bzs2.ResourceType, cug.fjr)) {
                ++this.eii;
                this.aGT();
                this.aGU();
                cjv cjv2 = cjv.getArmorType(bzs2.ResourceType);
                this.a(cjv2);
            }
        }
    }

    public void aGS() {
        if (this.eej != null) {
            int n;
            Object object = this.eij.get(this.eej.GUID);
            if (object == null) {
                object = this.eej.ResourceType;
            }
            if (this.eej.ResourceType != (n = this.ov((Integer)object))) {
                for (int i2 = 0; i2 < 2; ++i2) {
                    gyq gyq2 = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
                    gyq2.ija = 16;
                    int n2 = gyq2.aXP = i2 == 0 ? 7 : 6;
                    if (i2 == 1) {
                        this.eej.ResourceType = n;
                    }
                    gyq2.eej = this.eej.aHk();
                    this.MessageDelegator.F(gyq2);
                }
            }
        }
        for (bzs bzs2 : this.eeh.values()) {
            int n;
            Integer n3 = this.eij.get(bzs2.GUID);
            if (n3 == null) {
                n3 = bzs2.ResourceType;
            }
            if (bzs2.ResourceType == (n = this.ov(n3))) continue;
            for (int i3 = 0; i3 < 2; ++i3) {
                gyq gyq3 = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
                gyq3.ija = 4;
                int n4 = gyq3.aXP = i3 == 0 ? 2 : 1;
                if (i3 == 1) {
                    bzs2.ResourceType = n;
                }
                gyq3.eet = bzs2.aFw();
                this.MessageDelegator.F(gyq3);
            }
        }
    }

    public ldv ou(int n) {
        assert (this.Initialized);
        bzs bzs2 = new bzs();
        bzs2.GUID = this.MessageDelegator.bzv();
        bzs2.ResourceType = n;
        bzs2.aYp = true;
        bzs2.edX = 1.0f;
        bzs2.aYr = 0;
        this.eeh.put(bzs2.GUID, bzs2);
        gyq gyq2 = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
        gyq2.ija = 4;
        gyq2.aXP = 1;
        gyq2.eet = bzs2.aFw();
        this.MessageDelegator.F(gyq2);
        return bzs2.GUID;
    }

    public void kg(ldv ldv2) {
        assert (this.Initialized);
        bzs bzs2 = (bzs)this.eeh.remove(ldv2);
        if (bzs2 == null) {
            lfn.b(5, "SFPaperdollManagerServer", "detachSpecialItem() Could not find apparelitem for item " + ldv2);
            return;
        }
        gyq gyq2 = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
        gyq2.ija = 4;
        gyq2.aXP = 2;
        gyq2.eet = bzs2.aFw();
        this.MessageDelegator.F(gyq2);
    }

    public void aGT() {
        cex cex2;
        if (this.aGn() instanceof cex && (cex2 = (cex)this.aGn()).jm() != null) {
            float f2 = 1.0f - lew.A((float)this.eii * 0.2f, 0.0f, 1.0f);
            cex2.jm().c(12176, f2);
        }
    }

    public void aGU() {
        if (!lcw.aQH()) {
            return;
        }
        if (this.aGn() instanceof cex) {
            cex cex2 = (cex)this.aGn();
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            for (bzs bzs2 : this.eeh.values()) {
                bqs bqs2 = cex2.aJC().iK(bzs2.GUID);
                if (bqs2 == null) continue;
                f2 += bqs2.al(13248);
                f3 += bqs2.al(13264);
                f4 += bqs2.al(14128);
                f5 += bqs2.al(13280);
                f6 += bqs2.al(13296);
            }
            cex2.jm().c(13248, f2);
            cex2.jm().c(13264, f3);
            cex2.jm().c(14128, f4);
            cex2.jm().c(13280, f5);
            cex2.jm().c(13296, f6);
        }
    }

    public final void c(bqs bqs2) {
        assert (this.Initialized);
        assert (bqs2 != null);
        assert (bqs2.auQ());
        bqs2.dQ(false);
        bzs bzs2 = (bzs)this.eeh.remove(bqs2.getGUID());
        if (bzs2 == null) {
            lfn.b(5, "SFPaperdollManagerServer", "notifyItemDetached() Could not find apparelitem for item " + bqs2.getGUID());
            return;
        }
        gyq gyq2 = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
        gyq2.ija = 4;
        gyq2.aXP = 2;
        gyq2.eet = bzs2.aFw();
        this.MessageDelegator.F(gyq2);
        if (this.aGn() instanceof cex) {
            cex cex2 = (cex)this.aGn();
            if (lea.enW().isDescendant(bzs2.ResourceType, cug.fjl) || lea.enW().isDescendant(bzs2.ResourceType, cug.fjr)) {
                --this.eii;
                this.aGT();
                this.aGU();
            }
        }
    }

    public void aGV() {
        boolean bl;
        Object object;
        if (ctg.ffk) {
            return;
        }
        if (!(this.aGn() instanceof cex)) {
            return;
        }
        cex cex2 = (cex)this.aGn();
        brg brg2 = (brg)cex2.aJF();
        if (brg2 == null) {
            return;
        }
        bqx bqx2 = (bqx)cex2.aJC();
        if (bqx2 == null) {
            return;
        }
        ArrayList<Object> arrayList = null;
        if (!this.eeh.isEmpty()) {
            for (Map.Entry object2 : this.eeh.entrySet()) {
                object = (bzs)object2.getValue();
                if (object == null) continue;
                boolean bl2 = lcw.aQH() ? bqx2.ja(((bzs)object).GUID) != null : bqx2.jb(((bzs)object).GUID) != null;
                boolean bl3 = bl2;
                if (!bl3) continue;
                if (arrayList == null) {
                    arrayList = lcn.emv();
                }
                arrayList.add(object2.getKey());
            }
        }
        if (arrayList != null) {
            for (ldv ldv2 : arrayList) {
                object = brg2.iK(ldv2);
                if (object == null) continue;
                brg2.b((bqs)object, true, true);
            }
        }
        if (this.eej == null) {
            return;
        }
        bqs bqs2 = brg2.iK(this.eej.GUID);
        if (bqs2 == null) {
            return;
        }
        boolean bl4 = lcw.aQH() ? bqx2.ja(this.eej.GUID) != null : (bl = bqx2.jb(this.eej.GUID) != null);
        if (bl) {
            brg2.b(bqs2, true, true);
        }
    }

    private void a(cjv cjv2) {
        if (ctg.ffk) {
            return;
        }
        if (!(this.aGn() instanceof cex)) {
            return;
        }
        cex cex2 = (cex)this.aGn();
        if (this.eeh.isEmpty()) {
            return;
        }
        ArrayList<cjv> arrayList = lcn.emv();
        for (Map.Entry brg2 : this.eeh.entrySet()) {
            Object object;
            bzs bzs2 = (bzs)brg2.getValue();
            if (bzs2 == null || (object = cjv.getArmorType(bzs2.ResourceType)) == null || object == cjv2 || cak.c.isArmorTypePermittedForMixing(object, cjv2)) continue;
            arrayList.add((cjv)((Object)brg2.getKey()));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        bre bre2 = cex2.aJF();
        if (bre2 != null && bre2 instanceof brg) {
            brg brg2 = (brg)bre2;
            for (Object object : arrayList) {
                bqs bqs2 = brg2.iK((ldv)object);
                if (bqs2 == null) continue;
                brg2.b(bqs2, true, true);
            }
        }
    }

    public void aGW() {
        if (this.eej == null) {
            return;
        }
        if (this.eej.aXT) {
            return;
        }
        if (!(this.aGn() instanceof cex)) {
            return;
        }
        cex cex2 = (cex)this.aGn();
        bre bre2 = cex2.aJF();
        if (bre2 == null) {
            return;
        }
        bqs bqs2 = ((brg)bre2).iK(this.eej.GUID);
        if (bqs2 == null) {
            return;
        }
        if (cex2.aJC() != null) {
            ((brg)bre2).avG();
        }
    }

    public final void i(lcq lcq2) {
        assert (this.aCT != null);
        assert (lcq2 != null);
        this.aCT = lcq2;
        if (!this.Initialized) {
            return;
        }
        gyq gyq2 = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
        gyq2.ija = 2;
        gyq2.aCT = this.aCT;
        this.MessageDelegator.F(gyq2);
    }

    private int ov(int n) {
        if (this.ehB == null || !(this.ehB instanceof cex)) {
            return n;
        }
        ain ain2 = ain.getUnlockableTypeForResourceType(n);
        if (ain2.equals((Object)ain.bnp)) {
            return n;
        }
        cex cex2 = (cex)this.ehB;
        int n2 = cex2.aMS().a(ain2);
        if (n2 == -1) {
            n2 = n;
        }
        return n2;
    }

    public final void x(bqs bqs2) {
        assert (this.Initialized);
        assert (bqs2 != null);
        assert (bqs2.AT());
        assert (!bqs2.auQ());
        assert (this.eej == null);
        if (cug.wz((int)bqs2.az())) {
            this.e(bqs2, true);
            return;
        }
        bqs2.dQ(true);
        this.eej = new cba();
        this.eej.GUID = bqs2.getGUID();
        this.eej.ResourceType = this.ov(bqs2.az());
        this.eej.aXT = true;
        this.eij.put(bqs2.getGUID(), bqs2.az());
        gyq gyq2 = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
        gyq2.ija = 16;
        gyq2.aXP = 6;
        gyq2.eej = this.eej.aHk();
        this.MessageDelegator.F(gyq2);
    }

    public final void y(bqs bqs2) {
        assert (this.Initialized);
        assert (bqs2 != null);
        assert (bqs2.AT());
        assert (bqs2.auQ());
        if (cug.wz((int)bqs2.az())) {
            this.c(bqs2);
            return;
        }
        assert (this.eej != null);
        bqs2.dQ(false);
        this.eij.remove(bqs2.getGUID());
        gyq gyq2 = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
        gyq2.ija = 16;
        gyq2.aXP = 7;
        gyq2.eej = this.eej.aHk();
        this.MessageDelegator.F(gyq2);
        this.eej = null;
    }

    public final void z(bqs bqs2) {
        assert (this.Initialized);
        assert (bqs2 != null);
        assert (bqs2.AT());
        assert (bqs2.auQ());
        if (cug.wz((int)bqs2.az())) {
            return;
        }
        assert (this.eej != null);
        this.eej.aXT = true;
        gyq gyq2 = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
        gyq2.ija = 16;
        gyq2.aXP = 8;
        gyq2.eej = this.eej.aHk();
        this.MessageDelegator.F(gyq2);
    }

    public final void A(bqs bqs2) {
        assert (this.Initialized);
        assert (bqs2 != null);
        assert (bqs2.auX());
        assert (bqs2.auQ());
        if (cug.wz((int)bqs2.az())) {
            return;
        }
        assert (this.eej != null);
        this.eej.aXT = false;
        gyq gyq2 = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
        gyq2.ija = 16;
        gyq2.aXP = 8;
        gyq2.eej = this.eej.aHk();
        this.MessageDelegator.F(gyq2);
    }

    public final void aGX() {
        assert (this.eih == null);
        this.eih = new EnumMap<cak.c, cad>(cak.c.class);
        for (cad cad2 : this.eei.values()) {
            this.eih.put(cad2.bpW, cad2);
            gyq gyq2 = (gyq)this.MessageDelegator.h(12042, this.GUID, lcr.qAI);
            gyq2.ija = 8;
            gyq2.aXP = 5;
            gyq2.eeB = cad2.aFL();
            this.MessageDelegator.F(gyq2);
        }
        this.eei.clear();
    }

    @Override
    protected final void aGv() {
        assert (this.Initialized);
        assert (!this.ehE);
        assert (this.ehB != null);
        if (cug.vY((int)this.aGu())) {
            this.ehC = lea.ack(this.aGu());
            if (this.ehC == null) {
                lfn.b(5, "SFPaperdollManagerServer", "initializePaperdollManager() PaperdollItemMap is null.");
                return;
            }
        }
    }

    public int aGY() {
        if (this.eej != null) {
            return this.eej.ResourceType;
        }
        return -1;
    }

    public void ow(int n) {
        this.ehC = lea.ack(n);
    }
}

