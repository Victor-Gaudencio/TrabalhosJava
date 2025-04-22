package gestaoepi;

import java.util.ArrayList;
import java.util.List;

public class Gestor extends Funcionario {
    private List<Operario> operarios;  // Lista de operários que o Gestor vai gerenciar

    public Gestor(String nome, int matricula) {
        super(nome, matricula);
        this.operarios = new ArrayList<>();
    }

    // Adicionar operário
    public void adicionarOperario(Operario operario) {
        operarios.add(operario);
        System.out.println("\nOperário " + operario.nome + " adicionado com sucesso.");
    }

    // Remover operário
    public void removerOperario(Operario operario) {
        if (operarios.remove(operario)) {
            System.out.println("\nOperário " + operario.nome + " removido com sucesso.");
        } else {
            System.out.println("\nOperário não encontrado.");
        }
    }

    // Listar operários por turno
    public void listarOperariosPorTurno(Turno turno) {
        System.out.println("\n===============================================");
        System.out.println("Operários do turno " + turno + ":");
        System.out.println("-----------------------------------------------");
        boolean encontrado = false;
        for (Operario operario : operarios) {
            if (operario.getTurno() == turno) {
                System.out.println("  - " + operario.nome + " | Matrícula: " + operario.matricula);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("  Nenhum operário encontrado no turno " + turno + ".");
        }
        System.out.println("===============================================\n");
    }

    // Relatório geral de todos os funcionários e seus EPIs
    public void relatorioGeral() {
        System.out.println("\n===============================================");
        System.out.println("Relatório Geral de Funcionários e seus EPIs:");
        System.out.println("-----------------------------------------------");
        for (Operario operario : operarios) {
            System.out.println("\nFuncionário: " + operario.nome + " | Matrícula: " + operario.matricula);
            if (operario.listaEpi.isEmpty()) {
                System.out.println("  - Nenhum EPI atribuído.");
            } else {
                System.out.println("  EPIs atribuídos:");
                for (Epi epi : operario.listaEpi) {
                    System.out.println("   - " + epi.getNome() + " | Código: " + epi.getCodigo() + " | Validade: " + epi.getData());
                }
            }
        }
        System.out.println("===============================================\n");
    }

    // Listar EPIs vencidos de todos os operários
    public void listarEpisVencidos() {
        System.out.println("\n===============================================");
        System.out.println("EPIs Vencidos:");
        System.out.println("-----------------------------------------------");
        boolean encontrouEpiVencido = false;

        for (Operario operario : operarios) {
            for (Epi epi : operario.listaEpi) {
                if (epi.getData().isBefore(java.time.LocalDate.now())) {
                    System.out.println("  - " + operario.nome + " | EPI: " + epi.getNome() + " | Código: " + epi.getCodigo() + " | Validade: " + epi.getData());
                    encontrouEpiVencido = true;
                }
            }
        }

        if (!encontrouEpiVencido) {
            System.out.println("  Nenhum EPI vencido encontrado.");
        }
        System.out.println("===============================================\n");
    }
}
