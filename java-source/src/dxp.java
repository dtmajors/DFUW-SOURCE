/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.apache.commons.collections.MultiMap;

public class dxp {
    private static final long hsy = 10L;
    private static final long hsz = 10L;
    private long hsA = 0L;
    private static final char[] hsB = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private final Random DZ = new Random();
    private final Map<String, ldv> hsC = lcn.emw();
    private final Map<ldv, String> hsD = lcn.emw();
    private final Map<String, dxo> hsE = lcn.emw();
    private final MultiMap hsF = lcn.emB();
    private final Map<Long, dxo> hsG = lcn.emG();
    private static long hsH = 0L;
    public static final int hsI = 5;
    private final Map<String, lfs<Long, Integer>> hsJ = lcn.emw();
    private final Map<String, lfs<Long, Integer>> hsK = lcn.emw();
    private static final long hsL = 15L;
    private static final int hsM = 3;
    private static final int hsN = 4;

    public boolean jK(String string) {
        if (!this.hsJ.containsKey(string)) {
            this.hsJ.put(string, new lfs<Long, Integer>(dxp.bEv(), 1));
            return true;
        }
        lfs<Long, Integer> lfs2 = this.hsJ.get(string);
        if ((Integer)lfs2.reY >= 3) {
            return false;
        }
        this.hsJ.put(string, new lfs<Long, Integer>(dxp.bEv(), (Integer)lfs2.reY + 1));
        return true;
    }

    public boolean jL(String string) {
        if (!this.hsK.containsKey(string)) {
            this.hsK.put(string, new lfs<Long, Integer>(dxp.bEv(), 1));
            return true;
        }
        lfs<Long, Integer> lfs2 = this.hsK.get(string);
        if ((Integer)lfs2.reY >= 4) {
            return false;
        }
        this.hsK.put(string, new lfs<Long, Integer>(dxp.bEv(), (Integer)lfs2.reY + 1));
        return true;
    }

    public void bEt() {
        if (this.hsK.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, lfs<Long, Integer>>> iterator = this.hsK.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, lfs<Long, Integer>> entry = iterator.next();
            String string = entry.getKey();
            lfs<Long, Integer> lfs2 = entry.getValue();
            Long l2 = (Long)lfs2.reX;
            long l3 = dxp.bEv();
            if (l3 - l2 <= 900000000L) continue;
            iterator.remove();
        }
    }

    public void bEu() {
        if (this.hsJ.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, lfs<Long, Integer>>> iterator = this.hsJ.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, lfs<Long, Integer>> entry = iterator.next();
            String string = entry.getKey();
            lfs<Long, Integer> lfs2 = entry.getValue();
            Long l2 = (Long)lfs2.reX;
            long l3 = dxp.bEv();
            if (l3 - l2 <= 900000000L) continue;
            iterator.remove();
        }
    }

