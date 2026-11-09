package org.apache.commons.collections.bidimap;

import java.util.Map.Entry;
import org.apache.commons.collections.KeyValue;

class TreeBidiMap$Node implements Entry, KeyValue {
   private Comparable[] data;
   private TreeBidiMap$Node[] leftNode;
   private TreeBidiMap$Node[] rightNode;
   private TreeBidiMap$Node[] parentNode;
   private boolean[] blackColor;
   private int hashcodeValue;
   private boolean calculatedHashCode;

   TreeBidiMap$Node(Comparable key, Comparable value) {
      this.data = new Comparable[]{key, value};
      this.leftNode = new TreeBidiMap$Node[2];
      this.rightNode = new TreeBidiMap$Node[2];
      this.parentNode = new TreeBidiMap$Node[2];
      this.blackColor = new boolean[]{true, true};
      this.calculatedHashCode = false;
   }

   private Comparable getData(int index) {
      return this.data[index];
   }

   private void setLeft(TreeBidiMap$Node node, int index) {
      this.leftNode[index] = node;
   }

   private TreeBidiMap$Node getLeft(int index) {
      return this.leftNode[index];
   }

   private void setRight(TreeBidiMap$Node node, int index) {
      this.rightNode[index] = node;
   }

   private TreeBidiMap$Node getRight(int index) {
      return this.rightNode[index];
   }

   private void setParent(TreeBidiMap$Node node, int index) {
      this.parentNode[index] = node;
   }

   private TreeBidiMap$Node getParent(int index) {
      return this.parentNode[index];
   }

   private void swapColors(TreeBidiMap$Node node, int index) {
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

   private void copyColor(TreeBidiMap$Node node, int index) {
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

   public boolean equals(Object obj) {
      if (obj == this) {
         return true;
      }

      if (!(obj instanceof Entry)) {
         return false;
      }

      Entry e = (Entry)obj;
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
