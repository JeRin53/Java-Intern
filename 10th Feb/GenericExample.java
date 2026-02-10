import java.util.ArrayList;

class Cat {
    void meow() {
        System.out.println("Meow");
    }
}

public class GenericExample<T> {
    T item;
    T size;

    GenericExample(T item, T size) {
        this.item = item;
        this.size = size;
    }

    void print() {
        System.out.println("Generic Example : " + item);
    }

    public static void main(String[] args) {
        GenericExample<Integer> obj1 = new GenericExample<>(3, 2);
        obj1.print();

        ArrayList<Cat> cats = new ArrayList<>();
        Cat myCat = new Cat();
        cats.add(myCat);

        GenericExample<Cat> catObj = new GenericExample<>(myCat, myCat);
        catObj.item.meow();
    }
}
