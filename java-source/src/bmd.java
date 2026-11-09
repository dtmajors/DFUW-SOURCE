/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public class bmd
extends bke {
    private fcv dva = null;

    public bmd() {
        this.dsy = bkd.a.drA;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, "SFCreateResourceFO", "doFunction() FunctionMessage is null.");
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9243) {
            lfn.b(5, "SFCreateResourceFO", "doFunction() Invalid message received: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.dva = (fcv)fdo2;
        if (this.dva.ResourceType <= 0) {
            lfn.b(5, "SFCreateResourceFO", "doFunction() ResourceType is invalid.");
            this.Vc();
            return;
        }
        if (this.dva.asi > 0) {
            this.a(-1, this.dva.ResourceType, this.GUID, this.dva.asi);
        } else {
            this.m(this.dva.ResourceType, this.GUID);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gfn gfn2) {
        cbx cbx2 = gfn2.dtF;
        if (cbx2 == null) {
            lfn.b(5, "SFCreateResourceFO", "handleResourceCreateResponse() Resource received from resourcemanager is null.");
            lfn.b(5, "SFCreateResourceFO", "handleResourceCreateResponse() Resource '" + ResourceTree.getName(this.dva.ResourceType) + "' could not be created.");
            if (this.dva.bOs()) {
                this.a(this.dva, false);
            }
            this.Vc();
            return;
        }
        if (this.dva.DR != null) {
            ej[] ejArray = this.dva.DR;
            int n = ejArray.length;
            block4: for (int i = 0; i < n; ++i) {
                ej ej2 = cbx2.fi().ae(ejArray[i].getType());
                if (ej2 == null) {
                    lfn.b(5, "SFCreateResourceFO", "handleResourceCreateResponse() Could not find attribute '" + ejArray[i].getName() + "' in resource '" + cbx2.pa() + "'");
                    assert (false);
                    continue;
                }
                switch (ejArray[i].getDataType()) {
                    case 2: {
                        float f2 = ((et)ejArray[i]).fN();
                        ((et)ej2).o(f2);
                        continue block4;
                    }
                    case 7: {
                        String string = ((ff)ejArray[i]).getStringValue();
                        ((ff)ej2).av(string);
                        continue block4;
                    }
                    default: {
                        lfn.b(5, "SFCreateResourceFO", "handleResourceCreateResponse() Invalid attribute provided: " + ejArray[i].fo());
                        assert (false);
                        continue block4;
                    }
                }
            }
        }
        this.MessageDelegator.a((amf)cbx2);
        if (this.dva.bOs()) {
            this.a(this.dva.aZG, this.dva, true, cbx2.getGUID());
        }
        this.Vc();
    }
}

