package com.thoughtworks.xstream.converters.javabean;

class PropertyDictionary$PropertyKey {
   private String propertyName;
   private Class propertyType;

   public PropertyDictionary$PropertyKey(String propertyName, Class propertyType) {
      this.propertyName = propertyName;
      this.propertyType = propertyType;
   }

   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof PropertyDictionary$PropertyKey)) {
         return false;
      } else {
         PropertyDictionary$PropertyKey propertyKey = (PropertyDictionary$PropertyKey)o;
         if (this.propertyName != null ? this.propertyName.equals(propertyKey.propertyName) : propertyKey.propertyName == null) {
            return this.propertyType != null ? this.propertyType.equals(propertyKey.propertyType) : propertyKey.propertyType == null;
         } else {
            return false;
         }
      }
   }

   public int hashCode() {
      int result = this.propertyName != null ? this.propertyName.hashCode() : 0;
      return 29 * result + (this.propertyType != null ? this.propertyType.hashCode() : 0);
   }

   public String toString() {
      return "PropertyKey{propertyName='" + this.propertyName + "'" + ", propertyType=" + this.propertyType + "}";
   }
}
