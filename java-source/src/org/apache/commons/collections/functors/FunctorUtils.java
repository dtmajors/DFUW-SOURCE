/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.functors;

import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.collections.Closure;
import org.apache.commons.collections.Predicate;
import org.apache.commons.collections.Transformer;

class FunctorUtils {
    private FunctorUtils() {
    }

    static Predicate[] copy(Predicate[] predicates) {
        if (predicates == null) {
            return null;
        }
        return (Predicate[])predicates.clone();
    }

    static void validate(Predicate[] predicates) {
        if (predicates == null) {
            throw new IllegalArgumentException("The predicate array must not be null");
        }
        int i = 0;
        while (i < predicates.length) {
            if (predicates[i] == null) {
                throw new IllegalArgumentException("The predicate array must not contain a null predicate, index " + i + " was null");
            }
            ++i;
        }
    }

    static void validateMin2(Predicate[] predicates) {
        if (predicates == null) {
            throw new IllegalArgumentException("The predicate array must not be null");
        }
        if (predicates.length < 2) {
            throw new IllegalArgumentException("At least 2 predicates must be specified in the predicate array, size was " + predicates.length);
        }
        int i = 0;
        while (i < predicates.length) {
            if (predicates[i] == null) {
                throw new IllegalArgumentException("The predicate array must not contain a null predicate, index " + i + " was null");
            }
            ++i;
        }
    }

    static Predicate[] validate(Collection predicates) {
        if (predicates == null) {
            throw new IllegalArgumentException("The predicate collection must not be null");
        }
        if (predicates.size() < 2) {
            throw new IllegalArgumentException("At least 2 predicates must be specified in the predicate collection, size was " + predicates.size());
        }
        Predicate[] preds = new Predicate[predicates.size()];
        int i = 0;
        Iterator it = predicates.iterator();
        while (it.hasNext()) {
            preds[i] = (Predicate)it.next();
            if (preds[i] == null) {
                throw new IllegalArgumentException("The predicate collection must not contain a null predicate, index " + i + " was null");
            }
            ++i;
        }
        return preds;
    }

    static Closure[] copy(Closure[] closures) {
        if (closures == null) {
            return null;
        }
        return (Closure[])closures.clone();
    }

    static void validate(Closure[] closures) {
        if (closures == null) {
            throw new IllegalArgumentException("The closure array must not be null");
        }
        int i = 0;
        while (i < closures.length) {
            if (closures[i] == null) {
                throw new IllegalArgumentException("The closure array must not contain a null closure, index " + i + " was null");
            }
            ++i;
        }
    }

    static Transformer[] copy(Transformer[] transformers) {
        if (transformers == null) {
            return null;
        }
        return (Transformer[])transformers.clone();
    }

    static void validate(Transformer[] transformers) {
        if (transformers == null) {
            throw new IllegalArgumentException("The transformer array must not be null");
        }
        int i = 0;
        while (i < transformers.length) {
            if (transformers[i] == null) {
                throw new IllegalArgumentException("The transformer array must not contain a null transformer, index " + i + " was null");
            }
            ++i;
        }
    }
}

