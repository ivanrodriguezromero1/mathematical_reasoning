package com.rasona.rasona.utils.problem;

import com.rasona.rasona.utils.NumberUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class AlternativeGenerator {

    private final Random random = new Random();

    public List<String> generateAlternatives(String answer) {
        List<String> alternatives = new ArrayList<>();

        double ansDouble = 0;
        Long ansLong;

        if (!NumberUtils.isDouble(answer)) {
            ansLong = Long.parseLong(NumberUtils.transformIfNotDouble(answer));
            alternatives.add(String.valueOf(ansLong));
            for (int i = 0; i < 3; i++) {
                String alternative;
                do {
                    alternative = generateAlternative(ansLong);
                } while (alternatives.contains(alternative));
                alternatives.add(alternative);
            }
        } else {
            ansDouble = Double.parseDouble(answer);
            ansDouble = Math.floor(ansDouble * 100) / 100;
            alternatives.add(String.valueOf(ansDouble));
            for (int i = 0; i < 3; i++) {
                String alternative;
                do {
                    alternative = generateAlternative(ansDouble);
                } while (alternatives.contains(alternative));
                alternatives.add(alternative);
            }
        }

        Collections.shuffle(alternatives);
        return alternatives;
    }

    private String generateAlternative(double ansDouble) {
        double altDouble = random.nextInt(2) == 0
                ? ansDouble + random.nextDouble() * (random.nextInt(5) + 1)
                : ansDouble - random.nextDouble() * (random.nextInt(3) + 1);
        return String.format(Locale.getDefault(), "%.2f", Math.round(altDouble * 100.0) / 100.0);
    }

    private String generateAlternative(Long ansLong) {
        long altInt = random.nextInt(2) == 0
                ? ansLong + random.nextInt(5) + 1
                : ansLong - random.nextInt(3) - 1;
        return String.valueOf(altInt);
    }
}