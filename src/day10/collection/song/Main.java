package day10.collection.song;

public class Main {
    public static void main(String[] args) {

        // 세이브파일 자동로드
        ArtistRepository.loadFile();

        ArtistView.start();
    }
}