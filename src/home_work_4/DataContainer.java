package home_work_4;

import java.util.Comparator;

public class DataContainer<T> {

    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add(T item) {
        if (item == null) {
            return -1;
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }

        T[] newData = (T[]) new Object[data.length + 1];
        System.arraycopy(data, 0, newData, 0, data.length);
        newData[data.length] = item;
        data = newData;

        return data.length - 1;
    }

    public T get(int index) {
        if (index >= 0 && index < data.length) {
            return data[index];
        }
        return null;
    }

    public T[] getItems() {
        return data;
    }

    public boolean deleteIndex(int index) {
        if (index >= 0 && index < data.length) {
            data[index] = null;

            // Смещаем элементы после удаления
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            data = java.util.Arrays.copyOf(data, data.length - 1);
            return true;
        }
        return false;
    }

    public boolean deleteItem(T item) {
        if (item == null) {
            return false;
        }

        for (int i = 0; i < data.length; i++) {
            if (item.equals(data[i])) {
                return deleteIndex(i);
            }
        }
        return false;
    }

    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] != null && data[j + 1] != null && comparator.compare(data[j], data[j + 1]) > 0) {
                    T temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < data.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(data[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
