package main;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SyntaxUtil {
    //CONSTANTS
    public final static String ERROR_NUMBER_INPUT = "Введіть нормальне число наступного разу...";
    public final static String ASK_FOR_NUMBER = "Введіть число: ";
    public final static String ASK_FOR_FIRST_NUMBER = "Введіть перше число: ";
    public final static String ASK_FOR_SECOND_NUMBER = "Введіть друге число: ";

    //FIELDS
    private static final NumberFormat _numberFormatter = NumberFormat.getInstance();
    public final static NumberFormat numberFormatter = _numberFormatter;

    //METHODS
    public static double getDoubleNumber(final String message) {
        System.out.print(message);
        String line;

        try (Scanner scanner = new Scanner(System.in)) {
            line = scanner.next("0|(^[^0]\\d+[.,]?\\d*)|(^0?[.,]\\d+)");
            if (line.contains(",")) {
                line = line.replace(',', '.');
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(ERROR_NUMBER_INPUT, e);
        }
        return Double.parseDouble(line);
    }

    public static int getIntNumber(final String message) {
        System.out.print(message);
        String line;

        try (Scanner scanner = new Scanner(System.in)) {
            line = scanner.next("0|(^[^0]\\d*)");
        } catch (InputMismatchException e) {
            throw new RuntimeException(ERROR_NUMBER_INPUT, e);
        }
        return Integer.parseInt(line);
    }
}
