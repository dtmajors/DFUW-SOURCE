/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.lang.reflect.Method;

public class kzz
extends lak {
    private int gqB = 0;
    private duf qqm = null;

    public kzz(String string, int n, duf duf2) {
        super(string);
        this.gqB = n;
        this.qqm = duf2;
        this.ekS();
        this.elw();
    }

    public void g(dgj dgj2) {
        assert (this.gqB > 0);
        assert (this.qqm != null);
        assert (dgj2 != null);
        if (!this.qqm.bAZ().equals(dgj2.getEffectClassName())) {
            lfn.b(5, "SFXMLEffectPropertyPane", "setEffect() ConstantName='" + this.qqm.bAZ() + "' EffectClassName='" + dgj2.getEffectClassName() + "'");
            return;
        }
        duj[] dujArray = this.qqm.bBa();
        Object object = null;
        laj laj2 = null;
        for (int i2 = 0; i2 < dujArray.length; ++i2) {
            object = kzz.a(dujArray[i2], dgj2);
            if (object == null && dujArray[i2].bBf() != 1) {
                lfn.b(5, "SFXMLEffectPropertyPane", "setEffect() FieldValue is null.");
                return;
            }
            laj2 = this.yz(dujArray[i2].getName());
            if (laj2 == null) {
                lfn.b(5, "SFXMLEffectPropertyPane", "setEffect() Property for field '" + dujArray[i2].getName() + "' was not found.");
                return;
            }
            laj2.setValue(object);
        }
    }

    public void h(dgj dgj2) {
        assert (this.gqB > 0);
        assert (this.qqm != null);
        assert (dgj2 != null);
        if (!this.qqm.bAZ().equals(dgj2.getEffectClassName())) {
            lfn.b(5, "SFXMLEffectPropertyPane", "updateEffect() ConstantName='" + this.qqm.bAZ() + "' EffectClassName='" + dgj2.getEffectClassName() + "'");
            return;
        }
        duj[] dujArray = this.qqm.bBa();
        Object object = null;
        laj laj2 = null;
        for (int i2 = 0; i2 < dujArray.length; ++i2) {
            laj2 = this.yz(dujArray[i2].getName());
            if (laj2 == null) {
                lfn.b(5, "SFXMLEffectPropertyPane", "updateEffect() Property for field '" + dujArray[i2].getName() + "' was not found.");
                return;
            }
            object = laj2.getValue();
            if (object == null && dujArray[i2].bBf() != 1) {
                lfn.b(5, "SFXMLEffectPropertyPane", "updateEffect() FieldValue is null.");
                return;
            }
            kzz.a(dujArray[i2], dgj2, object);
        }
    }

    public final void a(duf duf2) {
        if (!this.qqm.getName().equals(duf2.getName())) {
            lfn.b(5, "SFXMLEffectPropertyPane", "updateProperties() Name='" + this.qqm.getName() + "' Class.Name='" + duf2.getName() + "'");
            return;
        }
        if (!this.qqm.bAZ().equals(duf2.bAZ())) {
            lfn.b(5, "SFXMLEffectPropertyPane", "updateProperties() ConstantName='" + this.qqm.bAZ() + "' Class.ConstantName='" + duf2.bAZ() + "'");
        }
        this.qqm = duf2;
        lfn.b(0, "SFXMLEffectPropertyPane", "updateProperties() Updated propertypane for class '" + this.qqm.getName() + "'");
        this.removeAll();
        this.lAR.clear();
        this.ekS();
        this.elw();
        this.validate();
    }

    private Object abv(int n) {
        switch (n) {
            case 1: 
            case 4: {
                return new Integer(0);
            }
            case 2: {
                return false;
            }
            case 3: {
                return new Double(0.0);
            }
            case 5: {
                return new Float(0.0f);
            }
            case 6: {
                return new Integer(0);
            }
            case 7: {
                return new Long(0L);
            }
            case 8: {
                return lcq.BRIGHT_WHITE;
            }
            case 9: {
                return new ljq();
            }
            case 11: {
                return new ljp();
            }
            case 10: {
                return "";
            }
        }
        lfn.b(5, "SFXMLEffectPropertyPane", "createInitialFieldValue() Invalid ValueType provided: " + n);
        assert (false);
        return null;
    }

    private static Class abw(int n) {
        switch (n) {
            case 1: 
            case 4: {
                return Integer.TYPE;
            }
            case 2: {
                return Boolean.TYPE;
            }
            case 3: {
                return Double.TYPE;
            }
            case 5: {
                return Float.TYPE;
            }
            case 6: {
                return Integer.TYPE;
            }
            case 7: {
                return Long.TYPE;
            }
            case 8: {
                return lcq.class;
            }
            case 9: {
                return ljq.class;
            }
            case 11: {
                return ljp.class;
            }
            case 10: {
                return String.class;
            }
        }
        lfn.b(5, "SFXMLEffectPropertyPane", "getClassForValueType() Invalid ValueType provided: " + n);
        assert (false);
        return null;
    }

    private void ekS() {
        assert (this.lAR != null);
        assert (this.lAR.isEmpty());
        assert (this.qqm != null);
        duj[] dujArray = this.qqm.bBa();
        Object object = null;
        laj laj2 = null;
        for (int i2 = 0; i2 < dujArray.length; ++i2) {
            object = this.abv(dujArray[i2].bBb());
            if (object == null) {
                lfn.b(5, "SFXMLEffectPropertyPane", "createPropertyComponents() InitialFieldValue is null.");
                return;
            }
            laj2 = new laj(dujArray[i2], object);
            this.a(laj2);
        }
    }

    public static Object a(duj duj2, Object object) {
        String string = "get" + duj2.getName();
        if (duj2.bBb() == 2) {
            string = "is" + duj2.getName();
        }
        try {
            Class<?> clazz = object.getClass();
            Method method = clazz.getMethod(string, new Class[0]);
            Object object2 = method.invoke(object, new Object[0]);
            return object2;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            lfn.b(5, "SFXMLEffectPropertyPane", "getFieldValue() Method '" + string + "' was not found.");
        }
        catch (Exception exception) {
            lfn.b(5, "SFXMLEffectPropertyPane", "getFieldValue() Invocation of method '" + string + "' failed.");
            lfn.log("SFXMLEffectPropertyPane", exception);
        }
        return null;
    }

    public static void a(duj duj2, Object object, Object object2) {
        String string = "set" + duj2.getName();
        try {
            Class<?> clazz = object.getClass();
            Method method = clazz.getMethod(string, kzz.abw(duj2.bBb()));
            method.invoke(object, object2);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            lfn.b(5, "SFXMLEffectPropertyPane", "setFieldValue() Method '" + string + "' was not found.");
        }
        catch (Exception exception) {
            lfn.b(5, "SFXMLEffectPropertyPane", "setFieldValue() Invocation of method '" + string + "' failed.");
            lfn.log("SFXMLEffectPropertyPane", exception);
        }
    }
}

