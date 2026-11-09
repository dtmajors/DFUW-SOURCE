/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hzo
 */
public class jjc
extends ier
implements hyy.d {
    public jjc(String string, String string2) {
        super(string, string2);
    }

    @Override
    public void initialize() {
        super.initialize();
        jjc.cyJ().cHx().a(hyy.a.lrO, this);
    }

    public void cleanUp() {
        super.cleanUp();
        jjc.cyJ().cHx().b(hyy.a.lrO);
    }

    public fjw dHZ() {
        return hso.cxK().cxP().cyI().dHZ();
    }

    @Override
    public boolean cGG() {
        return false;
    }

    @Override
    public boolean cGH() {
        return true;
    }

    @Override
    public void b(hyy.b b2, int n) {
        hzo hzo2 = (hzo)hso.cxK().cxP().cxO();
        switch (b2) {
            case luP: {
                hso.cxK().cxP().cyI().close();
                break;
            }
            case luQ: {
                hzo2.cHD().hide();
                hzo2.cHC().show();
                break;
            }
            case luR: {
                hzo2.cHC().hide();
                hzo2.cHD().show();
                break;
            }
            case luS: {
                hzo2.cHD().hide();
                hzo2.cHC().dHR();
                break;
            }
            case luT: {
                hzo2.cHD().hide();
                hzo2.cHC().dHS();
                break;
            }
            case luU: {
                hzo2.cHD().hide();
                hzo2.cHC().dHT();
            }
        }
    }

    @Override
    public boolean b(hyy.b b2) {
        switch (b2) {
            case luP: 
            case luQ: 
            case luR: 
            case luV: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void a(hyy.b b2, jnx jnx2) {
    }
}

