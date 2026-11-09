/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  dta
 *  lcr
 */
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class eb
extends btk
implements bto {
    private static final boolean bC = false;
    public int ok = 0;
    public int ol = 0;
    private static final float om = 5000.0f;
    private int on = 20;
    private List<mof> oo = lcn.emv();
    private List<mof> op = lcn.emv();
    private Random oq = new Random();
    private float Radius = 20.0f;
    private boolean or = false;
    private Set os;
    private ldv ot;
    private dsn ou;
    private drv ov;
    private ljq Position;
    private kun ow;
    private boolean ox;
    private ArrayList<List<ldv>> oy = lcn.emv();
    private a oz = a.oB;

    @Override
    public void initialize() {
        lfn.b(0, this.getClass().getSimpleName(), "initialize(). GUID = " + this.GUID);
        this.dl();
    }

    private void dl() {
        this.setObjectType(22);
        assert (this.Position != null);
        this.ov = new drv();
        this.ov.setObjectType(22);
        this.ov.setGUID(this.MessageDelegator.bzv());
        this.ov.c(this.Position);
        this.MessageDelegator.a(this.ov);
        this.ou = new dsn();
        this.ou.setGUID(this.MessageDelegator.bzv());
        this.ou.c(this.Position);
        this.ou.setObjectType(22);
        this.ou.setRadius(this.ov.getOuterRadius() - 1.0f);
        this.ou.d(new ljq());
        this.MessageDelegator.a((amf)((Object)this.ou));
    }

    public void dm() {
        this.oz = a.oC;
    }

    @Override
    public void doTick(ldz ldz2) {
        switch (this.oz) {
            case oB: {
                break;
            }
            case oC: {
                if (this.ot == null) {
                    lfn.b(4, this.getClass().getSimpleName(), "doTick() HeightObjectGUID is null. Aborting.");
                    this.oz = a.oB;
                    return;
                }
                if (this.os == null && !this.ox) {
                    this.ds();
                }
                this.ow = null;
                this.dn();
                break;
            }
            case oD: {
                break;
            }
            case oE: {
                this.dt();
                break;
            }
            case oF: {
                break;
            }
            case oG: {
                break;
            }
            case oH: {
                lfn.b(0, this.getClass().getSimpleName(), "doTick() We are done!");
                this.op.clear();
                this.oz = a.oB;
            }
        }
    }

    private void dn() {
        int n2 = this.on * 2;
        List<ljq> list = this.W(n2);
        this.p(list);
        this.or = false;
        this.oz = a.oD;
    }

    private void p(List<ljq> list) {
        ljq ljq2 = this.av();
        for (ljq ljq3 : list) {
            ljq3.es(ljq2);
        }
        assert (this.ot != null) : "HeightObjectGUID is null!";
        kjn kjn2 = (kjn)this.MessageDelegator.h(2820);
        kjn2.FA(kjn.iEH);
        kjn2.k(list.toArray(new ljq[list.size()]));
        kjn2.hC(this.ot);
        kjn2.ts(this.GUID);
        this.MessageDelegator.a(kjn2);
    }

    private mof I(ljq ljq2) {
        mof mof2 = null;
        ljq ljq3 = this.av();
        ljq2.et(ljq3);
        mof mof3 = this.dr();
        if (mof3 == null) {
            return null;
        }
        mof2 = new mof(mof3);
        mof2.c(new ljq(ljq2));
        if (!this.a(mof2)) {
            return null;
        }
        float f2 = (float)mof2.eHp() * this.oq.nextFloat();
        ljq ljq4 = new ljq(0.0f, f2, 0.0f);
        mof2.setRotation(ljq4);
        return mof2;
    }

    private boolean a(mof mof2) {
        boolean bl = true;
        int n2 = this.op.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            mof mof3 = this.op.get(i2);
            if (this.a(mof3.av(), mof3.eHr(), mof2.av(), mof2.eHr())) continue;
            bl = false;
            break;
        }
        return bl;
    }

    private List<ljq> do() {
        ArrayList<ljq> arrayList = lcn.emv();
        if (this.ow == null) {
            return arrayList;
        }
        boolean[] blArray = this.ow.egZ();
        ljq[] ljqArray = this.ow.eha();
        int[] nArray = this.ow.ehb();
        float[] fArray = this.ow.ehc();
        for (int i2 = 0; i2 < blArray.length; ++i2) {
            if (!this.a(blArray[i2], nArray[i2], fArray[i2], ljqArray[i2])) continue;
            arrayList.add(ljqArray[i2]);
        }
        return arrayList;
    }

    private boolean a(boolean bl, int n2, float f2, ljq ljq2) {
        if (!bl) {
            return false;
        }
        float f3 = ljq2.y;
        if (f3 < this.dp() || f3 > this.dq()) {
            return false;
        }
        if (!this.V(n2)) {
            return false;
        }
        return !(f2 < -1.5707964f) && !(f2 > 1.5707964f);
    }

    private float dp() {
        return this.av().y - this.Radius;
    }

    private float dq() {
        return this.av().y + this.Radius;
    }

    private boolean V(int n2) {
        Set set = mgn.eyM();
        if (this.os != null) {
            for (mgl mgl2 : this.os) {
                if (n2 < mgl2.eyE() || n2 > mgl2.eyE() + mgl2.eyD() || !set.contains(mgl2.eyF())) continue;
                mgm mgm2 = mgn.aeh(mgl2.eyF());
                if (mgm2 == null) {
                    assert (false);
                    return false;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    private boolean a(ljq ljq2, float f2, ljq ljq3, float f3) {
        Rectangle rectangle = new Rectangle((int)(ljq3.x - f3), (int)(ljq3.rlV - f3), (int)(2.0f * f3), (int)(2.0f * f3));
        Rectangle rectangle2 = new Rectangle((int)(ljq2.x - f2), (int)(ljq2.rlV - f2), (int)(2.0f * f2), (int)(2.0f * f2));
        return !rectangle.intersects(rectangle2);
    }

    private mof dr() {
        mof mof2 = null;
        mof mof3 = null;
        int n2 = 0;
        int n3 = 100;
        int n4 = this.oq.nextInt(1 + n3 - n2) + n2;
        int n5 = 0;
        int n6 = this.oo.size();
        for (int i2 = 0; i2 < n6; ++i2) {
            mof3 = this.oo.get(i2);
            if (n4 > (n5 += mof3.eHt())) continue;
            mof2 = mof3;
            break;
        }
        if (mof2 == null && !this.oo.isEmpty()) {
            mof2 = this.oo.get(new Random().nextInt(this.oo.size()));
            lfn.b(0, "SFScatterTool", "getRandomObjectBasedOnWeighting() Erro with weightingTotals. Getting random object= " + mof2.eHq());
        }
        return mof2;
    }

    private void ds() {
        this.ox = true;
        if (this.ot == null) {
            String string = "No HeightObject selected!";
            lfn.b(5, this.getClass().getSimpleName(), "loadRegionMaterialInfo() " + string);
            return;
        }
        jxj jxj2 = new jxj();
        jxj2.dUz();
        amf amf2 = ((dta)this.MessageDelegator).bzt().d(this.ot);
        if (amf2 == null) {
            String string = "Could not get selected Height Object!";
            lfn.b(5, this.getClass().getSimpleName(), "loadRegionMaterialInfo() " + string);
            return;
        }
        String string = amf2.getObjectDescriptionFilename();
        int n2 = string.lastIndexOf("/");
        if (n2 == -1) {
            n2 = string.lastIndexOf("/");
        }
        if (n2 > 0) {
            string = string.substring(n2 + 1);
        }
        this.os = jxj2.vg(string);
        if (this.os != null) {
            String string2 = "Tile info for [" + string + "] contains [" + this.os.size() + "] MaterialRanges";
            lfn.b(3, this.getClass().getSimpleName(), "loadRegionMaterialInfo() " + string2);
        } else {
            lfn.b(0, this.getClass().getSimpleName(), "loadRegionMaterialInfo() Could not parse Materials file for Tile [" + string + "]");
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 4868: {
                this.a((kun)ktv2);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getName(), "receiveResponse() : Received unknown ResponseType = " + ktv2.egT());
            }
        }
    }

    private void a(kun kun2) {
        if (kun2.getResult() != 0) {
            lfn.b(4, this.getClass().getSimpleName(), "receiveResponse() : ErrorCode for RayContainmentResponse = " + kun2.getResult());
            return;
        }
        this.ow = kun2;
        this.oz = a.oE;
    }

    private void dt() {
        List<ljq> list = this.do();
        if (list.isEmpty()) {
            this.oz = a.oH;
            return;
        }
        while (!list.isEmpty()) {
            mof mof2 = this.I(list.remove(0));
            if (mof2 == null) continue;
            this.op.add(mof2);
        }
        if (this.op.isEmpty()) {
            lfn.b(0, this.getClass().getSimpleName(), "createScatterObjects() No Objects scattered. Done here.");
            this.oz = a.oH;
            return;
        }
        this.du();
    }

    private List<ljq> W(int n2) {
        if (this.Radius <= 0.0f) {
            String string = "Invalid Radius value = " + this.Radius;
            lfn.b(5, this.getClass().getSimpleName(), "getRandomPositions() " + string);
            assert (false) : string;
            return null;
        }
        ArrayList<ljq> arrayList = lcn.abH(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            ljq ljq2 = ljq.nw(this.Radius);
            ljq2.y = 5000.0f;
            arrayList.add(ljq2);
        }
        return arrayList;
    }

    private void du() {
        this.oz = a.oH;
        ljq ljq2 = this.av();
        if (this.op.isEmpty()) {
            lfn.b(4, this.getClass().getSimpleName(), "addObjectsToObjectSpace() No Objects to scatter");
            return;
        }
        if (ljq2 == null) {
            lfn.b(4, this.getClass().getSimpleName(), "addObjectsToObjectSpace() BasePosition is null");
            return;
        }
        if (mje.DAS == null) {
            lfn.b(4, this.getClass().getSimpleName(), "addObjectsToObjectSpace() No Selected Objectspace");
            this.c("No ObjectSpace Selected. Please Select an ObjectSpace", true);
            return;
        }
        ldv ldv2 = mje.DAS;
        dta dta2 = ((dta)this.MessageDelegator).bzt().od(ldv2);
        if (dta2 == null) {
            lfn.b(4, this.getClass().getSimpleName(), "addObjectsToObjectSpace() Selected OS " + ldv2 + " was not found.");
            return;
        }
        if (dta2.bzz() != 0) {
            lfn.b(4, this.getClass().getSimpleName(), "addObjectsToObjectSpace() Selected OS " + ldv2 + ", is wrong type! Add to NORMAL os type.");
            this.c("Objectspace is wrong type. Please Select a NORMAL ObjectSpace", true);
            return;
        }
        mof mof2 = null;
        ArrayList<ldv> arrayList = lcn.emv();
        for (int i2 = 0; i2 < this.op.size(); ++i2) {
            mof2 = this.op.get(i2);
            if (mof2.eFC()) {
                lfn.b(4, this.getClass().getSimpleName(), "addObjectsToObjectSpace() Animated Meshes not supported.");
                continue;
            }
            String string = mof2.eHq();
            ljq ljq3 = new ljq(mof2.av());
            ljq3.es(ljq2);
            dqk dqk2 = new dqk();
            dqk2.setGUID(dta2.bzv());
            dqk2.setObjectDescriptionFilename(string);
            dqk2.c(ljq3);
            dqk2.a(new lgl(mof2.getRotation()));
            dta2.a((amf)dqk2);
            arrayList.add(dqk2.getGUID());
            lfn.b(0, this.getClass().getSimpleName(), "addObjectsToObjectSpace() : RotY =" + mof2.getRotation().getY());
        }
        if (!arrayList.isEmpty()) {
            this.oy.add(arrayList);
        }
    }

    public void dv() {
        if (this.oy.isEmpty()) {
            return;
        }
        List<ldv> list = this.oy.remove(this.oy.size() - 1);
        for (ldv ldv2 : list) {
            ((dta)this.MessageDelegator).bzt().hd(ldv2);
        }
    }

    public void q(ldv ldv2) {
        this.ot = ldv2;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
        if (this.ov != null) {
            this.ov.c(this.Position);
            this.ov.updateObject();
        }
        if (this.ou != null) {
            this.ou.c(this.Position);
            this.ou.iN(true);
        }
    }

    public void setRadius(float f2) {
        this.Radius = f2;
        if (this.ov != null) {
            this.ov.setOuterRadius(this.Radius + 3.0f);
            this.ov.updateObject();
        }
        if (this.ou != null) {
            this.ou.setRadius(this.Radius);
        }
    }

    public ljq av() {
        return this.Position;
    }

    @Override
    public void cleanUp() {
        if (this.ov != null) {
            this.MessageDelegator.hd(this.ov.getGUID());
            this.ov = null;
        }
        if (this.ou != null) {
            this.MessageDelegator.hd(this.ou.getGUID());
            this.ou = null;
        }
    }

    public List<mof> dw() {
        return this.oo;
    }

    public void q(List<mof> list) {
        this.oo = list;
    }

    public int dx() {
        return this.on;
    }

    public void X(int n2) {
        this.on = n2;
    }

    public float getRadius() {
        return this.Radius;
    }

    private void c(String string, boolean bl) {
        lfn.b(0, this.getClass().getSimpleName(), "sendStatusMessageToWorldbuilderDesktop() : " + string);
        haz haz2 = (haz)this.MessageDelegator.h(4098, this.GUID, lcr.qzr);
        haz2.lU(string);
        haz2.setMessageType(0);
        haz2.lV("ScatterTool");
        haz2.mT(bl);
        this.MessageDelegator.F(haz2);
    }
}

