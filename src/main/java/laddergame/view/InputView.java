package laddergame.view;

import laddergame.domain.GameResult;

import java.util.Scanner;

public class InputView {
    private static Scanner reader = new Scanner(System.in);

    public static String askPlayersNames() {
        System.out.println("참여할 사람의 이름을 입력하세요. 이름은 쉼표로 구분하세요!");
        return reader.nextLine();
    }

    public static String askHeight() {
        System.out.println("사다리 높이는 몇 개인가요?");
        return reader.nextLine();
    }

    public static String askPrizes() {
        System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요.)");
        return reader.nextLine();
    }

    public static String askRequest() {
        System.out.println("결과를 보고 싶은 사람은 ?");
        return reader.nextLine();
    }
}
