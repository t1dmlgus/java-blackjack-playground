package blackjack.domain.ui.output;

public class Output {

    private static final String INPUT_PLAYER_NAME = "게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)";

    // player 이름 입력 요청을 출력하는 메소드
    public void printInputPlayerName() {
        System.out.println(INPUT_PLAYER_NAME);
    }


}
