package de.starwit;

public class App {

    public static void main(String[] args) {
        System.out.println("Java CLI parameter example");
        printParams(args);
        if(args.length > 0) {
            //TODO
        } else {
            printHelp();
        }
        
    }

    private static void printParams(String[] args) {
        if(args.length > 0) {
            System.out.println("User provided the following parameters:");
            for (String param : args) {
                System.out.println("Parameter: " + param);
            }
        } else {
            System.out.println("No parameters provided");
        }

    }

    private static void printHelp() {
        System.out.println("The following paramters are accepted by this programm:");
    }

    private static void fancyFunction() {
        System.out.println("This function doesn't need a parameter");
    }

    private static void fancyFunctionOne(String parameter) {
        System.out.println("fancyFunctionOne was called and got parameter: " + parameter);
    }

    private static void fancyFunctionTwo(String parameter) {
        System.out.println("fancyFunctionTwo was called and got parameter: " + parameter);
    }
}
