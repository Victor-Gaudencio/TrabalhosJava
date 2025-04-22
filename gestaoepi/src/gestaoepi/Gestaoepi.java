package gestaoepi;

import java.time.LocalDate;

public class Gestaoepi {
    public static void main(String[] args) {
        // Criando gestores
        Gestor gestor1 = new Gestor("Carlos", 001);
        Gestor gestor2 = new Gestor("Ana", 002);

        // Criando operários
        Operario operario1 = new Operario("Ostacio", 123, Turno.MANHA);
        Operario operario2 = new Operario("Lucia", 124, Turno.TARDE);
        Operario operario3 = new Operario("Marcos", 125, Turno.NOITE);
        Operario operario4 = new Operario("Julia", 126, Turno.MANHA);
        Operario operario5 = new Operario("Fernanda", 127, Turno.TARDE);

        // Adicionando operários aos gestores
        gestor1.adicionarOperario(operario1);
        gestor1.adicionarOperario(operario2);
        gestor2.adicionarOperario(operario3);
        gestor2.adicionarOperario(operario4);
        gestor2.adicionarOperario(operario5);

        // Criando EPIs
        Epi capacete = new Epi("Capacete", "EPI001", LocalDate.of(2026, 4, 15));
        Epi botinaAntiga = new Epi("Botina", "EPI003", LocalDate.of(2023, 4, 15));
        Epi capaceteNovo = new Epi("Capacete Novo", "EPI002", LocalDate.of(2026, 5, 1));
        Epi luvaSeguranca = new Epi("Luva de Segurança", "EPI005", LocalDate.of(2025, 6, 10));
        Epi botasProtecao = new Epi("Botas de Proteção", "EPI006", LocalDate.of(2021, 3, 20));

        // Adicionando EPIs aos operários
        operario1.adicionarEpi(capacete);
        operario1.adicionarEpi(luvaSeguranca);
        operario2.adicionarEpi(botinaAntiga);
        operario3.adicionarEpi(capaceteNovo);
        operario4.adicionarEpi(luvaSeguranca);
        operario5.adicionarEpi(botasProtecao);

        // Listando os operários e seus EPIs
        System.out.println("\nRelatório Geral (Gestor 1):");
        gestor1.relatorioGeral();

        System.out.println("\nRelatório Geral (Gestor 2):");
        gestor2.relatorioGeral();

        // Listando os operários por turno
        //System.out.println("\nOperários do turno MANHÃ:");
        gestor1.listarOperariosPorTurno(Turno.MANHA);

        //System.out.println("\nOperários do turno TARDE:");
        gestor2.listarOperariosPorTurno(Turno.TARDE);

        // Listando EPIs vencidos
        System.out.println("\nListando EPIs Vencidos:");
        gestor1.listarEpisVencidos();
        gestor2.listarEpisVencidos();

        // Removendo um operário
        gestor1.removerOperario(operario2);
    }
}
