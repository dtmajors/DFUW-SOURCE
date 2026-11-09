/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cex
 *  ha
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class wz
extends wy {
    private xc bac = null;
    private Map<Integer, aaz> bad = lcn.emw();
    private String bae = null;
    private Set<jcj> baf = null;
    private Map<Integer, aci> bag = lcn.emw();

    @Override
    public boolean isActive() {
        return true;
    }

    @Override
    public boolean vV() {
        return this.bac instanceof xd;
    }

    public List<jcf> wi() {
        if (this.bae == null || this.bae.isEmpty()) {
            return null;
        }
        LinkedList<jcf> linkedList = lcn.emA();
        String[] stringArray = this.bae.split(";");
        block3: for (int i = 0; i < stringArray.length; ++i) {
            switch (xc.cm(stringArray[i])) {
                case 'N': {
                    aaz aaz2 = this.dE(xc.cn(stringArray[i]));
                    if (aaz2 == null || !aaz2.yq()) continue block3;
                    linkedList.add(aaz2.yu());
                    continue block3;
                }
            }
        }
        return linkedList;
    }

    @Override
    public List<jcl> vX() {
        LinkedList<jcl> linkedList = lcn.emA();
        if (this.baf != null) {
            for (jcj jcj2 : this.baf) {
                if (linkedList.contains(jcj2.xQ()) || jcj2.yv() != abb.bdo && jcj2.yv() != abb.bdr && (jcj2.yv() != abb.bdq || !this.dM(jcj2.xQ().ib()))) continue;
                linkedList.add(jcj2.xQ());
            }
        }
        return linkedList;
    }

    public wz(xc xc2, int n, xa xa2) {
        super(n, xa2);
        this.bac = xc2;
    }

    public wz(xc xc2, int n, xa xa2, String string) {
        super(n, xa2, string);
        this.bac = xc2;
    }

    @Override
    public String vZ() {
        String string = (this.bae == null || xc.cm(this.bae) != 'Q' ? xc.dR(this.getID()) + ';' : "") + (this.bae == null ? "" : this.bae);
        for (aaz aaz2 : this.bad.values()) {
            string = string + (string.endsWith(";") ? "" : Character.valueOf(';')) + aaz2.wJ();
        }
        return string;
    }

    public boolean ck(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        if (xc.cm(string) != 'Q') {
            return false;
        }
        if (xc.cn(string) != this.getID()) {
            return false;
        }
        if (xc.co(string) != 'A') {
            return false;
        }
        String[] stringArray = string.split(";");
        boolean bl = false;
        block6: for (int i = 1; i < stringArray.length; ++i) {
            switch (xc.cm(stringArray[i])) {
                case 'N': {
                    Object object = this.dE(xc.cn(stringArray[i]));
                    if (object == null) {
                        return false;
                    }
                    if (!((aaz)object).cq(stringArray[i])) {
                        return false;
                    }
                    if (xc.co(stringArray[i]) == 'C') {
                        this.bae = this.bae == null ? stringArray[i] : this.bae + ';' + stringArray[i];
                        bl = true;
                    }
                    if (xc.co(stringArray[i]) != 'A') continue block6;
                    this.bad.put(((aaz)object).getID(), (aaz)object);
                    bl = false;
                    continue block6;
                }
                case 'C': {
                    Object object = this.dH(xc.cn(stringArray[i]));
                    if (object == null) {
                        return false;
                    }
                    if (!((yy)object).cq(stringArray[i])) {
                        return false;
                    }
                    if (!bl || xc.co(stringArray[i]) != 'C') continue block6;
                    this.bae = this.bae == null ? stringArray[i] : this.bae + ';' + stringArray[i];
                    continue block6;
                }
                case 'T': {
                    Object object = this.dI(xc.cn(stringArray[i]));
                    if (object == null) {
                        return false;
                    }
                    if (!((acp)object).cq(stringArray[i])) {
                        return false;
                    }
                    if (!bl || xc.co(stringArray[i]) != 'C') continue block6;
                    this.bae = this.bae == null ? stringArray[i] : this.bae + ';' + stringArray[i];
                    continue block6;
                }
                case 'A': {
                    Object object = this.dJ(xc.cn(stringArray[i]));
                    if (object == null) {
                        return false;
                    }
                    if (!((xj)object).cq(stringArray[i])) {
                        return false;
                    }
                    if (!bl || xc.co(stringArray[i]) != 'C') continue block6;
                    this.bae = this.bae == null ? stringArray[i] : this.bae + ';' + stringArray[i];
                    continue block6;
                }
                default: {
                    assert (false) : "WTF!!!";
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void cj(String string) {
        this.bae = this.bae == null ? string : this.bae + ';' + string;
    }

    public String wj() {
        String string = "";
        for (aci aci2 : this.bag.values()) {
            string = string + (string.isEmpty() ? aci2.wJ() : ';' + aci2.wJ());
        }
        return string;
    }

    public boolean cl(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        String[] stringArray = string.split(";");
        for (int i = 0; i < stringArray.length; ++i) {
            int n = xc.cn(stringArray[i]);
            aci aci2 = this.bag.get(n);
            if (aci2 == null) {
                return false;
            }
            aci2.cs(stringArray[i]);
        }
        return true;
    }

    public void wk() {
        HashSet<aaz> hashSet = new HashSet<aaz>(this.bad.values());
        this.bad.clear();
        for (aaz aaz2 : hashSet) {
            this.a(aaz2, false, true);
        }
    }

    @Override
    public void a(aaz aaz2, boolean bl, boolean bl2) {
        if (aaz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "activateNode() : Node Parameter is Null!!!... Quest = " + this);
            assert (false);
            return;
        }
        if (this.bad.containsKey(aaz2.getID())) {
            lfn.b(5, this.getClass().getSimpleName(), "activateNode() : Node Already Active!!!... Quest = " + this + ", Node = " + aaz2);
            return;
        }
        this.bad.put(aaz2.getID(), aaz2);
        if (aaz2 instanceof xl) {
            ((xl)((Object)aaz2)).wQ();
        }
        if (aaz2 instanceof aay) {
            ((aay)aaz2).yh();
            ((aay)aaz2).yi();
        }
        if (this.baf != null) {
            Iterator<jcj> iterator = this.baf.iterator();
            while (iterator.hasNext()) {
                jcj jcj2 = iterator.next();
                if (this.bad.containsKey(jcj2.dxy())) continue;
                jcj2.dxA();
                iterator.remove();
            }
        }
        this.bac.a(this, aaz2, bl, bl2);
        if (aaz2 instanceof aay) {
            ((aay)aaz2).yj();
        }
    }

    @Override
    public void b(aaz aaz2, boolean bl, boolean bl2) {
        if (aaz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivateNode() : Node Parameter is Null!!!... Quest = " + this);
            assert (false);
            return;
        }
        if (!this.bad.containsKey(aaz2.getID())) {
            lfn.b(4, this.getClass().getSimpleName(), "deactivateNode() : Node is Not Active (can happen if the node completed the quest)!!!... Quest = " + this + ", Node = " + aaz2);
            return;
        }
        this.bad.remove(aaz2.getID());
        if (aaz2 instanceof aay) {
            ((aay)aaz2).yl();
        }
        if (aaz2 instanceof xl) {
            ((xl)((Object)aaz2)).wO();
        }
        if (this.baf != null) {
            for (jcj jcj2 : this.baf) {
                if (jcj2.dxy() != aaz2.getID()) continue;
                jcj2.dxz();
            }
        }
        this.bac.a(this, aaz2, bl);
    }

    @Override
    public boolean b(aaz aaz2) {
        return aaz2 == null ? false : this.bad.containsKey(aaz2.getID());
    }

    public void wl() {
        for (aaz aaz2 : this.bad.values()) {
            if (!(aaz2 instanceof aay)) continue;
            ((aay)aaz2).yk();
            ((aay)aaz2).ya();
        }
    }

    public boolean wm() {
        Collection<aaz> collection = this.bad.values();
        if (collection.isEmpty()) {
            return true;
        }
        Set<Integer> set = this.wd();
        for (aaz aaz2 : collection) {
            if (set.contains(aaz2.getID())) continue;
            return true;
        }
        return false;
    }

    public void wn() {
        for (aaz aaz2 : this.bad.values()) {
            for (aaz aaz3 : this.wb()) {
                if (!aaz3.xP() || aaz3.yv() == abb.bdn) continue;
                this.a(aaz2, aaz3);
            }
        }
    }

    private void a(aaz aaz2, aaz aaz3) {
        LinkedList<Integer> linkedList = lcn.emA();
        linkedList.add(aaz2.getID());
        this.a(linkedList, aaz3.getID());
    }

    private void a(LinkedList<Integer> linkedList, int n) {
        LinkedList<Integer> linkedList2 = this.dE(linkedList.getLast()).yt();
        for (Integer n2 : linkedList2) {
            if (linkedList.contains(n2) || n2 != n) continue;
            linkedList.add(n2);
            this.a(linkedList);
            linkedList.removeLast();
            break;
        }
        for (Integer n2 : linkedList2) {
            if (linkedList.contains(n2) || n2 == n) continue;
            linkedList.add(n2);
            this.a(linkedList, n);
            linkedList.removeLast();
        }
    }

    private void a(LinkedList<Integer> linkedList) {
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        aaz aaz2 = this.dE(linkedList.getLast());
        if (aaz2 == null || aaz2.yv() == abb.bdn) {
            return;
        }
        jcj jcj2 = new jcj(this.getID(), new LinkedList<Integer>(linkedList), aaz2.xQ(), aaz2.yv());
        if (this.baf == null) {
            this.baf = lcn.emx();
        }
        this.baf.add(jcj2);
    }

    @Override
    public List<ach> we() {
        return new LinkedList<ach>(this.bag.values());
    }

    @Override
    public ach dK(int n) {
        return this.bag.get(n);
    }

    @Override
    public void a(ach ach2) {
        if (ach2 == null) {
            return;
        }
        this.bag.put(ach2.getID(), ach2.yP());
        super.a(ach2);
    }

    @Override
    public void dL(int n) {
        aci aci2 = this.bag.get(n);
        if (aci2 == null) {
            return;
        }
        if (!aci2.isLocked()) {
            return;
        }
        aci2.aB(false);
        this.bac.a(aci2);
    }

    public boolean dM(int n) {
        if (this.bae == null) {
            return false;
        }
        String[] stringArray = this.bae.split(";");
        for (int i = stringArray.length - 1; i >= 0; --i) {
            aay aay2;
            aaz aaz2;
            if (xc.cm(stringArray[i]) != 'N' || xc.co(stringArray[i]) != 'C' || (aaz2 = this.dE(xc.cn(stringArray[i]))) == null || !(aaz2 instanceof aay) || !(aay2 = (aay)aaz2).xS() || aay2.xT() != n) continue;
            return true;
        }
        return false;
    }

    @Override
    public void complete() {
        if (!this.bad.isEmpty()) {
            HashSet<Integer> hashSet = new HashSet<Integer>(this.bad.keySet());
            Iterator<Integer> object = hashSet.iterator();
            while (object.hasNext()) {
                Integer n = object.next();
                this.b(this.dE(n), false, false);
            }
        }
        this.bae = "Q" + Integer.toString(this.getID()) + "C;" + this.bae;
        this.bac.c(this);
        if (this.baf != null) {
            for (jcj jcj2 : this.baf) {
                jcj2.dxA();
            }
            this.baf.clear();
            this.baf = null;
        }
    }

    public void wo() {
        HashSet<Integer> hashSet = new HashSet<Integer>(this.bad.keySet());
        for (Integer n : hashSet) {
            ((aay)this.dE(n)).yg();
        }
    }

    public void reset() {
        if (!this.bad.isEmpty()) {
            HashSet<Integer> hashSet = new HashSet<Integer>(this.bad.keySet());
            Iterator object = hashSet.iterator();
            while (object.hasNext()) {
                Integer n = (Integer)object.next();
                this.b(this.dE(n), false, false);
            }
        }
        if (this.baf != null) {
            for (jcj jcj2 : this.baf) {
                jcj2.dxA();
            }
            this.baf.clear();
            this.baf = null;
        }
    }

    @Override
    public ldv wf() {
        return this.vV() ? ((xd)this.bac).wf() : null;
    }

    @Override
    public gds cr(ldv ldv2) {
        return this.bac.cr(ldv2);
    }

    @Override
    public gec cs(ldv ldv2) {
        return this.bac.cs(ldv2);
    }

    @Override
    public gdq ct(ldv ldv2) {
        return this.bac.ct(ldv2);
    }

    @Override
    public void a(gdt gdt2) {
        this.bac.a(gdt2);
    }

    @Override
    public xc wg() {
        return this.bac;
    }

    @Override
    public ha mA() {
        return this.bac.mA();
    }

    @Override
    public cex nW() {
        return this.bac.nW();
    }

    @Override
    public cew nY() {
        return this.bac.nY();
    }

    @Override
    public bex wh() {
        return this.bac.wh();
    }

    @Override
    public acj a(ack ack2) {
        return this.bac.a(ack2);
    }

    @Override
    public void a(acj acj2) {
        this.bac.a(acj2);
    }

    @Override
    public void a(gdw gdw2) {
    }

    @Override
    public void a(gds gds2) {
        yy yy2 = this.dH(gds2.bTY());
        if (yy2 == null) {
            assert (false);
            return;
        }
        yy2.a(gds2);
    }

    @Override
    public void a(gec gec2) {
        acp acp2 = this.dI(gec2.bUf());
        if (acp2 == null) {
            assert (false);
            return;
        }
        acp2.a(gec2);
    }

    @Override
    public void a(gdq gdq2) {
        xj xj2 = this.dJ(gdq2.bTR());
        if (xj2 == null) {
            assert (false);
            return;
        }
        xj2.a(gdq2);
    }
}