    public void y(String string, String string2) {
        lfs<Long, Integer> lfs2;
        lfs<Long, Integer> lfs3 = this.hsJ.remove(string);
        if (lfs3 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "loginSuccessfull() There is no entry for IP " + string);
            assert (false);
        }
        if ((lfs2 = this.hsK.remove(string2)) == null) {
            lfn.b(5, this.getClass().getSimpleName(), "loginSuccessfull() There is no entry for AccountName " + string2);
            assert (false);
        }
    }

    static long bEv() {
        return System.currentTimeMillis() * 1000L;
    }

    static long getTimeStamp() {
        long l2 = dxp.bEv();
        if (l2 <= hsH) {
            l2 = hsH + 1L;
        }
        hsH = l2;
        return l2;
    }

    private String bEw() {
        char[] cArray = new char[32];
        for (int i2 = 0; i2 < 32; ++i2) {
            cArray[i2] = hsB[this.DZ.nextInt(hsB.length)];
        }
        return new String(cArray);
    }

    public String ow(ldv ldv2) {
        return this.hsD.get(ldv2);
    }

    public String ox(ldv ldv2) {
        if (ldv2 == null) {
            return null;
        }
        if (this.hsD.containsKey(ldv2)) {
            assert (false);
            return null;
        }
        String string = this.bEw();
        this.hsD.put(ldv2, string);
        return string;
    }

    public void t(ldv ldv2, String string) {
        Collection collection;
        if (this.hsC.containsKey(string)) {
            assert (false);
            return;
        }
        if (this.hsD.containsKey(ldv2)) {
            this.hsC.remove(this.hsD.remove(ldv2));
        }
        if ((collection = (Collection)this.hsF.get(ldv2)) != null) {
            for (dxo dxo2 : collection) {
                if (!dxo2.bEm()) continue;
                assert (false);
                return;
            }
        }
        this.hsC.put(string, ldv2);
        this.hsD.put(ldv2, string);
    }

    public void oy(ldv ldv2) {
        assert (ldv2 != null);
        String string = this.hsD.get(ldv2);
        if (string == null) {
            return;
        }
        assert (this.hsC.containsKey(string));
        Collection collection = (Collection)this.hsF.get(ldv2);
        LinkedList<dxo> linkedList = null;
        if (collection != null) {
            linkedList = lcn.emA();
            for (dxo dxo2 : collection) {
                if (!dxo2.bEm()) continue;
                linkedList.add(dxo2);
            }
        }
        if (linkedList != null && !linkedList.isEmpty()) {
            for (dxo dxo2 : linkedList) {
                this.b(dxo2);
            }
        }
        this.hsC.remove(string);
        this.hsD.remove(ldv2);
    }

    public dxo jM(String string) {
        dxo dxo2 = this.hsE.get(string);
        if (dxo2 != null) {
            dxo2.bEr();
        }
        return dxo2;
    }

    public dxo z(String string, String string2) {
        ldv ldv2 = this.hsC.get(string);
        if (ldv2 == null) {
            return null;
        }
        dxo dxo2 = new dxo(this, ldv2, true, this.bEy(), string2);
        this.hsE.put(dxo2.bEq(), dxo2);
        this.hsF.put(ldv2, dxo2);
        return dxo2;
    }

    public dxo jN(String string) {
        ldv ldv2 = this.hsC.get(string);
        if (ldv2 == null) {
            return null;
        }
        Collection collection = (Collection)this.hsF.get(ldv2);
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        for (dxo dxo2 : collection) {
            if (!dxo2.bEm()) continue;
            return dxo2;
        }
        return null;
    }

    public dxo u(ldv ldv2, String string) {
        if (ldv2 == null) {
            return null;
        }
        if (string == null) {
            return null;
        }
        Collection<dxo> collection = this.oz(ldv2);
        if (collection != null && collection.size() >= 5) {
            return null;
        }
        dxo dxo2 = new dxo(this, ldv2, false, this.bEy(), string);
        this.hsE.put(dxo2.bEq(), dxo2);
        this.hsF.put(ldv2, dxo2);
        return dxo2;
    }

    public Collection<dxo> oz(ldv ldv2) {
        if (this.hsF.isEmpty()) {
            return null;
        }
        Collection collection = (Collection)this.hsF.get(ldv2);
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList<dxo> arrayList = lcn.abH(collection.size());
        for (dxo dxo2 : collection) {
            if (dxo2.bEm()) continue;
            arrayList.add(dxo2);
        }
        return arrayList;
    }

    public List<Integer> bEx() {
        Long object2;
        ArrayList<Integer> arrayList = lcn.emv();
        long l2 = dxp.bEv();
        if (l2 - this.hsA < 10000000L) {
            return arrayList;
        }
        this.hsA = l2;
        long l3 = l2 - 600000000L;
        LinkedList<dxo> linkedList = null;
        Iterator<Long> iterator = this.hsG.keySet().iterator();
        while (iterator.hasNext() && (object2 = iterator.next()) <= l3) {
            if (linkedList == null) {
                linkedList = lcn.emA();
            }
            linkedList.add(this.hsG.get(object2));
            arrayList.add(this.hsG.get(object2).bEp().enw());
            iterator.remove();
        }
        if (linkedList != null) {
            for (dxo dxo2 : linkedList) {
                this.b(dxo2);
            }
        }
        return arrayList;
    }

    public void jO(String string) {
        assert (string != null);
        dxo dxo2 = this.jM(string);
        if (dxo2 != null) {
            this.b(dxo2);
        }
    }

    void a(dxo dxo2) {
        if (dxo2 == null) {
            return;
        }
        if (dxo2.bEm()) {
            return;
        }
        if (dxo2.bEn() != 0L) {
            this.hsG.remove(dxo2.bEn());
        }
        dxo2.hsv = dxp.getTimeStamp();
        this.hsG.put(dxo2.hsv, dxo2);
    }

    private void b(dxo dxo2) {
        if (dxo2.bEp() != null) {
            this.hsF.remove(dxo2.bEp(), dxo2);
        }
        if (dxo2.bEq() != null) {
            this.hsE.remove(dxo2.bEq());
        }
        if (dxo2.bEq() != null) {
            this.hsG.remove(dxo2.bEn());
        }
    }

    private String bEy() {
        String string = this.bEw();
        if (this.hsE.containsKey(string)) {
            string = this.bEy();
        }
        return string;
    }
}

