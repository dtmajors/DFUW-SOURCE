package org.apache.commons.collections.map;

import java.util.Collection;
import java.util.Map;

public interface CompositeMap$MapMutator {
   void resolveCollision(CompositeMap var1, Map var2, Map var3, Collection var4);

   Object put(CompositeMap var1, Map[] var2, Object var3, Object var4);

   void putAll(CompositeMap var1, Map[] var2, Map var3);
}
