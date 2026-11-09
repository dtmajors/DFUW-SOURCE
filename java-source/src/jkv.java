/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class jkv
extends jkx {
    private boolean[] ntF = null;
    private float doR = 0.35f;

    public jkv(int n, int[] nArray, int[] nArray2, int[] nArray3) {
        super(n, nArray, nArray2, nArray3);
    }

    public jkv(int n, int[] nArray, int[] nArray2, List<int[]> list) {
        super(n, nArray, nArray2);
        this.a(nArray, nArray2, list);
        this.doR = hso.cxK().cxT().dJf().dLM();
    }

    public float dLw() {
        return this.doR;
    }

    public void hz(float f2) {
        if (this.doR == f2) {
            return;
        }
        this.doR = f2;
        this.a("setOverlayPolygonAlpha", this.getId(), Float.valueOf(this.doR));
    }

    @Override
    public void create() {
        this.a("createOverlayFilledPolygon", this.dLC().getId(), this.hf, this.mqR, this.mqS, this.dLx(), this.lSN, Float.valueOf(this.doR), this.mxb, this.ntW);
    }

    @Override
    public String dLx() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < this.gJq.length; ++j) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(',');
            }
            if (this.ntF[j]) {
                stringBuilder.append(this.gJj[this.gJk[this.gJq[j]]]);
                stringBuilder.append(',');
                stringBuilder.append(this.gJj[this.gJk[this.gJq[j]] + 1]);
                stringBuilder.append(',');
                stringBuilder.append(this.gJj[this.gJk[this.gJq[j] + 1]]);
                stringBuilder.append(',');
                stringBuilder.append(this.gJj[this.gJk[this.gJq[j] + 1] + 1]);
                continue;
            }
            stringBuilder.append(this.gJj[this.gJk[this.gJq[j] + 1]]);
            stringBuilder.append(',');
            stringBuilder.append(this.gJj[this.gJk[this.gJq[j] + 1] + 1]);
            stringBuilder.append(',');
            stringBuilder.append(this.gJj[this.gJk[this.gJq[j]]]);
            stringBuilder.append(',');
            stringBuilder.append(this.gJj[this.gJk[this.gJq[j]] + 1]);
        }
        return stringBuilder.toString();
    }

    private void a(int[] nArray, int[] nArray2, List<int[]> list) {
        int n = 0;
        for (int[] nArray3 : list) {
            n += nArray3.length;
        }
        this.gJq = new int[n];
        this.ntF = new boolean[n];
        int n2 = 0;
        while (!list.isEmpty()) {
            int n3;
            int n4;
            int[] nArray3;
            if (n2 == 0) {
                nArray3 = list.remove(0);
                for (n4 = 0; n4 < nArray3.length; ++n4) {
                    this.ntF[n2] = true;
                    this.gJq[n2++] = nArray3[n4];
                }
                continue;
            }
            nArray3 = null;
            n4 = 0;
            for (int[] nArray4 : list) {
                if (jkv.a(nArray, nArray2, this.gJq[n2 - 1], nArray4[0])) {
                    nArray3 = nArray4;
                    n4 = 0;
                    break;
                }
                if (!jkv.a(nArray, nArray2, this.gJq[n2 - 1], nArray4[nArray4.length - 1])) continue;
                nArray3 = nArray4;
                n4 = 1;
                break;
            }
            if (nArray3 == null && (nArray3 = jkv.a(nArray, nArray2, this.gJq[n2 - 1], list)) != null) {
                int n5 = nArray[nArray2[this.gJq[n2 - 1] + 1]];
                int n6 = nArray[nArray2[this.gJq[n2 - 1] + 1] + 1];
                int n7 = nArray[nArray2[nArray3[0]]];
                int n8 = nArray[nArray2[nArray3[0]] + 1];
                int n9 = nArray[nArray2[nArray3[nArray3.length - 1] + 1]];
                int n10 = nArray[nArray2[nArray3[nArray3.length - 1] + 1] + 1];
                int n11 = jkv.I(n5, n6, n7, n8);
                int n12 = jkv.I(n5, n6, n9, n10);
                int n13 = n4 = n12 < n11 ? 1 : 0;
            }
            if (nArray3 == null) continue;
            list.remove(nArray3);
            if (n4 != 0) {
                for (n3 = nArray3.length - 1; n3 >= 0; --n3) {
                    this.ntF[n2] = false;
                    this.gJq[n2++] = nArray3[n3];
                }
                continue;
            }
            for (n3 = 0; n3 < nArray3.length; ++n3) {
                this.ntF[n2] = true;
                this.gJq[n2++] = nArray3[n3];
            }
        }
        assert (n2 == n);
    }

    private static boolean a(int[] nArray, int[] nArray2, int n, int n2) {
        int n3 = nArray[nArray2[n]];
        int n4 = nArray[nArray2[n] + 1];
        int n5 = nArray[nArray2[n + 1]];
        int n6 = nArray[nArray2[n + 1] + 1];
        int n7 = nArray[nArray2[n2]];
        int n8 = nArray[nArray2[n2] + 1];
        int n9 = nArray[nArray2[n2 + 1]];
        int n10 = nArray[nArray2[n2 + 1] + 1];
        if (n5 == n7 && n6 == n8) {
            return true;
        }
        return n3 == n9 && n4 == n10;
    }

    /*
     * WARNING - void declaration
     */
    private static int[] a(int[] nArray, int[] nArray2, int n, List<int[]> list) {
        void var8_12;
        int n2 = nArray[nArray2[n + 1]];
        int n3 = nArray[nArray2[n + 1] + 1];
        ArrayList<Integer> arrayList = lcn.emv();
        for (int[] object2 : list) {
            int n4;
            int n5 = nArray[nArray2[object2[0]]];
            int n6 = nArray[nArray2[object2[0]] + 1];
            int n7 = nArray[nArray2[object2[object2.length - 1] + 1]];
            int n8 = nArray[nArray2[object2[object2.length - 1] + 1] + 1];
            int n9 = jkv.I(n2, n3, n5, n6);
            arrayList.add(n9 < (n4 = jkv.I(n2, n3, n7, n8)) ? n9 : n4);
        }
        int n10 = Integer.MAX_VALUE;
        for (Integer n11 : arrayList) {
            if (n11 >= n10) continue;
            n10 = n11;
        }
        boolean bl = false;
        while (var8_12 < arrayList.size()) {
            if ((Integer)arrayList.get((int)var8_12) == n10) {
                return list.get((int)var8_12);
            }
            ++var8_12;
        }
        return null;
    }

    private static int I(int n, int n2, int n3, int n4) {
        return (int)Math.sqrt(Math.pow(n3 - n, 2.0) + Math.pow(n4 - n2, 2.0));
    }
}

