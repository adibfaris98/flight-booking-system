/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flight;

/**
 *
 * @author ADIBFARIS
 */
public class MyQueue <T> {

    private int head;
    private int tail;
    private int maxSize;
    private T[] arr;

    public MyQueue(int size) {
        this.head = 0;
        this.tail = 0;
        this.maxSize = size;
        this.arr = (T[]) new Object[maxSize];
    }

    public boolean isEmpty() {
        if (tail == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        return tail >= maxSize;
    }

    public void enqueue(T value) {
        if (isEmpty()) {
            arr[head] = value;
            tail++;
        } else {
            if (isFull()) {
                System.out.println("No Flight Available for you , Sorry for the inconvenince . Thanks for choosing RAWANG FLIGHT!");
            } else {
                arr[tail] = value;
                tail++;
            }
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Nothing to dequeue");
        } else {
            T temp = arr[head];

            for (int i = 0; i < tail - 1; i++) {
                arr[i] = arr[i + 1];
            }
            tail--;
            return temp;
        }
        return null;
    }

    public T display1() {
        if (!isEmpty()) {
            for (int i = 0; i < maxSize; i++) { // to display entire index
//                for (int j = 0; j < tail; j++) { // to display data entire data
                return arr[i];
            }
        } else {
            System.out.println();
        }
        return null;
    }

    public void display() {
        if (!isEmpty()) {
            for (int i = 0; i < maxSize; i++) { // to display entire index
//                for (int j = 0; j < tail; j++) { // to display data entire data
                System.out.println(arr[i]);
            }
        } else {
            System.out.println();
        }
    }

    public void enqueueMany(String multipleStr) {
        String[] tempString = multipleStr.split(",");   // can use other delimiters like " " or "/" or "-" or "_"
        for (int i = 0; i < tempString.length; i++) {
            enqueue((T) tempString[i]);
        }
    }

    public boolean check(String something) {
        if (!isEmpty()) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == something) {
                    return true;
                }
            }
        }
        return false;
    }

    public void dequeueAll() {
        if (!isEmpty()) {
            for (int n = tail - 1; n >= 0; n--) {
                dequeue();
            }
        }
    }

    public String getQueue() {
        return (String) arr.toString();
    }
}
