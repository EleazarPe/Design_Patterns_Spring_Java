package com.example.interpreter;

public class Interpreter {

    private Context context;

    public Interpreter(Context context) {
        this.context = context;
    }

    public float interpret(String expression){

        Expression expressionTree = buildExpressionTree(expression);
        return expressionTree.interpret(context);

    }

    private Expression buildExpressionTree(String expression) {

        // Tenemos que implementar la creacion del arbol dependiendo del String de la expression
        // Ejemplo de 10 * 10 / 10 + 200

        return new SumExpression(
                new NumberExpression(200),
                new DiviExpression(
                        new MultiExpression(
                                new NumberExpression(10),
                                new NumberExpression(10)
                        ),
                        new NumberExpression(10)
                )
        );
    }
}
