/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class juk {
    private static final String oSa = "category_tree";
    private static final String oSb = "category";
    private static final String oSc = "notification_categories";
    private static final String oSd = "on_screen_notifications";
    private static final String oSe = "notification";
    private static final String oSf = "name";
    private static final String oSg = "visibility";
    private static final String oSh = "build_type";
    private static final String oSi = "id";
    private static final String oSj = "categories";
    private static final String oSk = "long_duration";
    private static final String oSl = ":";

    private juk() {
    }

    public static void dTs() {
        String string = "xml-files/client/gui/notifications_config.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            assert (false);
            throw bo2;
        }
        NodeList nodeList = document.getElementsByTagName(oSa);
        if (nodeList.getLength() != 1) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Config File Contains Multiple Category Trees!!!");
            assert (false);
            throw new bo(string);
        }
        Node node = nodeList.item(0);
        if (node.getNodeType() != 1) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Category Tree Node is Not An Element!!!");
            assert (false);
            throw new bo(string);
        }
        NodeList nodeList2 = node.getChildNodes();
        if (nodeList2.getLength() != 3) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Category Trees Does Not Contain 1, And Only 1, Root Node!!!");
            assert (false);
            throw new bo(string);
        }
        Node node2 = nodeList2.item(1);
        if (node2.getNodeType() != 1) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Category Tree Root Node is Not An Element!!!");
            assert (false);
            throw new bo(string);
        }
        try {
            juk.v((Element)node2);
        }
        catch (bf bf2) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Exception encountered while parsing XML document!!! Exception Message = " + bf2.getMessage());
            assert (false);
            throw new bo(string, bf2);
        }
        catch (bj bj2) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Exception encountered while parsing XML document!!! Exception Message = " + bj2.getMessage());
            assert (false);
            throw new bo(string, bj2);
        }
        catch (bn bn2) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Exception encountered while parsing XML document!!! Exception Message = " + bn2.getMessage());
            assert (false);
            throw new bo(string, bn2);
        }
        catch (jso jso2) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Exception encountered while parsing XML document!!! Exception Message = " + jso2.getMessage());
            assert (false);
            throw new bo(string, jso2);
        }
        NodeList nodeList3 = document.getElementsByTagName(oSc);
        if (nodeList3.getLength() != 1) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Config File Contains Multiple Notification Categories Groups!!!");
            assert (false);
            throw new bo(string);
        }
        Node node3 = nodeList3.item(0);
        if (node3.getNodeType() != 1) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Notification Categories Node is Not An Element!!!");
            assert (false);
            throw new bo(string);
        }
        try {
            juk.w((Element)node3);
        }
        catch (bf bf3) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Exception encountered while parsing XML document!!! Exception Message = " + bf3.getMessage());
            assert (false);
            throw new bo(string, bf3);
        }
        catch (bj bj3) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Exception encountered while parsing XML document!!! Exception Message = " + bj3.getMessage());
            assert (false);
            throw new bo(string, bj3);
        }
        catch (bn bn3) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Exception encountered while parsing XML document!!! Exception Message = " + bn3.getMessage());
            assert (false);
            throw new bo(string, bn3);
        }
        catch (jso jso3) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Exception encountered while parsing XML document!!! Exception Message = " + jso3.getMessage());
            assert (false);
            throw new bo(string, jso3);
        }
        NodeList nodeList4 = document.getElementsByTagName(oSd);
        if (nodeList4.getLength() != 1) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Config File Contains Multiple On-Screen Notifications Groups!!!");
            assert (false);
            throw new bo(string);
        }
        Node node4 = nodeList4.item(0);
        if (node4.getNodeType() != 1) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : On-Screen Notifications Node is Not An Element!!!");
            assert (false);
            throw new bo(string);
        }
        try {
            juk.x((Element)node4);
        }
        catch (bf bf4) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Exception encountered while parsing XML document!!! Exception Message = " + bf4.getMessage());
            assert (false);
            throw new bo(string, bf4);
        }
        catch (bj bj4) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Exception encountered while parsing XML document!!! Exception Message = " + bj4.getMessage());
            assert (false);
            throw new bo(string, bj4);
        }
        catch (bn bn4) {
            lfn.b(5, "SFNotificationsConfigParser", "loadNotificationsConfig() : Exception encountered while parsing XML document!!! Exception Message = " + bn4.getMessage());
            assert (false);
            throw new bo(string, bn4);
        }
    }

    private static void v(Element element) {
        if (element == null) {
            lfn.b(5, "SFNotificationsConfigParser", "parseCategoryTree() : Root Node is Null!!!");
            assert (false);
            throw new bn(oSb);
        }
        String string = element.getAttribute(oSf);
        if (string == null || string.isEmpty()) {
            lfn.b(5, "SFNotificationsConfigParser", "parseCategoryTree() : Category Node Does Not Contain Category Name Attribute!!!");
            assert (false);
            throw new bf(element, oSf);
        }
        jnt jnt2 = jnt.getCategorySectionByName(string);
        if (jnt2 != jns.dOh().dNZ()) {
            lfn.b(5, "SFNotificationsConfigParser", "parseCategoryTree() : Root Node Category Must Be None!!!");
            assert (false);
            throw new bj("Root Node Value Must Be SFNotificationCategories.None!!!");
        }
        juk.a(element, jns.dOh());
    }

    private static void a(Element element, jns jns2) {
        if (element == null || jns2 == null) {
            lfn.b(5, "SFNotificationsConfigParser", "parseSubCategories() : Root Node is Null!!!");
            assert (false);
            throw new bn(oSb);
        }
        NodeList nodeList = element.getChildNodes();
        if (nodeList.getLength() > 0) {
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                jns jns3;
                Node node = nodeList.item(i2);
                if (node.getNodeType() != 1) continue;
                Element element2 = (Element)node;
                String string = element2.getAttribute(oSf);
                if (string == null || string.isEmpty()) {
                    lfn.b(5, "SFNotificationsConfigParser", "parseSubCategories() : Category Node Does Not Contain Category Name Attribute!!!");
                    assert (false);
                    throw new bf(node, oSf);
                }
                jnt jnt2 = jnt.getCategorySectionByName(string);
                if (jnt2 == jnt.nEx) {
                    lfn.b(5, "SFNotificationsConfigParser", "parseSubCategories() : Node Category Must Not Be None!!!");
                    assert (false);
                    throw new bj("Node Value Cannot Be SFNotificationCategories.None!!!");
                }
                hc hc2 = hc.aaz;
                String string2 = element2.getAttribute(oSg);
                if (string2 != null && !string2.isEmpty() && (hc2 = hc.getAccessLevelType(string2)) == null) {
                    lfn.b(5, "SFNotificationsConfigParser", "parseSubCategories() : Category Contains Invalid Value!!!... Category = " + string + "... VisibilityAttribute = " + string2);
                    assert (false);
                    throw new bj("Category Contains Invalid Value!!!");
                }
                int n = 0;
                if (element2.hasAttribute(oSh)) {
                    n = Integer.parseInt(element2.getAttribute(oSh));
                }
                if ((jns3 = jns2.a(jnt2, hc2, n)) == null) {
                    lfn.b(5, "SFNotificationsConfigParser", "parseSubCategories() : Failed to Create Tree-Node, XML Node Must Be Duplicate!!!... Category = " + (Object)((Object)jnt2));
                    assert (false);
                    throw new jso(node);
                }
                juk.a(element2, jns3);
            }
        }
    }

    private static void w(Element element) {
        if (element == null) {
            lfn.b(5, "SFNotificationsConfigParser", "parseNotificationCategories() : Node is Null!!!");
            assert (false);
            throw new bn(oSc);
        }
        NodeList nodeList = element.getChildNodes();
        if (nodeList.getLength() > 0) {
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                Node node = nodeList.item(i2);
                if (node.getNodeType() != 1) continue;
                Element element2 = (Element)node;
                String string = element2.getAttribute(oSi);
                if (string == null || string.isEmpty()) {
                    lfn.b(5, "SFNotificationsConfigParser", "parseNotificationCategories() : Notification Category Node Does Not Contain Notification ID Attribute!!!");
                    assert (false);
                    throw new bf(node, oSi);
                }
                String string2 = element2.getAttribute(oSj);
                if (string2 == null || string2.isEmpty()) {
                    lfn.b(5, "SFNotificationsConfigParser", "parseNotificationCategories() : Notification Category Node Does Not Contain Notification Categories Attribute!!!");
                    assert (false);
                    throw new bf(node, oSj);
                }
                String[] stringArray = string2.split(oSl);
                jnt[] jntArray = new jnt[stringArray.length];
                for (int i3 = 0; i3 < stringArray.length; ++i3) {
                    jntArray[i3] = jnt.getCategorySectionByName(stringArray[i3]);
                    if (jntArray[i3] != jnt.nEx) continue;
                    lfn.b(5, "SFNotificationsConfigParser", "parseNotificationCategories() : Notification Category Node Contains SFNotificationCategories.None in its Categories Attribute!!!");
                    assert (false);
                    throw new bj("Notification Category Node Contains SFNotificationCategories.None in its Categories Attribute!!!");
                }
                jns jns2 = jns.a(jntArray);
                if (jns2 == null) {
                    lfn.b(5, "SFNotificationsConfigParser", "parseNotificationCategories() : Notification Category Node Contains Invalid Tree Path!!!");
                    assert (false);
                    throw new bj("Notification Category Node Contains Invalid Tree Path!!!");
                }
                if (jns2.sU(string)) {
                    lfn.b(5, "SFNotificationsConfigParser", "parseSubCategories() : Tree-Node Already Contains Notification ID, XML Node Must Be Duplicate!!!... Notification ID = " + string);
                    assert (false);
                    throw new jso(node);
                }
                jns2.sV(string);
            }
        }
    }

    private static void x(Element element) {
        if (element == null) {
            lfn.b(5, "SFNotificationsConfigParser", "parseOnScreenNotifications() : Node is Null!!!");
            assert (false);
            throw new bn(oSd);
        }
        NodeList nodeList = element.getChildNodes();
        if (nodeList.getLength() > 0) {
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                Node node = nodeList.item(i2);
                if (node.getNodeType() != 1) continue;
                Element element2 = (Element)node;
                String string = element2.getAttribute(oSi);
                if (string == null || string.isEmpty()) {
                    lfn.b(5, "SFNotificationsConfigParser", "parseOnScreenNotifications() : On-Screen Notification Node Does Not Contain Notification ID Attribute!!!");
                    assert (false);
                    throw new bf(element2, oSi);
                }
                boolean bl = false;
                String string2 = element2.getAttribute(oSk);
                if (string2 != null && !string2.isEmpty()) {
                    bl = Boolean.parseBoolean(string2);
                }
                jns.I(string, bl);
            }
        }
    }
}

