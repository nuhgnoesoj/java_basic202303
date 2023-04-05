package day08.poly.book;

// 도서관리 시스템 데이터 처리
public class LibraryRepository {

    // 회원 1명
    private static BookUser bookUser;

    // 도서들의 정보
    private static Book[] bookList;

    // 유저를 등록하는 기능
    public void register(BookUser userInfo) {
        bookUser = userInfo;
    }

    // 마이페이지 기능
    /*
        여기에 있는 bookUser 정보 리턴
     */
    BookUser findBookUser() {
        return bookUser;
    }

}