package service;

import entity.Member;
import java.util.ArrayList;

public class MemberServiceImpl implements MemberService {
    @Override
    public String greet(int i) {
        String[] greetings = {"GoodMorning","hello","good evening"};
        return greetings[i];
    }

    @Override
    public ArrayList<Member> getAll() {
        ArrayList<Member> list = new ArrayList<>();
        Member mem1 = new Member(1,"Linda","@gmail.com");
        Member mem2 = new Member(2,"Lin","@gmail.com");
        Member mem3 = new Member(3,"inda","@gmail.com");
        list.add(mem1);
        list.add(mem2);
        return list;
    }
}
