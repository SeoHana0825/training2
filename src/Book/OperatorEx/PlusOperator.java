package Book.OperatorEx;

public class PlusOperator {

    public static void main(String[] args) {

        // 증감 연산자
        // case1 - 다른 수식 포함, 메서드 포함이 안되어있을 경우 "단독 사용" 결과값 변화 x
        int i =5;
        i++;
        System.out.println(i);

        i=5;
        ++i;
        System.out.println(i);


        //case2 - 다른 수식 포함되었을 경우 결과값 변화 (전위 / 후위)
        int i2 =5, j = 0;

        j = i2++; //후위
        System.out.println("j=i2++; 실행 후, i2=" + i2 + ", j=" +j);

        i2=5;  // 결과 비교를 위한 값 변경 (단독 사용)
        j=0;

        j=++i2;
        System.out.println("j=++i2, 실행 후. i2=" + i2 + ", j=" +j);


        //case3 - 메서드에 포함되어 있을 경우 결과값 변화 (전위 / 후위)
        int i3=5, j3=5;

        System.out.println(i3++);
        System.out.println(++j3);
        System.out.println("i3= " + i3 + ", j3= " +j3);

    }
}
