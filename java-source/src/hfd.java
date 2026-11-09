/*
 * Decompiled with CFR.
 */
import java.util.IllegalFormatException;
import java.util.Map;

public class hfd {
    public final hfe jIm;
    Map<a, Object> kgC = lcn.emw();
    Map<String, Map<a, Object>> kgD = lcn.emw();
    Map<String, Map<a, Object>> kgE = lcn.emw();

    public hfd(hfe hfe2) {
        this.jIm = hfe2;
    }

    private void a(lfu lfu2, a a2, Map<a, Object> map) {
        Object object = this.b(a2);
        if (object instanceof Boolean) {
            Boolean bl = lfu2.V(a2.toString(), (Boolean)object);
            if (!bl.equals(object)) {
                map.put(a2, bl);
            }
        } else if (object instanceof Integer) {
            Integer n = lfu2.ad(a2.toString(), (Integer)object);
            if (!n.equals(object)) {
                map.put(a2, n);
            }
        } else if (object instanceof String) {
            String string = lfu2.aA(a2.toString(), (String)object);
            if (!string.equals(object)) {
                map.put(a2, string);
            }
        } else if (object instanceof b) {
            String string = lfu2.aA(a2.toString(), ((b)((Object)object)).toString());
            if (string.equals(object.toString())) {
                return;
            }
            try {
                if (b.valueOf(string) == null) {
                    return;
                }
            }
            catch (IllegalFormatException illegalFormatException) {
                return;
            }
            map.put(a2, (Object)b.valueOf(string));
        } else if (object instanceof hfa) {
            String string = lfu2.aA(a2.toString(), ((hfa)((Object)object)).toString());
            if (string.equals(object.toString())) {
                return;
            }
            try {
                if (hfa.valueOf(string) == null) {
                    return;
                }
            }
            catch (IllegalFormatException illegalFormatException) {
                return;
            }
            map.put(a2, (Object)hfa.valueOf(string));
        }
    }

    public void i(lfu lfu2) {
        Map<a, Object> map;
        Object object;
        int n;
        lfu lfu3 = lfu2.zC("Global");
        a[] aArray = a.VALUES;
        int n2 = aArray.length;
        for (n = 0; n < n2; ++n) {
            object = aArray[n];
            this.a(lfu3, (a)((Object)object), this.kgC);
        }
        int n3 = lfu2.ad("WindowCount", 0);
        lfu3 = lfu2.zC("Windows");
        for (n2 = 0; n2 < n3; ++n2) {
            String string = lfu2.aA("Window" + n2 + "ID", "");
            if (string.isEmpty()) continue;
            object = lfu3.zC(string);
            map = this.kgD.get(string);
            if (map == null) {
                map = lcn.emw();
                this.kgD.put(string, map);
            } else {
                map.clear();
            }
            for (a a2 : a.VALUES) {
                this.a((lfu)object, a2, map);
            }
            if (!map.isEmpty()) continue;
            this.kgD.remove(string);
        }
        n2 = lfu2.ad("ViewCount", 0);
        lfu3 = lfu2.zC("Views");
        for (n = 0; n < n2; ++n) {
            object = lfu2.aA("View" + n + "ID", "");
            if (((String)object).isEmpty()) continue;
            map = lfu3.zC((String)object);
            Object object2 = this.kgE.get(object);
            if (object2 == null) {
                object2 = lcn.emw();
                this.kgE.put((String)object, (Map<a, Object>)object2);
            } else {
                object2.clear();
            }
            for (a a3 : a.VALUES) {
                this.a((lfu)((Object)map), a3, (Map<a, Object>)object2);
            }
            if (!object2.isEmpty()) continue;
            this.kgE.remove(object);
        }
    }

    private void a(lfu lfu2, a a2, Object object) {
        if (object instanceof Boolean) {
            lfu2.V(a2.toString(), (Boolean)object);
        } else if (object instanceof Integer) {
            lfu2.ad(a2.toString(), (Integer)object);
        } else if (object instanceof String) {
            lfu2.aA(a2.toString(), (String)object);
        } else if (object instanceof b) {
            lfu2.aA(a2.toString(), ((b)((Object)object)).toString());
        } else if (object instanceof hfa) {
            lfu2.aA(a2.toString(), ((hfa)((Object)object)).toString());
        }
    }

    public void c(lfu lfu2) {
        Map<a, Object> map;
        lfu lfu3;
        lfu lfu4 = lfu2.zC("Global");
        for (a object : this.kgC.keySet()) {
            Object object2 = this.kgC.get((Object)object);
            this.a(lfu4, object, object2);
        }
        lfu4 = lfu2.zC("Windows");
        int n = 0;
        for (String string : this.kgD.keySet()) {
            lfu2.aA("Window" + n + "ID", string);
            lfu3 = lfu4.zC(string);
            map = this.kgD.get(string);
            for (a a2 : map.keySet()) {
                this.a(lfu3, a2, map.get((Object)a2));
            }
            ++n;
        }
        lfu2.ad("WindowCount", n);
        n = 0;
        lfu4 = lfu2.zC("Views");
        for (String string : this.kgE.keySet()) {
            lfu2.aA("View" + n + "ID", string);
            lfu3 = lfu4.zC(string);
            map = this.kgE.get(string);
            for (a a2 : map.keySet()) {
                this.a(lfu3, a2, map.get((Object)a2));
            }
            ++n;
        }
        lfu2.ad("ViewCount", n);
    }

