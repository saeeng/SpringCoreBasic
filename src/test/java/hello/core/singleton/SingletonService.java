package hello.core.singleton;

public class SingletonService {
    // jvm 동작시 static 메모리에 초기화
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    // private 생성자를 통해 외부에서 생성하는 것을 방지
    private SingletonService() {

    }

    public void testMethod() {
        System.out.println("야호");
    }
}
