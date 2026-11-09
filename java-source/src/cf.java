/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  cug
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cf
extends btk
implements bto {
    protected ljq Position = new ljq(0.0f, 0.0f, 0.0f);
    protected lgl Rotation = new lgl();
    protected int ResourceType = -1;
    private ldv gb;
    private String gc;
    private List<String> gd = lcn.emv();
    private List<String> ge = lcn.emv();
    private static final boolean bC = true;
    private boolean fE = true;
    private bvf.a gf = bvf.a.dRz;

    @Override
    public void doTick(ldz ldz2) {
        if (this.fE && lcw.qFO) {
            this.au();
            this.fE = false;
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        lfn.b(2, "SFCharacterRepresentationLogic", "initialize() GUID=" + this.GUID);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 9475: {
                this.a((erb)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(erb erb2) {
        amf amf2 = erb2.bLa();
        if (!(amf2 instanceof bvf)) {
            lfn.b(5, this.getClass().getSimpleName(), "handleObjectAddMessage() : loaded object not correct type!");
            assert (false);
            return;
        }
        this.MessageDelegator.a(amf2);
        bvf bvf2 = (bvf)amf2;
        bvf2.a(true, this.gf);
        String string = jry.tu(bvf2.getFileName()) + ".xml";
        lfn.b(0, this.getClass().getSimpleName(), "handleObjectAddMessage() : Added Char [" + string + "]");
        int n = cug.id((String)string);
        if (n < 0) {
            lfn.b(0, this.getClass().getSimpleName(), "handleObjectAddMessage() : Cannot dress char = " + string);
            return;
        }
        bvf2.cx(string);
        bzt bzt2 = new bzt();
        bzt2.b(bvf2);
        ldv ldv2 = this.MessageDelegator.bzv();
        bzt2.setGUID(ldv2);
        this.MessageDelegator.a(bzt2);
        String string2 = cg.q(n);
        if (string2 == null) {
            assert (false);
            lfn.b(5, this.getClass().getSimpleName(), "handleObjectAddMessage() : Invalid resourceType!");
            bvf2.a(true, bvf.a.dRA);
            this.a(bvf2);
            return;
        }
        this.a(this.gd, ldv2);
        this.b(this.ge, ldv2);
        lfn.b(0, this.getClass().getSimpleName(), "handleObjectAddMessage() : Setting up Anim [" + string + "] with AppearanceManagerGUID = " + ldv2);
    }

    private void a(bvf bvf2) {
        if (!bvf2.ayY().contains("undead_dwarf")) {
            return;
        }
        lfn.b(0, this.getClass().getSimpleName(), "addWeaponsForMonster() : Adding wepon to monster: " + bvf2.ayY());
        ArrayList<String> arrayList = lcn.emv();
        arrayList.add("r_dwarven maul");
        bzt bzt2 = new bzt();
        bzt2.b(bvf2);
        ldv ldv2 = this.MessageDelegator.bzv();
        bzt2.setGUID(ldv2);
        this.MessageDelegator.a(bzt2);
        this.a(arrayList, ldv2);
    }

    private void au() {
        this.gb = this.MessageDelegator.bzv();
        lgw lgw2 = (lgw)lea.enW().acv(this.ResourceType);
        if (lgw2 == null) {
            lfn.b(5, "SFResourceConstants", "getMeshFileName() ResourceType is invalid. Checking AnimationFilename");
            if (this.gc == null) {
                lfn.b(0, this.getClass().getSimpleName(), "addCharacter() : Invalid ResourceType and AnimationFilename == null. Not loading!");
                return;
            }
        } else {
            this.gc = lgw2.bBt();
        }
        ldv ldv2 = this.MessageDelegator.bzv();
        fob fob2 = (fob)this.MessageDelegator.h(11521, this.GUID, lcr.qzt);
        fob2.cd("xml-files/object/animation/" + this.gc);
        fob2.pL(ldv2);
        fob2.c(new ljq(this.Position));
        fob2.setRotation(new ljq(this.Rotation.eqT()));
        fob2.pM(this.GUID);
        fob2.setServerObject(false);
        fob2.lh(true);
        fob2.d(bve.a.dQu);
        this.MessageDelegator.F(fob2);
    }

    private void a(List<String> list, ldv ldv2) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            boolean bl = false;
            String string = iterator.next();
            int n = lea.enW().getType(string);
            fvx fvx2 = (fvx)this.MessageDelegator.h(20737, this.GUID, ldv2);
            fvx2.ija = 1;
            if (lea.enW().isDescendant(n, cug.fiL)) {
                lfn.b(0, this.getClass().getSimpleName(), "addResourceTocharacter() : Resource [" + string + "] is weapon! Attaching as weapon");
                fvx2.ija = 5;
                bl = true;
            }
            fvx2.ResourceType = n;
            this.MessageDelegator.F(fvx2);
            if (!bl) continue;
            fvx2 = (fvx)this.MessageDelegator.h(20737, this.GUID, ldv2);
            fvx2.ija = 8;
            fvx2.ResourceType = n;
            this.MessageDelegator.F(fvx2);
        }
    }

    private void a(int n, ldv ldv2, boolean bl) {
        assert (n > 0);
        int n2 = 3;
        if (!bl) {
            n2 = 4;
        }
        fvx fvx2 = (fvx)this.MessageDelegator.h(20737, this.GUID, ldv2);
        fvx2.ResourceType = n;
        fvx2.ija = n2;
        this.MessageDelegator.F(fvx2);
    }

    private void b(List<String> list, ldv ldv2) {
        for (String string : list) {
            int n = lea.enW().getType(string);
            this.a(n, ldv2, true);
        }
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public void d(ljq ljq2) {
        if (this.Rotation == null) {
            this.Rotation = new lgl(ljq2);
        } else {
            this.Rotation.ep(ljq2);
        }
    }

    public List<String> ax() {
        return this.gd;
    }

    public void b(List<String> list) {
        this.gd = new ArrayList<String>(list);
    }

    public List<String> ay() {
        return this.ge;
    }

    public void c(List<String> list) {
        this.ge = new ArrayList<String>(list);
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public void y(String string) {
        this.gc = string;
    }

    public bvf.a aA() {
        return this.gf;
    }

    public void a(bvf.a a2) {
        this.gf = a2;
    }
}

