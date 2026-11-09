/*
 * Decompiled with CFR.
 */
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class les {
    private a rjy = null;
    private lij lai = null;
    private Map<String, ler> rjz = null;
    private Map<Integer, ler> rjA = null;
    private Map<String, ler> rjB = null;
    private boolean rjC = false;
    private Map<Long, Boolean> rjD = lcn.emw();
    private int rjE = 1;

    public les(a a2) {
        this(a2, false);
    }

    public les(a a2, boolean bl) {
        this.rjy = a2;
        this.rjC = bl;
        this.lai = new lij();
        this.rjz = lcn.emw();
        this.rjA = lcn.emw();
        if (this.rjC) {
            this.rjB = lcn.emw();
        }
    }

    public a eql() {
        return this.rjy;
    }

    public Map<String, ler> eqm() {
        return this.rjz;
    }

    public String eqn() {
        return this.rjy.name();
    }

    public final void clear() {
        this.k(this.eqq());
        this.rjz.clear();
        this.rjA.clear();
        if (this.rjC) {
            this.rjB.clear();
        }
    }

    public boolean contains(int n) {
        if (n < 0) {
            lfn.b(5, "SFListItemTree", "contains() Type is invalid.");
            return false;
        }
        return this.rjA.containsKey(n);
    }

    public boolean contains(String string) {
        if (string == null) {
            lfn.b(5, "SFListItemTree", "contains() Name is null.");
            return false;
        }
        if (this.rjC) {
            return this.rjB.containsKey(string.toLowerCase());
        }
        return this.rjz.containsKey(string);
    }

    public lff[] eqo() {
        lff[] lffArray = new lff[this.rjz.size()];
        int n = 0;
        for (ler ler2 : this.rjz.values()) {
            lffArray[n] = new lff();
            lffArray[n].Name = ler2.getName().toLowerCase();
            lffArray[n].PC = ler2.getType();
            ++n;
        }
        return lffArray;
    }

    public List<ler> a(ler ler2, boolean bl) {
        return this.a(ler2, bl, false);
    }

    public List<ler> a(ler ler2, boolean bl, boolean bl2) {
        ArrayList<ler> arrayList = lcn.emv();
        this.a(arrayList, ler2, bl, bl2);
        return arrayList;
    }

    public String getName(int n) {
        ler ler2 = this.rjA.get(n);
        if (ler2 != null) {
            return ler2.getName();
        }
        return null;
    }

    public int getType(String string) {
        ler ler2 = null;
        if (this.rjC) {
            if (string == null) {
                return -1;
            }
            ler2 = this.rjB.get(string.toLowerCase());
        } else {
            ler2 = this.rjz.get(string);
        }
        if (ler2 != null) {
            return ler2.getType();
        }
        return -1;
    }

    public int uW(int n) {
        ler ler2 = this.acv(n);
        if (ler2 != null && (ler2 = this.i(ler2)) != null) {
            return ler2.getType();
        }
        return -1;
    }

    public ler acv(int n) {
        return this.rjA.get(n);
    }

    public ler zx(String string) {
        if (string == null) {
            return null;
        }
        if (this.rjC) {
            return this.rjB.get(string.toLowerCase());
        }
        return this.rjz.get(string);
    }

    public lgw ab(int n, String string) {
        if (this.rjy != a.rjJ) {
            lfn.b(5, "SFListItemTree", "getListItemForMeshFileName() This method can only be used for the resourcetree.");
            return null;
        }
        if (n < 0) {
            lfn.b(5, "SFListItemTree", "getListItemForMeshFileName() ResourceType is invalid.");
            return null;
        }
        if (string == null) {
            lfn.b(5, "SFListItemTree", "getListItemForMeshFileName() MeshFileName is null.");
            return null;
        }
        lgw lgw2 = (lgw)this.acv(n);
        if (lgw2 == null) {
            lfn.b(5, "SFListItemTree", "getListItemForMeshFileName() Could not find resource with type=" + n);
            return null;
        }
        return this.b(lgw2, string);
    }

    public int eqp() {
        ++this.rjE;
        return this.rjE;
    }

    public boolean fV(int n, int n2) {
        ler ler2 = this.acv(n2);
        if (ler2 == null) {
            lfn.b(5, "SFListItemTree", "isChildNode() ParentType=" + n2 + " is invalid.");
            return false;
        }
        if (n == n2) {
            return false;
        }
        ler ler3 = this.g(ler2);
        while (ler3 != null) {
            if (ler3.getType() == n) {
                return true;
            }
            ler3 = this.h(ler3);
        }
        return false;
    }

    public boolean isDescendant(int n, int n2) {
        return this.k(n, n2, true);
    }

    public boolean k(int n, int n2, boolean bl) {
        if (n == n2) {
            return bl;
        }
        if (n2 == 0) {
            return this.contains(n);
        }
        long l = (long)n << 32 | (long)n2;
        Boolean bl2 = this.rjD.get(l);
        if (bl2 != null) {
            return bl2;
        }
        ler ler2 = this.acv(n);
        while (ler2 != null) {
            if (ler2.getType() == 0) {
                this.rjD.put(l, Boolean.FALSE);
                return false;
            }
            if (ler2.getType() == n2) {
                this.rjD.put(l, Boolean.TRUE);
                return true;
            }
            ler2 = this.i(ler2);
        }
        this.rjD.put(l, Boolean.FALSE);
        return false;
    }

    public boolean e(ler ler2) {
        if (ler2 == null) {
            lfn.b(5, "SFListItemTree", "isLeafNode() ListItem is null.");
            return false;
        }
        return this.lai.ad(ler2);
    }

    public void a(ler ler2, String string) {
        assert (ler2 != null);
        assert (string != null);
        assert (this.f(ler2));
        assert (!this.contains(string));
        this.rjz.remove(ler2.getName());
        ler2.setName(string);
        this.rjz.put(ler2.getName(), ler2);
    }

    public void a(ler ler2, ler ler3, ler ler4) {
        if (ler3 == null) {
            lfn.b(5, "SFListItemTree", "addNode() NodeToInsert is null.");
            assert (false);
            return;
        }
        if (this.rjz.containsKey(ler3.getName())) {
            lfn.b(5, "SFListItemTree", "addNode() ListItem with name " + ler3.getName() + " already exists.");
            lfn.b(5, "SFListItemTree", "addNode() Existing listitem is: " + this.rjz.get(ler3.getName()));
            assert (false);
            return;
        }
        if (this.rjA.containsKey(ler3.getType())) {
            lfn.b(5, "SFListItemTree", "addNode() ListItem with value " + ler3.getType() + " already exists.");
            lfn.b(5, "SFListItemTree", "addNode() Existing listitem is: " + this.rjA.get(ler3.getType()));
            assert (false);
            return;
        }
        if (this.rjC && this.rjB.containsKey(ler3.getName().toLowerCase())) {
            lfn.b(5, "SFListItemTree", "addNode() ListItem with name " + ler3.getName() + " but different case already exists.");
            lfn.b(5, "SFListItemTree", "addNode() Existing listitem is: " + this.rjz.get(ler3.getName()));
            assert (false);
            return;
        }
        this.lai.d(ler3, ler2, ler4);
        this.rjz.put(ler3.getName(), ler3);
        this.rjA.put(ler3.getType(), ler3);
        if (this.rjC) {
            this.rjB.put(ler3.getName().toLowerCase(), ler3);
        }
        if (this.rjE < ler3.getType()) {
            this.rjE = ler3.getType();
        }
    }

    public boolean f(ler ler2) {
        if (ler2 == null) {
            lfn.b(5, "SFListItemTree", "contains() Node is null!");
            return false;
        }
        return this.lai.contains(ler2);
    }

    public ler g(ler ler2) {
        return this.lai.ab(ler2);
    }

    public ler h(ler ler2) {
        if (ler2 == null) {
            lfn.b(5, "SFListItemTree", "getNextSibling() Node is null!");
            return null;
        }
        return this.lai.ac(ler2);
    }

    public ler i(ler ler2) {
        if (ler2 == null) {
            lfn.b(5, "SFListItemTree", "getParent() Node is null!");
            return null;
        }
        return this.lai.getParent(ler2);
    }

    public ler eqq() {
        return (ler)this.lai.est();
    }

    public void a(ler ler2, ler ler3) {
        if (ler2 == null) {
            lfn.b(5, "SFListItemTree", "moveSubtree() NodeToMove is null.");
            return;
        }
        if (ler3 == null) {
            lfn.b(5, "SFListItemTree", "moveSubtree() NewParentNode is null.");
            return;
        }
        this.lai.e(ler2, ler3, null);
    }

    public void j(ler ler2) {
        if (ler2 == null) {
            lfn.b(5, "SFListItemTree", "getParent() NodeToRemove is null!");
            return;
        }
        if (this.lai.ab(ler2) == null) {
            this.lai.af(ler2);
            this.rjA.remove(ler2.getType());
            this.rjz.remove(ler2.getName());
        } else {
            this.k(ler2);
        }
    }

    public void k(ler ler2) {
        if (ler2 == null) {
            lfn.b(5, "SFListItemTree", "removeNodeRecursive() NodeToRemove is null!");
            return;
        }
        ler ler3 = this.lai.ab(ler2);
        ler ler4 = null;
        while (ler3 != null) {
            ler4 = this.lai.ac(ler3);
            this.j(ler3);
            ler3 = ler4;
        }
        this.j(ler2);
    }

    public void b(ler ler2, ler ler3) {
        if (ler2 == null) {
            lfn.b(5, "SFListItemTree", "replaceNode() OldNode is null!");
            assert (false);
            return;
        }
        if (ler3 == null) {
            lfn.b(5, "SFListItemTree", "replaceNode() NewNode is null!");
            assert (false);
            return;
        }
        this.lai.m(ler2, ler3);
    }

    public void a(PrintStream printStream) {
        printStream.println("  " + this.eqq().toString());
        this.a(printStream, "    ", this.eqq());
    }

    private void a(PrintStream printStream, String string, ler ler2) {
        ler ler3 = this.g(ler2);
        while (ler3 != null) {
            printStream.println(string + ler3.toString());
            this.a(printStream, string + "  ", ler3);
            ler3 = this.h(ler3);
        }
    }

    private lgw b(lgw lgw2, String string) {
        lgw lgw3 = (lgw)this.g(lgw2);
        while (lgw3 != null) {
            if (lgw3.bBt() != null && jry.af(string, lgw3.bBt())) {
                return lgw3;
            }
            lgw lgw4 = this.b(lgw3, string);
            if (lgw4 != null) {
                return lgw4;
            }
            lgw3 = (lgw)this.h(lgw3);
        }
        return null;
    }

    private void a(List<ler> list, ler ler2, boolean bl, boolean bl2) {
        ler ler3 = this.g(ler2);
        while (ler3 != null) {
            if (this.e(ler3)) {
                list.add(ler3);
            } else {
                if (bl2) {
                    list.add(ler3);
                }
                if (bl) {
                    this.a(list, ler3, bl, bl2);
                }
            }
            ler3 = this.h(ler3);
        }
    }
}

