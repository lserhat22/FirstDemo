import java.util.List;

public class BaseSteps {
    static void bug(){
        for (int i = 0; i > 0; i++) {
            System.out.println("birol");
        }
    }
    static void bug2(){
        for (int i = 1; i < 0; i++) {
            System.out.println("birol");
        }
    }

    static void bug3(){
        List<String> list;
        list.add("Birol");
        for (int i = 1; i < 0; i++) {
            list.get(i);
        }
    }

    public static void main(String[] args) {
        bug();
        bug2();
        bug3();
    }
}
