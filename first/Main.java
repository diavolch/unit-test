package seminars.first;

import seminars.first.Calculator.Calculator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.calculatingDiscount(500, 10));
    }
}