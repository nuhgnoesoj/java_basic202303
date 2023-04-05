package day07.quiz;

public class Child extends Parent1 {

    private String name;

    public Child() {
        this("홍길동");
        System.out.println("Child() call!");
    }

    public Child(String name) {
        super();
        this.name = name;
        System.out.println("Child(String) call!");
    }
}