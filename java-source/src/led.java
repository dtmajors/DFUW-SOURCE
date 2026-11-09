/*
 * Decompiled with CFR.
 */
import java.util.HashMap;
import java.util.List;

public class led<ObjType> {
    private final float Radius;
    private HashMap<Integer, HashMap<ObjType, ljq>> riM = new HashMap();
    private HashMap<ObjType, Integer> riN = new HashMap();

    public led(float f) {
        this.Radius = f;
    }

    public void clear() {
        this.riM.clear();
        this.riN.clear();
    }

    public void a(ObjType ObjType, ljq ljq2) {
        int n = this.en(ljq2);
        HashMap<Object, ljq> hashMap = this.riM.get(n);
        if (hashMap == null) {
            hashMap = new HashMap();
            this.riM.put(n, hashMap);
        }
        assert (!hashMap.containsKey(ObjType));
        hashMap.put(ObjType, ljq2);
        assert (!this.riN.containsKey(ObjType));
        this.riN.put(ObjType, n);
    }

    public boolean remove(ObjType ObjType) {
        if (this.riN.containsKey(ObjType)) {
            int n = this.riN.get(ObjType);
            this.riN.remove(ObjType);
            assert (this.riM.containsKey(n));
            this.riM.get(n).remove(ObjType);
            return true;
        }
        return false;
    }

    public void b(ObjType ObjType, ljq ljq2) {
        this.remove(ObjType);
        this.a(ObjType, ljq2);
    }

    public void a(ljq ljq2, List<ObjType> list) {
        int n = (int)(ljq2.x / this.Radius - 0.5f);
        int n2 = (int)(ljq2.x / this.Radius + 0.5f);
        int n3 = (int)(ljq2.y / this.Radius - 0.5f);
        int n4 = (int)(ljq2.y / this.Radius + 0.5f);
        int n5 = (int)(ljq2.rlV / this.Radius - 0.5f);
        int n6 = (int)(ljq2.rlV / this.Radius + 0.5f);
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                for (int k = n5; k <= n6; ++k) {
                    this.a(i, j, k, ljq2, list);
                }
            }
        }
    }

    private int en(ljq ljq2) {
        int n = (int)(ljq2.x / this.Radius);
        int n2 = (int)(ljq2.y / this.Radius);
        int n3 = (int)(ljq2.rlV / this.Radius);
        return this.O(n, n2, n3);
    }

    private int O(int n, int n2, int n3) {
        int n4 = -1918454973;
        int n5 = -669632447;
        int n6 = -887442657;
        int n7 = -1918454973 * n + -669632447 * n2 + -887442657 * n3;
        return n7;
    }

    private void a(int n, int n2, int n3, ljq ljq2, List<ObjType> list) {
        int n4 = this.O(n, n2, n3);
        HashMap<ObjType, ljq> hashMap = this.riM.get(n4);
        if (hashMap == null) {
            return;
        }
        for (ObjType ObjType : hashMap.keySet()) {
            ljq ljq3 = hashMap.get(ObjType);
            if (!(ljq3.ez(ljq2) <= this.Radius)) continue;
            list.add(ObjType);
        }
    }
}

