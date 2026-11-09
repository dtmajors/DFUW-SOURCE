/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class fx {
    private static final String TC = "SFConfigManagerServer";
    private final ha hF;
    private Map<String, Map<String, mhk>> TD = lcn.emw();

    public fx(ha ha2) {
        this.hF = ha2;
    }

    private void a(esg esg2) {
        String string = esg2.bLj();
        Map<String, mhk> map = this.TD.get(string);
        assert (map != null);
        esh esh2 = (esh)this.hF.getMessageDelegator().h(30724, this.hF.getGUID(), esg2.aO());
        esh2.kq(string);
        esh2.q(map != null && !map.isEmpty() ? map.keySet().toArray(new String[map.size()]) : null);
        esh2.c(map != null && !map.isEmpty() ? map.values().toArray(new mhk[map.size()]) : null);
        this.hF.getMessageDelegator().F(esh2);
    }

    private void a(esi esi2) {
        esj esj2 = (esj)this.hF.getMessageDelegator().h(30722, this.hF.getGUID(), esi2.aO());
        esj2.r(!this.TD.isEmpty() ? this.TD.keySet().toArray(new String[this.TD.size()]) : null);
        this.hF.getMessageDelegator().F(esj2);
    }

    private void a(esm esm2) {
        String[] stringArray = esm2.iBn;
        String[] stringArray2 = esm2.hlz;
        mhk[] mhkArray = esm2.iBm;
        if (stringArray.length != stringArray2.length || stringArray2.length != mhkArray.length) {
            lfn.b(5, TC, "handleConfigUpdateRequestMessage() Invalid Args : " + stringArray + " : " + stringArray2 + " : " + mhkArray);
            assert (false);
            return;
        }
        boolean bl = false;
        block5: for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            String string2 = stringArray2[i];
            mhk mhk2 = mhkArray[i];
            switch (esm2.ija) {
                case 3: {
                    Map<String, mhk> map = this.TD.remove(string);
                    bl = map != null;
                    continue block5;
                }
                case 2: {
                    Map<String, mhk> map = this.TD.get(string);
                    if (map == null) continue block5;
                    Object object = map.remove(string2);
                    boolean bl2 = bl = object != null;
                    if (!bl || !map.isEmpty()) continue block5;
                    this.TD.remove(string);
                    continue block5;
                }
                case 1: {
                    Object object;
                    Map<String, mhk> map = this.TD.get(string);
                    if (map == null) {
                        map = lcn.emw();
                        this.TD.put(string, map);
                    } else {
                        object = mhk2.eyY();
                        if (object == mhs.STRING) {
                            mhr mhr2 = (mhr)mhk2;
                            if (mhr2.Value == null || mhr2.Value.isEmpty()) {
                                mhk mhk3 = map.remove(string2);
                                continue block5;
                            }
                        }
                    }
                    map.put(string2, mhk2);
                    bl = true;
                    continue block5;
                }
                default: {
                    lfn.b(5, TC, "handleConfigUpdateRequestMessage() Unhandled update type : " + esm2.ija);
                    assert (false);
                    continue block5;
                }
            }
        }
        if (esm2.iBr) {
            esn esn2 = (esn)this.hF.getMessageDelegator().h(30726, this.hF.getGUID(), esm2.aO());
            this.hF.getMessageDelegator().b(esm2, esn2);
            esn2.iBs = bl;
            this.hF.getMessageDelegator().E(esn2);
        }
    }

    public void t(List<ne> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ne ne2 : list) {
            String string = ne2.aDa;
            String string2 = ne2.aDb;
            mhk mhk2 = ne2.aDc;
            Map<String, mhk> map = this.TD.get(string);
            if (map == null) {
                map = lcn.emw();
                this.TD.put(string, map);
            }
            map.put(string2, mhk2);
        }
    }

    public List<ne> hq() {
        if (this.TD == null || this.TD.isEmpty()) {
            return null;
        }
        ArrayList<ne> arrayList = lcn.abH(this.TD.size());
        for (Map.Entry<String, Map<String, mhk>> entry : this.TD.entrySet()) {
            String string = entry.getKey();
            Map<String, mhk> map = entry.getValue();
            assert (map != null);
            if (map == null) continue;
            for (Map.Entry<String, mhk> entry2 : map.entrySet()) {
                String string2 = entry2.getKey();
                mhk mhk2 = entry2.getValue();
                ne ne2 = new ne();
                ne2.SN = this.hF.getGUID().enw();
                ne2.aDa = string;
                ne2.aDb = string2;
                ne2.aDc = mhk2;
                arrayList.add(ne2);
            }
        }
        return arrayList;
    }

    public void a(esk esk2) {
        int n = esk2.bEz();
        switch (n) {
            case 30723: {
                this.a((esg)esk2);
                break;
            }
            case 30721: {
                this.a((esi)esk2);
                break;
            }
            case 30725: {
                this.a((esm)esk2);
            }
        }
    }
}

