package hu.me;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        String calculatorJson =
                "{ \"muvelet\" : \"osszeadas\", \"operandusok\" : [3, 4]}";

        try {
            Calculator calculator = objectMapper.readValue(calculatorJson, Calculator.class);

            System.out.println("muvelet = " + calculator.getMuvelet());
            System.out.println("operandusok = " +
                    calculator.getOperandusok()[0] + ", " + calculator.getOperandusok()[1]);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