    public Object b(a a2) {
        switch (a2) {
            case GlobalEnterDeactivatesInGameMode: {
                return Boolean.TRUE;
            }
            case GlobalEnterDeactivatesInGUIMode: {
                return Boolean.FALSE;
            }
            case GlobalHistoryLength: {
                return 1000;
            }
            case GlobalHistoryAge: {
                return 24;
            }
            case GlobalLogging: {
                return Boolean.FALSE;
            }
            case GlobalSmallScrollerLocation: {
                return b.BottomLeft;
            }
            case GlobalMediumScrollerLocation: {
                return b.LowerCenter;
            }
            case GlobalLargeScrollerLocation: {
                return b.UpperCenter;
            }
            case GlobalHighlightHighColorName: {
                return "red";
            }
            case GlobalHighlightMediumColorName: {
                return "orange";
            }
            case GlobalHighlightLowColorName: {
                return "green";
            }
            case GlobalMaxRememberedDetachedViews: {
                return 20;
            }
            case GlobalTimestamps: {
                return Boolean.TRUE;
            }
            case GlobalSecondsInTimestamps: {
                return Boolean.TRUE;
            }
            case WindowAutoShowOnAttach: {
                return Boolean.TRUE;
            }
            case WindowMaxHighlightLevel: {
                return hfa.LEVEL_HIGH;
            }
            case WindowAffectedByMainMenu: {
                return Boolean.TRUE;
            }
            case ViewAutoAttachOnChange: {
                return Boolean.TRUE;
            }
            case ViewAutoAttachOnHighlightRaise: {
                return Boolean.TRUE;
            }
            case ViewMaxHighlightLevel: {
                return hfa.LEVEL_HIGH;
            }
            case ViewMaxHistoryLength: {
                return 200;
            }
            case ViewMaxHistoryAge: {
                return 24;
            }
            case ViewRedisplayHistory: {
                return Boolean.TRUE;
            }
        }
        assert (false);
        return null;
    }

    public boolean c(a a2) {
        return this.kgC.containsKey((Object)a2);
    }

    public Object d(a a2) {
        Object object = this.kgC.get((Object)a2);
        if (object == null) {
            return this.b(a2);
        }
        return object;
    }

    public void a(a a2, Object object) {
        if (object.equals(this.d(a2))) {
            return;
        }
        this.kgC.put(a2, object);
        this.jIm.f(a2);
    }

    public void e(a a2) {
        if (!this.kgC.containsKey((Object)a2)) {
            return;
        }
        this.kgC.remove((Object)a2);
        this.jIm.f(a2);
    }

    public boolean a(String string, a a2) {
        Map<a, Object> map = this.kgD.get(string);
        if (map == null) {
            return false;
        }
        return map.containsKey((Object)a2);
    }

    public Object b(String string, a a2) {
        Map<a, Object> map = this.kgD.get(string);
        if (map == null) {
            return this.b(a2);
        }
        Object object = map.get((Object)a2);
        if (object == null) {
            return this.b(a2);
        }
        return object;
    }

    public void a(String string, a a2, Object object) {
        if (this.b(string, a2).equals(object)) {
            return;
        }
        Map<a, Object> map = this.kgD.get(string);
        if (map == null) {
            map = lcn.emw();
            this.kgD.put(string, map);
        }
        map.put(a2, object);
        this.jIm.g(string, a2);
    }

    public void c(String string, a a2) {
        Map<a, Object> map = this.kgD.get(string);
        if (map == null) {
            return;
        }
        if (!map.containsKey((Object)a2)) {
            return;
        }
        map.remove((Object)a2);
        this.jIm.g(string, a2);
    }

    public boolean d(String string, a a2) {
        Map<a, Object> map = this.kgE.get(string);
        if (map == null) {
            return false;
        }
        return map.containsKey((Object)a2);
    }

    public Object e(String string, a a2) {
        Map<a, Object> map = this.kgE.get(string);
        if (map == null) {
            return this.b(a2);
        }
        Object object = map.get((Object)a2);
        if (object == null) {
            return this.b(a2);
        }
        return object;
    }

    public void b(String string, a a2, Object object) {
        if (this.e(string, a2).equals(object)) {
            return;
        }
        Map<a, Object> map = this.kgE.get(string);
        if (map == null) {
            map = lcn.emw();
            this.kgE.put(string, map);
        }
        map.put(a2, object);
        this.jIm.h(string, a2);
    }

