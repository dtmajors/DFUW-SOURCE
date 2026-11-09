/*
 * Decompiled with CFR.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class biv
extends btk
implements bto {
    private DocumentBuilder dni;
    private Transformer dnj;
    private Map<String, Class<? extends bgk>> ald = lcn.emw();
    private Map<String, a> dnk = lcn.emw();
    private Set<ldv> dnl = lcn.emH();
    private Map<ldv, Set<bgk>> dnm = lcn.emw();
    private bgh Tq = null;
    private bix dnn = null;
    private boolean fE = true;

    String[] apr() {
        return this.ald.keySet().toArray(new String[0]);
    }

    a fD(String string) {
        return this.dnk.get(string);
    }

    private void aps() {
        this.a(a.dno, "sample", bia.class);
        this.a(a.dnp, "disconnectclients", bhb.class);
        this.a(a.dno, "list_commands", bhl.class);
        this.a(a.dnp, "list_players", bhn.class);
        this.a(a.dnp, "loginreq_set", bho.class);
        this.a(a.dnp, "loginreq_query", bho.class);
        this.a(a.dnq, "shutdown", bid.class);
        this.a(a.dnp, "trafficmonitor_start", bip.class);
        this.a(a.dnp, "trafficmonitor_stop", bip.class);
        this.a(a.dnp, "streamplayers_start", bik.class);
        this.a(a.dnp, "streamplayers_stop", bik.class);
        this.a(a.dnp, "streamplayers_param", bik.class);
        this.a(a.dnp, "streamplayers_info", bgz.class);
        this.a(a.dnp, "admin_sendglobal_onscreen_message", bib.class);
        this.a(a.dnp, "admin_sendpersonal_onscreen_message", bic.class);
        this.a(a.dnp, "admin_sendglobal_message", bhi.class);
        this.a(a.dnq, "ai_config", bgl.class);
        this.a(a.dnp, "spawn_watch", bih.class);
        this.a(a.dnp, "resource_give_player", bhy.class);
        this.a(a.dnp, "resource_give_character", bhx.class);
        this.a(a.dnq, "streamchat_start", bij.class);
        this.a(a.dnq, "streamchat_stop", bij.class);
        this.a(a.dnq, "print_objects", bht.class);
        this.a(a.dnq, "engine_distr_test", bio.class);
        this.a(a.dnq, "engine_distr_test_params", bhq.class);
        this.a(biz.dnI, "fetchbindstoneposition", biz.class);
        this.a(biy.dnI, biy.dnH[0], biy.class);
        this.a(biy.dnI, biy.dnH[1], biy.class);
        this.a(bjb.dnI, bjb.dnH[0], bjb.class);
        this.a(bjb.dnI, bjb.dnH[1], bjb.class);
        this.a(bja.dnI, "getplayerspawnposition", bja.class);
        this.a(a.dnq, "count_objects_on_nodes", bhm.class);
        this.a(a.dnq, "skill_level_set_player", bie.class);
        this.a(a.dnq, "city_admin_management", bhp.class);
        this.a(a.dnq, "attribute_value_set_player", bgj.class);
        this.a(a.dnq, "save_all", bir.class);
        this.a(a.dnq, "yield", biu.class);
        this.a(a.dnq, "subscriptionproperty", bim.class);
        this.a(a.dnq, "submonitor_start", bil.class);
        this.a(a.dnq, "submonitor_stop", bil.class);
        this.a(a.dnq, "cf_configure", bgs.class);
        this.a(a.dnq, "cf_execute", bgs.class);
        this.a(a.dnq, "cf_quarantine", bgs.class);
        this.a(a.dnq, "cf_add", bgs.class);
        this.a(a.dnq, "cf_remove", bgs.class);
        this.a(a.dnq, "cf_replace", bgs.class);
        this.a(a.dnq, "unspawn_all", bis.class);
        this.a(a.dnq, "weather_manager", bgt.class);
        this.a(a.dnq, "conquest_extend_timers", bhf.class);
        this.a(a.dnq, "update_shutdown_info", bit.class);
        this.a(a.dnq, "alloc_dump", bgm.class);
        this.a(a.dnq, "alloc_stats", bgm.class);
        this.a(a.dnq, "persistence_get", bhr.class);
        this.a(a.dnq, "persistence_set", bhr.class);
        this.a(a.dnq, "transfer_city_ownership", biq.class);
        this.a(a.dnq, "remove_player_from_clan", bhv.class);
        this.a(a.dnq, "skill_xp_gain_modifier_print", bif.class);
        this.a(a.dnq, "skill_xp_gain_modifier_set", big.class);
        this.a(a.dnq, "performance_analysis_query_object", bhu.class);
        this.a(a.dnq, "performance_analysis_audit_objects", bgo.class);
        this.a(a.dnq, "conquest_abort_city", bgu.class);
        this.a(a.dnq, "conquest_abort_clan", bgv.class);
        this.a(a.dnq, "conquest_config_set", bgx.class);
        this.a(a.dnq, "conquest_adjust_timer", bgw.class);
        this.a(a.dnq, "conquest_set_grace_period", bgy.class);
        this.a(a.dnq, "list_spawnpoints", bjf.class);
        this.a(a.dnq, "get_spawnpoint_player_count", bje.class);
        this.a(a.dnq, "get_player_spawn_info", bjd.class);
        this.a(a.dnq, "stats_objects_in_player_os", bjj.class);
        this.a(a.dnq, "delete_character", bha.class);
        this.a(a.dnq, "reset_camp_flag", bhw.class);
        this.a(a.dnq, "change_character_account", bgq.class);
        this.a(a.dnq, "build_city", bgp.class);
        this.a(a.dnq, "announce_server_down_time_maintenance", bhd.class);
        this.a(a.dnq, "announce_server_down_time_patch", bhe.class);
        this.a(a.dnq, "stop_market_expiration_handler", bii.class);
        this.a(a.dnq, "restore_character", bhz.class);
        this.a(a.dnp, "character_info", bgr.class);
        this.a(a.dnp, "gamelogic_info", bhh.class);
        this.a(a.dnq, "fortress_system_vulnerability_start", bhg.class);
        this.a(a.dnq, "subscription_stats", bin.class);
        this.a(a.dnq, "alter_player_points", bgn.class);
        this.a(a.dnq, "java_exception", bhj.class);
        this.a(a.dnq, "villages_distribute_requisition_timers", bhc.class);
        this.a(a.dnq, "leaderboards_do_startup_handling", bhk.class);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.Active = true;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.Tq != null) {
            this.MessageDelegator.hd(this.Tq.getGUID());
            this.Tq = null;
        }
    }

    public biv() {
        try {
            this.dni = jtf.dSE();
            this.dnj = TransformerFactory.newInstance().newTransformer();
        }
        catch (Exception exception) {
            this.dni = null;
            this.dnj = null;
        }
        this.aps();
    }

    private void a(a a2, String string, Class<? extends bgk> clazz) {
        assert (!this.ald.containsKey(string));
        this.ald.put(string, clazz);
        this.dnk.put(string, a2);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.dnl.isEmpty()) {
            for (ldv ldv2 : this.dnl) {
                this.MessageDelegator.hd(ldv2);
            }
            this.dnl.clear();
        }
        if (this.fE) {
            this.Tq = new bgh();
            this.Tq.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.Tq);
            bhn.Tq = this.Tq;
            bgz.Tq = this.Tq;
            bik.Tq = this.Tq;
            bgl.Tq = this.Tq;
            bih.Tq = this.Tq;
            bgs.Tq = this.Tq;
            this.dnn = new bix();
            this.dnn.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.dnn);
            biy.dnn = this.dnn;
            bjb.dnn = this.dnn;
            this.fE = false;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 6159: 
            case 11075: 
            case 11077: {
                this.Tq.receiveMessage(dxq2);
                break;
            }
            case 11059: {
                this.Tq.receiveMessage(dxq2);
                if (bjc.dnK == null) break;
                bjc.dnK.receiveMessage(dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 270: {
                this.a((kcs)kcz2);
                break;
            }
            case 271: {
                this.a((kct)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    void a(kcs kcs2) {
        if (this.dnm.get(kcs2.hsQ) == null) {
            return;
        }
        LinkedList<bgk> linkedList = lcn.emA();
        linkedList.addAll((Collection<bgk>)this.dnm.get(kcs2.hsQ));
        for (bgk bgk2 : linkedList) {
            bgk2.aoT();
        }
    }

    void a(bgk bgk2, String string) {
        this.dnl.add(bgk2.getGUID());
        this.a(bgk2.dlj, bgk2.akV, bgk2.dlh, string);
        Set<bgk> set = this.dnm.get(bgk2.dlj);
        if (set == null || !set.contains(bgk2)) {
            return;
        }
        set.remove(bgk2);
        if (set.isEmpty()) {
            this.dnm.remove(bgk2.dlj);
        }
    }

    void a(bgk bgk2) {
        this.dnl.add(bgk2.getGUID());
        Set<bgk> set = this.dnm.get(bgk2.dlj);
        if (set == null || !set.contains(bgk2)) {
            return;
        }
        set.remove(bgk2);
        if (set.isEmpty()) {
            this.dnm.remove(bgk2.dlj);
        }
    }

    private void a(ldv ldv2, String string, String string2, String string3) {
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("Error", string3);
        treeMap.put("4D0709D2-A7F7-4b37-8515-1A0FD4BFCC0F", "FALSE");
        this.a(ldv2, string, string2, treeMap);
    }

    void a(ldv ldv2, String string, String string2, Map<String, String> map) {
        kcu kcu2 = (kcu)this.MessageDelegator.i(272, this.getGUID(), ldv2);
        Document document = this.dni.newDocument();
        Element element = document.createElement("Response");
        document.appendChild(element);
        Element element2 = document.createElement("Command");
        if (string != null) {
            element2.setAttribute("Name", string);
        }
        if (string2 != null) {
            element2.setAttribute("ID", string2);
        }
        element.appendChild(element2);
        for (Map.Entry<String, String> object2 : map.entrySet()) {
            element2 = document.createElement("Result");
            element2.setAttribute("Name", object2.getKey());
            element2.setAttribute("Value", object2.getValue());
            element.appendChild(element2);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        StreamResult streamResult = new StreamResult(byteArrayOutputStream);
        DOMSource dOMSource = new DOMSource(document);
        try {
            this.dnj.reset();
            this.dnj.setOutputProperty("indent", "yes");
            this.dnj.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            this.dnj.setOutputProperty("encoding", "UTF-8");
            this.dnj.setOutputProperty("omit-xml-declaration", "no");
            this.dnj.transform(dOMSource, streamResult);
            byteArrayOutputStream.flush();
        }
        catch (Throwable throwable) {
            return;
        }
        kcu2.XML = new String(byteArrayOutputStream.toByteArray(), Charset.forName("UTF-8"));
        this.MessageDelegator.b(kcu2);
    }

    private void a(kct kct2) {
        Class<? extends bgk> clazz;
        Object object;
        Object object2;
        InputSource inputSource;
        Document document;
        if (kct2.XML == null) {
            this.a(kct2.aO(), null, null, "XML is null");
            assert (false);
            return;
        }
        if (this.dni == null) {
            this.a(kct2.aO(), null, null, "Builder is null");
            assert (false);
        }
        if ((document = this.a(inputSource = new InputSource(new ByteArrayInputStream(kct2.XML.getBytes())))) == null) {
            this.a(kct2.aO(), null, null, "Could not parse XML");
            return;
        }
        NodeList nodeList = document.getElementsByTagName("Command");
        if (nodeList == null || nodeList.getLength() != 1) {
            this.a(kct2.aO(), null, null, "Malformed XML, no or multiple Command elements");
            return;
        }
        Element element = (Element)nodeList.item(0);
        if (!element.hasAttribute("Name")) {
            this.a(kct2.aO(), null, null, "Malformed XML, Command element has no Name attribute");
            return;
        }
        String string = element.getAttribute("Name");
        String string2 = element.getAttribute("ID");
        nodeList = document.getElementsByTagName("Param");
        TreeMap<String, String> treeMap = lcn.emG();
        if (nodeList != null) {
            for (int i = 0; i < nodeList.getLength(); ++i) {
                element = (Element)nodeList.item(i);
                if (!element.hasAttribute("Name")) {
                    this.a(kct2.aO(), string, string2, "Malformed XML, Param element without Name attribute");
                    return;
                }
                if (!element.hasAttribute("Value")) {
                    this.a(kct2.aO(), string, string2, "Malformed XML, Param element without Value attribute");
                    return;
                }
                object2 = element.getAttribute("Name");
                object = element.getAttribute("Value");
                if (treeMap.containsKey(object2)) {
                    this.a(kct2.aO(), string, string2, "Malformed XML, duplicate Param '" + (String)object2 + "'");
                    return;
                }
                treeMap.put((String)object2, (String)object);
            }
        }
        if ((clazz = this.ald.get(string)) == null) {
            this.a(kct2.aO(), string, string2, "No handler registered for '" + string + "'");
            return;
        }
        object2 = this.dnk.get(string);
        if (object2 == null) {
            object2 = a.dnq;
        }
        if (kct2.ff < object2.ordinal()) {
            this.a(kct2.aO(), string, string2, "No handler registered for '" + string + "'");
            return;
        }
        object = null;
        try {
            object = clazz.newInstance();
        }
        catch (Throwable throwable) {
            this.a(kct2.aO(), string, string2, "" + throwable);
            return;
        }
        if (object == null) {
            assert (false) : "wtf?";
            return;
        }
        ((bgk)object).akV = string;
        ((bgk)object).dlm = treeMap;
        ((bgk)object).dlh = string2;
        ((bgk)object).dlj = kct2.aO();
        ((bgk)object).dli = this;
        ((bgk)object).dlk = a.values()[kct2.ff];
        ((amf)object).setGUID(this.MessageDelegator.bzv());
        Set<bgk> set = this.dnm.get(((bgk)object).dlj);
        if (set == null) {
            set = lcn.emx();
            this.dnm.put(((bgk)object).dlj, set);
        }
        set.add((bgk)object);
        this.MessageDelegator.a((amf)object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Document a(InputSource inputSource) {
        if (this.dni == null) {
            return null;
        }
        try {
            Document document = null;
            DocumentBuilder documentBuilder = this.dni;
            synchronized (documentBuilder) {
                document = this.dni.parse(inputSource);
                this.dni.reset();
            }
            return document;
        }
        catch (SAXException sAXException) {
            this.dni.reset();
            return null;
        }
        catch (IOException iOException) {
            this.dni.reset();
            return null;
        }
    }

    public bgh hj() {
        return this.Tq;
    }
}

