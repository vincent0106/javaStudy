package chap11;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;

public class Sample09 {

    /*
    * 정렬
    * */

    public static void main(String[] args){
        var list = new ArrayList<Employee>();
        list.add(new Employee(1, "학건"));
        list.add(new Employee(3, "상도"));
        list.add(new Employee(4, "빵형"));
        list.add(new Employee(2, "인호"));

        System.out.println(list.toString());
        Collections.sort(list);
        System.out.println(list.toString());
    }
}

@Data
@AllArgsConstructor
class Employee implements Comparable<Employee>{
    private int sabun;
    private String name;

    @Override
    public int compareTo(Employee e) {
        // ** name을 기준으로 정렬
        //return this.name.compareTo(e.name); //순정렬
        //return e.name.compareTo(this.name);//역정렬
        // ** sabun을 기준으로 정렬
        //return this.sabun - e.sabun;    //순정렬
        return e.sabun - this.sabun;    //역정렬

        // 음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 바뀐다.
        //return 1;
    }
}
