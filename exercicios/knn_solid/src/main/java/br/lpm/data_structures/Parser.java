package br.lpm.data_structures;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * A classe {@code Parser} fornece um método utilitário para analisar uma
 * entrada de string em vários tipos de dados, como {@code Integer}, 
 * {@code Double}, {@code Boolean}, e {@code LocalDate}. 
 * Se a entrada não corresponder a nenhum desses tipos, ela
 * retorna a própria string de entrada.
 * <p>
 * Esta é uma classe utilitária estática e não pode ser instanciada.
 * </p>
 */
public final class Parser {

    private Parser() {
    }

    /**
     * Analisa a entrada fornecida e tenta convertê-la em um dos seguintes
     * tipos:
     * {@code Integer}, {@code Double}, {@code Boolean} ou {@code LocalDate}. Se a
     * entrada não corresponder a nenhum desses tipos, 
     * retorna a própria string de entrada.
     *
     * @param input a string a ser analisada
     * @return um objeto que pode ser um {@code Integer}, {@code Double},
     *         {@code Boolean}, {@code LocalDate} ou {@code String}
     */
    public static Object parse(String input) {
        try {
            return Integer.parseInt(input);
        } catch (Exception e) {

        }
        try {
            return Double.parseDouble(input);
        } catch (Exception e) {

        }
        if (input.equalsIgnoreCase("sim") || input.equalsIgnoreCase("true")) {
            return true;
        }
        if (input.equalsIgnoreCase("não") || input.equalsIgnoreCase("false")) {
            return false;
        }
        try {
            return LocalDate.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (DateTimeParseException e) {
        }
        try {
            return LocalDate.parse(input, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        } catch (DateTimeParseException e) {
        }
        return input;
    }

}
