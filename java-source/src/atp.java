/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class atp
extends btk
implements bto {
    private Map<ldv, a> bYS = lcn.emw();
    private Map<ldv, a> bYT = lcn.emw();
    private Map<ldv, a> bYU = lcn.emw();
    private Map<String, a> bYV = lcn.emw();
    private Map<String, a> bYW = lcn.emw();
    private Map<String, a> bYX = lcn.emw();

    @Override
    public void doTick(ldz ldz2) {
    }

    @Override
    public void initialize() {
        super.initialize();
        if (this.getGUID().ib() == 102) {
            // empty if block
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 17413: {
                this.a((ebp)dxq2);
                break;
            }
            case 17418: {
                this.a((ebf)dxq2);
                break;
            }
            case 17420: {
                this.a((ebh)dxq2);
                break;
            }
            case 17426: {
                this.a((ebj)dxq2);
                break;
            }
            case 17435: {
                this.a((ebb)dxq2);
                break;
            }
            case 17439: {
                this.a((ebd)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(ebd ebd2) {
        ebe ebe2 = (ebe)this.MessageDelegator.h(17440, this.getGUID(), ebd2.aO());
        this.MessageDelegator.b(ebd2, ebe2);
        if (ebd2.ikT == null) {
            this.MessageDelegator.F(ebe2);
            return;
        }
        if (ebd2.ikT.length == 0) {
            this.MessageDelegator.F(ebe2);
            return;
        }
        ArrayList<String> arrayList = lcn.emv();
        for (String string : ebd2.ikT) {
            if (!this.dU(string)) continue;
            arrayList.add(string);
        }
        String[] stringArray = new String[arrayList.size()];
        arrayList.toArray(stringArray);
        ebe2.ikU = stringArray;
        this.MessageDelegator.F(ebe2);
    }

    private boolean dU(String string) {
        if (this.bYV.containsKey(string)) {
            return true;
        }
        if (this.bYW.containsKey(string)) {
            return true;
        }
        return this.bYX.containsKey(string);
    }

    private void a(ebb ebb2) {
        ebc ebc2 = (ebc)this.MessageDelegator.h(17436, this.getGUID(), ebb2.aO());
        this.MessageDelegator.b(ebb2, ebc2);
        ebc2.ikR = this.bYS.size();
        ebc2.ikS = this.bYT.size() + this.bYU.size();
        this.getMessageDelegator().F(ebc2);
    }

    private void a(ebp ebp2) {
        switch (ebp2.ry()) {
            case 2: {
                if (ebp2.bFm()) {
                    assert (ebp2.acn() != null);
                    assert (ebp2.rz() != null);
                    assert (ebp2.aIG() != null);
                    a a2 = new a(this);
                    a2.azY = ebp2.azY;
                    a2.azF = ebp2.azF;
                    a2.bYY = ebp2.bYY;
                    a2.bYZ = ebp2.bYZ;
                    a2.azE = ebp2.azE;
                    if (ebp2.bFn() == cug.fnm) {
                        this.bYU.put(ebp2.acn(), a2);
                        this.bYX.put(ebp2.rz(), a2);
                        break;
                    }
                    this.bYT.put(ebp2.acn(), a2);
                    this.bYW.put(ebp2.rz(), a2);
                    break;
                }
                boolean bl = false;
                a a3 = this.bYT.remove(ebp2.acn());
                if (a3 == null) {
                    a3 = this.bYU.remove(ebp2.acn());
                    if (a3 == null) {
                        assert (false);
                        return;
                    }
                    bl = true;
                }
                String string = a3.azF;
                assert (string != null);
                if (bl) {
                    if (this.bYX.remove(string) != null) break;
                    assert (false);
                    return;
                }
                if (this.bYW.remove(string) != null) break;
                assert (false);
                return;
            }
            case 1: {
                if (ebp2.bFm()) {
                    assert (ebp2.acn() != null);
                    assert (ebp2.rz() != null);
                    assert (ebp2.aIG() != null);
                    a a4 = new a(this);
                    a4.azY = ebp2.azY;
                    a4.azF = ebp2.azF;
                    a4.bYY = ebp2.bYY;
                    a4.bYZ = ebp2.bYZ;
                    a4.azE = ebp2.azE;
                    this.bYS.put(ebp2.acn(), a4);
                    this.bYV.put(ebp2.rz(), a4);
                    break;
                }
                a a5 = this.bYS.remove(ebp2.acn());
                if (a5 == null) {
                    assert (false);
                    return;
                }
                if (this.bYV.remove(a5.azF) != null) break;
                assert (false);
                return;
            }
            case 3: {
                assert (false);
                break;
            }
            default: {
                assert (false) : "Unknown bindstonetype";
                break;
            }
        }
    }

    private void a(ebf ebf2) {
        ebg ebg2 = (ebg)this.MessageDelegator.h(17419, this.getGUID(), ebf2.aO());
        a a2 = this.bYV.get(ebf2.azF);
        if (a2 == null && (a2 = this.bYW.get(ebf2.azF)) == null) {
            a2 = this.bYX.get(ebf2.azF);
        }
        if (a2 == null) {
            ebg2.azY = null;
            ebg2.bYY = null;
        } else {
            ebg2.azY = a2.azY;
            ebg2.bYY = a2.bYY;
        }
        this.MessageDelegator.b(ebf2, ebg2);
        this.MessageDelegator.F(ebg2);
    }

    private void a(ebj ebj2) {
        ebk ebk2 = (ebk)this.MessageDelegator.h(17427, this.getGUID(), ebj2.aO());
        ebk2.azF = ebj2.azF;
        a a2 = this.bYV.get(ebj2.azF);
        if (a2 == null && (a2 = this.bYW.get(ebj2.azF)) == null) {
            a2 = this.bYX.get(ebj2.azF);
        }
        ebk2.Position = a2 == null ? null : a2.bYY;
        this.MessageDelegator.F(ebk2);
    }

    private void a(ebh ebh2) {
        Iterator<a> iterator;
        ldv[] ldvArray = null;
        ljq[] ljqArray = null;
        int n = 0;
        if (ebh2.ikV) {
            ldvArray = new ldv[this.bYT.size() + this.bYS.size()];
            ljqArray = new ljq[ldvArray.length];
            for (a a2 : this.bYT.values()) {
                ldvArray[n] = a2.azY;
                ljqArray[n] = a2.bYY;
                ++n;
            }
            for (a a2 : this.bYS.values()) {
                ldvArray[n] = a2.azY;
                ljqArray[n] = a2.bYY;
                ++n;
            }
            if (n == 0) {
                ldvArray = new ldv[this.bYU.size()];
                ljqArray = new ljq[ldvArray.length];
                for (a a2 : this.bYU.values()) {
                    ldvArray[n] = a2.azY;
                    ljqArray[n] = a2.bYY;
                    ++n;
                }
            }
        } else {
            switch (ebh2.azE) {
                case 2: {
                    ldvArray = new ldv[this.bYT.size()];
                    ljqArray = new ljq[this.bYT.size()];
                    for (a a3 : this.bYT.values()) {
                        ldvArray[n] = a3.azY;
                        ljqArray[n] = a3.bYY;
                        ++n;
                    }
                    break;
                }
                case 1: {
                    iterator = lcn.emv();
                    ArrayList<ljq> arrayList = lcn.emv();
                    for (a a4 : this.bYS.values()) {
                        if (!cce.aB(a4.bYZ, ebh2.ikK)) continue;
                        iterator.add((a)((Object)a4.azY));
                        arrayList.add(a4.bYY);
                    }
                    ldvArray = new ldv[iterator.size()];
                    ldvArray = iterator.toArray((ldv[])ldvArray);
                    ljqArray = new ljq[arrayList.size()];
                    ljqArray = arrayList.toArray(ljqArray);
                    break;
                }
                default: {
                    if ($assertionsDisabled) break;
                    throw new AssertionError((Object)"UNknown bindstonetype!");
                }
            }
        }
        iterator = (ebi)this.MessageDelegator.h(17421, this.getGUID(), ebh2.aO());
        this.MessageDelegator.b(ebh2, (dxq)((Object)iterator));
        ((ebi)((Object)iterator)).ikW = ldvArray;
        ((ebi)((Object)iterator)).ikX = ljqArray;
        ((ebi)((Object)iterator)).azE = ebh2.azE;
        this.MessageDelegator.F((dxq)((Object)iterator));
    }
}

