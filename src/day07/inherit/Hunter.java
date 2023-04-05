package day07.inherit;

import day04.Dancer;

public class Hunter extends Player {

    int concentration; // 집중력

    public Hunter(String nickName) {
        super(nickName);
        this.concentration = 100;
    }

    public void summonBeast() {

    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# concentration: " + this.concentration);
    }
}