/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class ber
extends btk {
    private final boolean bC = false;
    private a ddu = a.ddX;
    public static final int ddv = -1;
    public static final int ddw = 50400;
    public static final int ddx = 60;
    public static final int ddy = 3600;
    public static final int ddz = 86400;
    public static final int ddA = 1440;
    public static final int ddB = 0;
    public static final int ddC = 86400;
    public static final int ddD = 1296;
    public static final int ddE = 28;
    public static final int ddF = 259;
    public static final int ddG = 360;
    public static final int ddH = 60;
    public static final int ddI = 2;
    public static final int ddJ = 1800;
    private TreeSet<bfc> ddK = lcn.emH();
    private TreeSet<bfc> ddL = lcn.emH();
    private bfc[] ddM;
    private boolean ddN = false;
    private Map<bfb, dqv> ddO = new HashMap<bfb, dqv>();
    private List<bev> ddP = lcn.emv();
    private boolean ddQ = false;
    private int bcC;
    private double ddR;
    private double ddS;
    private boolean fE = true;
    private boolean ddT;
    public static int ddU = 20;
    private boolean ddV;
    private int ddW = -1;

    public int anj() {
        return this.ddW;
    }

    public void kq(int n) {
        this.ddW = n;
    }

    dqv a(bfb bfb2) {
        return this.ddO.get((Object)bfb2);
    }

    public void kr(int n) {
        if (this.fE) {
            if (!this.ddV) {
                this.ks(n);
            }
            this.fE = false;
        }
        this.kv(n);
        this.ku(n);
    }

    public void ks(int n) {
        this.ank();
        List<bfc> list = this.kx(n);
        for (bfc bfc2 : list) {
            assert (bfc2 != null);
            Object object = this.a(bfc2.anG(), bfc2.AJ());
            if (object == null) continue;
            bev bev2 = new bev();
            bev2.b(bfc2.anG());
            bev2.kB(bfc2.AJ());
            int n2 = 0;
            int n3 = 0;
            if (bfc2.anV() > 0) {
                n3 += bfc2.anV();
            }
            if (n2 > 86400 && (n2 -= 86400) > 86400) {
                String string = "StartTime is invalid = " + n2;
                assert (false) : string;
                return;
            }
            if (n3 > 86400 && (n3 -= 86400) > 86400) {
                String string = "EndTime is invalid = " + n3;
                assert (false) : string;
                return;
            }
            bev2.kC(n2);
            bev2.kA(n3);
            bev2.r(object);
            bev2.s(bfc2.getValue());
            bev2.q(bfc2.getValue());
            this.ddP.add(bev2);
        }
    }

    public void kt(int n) {
        this.ddL.clear();
        this.ddP.clear();
        this.ks(n);
    }

    private void ank() {
        boolean bl = false;
        if (this.ddV) {
            return;
        }
        dqv dqv2 = (dqv)this.MessageDelegator.d(lcr.qDQ);
        this.a(dqv2);
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDP);
        this.a(dqv2);
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDK);
        this.a(dqv2);
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDL);
        this.a(dqv2);
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDN);
        this.a(dqv2);
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDM);
        this.a(dqv2);
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDR);
        this.a(dqv2);
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDZ);
        this.a(dqv2);
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDO);
        this.a(dqv2);
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDS);
        this.a(dqv2);
        dqv2 = (dqv)this.MessageDelegator.d(lcr.qDT);
        this.a(dqv2);
        this.ddV = true;
    }

    private void ku(int n) {
        Iterator<bev> iterator = this.ddP.iterator();
        while (iterator.hasNext()) {
            float f2;
            bev bev2 = iterator.next();
            if (!bev2.anI()) {
                iterator.remove();
                bev2.s(bev2.anC());
                this.a(bev2);
                continue;
            }
            if (n > bev2.anB()) {
                iterator.remove();
                bev2.s(bev2.anC());
                this.a(bev2);
                continue;
            }
            if (bev2.anF().equals(bev2.anC())) {
                iterator.remove();
                bev2.s(bev2.anC());
                this.a(bev2);
                continue;
            }
            if (bev2.anF() instanceof Boolean) {
                bev2.s(bev2.anC());
                this.a(bev2);
                iterator.remove();
                continue;
            }
            if (bev2.anF() instanceof String) {
                bev2.s(bev2.anC());
                this.a(bev2);
                iterator.remove();
                continue;
            }
            float f3 = bev2.anB() - bev2.anE();
            float f4 = n - bev2.anE();
            if (f3 < 0.0f) assert ((f3 += 86400.0f) >= 0.0f) : "total time is still messed up.";
            if (f4 < 0.0f) {
                f4 = 86400 - n;
                assert (f4 >= 0.0f) : "total time is still messed up.";
            }
            if ((f2 = f4 / f3) < 0.0f) {
                // empty if block
            }
            if (f2 < 0.0f || f2 > 1.0f) {
                iterator.remove();
                continue;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            assert (f2 >= 0.0f && f2 <= 1.0f) : "Lerp value invalid = " + f2;
            Object object = this.a(bev2.anF(), bev2.anC(), f2);
            bev2.s(object);
            this.a(bev2);
        }
    }

    public Object a(Object object, Object object2, float f2) {
        if (object instanceof lcq) {
            lcq lcq2 = lcq.a((lcq)object, (lcq)object2, f2);
            return lcq2;
        }
        if (object instanceof Float) {
            return new Float(lew.o(((Float)object).floatValue(), ((Float)object2).floatValue(), f2));
        }
        if (object instanceof ljq) {
            return ljq.e((ljq)object, (ljq)object2, f2);
        }
        if (object instanceof Boolean) {
            if ((double)f2 < 0.5) {
                return object;
            }
            return object2;
        }
        return null;
    }

    private void kv(int n) {
        List<bfc> list = this.kw(n);
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            int n3;
            bfc bfc2 = list.get(i);
            assert (bfc2 != null);
            Object object = this.a(bfc2.anG(), bfc2.AJ());
            if (object == null) continue;
            bev bev2 = new bev();
            bev2.b(bfc2.anG());
            bev2.kB(bfc2.AJ());
            int n4 = n3 = bfc2.anE();
            if (bfc2.anV() > 0) {
                n4 += bfc2.anV();
            }
            if (n3 > 86400 && (n3 -= 86400) > 86400) {
                String string = "StartTime is invalid = " + n3;
                assert (false) : string;
                return;
            }
            if (n4 > 86400 && (n4 -= 86400) > 86400) {
                String string = "EndTime is invalid = " + n4;
                assert (false) : string;
                return;
            }
            bev2.kC(n3);
            bev2.kA(n4);
            bev2.r(object);
            bev2.q(bfc2.getValue());
            bev2.dc(bfc2.anI());
            this.ddP.add(bev2);
        }
    }

    public void a(bev bev2) {
        drb drb2;
        if (!this.ddQ) {
            return;
        }
        dqv dqv2 = this.ddO.get((Object)bev2.anG());
        if (dqv2 == null) {
            return;
        }
        if (bev2.anG() == bfb.dfV && bev2.anD() == 1 && ((Boolean)bev2.anC()).booleanValue()) {
            drb drb3 = (drb)this.ddO.get((Object)bfb.dfP);
            if (drb3 == null) {
                lfn.b(5, "SFEnvironment", "setEnvironmentProperty() Did not find atmosphere. Not Good.");
                assert (false);
                return;
            }
        } else if (bev2.anG() == bfb.dfW && bev2.anD() == 1 && ((Boolean)bev2.anC()).booleanValue() && (drb2 = (drb)this.ddO.get((Object)bfb.dfP)) == null) {
            lfn.b(5, "SFEnvironment", "setEnvironmentProperty() Did not find atmosphere. Not Good.");
            assert (false);
            return;
        }
        dqv2.a(bev2.anD(), bev2.anJ());
        dqv2.buA();
    }

    private Object a(bfb bfb2, int n) {
        dqv dqv2 = this.ddO.get((Object)bfb2);
        if (dqv2 == null) {
            return null;
        }
        Object object = dqv2.gG(n & 0xFF);
        if (object == null) {
            return null;
        }
        return object;
    }

    public List<bfc> kw(int n) {
        if (this.ddL.isEmpty()) {
            if (!this.ddN) {
                return lcn.emv();
            }
            this.ddL = (TreeSet)this.ddK.clone();
            this.ddN = false;
        }
        Iterator<bfc> iterator = this.ddL.iterator();
        bfc bfc2 = null;
        Map<Integer, bfc> map = lcn.emw();
        while (iterator.hasNext() && n >= (bfc2 = iterator.next()).anE()) {
            map.put(bfc2.anH(), bfc2);
            iterator.remove();
        }
        ArrayList<bfc> arrayList = lcn.emv();
        for (bfc bfc3 : map.values()) {
            arrayList.add(bfc3);
        }
        return arrayList;
    }

    private List<bfc> kx(int n) {
        List<Object> list = lcn.emv();
        Map<Integer, bfc> map = lcn.emw();
        for (bfc bfc2 : this.ddK) {
            map.put(bfc2.anH(), bfc2);
        }
        this.ddL = (TreeSet)this.ddK.clone();
        list = this.kw(n);
        for (bfc bfc2 : list) {
            map.put(bfc2.anH(), bfc2);
        }
        list.clear();
        for (bfc bfc3 : map.values()) {
            list.add(bfc3);
        }
        return list;
    }

    @Override
    public void cleanUp() {
        this.anl();
        super.cleanUp();
    }

    public void anl() {
        this.ddL.clear();
        this.ddP.clear();
    }

    @Override
    public void addRelation(dul dul2) {
        if (dul2.Bq().equals(this.GUID) && !dul2.Br().equals(this.GUID)) {
            amf amf2 = this.MessageDelegator.d(dul2.Br());
            if (amf2 != null && amf2 instanceof dqv) {
                this.a((dqv)amf2);
            } else {
                lfn.b(4, this.getClass().getSimpleName(), "addRelation() : Object-Type not SFEnvironmentObjectInterface! Object= " + amf2);
            }
        } else {
            String string = "Cannot add Relation for Object [" + this.GUID + "]. StartPoint doesnt have matching GUID, or Endpoint has matching GUID. The Relation is: " + dul2 + ".";
            lfn.b(5, "SFLogicObject", "addRelation() : " + string);
            assert (false) : string;
        }
    }

    private void a(dqv dqv2) {
        if (dqv2 == null) {
            lfn.b(4, this.getClass().getSimpleName(), "addEnvironmentObject() : ++++ EnvObject is null! +++");
            return;
        }
        this.ddO.put(dqv2.buz(), dqv2);
    }

    public void a(bfc bfc2) {
        this.ddK.add(bfc2);
    }

    public int anm() {
        return this.ddK.size();
    }

    public void ann() {
        this.ddL.clear();
    }

    public void ano() {
        this.ddP.clear();
    }

    public int xz() {
        return this.bcC;
    }

    public void ky(int n) {
        this.bcC = n;
    }

    public boolean anp() {
        return this.ddQ;
    }

    public void cZ(boolean bl) {
        this.ddQ = bl;
    }

    public List<bev> anq() {
        return this.ddP;
    }

    public Map<Integer, bev> anr() {
        Map<Integer, bev> map = lcn.emw();
        for (bev bev2 : this.ddP) {
            map.put(bev2.anH(), bev2);
        }
        return map;
    }

    public void da(boolean bl) {
        this.ddN = bl;
    }

    public boolean ans() {
        return this.ddT;
    }

    public void db(boolean bl) {
        this.ddT = bl;
    }

    public a ant() {
        return this.ddu;
    }

    public void a(a a2) {
        this.ddu = a2;
    }

    public void kz(int n) {
        a[] aArray = a.values();
        this.ddu = n < 0 || n >= aArray.length ? a.ddX : aArray[n];
    }

    public bfc[] anu() {
        return this.ddM;
    }

    public void a(bfc[] bfcArray) {
        this.ddM = bfcArray;
    }

    public TreeSet<bfc> anv() {
        return this.ddK;
    }
}

