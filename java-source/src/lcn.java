/*
 * Decompiled with CFR.
 */
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;
import org.apache.commons.collections.MultiHashMap;
import org.apache.commons.collections.MultiMap;
import org.apache.commons.collections.bag.TreeBag;

public class lcn {
    public static <E> ArrayList<E> emv() {
        return new ArrayList();
    }

    public static <E> ArrayList<E> abH(int n) {
        return new ArrayList(n);
    }

    public static <E> ArrayList<E> bx(E[] EArray) {
        return new ArrayList<E>(Arrays.asList(EArray));
    }

    public static <K extends Enum<K>, V> Map<K, V> e(Class<K> clazz) {
        return new EnumMap(clazz);
    }

    public static <K extends Enum<K>> EnumSet<K> f(Class<K> clazz) {
        return EnumSet.noneOf(clazz);
    }

    public static <K, V> Map<K, V> emw() {
        return new HashMap();
    }

    public static <K, V> Map<K, V> abI(int n) {
        return new HashMap(n);
    }

    public static <K, V> Map<K, V> R(int n, float f) {
        return new HashMap(n, f);
    }

    public static <E> Set<E> emx() {
        return new HashSet();
    }

    public static <K, V> Map<K, V> emy() {
        return new Hashtable();
    }

    public static <K, V> Map<K, V> abJ(int n) {
        return new Hashtable(n);
    }

    public static <K, V> Map<K, V> yi(boolean bl) {
        return new LinkedHashMap(16, 0.75f, bl);
    }

    public static <E> Set<E> emz() {
        return new LinkedHashSet();
    }

    public static <E> LinkedList<E> emA() {
        return new LinkedList();
    }

    public static MultiMap emB() {
        return new MultiHashMap();
    }

    public static MultiMap emC() {
        return new lfa();
    }

    public static <K, V> SortedMap<K, V> emD() {
        return new TreeMap();
    }

    public static <K, V> SortedMap<K, V> d(Comparator<K> comparator) {
        return new TreeMap(comparator);
    }

    public static <E> SortedSet<E> emE() {
        return new TreeSet();
    }

    public static <E> SortedSet<E> e(Comparator<E> comparator) {
        return new TreeSet<E>(comparator);
    }

    public static TreeBag emF() {
        return new TreeBag();
    }

    public static <K, V> TreeMap<K, V> emG() {
        return new TreeMap();
    }

    public static <K, V> TreeMap<K, V> f(Comparator<K> comparator) {
        return new TreeMap(comparator);
    }

    public static <E> TreeSet<E> emH() {
        return new TreeSet();
    }

    public static <E> TreeSet<E> g(Comparator<E> comparator) {
        return new TreeSet<E>(comparator);
    }

    public static <E> List<E> emI() {
        return new Vector();
    }

    public static <E> List<E> abK(int n) {
        return new Vector(n);
    }

    public static <K, V> WeakHashMap<K, WeakReference<V>> emJ() {
        return new WeakHashMap();
    }

    public static <E> String m(Collection<E> collection) {
        if (collection == null) {
            return null;
        }
        Object[] objectArray = collection.toArray();
        if (objectArray.length == 0) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (int i = 0; i < objectArray.length - 1; ++i) {
            stringBuilder.append(objectArray[i]);
            stringBuilder.append(',');
            stringBuilder.append(' ');
        }
        stringBuilder.append(objectArray[objectArray.length - 1]);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    private lcn() {
    }
}

