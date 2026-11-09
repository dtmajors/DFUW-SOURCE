/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  car
 *  cug
 */
import java.util.EnumMap;
import java.util.Map;

public class bzt
extends btk
implements bto,
bzz {
    private static final boolean bC = false;
    private static final int edZ = 20490;
    private static final int eea = 20500;
    private static final int eeb = 20510;
    private bvf eec = null;
    private car eed = null;
    private boolean eee = false;
    private int eef = 0;
    private boolean eeg = false;
    private Map<cak.c, bzs> eeh = new EnumMap<cak.c, bzs>(cak.c.class);
    private Map<cak.c, cad> eei = new EnumMap<cak.c, cad>(cak.c.class);
    private cba eej = null;
    private boolean eek = false;
    private ldv eel = null;
    private ldv eem = null;
    private boolean een = false;
    private ldv eeo = null;
    private ldv eep = null;
    private static les ResourceTree = lea.enW();
    protected boolean eeq = false;
    boolean eer = false;

    public bzt() {
        this.setObjectType(109);
    }

    public final bvf aFx() {
        return this.eec;
    }

    public final void b(bvf bvf2) {
        this.eec = bvf2;
    }

    @Override
    public final int az() {
        return this.eef;
    }

    @Override
    public final void cleanUp() {
        if (this.eee) {
            this.MessageDelegator.hd(this.eed.getGUID());
        }
        this.aFz();
        super.cleanUp();
    }

    public final float al(int n) {
        switch (n) {
            case 352: {
                return 10.0f;
            }
            case 354: {
                return 10.0f;
            }
        }
        return 0.0f;
    }

    public void a(car car2) {
        this.eed = car2;
    }

    public void oj(int n) {
        this.eef = n;
    }

    @Override
    public final void initialize() {
        assert (this.eec != null);
        super.initialize();
        if (this.eef == 0) {
            this.eef = cug.id((String)this.eec.ayY());
        }
        if (this.eef <= 0) {
            return;
        }
        this.eeg = ResourceTree.isDescendant(this.eef, cug.fia);
        if (this.eed == null) {
            if (this.eeg) {
                this.eed = new cau();
                this.eed.setGUID(this.MessageDelegator.bzv());
            } else {
                this.eed = new cas();
                this.eed.setGUID(this.MessageDelegator.bzv());
                uh uh2 = new uh();
                uh2.Uo = 1;
                uh2.PC = this.eef;
                this.eed.g((uk)uh2);
            }
            this.eee = true;
            this.eed.a((bzz)this);
            this.MessageDelegator.a((amf)this.eed);
        }
        if (this.eec.ayZ()) {
            this.aFy();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 20737: {
                this.a((fvx)dxq2);
                break;
            }
            case 20738: {
                this.a((fwa)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        switch (ktf2.egN()) {
            case 1: {
                this.a((ksv)ktf2);
                break;
            }
            default: {
                super.receiveResourceResponse(ktf2);
            }
        }
    }

    @Override
    public final void i(boolean bl, boolean bl2) {
        this.eer = bl2;
        if (bl) {
            this.aFy();
        } else {
            this.aFz();
        }
    }

    private boolean ok(int n) {
        assert (this.eed != null);
        assert (!this.eeg);
        can can2 = new can(n);
        return this.eed.aGo().containsKey(can2);
    }

    private cak.c getLayerType(int n) {
        lgw lgw2 = (lgw)ResourceTree.acv(n);
        if (lgw2 == null) {
            return null;
        }
        return lgw2.auO();
    }

    private void a(fvx fvx2) {
        if (fvx2.ija <= 0) {
            return;
        }
        if (fvx2.ResourceType <= 0) {
            return;
        }
        if (this.eeg) {
            return;
        }
        switch (fvx2.ija) {
            case 1: {
                this.a(fvx2.ResourceType, this.getLayerType(fvx2.ResourceType));
                break;
            }
            case 2: {
                this.b(fvx2.ResourceType, this.getLayerType(fvx2.ResourceType));
                break;
            }
            case 3: {
                this.c(fvx2.ResourceType, this.getLayerType(fvx2.ResourceType));
                break;
            }
            case 4: {
                this.d(fvx2.ResourceType, this.getLayerType(fvx2.ResourceType));
                break;
            }
            case 5: {
                this.t(fvx2.ResourceType, true);
                break;
            }
            case 6: {
                this.ol(fvx2.ResourceType);
                break;
            }
            case 7: {
                this.om(fvx2.ResourceType);
                break;
            }
            case 8: {
                this.on(fvx2.ResourceType);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(fwa fwa2) {
        if (fwa2.ija <= 0) {
            return;
        }
        if (fwa2.dMT == null) {
            return;
        }
        if (this.eeg) {
            return;
        }
        switch (fwa2.ija) {
            case 1: {
                uc uc2 = new uc();
                uc2.Uo = 2;
                uc2.aWl = fwa2.dMT;
                this.eed.g((uk)uc2);
                break;
            }
            case 2: {
                uc uc3 = new uc();
                uc3.Uo = 3;
                uc3.aWl = fwa2.dMT;
                this.eed.g((uk)uc3);
                break;
            }
            default: {
                return;
            }
        }
    }

    public void a(int n, cak.c c2) {
        assert (n > 0);
        assert (c2 != null);
        if (!ResourceTree.isDescendant(n, cug.fjk)) {
            return;
        }
        bzs bzs2 = this.eeh.get((Object)c2);
        if (bzs2 != null) {
            this.b(bzs2.ResourceType, c2);
        }
        bzs2 = new bzs();
        bzs2.GUID = this.MessageDelegator.bzv();
        bzs2.ResourceType = n;
        bzs2.aYp = this.ok(n);
        this.eeh.put(c2, bzs2);
        ut ut2 = new ut();
        ut2.Uo = 20490;
        ut2.aXP = 1;
        ut2.aXo = bzs2.aFw();
        this.eed.g((uk)ut2);
    }

    public void b(int n, cak.c c2) {
        assert (n > 0);
        assert (c2 != null);
        if (!ResourceTree.isDescendant(n, cug.fjk)) {
            return;
        }
        bzs bzs2 = this.eeh.remove((Object)c2);
        if (bzs2 == null) {
            return;
        }
        ut ut2 = new ut();
        ut2.Uo = 20490;
        ut2.aXP = 4;
        ut2.aXo = bzs2.aFw();
        this.eed.g((uk)ut2);
    }

    public void c(int n, cak.c c2) {
        assert (n > 0);
        assert (c2 != null);
        if (!ResourceTree.isDescendant(n, cug.fkO)) {
            return;
        }
        cad cad2 = this.eei.get((Object)c2);
        if (cad2 != null) {
            this.d(cad2.ResourceType, c2);
        }
        cad2 = new cad();
        cad2.ResourceType = n;
        cad2.bpW = c2;
        this.eei.put(c2, cad2);
        ve ve2 = new ve();
        ve2.Uo = 20500;
        ve2.aXP = 1;
        ve2.ResourceType = cad2.ResourceType;
        this.eed.g((uk)ve2);
    }

    public void d(int n, cak.c c2) {
        assert (n > 0);
        assert (c2 != null);
        if (!ResourceTree.isDescendant(n, cug.fkO)) {
            return;
        }
        cad cad2 = this.eei.remove((Object)c2);
        if (cad2 == null) {
            return;
        }
        ve ve2 = new ve();
        ve2.Uo = 20500;
        ve2.aXP = 4;
        ve2.ResourceType = cad2.ResourceType;
        this.eed.g((uk)ve2);
    }

    public void t(int n, boolean bl) {
        assert (n > 0);
        if (!ResourceTree.isDescendant(n, cug.fiL)) {
            return;
        }
        if (this.eej != null) {
            this.ol(this.eej.ResourceType);
        }
        this.eej = new cba();
        this.eej.GUID = this.MessageDelegator.bzv();
        this.eej.ResourceType = n;
        this.eej.aXT = bl;
        vv vv2 = new vv();
        vv2.Uo = 20510;
        vv2.aXP = 1;
        vv2.aYk = this.eej.aHk();
        this.eed.g((uk)vv2);
    }

    private void ol(int n) {
        assert (n > 0);
        if (!ResourceTree.isDescendant(n, cug.fiL)) {
            return;
        }
        if (this.eej == null) {
            return;
        }
        if (!this.eej.aXT) {
            this.om(this.eej.ResourceType);
        }
        vv vv2 = new vv();
        vv2.Uo = 20510;
        vv2.aXP = 4;
        vv2.aYk = this.eej.aHk();
        this.eed.g((uk)vv2);
        this.eej = null;
    }

    private void om(int n) {
        if (!ResourceTree.isDescendant(n, cug.fiL)) {
            return;
        }
        if (this.eej == null) {
            return;
        }
        if (this.eej.ResourceType != n) {
            return;
        }
        if (this.eej.aXT) {
            return;
        }
        this.eej.aXT = true;
        vv vv2 = new vv();
        vv2.Uo = 20510;
        vv2.aXP = 2056;
        vv2.aYk = this.eej.aHk();
        this.eed.g((uk)vv2);
    }

    private void on(int n) {
        if (!ResourceTree.isDescendant(n, cug.fiL)) {
            return;
        }
        if (this.eej == null) {
            return;
        }
        if (this.eej.ResourceType != n) {
            return;
        }
        if (!this.eej.aXT) {
            return;
        }
        this.eej.aXT = false;
        vv vv2 = new vv();
        vv2.Uo = 20510;
        vv2.aXP = 4104;
        vv2.aYk = this.eej.aHk();
        this.eed.g((uk)vv2);
    }

    private void aFy() {
        assert (this.Initialized);
        if (this.eeq) {
            return;
        }
        this.eeq = true;
        String string = cg.a(this.eef, this.eer);
        String string2 = cg.b(this.eef, this.eer);
        if (string == null || string2 == null) {
            return;
        }
        this.eel = this.MessageDelegator.bzv();
        this.eeo = this.MessageDelegator.bzv();
        krr krr2 = (krr)this.MessageDelegator.j(1);
        krr2.aaz(1);
        krr2.aaA(64);
        krr2.xC(true);
        krr2.xc(string);
        krr2.hC(this.eel);
        krr2.setObjectType(0);
        krr2.ts(this.getGUID());
        krr2.xe("");
        krr2.xd("");
        this.MessageDelegator.a(krr2);
        krr2 = (krr)this.MessageDelegator.j(1);
        krr2.aaz(1);
        krr2.aaA(64);
        krr2.xC(true);
        krr2.xc(string2);
        krr2.hC(this.eeo);
        krr2.setObjectType(0);
        krr2.ts(this.getGUID());
        krr2.xe("");
        krr2.xd("");
        this.MessageDelegator.a(krr2);
    }

    private void a(ksv ksv2) {
        if (ksv2.oq().equals(this.eel)) {
            if (ksv2.getResult() != 0) {
                return;
            }
            Map<String, eh> map = ei.ao(this.eec.getFileName());
            if (map == null) {
                return;
            }
            eh eh2 = map.get(ei.d(this.eef, this.eer));
            if (eh2 == null) {
                return;
            }
            this.eek = true;
            this.eem = this.MessageDelegator.bzv();
            knd knd2 = (knd)this.MessageDelegator.h(775);
            knd2.Jd(1);
            knd2.ts(this.GUID);
            knd2.jM(true);
            knd2.wD(false);
            knd2.lQ(false);
            knd2.kX(this.eem);
            knd2.qj(this.eec.getGUID());
            knd2.qk(this.eel);
            knd2.aE(false);
            knd2.setFrameName(eh2.getFrameName());
            knd2.ak(eh2.getRotation());
            knd2.aj(eh2.fb());
            knd2.bM(new ljq(1.0f, 1.0f, 1.0f));
            this.MessageDelegator.a(knd2);
        } else if (ksv2.oq().equals(this.eeo)) {
            if (ksv2.getResult() != 0) {
                return;
            }
            Map<String, eh> map = ei.ao(this.eec.getFileName());
            if (map == null) {
                return;
            }
            eh eh3 = map.get(ei.e(this.eef, this.eer));
            if (eh3 == null) {
                return;
            }
            this.een = true;
            this.eep = this.MessageDelegator.bzv();
            knd knd3 = (knd)this.MessageDelegator.h(775);
            knd3.Jd(1);
            knd3.ts(this.GUID);
            knd3.jM(true);
            knd3.wD(false);
            knd3.lQ(false);
            knd3.kX(this.eep);
            knd3.qj(this.eec.getGUID());
            knd3.qk(this.eeo);
            knd3.aE(false);
            knd3.setFrameName(eh3.getFrameName());
            knd3.ak(eh3.getRotation());
            knd3.aj(eh3.fb());
            knd3.bM(new ljq(1.0f, 1.0f, 1.0f));
            this.MessageDelegator.a(knd3);
        }
    }

    private void aFz() {
        khd khd2;
        assert (this.Initialized);
        if (!this.eeq) {
            return;
        }
        if (this.eek) {
            khd2 = (klb)this.MessageDelegator.h(1026);
            khd2.ts(this.GUID);
            ((klb)khd2).HX(klb.iHB);
            ((klb)khd2).Rs = this.eel;
            this.MessageDelegator.a(khd2);
        }
        if (this.een) {
            khd2 = (klb)this.MessageDelegator.h(1026);
            khd2.ts(this.GUID);
            ((klb)khd2).HX(klb.iHB);
            ((klb)khd2).Rs = this.eeo;
            this.MessageDelegator.a(khd2);
        }
        if (this.eem != null) {
            khd2 = (knd)this.MessageDelegator.h(775);
            khd2.ts(this.GUID);
            ((knd)khd2).Jd(2);
            ((knm)khd2).kX(this.eem);
            khd2.jM(true);
            this.MessageDelegator.a(khd2);
        }
        if (this.eep != null) {
            khd2 = (knd)this.MessageDelegator.h(775);
            khd2.ts(this.GUID);
            ((knd)khd2).Jd(2);
            ((knm)khd2).kX(this.eep);
            khd2.jM(true);
            this.MessageDelegator.a(khd2);
        }
        this.eek = false;
        this.eel = null;
        this.eem = null;
        this.een = false;
        this.eeo = null;
        this.eep = null;
        this.eeq = false;
    }

    public Map<cak.c, bzs> aFA() {
        return this.eeh;
    }

    public Map<cak.c, cad> aFB() {
        return this.eei;
    }

    public void b(lcq lcq2) {
        uc uc2 = new uc();
        uc2.Uo = 2;
        uc2.aWl = lcq2;
        this.eed.g((uk)uc2);
    }

    public void a(lcq lcq2) {
        uc uc2 = new uc();
        uc2.Uo = 3;
        uc2.aWl = lcq2;
        this.eed.g((uk)uc2);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.eec != null && this.eec.ayZ() && !this.eeq) {
            this.aFy();
        }
    }

    @Override
    public /* synthetic */ bvd aAG() {
        return this.aFx();
    }
}

