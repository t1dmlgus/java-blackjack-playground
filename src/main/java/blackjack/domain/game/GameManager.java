package blackjack.domain.game;

import blackjack.domain.ui.input.Input;
import blackjack.domain.ui.output.Output;

import java.util.ArrayList;
import java.util.List;

public class GameManager {

    private Input in = new Input();
    private Output out = new Output();

    // Player
    List<String> players = new ArrayList<>();


    public void run(){

        // player 입력
        out.printInputPlayerName();

        // 문자열 처리
        List<String> playerName = StringUtils.processPlayer(in.inputPlayerName());

        // 유효성 검사


        // 블랙잭 시작

    }


}
