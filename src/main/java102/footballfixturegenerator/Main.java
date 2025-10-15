package main.java102.footballfixturegenerator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> teams = Arrays.asList(
                "Galatasaray", "Bursaspor", "Fenerbahce",
                "Besiktas", "Basaksehir", "Trabzonspor"
        );

        Fixture fixture = new Fixture(teams);

        List<List<String[]>> firstHalf = fixture.generateFirstHalf();
        fixture.printFixture(firstHalf);

        List<List<String[]>> secondHalf = fixture.generateSecondHalf(firstHalf);
        fixture.printFixture(secondHalf);
    }
}
