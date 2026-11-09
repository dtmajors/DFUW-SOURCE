/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;
import java.util.Map;

public class dxk
extends btk
implements bto {
    private a hnf = a.hnk;
    private Map<String, myx> ctF = lcn.emw();
    private myx[] hng;
    int hnh = -1;
    int hni = 100;
    ldv qo;

    public dxk() {
        myy myy2 = new myy();
        this.hng = myy2.eTo();
        for (int i2 = 0; i2 < this.hng.length; ++i2) {
            myx myx2 = this.hng[i2];
            this.ctF.put(myx2.getName(), myx2);
        }
        this.GUID = lcr.qAF;
    }

    @Override
    public void doTick(ldz ldz2) {
        switch (this.hnf) {
            case hnk: {
                if (this.hnh < this.hni) {
                    this.bEf();
                    break;
                }
                this.hnf = a.hno;
                break;
            }
            case hnl: {
                break;
            }
            case hnm: {
                this.bEg();
                break;
            }
            case hnn: {
                this.bEf();
                break;
            }
            case hno: {
                this.bEe();
            }
        }
    }

    private void bEe() {
        lfn.b(0, this.getClass().getSimpleName(), "unloadMe() : Test Finished!");
        for (myx myx2 : this.ctF.values()) {
            if (myx2.eTk()) continue;
            lfn.b(0, this.getClass().getSimpleName(), "wrapUpTest() : " + myx2.getName() + " is Sea tile");
        }
        this.MessageDelegator.hd(this.GUID);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 9475: {
                this.a((erb)dxq2);
                break;
            }
            case 11538: {
                this.a((foc)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(foc foc2) {
        if (foc2.iRL == foc.a.iRN) {
            lfn.b(5, this.getClass().getSimpleName(), "handleLoadResponseMessage() : Could not find tile =" + foc2.bsl());
            this.hnf = a.hnk;
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
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    private void bEf() {
        ++this.hnh;
        myx myx2 = this.hng[this.hnh];
        this.hnf = a.hnl;
        String string = "xml/terrain/terrain_" + myx2.getName();
        this.qo = this.MessageDelegator.bzv();
        fob fob2 = (fob)this.MessageDelegator.h(11521, this.GUID, lcr.qzt);
        fob2.cd(string);
        fob2.pL(this.qo);
        fob2.c(new ljq());
        fob2.setRotation(new ljq());
        fob2.pM(this.GUID);
        fob2.setServerObject(false);
        fob2.lh(true);
        fob2.lk(true);
        fob2.d(bve.a.dQv);
        this.MessageDelegator.F(fob2);
    }

    private void a(erb erb2) {
        amf amf2 = erb2.bLa();
        this.MessageDelegator.a(amf2);
        this.hnf = a.hnm;
    }

    private void bEg() {
        int n2 = 1022;
        int n3 = 230;
        int n4 = -511;
        int n5 = -511;
        int n6 = 3000;
        int n7 = 4;
        ArrayList<ljq> arrayList = lcn.emv();
        for (int i2 = 0; i2 < n7; ++i2) {
            for (int i3 = 0; i3 < 4; ++i3) {
                int n8 = -511 + i2 * 230;
                int n9 = -511 + i3 * 230;
                ljq ljq2 = new ljq(n8, 3000.0f, n9);
                arrayList.add(ljq2);
            }
        }
        ljq[] ljqArray = arrayList.toArray(new ljq[arrayList.size()]);
        kjn kjn2 = (kjn)this.MessageDelegator.h(2820);
        kjn2.FA(kjn.iEH);
        lfn.b(0, this.getClass().getName(), "This is GUID:" + kjn2.getGUID());
        kjn2.k(ljqArray);
        kjn2.hC(this.qo);
        kjn2.ts(this.GUID);
        this.MessageDelegator.a(kjn2);
        this.hnf = a.hnn;
    }

    private void a(kun kun2) {
        Object object;
        mje.DBE.add(kun2);
        if (kun2.getResult() != 0) {
            lfn.b(4, this.getClass().getSimpleName(), "receiveResponse() : ErrorCode for RayContainmentResponse = " + kun2.getResult());
            return;
        }
        boolean bl = false;
        for (int i2 = 0; i2 < kun2.egZ().length; ++i2) {
            if (kun2.egZ()[i2]) {
                object = kun2.eha()[i2];
                lfn.b(0, this.getClass().getSimpleName(), "handleRayObjectContainmentResponse() : HitPoint = " + ((ljq)object).y);
                if (!(((ljq)object).y > 215.0f)) continue;
                bl = true;
                break;
            }
            lfn.b(4, this.getClass().getSimpleName(), "receiveResponse() Ray didnt intersect with object! Intersectiing[" + kun2.egZ()[i2] + "], Result=[" + kun2.getResult() + "], Value [" + kun2.eha()[i2] + "]");
        }
        String string = this.MessageDelegator.d(this.qo).getObjectDescriptionFilename();
        object = this.ctF.get(string = string.substring(string.lastIndexOf("_") + 1).toLowerCase());
        if (object == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleRayObjectContainmentResponse() : OMG");
            return;
        }
        ((myx)object).As(bl);
        if (bl) {
            lfn.b(0, this.getClass().getSimpleName(), "handleRayObjectContainmentResponse() : Tile [" + ((myx)object).getName() + "] is Land Tile");
        } else {
            lfn.b(0, this.getClass().getSimpleName(), "handleRayObjectContainmentResponse() : Tile [" + ((myx)object).getName() + "] is Sea Tile");
        }
        this.MessageDelegator.hd(this.qo);
        this.qo = null;
        this.hnf = a.hnk;
    }
}

