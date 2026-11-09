/*
 * Decompiled with CFR.
 */
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;

public class mya
implements DragSourceListener {
    @Override
    public void dragEnter(DragSourceDragEvent dragSourceDragEvent) {
    }

    @Override
    public void dragOver(DragSourceDragEvent dragSourceDragEvent) {
    }

    @Override
    public void dragExit(DragSourceEvent dragSourceEvent) {
    }

    @Override
    public void dragDropEnd(DragSourceDropEvent dragSourceDropEvent) {
        if (dragSourceDropEvent.getDropSuccess()) {
            // empty if block
        }
    }

    @Override
    public void dropActionChanged(DragSourceDragEvent dragSourceDragEvent) {
    }
}

