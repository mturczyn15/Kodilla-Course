package com.kodilla.stream;

/*import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;*/

import com.kodilla.stream.person.People;

public class StreamMainn {
    public static void main(String[] args) {
        /*Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println("dupaaaaa");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Hello World", String::toUpperCase);
        poemBeautifier.beautify("Hello World", (text) -> "!!! " + text + " !!!");
        poemBeautifier.beautify("Hello World", (text) -> "ABC " + text + " ABC");
        poemBeautifier.beautify("hello world", (text) ->   text.substring(0,1).toUpperCase() + text.substring(1,6) + text.substring(6,7).toUpperCase() + text.substring(7,11));
        poemBeautifier.beautify("Hello I am Marcin Turczyn", (text) -> text.substring(0,5) + "," + text.substring(5));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(" ") + 2) + ".")
                .filter(s -> s.substring(0,1).equals("M"))
//                .filter(s -> s.startsWith("M"))
                .forEach(System.out::println);



    }
}