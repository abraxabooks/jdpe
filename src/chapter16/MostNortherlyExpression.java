package chapter16;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import java.util.*;

public class MostNortherlyExpression implements Expression {

    private List<Expression> expressions;

    public MostNortherlyExpression(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public City interpret() {
        City resultingCity = new City("Nowhere", -999.9, -999.9);
        for (Expression currentExpression : this.expressions) {
            City currentCity = currentExpression.interpret();
            if (currentCity.getLatitude() > resultingCity.getLatitude()) {
                resultingCity = currentCity;
            }
        }
        return resultingCity;
    }
}
