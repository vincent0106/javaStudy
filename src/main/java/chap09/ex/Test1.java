package chap09.ex;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    /*
    * Data 라는 자료형(Class)을 만들고 특정 값이 들어왔을 때 오름차순과 내림차순을 처리하는
    * 클래스를 각각 만들고 처리하는 매서드 sort() 로 처리하게 구현하세요. (다형성 활용)
    * */

    public static void main (String[] args){
        Asc asc = new Asc();
        asc.setA(new Integer[]{5,1,2,3});
        asc.sorting();
        System.out.println("ASC : " + asc.toString());

        Desc desc = new Desc();
        desc.setA(new Integer[]{5,1,2,3});
        desc.sorting();
        System.out.println("DESC : " + desc.toString());

        Data data1 = new Asc();
        data1.setA(new Integer[]{5,1,2,3});
        data1.sorting();
        System.out.println("DATA1 ASC : " + data1.toString());

    }

}

abstract class Data {
    Integer[] a;

    public void setA(Integer[] a) {
        this.a = a;
    }

    public abstract void sorting();

    public Integer[] getA() {
        return a;
    }

    @Override
    public String toString() {
        return "Data{" + "a=" + Arrays.toString(a) + '}';
    }
}

class Asc extends Data{
    @Override
    public void sorting() {
        Arrays.sort(a);
    }
}

class Desc extends Data{
    @Override
    public void sorting() {
        Arrays.sort(a, Comparator.reverseOrder());
    }
}
