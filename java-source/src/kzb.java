/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lkv
 */
public class kzb {
    public kzb() {
        this.ceJ();
    }

    private void test() {
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = lkv.euf();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            int n = lkv.AG((String)stringArray[i2]);
            int n2 = lkv.adp((int)n);
            if (n2 != 0x5000000) continue;
            stringBuilder.append("<emote>\n<command value=\"");
            stringBuilder.append(stringArray[i2]);
            stringBuilder.append("\" />\n<animationstate value=\"");
            stringBuilder.append(stringArray[i2]);
            stringBuilder.append("\" />\n</emote>\n");
        }
        System.out.println(stringBuilder.toString());
    }

    private void ceJ() {
        try {
            juf juf2 = new juf();
            juf2.uf("xml-files/gamelogicinfo/resourcetree.xml");
            juf2.ug("xml-files/gamelogicinfo/skilltree.xml");
            String string = "xml-files/gamelogicinfo/TimeStepLists.xml";
            jvr jvr2 = new jvr();
            jvr2.ux(string);
            string = "xml-files/gamelogicinfo/SkillRelationSets.xml";
            jvg jvg2 = new jvg();
            jvg2.ut(string);
        }
        catch (bg bg2) {
            lfn.log("SFCommonTester", bg2);
        }
    }
}

