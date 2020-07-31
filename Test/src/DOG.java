

class Dog implements Comparable<Dog> {
    int size;
    public Dog(int s) {
        size = s;
    }
    public String toString() {
        return size + "";
    }
    @Override
    public int compareTo(Dog o) {
       //数值大小比较
        return size - o.size;
    }
}
