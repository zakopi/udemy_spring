package demo;

import entity.Member;
import service.MemberService;
import service.MemberServiceImpl;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        MemberServiceImpl service = new MemberServiceImpl();

        //シングルトンによりインスタンスの宣言ができない。メソッドでインスタンスを呼び出す。
        MemberServiceImpl service = MemberServiceImpl.getInstance();
        System.out.println(service.greet(2));
        System.out.println(service.getAll());
        ArrayList<Member> list = service.getAll();
        for(Member mem : list){
            System.out.println(mem.getId() + "," + mem.getName() + "," + mem.getEmail());
        }

        //streamを用いた関数の呼び出し
        System.out.println(service.sumOf(3,5));



    }
}