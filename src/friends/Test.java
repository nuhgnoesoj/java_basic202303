package friends;

import day07.util.Utility;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        People kim = new People("김철수");
        People park = new People("박영희");
        People hong = new People("홍길동");

        kim.addFollowerWaitList(park);
        kim.addFollowerWaitList(hong);
        kim.addFollower(hong);
        kim.addFollower(park);

        park.addFollowerWaitList(kim);
        park.addFollower(kim);

//        List<String> kimWaitList = kim.showFollowerWaitPerson();
//        System.out.println("kimWaitList = " + kimWaitList);

        System.out.println("김철수 팔로워목록 = " + kim.showFollower());
        System.out.println("김철수 팔로잉목록 = " + kim.showFollowings());
        Utility.makeLine();
        System.out.println("박영희 팔로워목록 = " + park.showFollower());
        System.out.println("박영희 팔로잉목록 = " + park.showFollowings());

        System.out.println("김철수 & 박영희 맞팔?? " + kim.isMatch(park));
        System.out.println("김철수 & 홍길동 맞팔?? " + kim.isMatch(hong));

    }
}