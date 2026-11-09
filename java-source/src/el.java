/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cdb
 *  ep
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class el {
    protected Map<Integer, ej> DS = lcn.emw();
    private Map<Integer, List<dqi>> DT = lcn.emw();
    protected List<alu> DU = null;
    protected final cbx DV;
    private Set DW = lcn.emx();
    private static les DX = lea.enT();
    public float DY = 0.0f;

    public el(cbx cbx2) {
        this.DV = cbx2;
    }

    public final cbx fp() {
        return this.DV;
    }

    public final void b(el el2) {
        for (ej ej2 : this.DS.values()) {
            el2.b(ej2.fm());
        }
    }

    public void doTick(ldz ldz2) {
    }

    public final boolean isInitialized() {
        return this.DV.isInitialized();
    }

    public abstract boolean isServerObject();

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 8193: {
                this.a((gzo)dxq2);
                return;
            }
            case 8194: {
                this.a((gzr)dxq2);
                return;
            }
            case 8198: {
                this.a((gzv)dxq2);
                return;
            }
            case 10759: {
                this.a((eaq)dxq2);
                return;
            }
        }
        lfn.b(5, "SFAttributeManager", "receiveMessage() Unhandled message received: " + dxq2.getClass().getName());
        assert (false);
    }

    public final boolean fq() {
        ez ez2 = this.an(352);
        if (!ez2.fV()) {
            return false;
        }
        ez2 = this.an(384);
        if (!ez2.fV()) {
            return false;
        }
        ez2 = this.an(400);
        return ez2.fV();
    }

    private void a(eaq eaq2) {
        ear ear2 = (ear)this.DV.getMessageDelegator().h(10760, this.DV.getGUID(), eaq2.aO());
        ear2.aqs = eaq2.aqs;
        ej ej2 = this.ae(eaq2.bnM);
        if (ej2 != null) {
            ear2.bhp = ej2.fn();
        }
        this.DV.getMessageDelegator().F(ear2);
    }

    public final void b(ej ej2) {
        if (ej2 == null) {
            lfn.b(5, "SFAttributeManager", "addAttribute() Attribute is null.");
            return;
        }
        if (this.ad(ej2.getType())) {
            lfn.b(5, "SFAttributeManager", "addAttribute() Attribute '" + ej2.getName() + "' already exists for object " + this.DV.getGUID());
            return;
        }
        assert (this.DV != null);
        assert (ej2.fi() == null);
        ej2.a(this);
        this.DS.put(ej2.getType(), ej2);
        if (ej2.getDataType() == 5) {
            fe fe2 = (fe)ej2;
            fe2.a(this.DV);
        } else if (ej2 instanceof ey) {
            ((ey)ej2).initialize();
        }
        this.c(ej2);
    }

    public final boolean ad(int n) {
        return this.DS.containsKey(n);
    }

    public final ej ae(int n) {
        return this.DS.get(n);
    }

    public final ej b(Integer n) {
        return this.DS.get(n);
    }

    public final Map<Integer, ej> getAttributeMap() {
        return this.DS;
    }

    public final void removeAttribute(int n) {
        assert (this.isInitialized());
        if (n <= 0) {
            lfn.b(5, "SFAttributeManager", "removeAttribute() AttributeType is invalid.");
            return;
        }
        ej ej2 = this.DS.remove(n);
        if (ej2 == null) {
            lfn.b(5, "SFAttributeManager", "removeAttribute() Attribute '" + ep.aM((int)n) + "' was not found in object " + this.DV.getGUID());
            return;
        }
        ej2.a((el)null);
        this.d(ej2);
    }

    protected void c(ej ej2) {
        assert (ej2 != null);
        if (this.DT.isEmpty()) {
            return;
        }
        ArrayList<dqi> arrayList = null;
        ArrayList<ldv> arrayList2 = null;
        if (ej2 instanceof es) {
            for (List<dqi> list : this.DT.values()) {
                int n = list.size();
                for (int i = 0; i < n; ++i) {
                    dqi dqi2 = list.get(i);
                    if (!dqi2.bth() || arrayList2 != null && arrayList2.contains(dqi2.getGUID())) continue;
                    if (arrayList == null || arrayList2 == null) {
                        arrayList = lcn.abH(1);
                        arrayList2 = lcn.abH(1);
                    }
                    this.a(dqi2, ej2);
                    arrayList.add(dqi2);
                    arrayList2.add(dqi2.getGUID());
                }
            }
        } else if (ep.aY((int)ej2.getType())) {
            for (List<dqi> list : this.DT.values()) {
                int n = list.size();
                for (int i = 0; i < n; ++i) {
                    dqi dqi3 = list.get(i);
                    if (!dqi3.bti() || arrayList2 != null && arrayList2.contains(dqi3.getGUID())) continue;
                    if (arrayList == null || arrayList2 == null) {
                        arrayList = lcn.abH(1);
                        arrayList2 = lcn.abH(1);
                    }
                    this.a(dqi3, ej2);
                    arrayList.add(dqi3);
                    arrayList2.add(dqi3.getGUID());
                }
            }
        } else if (ep.aZ((int)ej2.getType())) {
            for (List<dqi> list : this.DT.values()) {
                int n = list.size();
                for (int i = 0; i < n; ++i) {
                    dqi dqi4 = list.get(i);
                    if (!dqi4.btk() || arrayList2 != null && arrayList2.contains(dqi4.getGUID())) continue;
                    if (arrayList == null || arrayList2 == null) {
                        arrayList = lcn.abH(1);
                        arrayList2 = lcn.abH(1);
                    }
                    this.a(dqi4, ej2);
                    arrayList.add(dqi4);
                    arrayList2.add(dqi4.getGUID());
                }
            }
        } else if (ej2.getType() == 1360) {
            for (List<dqi> list : this.DT.values()) {
                int n = list.size();
                for (int i = 0; i < n; ++i) {
                    dqi dqi5 = list.get(i);
                    if (!dqi5.btj() || arrayList2 != null && arrayList2.contains(dqi5.getGUID())) continue;
                    if (arrayList == null || arrayList2 == null) {
                        arrayList = lcn.abH(1);
                        arrayList2 = lcn.abH(1);
                    }
                    this.a(dqi5, ej2);
                    arrayList.add(dqi5);
                    arrayList2.add(dqi5.getGUID());
                }
            }
        } else if (ej2.getType() == 13216) {
            for (List<dqi> list : this.DT.values()) {
                int n = list.size();
                for (int i = 0; i < n; ++i) {
                    dqi dqi6 = list.get(i);
                    if (!dqi6.Bm(13216) || arrayList2 != null && arrayList2.contains(dqi6.getGUID())) continue;
                    if (arrayList == null || arrayList2 == null) {
                        arrayList = lcn.abH(1);
                        arrayList2 = lcn.abH(1);
                    }
                    this.a(dqi6, ej2);
                    arrayList.add(dqi6);
                    arrayList2.add(dqi6.getGUID());
                }
            }
        }
        if (arrayList != null) {
            this.DT.put(ej2.getType(), arrayList);
        }
    }

    protected void d(ej ej2) {
        assert (ej2 != null);
        if (this.DT.isEmpty()) {
            return;
        }
        List<dqi> list = this.DT.remove(ej2.getType());
        if (list != null) {
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                dqi dqi2 = list.get(i);
                this.b(dqi2, ej2);
            }
        }
    }

    protected abstract void e(ej var1);

    protected abstract void a(eq var1, boolean var2);

    protected abstract void a(et var1, float var2);

    protected abstract void a(ew var1, int var2);

    public final eq af(int n) {
        if (n <= 0) {
            lfn.b(5, "SFAttributeManager", "getBooleanAttribute() AttributeType is invalid.");
            return null;
        }
        if (ep.aL((int)n) != 0) {
            lfn.b(5, "SFAttributeManager", "getBooleanAttribute() Attribute '" + ep.aM((int)n) + "' is not a booleanattribute.");
            return null;
        }
        return (eq)this.ae(n);
    }

    public final boolean ag(int n) {
        eq eq2 = this.af(n);
        if (eq2 == null) {
            return false;
        }
        return eq2.getBooleanValue();
    }

    public final void f(int n, boolean bl) {
        eq eq2 = this.af(n);
        if (eq2 == null) {
            lfn.b(5, "SFAttributeManager", "setBooleanAttributeValue() Attribute '" + ep.aM((int)n) + "' was not found.");
            return;
        }
        eq2.x(bl);
    }

    public final et ah(int n) {
        if (n <= 0) {
            lfn.b(5, "SFAttributeManager", "getFloatAttribute() AttributeType is invalid.");
            return null;
        }
        if (ep.aL((int)n) != 2) {
            lfn.b(5, "SFAttributeManager", "getFloatAttribute() Attribute '" + ep.aM((int)n) + "' is not a floatattribute.");
            return null;
        }
        return (et)this.ae(n);
    }

    public final float ai(int n) {
        int n2 = ep.k((int)n, (int)2);
        return this.al(n2);
    }

    public final float aj(int n) {
        int n2 = ep.k((int)n, (int)4);
        return this.al(n2);
    }

    public final float ak(int n) {
        int n2 = ep.k((int)n, (int)1);
        return this.al(n2);
    }

    public final float al(int n) {
        et et2 = this.ah(n);
        if (et2 == null) {
            return 0.0f;
        }
        return et2.fN();
    }

    public final float am(int n) {
        et et2 = this.ah(n);
        if (et2 == null) {
            return 0.0f;
        }
        return et2.fO();
    }

    public final ez an(int n) {
        if (n <= 0) {
            lfn.b(5, "SFAttributeManager", "getFloatAttribute() AttributeType is invalid.");
            return null;
        }
        if (ep.aL((int)n) != 2) {
            lfn.b(5, "SFAttributeManager", "getFloatAttribute() Attribute '" + ep.aM((int)n) + "' is not a floatattribute.");
            return null;
        }
        if (!ep.bc((int)n).Ed) {
            lfn.b(5, "SFAttributeManager", "getFloatAttribute() Attribute '" + ep.aM((int)n) + "' does not have related types.");
            return null;
        }
        return (ez)this.ae(n);
    }

    public final void a(int n, float f) {
        et et2 = this.ah(n);
        if (et2 == null) {
            lfn.b(5, "SFAttributeManager", "modifyFloatAttributeValue() Attribute '" + ep.aM((int)n) + "' was not found in object " + this.DV.getGUID());
            return;
        }
        et2.n(f);
    }

    public final void b(int n, float f) {
        assert (this.isInitialized());
        assert (this.isServerObject());
        if (n <= 0) {
            lfn.b(5, "SFAttributeManager", "resetFloatAttribute() AttributeTypes array is null.");
            return;
        }
        if (f <= 0.0f || f > 1.0f) {
            lfn.b(5, "SFAttributeManager", "resetFloatAttribute() PercentageOfMaxValue is invalid.");
            return;
        }
        et et2 = this.ah(n);
        if (et2 == null) {
            lfn.b(5, "SFAttributeManager", "resetFloatAttribute() Attribute '" + ep.aM((int)n) + "' was not found.");
            return;
        }
        if (et2 instanceof ex) {
            ((ex)et2).p(f);
        } else {
            et2.reset();
        }
    }

    public final void c(int n, float f) {
        et et2 = this.ah(n);
        if (et2 == null) {
            lfn.b(5, "SFAttributeManager", "setFloatAttributeValue() Attribute '" + ep.aM((int)n) + "' was not found.");
            return;
        }
        et2.o(f);
    }

    public final ew ao(int n) {
        if (n <= 0) {
            lfn.b(5, "SFAttributeManager", "getIntegerAttribute() AttributeType is invalid.");
            return null;
        }
        if (ep.aL((int)n) != 3) {
            lfn.b(5, "SFAttributeManager", "getIntegerAttribute() Attribute '" + ep.aM((int)n) + "' is not an integerattribute.");
            return null;
        }
        return (ew)this.ae(n);
    }

    public final int ap(int n) {
        ew ew2 = this.ao(n);
        if (ew2 == null) {
            return 0;
        }
        return ew2.fQ();
    }

    public final void h(int n, int n2) {
        ew ew2 = this.ao(n);
        if (ew2 == null) {
            lfn.b(5, "SFAttributeManager", "modifyIntegerAttributeValue() Attribute '" + ep.aM((int)n) + "' was not found in object " + this.DV.getGUID());
            return;
        }
        ew2.bh(n2);
    }

    public final void a(int n, String string) {
        ff ff2 = this.aq(n);
        if (ff2 == null) {
            lfn.b(5, "SFAttributeManager", "modifyStringAttributeValue() Attribute '" + ep.aM((int)n) + "' was not found in object " + this.DV.getGUID());
            return;
        }
        ff2.setValue(string);
    }

    public final void i(int n, int n2) {
        ew ew2 = this.ao(n);
        if (ew2 == null) {
            lfn.b(5, "SFAttributeManager", "setIntegerAttributeValue() Attribute '" + ep.aM((int)n) + "' was not found.");
            return;
        }
        ew2.bi(n2);
    }

    public final ff aq(int n) {
        if (n <= 0) {
            lfn.b(5, "SFAttributeManager", "getStringAttribute() AttributeType is invalid.");
            return null;
        }
        if (ep.aL((int)n) != 7) {
            lfn.b(5, "SFAttributeManager", "getStringAttribute() Attribute '" + ep.aM((int)n) + "' is not a stringattribute.");
            return null;
        }
        return (ff)this.ae(n);
    }

    public final String ar(int n) {
        ff ff2 = this.aq(n);
        if (ff2 == null) {
            return null;
        }
        return ff2.getStringValue();
    }

    public final void b(int n, String string) {
        ff ff2 = this.aq(n);
        if (ff2 == null) {
            return;
        }
        ff2.av(string == null ? "" : string);
    }

    public final fg as(int n) {
        if (n <= 0) {
            lfn.b(5, "SFAttributeManager", "getStringInstanceAttribute() : AttributeType is invalid!!!");
            return null;
        }
        if (ep.aL((int)n) != 8) {
            lfn.b(5, "SFAttributeManager", "getStringInstanceAttribute() : Attribute '" + ep.aM((int)n) + "' is not an SFStringInstanceAttribute!!!");
            return null;
        }
        return (fg)this.ae(n);
    }

    public final loz at(int n) {
        fg fg2 = this.as(n);
        if (fg2 == null) {
            return null;
        }
        return fg2.gx();
    }

    public final void a(int n, loz loz2) {
        fg fg2 = this.as(n);
        if (fg2 == null) {
            return;
        }
        fg2.b(loz2);
    }

    public final er au(int n) {
        if (n <= 0) {
            lfn.b(5, "SFAttributeManager", "getDoubleAttribute() : AttributeType is invalid!!!");
            return null;
        }
        if (ep.aL((int)n) != 9) {
            lfn.b(5, "SFAttributeManager", "getDoubleAttribute() : Attribute '" + ep.aM((int)n) + "' is not an SFDoubleAttribute!!!");
            return null;
        }
        return (er)this.ae(n);
    }

    public final double av(int n) {
        er er2 = this.au(n);
        if (er2 == null) {
            return 0.0;
        }
        return er2.fC();
    }

    public final void a(int n, double d) {
        er er2 = this.au(n);
        if (er2 == null) {
            return;
        }
        er2.d(d);
    }

    public final ev aw(int n) {
        if (n <= 0) {
            lfn.b(5, "SFAttributeManager", "getGUIDAttribute() : AttributeType is invalid!!!");
            return null;
        }
        if (ep.aL((int)n) != 4) {
            lfn.b(5, "SFAttributeManager", "getGUIDAttribute() : Attribute '" + ep.aM((int)n) + "' is not an SFGUIDAttribute!!!");
            return null;
        }
        return (ev)this.ae(n);
    }

    public final ldv ax(int n) {
        ev ev2 = this.aw(n);
        if (ev2 == null) {
            return null;
        }
        return ev2.fP();
    }

    public final void b(int n, ldv ldv2) {
        ev ev2 = this.aw(n);
        if (ev2 == null) {
            return;
        }
        ev2.F(ldv2);
    }

    public final fh ay(int n) {
        if (n <= 0) {
            lfn.b(5, "SFAttributeManager", "getVector3Attribute() : AttributeType is invalid!!!");
            return null;
        }
        if (ep.aL((int)n) != 6) {
            lfn.b(5, "SFAttributeManager", "getVector3Attribute() : Attribute '" + ep.aM((int)n) + "' is not an SFVector3Attribute!!!");
            return null;
        }
        return (fh)this.ae(n);
    }

    public final ljq az(int n) {
        fh fh2 = this.ay(n);
        if (fh2 == null) {
            return null;
        }
        return fh2.gy();
    }

    public final void a(int n, ljq ljq2) {
        fh fh2 = this.ay(n);
        if (fh2 == null) {
            return;
        }
        fh2.L(ljq2);
    }

    public final void a(int n, ej ej2) {
        assert (n > 0);
        assert (ej2 != null);
        if (this.DT.isEmpty()) {
            return;
        }
        if (n == 3) {
            ArrayList<ldv> arrayList = lcn.emv();
            for (List<dqi> list : this.DT.values()) {
                for (dqi dqi2 : list) {
                    if (arrayList.contains(dqi2.btf())) continue;
                    dqi2.btl();
                    arrayList.add(dqi2.btf());
                }
            }
            return;
        }
        List<dqi> list = this.DT.get(ej2.getType());
        if (list != null) {
            int n2 = list.size();
            for (int i = 0; i < n2; ++i) {
                dqi dqi3 = list.get(i);
                if (!dqi3.ad(ej2.getType())) {
                    lfn.b(5, "SFAttributeManager", "issueWiretapEvent() Wiretap " + dqi3.getGUID() + " does not listen to attribute '" + ej2.getName() + "'");
                    continue;
                }
                dqi3.e(n, ej2.fn());
            }
        }
    }

    private void a(dqi dqi2, ej ej2) {
        assert (dqi2 != null);
        assert (dqi2.bth() || dqi2.bti() || dqi2.btj() || dqi2.btk());
        assert (ej2 != null);
        dqi2.Bn(ej2.getType());
        dqi2.i(new ej[]{ej2.fn()});
    }

    private void b(dqi dqi2, ej ej2) {
        assert (dqi2 != null);
        assert (dqi2.bth() || dqi2.bti() || dqi2.btj() || dqi2.btk());
        assert (ej2 != null);
        dqi2.Bq(ej2.getType());
        dqi2.Bp(ej2.getType());
        if (dqi2.btg().length == 0) {
            dqi2.btm();
        }
    }

    private int[] a(int[] nArray, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n;
        assert (nArray != null);
        assert (nArray.length > 0);
        Set<Integer> set = lcn.emx();
        int n2 = nArray.length;
        for (n = 0; n < n2; ++n) {
            set.add(nArray[n]);
        }
        n = 0;
        if (bl) {
            if (this.ad(1440)) {
                set.add(1440);
                n = 1;
            }
            if (this.ad(1456)) {
                set.add(1456);
                n = 1;
            }
            if (this.ad(1568)) {
                set.add(1568);
                n = 1;
            }
            if (this.ad(1584)) {
                set.add(1584);
                n = 1;
            }
            if (this.ad(1600)) {
                set.add(1600);
                n = 1;
            }
            if (this.ad(1616)) {
                set.add(1616);
                n = 1;
            }
        }
        if (bl2) {
            for (ej object : this.DS.values()) {
                if (object.getDataType() != 2 || !ep.aE((int)object.getType()) || !ep.aY((int)object.getType())) continue;
                set.add(object.getType());
                n = 1;
            }
        }
        if (bl4) {
            for (ej ej2 : this.DS.values()) {
                if (ej2.getDataType() != 2 || !ep.aE((int)ej2.getType()) || !ep.aZ((int)ej2.getType())) continue;
                set.add(ej2.getType());
                n = 1;
            }
        }
        if (bl3 && this.ad(1360)) {
            set.add(1360);
            n = 1;
        }
        if (n != 0) {
            nArray = new int[set.size()];
            n2 = 0;
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                nArray[n2] = (Integer)iterator.next();
                ++n2;
            }
        }
        return nArray;
    }

    private dqi B(ldv ldv2) {
        assert (ldv2 != null);
        for (List<dqi> list : this.DT.values()) {
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                dqi dqi2 = list.get(i);
                if (!dqi2.getGUID().equals(ldv2)) continue;
                return dqi2;
            }
        }
        return null;
    }

    private void a(gzo gzo2) {
        if (gzo2.jvG == null) {
            lfn.b(5, "SFAttributeManager", "handleWiretapAttachMessage() Wiretap is null.");
            return;
        }
        if (this.DV.getMessageDelegator() == null) {
            lfn.b(5, "SFAttributeManager", "handleWiretapAttachMessage() AttributeOwner's MessageDelegator is null.");
            return;
        }
        dqi dqi2 = gzo2.jvG;
        if (dqi2.btg() == null) {
            if (dqi2.bth() || dqi2.bti() || dqi2.btk()) {
                lfn.b(5, "SFAttributeManager", "handleWiretapAttachMessage() Unhandled condition when attaching a wiretap.");
            }
            lfn.b(5, "SFAttributeManager", "handleWiretapAttachMessage() AttributeTypes array is null.");
            return;
        }
        int[] nArray = dqi2.btg();
        dqi2.setMessageDelegator(this.DV.getMessageDelegator());
        dqi2.hZ(this.DV.getGUID());
        if (dqi2.bth() || dqi2.bti() || dqi2.btj() || dqi2.btk()) {
            if (dqi2.btj() && this.isServerObject()) {
                lfn.b(5, "SFAttributeManager", "handleWiretapAttachMessage() One can only listen to the maker attribute on the client.");
                return;
            }
            nArray = this.a(nArray, dqi2.bth(), dqi2.bti(), dqi2.btj(), dqi2.btk());
            dqi2.M(nArray);
        }
        ArrayList<ej> arrayList = lcn.emv();
        boolean bl = false;
        int n = nArray.length;
        for (int i = 0; i < n; ++i) {
            ej ej2 = this.ae(nArray[i]);
            if (ej2 == null) {
                dqi2.Bo(nArray[i]);
                continue;
            }
            Integer n2 = new Integer(nArray[i]);
            List<dqi> list = this.DT.get(n2);
            if (list == null) {
                list = lcn.abH(1);
                this.DT.put(n2, list);
            }
            list.add(dqi2);
            arrayList.add(ej2.fn());
            bl = true;
        }
        if (bl) {
            // empty if block
        }
        dqi2.i(arrayList.toArray(new ej[arrayList.size()]));
    }

    private void a(gzr gzr2) {
        ldv ldv2 = gzr2.bWM;
        if (this.DT.isEmpty()) {
            return;
        }
        dqi dqi2 = null;
        int n = 0;
        int n2 = 0;
        Iterator<List<dqi>> iterator = this.DT.values().iterator();
        while (iterator.hasNext()) {
            List<dqi> list = iterator.next();
            Iterator<dqi> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                dqi2 = iterator2.next();
                if (!dqi2.getGUID().equals(ldv2)) continue;
                if (n == 0) {
                    n = dqi2.btg().length;
                }
                iterator2.remove();
                ++n2;
            }
            if (!list.isEmpty()) continue;
            iterator.remove();
        }
        if (n2 > 0) {
            if (dqi2 != null) {
                dqi2.btm();
            }
        } else {
            lfn.b(5, "SFAttributeManager", "handleWiretapDetachMessage() Could not find wiretap " + ldv2);
        }
    }

    private void a(gzv gzv2) {
        if (gzv2.bWM == null) {
            lfn.b(5, "SFAttributeManager", "handleWiretapUpdateMessage() WiretapGUID is null.");
            return;
        }
        dqi dqi2 = this.B(gzv2.bWM);
        if (dqi2 == null) {
            lfn.b(5, "SFAttributeManager", "handleWiretapUpdateMessage() Wiretap " + gzv2.bWM + " was not found.");
            lfn.b(5, "SFAttributeManager", "handleWiretapUpdateMessage() GUID=" + this.DV.getGUID() + " ResourceType='" + this.DV.pa() + "'");
            return;
        }
        switch (gzv2.ija) {
            case 1: {
                ej ej2 = this.ae(gzv2.bnM);
                if (ej2 == null) {
                    dqi2.Bo(gzv2.bnM);
                    return;
                }
                dqi2.Bn(ej2.getType());
                Integer n = new Integer(ej2.getType());
                List<dqi> list = this.DT.get(n);
                if (list == null) {
                    list = lcn.abH(1);
                    this.DT.put(n, list);
                }
                list.add(dqi2);
                dqi2.i(new ej[]{ej2.fn()});
                break;
            }
            case 2: {
                ej ej3 = this.ae(gzv2.bnM);
                if (ej3 == null) {
                    return;
                }
                dqi2.Bq(ej3.getType());
                Integer n = new Integer(ej3.getType());
                List<dqi> list = this.DT.get(n);
                if (list == null) {
                    lfn.b(5, "SFAttributeManager", "handleWiretapUpdateMessage(REMOVE) Wiretap " + dqi2.getGUID() + " isn't attached to attribute '" + ej3.getName() + "'");
                    return;
                }
                list.remove(dqi2);
                if (list.isEmpty()) {
                    this.DT.remove(n);
                }
                if (dqi2.btg().length != 0) break;
                dqi2.btm();
                break;
            }
            default: {
                lfn.b(5, "SFAttributeManager", "handleWiretapUpdateMessage() Invalid updatetype provided: " + gzv2.ija);
                lfn.b(5, "SFAttributeManager", "handleWiretapUpdateMessage() FromGUID=" + gzv2.aO() + " WiretapGUID=" + gzv2.bWM);
                return;
            }
        }
    }

    public final ej[] a(int n, int[] nArray) {
        int n2;
        int n3;
        if (n <= 0) {
            lfn.b(5, "SFAttributeManager", "getAttributes() ObjectInfoType is invalid.");
            return null;
        }
        if ((n & 2) > 0 && (nArray == null || nArray.length == 0)) {
            lfn.b(5, "SFAttributeManager", "getAttributes() AttributeTypes is null or empty.");
            return null;
        }
        ArrayList<ej> arrayList = lcn.abH(5);
        ej[] ejArray = null;
        if ((n & 4) > 0) {
            if (this.DS.isEmpty()) {
                return null;
            }
            ejArray = this.DS.values().toArray(new ej[this.DS.size()]);
            int n4 = ejArray.length;
            for (int i = 0; i < n4; ++i) {
                ej ej2 = ejArray[i].fn();
                if (ejArray[i] instanceof et) {
                    ((et)ej2).o(((et)ejArray[i]).fO());
                } else if (ejArray[i] instanceof ey) {
                    ((eq)ej2).x(((ey)ejArray[i]).gg());
                }
                ejArray[i] = ej2;
            }
            return ejArray;
        }
        if ((n & 1) > 0) {
            this.s(arrayList);
            if ((n & 2) == 0) {
                return arrayList.toArray(new ej[arrayList.size()]);
            }
        }
        if ((n & 2) > 0) {
            ejArray = arrayList.isEmpty() ? new ej[nArray.length] : new ej[nArray.length + arrayList.size()];
            n3 = nArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                ej ej3 = this.ae(nArray[n2]);
                ejArray[n2] = ej3 != null ? ej3.fn() : null;
            }
        }
        if (!arrayList.isEmpty()) {
            assert (ejArray != null);
            n2 = nArray.length;
            int n5 = arrayList.size();
            for (n3 = 0; n3 < n5; ++n3) {
                ejArray[n2] = (ej)arrayList.get(n3);
            }
        }
        return ejArray;
    }

    public final float aA(int n) {
        if (n <= 0) {
            lfn.b(5, "SFAttributeManager", "getTotalProtectionAgainstEffect() EffectType is invalid.");
            return 0.0f;
        }
        ldi ldi2 = (ldi)DX.acv(n);
        if (ldi2 == null) {
            lfn.b(5, "SFAttributeManager", "getTotalProtectionAgainstEffect() No effect listitem mapped to effecttype " + n);
            return 0.0f;
        }
        this.DW.clear();
        float f = 0.0f;
        while (ldi2 != null) {
            int n2 = ldi2.enk();
            if (!this.DW.contains(n2)) {
                float f2 = this.aB(n2);
                if (f2 != 0.0f) {
                    f += f2;
                }
                this.DW.add(n2);
            }
            ldi2 = (ldi)DX.i(ldi2);
            if (!DX.eqq().equals(ldi2)) continue;
            break;
        }
        if (this.DV instanceof cev) {
            f += cer.a((cev)this.DV, n);
        }
        float f3 = this.fp().UB() ? this.al(12112) : 1.0f;
        return f *= f3;
    }

    private void s(List<ej> list) {
        if (this.DS.isEmpty()) {
            return;
        }
        for (ej ej2 : this.DS.values()) {
            if (ej2.getDataType() != 2 || !ep.aY((int)ej2.getType())) continue;
            list.add(ej2.fn());
        }
    }

    private float aB(int n) {
        cdb cdb2;
        float f;
        assert (n > 0);
        float f2 = 0.0f;
        if (this.ad(n)) {
            f2 += this.al(n);
        }
        if (this.DV instanceof cdb && (f = (cdb2 = (cdb)this.DV).aJC().asf().lV(n)) != 0.0f) {
            f2 += f;
        }
        return f2;
    }

    public static int j(int n, int n2) {
        int n3 = (int)(Math.pow(1.04, n) * Math.pow(1.015, n2));
        return n3 * 15;
    }
}

