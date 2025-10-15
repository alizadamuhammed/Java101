package main.java102.footballfixturegenerator;

import java.util.ArrayList;
import java.util.List;

public class Fixture {

    private List<String> teams;

    public Fixture(List<String> teams) {
        this.teams = new ArrayList<>(teams);

        // Eğer takım sayısı tek ise "Bay" ekle
        if (this.teams.size() % 2 != 0) {
            this.teams.add("Bay");
        }
    }

    public List<List<String[]>> generateFirstHalf() {
        int n = teams.size();
        int totalWeeks = n - 1;
        List<String> rotated = new ArrayList<>(teams);
        List<List<String[]>> firstHalf = new ArrayList<>();

        for (int week = 1; week <= totalWeeks; week++) {
            List<String[]> matches = new ArrayList<>();
            for (int i = 0; i < n / 2; i++) {
                String home = rotated.get(i);
                String away = rotated.get(n - 1 - i);

                if (!home.equals("Bay") && !away.equals("Bay")) {
                    matches.add(new String[]{home, away});
                }
            }
            firstHalf.add(matches);

            List<String> newRotated = new ArrayList<>();
            newRotated.add(rotated.get(0));
            newRotated.add(rotated.get(n - 1));
            for (int i = 1; i < n - 1; i++) {
                newRotated.add(rotated.get(i));
            }
            rotated = newRotated;
        }

        return firstHalf;
    }

    public List<List<String[]>> generateSecondHalf(List<List<String[]>> firstHalf) {
        List<List<String[]>> secondHalf = new ArrayList<>();

        for (List<String[]> weekMatches : firstHalf) {
            List<String[]> newWeek = new ArrayList<>();
            for (String[] match : weekMatches) {
                newWeek.add(new String[]{match[1], match[0]});
            }
            secondHalf.add(newWeek);
        }

        return secondHalf;
    }

    public void printFixture(List<List<String[]>> fixture) {
        int weekNumber = 1;
        for (List<String[]> week : fixture) {
            System.out.println("Hafta " + weekNumber);
            for (String[] match : week) {
                System.out.println(match[0] + " – " + match[1]);
            }
            System.out.println();
            weekNumber++;
        }
    }
}
