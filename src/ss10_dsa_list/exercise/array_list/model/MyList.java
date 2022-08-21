package ss10_dsa_list.exercise.array_list.model;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private int capacity = DEFAULT_CAPACITY;
    Object[] elements;

    //constructor

    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[this.capacity];
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity < this.size) {
            throw new IndexOutOfBoundsException("now size = " + this.size + "new Capacity = " + capacity);
        }
        this.capacity = capacity;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index = " + index + " , size = " + this.size);
        }
    }

    public void ensureCapacity() {
        if (this.size >= this.capacity) {
            this.capacity *= 1.5;
            Object[] newArr = new Object[this.capacity];
            for (int i = 0; i < this.size; i++) {
                newArr[i] = elements[i];
            }
            elements = newArr;

        }
    }

    public void add(int index, Object element) {
        if (index != size) {
            checkIndex(index);
        }
        ensureCapacity();
        for (int i = size; i >= index; i--) {
            if (i == index) {
                elements[i] = element;
                break;
            }
            elements[i] = elements[i - 1];
        }
        this.size++;
    }

    public Object remove(int index) {
        checkIndex(index);
        Object temp = elements[index];
        for (int i = index; i < this.size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[this.size - 1] = null;
        size--;
        return temp;
    }

    public Object[] cloneCollection() {
        Object[] newArray = new Object[this.size];
        System.arraycopy(elements, 0, newArray, 0, this.size);
        return newArray;
    }

    public boolean contains(Object o) {
        for (Object element :
                elements) {
            if (element.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < this.size; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public Object get(int index) {
        checkIndex(index);
        return elements[index];
    }

    public void clear() {
        for (int i = 0; i < this.size; i++) {
            elements[i] = null;
        }
        this.size = 0;
    }

    @Override
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < this.size; i++) {
            result += elements[i];
            if (i == this.size - 1) {
                break;
            }
            result += " , ";
        }
        result += "] ";
        return result;
    }
}

