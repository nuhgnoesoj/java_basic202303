package hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Notice {

    private Scanner sc;
    private List<String[]> boardList;
    private int seq;

    public Notice() { // 생성자(각 값들의 초기화)
        this.sc = new Scanner(System.in); // 문자열 입력을 위한 Scanner 생성
        this.boardList = new ArrayList<>(); // ArrayList 사용을 위한 초기화
        this.seq = 1; // 게시물 번호
    }

    public void startMessage() { // 시작 메세지
        System.out.println("1. 등록 2. 전체조회 3. 선택조회 4. 수정 5. 삭제 0. 종료");
    }

    public void searchBooMessage(boolean searchBoo) { // 조회 여부 메세지
        if(!searchBoo) { // 조회 실패일 때
            System.out.println("선택한 값은 없습니다.");
        }
    }

    public void exit() { // 종료
        System.out.println("종료되었습니다.");
    }

    public void choiceCancel() { // 선택 실패
        System.out.println("잘못선택하셨습니다.");
    }

    public boolean listEmptyBoo() { // 배열 값 존재 여부 판단
        if (this.boardList.isEmpty()) { // 값이 존재하지 않을 때
            System.out.println("등록된 값이 없습니다.");
            return false;
        }
        return true;
    }

    public String inputStr() { // 입력
        return this.sc.next();
    }

    public void create() { // 등록

        System.out.println("등록란입니다.");

        String[] boardArrVar = new String[4]; // 등록할 입력 값 배열 선언
        boardArrVar[0] = String.valueOf(seq); // 등록할 게시물 번호 추가

        System.out.println(boardArrVar[0] + "번의 등록할 제목을 입력하세요.");
        boardArrVar[1] = sc.next(); // 등록할 제목 입력

        System.out.println(boardArrVar[0] + "번의 등록할 내용을 입력하세요.");
        boardArrVar[2] = sc.next(); // 등록할 내용 입력

        System.out.println(boardArrVar[0] + "번의 등록할 추가정보를 입력하세요.");
        boardArrVar[3] = sc.next(); // 등록할 추가정보 입력

        this.boardList.add(boardArrVar); // ArrayList의 등록 로직 실행

        System.out.println("등록완료되었습니다.");

        seq++;
    }

    public void listSearch() { // 전체 조회
        System.out.println("전체조회입니다.");
        if (listEmptyBoo()) { // 배열에 저장된 값 존재 여부 판단
            for(String[] boardArrVar : this.boardList) {
                System.out.println(boardArrVar[0] + "번에 등록된 내용은 다음과 같습니다.");
                System.out.println("이름 = > [" + boardArrVar[1] + "] 내용 = > [" + boardArrVar[2] + "] 추가정보 = > [" + boardArrVar[3] + "]");
            }
            System.out.println("조회가 끝났습니다.");
        }
    }

    public void choiceSearch() { // 선택 조회
        System.out.println("선택조회입니다.");
        if (listEmptyBoo()) { // 배열에 저장된 값 존재 여부 판단

            System.out.println("선택조회할 번호를 입력하세요.");
            String searchVal = sc.next(); // 조회할 번호 입력
            boolean searchBoo = false; // 조회 여부

            for(String[] boardArrVar : this.boardList) {
                if(boardArrVar[0].equals(searchVal)) {  // 배열에 저장되어 있는 게시물 번호와 조회 값이 같을 때
                    System.out.println(boardArrVar[0] + "번의 값은 다음과 같습니다.");
                    System.out.println("이름 = > [" + boardArrVar[1] + "] 내용 = > [" + boardArrVar[2] + "] 추가정보 = > [" + boardArrVar[3] + "]");
                    searchBoo = true; // 조회 성공
                    break;
                }
            }
            searchBooMessage(searchBoo); // 조회 여부 전달
        }
    }

    public void modify() { // 수정
        System.out.println("수정란입니다.");
        if (listEmptyBoo()) { // 배열에 저장된 값 존재 여부 판단

            System.out.println("수정할 번호를 입력하세요.");
            String searchVal = sc.next(); // 조회할 번호 입력
            boolean searchBoo = false; // 조회 여부

            for(String[] boardArrVar : this.boardList) {
                if(boardArrVar[0].equals(searchVal)) {
                    System.out.println(boardArrVar[0] + "번의 값은 다음과 같습니다.");
                    System.out.println("이름 = > [" + boardArrVar[1] + "] 내용 = > [" + boardArrVar[2] + "] 추가정보 = > [" + boardArrVar[3] + "]");

                    System.out.println("수정이 시작됩니다.");

                    System.out.println(boardArrVar[0] + "수정할 제목을 입력하세요.");
                    boardArrVar[1] = this.inputStr();
                    System.out.println(boardArrVar[0] + "수정할 내용을 입력하세요.");
                    boardArrVar[2] = this.inputStr();
                    System.out.println(boardArrVar[0] + "수정할 내용을 입력하세요.");
                    boardArrVar[3] = this.inputStr();

                    System.out.println("수정이 완료되었습니다.");

                    searchBoo = true; // 조회 성공
                    break;

                }
            }
            searchBooMessage(searchBoo); // 조회 여부 전달
        }
    }

    public void delete() { // 삭제
        System.out.println("삭제란입니다.");
        if (listEmptyBoo()) { // 배열에 저장된 값 존재 여부 판단

            System.out.println("삭제할 번호를 입력하세요.");
            String searchVal = sc.next(); // 조회할 번호 입력
            boolean searchBoo = false; // 조회 여부

            for(String[] boardArrVar : this.boardList) {

                if(boardArrVar[0].equals(searchVal)) {
                    System.out.println(boardArrVar[0] + "번의 값은 다음과 같습니다.");
                    System.out.println("제목 = > [" + boardArrVar[1] + "] 내용 = > [" + boardArrVar[2] + "] 추가정보 = > [" + boardArrVar[3] + "]");

                    System.out.println("해당 값을 삭제하시겠습니까? Y[예] // N[아니오]");
                    String deleteChoice = sc.next(); // 삭제 여부 입력

                    if(deleteChoice.equals("Y")) {  // 삭제 선택일 때

                        this.boardList.remove(boardArrVar); // ArrayList의 삭제 로직 실행
                        System.out.println("삭제완료되었습니다.");
                        break;

                    }else { // 삭제 취소일 때
                        System.out.println("삭제가 취소되었습니다.");
                    }

                    searchBoo = true; // 조회 성공
                    break;
                }
            }
            searchBooMessage(searchBoo); // 조회 여부 전달
        }
    }

    public static void main(String[] args) {

        Notice notice = new Notice();

        while(true) {

            notice.startMessage(); // 시작 메세지
            String choice = notice.inputStr(); // 모드 선택 입력

            if(choice.equals("1")) { // 등록
                notice.create();
            }else if(choice.equals("2")) { // 전체조회
                notice.listSearch();
            }else if(choice.equals("3")) { // 선택조회
                notice.choiceSearch();
            }else if(choice.equals("4")) { // 수정
                notice.modify();
            }else if(choice.equals("5")) { // 삭제
                notice.delete();
            }else if(choice.equals("0")) { // 종료
                notice.exit();
                break;
            }else { // 모드 선택 실패
                notice.choiceCancel();
                continue;
            }
        }
    }
}

