package Exercícios01;

import Exercícios01.Equipamentos.Funcionarios;

public class Cadastro {
    public static void main(String[] args) {
        Funcionarios funcionarios1 = new Funcionarios();
        Funcionarios funcionarios2 = new Funcionarios();
        Funcionarios funcionarios3 = new Funcionarios();
        Funcionarios funcionarios4 = new Funcionarios();

        funcionarios1.nome = "João Costa";
        funcionarios1.função = "Operador de Escavadeira";
        funcionarios1.matricula = 01;

        funcionarios2.nome = "Ricardo Leite";
        funcionarios2.função = "Operador de Patrol";
        funcionarios2.matricula = 02;

        funcionarios3.nome = "Marcos André";
        funcionarios3.função = "Operador de Rolo Compactador";
        funcionarios3.matricula = 03;

        funcionarios4.nome = "Arthur Filho";
        funcionarios4.função = "Gerente de Contrato";
        funcionarios4.matricula = 00;

        System.out.println(funcionarios1.nome + " \n" + funcionarios1.função + "\n" + funcionarios1.matricula + "\n");
        System.out.println(funcionarios2.nome + " \n" + funcionarios2.função + "\n" + funcionarios2.matricula + "\n");
        System.out.println(funcionarios3.nome + " \n" + funcionarios3.função + "\n" + funcionarios3.matricula + "\n");
        System.out.println(funcionarios4.nome + " \n" + funcionarios4.função + "\n" + funcionarios4.matricula + "\n");


    }
}
