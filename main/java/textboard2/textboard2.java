package textboard2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class textboard2 {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        ArrayList<String> titles = new ArrayList<>();
        ArrayList<String> contents = new ArrayList<>();
        while (true) {
            System.out.print("명령어 : ");
            String command2 = scan1.nextLine();
            if (command2.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else if (command2.equals("add")) {
                System.out.println("게시물 제목을 입력해주세요:");
                titles.add(scan1.nextLine());
                System.out.println("게시물 내용을 입력해주세요:");
                contents.add(scan1.nextLine());
                System.out.println("게시물이 등록되었습니다.");
            } else if (command2.equals("list")) {
                for (int i = 0; i < titles.size(); i++) {
                    System.out.println("==================");
                    System.out.printf("번호 : %s\n", i + 1);
                    System.out.printf("제목 : %s\n", titles.get(i));
                    System.out.println("==================");
                }
            } else if (command2.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int postNumber = Integer.parseInt(scan1.nextLine());

                if (postNumber < 1 || postNumber > titles.size()) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    System.out.println("현재 제목 : " + titles.get(postNumber - 1));
                    System.out.println("현재 내용 : " + contents.get(postNumber - 1));

                    System.out.print("제목: "
                    );
                    String newTitle = scan1.nextLine();
                    titles.set(postNumber - 1, newTitle);

                    System.out.print("내용: ");
                    String newContent = scan1.nextLine();
                    contents.set(postNumber - 1, newContent);

                    System.out.println(postNumber + "번 게시물이 수정되었습니다.");
                }
            } else {
                System.out.println("올바른 명령어를 입력하세요.");
            }

            // for문을 사용하여 순차적으로 ㄷ반복되게 i라는 변수를생성하여 제목과 내용이 1부터 순차적으로 반복되게 해줌


//            else if (command2.equals("update")) {
//                for (int i = 0; i ++i) {
//                    System.out.println("수정할 게시물 번호 : 3");
//
//
//                    String mtitle = scan1.nextLine();
//                    System.out.println("없는 게시물 번호 입니다.");
//                }
//
//            }


        }


    }
}



//    - 명령어 : add
//  - 설명 : 게시물은 제목, 내용으로 이루어져 있습니다. 제목과 내용을 입력받아 저장
//  - 입출력 예시
//  ```
//    명령어 : add
//    게시물 제목을 입력해주세요 : 제목1
//    게시물 내용을 입력해주세요 : 내용1
//    게시물이 등록되었습니다.
//    명령어 : add
//    게시물 제목을 입력해주세요 : 제목2
//    게시물 내용을 입력해주세요 : 내용2
//    게시물이 등록되었습니다.
//            ```





