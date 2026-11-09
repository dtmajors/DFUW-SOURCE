package org.apache.commons.collections.list;

class TreeList$AVLNode {
   private TreeList$AVLNode left;
   private boolean leftIsPrevious;
   private TreeList$AVLNode right;
   private boolean rightIsNext;
   private int height;
   private int relativePosition;
   private Object value;

   private TreeList$AVLNode(int relativePosition, Object obj, TreeList$AVLNode rightFollower, TreeList$AVLNode leftFollower) {
      this.relativePosition = relativePosition;
      this.value = obj;
      this.rightIsNext = true;
      this.leftIsPrevious = true;
      this.right = rightFollower;
      this.left = leftFollower;
   }

   Object getValue() {
      return this.value;
   }

   void setValue(Object obj) {
      this.value = obj;
   }

   TreeList$AVLNode get(int index) {
      int indexRelativeToMe = index - this.relativePosition;
      if (indexRelativeToMe == 0) {
         return this;
      }

      TreeList$AVLNode nextNode = indexRelativeToMe < 0 ? this.getLeftSubTree() : this.getRightSubTree();
      return nextNode == null ? null : nextNode.get(indexRelativeToMe);
   }

   int indexOf(Object object, int index) {
      if (this.getLeftSubTree() != null) {
         int result = this.left.indexOf(object, index + this.left.relativePosition);
         if (result != -1) {
            return result;
         }
      }

      if (this.value == null ? this.value == object : this.value.equals(object)) {
         return index;
      } else {
         return this.getRightSubTree() != null ? this.right.indexOf(object, index + this.right.relativePosition) : -1;
      }
   }

   void toArray(Object[] array, int index) {
      array[index] = this.value;
      if (this.getLeftSubTree() != null) {
         this.left.toArray(array, index + this.left.relativePosition);
      }

      if (this.getRightSubTree() != null) {
         this.right.toArray(array, index + this.right.relativePosition);
      }
   }

   TreeList$AVLNode next() {
      return !this.rightIsNext && this.right != null ? this.right.min() : this.right;
   }

   TreeList$AVLNode previous() {
      return !this.leftIsPrevious && this.left != null ? this.left.max() : this.left;
   }

   TreeList$AVLNode insert(int index, Object obj) {
      int indexRelativeToMe = index - this.relativePosition;
      return indexRelativeToMe <= 0 ? this.insertOnLeft(indexRelativeToMe, obj) : this.insertOnRight(indexRelativeToMe, obj);
   }

   private TreeList$AVLNode insertOnLeft(int indexRelativeToMe, Object obj) {
      if (this.getLeftSubTree() == null) {
         this.setLeft(new TreeList$AVLNode(-1, obj, this, this.left), null);
      } else {
         this.setLeft(this.left.insert(indexRelativeToMe, obj), null);
      }

      if (this.relativePosition >= 0) {
         this.relativePosition++;
      }

      TreeList$AVLNode ret = this.balance();
      this.recalcHeight();
      return ret;
   }

   private TreeList$AVLNode insertOnRight(int indexRelativeToMe, Object obj) {
      if (this.getRightSubTree() == null) {
         this.setRight(new TreeList$AVLNode(1, obj, this.right, this), null);
      } else {
         this.setRight(this.right.insert(indexRelativeToMe, obj), null);
      }

      if (this.relativePosition < 0) {
         this.relativePosition--;
      }

      TreeList$AVLNode ret = this.balance();
      this.recalcHeight();
      return ret;
   }

   private TreeList$AVLNode getLeftSubTree() {
      return this.leftIsPrevious ? null : this.left;
   }

   private TreeList$AVLNode getRightSubTree() {
      return this.rightIsNext ? null : this.right;
   }

   private TreeList$AVLNode max() {
      return this.getRightSubTree() == null ? this : this.right.max();
   }

   private TreeList$AVLNode min() {
      return this.getLeftSubTree() == null ? this : this.left.min();
   }

   TreeList$AVLNode remove(int index) {
      int indexRelativeToMe = index - this.relativePosition;
      if (indexRelativeToMe == 0) {
         return this.removeSelf();
      }

      if (indexRelativeToMe > 0) {
         this.setRight(this.right.remove(indexRelativeToMe), this.right.right);
         if (this.relativePosition < 0) {
            this.relativePosition++;
         }
      } else {
         this.setLeft(this.left.remove(indexRelativeToMe), this.left.left);
         if (this.relativePosition > 0) {
            this.relativePosition--;
         }
      }

      this.recalcHeight();
      return this.balance();
   }

   private TreeList$AVLNode removeMax() {
      if (this.getRightSubTree() == null) {
         return this.removeSelf();
      }

      this.setRight(this.right.removeMax(), this.right.right);
      if (this.relativePosition < 0) {
         this.relativePosition++;
      }

      this.recalcHeight();
      return this.balance();
   }

