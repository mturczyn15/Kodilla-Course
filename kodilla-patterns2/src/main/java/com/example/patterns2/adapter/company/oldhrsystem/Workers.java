package com.example.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String [][] workers = {
            {"587687", "John", "Kamyk"},
            {"34563453", "Ivone", "Nobvak"},
            {"456354", "Jessie", "Pinkman"},
            {"4356435", "Walter", "White"},
            {"45657453", "Clara", "Lanson"}};
    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00
    };
    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
