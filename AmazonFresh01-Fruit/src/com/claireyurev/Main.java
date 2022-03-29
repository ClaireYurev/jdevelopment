package com.claireyurev;

public class FreshPromotion {

    public static int main(List<String> codeList, List<String> shoppingCart) {
        Stack<String> orderStack = new Stack<>();
        Stack<Stack<String>> codeStack = new Stack<>();
        boolean hasBeenFound = false;
        String fruit = "";
        String pastCodeFruit = "";

        if (codeList.isEmpty()) {
            return 1;
        }

        pushCodeStack(codeList, codeStack);
        pushOrderStack(shoppingCart, orderStack);

        while (!codeStack.isEmpty()) {
            Stack<String> codeFruitStack = codeStack.pop();
            hasBeenFound = false;
            while (!codeFruitStack.isEmpty()) {
                String codeFruit = codeFruitStack.pop();
                if (orderStack.isEmpty()) {
                    return 0;
                }

                if (hasBeenFound) {
                    fruit = orderStack.pop();

                    if (!checkFruit(codeFruit, fruit)) {
                        hasBeenFound = false;
                        codeFruitStack.push(pastCodeFruit);
                    }
                }

                while (!hasBeenFound && !orderStack.isEmpty()) {
                    fruit = orderStack.pop();
                    if (checkFruit(codeFruit, fruit)) {
                        hasBeenFound = true;
                    }
                }

                pastCodeFruit = codeFruit;
            }
        }

        if (!hasBeenFound && orderStack.isEmpty()) {
            return 0;
        }

        return 1;
    }

    private static void pushOrderStack(List<String> shoppingCart, Stack<String> orderStack) {
        for (int j = shoppingCart.size() - 1; j >= 0; j--) {
            orderStack.push(shoppingCart.get(j));
        }
    }

    private static void pushCodeStack(List<String> codeList, Stack<Stack<String>> codeStack) {
        for (int j = codeList.size() - 1; j >= 0; j--) {
            Stack<String> stringStack = new Stack<>();
            String code = codeList.get(j);
            String[] codeFruits = code.split(" ");

            for (int i = codeFruits.length - 1; i >= 0; i--) {
                stringStack.push(codeFruits[i]);
            }
            codeStack.push(stringStack);
        }
    }

    private static boolean checkFruit(String codeFruit, String fruit) {
        if (codeFruit.equalsIgnoreCase("anything")) {
            return true;
        } else if (codeFruit.equalsIgnoreCase(fruit)) {
            return true;
        } else {
            return false;
        }
    }

}