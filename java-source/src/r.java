/*
 * Decompiled with CFR.
 */
import java.util.HashMap;

public class r
extends ClassLoader {
    private HashMap<String, Class> cp = null;
    private ClassLoader cq = null;
    public static ClassLoader cr = r.class.getClassLoader();
    private static Class cs = null;

    public r(ClassLoader classLoader) {
        super(classLoader);
        System.loadLibrary("SFMW");
        cr = this;
        this.cq = classLoader;
    }

    private static native byte[] o(String var0);

    public r() {
        this(r.class.getClassLoader());
    }

    private Class<?> p(String string) {
        byte[] byArray = r.o(string);
        Class<?> clazz = null;
        if (byArray != null) {
            clazz = this.defineClass(string, byArray, 0, byArray.length);
        }
        return clazz;
    }

    @Override
    protected synchronized Class<?> loadClass(String string, boolean bl) {
        Class<?> clazz = null;
        if (this.cp != null) {
            clazz = this.cp.get(string);
        }
        if (clazz == null) {
            clazz = this.p(string);
            if (this.cp == null) {
                this.cp = new HashMap();
            }
            this.cp.put(string, clazz);
        }
        if (clazz == null) {
            clazz = this.cq.loadClass(string);
            if (this.cp == null) {
                this.cp = new HashMap();
            }
            this.cp.put(string, clazz);
        }
        if (clazz == null) {
            throw new ClassNotFoundException();
        }
        if (bl) {
            this.resolveClass(clazz);
        }
        return clazz;
    }
}

