/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.List;
import java.util.Map;

public class dvg {
    private static final Map<String, Float> hfo = lcn.emw();
    private static final Map<Integer, Float>[] fGK = new Map[3];
    private static final Map<String, Float> hfp = lcn.emw();

    public static void a(dvh dvh2) {
        int n;
        float f2;
        Object object;
        for (int n2 : cwy.bfh()) {
            dvg.fGK[n2] = lcn.emw();
        }
        Object object2 = lea.enW();
        ler ler2 = ((les)object2).acv(cug.fgG);
        List<ler> list = ((les)object2).a(ler2, true, false);
        for (ler ler3 : list) {
            int n3 = ((lgw)ler3).getType();
            float f3 = cug.uM((int)n3);
            if (!(f3 > 0.0f)) continue;
            object = ((les)object2).getName(n3);
            hfo.put((String)object, Float.valueOf(f3));
        }
        for (Object object3 : (ler)cwy.bfh()) {
            object = cwy.xh((int)object3);
            for (Map.Entry<Integer, ctu> object4 : object.entrySet()) {
                f2 = 0.0f;
                n = object4.getKey();
                ctu ctu2 = object4.getValue();
                ctm[] ctmArray = ctu2.Ingredients;
                float f3 = ctu2.bbF();
                float f4 = ctu2.bbG();
                float f5 = ctu2.vf();
                for (ctm ctm2 : ctmArray) {
                    if (((les)object2).isDescendant(ctm2.ResourceType, cug.fkb)) {
                        f2 += 1.0f * (float)ctm2.asi;
                        continue;
                    }
                    float f6 = ((lgw)((les)object2).acv(ctm2.ResourceType)).erL();
                    f2 += f6 * (float)ctm2.asi;
                }
                f2 = f2 * f5 + f3 + f4;
                fGK[object3].put(n, new Float(f2));
            }
        }
        ler ler4 = ((les)object2).acv(cug.fnJ);
        List<ler> list2 = ((les)object2).a(ler4, true, false);
        for (ler ler5 : list2) {
            int n4 = ler5.getType();
            String string = ((les)object2).getName(n4);
            lgw lgw2 = (lgw)((les)object2).acv(n4);
            f2 = lgw2.erL();
            if (f2 == 0.0f && (n = cug.uI((int)n4)) != -1) {
                lgw lgw3 = (lgw)((les)object2).acv(n);
                f2 = lgw3.erL();
            }
            if (f2 == 0.0f) {
                f2 = cug.uM((int)n4);
            }
            if (f2 == 0.0f) {
                f2 = 1.0f;
            }
            hfp.put(string, Float.valueOf(f2));
        }
    }

    public static float a(ali[] aliArray, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < aliArray.length; ++i) {
            float f4;
            ali ali2 = aliArray[i];
            if (ali2 == null) {
                lfn.b(5, "SFStatsItemValue", "getIngredientsValue() SFEnchantmentIngredient [" + i + "] IS NULL");
                assert (false);
                return f3;
            }
            int n = ali2.ResourceType;
            assert (n > 0);
            if (i == 0) {
                f4 = ((lgw)lea.enW().acv(ali2.ResourceType)).erL();
                f3 += f4 * 1.0f;
                continue;
            }
            f4 = ((lgw)lea.enW().acv(ali2.ResourceType)).erL();
            f3 += f4 * 5.0f;
        }
        return f3 + f2;
    }

    public static float cb(int n, int n2) {
        if (lea.enW().isDescendant(n, cug.fkd)) {
            Map<Integer, Float> map;
            Float f2 = Float.valueOf(1.0f);
            int n3 = cwy.xi(n2);
            if (n3 != -1 && (map = fGK[n3]) != null && !map.isEmpty() && (f2 = map.get(n)) != null) {
                return f2.floatValue();
            }
        }
        lfn.b(5, "SFStatsItemValue", "getTotalCraftingBaseCostValue() ResourceType [" + n + "] CraftingSkillType [" + n2 + "]");
        assert (false);
        return 1.0f;
    }

    public static float Cz(int n) {
        String string = lea.enW().getName(n);
        if (string == null) {
            lfn.b(5, "SFStatsItemValue", "getTotalBaseCostValue() ResourceType [" + n + "] is invalid");
            return 0.0f;
        }
        if (lea.enW().isDescendant(n, cug.fgG)) {
            Float f2 = hfo.get(string);
            if (f2 == null) {
                return 1.0f;
            }
            return f2.floatValue();
        }
        if (lea.enW().isDescendant(n, cug.fnJ)) {
            Float f3 = hfp.get(string);
            if (f3 != null) {
                return f3.floatValue();
            }
            return 1.0f;
        }
        return 1.0f;
    }
}

