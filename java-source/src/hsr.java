/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections.MultiMap;

public class hsr
extends btk
implements bto,
hsn {
    private static final double lcP = 20.0;
    private ldv Ri = null;
    private Map<String, hsw> lcQ = lcn.emw();
    private lid<a> lcR = new lid();
    private Map<String, a> lcS = lcn.emw();
    private lid<b> lcT = new lid();
    private Map<lfs<String, String>, b> lcU = lcn.emw();
    private MultiMap lcV = lcn.emB();
    private int aqs = 0;
    private Map<String, Map<String, Object>> lcW = lcn.emw();
    private Map<String, esh> lcX = lcn.emw();
    private List<esh> lcY = lcn.emv();

    public hsw a(hst hst2) {
        hsw hsw2 = this.lcQ.get(hst2.cyg());
        if (hsw2 == null) {
            hsw2 = new hsw(hst2.cyh(), hst2.cyg());
            this.lcQ.put(hsw2.Identifier, hsw2);
            hsw2.bCJ();
            esh esh2 = this.lcX.remove(hsw2.Identifier);
            if (esh2 != null) {
                this.lcY.add(esh2);
            }
        }
        hsw2.c(hst2);
        return hsw2;
    }

    public void b(hst hst2) {
        hsw hsw2 = this.lcQ.get(hst2.cyg());
        if (hsw2 == null) {
            assert (false);
            return;
        }
        hsw2.d(hst2);
    }

    void a(hsw hsw2) {
        a a2 = this.lcS.get(hsw2.Identifier);
        if (a2 != null) {
            return;
        }
        a2 = new a(this, null);
        a2.aSN = this.MessageDelegator.arc().rgz + 5.0;
        a2.lcZ = hsw2.Identifier;
        this.lcS.put(hsw2.Identifier, a2);
        this.lcR.a(a2.aSN, a2);
    }

    void a(hsw hsw2, hsv hsv2) {
        Map<String, Object> map = this.lcW.get(hsw2.Identifier);
        if (map == null) {
            map = lcn.emw();
            this.lcW.put(hsw2.Identifier, map);
        }
        map.put(hsv2.Name, hsv2.Gt());
    }

    @Override
    public void doTick(ldz ldz2) {
        Object object;
        Object object2;
        if (!this.lcY.isEmpty()) {
            object2 = this.lcY.iterator();
            while (object2.hasNext()) {
                object = object2.next();
                this.b((esh)object);
            }
            this.lcY.clear();
        }
        while ((object2 = this.lcR.eg(this.MessageDelegator.arc().rgz)) != null) {
            this.lcS.remove(((a)object2).lcZ);
            object = this.lcQ.get(((a)object2).lcZ);
            if (object == null) {
                assert (false);
                continue;
            }
            ((hsw)object).cyl();
        }
        if (this.Ri != null) {
            ArrayList<Object> arrayList = null;
            while ((object = this.lcT.eg(this.MessageDelegator.arc().rgz)) != null) {
                this.lcU.remove(new lfs<String, String>(((b)object).lcZ, ((b)object).ldb));
                if (arrayList == null) {
                    arrayList = lcn.emv();
                }
                arrayList.add(object);
            }
            this.bf(arrayList);
        }
    }

    public void cye() {
        a a2;
        while ((a2 = this.lcR.eg(this.MessageDelegator.arc().rgz + 5.0)) != null) {
            this.lcS.remove(a2.lcZ);
            hsw hsw2 = this.lcQ.get(a2.lcZ);
            if (hsw2 == null) {
                assert (false);
                continue;
            }
            hsw2.cyl();
        }
        this.cyf();
    }

    public void cyf() {
        if (this.lcT.isEmpty()) {
            return;
        }
        if (this.Ri != null) {
            b b2;
            ArrayList<b> arrayList = null;
            while ((b2 = this.lcT.eg(this.MessageDelegator.arc().rgz + 20.0)) != null) {
                this.lcU.remove(new lfs<String, String>(b2.lcZ, b2.ldb));
                if (arrayList == null) {
                    arrayList = lcn.emv();
                }
                arrayList.add(b2);
            }
            this.bf(arrayList);
        }
    }

    private void a(esj esj2) {
        String[] stringArray = esj2.bLl();
        if (stringArray == null || stringArray.length == 0) {
            return;
        }
        ArrayList<String> arrayList = lcn.bx(stringArray);
        for (String object : arrayList) {
            this.nf(object);
        }
        for (Map.Entry entry : this.lcQ.entrySet()) {
            String string = (String)entry.getKey();
            if (arrayList.contains(string)) continue;
            hsw hsw2 = (hsw)entry.getValue();
            hsw2.cyj();
        }
    }

    public void nf(String string) {
        esg esg2 = (esg)this.MessageDelegator.h(30723, this.getGUID(), this.Ri);
        esg2.kq(string);
        this.MessageDelegator.E(esg2);
    }

    private void a(esh esh2) {
        hsw hsw2 = this.lcQ.get(esh2.bLj());
        if (hsw2 == null) {
            this.lcX.put(esh2.bLj(), esh2);
            return;
        }
        this.b(esh2);
    }

    private void b(esh esh2) {
        String string = esh2.bLj();
        String[] stringArray = esh2.getNames();
        mhk[] mhkArray = esh2.bLk();
        hsw hsw2 = this.lcQ.get(string);
        if (stringArray == null || mhkArray == null || stringArray.length != mhkArray.length) {
            assert (false);
            return;
        }
        block6: for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            mhk mhk2 = mhkArray[i];
            switch (mhk2.eyY()) {
                case BOOLEAN: {
                    hsw2.a(string2, ((mhl)mhk2).Pp, hsu.ldh);
                    continue block6;
                }
                case FLOAT: {
                    hsw2.a(string2, ((mhn)mhk2).Pz, hsu.ldh);
                    continue block6;
                }
                case INTEGER: {
                    hsw2.a(string2, ((mho)mhk2).PC, hsu.ldh);
                    continue block6;
                }
                case STRING: {
                    hsw2.a(string2, ((mhr)mhk2).Value, hsu.ldh);
                    continue block6;
                }
                default: {
                    assert (false) : "Unhandled value type : " + (Object)((Object)mhk2.eyY());
                    continue block6;
                }
            }
        }
        hsw2.cyi();
    }

    private void a(esn esn2) {
        boolean bl = esn2.iBs;
        int n = esn2.aqs;
        Collection collection = (Collection)this.lcV.get(n);
        if (collection == null) {
            assert (false) : "There are not window owners for Server update response with tag : " + n;
            return;
        }
        for (String string : collection) {
            hsw hsw2 = this.lcQ.get(string);
            if (hsw2 == null) {
                assert (false) : "There is no Config value set for window identifier : " + string;
                continue;
            }
            hsw2.oI(esn2.iBs);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 30724: {
                this.a((esh)dxq2);
                break;
            }
            case 30722: {
                this.a((esj)dxq2);
                break;
            }
            case 30726: {
                this.a((esn)dxq2);
                break;
            }
            default: {
                assert (false) : "Unhandled message type : " + n;
                super.receiveMessage(dxq2);
            }
        }
    }

    void b(hsw hsw2, hsv hsv2) {
        lfs<String, String> lfs2 = new lfs<String, String>(hsw2.Identifier, hsv2.Name);
        b b2 = this.lcU.get(lfs2);
        if (b2 != null) {
            this.lcT.b(b2.aSN, b2);
            b2.byr = hsv2.Gt();
            b2.aSN = this.MessageDelegator.arc().rgz + 20.0;
            this.lcT.a(b2.aSN, b2);
        } else {
            b2 = new b(this, null);
            b2.aSN = this.MessageDelegator.arc().rgz + 20.0;
            b2.lcZ = hsw2.Identifier;
            b2.ldb = hsv2.Name;
            b2.byr = hsv2.Gt();
            this.lcT.a(b2.aSN, b2);
            this.lcU.put(lfs2, b2);
        }
    }

    private void bf(List<b> list) {
        if (list == null) {
            return;
        }
        esm esm2 = (esm)this.MessageDelegator.h(30725, this.getGUID(), this.Ri);
        esm2.ija = 1;
        esm2.iBr = true;
        esm2.aqs = this.aqs;
        esm2.iBn = new String[list.size()];
        esm2.hlz = new String[list.size()];
        esm2.iBm = new mhk[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            b b2 = list.get(i);
            esm2.iBn[i] = b2.lcZ;
            esm2.hlz[i] = b2.ldb;
            esm2.iBm[i] = b2.byr;
            this.lcV.put((Object)this.aqs, b2.lcZ);
        }
        this.MessageDelegator.E(esm2);
        ++this.aqs;
    }

    @Override
    public void a(jnz jnz2, jnz jnz3) {
    }

    @Override
    public void a(joa joa2) {
    }

    @Override
    public void b(joa joa2) {
    }

    @Override
    public void cB(int n) {
    }

    @Override
    public void X(boolean bl) {
    }

    @Override
    public boolean op() {
        return true;
    }

    @Override
    public void oo() {
        if (this.Ri == null) {
            this.Ri = hso.cxK().bAn().Tr;
            esi esi2 = (esi)this.MessageDelegator.h(30721, this.getGUID(), this.Ri);
            this.MessageDelegator.E(esi2);
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        hso.cxK().a(this);
    }

    @Override
    public void cleanUp() {
        hso.cxK().b(this);
        super.cleanUp();
    }
}

