/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.ArrayList;
import java.util.Map;

class ine
extends inf {
    private imr mkM;
    private int mlN;
    private int mlO;
    private boolean mlP;
    private Map<Integer, Integer> mlQ;
    private izz mlR;
    private iwv mlS;

    public ine(cwz cwz2, imr imr2) {
        super(cwz2);
        this.mkM = imr2;
        this.dmO().W(ipx.c(new ipf[0]));
        this.dmO().W(ipx.d(new ist(isf.mwN, 12, 0xABABAB, lxb.tmS.bD(new Object[0]))));
        this.dmO().W(ipx.a(4, 1, new ipf[0]));
        this.dmO().W(ipx.d(ipx.a(64, 20, this.dgc())));
        this.dmO().W(ipx.a(4, 1, new ipf[0]));
        this.dmO().W(ipx.d(this.dgd()));
        this.dmO().W(ipx.a(4, 1, new ipf[0]));
        this.dmO().W(ipx.d(ipx.a(20, 20, this.dge())));
        this.dmO().W(ipx.a(4, 1, new ipf[0]));
        this.dmO().W(ipx.a(8, 48, new ipf[0]));
    }

    public int dfZ() {
        return this.mlN;
    }

    public int dga() {
        return this.mlO;
    }

    public boolean vA() {
        return this.mlN > 0 && this.mlO == this.mlN;
    }

    public void a(int n, boolean bl, Map<Integer, Integer> map) {
        this.mlO = n;
        this.mlP = bl;
        this.mlQ = map;
        if (bl) {
            this.mlS.qP("/dfdata/texture/gui/j2f/common/icons/icon_ok.png");
        } else {
            this.mlS.qP("/dfdata/texture/gui/j2f/common/icons/icon_error.png");
        }
    }

    @Override
    public hyn dd(int n, int n2) {
        hyn hyn2 = super.dd(n, n2);
        if (hyn2 != null) {
            return hyn2;
        }
        if (this.mlN == 0) {
            lgw lgw2 = (lgw)lea.enW().acv(this.dgf().az());
            return new iac(new hwo(lgw2), hso.cxK().cxP().bpb(), hso.cxK().cxP().bpc(), false, true, false);
        }
        return null;
    }

    public void dgb() {
    }

    private ipf dgc() {
        this.mlR = new izz(this){
            final /* synthetic */ ine mlT;
            {
                this.mlT = ine2;
            }

            public void od(String string) {
                super.od(string);
                ine.a(this.mlT, string);
            }
        };
        this.mlR.dqb().a(isf.mwN, 12);
        this.mlR.dqb().b(isr.dqa(), 0, false);
        this.mlR.st(true);
        this.mlR.dqb().setText("0");
        return this.mlR;
    }

    private ipf dgd() {
        return new iwi(this){
            final /* synthetic */ ine mlT;
            {
                this.mlT = ine2;
            }

            public void cLq() {
                ine.a(this.mlT).setText("0");
                ine.a(this.mlT, "0");
            }
        };
    }

    private ipf dge() {
        this.mlS = new iwv(this, null){
            final /* synthetic */ ine mlT;
            {
                this.mlT = ine2;
                super(string);
            }

            public hyn dd(int n, int n2) {
                if (ine.b(this.mlT)) {
                    return iae.oJ(lxb.tmU.bD(new Object[0]).exA().toUpperCase());
                }
                if (ine.c(this.mlT) == null) {
                    return null;
                }
                String string = isg.b(isf.mwM, 12, 0xFFFFFF, lxb.tmV.bD(new Object[0]).exA().toUpperCase());
                ArrayList<String> arrayList = lcn.emv();
                for (Map.Entry<K, V> entry : ine.c(this.mlT).entrySet()) {
                    int n3 = (Integer)entry.getKey();
                    int n4 = (Integer)entry.getValue();
                    String string2 = isg.b(isf.mwM, 11, 0xFFFFFF, lvm.sXa.bD(n3).exA().toUpperCase());
                    arrayList.add(string2);
                    String string3 = isg.a(ish.mwS, isg.b(isf.mwM, 11, 0xFFFF00, "" + n4));
                    arrayList.add(string3);
                }
                String[] stringArray = arrayList.toArray(new String[arrayList.size()]);
                return iae.b(iae.a(string, null, ine.c(this.mlT).size(), 2, 0, 0, stringArray));
            }
        };
        return this.mlS;
    }

    private void qG(String string) {
        boolean bl = string == null || string.isEmpty();
        int n = Integer.valueOf(string);
        if (n == 0) {
            bl = true;
        }
        if (bl) {
            this.mlN = 0;
            this.mlO = 0;
        } else {
            this.mlN = Integer.valueOf(string);
            this.mlO = 0;
        }
        this.mlR.setText(string);
        this.mlS.qP(null);
        this.dgb();
    }

    static /* synthetic */ void a(ine ine2, String string) {
        ine2.qG(string);
    }

    static /* synthetic */ izz a(ine ine2) {
        return ine2.mlR;
    }

    static /* synthetic */ boolean b(ine ine2) {
        return ine2.mlP;
    }

    static /* synthetic */ Map c(ine ine2) {
        return ine2.mlQ;
    }
}

