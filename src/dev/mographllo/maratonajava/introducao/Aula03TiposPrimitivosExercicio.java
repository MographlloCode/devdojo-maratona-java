package dev.mographllo.maratonajava.introducao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aula03TiposPrimitivosExercicio {
    /*
    Prática

    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereco>,
    confirmo que recebi o salário de <salario>, na data <data>
    */
    public static void main(String[] args) {
        String nome = "Gustavo";
        String endereco = "Rua das Laranjeiras 53";
        double salario = 6500.32;

        LocalDate data = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = data.format(formatador);

        System.out.println("Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de R$"+salario+", na data "+dataFormatada);
    }


}
