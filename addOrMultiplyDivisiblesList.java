

import java.util.ArrayList;

public class addOrMultiplyDivisiblesList {

    enum Operations{
        Addition, // for adding list of divisors +
        Multiplication // for multiplying list of divisors *
    }

    public static void main(String[] args) {

        ArrayList<Integer> divisiblesList = new ArrayList<>();

        ArrayList<Integer> divisorsList = new ArrayList<>();

        // --inputs--

        Operations chosenOperator = Operations.Addition; // chosen operator

        int limit = 6;

        divisorsList.add(2);
        divisorsList.add(3);

        // --inputs end--

        int additionResult = 0;
        int multiplyResult = 1;
        int finalResult = 0;

        if(limit <= 0){
            System.out.println("Please enter a limit number greater than 0...");
        }else if(divisorsList.isEmpty()){
            System.out.println("Please add numbers in divisorsList...");
        } else {

            for (int i = 1; i <= limit; i++) {
                for (int j = 0; j < divisorsList.size(); j++) {
                    if (i % divisorsList.get(j) == 0 && !divisiblesList.contains(i)) {

                        divisiblesList.add(i);

                    }
                }
            }

            for (int d = 0; d < divisiblesList.size(); d++) {
                if (chosenOperator == Operations.Multiplication) {

                    multiplyResult *= divisiblesList.get(d);
                    finalResult = multiplyResult;

                }
                if (chosenOperator == Operations.Addition) {

                    additionResult += divisiblesList.get(d);
                    finalResult = additionResult;
                }
            }

            System.out.println("Result is " + finalResult);

        }
    }
}





