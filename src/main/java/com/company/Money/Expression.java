package com.company.Money;

public interface Expression {

    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);

    Expression times(int multiplier);
}