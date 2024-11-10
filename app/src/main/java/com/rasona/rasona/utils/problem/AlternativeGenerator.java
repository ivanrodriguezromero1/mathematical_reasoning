package com.rasona.rasona.utils.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class AlternativeGenerator {

    private final Random random = new Random();

    public List<String> generateAlternatives(String answer) {
        List<String> alternatives = new ArrayList<>();
        alternatives.add(answer);

        boolean isDouble;
        double ansDouble = 0;
        int ansInt = 0;

        try {
            ansInt = Integer.parseInt(answer);
            isDouble = false;
        } catch (NumberFormatException e) {
            try {
                ansDouble = Double.parseDouble(answer);
                isDouble = true;
            } catch (NumberFormatException ex) {
                throw new IllegalArgumentException("The answer must be an integer or decimal number.");
            }
        }

        for (int i = 0; i < 3; i++) {
            String alternative;
            do {
                alternative = generateAlternative(ansDouble, ansInt, isDouble);
            } while (alternatives.contains(alternative));
            alternatives.add(alternative);
        }
        Collections.shuffle(alternatives);
        return alternatives;
    }

    private String generateAlternative(double ansDouble, int ansInt, boolean isDouble) {
        if (isDouble) {
            double altDouble = random.nextInt(2) == 0
                    ? ansDouble + random.nextDouble() * (random.nextInt(5) + 1)
                    : ansDouble - random.nextDouble() * (random.nextInt(3) + 1);
            return String.format(Locale.getDefault(), "%.2f", Math.round(altDouble * 100.0) / 100.0);
        } else {
            int altInt = random.nextInt(2) == 0
                    ? ansInt + random.nextInt(5) + 1
                    : ansInt - random.nextInt(3) - 1;
            return String.valueOf(altInt);
        }
    }
}
