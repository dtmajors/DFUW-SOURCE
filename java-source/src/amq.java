/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class amq {
    public static final String bzU = lcw.qLb + "xml-files/server/resourcecontainers/monster inventory/";
    public static final String bzV = lcw.qLb + "xml-files/server/resource/";
    public static boolean bzW = true;
    private static Document bzX;
    private static String bzY;
    private static final String[] bzZ;
    private static final Set<String> bAa;

    public static void a(File file, a a2, String string, double d2) {
        try {
            bzY = file.getName();
            DocumentBuilder documentBuilder = jtf.dSE();
            bzX = documentBuilder.parse(file);
            a2 = a2 == null ? a.bAc : a2;
            switch (a2) {
                case bAg: {
                    amq.dG(string);
                    break;
                }
                case bAd: {
                    amq.dF(string);
                    break;
                }
                case bAf: {
                    amq.a(string, d2);
                    break;
                }
                case bAe: {
                    amq.b(string, d2);
                    break;
                }
                case bAc: {
                    break;
                }
                default: {
                    amq.bg(true);
                }
            }
            amq.a(file);
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Cannot find file: " + file);
        }
        catch (ParserConfigurationException parserConfigurationException) {
            System.err.println("file: " + file);
            parserConfigurationException.printStackTrace();
        }
        catch (SAXException sAXException) {
            System.err.println("file: " + file);
            sAXException.printStackTrace();
        }
        catch (IOException iOException) {
            System.err.println("file: " + file);
            iOException.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b(File file, a a2, String string, double d2) {
        BufferedReader bufferedReader = null;
        try {
            String string2;
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((string2 = bufferedReader.readLine()) != null) {
                File file2 = new File(string2);
                if (!file2.exists() || !file2.isFile()) continue;
                amq.a(file2, a2, string, d2);
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File not found: " + file);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    public static void main(String[] stringArray) {
        Object object;
        File file = null;
        File file2 = null;
        String string = null;
        double d2 = -1.0;
        a a2 = null;
        for (int i = 0; i < stringArray.length; ++i) {
            if (!stringArray[i].startsWith("-")) {
                amq.bg(true);
                continue;
            }
            if (stringArray[i].equals("-h") || stringArray[i].equals("-help")) {
                amq.bg(true);
                continue;
            }
            if (stringArray[i].equals("-i")) {
                if (file2 == null && i + 1 < stringArray.length && !stringArray[i + 1].startsWith("-")) {
                    file = new File(bzU + stringArray[++i]);
                    if (file.isFile() && file.exists()) continue;
                    amq.bg(true);
                    continue;
                }
                amq.bg(true);
                continue;
            }
            if (stringArray[i].equals("-f")) {
                if (file == null && i + 1 < stringArray.length && !stringArray[i + 1].startsWith("-")) {
                    if ((file2 = new File(stringArray[++i])).isFile() && file2.exists()) continue;
                    amq.bg(true);
                    continue;
                }
                amq.bg(true);
                continue;
            }
            if (stringArray[i].equals("-a")) {
                if (a2 == null && i + 1 < stringArray.length && !stringArray[i + 1].startsWith("-")) {
                    a2 = a.valueOf(stringArray[++i].toUpperCase());
                    continue;
                }
                amq.bg(true);
                continue;
            }
            if (stringArray[i].equals("-r")) {
                if (string == null && i + 1 < stringArray.length && !stringArray[i + 1].startsWith("-")) {
                    string = stringArray[++i];
                    continue;
                }
                amq.bg(true);
                continue;
            }
            if (stringArray[i].equals("-x")) {
                if (d2 != -1.0 || i + 1 >= stringArray.length || stringArray[i + 1].startsWith("-")) continue;
                try {
                    d2 = Double.parseDouble(stringArray[++i]);
                }
                catch (NumberFormatException numberFormatException) {
                    amq.bg(true);
                }
                continue;
            }
            if (stringArray[i].equals("-w")) {
                if (i + 1 < stringArray.length && !stringArray[i + 1].startsWith("-")) {
                    bzW = Boolean.parseBoolean(stringArray[++i]);
                    continue;
                }
                amq.bg(true);
                continue;
            }
            amq.bg(true);
        }
        Object object2 = new File[]{};
        if (file2 == null && file == null) {
            object = new File(bzU);
            object2 = ((File)object).listFiles(new FileFilter(){

                public boolean accept(File file) {
                    return file.getName().startsWith("inv_");
                }
            });
        }
        if (file2 != null) {
            amq.b(file2, a2, string, d2);
        } else if (file != null) {
            object = new File[((File[])object2).length + 1];
            System.arraycopy(object2, 0, object, 0, ((File[])object2).length);
            object2 = object;
            object2[((File[])object2).length - 1] = file;
        }
        for (File file3 : object2) {
            amq.a(file3, a2, string, d2);
        }
    }

    private static void a(String string, double d2) {
        NodeList nodeList = bzX.getElementsByTagName("SFItem");
        for (int i = 0; i < nodeList.getLength(); ++i) {
            int n;
            Node node;
            Element element = (Element)nodeList.item(i);
            NamedNodeMap namedNodeMap = element.getAttributes();
            Node node2 = namedNodeMap.getNamedItem("ResourceName");
            if (node2 == null) continue;
            node2.setNodeValue(node2.getNodeValue().toLowerCase());
            String string2 = node2.getNodeValue();
            if (string != null && !string2.equalsIgnoreCase(string)) continue;
            Node node3 = namedNodeMap.getNamedItem("MinQuantity");
            if (node3 == null) {
                node = namedNodeMap.getNamedItem("Quantity");
                if (node == null) continue;
                n = (int)Math.max(1.0, (double)Integer.parseInt(node.getNodeValue()) * d2);
                element.setAttribute("Quantity", Integer.toString(n));
                continue;
            }
            node = namedNodeMap.getNamedItem("MaxQuantity");
            if (node == null) continue;
            n = (int)Math.max(1.0, (double)Integer.parseInt(node3.getNodeValue()) * d2);
            int n2 = (int)Math.max(2.0, (double)Integer.parseInt(node.getNodeValue()) * d2);
            element.setAttribute("MinQuantity", Integer.toString(n));
            element.setAttribute("MaxQuantity", Integer.toString(n2));
        }
    }

    private static void a(File file) {
        try {
            DOMSource dOMSource = new DOMSource(bzX);
            StreamResult streamResult = !bzW ? new StreamResult(new StringWriter()) : new StreamResult(file);
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty("indent", "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformer.transform(dOMSource, streamResult);
            if (!bzW) {
                System.out.println("Check your modifications are OK then run it without -w or with '-w true'\n\n--- start of file " + bzY + " ---");
                System.out.println(streamResult.getWriter().toString());
                System.out.println("--- end of file " + bzY + " ---");
            }
        }
        catch (TransformerConfigurationException transformerConfigurationException) {
            transformerConfigurationException.printStackTrace();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
        }
        catch (TransformerFactoryConfigurationError transformerFactoryConfigurationError) {
            transformerFactoryConfigurationError.printStackTrace();
        }
        catch (TransformerException transformerException) {
            transformerException.printStackTrace();
        }
    }

    private static void dF(String string) {
        NodeList nodeList = bzX.getElementsByTagName("SFItem");
        for (int i = 0; i < nodeList.getLength(); ++i) {
            Node node;
            Element element = (Element)nodeList.item(i);
            NamedNodeMap namedNodeMap = element.getAttributes();
            Node node2 = namedNodeMap.getNamedItem("ResourceName");
            if (node2 == null) continue;
            node2.setNodeValue(node2.getNodeValue().toLowerCase());
            String string2 = node2.getNodeValue();
            if (string != null && !string2.equalsIgnoreCase(string) || !bAa.contains(string2) || (node = namedNodeMap.getNamedItem("Quantity")) == null) continue;
            int n = Integer.parseInt(node.getNodeValue());
            int n2 = Math.max(1, (int)Math.ceil((double)n * 0.5));
            int n3 = Math.max(2, (int)Math.floor((double)n * 1.5));
            element.removeAttribute(node.getNodeName());
            element.setAttribute("MinQuantity", Integer.toString(n2));
            element.setAttribute("MaxQuantity", Integer.toString(n3));
        }
    }

    private static void b(String string, double d2) {
        if (d2 > 1.0) {
            d2 = 1.0;
        }
        NodeList nodeList = bzX.getElementsByTagName("SFItem");
        for (int i = 0; i < nodeList.getLength(); ++i) {
            Node node;
            NamedNodeMap namedNodeMap;
            Node node2;
            Element element = (Element)nodeList.item(i);
            if (element.getParentNode().getNodeName().equalsIgnoreCase("SFRandomItem") || (node2 = (namedNodeMap = element.getAttributes()).getNamedItem("ResourceName")) == null) continue;
            node2.setNodeValue(node2.getNodeValue().toLowerCase());
            String string2 = node2.getNodeValue();
            if (string != null && !string2.equalsIgnoreCase(string) || (node = namedNodeMap.getNamedItem("Probability")) == null) continue;
            node.setNodeValue(String.valueOf(d2));
        }
    }

    private static void dG(String string) {
        NodeList nodeList = bzX.getElementsByTagName("SFItem");
        for (int i = 0; i < nodeList.getLength(); ++i) {
            Node node;
            Node node2;
            Element element = (Element)nodeList.item(i);
            NamedNodeMap namedNodeMap = element.getAttributes();
            Node node3 = namedNodeMap.getNamedItem("ResourceName");
            if (node3 == null) continue;
            node3.setNodeValue(node3.getNodeValue().toLowerCase());
            String string2 = node3.getNodeValue();
            if (string != null && !string2.equalsIgnoreCase(string) || !bAa.contains(string2) || (node2 = namedNodeMap.getNamedItem("MinQuantity")) == null || (node = namedNodeMap.getNamedItem("MaxQuantity")) == null) continue;
            int n = Integer.parseInt(node2.getNodeValue());
            int n2 = Integer.parseInt(node.getNodeValue());
            int n3 = (int)Math.max(1.0, Math.floor((double)(n + n2) / 2.0));
            element.removeAttribute(node2.getNodeName());
            element.removeAttribute(node.getNodeName());
            element.setAttribute("Quantity", Integer.toString(n3));
        }
    }

    static String bg(boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[-h|-help] [[-i|-f] fileName] [-a action] [-r resource] [-x amount] [-w true|false]");
        stringBuilder.append('\n');
        stringBuilder.append("\t-h/-help\tprints this.");
        stringBuilder.append('\n');
        stringBuilder.append("\t-i fileName\tsingle inventory file to modify.");
        stringBuilder.append('\n');
        stringBuilder.append("\t-f fileName\tloads inventory files from fileName (one inventory file per line in fileName).");
        stringBuilder.append('\n');
        stringBuilder.append("\t-a action\tModulate|Unmodulate|Quantity|Probability|Format.");
        stringBuilder.append('\n');
        stringBuilder.append("\t\t\tModulate - Replace any fixed quantity X into MinQuantity/MaxQuantity where Min=0.7*X and Max=1.3*X.");
        stringBuilder.append('\n');
        stringBuilder.append("\t\t\tUnmodulate - Any modulated quantity expressed as Min/Max will be converted to a single Quantity=(Min+Max)/2.");
        stringBuilder.append('\n');
        stringBuilder.append("\t\t\tQuantity - re-sets the quantity of a resource(s).");
        stringBuilder.append('\n');
        stringBuilder.append("\t\t\tProbability - re-sets the probability of a resource(s).");
        stringBuilder.append('\n');
        stringBuilder.append("\t\t\tFormat - Print prettify the XML file.");
        stringBuilder.append('\n');
        stringBuilder.append("\t-r resource\tthe resource to fix (e.g. r_gold)");
        stringBuilder.append('\n');
        stringBuilder.append("\t-x amount\twhen used with action \"adjust\" is the new value (expressed as a percentage) of Quantity (or Min/Max) (e.g. 1.2 adds 20% to the old value, 0.4 removes 60%).");
        stringBuilder.append('\n');
        stringBuilder.append("\t\t\twhen used with action \"probability\" sets the probability to that value.");
        stringBuilder.append('\n');
        stringBuilder.append("\t-w true|false\t if true then it will write to file (it will modify the file(s)) else it will output to screen what it would do (for testing).");
        stringBuilder.append('\n');
        stringBuilder.append("\t\t\tdefault is true (hence it WILL overwrite the file.");
        stringBuilder.append('\n');
        stringBuilder.append('\n');
        stringBuilder.append(">>> You want to quote the file name if it contains spaces. <<<");
        stringBuilder.append('\n');
        stringBuilder.append("All switches are optionals. If no file is indicated, then the program will work on all the");
        stringBuilder.append('\n');
        stringBuilder.append("inventory files in the inventories directory. If run without parameters, the program will only format the XML file(s).");
        stringBuilder.append('\n');
        stringBuilder.append("The action format is provided as a convenience to format a file(s) without performing any other action.");
        stringBuilder.append('\n');
        stringBuilder.append("");
        if (bl) {
            System.out.println(stringBuilder.toString());
            System.exit(1);
        }
        return stringBuilder.toString();
    }

    static {
        bzZ = new String[]{"r_ancient quintessence", "r_apple", "r_apple pie", "r_arachnid darktaint", "r_arachnid venom sac", "r_archangelica", "r_arrow_01", "r_ashes", "r_baneberry", "r_bass", "r_beastman tooth", "r_below darktaint", "r_bile", "r_blood", "r_blueberries", "r_bone", "r_bread", "r_broken horn", "r_brownie quartz", "r_carrot", "r_carrot soup", "r_cheese", "r_ciel fey eye", "r_cinder", "r_claw", "r_cloth", "r_cod", "r_cooked cod", "r_cooked trout", "r_corner shield", "r_corpseflesh", "r_dark quintessence", "r_darktaint", "r_death fang", "r_deathless shadowcrest", "r_demons ember", "r_dim stormrune", "r_dragon bone", "r_dragon scale", "r_egg", "r_eldritch cinder", "r_elemental cinder", "r_elemental hoarfrost", "r_elemental quartz", "r_elemental stormrune", "r_emet lifeforce", "r_empty bottle", "r_eodrin eye", "r_evil eye bile", "r_eye", "r_feral lifeforce", "r_fiend claw", "r_fire giant cinder", "r_foul venom sac", "r_fried lobster", "r_gargantua horn", "r_gaunt bile", "r_gem amethyst", "r_gem aventurine", "r_gem crystal", "r_gem diamond", "r_gem emerald", "r_gem garnet", "r_gem ruby", "r_gem sapphire", "r_gem turquoise", "r_ghost claw", "r_ghostly darktaint", "r_ghoul hoarfrost", "r_giant bone", "r_giant eye", "r_giant tooth", "r_goblin tooth", "r_goblinoid shadowcrest", "r_gold", "r_golem hoarfrost", "r_golem quartz", "r_golem sparkstone", "r_greenleaf", "r_grenade_01", "r_grenade_02", "r_grenade_03", "r_grilled swordfish", "r_guardian lifeforce", "r_hellbore", "r_herring", "r_hivekin claw", "r_hoarfrost", "r_hobgoblin eye", "r_hooked claw", "r_horn", "r_ichor", "r_iklit venom sac", "r_iron ingot", "r_iron ore", "r_leather", "r_leenspar ingot", "r_leenspar ore", "r_lizard on stick", "r_lobster", "r_mandrake", "r_matayin claw", "r_meat", "r_meat jerky", "r_meat stew", "r_melechar shadowcrest", "r_metal sparkstone", "r_minotaur horn", "r_module building", "r_module cannon", "r_module ship", "r_module warhulk", "r_nacre", "r_neithal ingot", "r_neithal ore", "r_nifl frost", "r_nith", "r_numen", "r_oaklord greenleaf", "r_oathbound corpseflesh", "r_omelette", "r_oncylusian corpseflesh", "r_onion", "r_ork blood", "r_ork darktaint", "r_pearl", "r_potatoes", "r_potion clean slate", "r_potion clear mind", "r_potion first aid", "r_potion health major", "r_potion health minor", "r_potion health moderate", "r_potion mana major", "r_potion mana minor", "r_potion mana moderate", "r_potion panacea", "r_potion rejuvenation", "r_potion remedy", "r_potion stamina major", "r_potion stamina minor", "r_potion stamina moderate", "r_potion suppress weakness", "r_primeval quintessence", "r_quartz", "r_queen venom sac", "r_quintessence", "r_radiant quartz", "r_rakta blood", "r_reptile cinder", "r_resin", "r_resonant stormrune", "r_revenant corpseflesh", "r_sadayel eye", "r_sahuls darktaint", "r_salmon", "r_sarlid bile", "r_sausage", "r_searing sparkstone", "r_seedwood", "r_selentine ingot", "r_selentine ore", "r_serpentine greenleaf", "r_severii bone", "r_shadowcrest", "r_sheperds pie", "r_smoked bass", "r_smoked salmon", "r_snake greenleaf", "r_snakeweed", "r_sparkstone", "r_steedgrass", "r_stone", "r_stormrune", "r_strawberries", "r_sulfur", "r_swordfish", "r_sylvan lifeforce", "r_taint of khamset", "r_tasty herring", "r_theyril ingot", "r_theyril ore", "r_timber", "r_tooth", "r_troll blood", "r_troll tooth", "r_trout", "r_undeath sparkstone", "r_veilron ingot", "r_veilron ore", "r_venom sac", "r_vital quintessence", "r_wheat", "r_wildberries", "r_wind shadowcrest", "r_wood", "r_yggdrasil leaf", "r_zombie corpseflesh"};
        bAa = new HashSet<String>();
        bAa.addAll(Arrays.asList(bzZ));
    }
}

