package Quest.Calculater.Step3;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArithmeticTraining {

    private final List<Double> results = new ArrayList<>();

        public <T extends Number, U extends Number > double calculate (T num1, U num2, OperatorTraining operator){
            double double1 = num1.doubleValue();
            double double2 = num2.doubleValue();
            double result = operator.apply (double1, double2);

            results.add(result);
            return result;
        }
        public List<Double> getResults () {
            return results;
        }
        public void removeResult () {
            results.remove(0);
        }

        public List<Double> getResultsGreaterThan (double great) {
        return results.stream()
                .filter(v -> v > great)
                .collect(Collectors.toList());
        }
    }
