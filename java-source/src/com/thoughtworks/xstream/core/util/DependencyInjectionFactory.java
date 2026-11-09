/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.core.util.DependencyInjectionFactory;
import com.thoughtworks.xstream.core.util.Primitives;
import com.thoughtworks.xstream.core.util.TypedNull;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class DependencyInjectionFactory {
    static /* synthetic */ Class class$com$thoughtworks$xstream$core$util$TypedNull;

    public static Object newInstance(Class type, Object[] dependencies) {
        Constructor<?>[] ctors = type.getConstructors();
        Arrays.sort(ctors, new Comparator(){

            public int compare(Object o1, Object o2) {
                return ((Constructor)o2).getParameterTypes().length - ((Constructor)o1).getParameterTypes().length;
            }
        });
        TypedValue[] typedDependencies = new TypedValue[dependencies.length];
        for (int i = 0; i < dependencies.length; ++i) {
            Object dependency = dependencies[i];
            Class depType = dependency.getClass();
            if (depType.isPrimitive()) {
                depType = Primitives.box(depType);
            } else if (depType == (class$com$thoughtworks$xstream$core$util$TypedNull == null ? DependencyInjectionFactory.class$("com.thoughtworks.xstream.core.util.TypedNull") : class$com$thoughtworks$xstream$core$util$TypedNull)) {
                depType = ((TypedNull)dependency).getType();
                dependency = null;
            }
            typedDependencies[i] = new TypedValue(depType, dependency);
        }
        Constructor<?> bestMatchingCtor = null;
        Constructor<?> possibleCtor = null;
        int arity = Integer.MAX_VALUE;
        ArrayList<Object> matchingDependencies = new ArrayList<Object>();
        block5: for (int i = 0; bestMatchingCtor == null && i < ctors.length; ++i) {
            int j;
            Constructor<?> constructor = ctors[i];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length > dependencies.length) continue;
            if (parameterTypes.length == 0) {
                bestMatchingCtor = constructor;
                break;
            }
            if (arity > parameterTypes.length) {
                if (possibleCtor != null) {
                    bestMatchingCtor = possibleCtor;
                    continue;
                }
                arity = parameterTypes.length;
            }
            for (j = 0; j < parameterTypes.length; ++j) {
                if (!parameterTypes[j].isPrimitive()) continue;
                parameterTypes[j] = Primitives.box(parameterTypes[j]);
            }
            matchingDependencies.clear();
            j = 0;
            int k = 0;
            while (j < parameterTypes.length && parameterTypes.length + k - j <= typedDependencies.length) {
                if (parameterTypes[j].isAssignableFrom(typedDependencies[k].type)) {
                    matchingDependencies.add(typedDependencies[k].value);
                    if (++j == parameterTypes.length) {
                        bestMatchingCtor = constructor;
                        break;
                    }
                }
                ++k;
            }
            if (bestMatchingCtor != null || possibleCtor != null) continue;
            possibleCtor = constructor;
            TypedValue[] deps = new TypedValue[typedDependencies.length];
            System.arraycopy(typedDependencies, 0, deps, 0, deps.length);
            matchingDependencies.clear();
            for (int j2 = 0; j2 < parameterTypes.length; ++j2) {
                int assignable = -1;
                for (int k2 = 0; k2 < deps.length; ++k2) {
                    if (deps[k2] == null) continue;
                    if (deps[k2].type == parameterTypes[j2]) {
                        assignable = k2;
                        break;
                    }
                    if (!parameterTypes[j2].isAssignableFrom(deps[k2].type) || assignable >= 0 && !deps[assignable].type.isAssignableFrom(deps[k2].type)) continue;
                    assignable = k2;
                }
                if (assignable < 0) {
                    possibleCtor = null;
                    continue block5;
                }
                matchingDependencies.add(deps[assignable].value);
                deps[assignable] = null;
            }
        }
        if (bestMatchingCtor == null) {
            throw new ObjectAccessException("Cannot construct " + type.getName() + ", none of the dependencies match any constructor's parameters");
        }
        try {
            return bestMatchingCtor.newInstance(matchingDependencies.toArray());
        }
        catch (InstantiationException e) {
            throw new ObjectAccessException("Cannot construct " + type.getName(), e);
        }
        catch (IllegalAccessException e) {
            throw new ObjectAccessException("Cannot construct " + type.getName(), e);
        }
        catch (InvocationTargetException e) {
            throw new ObjectAccessException("Cannot construct " + type.getName(), e);
        }
    }

    static /* synthetic */ Class class$(String x0) {
        try {
            return Class.forName(x0);
        }
        catch (ClassNotFoundException x1) {
            throw new NoClassDefFoundError(x1.getMessage());
        }
    }
}