    public void f(String string, a a2) {
        Map<a, Object> map = this.kgE.get(string);
        if (map == null) {
            return;
        }
        if (!map.containsKey((Object)a2)) {
            return;
        }
        map.remove((Object)a2);
        this.jIm.h(string, a2);
    }

    public void mp(String string) {
        this.kgD.remove(string);
    }

    public void mq(String string) {
        this.kgE.remove(string);
    }

    public boolean cgm() {
        return (Boolean)this.d(a.GlobalEnterDeactivatesInGameMode);
    }

    public boolean cgn() {
        return (Boolean)this.d(a.GlobalEnterDeactivatesInGUIMode);
    }

    public int cgo() {
        return (Integer)this.d(a.GlobalHistoryLength);
    }

    public int cgp() {
        return (Integer)this.d(a.GlobalHistoryAge);
    }

    public boolean cgq() {
        return (Boolean)this.d(a.GlobalLogging);
    }

    public b cgr() {
        return (b)((Object)this.d(a.GlobalSmallScrollerLocation));
    }

    public b cgs() {
        return (b)((Object)this.d(a.GlobalMediumScrollerLocation));
    }

    public b cgt() {
        return (b)((Object)this.d(a.GlobalLargeScrollerLocation));
    }

    public String cgu() {
        return (String)this.d(a.GlobalHighlightHighColorName);
    }

    public String cgv() {
        return (String)this.d(a.GlobalHighlightMediumColorName);
    }

    public String cgw() {
        return (String)this.d(a.GlobalHighlightLowColorName);
    }

    public int cgx() {
        return (Integer)this.d(a.GlobalMaxRememberedDetachedViews);
    }

    public boolean cgy() {
        return (Boolean)this.d(a.GlobalTimestamps);
    }

    public boolean cgz() {
        return (Boolean)this.d(a.GlobalSecondsInTimestamps);
    }

    public boolean mr(String string) {
        return (Boolean)this.b(string, a.WindowAutoShowOnAttach);
    }

    public hfa ms(String string) {
        return (hfa)((Object)this.b(string, a.WindowMaxHighlightLevel));
    }

    public boolean mt(String string) {
        return (Boolean)this.b(string, a.WindowAffectedByMainMenu);
    }

    public boolean mu(String string) {
        return (Boolean)this.e(string, a.ViewAutoAttachOnChange);
    }

    public boolean mv(String string) {
        return (Boolean)this.e(string, a.ViewAutoAttachOnHighlightRaise);
    }

    public hfa mw(String string) {
        return (hfa)((Object)this.e(string, a.ViewMaxHighlightLevel));
    }

    public int mx(String string) {
        return (Integer)this.e(string, a.ViewMaxHistoryLength);
    }

    public int my(String string) {
        return (Integer)this.e(string, a.ViewMaxHistoryAge);
    }

    public boolean mz(String string) {
        return (Boolean)this.e(string, a.ViewRedisplayHistory);
    }

    void a(hiv hiv2, b b2) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        switch (b2) {
            case TopLeft: 
            case TopCenter: 
            case TopRight: {
                f3 = 0.02f;
                break;
            }
            case UpperLeft: 
            case UpperCenter: 
            case UpperRight: {
                f3 = 0.3f;
                break;
            }
            case MiddleLeft: 
            case MiddleCenter: 
            case MiddleRight: {
                f3 = 0.5f;
                break;
            }
            case LowerLeft: 
            case LowerCenter: 
            case LowerRight: {
                f3 = 0.7f;
                break;
            }
            case BottomLeft: 
            case BottomCenter: 
            case BottomRight: {
                f3 = 0.98f;
            }
        }
        switch (b2) {
            case TopLeft: 
            case UpperLeft: 
            case MiddleLeft: 
            case LowerLeft: 
            case BottomLeft: {
                f2 = 0.02f;
                break;
            }
            case TopCenter: 
            case UpperCenter: 
            case MiddleCenter: 
            case LowerCenter: 
            case BottomCenter: {
                f2 = 0.5f;
                break;
            }
            case TopRight: 
            case UpperRight: 
            case MiddleRight: 
            case LowerRight: 
            case BottomRight: {
                f2 = 0.98f;
            }
        }
        hiv2.jW(f2);
        hiv2.jX(f3);
        hiv2.nR(b2 == b.Hidden);
    }

    public lcq b(hfa hfa2) {
        String string = null;
        switch (hfa2) {
            case LEVEL_HIGH: {
                string = this.cgu();
                break;
            }
            case LEVEL_MEDIUM: {
                string = this.cgv();
                break;
            }
            case LEVEL_LOW: {
                string = this.cgw();
                break;
            }
            case LEVEL_NONE: {
                assert (false);
                string = "white";
            }
        }
        if (string != null) {
            for (hez hez2 : lea.rhD) {
                if (!hez2.DisplayName.equalsIgnoreCase(string)) continue;
                return hez2.dMT;
            }
        }
        return lcq.BRIGHT_WHITE;
    }
}

