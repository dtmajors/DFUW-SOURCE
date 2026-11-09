/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class dum {
    private Map<Integer, List<dul>> hev = lcn.emw();

    private void initialize() {
    }

    public dul j(int n, ldv ldv2, ldv ldv3) {
        dul dul2 = null;
        switch (n) {
            case 768: {
                dul2 = new dul();
                dul2.setRelationType(n);
                break;
            }
            case 1025: {
                dul2 = new dul();
                dul2.setRelationType(n);
                break;
            }
            case 1026: {
                dul2 = new dul();
                dul2.setRelationType(n);
                break;
            }
            case 1027: {
                dul2 = new dul();
                dul2.setRelationType(n);
                break;
            }
            case 1028: {
                dul2 = new dul();
                dul2.setRelationType(n);
                break;
            }
            case 1029: {
                dul2 = new dul();
                dul2.setRelationType(n);
                break;
            }
            case 1030: {
                dul2 = new dul();
                dul2.setRelationType(n);
                break;
            }
            case 1031: {
                dul2 = new dul();
                dul2.setRelationType(n);
                break;
            }
            case 1032: {
                dul2 = new dul();
                dul2.setRelationType(n);
                break;
            }
            case 1033: {
                dul2 = new dul();
                dul2.setRelationType(n);
                break;
            }
            case 1034: {
                dul2 = new dul();
                dul2.setRelationType(n);
                break;
            }
            case 1035: {
                dul2 = new dul();
                dul2.setRelationType(n);
                break;
            }
            case 1036: {
                dul2 = new dul();
                dul2.setRelationType(n);
                break;
            }
            default: {
                lfn.b(5, "SFRelationFactory", "createRelationObject() Invalid RelationType provided: " + n);
                return null;
            }
        }
        dul2.cM(ldv2);
        dul2.cN(ldv3);
        return dul2;
    }

    private void c(dul dul2) {
        dul2.reset();
        if (this.hev.containsKey(new Integer(dul2.getRelationType()))) {
            List<dul> list = this.hev.get(dul2.getRelationType());
            list.add(dul2);
        } else {
            ArrayList<dul> arrayList = lcn.emv();
            arrayList.add(dul2);
            this.hev.put(dul2.getRelationType(), arrayList);
        }
    }
}

