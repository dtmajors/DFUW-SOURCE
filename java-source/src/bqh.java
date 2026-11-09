/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class bqh {
    public final bqg[] dBK;
    private static les ResourceTree = lea.enW();

    public bqh(int n) {
        this.dBK = new bqg[n];
    }

    public boolean auh() {
        int n = this.dBK.length;
        for (int i = 0; i < n; ++i) {
            if (this.dBK[i].dBI == null) continue;
            return true;
        }
        return false;
    }

    public int aui() {
        switch (this.dBK[0].dBG.brQ) {
            case brq: {
                return 1600;
            }
            case bru: {
                return 1584;
            }
        }
        return -1;
    }

    public ctw lT(int n) {
        assert (n > 0);
        int n2 = this.dBK.length;
        for (int i = 0; i < n2; ++i) {
            if (this.dBK[i].dBI != null) continue;
            return null;
        }
        Iterator<ctw> iterator = lea.eoe().values().iterator();
        return (ctw)this.a(n, iterator);
    }

    public cty lU(int n) {
        assert (n > 0);
        int n2 = this.dBK.length;
        for (int i = 0; i < n2; ++i) {
            if (this.dBK[i].dBI != null) continue;
            return null;
        }
        Iterator<cty> iterator = lea.eof().values().iterator();
        return (cty)this.a(n, iterator);
    }

    public float auj() {
        float f2 = 0.0f;
        int n = this.dBK.length;
        for (int i = 1; i < n; ++i) {
            f2 += this.dBK[i].aug();
        }
        return f2 * 5.0f;
    }

    public akp dc(float f2) {
        int n = this.dBK.length;
        for (int i = 0; i < n; ++i) {
            if (this.dBK[i] == null) {
                return null;
            }
            akp akp2 = this.dBK[i].db(f2);
            if (akp2.bqB) continue;
            return akp2;
        }
        return new akp(true);
    }

    private boolean e(int n, List<Integer> list) {
        assert (n > 0);
        assert (list != null);
        if (list.isEmpty()) {
            return false;
        }
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            if (!ResourceTree.isDescendant(n, list.get(i))) continue;
            return true;
        }
        return false;
    }

    private int a(int n, ctx ctx2) {
        assert (n > 0);
        assert (ctx2 != null);
        int n2 = ctx2.Ingredients.length;
        for (int i = 0; i < n2; ++i) {
            if (!ResourceTree.isDescendant(n, ctx2.Ingredients[i].ResourceType)) continue;
            return ctx2.Ingredients[i].ResourceType;
        }
        return 0;
    }

    private ctx a(int n, Iterator iterator) {
        assert (n > 0);
        assert (iterator != null);
        int[] nArray = new int[]{this.dBK[1].dBI.az(), this.dBK[2].dBI.az(), this.dBK[3].dBI.az()};
        Arrays.sort(nArray);
        ArrayList<Integer> arrayList = lcn.abH(3);
        while (iterator.hasNext()) {
            ctx ctx2 = (ctx)iterator.next();
            cui cui2 = cxj.iA(ctx2.ResourceGroupName);
            if (cui2 == null || !cui2.wN(n) || ctx2.fgp.ResourceType != this.dBK[0].dBI.az()) continue;
            arrayList.clear();
            boolean bl2 = true;
            int n2 = nArray.length;
            for (int i = 0; i < n2; ++i) {
                if (this.e(nArray[i], arrayList)) {
                    bl2 = false;
                    break;
                }
                int n3 = this.a(nArray[i], ctx2);
                if (n3 == 0) {
                    bl2 = false;
                    break;
                }
                arrayList.add(n3);
            }
            if (!bl2) continue;
            return ctx2;
        }
        return null;
    }
}

