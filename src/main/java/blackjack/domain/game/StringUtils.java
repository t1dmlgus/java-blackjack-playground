package blackjack.domain.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtils {

    // 문자열 처리가 된 Player 반환
    public static List<String> processPlayer(String playerInput){
        return trimplayer(splitPlayer(playerInput));
    }

    // 쉼표 기준으로 문자열 배열
    public static String[] splitPlayer(String playerInput) {
        return playerInput.split(",");
    }

    // 앞, 뒤 공백 제거
    public static List<String> trimplayer(String[] splitPlayers) {

        List<String> processPlayer = new ArrayList<>();
        for (String player : splitPlayers) {
            processPlayer.add(player.trim());
        }
        return processPlayer;
    }
}
