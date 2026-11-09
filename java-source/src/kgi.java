/*
 * Decompiled with CFR.
 */
public class kgi
extends lgu {
    public kgh WO(int n) {
        ldv ldv2;
        kgh kgh2 = null;
        switch (n) {
            case 1: {
                kgh2 = new kgf();
                break;
            }
            case 2: {
                kgh2 = new kgm();
                break;
            }
            case 3: {
                kgh2 = new kfy();
                break;
            }
            case 4: {
                kgh2 = new kgd();
                break;
            }
            case 5: {
                kgh2 = new kgp();
                break;
            }
            case 6: {
                kgh2 = new kgc();
                break;
            }
            case 7: {
                kgh2 = new kfz();
                break;
            }
            case 8: {
                kgh2 = new kgq();
                break;
            }
            case 9: {
                kgh2 = new kgn();
                break;
            }
            case 10: {
                kgh2 = new kgg();
                break;
            }
            case 11: {
                kgh2 = new kgo();
                break;
            }
            case 12: {
                kgh2 = new kfv();
                break;
            }
            case 13: {
                kgh2 = new kgk();
                break;
            }
            case 14: {
                kgh2 = new kgb();
                break;
            }
            case 15: {
                kgh2 = new kge();
                break;
            }
            case 16: {
                kgh2 = new kft();
                break;
            }
            case 17: {
                kgh2 = new kfx();
                break;
            }
            case 18: {
                kgh2 = new kgl();
                break;
            }
            case 19: {
                kgh2 = new kga();
                break;
            }
            case 20: {
                kgh2 = new kfu();
                break;
            }
            default: {
                lfn.b(5, this.getClass().getName(), "createRenderRequest() : Unknown RenderRequestType [" + n + "] !");
                assert (false);
                return null;
            }
        }
        kgh2.ev = ldv2 = this.erH();
        return kgh2;
    }
}

