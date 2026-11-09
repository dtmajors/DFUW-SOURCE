/*
 * Decompiled with CFR.
 */
public class ifx
extends ifv {
    @Override
    public float a(ljq ljq2, boolean bl, che che2, ljq ljq3) {
        chh chh2 = (chh)che2;
        les les2 = lea.enZ();
        float f = Float.MAX_VALUE;
        boolean bl2 = false;
        for (igg igg2 : igj.lSu) {
            float f2;
            if (igg2.cTd() != bl || !les2.isDescendant(igg2.cTe().fyi, chh2.SkillType) || !((f2 = igg2.cY(ljq2)) < f)) continue;
            f = f2;
            bl2 = true;
            ljq3.ex(igg2.av());
        }
        return bl2 ? f : -1.0f;
    }
}

