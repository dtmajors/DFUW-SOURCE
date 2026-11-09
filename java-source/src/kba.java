/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kba {
    public static final lju eM = new lju(0, 1, 0);
    private les DX = lea.enT();
    private les aqN = lea.enZ();
    private les ResourceTree = lea.enW();

    public void wb(String string) {
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        Annotations.configureAliases(xStream, ale.class);
        Annotations.configureAliases(xStream, alf.class);
        Annotations.configureAliases(xStream, alg.class);
        Annotations.configureAliases(xStream, alh.class);
        String string2 = null;
        try {
            string2 = jry.ti(string);
        }
        catch (Exception exception) {
            throw new bs("Parsing of file '" + string + "' failed.", exception);
        }
        Map<Integer, ald> map = lea.eog();
        Object object = xStream.fromXML(string2);
        List list = (List)object;
        for (ald ald2 : list) {
            int n;
            ald ald3;
            if (ald2 instanceof ale) {
                ald3 = (ale)ald2;
                n = this.DX.getType(ald3.EffectName);
                if (n <= 0) {
                    throw new bj("EffectName '" + ald3.EffectName + "' is invalid.");
                }
                int n2 = this.aqN.getType(ald3.SkillName);
                if (n2 <= 0) {
                    throw new bj("SkillName '" + ald3.SkillName + "' is invalid.");
                }
                ald3.aYG = n;
                ald3.SkillType = n2;
                ald3.EffectName = null;
                ald3.SkillName = null;
            } else if (ald2 instanceof alf) {
                ald3 = (alf)ald2;
                ((alf)ald3).bqd = new int[((alf)ald3).ResourceNames.length];
                int n3 = ((alf)ald3).ResourceNames.length;
                for (n = 0; n < n3; ++n) {
                    int n4 = this.ResourceTree.getType(((alf)ald3).ResourceNames[n]);
                    if (n4 <= 0) {
                        throw new bj("ResourceName '" + ((alf)ald3).ResourceNames[n] + "' is invalid.");
                    }
                    ((alf)ald3).bqd[n] = n4;
                }
                ((alf)ald3).ResourceNames = null;
            } else if (ald2 instanceof alg) {
                ald3 = (alg)ald2;
                n = ep.as((String)((alg)ald3).AttributeName);
                if (n <= 0) {
                    throw new bj("AttributeName '" + ((alg)ald3).AttributeName + "' is invalid.");
                }
                ldi ldi2 = (ldi)this.DX.zx(((alg)ald3).EffectName);
                if (ldi2 == null) {
                    throw new bj("EffectName '" + ((alg)ald3).EffectName + "' is invalid.");
                }
                lce[] lceArray = ldi2.enl();
                if (lceArray == null || lceArray.length == 0) {
                    throw new bj("Effect '" + ((alg)ald3).EffectName + "' has no attributealterations.");
                }
                ((alg)ald3).bnM = n;
                ((alg)ald3).aYG = ldi2.getType();
                ((alg)ald3).AttributeName = null;
                ((alg)ald3).EffectName = null;
            } else if (ald2 instanceof alh) {
                ald3 = (alh)ald2;
                n = ep.as((String)((alh)ald3).AttributeName);
                if (n <= 0) {
                    throw new bj("AttributeName '" + ((alh)ald3).AttributeName + "' is invalid.");
                }
                ((alh)ald3).bnM = n;
                ((alh)ald3).AttributeName = null;
            }
            ald2.validate();
            if (map.containsKey(ald2.Type)) {
                throw new bj("EnchantmentInfo '" + ald2.Name + "' already exists.");
            }
            map.put(ald2.Type, ald2);
        }
    }

    public void wc(String string) {
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        Annotations.configureAliases(xStream, cui.class);
        String string2 = null;
        try {
            string2 = jry.ti(string);
        }
        catch (Exception exception) {
            throw new bs("Parsing of file '" + string + "' failed.", exception);
        }
        Object object = xStream.fromXML(string2);
        List list = (List)object;
        for (cui cui2 : list) {
            cui2.bqd = new int[cui2.ResourceNames.length];
            int n = cui2.ResourceNames.length;
            for (int i2 = 0; i2 < n; ++i2) {
                int n2 = this.ResourceTree.getType(cui2.ResourceNames[i2]);
                if (n2 <= 0) {
                    throw new bj("ResourceName '" + cui2.ResourceNames[i2] + "' is invalid.");
                }
                cui2.bqd[i2] = n2;
            }
            cui2.ResourceNames = null;
            cui2.bbS();
            if (cxj.iz(cui2.Name)) {
                throw new bj("ResourceGroup '" + cui2.Name + "' already exists.");
            }
            cxj.a(cui2);
        }
    }

    public void wd(String string) {
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, eM);
            NodeList nodeList = document.getElementsByTagName("FileName");
            if (nodeList.getLength() == 0) {
                return;
            }
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    Node node = nodeList.item(i2);
                    String string2 = jsy.m(node);
                    if (string2 == null || string2.trim().equals("")) {
                        throw new bj("Node 'FileName' has invalid value.");
                    }
                    String string3 = "xml-files/server/enchanting/" + string2;
                    this.wf(string3);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of craftingrecipefile " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    public void we(String string) {
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        Annotations.configureAliases(xStream, ale.class);
        Annotations.configureAliases(xStream, alf.class);
        Annotations.configureAliases(xStream, alg.class);
        Annotations.configureAliases(xStream, alh.class);
        Map<Integer, ald> map = lea.eog();
        ArrayList<ald> arrayList = lcn.emv();
        for (ald object2 : map.values()) {
            ald ald2;
            if (object2 instanceof ale) {
                ald2 = (ale)object2;
                ((ale)ald2).EffectName = ((ale)ald2).CE();
            } else if (object2 instanceof alf) {
                ald2 = (alf)object2;
                ((alf)ald2).ResourceNames = new String[((alf)ald2).bqd.length];
                int n = ((alf)ald2).ResourceNames.length;
                for (int i2 = 0; i2 < n; ++i2) {
                    ((alf)ald2).ResourceNames[i2] = this.ResourceTree.getName(((alf)ald2).bqd[i2]);
                }
            } else if (object2 instanceof alg) {
                ald2 = (alg)object2;
                ((alg)ald2).AttributeName = ((alg)ald2).getAttributeName();
            } else if (object2 instanceof alh) {
                ald2 = (alh)object2;
                ((alh)ald2).AttributeName = ((alh)ald2).getAttributeName();
            }
            arrayList.add(object2);
        }
        String string2 = xStream.toXML(arrayList);
        Document document = jsy.tL(string2);
        jsz.a(document, new jrw(string));
    }

    private void wf(String string) {
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        Annotations.configureAliases(xStream, ctw.class);
        Annotations.configureAliases(xStream, cty.class);
        String string2 = null;
        try {
            string2 = jry.ti(string);
        }
        catch (Exception exception) {
            throw new bs("Parsing of file '" + string + "' failed.", exception);
        }
        Map<Integer, ctw> map = lea.eoe();
        Map<Integer, cty> map2 = lea.eof();
        Map<Integer, Integer> map3 = lea.eoh();
        Object object = xStream.fromXML(string2);
        List list = (List)object;
        for (ctx ctx2 : list) {
            int n;
            Object object2;
            Object object3;
            if (ctx2 instanceof ctw) {
                object3 = (ctw)ctx2;
                object2 = lea.zt(((ctw)object3).EnchantmentName);
                if (object2 == null) {
                    throw new bj("EnchantmentName '" + ((ctw)object3).EnchantmentName + "' is invalid.");
                }
                ((ctw)object3).Ps = ((ald)object2).Type;
                ((ctw)object3).EnchantmentName = null;
            } else if (ctx2 instanceof cty) {
                object3 = (cty)ctx2;
                ((cty)object3).dhr = this.ResourceTree.getType(((cty)object3).TargetResourceName);
                if (((cty)object3).dhr <= 0) {
                    throw new bj("TargetResourceName '" + ((cty)object3).TargetResourceName + "' is invalid.");
                }
                ((cty)object3).TargetResourceName = null;
            }
            ctx2.fgp = new ctm();
            ctx2.fgp.ResourceType = this.ResourceTree.getType(ctx2.RareIngredientResourceName);
            if (ctx2.fgp.ResourceType <= 0) {
                throw new bj("RareIngredientResourceName '" + ctx2.RareIngredientResourceName + "' is invalid.");
            }
            ctx2.fgp.asi = 1;
            ctx2.Ingredients = new ctm[ctx2.IngredientResourceNames.length];
            int n2 = ctx2.Ingredients.length;
            for (n = 0; n < n2; ++n) {
                ctx2.Ingredients[n] = new ctm();
                ctx2.Ingredients[n].ResourceType = this.ResourceTree.getType(ctx2.IngredientResourceNames[n]);
                if (ctx2.Ingredients[n].ResourceType <= 0) {
                    throw new bj("IngredientResourceName '" + ctx2.IngredientResourceNames[n] + "' is invalid.");
                }
                ctx2.Ingredients[n].asi = 5;
            }
            ctx2.IngredientResourceTypes = new int[4];
            ctx2.IngredientResourceTypes[0] = ctx2.fgp.ResourceType;
            n2 = ctx2.Ingredients.length;
            for (n = 0; n < n2; ++n) {
                ctx2.IngredientResourceTypes[n + 1] = ctx2.Ingredients[n].ResourceType;
            }
            object3 = cxj.iA(ctx2.ResourceGroupName);
            if (object3 == null) {
                throw new bj("ResourceGroupName '" + ctx2.ResourceGroupName + "' is invalid.");
            }
            ctx2.IngredientResourceNames = null;
            ctx2.RareIngredientResourceName = null;
            ctx2.validate();
            if (ctx2 instanceof ctw) {
                object2 = (ctw)ctx2;
                ald ald2 = ((ctw)object2).fH();
                if (((cui)object3).NeedsPrefixEnchantmentName && ald2.PrefixName == null) {
                    throw new bg("Recipe '" + ctx2.Name + "' has targetgroup that needs prefixname but enchantmentinfo has null prefixname.");
                }
                if (((cui)object3).NeedsPostfixEnchantmentName && ald2.PostfixName == null) {
                    throw new bg("Recipe '" + ctx2.Name + "' has targetgroup that needs postfixname but enchantmentinfo has null postfixname.");
                }
                if (map.containsKey(ctx2.Type)) {
                    throw new bj("RecipeEnchantment '" + ctx2.Name + "' already exists.");
                }
                map.put(ctx2.Type, (ctw)ctx2);
                continue;
            }
            if (map2.containsKey(ctx2.Type)) {
                throw new bj("RecipeTransmutation '" + ctx2.Name + "' already exists.");
            }
            object2 = (cty)ctx2;
            map2.put(ctx2.Type, (cty)object2);
            map3.put(((cty)object2).dhr, ((cty)object2).Type);
        }
    }
}

