/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class kef {
    public kee fK(int n, int n2) {
        kee kee2 = null;
        lef lef2 = leg.eqd();
        switch (n) {
            case 2: {
                kee2 = new ked();
                break;
            }
            case 27: {
                kee2 = new kfp();
                break;
            }
            case 28: {
                kee2 = new kfo();
                break;
            }
            case 29: {
                kee2 = new kfq();
                break;
            }
            case 30: {
                kee2 = new kfj();
                break;
            }
            case 7: {
                kee2 = new kfg();
                break;
            }
            case 14: {
                kee2 = new kff();
                break;
            }
            case 11: {
                kee2 = new kfr();
                break;
            }
            case 12: {
                kee2 = new kfl();
                break;
            }
            case 50: {
                kee2 = new kfm();
                break;
            }
            case 51: {
                kee2 = new kfn();
                break;
            }
            case 116: {
                kee2 = new keo();
                break;
            }
            case 123: {
                kee2 = new keh();
                break;
            }
            case 117: {
                kee2 = new kel();
                break;
            }
            case 118: {
                kee2 = new kem();
                break;
            }
            case 217: {
                kee2 = new kev();
                break;
            }
            case 219: {
                kee2 = new kew();
                break;
            }
            case 216: {
                kee2 = new key();
                break;
            }
            case 218: {
                kee2 = new keq();
                break;
            }
            case 21: {
                kee2 = new kfd();
                break;
            }
            case 22: {
                kee2 = new kfk();
                break;
            }
            case 301: {
                kee2 = new kfs();
                break;
            }
            case 34: {
                kee2 = new kfe();
                break;
            }
            case 125: {
                kee2 = new ken();
                break;
            }
            case 220: {
                kee2 = new kex();
                break;
            }
            case 38: {
                kee2 = new kfh();
                break;
            }
            case 39: {
                kee2 = new kfi();
                break;
            }
            case 126: {
                kee2 = new kek();
                break;
            }
            case 221: {
                kee2 = new keu();
                break;
            }
            case 127: {
                kee2 = new kep();
                break;
            }
            case 222: {
                kee2 = new kez();
                break;
            }
            case 129: {
                kee2 = new kej();
                break;
            }
            case 224: {
                kee2 = new kes();
                break;
            }
            case 225: {
                kee2 = new ket();
                break;
            }
            default: {
                lfn.b(5, "SFModulePipeFactory", "requestPipe() Invalid pipetype provided: " + n);
                assert (false);
                return null;
            }
        }
        kee2.setDirection(n2);
        kee2.e(lef2);
        return kee2;
    }

    public boolean a(kdz kdz2, int n) {
        if (n == 2) {
            return true;
        }
        Integer n2 = new Integer(n);
        Integer n3 = new Integer(kdz2.getLevel());
        Map<Integer, List<Integer>> map = kdz2.dVD();
        List<Integer> list = map.get(n3);
        if (list == null) {
            lfn.b(5, "SFModulePipeFactory", "moduleAcceptPipe() : Module [" + kdz2.getName() + "] has no List for this module lvl!");
            return false;
        }
        Integer n4 = null;
        boolean bl = false;
        for (int i = 0; i < list.size(); ++i) {
            n4 = list.get(i);
            if (!n4.equals(n2)) continue;
            bl = true;
        }
        if (!bl) {
            lfn.b(5, "SFModulePipeFactory", "moduleAcceptPipe() : InModule [" + kdz2.getName() + "] does not accept PipeType [" + n2 + "] at lvl [" + n3 + "] !");
            return false;
        }
        return true;
    }

    public void e(kee kee2) {
    }
}

