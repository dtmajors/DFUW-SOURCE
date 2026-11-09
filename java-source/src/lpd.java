/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public class lpd {
    public static final boolean rHo = false;
    public static final boolean rHp = false;
    public static final boolean rHq = false;
    public static final boolean rHr = false;
    public static final lpd rHs = new lpd();
    private boolean Initialized = false;
    private static DecimalFormat rHt = new DecimalFormat();
    private Locale rHu;
    private List<String> rHv = lcn.emA();
    private Map<String, Map<String, String>> rHw = lcn.emw();
    private Map<String, lox> rHx = lcn.emw();
    private Set<lpc> rHy = lcn.emx();
    private Set<lpa> rHz = lcn.emx();
    private Map<String, String> rHA = lcn.emG();
    private Map<String, String> rHB = lcn.emG();
    private Set<String> rHC = lcn.emx();
    private LinkedList<String> rHD = lcn.emA();
    private List<Locale> rHE = lcn.emv();
    private List<knv> rHF = lcn.emv();
    private int rHG = -1;
    private Map<String, lil<String, String, Double>> rHH = lcn.emw();

    private lpd() {
    }

    void a(lpa lpa2) {
        this.rHz.add(lpa2);
    }

    public lil<String, String, Double> G(loz loz2) {
        if (loz2 == null) {
            return null;
        }
        return this.rHH.get(loz2.exz());
    }

    public static String f(Object object, int n) {
        if (object == null) {
            return "";
        }
        if (!(object instanceof Long || object instanceof Double || object instanceof Float)) {
            assert (false) : "Invalid Object Type : " + object.getClass().getSimpleName();
            return "";
        }
        rHt.setMaximumFractionDigits(n);
        return rHt.format(object);
    }

    void exD() {
        if (this.Initialized) {
            return;
        }
        this.Initialized = true;
        rHt.setMinimumFractionDigits(0);
        if (lcw.ena() || lcw.enb()) {
            this.exM();
            int n = 0;
            String string = Locale.getDefault().getLanguage();
            if (string != null) {
                for (int i = 0; i < this.rHE.size(); ++i) {
                    if (!this.rHE.get(i).toString().substring(0, 2).equalsIgnoreCase(string)) continue;
                    n = i;
                    break;
                }
            }
            this.adW(n);
        } else {
            this.rHE.add(this.BD("en.us"));
            this.adW(0);
        }
        if (lcw.ena() || lcw.enb()) {
            this.exF();
            this.exG();
        }
    }

    private void exE() {
        this.kI("en.US");
    }

    public final void a(lpc lpc2) {
        this.rHy.add(lpc2);
    }

    public final void b(lpc lpc2) {
        this.rHy.remove(lpc2);
    }

    public final void exF() {
        boolean bl = false;
        for (lpa lpa2 : this.rHz) {
            Class<?> clazz = lpa2.getClass();
            for (Field field : clazz.getDeclaredFields()) {
                Annotation annotation;
                Annotation annotation2;
                if (!field.getType().equals(lox.class)) continue;
                String string = field.getName();
                if ((field.getModifiers() & 8) == 0) {
                    lfn.b(5, "SFTranslationManager", "scanStringIDDefinitions: SFStringID field '" + string + "' in '" + clazz.getSimpleName() + "' isn't static");
                    bl = true;
                    continue;
                }
                if ((field.getModifiers() & 0x10) == 0) {
                    lfn.b(5, "SFTranslationManager", "scanStringIDDefinitions: SFStringID field '" + string + "' in '" + clazz.getSimpleName() + "' isn't final");
                    bl = true;
                    continue;
                }
                if ((field.getModifiers() & 1) == 0) {
                    lfn.b(5, "SFTranslationManager", "scanStringIDDefinitions: SFStringID field '" + string + "' in '" + clazz.getSimpleName() + "' isn't public");
                    bl = true;
                    continue;
                }
                lox lox2 = null;
                try {
                    lox2 = (lox)field.get(null);
                }
                catch (IllegalAccessException illegalAccessException) {
                    // empty catch block
                }
                if (lox2 == null) {
                    lfn.b(5, "SFTranslationManager", "scanStringIDDefinitions: SFStringID field '" + string + "' in '" + clazz.getSimpleName() + "' isn't instantiated");
                    bl = true;
                    continue;
                }
                lpk lpk2 = field.getAnnotation(lpk.class);
                if (lpk2 != null) {
                    this.rHH.put(lox2.getIdentifier(), new lil<String, String, Double>(lpk2.value(), lpk2.exP(), lpk2.exQ()));
                }
                if ((annotation2 = field.getAnnotation(lok.class)) == null) {
                    lfn.b(5, "SFTranslationManager", "scanStringIDDefinitions: SFStringID field '" + string + "' in '" + clazz.getSimpleName() + "' doesn't have a default text");
                    bl = true;
                    this.rHA.put(lox2.Identifier, null);
                } else {
                    annotation = annotation2;
                    if (annotation.value().isEmpty()) {
                        lfn.b(5, "SFTranslationManager", "scanStringIDDefinitions: SFStringID field '" + string + "' in '" + clazz.getSimpleName() + "' has an empty default text");
                        bl = true;
                    }
                    this.rHA.put(lox2.Identifier, annotation.value());
                }
                annotation2 = field.getAnnotation(lol.class);
                if (annotation2 != null) {
                    annotation = (lol)annotation2;
                    this.rHB.put(lox2.Identifier, "DO NOT TRANSLATE: " + annotation.value());
                    annotation2 = field.getAnnotation(lpl.class);
                    if (annotation2 != null) {
                        lfn.b(5, "SFTranslationManager", "scanStringIDDefinitions: SFStringID field '" + string + "' in '" + clazz.getSimpleName() + "' has both @NoTranslation and @TextDescription");
                        bl = true;
                    }
                    this.rHC.add(lox2.Identifier);
                    continue;
                }
                annotation2 = field.getAnnotation(lpl.class);
                if (annotation2 == null) {
                    lfn.b(5, "SFTranslationManager", "scanStringIDDefinitions: SFStringID field '" + string + "' in '" + clazz.getSimpleName() + "' doesn't have a text description");
                    bl = true;
                    this.rHB.put(lox2.Identifier, null);
                    continue;
                }
                annotation = (lpl)annotation2;
                if (annotation.value().isEmpty()) {
                    lfn.b(5, "SFTranslationManager", "scanStringIDDefinitions: SFStringID field '" + string + "' in '" + clazz.getSimpleName() + "' has an empty description");
                    bl = true;
                }
                this.rHB.put(lox2.Identifier, annotation.value());
            }
        }
        if (bl) {
            lfn.b(5, "SFTranslationManager", "scanStringIDDefinitions: Errors during string definition processing.");
        }
    }

    private void exG() {
    }

    public final void reload() {
        this.rHw.clear();
        this.exH();
    }

    Locale BD(String string) {
        String string2 = null;
        String string3 = null;
        String string4 = null;
        StringTokenizer stringTokenizer = new StringTokenizer(string, ".");
        if (!stringTokenizer.hasMoreTokens()) {
            lfn.b(5, "SFTranslationManager", "Invalid locale identifier '" + string + "'");
            assert (false);
            return null;
        }
        string2 = stringTokenizer.nextToken();
        if (stringTokenizer.hasMoreTokens()) {
            string3 = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreTokens()) {
            string4 = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreTokens()) {
            lfn.b(5, "SFTranslationManager", "Invalid locale identifier '" + string + "'");
            assert (false);
            return null;
        }
        Locale locale = null;
        locale = string4 != null ? new Locale(string2, string3, string4) : (string3 != null ? new Locale(string2, string3) : new Locale(string2));
        return locale;
    }

    public void adW(int n) {
        if (this.rHG == n) {
            return;
        }
        this.rHG = n;
        this.rHu = this.rHE.get(n);
        if (lcw.ena() || lcw.enb()) {
            loh.aE("Language", this.rHu.toString());
        }
        this.exI();
        this.exH();
    }

    public final void kI(String string) {
        String string2 = null;
        String string3 = null;
        String string4 = null;
        StringTokenizer stringTokenizer = new StringTokenizer(string, ".");
        if (!stringTokenizer.hasMoreTokens()) {
            lfn.b(5, "SFTranslationManager", "Invalid locale identifier '" + string + "'");
            assert (false);
            return;
        }
        string2 = stringTokenizer.nextToken();
        if (stringTokenizer.hasMoreTokens()) {
            string3 = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreTokens()) {
            string4 = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreTokens()) {
            lfn.b(5, "SFTranslationManager", "Invalid locale identifier '" + string + "'");
            assert (false);
            return;
        }
        Locale locale = null;
        locale = string4 != null ? new Locale(string2, string3, string4) : (string3 != null ? new Locale(string2, string3) : new Locale(string2));
        if (this.rHu != null && this.rHu.equals(locale)) {
            return;
        }
        this.rHu = locale;
        this.exI();
        this.exH();
    }

    private void exH() {
        lpc[] lpcArray = this.rHy.toArray(new lpc[this.rHy.size()]);
        for (int i = 0; i < lpcArray.length; ++i) {
            lpcArray[i].VG();
        }
    }

    private void exI() {
        this.rHv.clear();
        this.rHv.add("en");
        if (!this.rHu.getLanguage().equals("en")) {
            this.rHv.add(0, this.rHu.getLanguage());
        }
        if (this.rHu.getCountry() != null) {
            this.rHv.add(0, this.rHu.getLanguage() + "_" + this.rHu.getCountry());
        }
        if (this.rHu.getVariant() != null) {
            this.rHv.add(0, this.rHu.getLanguage() + "_" + this.rHu.getCountry() + "_" + this.rHu.getVariant());
        }
        Iterator<String> iterator = this.rHw.keySet().iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if (this.rHv.contains(string)) continue;
            iterator.remove();
        }
    }

    void j(lox lox2) {
        if (this.rHx.containsKey(lox2.Identifier)) {
            lfn.b(5, "SFTranslationManager", "Duplicate registration of string id '" + lox2.Identifier + "'");
            return;
        }
        this.rHx.put(lox2.Identifier, lox2);
    }

    public final lox BE(String string) {
        return this.rHx.get(string);
    }

    String a(String string, lom lom2) {
        if (this.rHD.isEmpty()) {
            return "[ERR: ExpansionStack is empty for " + string + "]";
        }
        return this.b(this.rHD.getLast() + "." + string, lom2);
    }

    String c(String string, String[] stringArray) {
        lox lox2 = this.rHx.get(string);
        if (lox2 == null) {
            lfn.b(5, "SFTranslationManager", "Attempt to expand unregistered string '" + string + "'");
            return "[UDS:" + string + "]";
        }
        lon lon2 = new lon();
        if (!lon2.a(lox2, stringArray)) {
            lfn.b(5, "SFTranslationManager", "Could not initialize argument lookup for '" + string + "'");
            assert (false);
            return "[ERR:" + string + "]";
        }
        return this.b(string, lon2);
    }

    String b(String string, lom lom2) {
        this.rHD.add(string);
        String string2 = this.BF(string);
        lpe lpe2 = lpe.BI(string2);
        if (lpe2 == null) {
            return "[ERR: " + string2 + "]";
        }
        String string3 = lpe2.a(lom2);
        this.rHD.removeLast();
        return string3;
    }

    String BF(String string) {
        String string2;
        Iterator<String> iterator = this.rHv.iterator();
        while (iterator.hasNext()) {
            String string3;
            string2 = iterator.next();
            Map<String, String> map2 = this.rHw.get(string2);
            if (map2 == null) {
                map2 = lpd.BG(string2);
                if (map2 != null) {
                    this.rHw.put(string2, map2);
                } else {
                    iterator.remove();
                }
            }
            if (map2 == null || (string3 = map2.get(string)) == null) continue;
            return string3;
        }
        string2 = this.rHA.get(string);
        if (string2 == null) {
            string2 = "[UDS:" + string + "]";
        }
        return string2;
    }

    public static Map<String, String> BG(String string) {
        Object object;
        Object object2;
        String string2 = "xml-files/localization/" + string.toLowerCase() + ".xml";
        Document document = null;
        byte[] byArray = null;
        if (lcw.ena()) {
            byArray = loi.exd().AS(string.toLowerCase() + ".xml");
        }
        if (byArray != null && byArray.length > 0) {
            object2 = new ByteArrayInputStream(byArray);
            object = new InputSource((InputStream)object2);
            try {
                document = jsy.a((InputSource)object);
            }
            catch (bo bo2) {
                return null;
            }
        } else {
            document = jsy.tK(string2);
        }
        if (document == null) {
            return null;
        }
        object2 = null;
        object = document.getFirstChild().getChildNodes();
        int n = object.getLength();
        for (int i = 0; i < n; ++i) {
            Element element;
            Node node = object.item(i);
            if (!(node instanceof Element) || !(element = (Element)node).getTagName().equals("Strings")) continue;
            object2 = element;
            break;
        }
        if (object2 == null) {
            lfn.b(5, "SFTranslationManager", "Error parsing " + string2 + " - no Strings element");
            assert (false);
            return null;
        }
        object = object2.getChildNodes();
        Map<String, String> map2 = null;
        List list = null;
        int n2 = object.getLength();
        for (int i = 0; i < n2; ++i) {
            Element element;
            Node node = object.item(i);
            if (!(node instanceof Element) || !(element = (Element)node).getTagName().equals("String")) continue;
            String string3 = element.getAttribute("ID");
            String string4 = element.getAttribute("Value");
            if (string3 == null) {
                lfn.b(5, "SFTranslationManager", "Error in " + string2 + " - String element without 'ID' attribute");
                assert (false);
                continue;
            }
            if (string4 == null) {
                lfn.b(5, "SFTranslationManager", "Error in " + string2 + " - String element without 'Value' attribute");
                assert (false);
                continue;
            }
            if (map2 == null) {
                map2 = lcn.emw();
            }
            if (map2.containsKey(string3)) {
                lfn.b(5, "SFTranslationManager", "Error in " + string2 + " - Multiple definitions of string '" + string3 + "'");
                assert (false);
                continue;
            }
            map2.put(string3, string4);
        }
        if (list != null) {
            for (Node node : list) {
                object2.removeChild(node);
            }
            String string5 = lcw.qLa + "xml-files/localization/updated_" + string.toLowerCase() + ".xml";
            jsz.b(document, string5);
        }
        return map2;
    }

    public static String BH(String string) {
        if (string == null) {
            return "";
        }
        return string.replaceAll("[^\\w\\s]", " ").replaceAll(" ", "_").toLowerCase();
    }

    public List<Locale> exJ() {
        return this.rHE;
    }

    public int exK() {
        return this.rHG;
    }

    public String exL() {
        Locale locale = this.rHE.get(this.rHG);
        return locale.getLanguage() + "_" + locale.getCountry();
    }

    public knv adX(int n) {
        return this.rHF.get(n);
    }

    private void exM() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        String string = "languages.xml";
        Node node = null;
        if (lcw.ena() && (object7 = loi.exd().AS(string)) != null && ((byte[])object7).length != 0) {
            object6 = new ByteArrayInputStream((byte[])object7);
            object5 = new InputSource((InputStream)object6);
            try {
                node = jsy.a((InputSource)object5);
            }
            catch (bo bo2) {
                // empty catch block
            }
        }
        if (node == null) {
            node = jsy.tK("xml-files/localization/" + string);
        }
        object7 = node.getFirstChild();
        object6 = jsy.c("SFLanguage", (Node)object7);
        this.rHE.clear();
        object5 = lcn.emw();
        Object object8 = object6.iterator();
        while (object8.hasNext()) {
            object4 = (Node)object8.next();
            String string2 = object4.getAttributes().getNamedItem("Id").getNodeValue();
            object3 = this.BD(string2);
            if (object3 == null) {
                lfn.b(5, "SFTranslationManager", "parseLanguageFile() invalide locale id " + string2 + " specified in languages.xml");
                assert (false);
                continue;
            }
            object2 = new knv();
            ((knv)object2).pRf = object4.getAttributes().getNamedItem("FontLibrary").getNodeValue();
            object = jsy.c("SFFontMapping", (Node)object4);
            ((knv)object2).pRg = new String[object.size()];
            ((knv)object2).pRh = new String[object.size()];
            ((knv)object2).pRi = new int[object.size()];
            ((knv)object2).pRj = new float[object.size()];
            for (int i = 0; i < object.size(); ++i) {
                Node node2 = (Node)object.get(i);
                ((knv)object2).pRg[i] = node2.getAttributes().getNamedItem("Name").getNodeValue();
                ((knv)object2).pRh[i] = node2.getAttributes().getNamedItem("Family").getNodeValue();
                ((knv)object2).pRi[i] = Integer.valueOf(node2.getAttributes().getNamedItem("Style").getNodeValue());
                ((knv)object2).pRj[i] = Float.valueOf(node2.getAttributes().getNamedItem("Scale").getNodeValue()).floatValue();
            }
            object5.put(object3, object2);
        }
        if (lcw.ena() || lcw.enb()) {
            int n = 0;
            object4 = loh.getRegistryValue("LanguageCount");
            if (object4 != null) {
                try {
                    n = Integer.valueOf((String)object4);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                if (n == 0) {
                    lfn.b(5, "SFTranslationManager", "parseLanguageFile() Language count is 0. string is " + (String)object4);
                }
            } else {
                lfn.b(5, "SFTranslationManager", "parseLanguageFile() Language count is null");
            }
            for (int i = 0; i < n; ++i) {
                object3 = loh.getRegistryValue("Language" + i);
                if (((String)object3).toLowerCase().contains("ko")) {
                    lcw.bcB = 2;
                }
                if ((object = (knv)object5.get(object2 = this.BD((String)object3))) == null) {
                    lfn.b(5, "SFTranslationManager", "parseLanguageFile() counld not find font mapping for locale " + (String)object3);
                    continue;
                }
                this.rHE.add((Locale)object2);
                this.rHF.add((knv)object);
            }
            if (this.rHE.size() == 0) {
                lfn.b(5, "SFTranslationManager", "parseLanguageFile() no valid locales read from the registry. defaulting to backup values");
                Locale locale = this.BD("en.us");
                this.rHE.add(locale);
                object3 = (knv)object5.get(locale);
                if (object3 == null) {
                    lfn.b(5, "SFTranslationManager", "parseLanguageFile() no font mapping found for fallback en.us. crash iminent. FontMappingsSize=" + this.rHF.size());
                }
                this.rHF.add((knv)object3);
            }
        } else {
            object8 = this.BD("en.us");
            this.rHE.add((Locale)object8);
            this.rHF.add((knv)object5.get(object8));
        }
    }

    public boolean exN() {
        return this.exL().substring(0, 2).equalsIgnoreCase("kr") || this.exL().substring(0, 2).equalsIgnoreCase("ko");
    }

    public boolean exO() {
        return this.exL().substring(0, 2).equalsIgnoreCase("jp") || this.exL().substring(0, 2).equalsIgnoreCase("ja");
    }
}