   private TreeList$AVLNode removeMin() {
      if (this.getLeftSubTree() == null) {
         return this.removeSelf();
      }

      this.setLeft(this.left.removeMin(), this.left.left);
      if (this.relativePosition > 0) {
         this.relativePosition--;
      }

      this.recalcHeight();
      return this.balance();
   }

   private TreeList$AVLNode removeSelf() {
      if (this.getRightSubTree() == null && this.getLeftSubTree() == null) {
         return null;
      }

      if (this.getRightSubTree() == null) {
         if (this.relativePosition > 0) {
            this.left.relativePosition = this.left.relativePosition + this.relativePosition + (this.relativePosition > 0 ? 0 : 1);
         }

         this.left.max().setRight(null, this.right);
         return this.left;
      } else {
         if (this.getLeftSubTree() == null) {
            this.right.relativePosition = this.right.relativePosition + (this.relativePosition - (this.relativePosition < 0 ? 0 : 1));
            this.right.min().setLeft(null, this.left);
            return this.right;
         }

         if (this.heightRightMinusLeft() > 0) {
            TreeList$AVLNode rightMin = this.right.min();
            this.value = rightMin.value;
            if (this.leftIsPrevious) {
               this.left = rightMin.left;
            }

            this.right = this.right.removeMin();
            if (this.relativePosition < 0) {
               this.relativePosition++;
            }
         } else {
            TreeList$AVLNode leftMax = this.left.max();
            this.value = leftMax.value;
            if (this.rightIsNext) {
               this.right = leftMax.right;
            }

            this.left = this.left.removeMax();
            if (this.relativePosition > 0) {
               this.relativePosition--;
            }
         }

         this.recalcHeight();
         return this;
      }
   }

   private TreeList$AVLNode balance() {
      switch (this.heightRightMinusLeft()) {
         case -2:
            if (this.left.heightRightMinusLeft() > 0) {
               this.setLeft(this.left.rotateLeft(), null);
            }

            return this.rotateRight();
         case -1:
         case 0:
         case 1:
            return this;
         case 2:
            if (this.right.heightRightMinusLeft() < 0) {
               this.setRight(this.right.rotateRight(), null);
            }

            return this.rotateLeft();
         default:
            throw new RuntimeException("tree inconsistent!");
      }
   }

   private int getOffset(TreeList$AVLNode node) {
      return node == null ? 0 : node.relativePosition;
   }

   private int setOffset(TreeList$AVLNode node, int newOffest) {
      if (node == null) {
         return 0;
      }

      int oldOffset = this.getOffset(node);
      node.relativePosition = newOffest;
      return oldOffset;
   }

   private void recalcHeight() {
      this.height = Math.max(
            this.getLeftSubTree() == null ? -1 : this.getLeftSubTree().height, this.getRightSubTree() == null ? -1 : this.getRightSubTree().height
         )
         + 1;
   }

   private int getHeight(TreeList$AVLNode node) {
      return node == null ? -1 : node.height;
   }

   private int heightRightMinusLeft() {
      return this.getHeight(this.getRightSubTree()) - this.getHeight(this.getLeftSubTree());
   }

   private TreeList$AVLNode rotateLeft() {
      TreeList$AVLNode newTop = this.right;
      TreeList$AVLNode movedNode = this.getRightSubTree().getLeftSubTree();
      int newTopPosition = this.relativePosition + this.getOffset(newTop);
      int myNewPosition = -newTop.relativePosition;
      int movedPosition = this.getOffset(newTop) + this.getOffset(movedNode);
      this.setRight(movedNode, newTop);
      newTop.setLeft(this, null);
      this.setOffset(newTop, newTopPosition);
      this.setOffset(this, myNewPosition);
      this.setOffset(movedNode, movedPosition);
      return newTop;
   }

   private TreeList$AVLNode rotateRight() {
      TreeList$AVLNode newTop = this.left;
      TreeList$AVLNode movedNode = this.getLeftSubTree().getRightSubTree();
      int newTopPosition = this.relativePosition + this.getOffset(newTop);
      int myNewPosition = -newTop.relativePosition;
      int movedPosition = this.getOffset(newTop) + this.getOffset(movedNode);
      this.setLeft(movedNode, newTop);
      newTop.setRight(this, null);
      this.setOffset(newTop, newTopPosition);
      this.setOffset(this, myNewPosition);
      this.setOffset(movedNode, movedPosition);
      return newTop;
   }

   private void setLeft(TreeList$AVLNode node, TreeList$AVLNode previous) {
      this.leftIsPrevious = node == null;
      this.left = this.leftIsPrevious ? previous : node;
      this.recalcHeight();
   }

   private void setRight(TreeList$AVLNode node, TreeList$AVLNode next) {
      this.rightIsNext = node == null;
      this.right = this.rightIsNext ? next : node;
      this.recalcHeight();
   }

   public String toString() {
      return "AVLNode("
         + this.relativePosition
         + ","
         + (this.left != null)
         + ","
         + this.value
         + ","
         + (this.getRightSubTree() != null)
         + ", faedelung "
         + this.rightIsNext
         + " )";
   }
}
