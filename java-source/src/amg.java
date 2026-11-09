/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  brg
 *  dqk
 */
public class amg {
    public amf gK(int n) {
        Object object = null;
        switch (n) {
            case 3: {
                object = new dld();
                break;
            }
            case 5: 
            case 24: {
                object = new dqk();
                break;
            }
            case 6: {
                object = new amf();
                break;
            }
            case 8: {
                object = new dru();
                break;
            }
            case 9: {
                object = new drw();
                break;
            }
            case 10: {
                object = new drr();
                break;
            }
            case 13: {
                assert (false);
                break;
            }
            case 25: {
                object = new dle();
                break;
            }
            case 26: {
                object = new dqj();
                break;
            }
            case 33: {
                object = new drk();
                break;
            }
            case 35: {
                object = new drm();
                break;
            }
            case 36: {
                object = new drx();
                break;
            }
            case 37: {
                object = new dul();
                break;
            }
            case 38: {
                object = new bdn();
                break;
            }
            case 47: {
                object = new dry();
                break;
            }
            case 50: {
                object = new drb();
                break;
            }
            case 51: {
                object = new drc();
                break;
            }
            case 54: {
                object = new dqs();
                break;
            }
            case 55: {
                object = new brg();
                break;
            }
            case 63: {
                object = new brl();
                ((amf)object).setObjectType(63);
                break;
            }
            case 65: {
                object = new bpv();
                break;
            }
            case 66: {
                object = new bpo();
                break;
            }
            case 67: {
                object = new bps();
                break;
            }
            case 127: {
                object = new bpp();
                break;
            }
            case 72: {
                object = new dl();
                break;
            }
            case 74: {
                object = new drv();
                break;
            }
            case 69: {
                object = new drs();
                break;
            }
            case 46: {
                object = new dsm();
                break;
            }
            case 156: {
                object = new drl();
                break;
            }
            default: {
                lfn.b(5, "SFObjectFactory", "createObject() Unable to create SFObject. Invalid ObjectType provided: " + n);
            }
        }
        return object;
    }
}

