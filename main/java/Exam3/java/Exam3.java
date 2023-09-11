package Exam3.java;

public class Exam3 {

    public static void main(String[] args) {

        청둥오리 a청둥오리 = new 청둥오리(); // 청둥오리가 만들어집니다. 청둥오리는 기본 날개를 가지고 태어납니다.

        a청둥오리.날다(); // 청둥오리가 날개로 천천히 날아갑니다.

        흰오리 a흰오리 = new 흰오리(); // 흰오리가 만들어집니다. 흰오리는 불사조 날개를 가지고 태어납니다.

        a흰오리.날다(); // 흰오리가 불사조 날개로 불타오르며 날아갑니다.

        붉은오리 a붉은오리 = new 붉은오리(); // 붉은오리가 만들어집니다. 붉은오리는 로켓 날개를 가지고 태어납니다.

        a붉은오리 .날다(); // 붉은오리가 로켓날개로 놀라운 속도로 굉음을 내며 날아갑니다



    }}
class 오리{


    public void 날다() {
        System.out.println();
    }
    public void 날개() {
        System.out.println();
    }
    public void 태어나다() {
        System.out.println();
    }

}
class 청둥오리 extends 오리{

    public void 날개() {
        System.out.println("불사조 날개로");
    }
    public void 태어나다() {
        System.out.println("태어납니다");
    }

    public void 날다() {
        System.out.println("청둥오리가 날개로 천천히 날아갑니다");
    }


}
class 흰오리 extends 오리{
    public void 날개() {
        System.out.println("날개로");
    }
    public void 태어나다() {
        System.out.println("태어납니다");
    }

    public void 날다() {
        System.out.println("흰오리가 불사조 날개로 불타오르며 날아갑니다");
    }
}
class 붉은오리 extends 오리{

    public void 날다() {
        System.out.println("붉은오리가 로켓날개로 불타오르며 날아갑니다");
    }
}


