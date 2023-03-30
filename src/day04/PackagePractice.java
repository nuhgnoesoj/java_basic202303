package day04;

//import fruit.Banana;  //import는 패키지 밑에 클래스 위에 작성
//import fruit.Grape;
import fruit.*;
import fruit.warm.PineApple;

import java.util.Scanner;

public class PackagePractice {

    public static void main(String[] args) {

        new fruit.Apple();

        Banana banana = new Banana();
        new Grape();

        new PineApple();

        Scanner sc = new Scanner(System.in);
    }
}