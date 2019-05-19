package laddergame.domain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Ladder {
    private List<Line> ladderInformationAsTrueFalse = new ArrayList<>();
    private final int width;
    private final int height;

    public Ladder(final int width, final String height) {
        LadderValidator.checkConditionsForLadder(height);

        this.width = width;
        this.height = Integer.parseInt(height);

        ladderInformationAsTrueFalse = generateLadderInformation(this.width, this.height);
    }

    private List<Line> generateLadderInformation(int width, int hegiht) {
        List<Line> ladderInformationAsTrueFalse = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            ladderInformationAsTrueFalse.add(new Line(width));
        }
        return ladderInformationAsTrueFalse;
    }



    public ArrayList<List<Boolean>> getLadderMap() {
        return this.ladderMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ladder ladder = (Ladder) o;
        return width == ladder.width &&
                height == ladder.height &&
                Objects.equals(ladderMap, ladder.ladderMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ladderMap, width, height);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int y = 0; y < height; y++) {
            toStringLine(sb, y);
        }

        return sb.toString();
    }

    private void toStringLine(StringBuilder sb, int y) {
        sb.append("     |");
        for (int x = 0; x < width - 1; x++) {
            sb.append(ladderMap.get(y).get(x) ? "-----|" : "     |");
        }
        sb.append("\n");
    }
}
