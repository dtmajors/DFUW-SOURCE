/*
 * Decompiled with CFR.
 */
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class cd {
    private List fY = lcn.emv();

    public void init() {
        this.fY.clear();
        this.fY = lcn.emv();
    }

    public boolean a(Object object, Field field, String string) {
        String string2 = field.getType().getName();
        Object object2 = this.a(string2, string);
        try {
            field.setAccessible(true);
            field.set(object, object2);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public void a(List list, int n, String string, String string2) {
        list.set(n, this.a(string, string2));
    }

    public void a(Map map, String string, String string2, Object object) {
        map.put(this.a(string, string2), object);
    }

    public void a(Map map, Object object, String string, String string2) {
        map.put(object, this.a(string, string2));
    }

    public void a(Object object, String string, cc cc2) {
        Object object2;
        if (this.fY.contains(object)) {
            object2 = this.c(object).getName();
            if (!((String)object2).equals(ldv.class.getName()) && !this.x((String)object2)) {
                cc2.add(new cc("Loop reference", 7));
                return;
            }
        } else {
            this.fY.add(object);
        }
        object2 = this.c(object);
        if (object2 == null) {
            cc2.add(new cc("Unknown objectclass!", 7));
            return;
        }
        if (this.x(((Class)object2).getName())) {
            cc cc3 = null;
            cc3 = string != null ? new cc(string, 3) : new cc(((Class)object2).getName(), 3);
            cc cc4 = new cc(object.toString(), 4, object);
            cc2.add(cc3);
            cc2.add(cc4);
        } else if (((Class)object2).getName().equals("java.util.List")) {
            cc cc5 = new cc("java.util.List", 1, object);
            cc2.add(cc5);
            this.a((List)object, cc5);
        } else if (((Class)object2).getName().equals("java.util.HashMap")) {
            cc cc6 = new cc("java.util.HashMap", 1, object);
            cc2.add(cc6);
            this.b((HashMap)object, cc6);
        } else {
            cc cc7 = new cc(((Class)object2).getName(), 3);
            cc cc8 = new cc(((Class)object2).getName(), 1, object);
            cc2.add(cc7);
            cc2.add(cc8);
            Field[] fieldArray = ((Class)object2).getDeclaredFields();
            Field field = null;
            Object object3 = null;
            for (int i2 = 0; i2 < fieldArray.length; ++i2) {
                field = fieldArray[i2];
                field.setAccessible(true);
                if (this.b(field.getName(), field.getType().getName())) continue;
                Object[] objectArray = new Object[]{object, field};
                cc cc9 = new cc("Field", 7, objectArray);
                cc cc10 = new cc(field.getName(), 2, field);
                cc9.add(cc10);
                cc2.add(cc9);
                try {
                    object3 = fieldArray[i2].get(object);
                    if (object3 == null) {
                        cc9.add(new cc(field.getType().getName(), 3));
                        cc9.add(new cc("null", 7));
                        continue;
                    }
                    this.a(object3, field.getType().getName(), cc9);
                    continue;
                }
                catch (Exception exception) {
                    cc9.add(new cc("Exception: " + exception.toString(), 7));
                }
            }
        }
    }

    private Object a(String string, String string2) {
        Object object = null;
        if (string.equals("java.lang.String")) {
            object = string2;
        } else if (string.equals("int") || string.equals("java.lang.Integer")) {
            object = new Integer(string2);
        } else if (string.equals("float") || string.equals("java.lang.Float")) {
            object = new Float(string2);
        } else if (string.equals("boolean") || string.equals("java.lang.Boolean")) {
            object = Boolean.valueOf(string2);
        } else if (string.equals("java.lang.double") || string.equals("java.lang.Double")) {
            object = new Double(string2);
        } else if (string.equals("long") || string.equals("java.lang.Long")) {
            object = new Long(string2);
        }
        return object;
    }

    private void a(List list, cc cc2) {
        if (list.size() == 0) {
            cc cc3 = new cc("Empty", 7);
            cc2.add(cc3);
        } else {
            Object var3_4 = null;
            cc cc4 = null;
            for (int i2 = 0; i2 < list.size(); ++i2) {
                var3_4 = list.get(i2);
                Object[] objectArray = new Object[]{list, new Integer(i2), this.c(var3_4).getName()};
                cc4 = new cc("ListItem", 7, objectArray);
                this.a(var3_4, null, cc4);
                cc2.add(cc4);
            }
        }
    }

    private void a(HashMap hashMap, cc cc2) {
        if (hashMap.size() == 0) {
            cc cc3 = new cc("Empty", 7);
            cc2.add(cc3);
        } else {
            Iterator iterator = hashMap.entrySet().iterator();
            Map.Entry entry = null;
            cc cc4 = null;
            while (iterator.hasNext()) {
                entry = iterator.next();
                if (entry.getKey() != null && entry.getValue() != null) {
                    Object[] objectArray = new Object[]{hashMap, this.c(entry.getKey()).getName(), entry.getKey(), this.c(entry.getValue()).getName(), entry.getValue()};
                    cc4 = new cc("Entry", 7, objectArray);
                    cc2.add(cc4);
                } else {
                    cc4 = new cc("Entry", 7);
                    cc2.add(cc4);
                }
                if (entry.getKey() != null) {
                    this.a(entry.getKey(), null, cc4);
                } else {
                    cc4.add(new cc("null", 7));
                }
                if (entry.getValue() != null) {
                    this.a(entry.getValue(), null, cc4);
                    continue;
                }
                cc4.add(new cc("null", 7));
            }
        }
    }

    private void b(HashMap hashMap, cc cc2) {
        if (hashMap.size() == 0) {
            cc cc3 = new cc("Empty", 7);
            cc2.add(cc3);
        } else {
            Iterator iterator = hashMap.entrySet().iterator();
            Map.Entry entry = null;
            cc cc4 = null;
            while (iterator.hasNext()) {
                entry = iterator.next();
                if (entry.getKey() != null && entry.getValue() != null) {
                    Object[] objectArray = new Object[]{hashMap, this.c(entry.getKey()).getName(), entry.getKey(), this.c(entry.getValue()).getName(), entry.getValue()};
                    cc4 = new cc("Entry", 7, objectArray);
                    cc2.add(cc4);
                } else {
                    cc4 = new cc("Entry", 7);
                    cc2.add(cc4);
                }
                if (entry.getKey() != null) {
                    this.a(entry.getKey(), null, cc4);
                } else {
                    cc4.add(new cc("null", 7));
                }
                if (entry.getValue() != null) {
                    this.a(entry.getValue(), null, cc4);
                    continue;
                }
                cc4.add(new cc("null", 7));
            }
        }
    }

    private Class c(Object object) {
        Class<?> clazz = null;
        Class<?>[] classArray = object.getClass().getClasses();
        if (classArray.length == 0) {
            return object.getClass();
        }
        for (int i2 = 0; i2 < classArray.length; ++i2) {
            if (classArray[i2].isInterface()) continue;
            clazz = classArray[i2];
        }
        return clazz;
    }

    private boolean x(String string) {
        return string.equals("java.lang.String") || string.equals("int") || string.equals("float") || string.equals("boolean") || string.equals("java.lang.double") || string.equals("long") || string.equals("java.lang.Integer") || string.equals("java.lang.Float") || string.equals("java.lang.Boolean") || string.equals("java.lang.Double") || string.equals("java.lang.Long");
    }

    private boolean b(String string, String string2) {
        return string2.equals(lfn.class.getName()) || string.equals("TO_ALL");
    }
}

