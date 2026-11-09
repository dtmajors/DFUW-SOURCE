/*
 * Decompiled with CFR.
 */
import java.lang.reflect.Method;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jzn {
    protected jta oQa = new jta();

    protected final void a(Document document, duf duf2, Object object, Element element) {
        assert (duf2 != null);
        assert (object != null);
        assert (element != null);
        duj[] dujArray = duf2.bBa();
        int n = dujArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            Object object2 = this.a(dujArray[i2], object);
            if (object2 == null && dujArray[i2].bBf() != 1) {
                throw new bg("FieldValue is null for field '" + dujArray[i2].getName() + "'");
            }
            Element element2 = this.a(document, dujArray[i2], object2);
            element.appendChild(element2);
        }
    }

    private Element a(Document document, duj duj2, Object object) {
        String string = "SF" + duj2.getName();
        switch (duj2.bBb()) {
            case 1: 
            case 4: {
                return this.oQa.a(document, (Integer)object, string);
            }
            case 2: {
                return this.oQa.a(document, (Boolean)object, string);
            }
            case 3: {
                return this.oQa.a(document, Double.valueOf(object.toString()), string);
            }
            case 5: {
                return this.oQa.a(document, ((Float)object).floatValue(), string);
            }
            case 6: {
                return this.oQa.a(document, (Integer)object, string);
            }
            case 7: {
                return this.oQa.a(document, (Long)object, string);
            }
            case 8: {
                return this.oQa.a(document, (lcq)object, string);
            }
            case 9: {
                return this.oQa.a(document, (ljq)object, string);
            }
            case 11: {
                return this.oQa.a(document, (ljp)object, string);
            }
            case 10: {
                return this.oQa.a(document, (String)object, string);
            }
        }
        lfn.b(5, "SFReflectionWriter", "createElementForField() Field '" + duj2.getName() + "' has invalid ValueType: " + duj2.bBb());
        return null;
    }

    private Object a(duj duj2, Object object) {
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
            throw new bg("Method '" + string + "' was not found.");
        }
        catch (Exception exception) {
            throw new bg("Invocation of method '" + string + "' failed.", exception);
        }
    }
}

