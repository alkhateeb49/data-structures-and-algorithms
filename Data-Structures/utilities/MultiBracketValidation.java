package utilities;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){
        Stack validationStack = new Stack();
        for (int i = 0; i < input.length(); i++){
            String brackets = String.valueOf(input.charAt(i));
            if (brackets.equals("{")||brackets.equals("[")|| brackets.equals("(")){
                validationStack .push(brackets);
            } else {
                if (brackets.equals(")")){
                    if (!validationStack .isEmpty()) {
                        if (validationStack .peek().equals("(")) {
                            validationStack .pop();
                        } else {
                            return false;
                        }
                    } else {
//                        System.out.println("1");
                        return false;
                    }
                } else if (brackets.equals("]")) {
                    if (!validationStack .isEmpty()) {
                        if (validationStack .peek().equals("[")) {
                            validationStack .pop();
                        } else {
//                            System.out.println("2");
                            return false;
                        }

                    } else {
                        return false;
                    }
                } else if (brackets.equals("}")) {
                    if (!validationStack .isEmpty()) {
                        if (validationStack .peek().equals("{")) {
                            validationStack .pop();
                        } else {
//                            System.out.println("3");
                            return false;
                        }

                    } else {
//                        System.out.println("4");
                        return false;
                    }
                } else {
//                    System.out.println("5");
                }
            }
        }
        return validationStack.isEmpty();
    }
}