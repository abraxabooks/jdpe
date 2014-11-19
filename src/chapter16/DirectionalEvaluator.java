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

public class DirectionalEvaluator {

    Map<String, City> cities;

    public DirectionalEvaluator() {
        this.cities = new HashMap<String, City>();
        this.cities.put("aberdeen", new City("Aberdeen", 57.15, -2.15));
        this.cities.put("belfast", new City("Belfast", 54.62, -5.93));
        this.cities.put("birmingham", new City("Birmingham", 52.42, -1.92));
        this.cities.put("dublin", new City("Dublin", 53.33, -6.25));
        this.cities.put("edinburgh", new City("Edinburgh", 55.92, -3.02));
        this.cities.put("glasgow", new City("Glasgow", 55.83, -4.25));
        this.cities.put("london", new City("London", 51.53, -0.08));
        this.cities.put("liverpool", new City("Liverpool", 53.42, -3.0));
        this.cities.put("manchester", new City("Manchester", 53.5, -2.25));
        this.cities.put("southampton", new City("Southampton", 50.9, -1.38));
    }

    public City evaluate(String route) {
        // Define the syntax tree
        Stack<Expression> expressionStack = new Stack<Expression>();

        // Parse each token in route string
        for (String token : route.split(" ")) {
            // Is token a recognised city?
            if (this.cities.containsKey(token)) {
                City city = this.cities.get(token);
                expressionStack.push(new CityExpression(city));

            // Is token to find most northerly?
            } else if (token.equals("northerly")) {
                List<Expression> expressions = new ArrayList<Expression>();
                while (! expressionStack.empty()) {
                    expressions.add(expressionStack.pop());
                }
                expressionStack.push(new MostNortherlyExpression(expressions));

            // Is token to find most southerly?
            } else if (token.equals("southerly")) {
                List<Expression> expressions = new ArrayList<Expression>();
                while (! expressionStack.empty()) {
                    expressions.add(expressionStack.pop());
                }
                expressionStack.push(new MostSoutherlyExpression(expressions));

            // Is token to find most westerly?
            } else if (token.equals("westerly")) {
                List<Expression> expressions = new ArrayList<Expression>();
                while (! expressionStack.empty()) {
                    expressions.add(expressionStack.pop());
                }
                expressionStack.push(new MostWesterlyExpression(expressions));

            // Is token to find most easterly?
            } else if (token.equals("easterly")) {
                List<Expression> expressions = new ArrayList<Expression>();
                while (! expressionStack.empty()) {
                    expressions.add(expressionStack.pop());
                }
                expressionStack.push(new MostEasterlyExpression(expressions));
            }
        }

        // Resulting value
        return expressionStack.pop().interpret();
    }

}
