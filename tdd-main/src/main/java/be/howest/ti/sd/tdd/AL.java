package be.howest.ti.sd.tdd;

public class AL {

    private int size = 0;
    private int[] elements = new int[10];

    public void add(int index, int value) {
        if(index < 0 || index > size) throw new IndexOutOfBoundsException();

        for(int i = size -1; i >= index; i--){
            elements[i + 1] = elements[i];
        }
        controlSize();
        elements[index] = value;
        size++;
    }

    private void controlSize() {
        if(size + 1 == elements.length){
            int[] newElements = new int[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public void remove(int index) {
        if(isOutOfBounds(index)) throw new IndexOutOfBoundsException();
        if(isEmpty()) throw new IndexOutOfBoundsException();
        int[] newElements = new int[elements.length];
        System.arraycopy(elements, 0, newElements, 0, index);
        System.arraycopy(elements, index + 1, newElements, index, size - 1);
        elements = newElements;
        size--;
    }

    public int get(int index) {
        if(isOutOfBounds(index)) throw new IndexOutOfBoundsException();
        if(isEmpty()) throw new IndexOutOfBoundsException();
        return elements[index];
    }

    public boolean isOutOfBounds(int index) {
        return index < 0 || index >= size;
    }
}