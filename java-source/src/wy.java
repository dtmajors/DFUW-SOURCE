/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cex
 *  ha
 */
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class wy {
    private int ID = -1;
    private String aZO = null;
    private xa aZP = xa.bah;
    private xb aZQ = null;
    private List<abd> aZR = null;
    private List<aax> aZS = null;
    private Map<Integer, aaz> aZT = null;
    private Map<Integer, aaz> aZU = null;
    private Map<Integer, aaw> aZV = null;
    private Map<Integer, yy> aZW = null;
    private Map<Integer, acp> aZX = null;
    private Map<Integer, xj> aZY = null;
    private lop aZZ = null;
    private Map<Integer, ach> baa = null;

    public int getID() {
        return this.ID;
    }

    public xa vR() {
        return this.aZP;
    }

    public xb vS() {
        return this.aZQ;
    }

    public void a(xb xb2) {
        this.aZQ = xb2;
    }

    public loz vT() {
        return lvm.sXm.bD(this.vW());
    }

    public loz vU() {
        return lvm.sXn.bD(this.vW());
    }

    public boolean isActive() {
        return false;
    }

    public boolean isPending() {
        return false;
    }

    public boolean vV() {
        return false;
    }

    public lop vW() {
        if (this.aZZ == null) {
            this.aZZ = new lop(this.ID);
        }
        return this.aZZ;
    }

    public List<jcf> ci(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        LinkedList<jcf> linkedList = lcn.emA();
        String[] stringArray = string.split(";");
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

    public List<jcl> vX() {
        LinkedList<jcl> linkedList = lcn.emA();
        for (aaz aaz2 : this.aZU.values()) {
            if (!aaz2.xP() || aaz2.yv() != abb.bdo) continue;
            linkedList.add(aaz2.xQ());
        }
        return linkedList;
    }

    public boolean vY() {
        for (yw yw2 : yw.values()) {
            if (this.a(yw2)) continue;
            return false;
        }
        return true;
    }

    public boolean a(yw yw2) {
        for (aaz aaz2 : this.aZT.values()) {
            if (!aaz2.yq() || aaz2.vY()) continue;
            return false;
        }
        return true;
    }

    public wy(int n, xa xa2) {
        this.ID = n;
        this.aZP = xa2;
        this.aZR = lcn.emA();
        this.aZS = lcn.emA();
        this.aZT = lcn.emw();
        this.aZV = lcn.emw();
        this.aZW = lcn.emw();
        this.aZX = lcn.emw();
        this.aZY = lcn.emw();
        this.baa = lcn.emw();
        this.aZU = lcn.emw();
    }

    public wy(int n, xa xa2, String string) {
        this(n, xa2);
    }

    public String vZ() {
        return null;
    }

    public wz a(xc xc2, String string, String string2) {
        if (this.isActive()) {
            return (wz)this;
        }
        wz wz2 = new wz(xc2, this.ID, this.aZP);
        for (aaz object : this.aZT.values()) {
            wz2.a(object.h(wz2));
        }
        for (aaw aaw2 : this.aZV.values()) {
            wz2.a(aaw2.g(wz2));
        }
        for (ach ach2 : this.baa.values()) {
            wz2.a(ach2);
        }
        if (!wz2.ck(string)) {
            return null;
        }
        if (string2 != null && !string2.isEmpty() && !wz2.cl(string2)) {
            return null;
        }
        return wz2;
    }

    public xg a(xc xc2, String string) {
        if (this instanceof xg) {
            return (xg)this;
        }
        xg xg2 = new xg(xc2, this.ID, this.aZP);
        for (abd abd2 : this.aZR) {
            xg2.a(abd2.h(xg2));
        }
        return xg2.ck(string) ? xg2 : null;
    }

    public void cj(String string) {
    }

    public void a(aaz aaz2) {
        if (this.aZT.containsKey(aaz2.getID())) {
            lfn.b(5, this.getClass().getSimpleName(), "addNode() : Node ID Already Exists!!!... Quest = " + this + ", Node = " + aaz2);
            assert (false);
            return;
        }
        this.aZT.put(aaz2.getID(), aaz2);
        switch (aaz2.yn()) {
            case bdu: {
                this.aZR.add((abd)aaz2);
                break;
            }
            case bdw: {
                this.aZS.add((aax)aaz2);
            }
        }
        if (aaz2.yv() != abb.bdn) {
            this.aZU.put(aaz2.getID(), aaz2);
        }
    }

    public Collection<abd> wa() {
        return this.aZR;
    }

    public aaz dE(int n) {
        return this.aZT == null ? null : this.aZT.get(n);
    }

    public aaz dF(int n) {
        return this.aZU == null ? null : this.aZU.get(n);
    }

    public Collection<aaz> wb() {
        return this.aZU.values();
    }

    public Collection<aax> wc() {
        return this.aZS;
    }

    public void a(aaz aaz2, boolean bl, boolean bl2) {
    }

    public void b(aaz aaz2, boolean bl, boolean bl2) {
    }

    public boolean b(aaz aaz2) {
        return false;
    }

    protected Set<Integer> wd() {
        Set<Integer> set = lcn.emx();
        for (abd abd2 : this.aZR) {
            for (Integer n : abd2.yA()) {
                aaw aaw2 = this.aZV.get((int)n);
                if (aaw2 == null || set.contains(aaw2.xN())) continue;
                set.add(aaw2.xN());
            }
        }
        return set;
    }

    public void a(aaw aaw2) {
        if (this.aZV.containsKey(aaw2.getID())) {
            lfn.b(5, this.getClass().getSimpleName(), "addEdge() : Edge ID Already Exists!!!... Quest = " + this + ", Edge = " + aaw2);
            assert (false);
            return;
        }
        aaz aaz2 = this.aZT.get(aaw2.xL());
        aaz aaz3 = this.aZT.get(aaw2.xN());
        if (aaz2 == null || aaz3 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "addEdge() : Missing From or To Node!!!... Quest = " + this + ", Edge = " + aaw2 + ", FromNode = " + aaz2 + ", ToNode = " + aaz3);
            assert (false);
            return;
        }
        this.aZV.put(aaw2.getID(), aaw2);
        aaz2.c(aaw2);
        aaz3.b(aaw2);
    }

    public aaw dG(int n) {
        return this.aZV == null ? null : this.aZV.get(n);
    }

    public void a(yy yy2) {
        if (yy2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "notifyConditionAdded() : Condition is Null!!!... Quest = " + this);
            assert (false);
            return;
        }
        if (this.aZW.containsKey(yy2.getID())) {
            lfn.b(5, this.getClass().getSimpleName(), "notifyConditionAdded() : Condition With ID Already Exists!!!... Quest = " + this + ", Condition = " + yy2);
            assert (false);
            return;
        }
        this.aZW.put(yy2.getID(), yy2);
    }

    protected yy dH(int n) {
        return this.aZW.get(n);
    }

    public void a(acp acp2) {
        if (acp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "notifyTaskAdded() : Task is Null!!!... Quest = " + this);
            assert (false);
            return;
        }
        if (this.aZX.containsKey(acp2.getID())) {
            lfn.b(5, this.getClass().getSimpleName(), "notifyTaskAdded() : Task With ID Already Exists!!!... Quest = " + this + ", Task = " + acp2);
            assert (false);
            return;
        }
        this.aZX.put(acp2.getID(), acp2);
    }

    protected acp dI(int n) {
        return this.aZX.get(n);
    }

    public void a(xj xj2) {
        if (xj2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "notifyTaskAdded() : Action is Null!!!... Quest = " + this);
            assert (false);
            return;
        }
        if (this.aZY.containsKey(xj2.getID())) {
            lfn.b(5, this.getClass().getSimpleName(), "notifyTaskAdded() : Action With ID Already Exists!!!... Quest = " + this + ", Action = " + xj2);
            assert (false);
            return;
        }
        this.aZY.put(xj2.getID(), xj2);
    }

    protected xj dJ(int n) {
        return this.aZY.get(n);
    }

    public List<ach> we() {
        return new LinkedList<ach>(this.baa.values());
    }

    public ach dK(int n) {
        return this.baa.get(n);
    }

    public void a(ach ach2) {
        if (ach2 == null) {
            return;
        }
        this.baa.put(ach2.getID(), ach2);
    }

    public void dL(int n) {
    }

    public xg a(xc xc2) {
        if (this instanceof xg) {
            return (xg)this;
        }
        xg xg2 = new xg(xc2, this.ID, this.aZP);
        for (abd abd2 : this.aZR) {
            xg2.a(abd2.h(xg2));
        }
        return xg2;
    }

    public void a(abd abd2) {
    }

    public wz a(xc xc2, abd abd2) {
        abd abd3;
        if (this.isActive()) {
            return (wz)this;
        }
        wz wz2 = new wz(xc2, this.ID, this.aZP);
        for (aaz object2 : this.aZT.values()) {
            wz2.a(object2.h(wz2));
        }
        for (aaw aaw2 : this.aZV.values()) {
            wz2.a(aaw2.g(wz2));
        }
        for (ach ach2 : this.baa.values()) {
            wz2.a(ach2);
        }
        aaz aaz2 = wz2.dE(abd2.getID());
        if (aaz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Start-Node Not Found in Active Quest!!!... Quest = " + this + ", Active Quest = " + wz2 + ", Start-Node = " + abd2);
            assert (false);
            return null;
        }
        abd abd4 = abd3 = aaz2 instanceof abd ? (abd)aaz2 : null;
        if (abd3 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Invalid Active-Node!!!... Quest = " + this + ", Active Quest = " + wz2 + ", Start-Node = " + abd2 + ", Active-Node = " + aaz2);
            assert (false);
            return null;
        }
        abd3.yF();
        return wz2;
    }

    public void complete() {
    }

    public ldv wf() {
        return null;
    }

    public gds cr(ldv ldv2) {
        return null;
    }

    public gec cs(ldv ldv2) {
        return null;
    }

    public gdq ct(ldv ldv2) {
        return null;
    }

    public void a(gdt gdt2) {
    }

    public xc wg() {
        return null;
    }

    public ha mA() {
        return null;
    }

    public cex nW() {
        return null;
    }

    public cew nY() {
        return null;
    }

    public bex wh() {
        return null;
    }

    public acj a(ack ack2) {
        return null;
    }

    public void a(acj acj2) {
    }

    public void a(gdw gdw2) {
        assert (false) : "Only Active/Pending Quests Should Receive Messages!";
    }

    public void a(gds gds2) {
        assert (false) : "Only Active/Pending Quests Should Receive Messages!";
    }

    public void a(gec gec2) {
        assert (false) : "Only Active/Pending Quests Should Receive Messages!";
    }

    public void a(gdq gdq2) {
        assert (false) : "Only Active/Pending Quests Should Receive Messages!";
    }

    public String toString() {
        return "[" + this.getClass().getSimpleName() + " :: ID = " + this.ID + ", Category = " + (Object)((Object)this.aZP) + ", Nodes = " + this.aZT.size() + ", Edges = " + this.aZV.size() + ", Conditions = " + this.aZW.size() + ", Tasks = " + this.aZX.size() + ", Actions = " + this.aZY.size() + "]";
    }
}

