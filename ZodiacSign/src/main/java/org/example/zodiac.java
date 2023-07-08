package org.example;

import java.util.Random;

public class zodiac {
    static final String POSITIVE_TEXT = "У %s все хорошо";
    static final String NEGATIVE_TEXT = "Для %s сегодня все плохо";


    enum AstrologicalSign {
        ARIES(0), TAURUS(1), GEMINI(2),
        CANCER(3), LEO(4), VIRGO(5),
        LIBRA(6), SCORPIO(7), SAGITTARIUS(8),
        CAPRICORN(9), AQUARIUS(10), PISCES(11);

        AstrologicalSign(int code) {
            this.code = code;
        }

        final int code;
    }

    static final String[][] PREDICTIONS = new String[][]{
            {POSITIVE_TEXT.formatted("овнов"), NEGATIVE_TEXT.formatted("овнов")},
            {POSITIVE_TEXT.formatted("тельцов"), NEGATIVE_TEXT.formatted("тельцов")},
            {POSITIVE_TEXT.formatted("близнецов"), NEGATIVE_TEXT.formatted("близнецов")},
            {POSITIVE_TEXT.formatted("раков"), NEGATIVE_TEXT.formatted("раков")},
            {POSITIVE_TEXT.formatted("львов"), NEGATIVE_TEXT.formatted("львов")},
            {POSITIVE_TEXT.formatted("дев"), NEGATIVE_TEXT.formatted("дев")},
            {POSITIVE_TEXT.formatted("весов"), NEGATIVE_TEXT.formatted("весов")},
            {POSITIVE_TEXT.formatted("скорпионов"), NEGATIVE_TEXT.formatted("скорпионов")},
            {POSITIVE_TEXT.formatted("стрельцов"), NEGATIVE_TEXT.formatted("стрельцов")},
            {POSITIVE_TEXT.formatted("козерогов"), NEGATIVE_TEXT.formatted("козерогов")},
            {POSITIVE_TEXT.formatted("водолей"), NEGATIVE_TEXT.formatted("водолей")},
            {POSITIVE_TEXT.formatted("рыб"), NEGATIVE_TEXT.formatted("рыб")}
    };

    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("должен быть передан только 1 аргумент знак зодиака");
        }

        AstrologicalSign sign = AstrologicalSign.valueOf(args[0]);
        String[] prd = PREDICTIONS[sign.code];
        int random = new Random().nextInt(2);
        String prediction = prd[random];
        System.out.println(prediction);


    }


}
