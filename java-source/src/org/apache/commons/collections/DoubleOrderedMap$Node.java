package org.apache.commons.collections;

import java.util.Map.Entry;

final class DoubleOrderedMap$Node implements Entry, KeyValue {
   private Comparable[] data;
   private DoubleOrderedMap$Node[] leftNode;
   private DoubleOrderedMap$Node[] rightNode;
   private DoubleOrderedMap$Node[] parentNode;
   private boolean[] blackColor;
   private int hashcodeValue;
   private boolean calculatedHashCode;

   DoubleOrderedMap$Node(Comparable key, Comparable value) {
      this.data = new Comparable[]{key, value};
      this.leftNode = new DoubleOrderedMap$Node[]{null, null};
      this.rightNode = new DoubleOrderedMap$Node[]{null, null};
      this.parentNode = new DoubleOrderedMap$Node[]{null, null};
      this.blackColor = new boolean[]{true, true};
      this.calculatedHashCode = false;
   }

   private Comparable getData(int index) {
      return this.data[index];
   }

   private void setLeft(DoubleOrderedMap$Node node, int index) {
      this.leftNode[index] = node;
   }

   private DoubleOrderedMap$Node getLeft(int index) {
      return this.leftNode[index];
   }

   private void setRight(DoubleOrderedMap$Node node, int index) {
      this.rightNode[index] = node;
   }

   private DoubleOrderedMap$Node getRight(int index) {
      return this.rightNode[index];
   }

   private void setParent(DoubleOrderedMap$Node node, int index) {
      this.parentNode[index] = node;
   }

   private DoubleOrderedMap$Node getParent(int index) {
      return this.parentNode[index];
   }

   private void swapColors(DoubleOrderedMap$Node node, int index) {
      this.blackColor[index] = this.blackColor[index] ^ node.blackColor[index];
      node.blackColor[index] = node.blackColor[index] ^ this.blackColor[index];
      this.blackColor[index] = this.blackColor[index] ^ node.blackColor[index];
   }

   private boolean isBlack(int index) {
      return this.blackColor[index];
   }

   private boolean isRed(int index) {
      return !this.blackColor[index];
   }

   private void setBlack(int index) {
      this.blackColor[index] = true;
   }

   private void setRed(int index) {
      this.blackColor[index] = false;
   }

   private void copyColor(DoubleOrderedMap$Node node, int index) {
      this.blackColor[index] = node.blackColor[index];
   }

   public Object getKey() {
      return this.data[0];
   }

   public Object getValue() {
      return this.data[1];
   }

   public Object setValue(Object ignored) throws UnsupportedOperationException {
      throw new UnsupportedOperationException("Map.Entry.setValue is not supported");
   }

   public boolean equals(Object o) {
      if (this == o) {
         return true;
      }

      if (!(o instanceof Entry)) {
         return false;
      }

      Entry e = (Entry)o;
      return this.data[0].equals(e.getKey()) && this.data[1].equals(e.getValue());
   }

   public int hashCode() {
      if (!this.calculatedHashCode) {
         this.hashcodeValue = this.data[0].hashCode() ^ this.data[1].hashCode();
         this.calculatedHashCode = true;
      }

      return this.hashcodeValue;
   }
}
