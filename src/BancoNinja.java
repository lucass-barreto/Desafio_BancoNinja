import java.util.Scanner;

public class BancoNinja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente[] contasCorrentes = new ContaCorrente[5];
        ContaPoupanca[] contasPoupancas = new ContaPoupanca[5];
        Dono[] donosCorrentes = new Dono[5];
        Dono[] donosPoupanca = new Dono[5];
        int menu1 = 0;

        while (menu1 != 6) {
            System.out.println("============ Banco Ninja ============" +
                    "\n  " +
                    "\n Seja bem vindo - Escolha uma das opções abaixo:" +
                    "\n  " +
                    "\n 1 - Criar uma conta" +
                    "\n 2 - Verificar saldo de uma conta" +
                    "\n 3 - Depositar em uma conta" +
                    "\n 4 - Sacar dinheiro de uma conta" +
                    "\n 5 - Transferir dinheiro entre contas" +
                    "\n 6 - Sair" +
                    "\n  ");
            menu1 = scanner.nextInt();
            scanner.nextLine();

            switch (menu1) {
                case 1:
                    System.out.println("Qual tipo de conta você deseja criar?" +
                            "\n 1 - " + TipoConta.CORRENTE +
                            "\n 2 - " + TipoConta.POUPANCA);
                    int menu2 = scanner.nextInt();
                    scanner.nextLine();

                    switch (menu2) {
                        case 1:
                            for (int i = 0; i < contasCorrentes.length; i++) {
                                if (contasCorrentes[i] == null) {
                                    System.out.println("Informe o nome do proprietário da conta:");
                                    String nome = scanner.nextLine();
                                    System.out.println("Informe o CPF do proprietário da conta:");
                                    String cpf = scanner.nextLine();
                                    donosCorrentes[i] = new Dono(nome, cpf);

                                    contasCorrentes[i] = new ContaCorrente(donosCorrentes[i], TipoConta.CORRENTE);
                                    System.out.println("Conta criada com sucesso:" +
                                            "\n  " +
                                            "\n" + contasCorrentes[i]);
                                    break;
                                } else if (contasCorrentes[4] != null) {
                                    System.out.println("Não há mais espaço disponível para a criação de uma nova conta corrente.");
                                }
                            }
                            break;

                        case 2:
                            for (int i = 0; i < contasPoupancas.length; i++) {
                                if (contasPoupancas[i] == null) {
                                    System.out.println("Informe o nome do proprietário da conta:");
                                    String nome = scanner.nextLine();
                                    System.out.println("Informe o CPF do proprietário da conta:");
                                    String cpf = scanner.nextLine();
                                    donosPoupanca[i] = new Dono(nome, cpf);

                                    contasPoupancas[i] = new ContaPoupanca(donosPoupanca[i], TipoConta.POUPANCA);
                                    System.out.println("Conta criada com sucesso:" +
                                            "\n  " +
                                            "\n" + contasPoupancas[i]);
                                    break;
                                } else if (contasPoupancas[4] != null) {
                                    System.out.println("Não há mais espaço disponível para a criação de uma nova conta poupança.");
                                }
                            }
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.println("Qual o tipo da conta?" +
                            "\n 1 - " + TipoConta.CORRENTE +
                            "\n 2 - " + TipoConta.POUPANCA);
                    int menu3 = scanner.nextInt();
                    scanner.nextLine();

                    switch (menu3) {
                        case 1:
                            for (int i = 0; i < contasCorrentes.length; i++) {
                                if (donosCorrentes[i] != null) {
                                    System.out.println("[" + (i + 1) + "] - " + donosCorrentes[i]);
                                }
                            }
                            int opcaoConta1 = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println(contasCorrentes[opcaoConta1 - 1]);
                            break;

                        case 2:
                            for (int i = 0; i < contasPoupancas.length; i++) {
                                if (donosPoupanca[i] != null) {
                                    System.out.println("[" + (i + 1) + "] - " + donosPoupanca[i]);
                                }
                            }
                            int opcaoConta2 = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println(contasPoupancas[opcaoConta2 - 1]);
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 3:
                    System.out.println("Qual o tipo da conta?" +
                            "\n 1 - " + TipoConta.CORRENTE +
                            "\n 2 - " + TipoConta.POUPANCA);
                    int menu4 = scanner.nextInt();
                    scanner.nextLine();

                    switch (menu4) {
                        case 1:
                            for (int i = 0; i < contasCorrentes.length; i++) {
                                if (donosCorrentes[i] != null) {
                                    System.out.println("[" + (i + 1) + "] - " + donosCorrentes[i]);
                                }
                            }
                            int opcaoConta6 = scanner.nextInt();
                            scanner.nextLine();

                            contasCorrentes[opcaoConta6 - 1].depositar(999);
                            break;

                        case 2:
                            for (int i = 0; i < contasPoupancas.length; i++) {
                                if (donosPoupanca[i] != null) {
                                    System.out.println("[" + (i + 1) + "] - " + donosPoupanca[i]);
                                }
                            }
                            int opcaoConta3 = scanner.nextInt();
                            scanner.nextLine();
1
                            System.out.println("Informe o valor a ser depósitado (R$XXXX.XX):");
                            double deposito2 = scanner.nextDouble();
                            scanner.nextLine();
                            contasPoupancas[opcaoConta3 - 1].depositar(deposito2);
                            break;

                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Qual o tipo da conta?" +
                            "\n 1 - " + TipoConta.CORRENTE +
                            "\n 2 - " + TipoConta.POUPANCA);
                    int menu5 = scanner.nextInt();
                    scanner.nextLine();

                    switch (menu5) {
                        case 1:
                            for (int i = 0; i < contasCorrentes.length; i++) {
                                if (donosCorrentes[i] != null) {
                                    System.out.println("[" + (i + 1) + "] - " + donosCorrentes[i]);
                                }
                            }
                            int opcaoConta4 = scanner.nextInt();
                            scanner.nextLine();

                            double saque1 = 999;
                            contasCorrentes[opcaoConta4 - 1].sacar(saque1);
                            break;

                        case 2:
                            for (int i = 0; i < contasPoupancas.length; i++) {
                                if (donosPoupanca[i] != null) {
                                    System.out.println("[" + (i + 1) + "] - " + donosPoupanca[i]);
                                }
                            }
                            int opcaoConta5 = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Informe o valor a ser sacanado (R$XXXX.XX):");
                            double saque2 = scanner.nextDouble();
                            scanner.nextLine();
                            contasPoupancas[opcaoConta5 - 1].sacar(saque2);
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 5:
                    System.out.println("Qual o tipo da conta que deseja tirar o dinheiro?" +
                            "\n 1 - " + TipoConta.CORRENTE +
                            "\n 2 - " + TipoConta.POUPANCA);
                    int menu7 = scanner.nextInt();
                    scanner.nextLine();

                    switch (menu7) {
                        case 1:
                            for (int i = 0; i < contasCorrentes.length; i++) {
                                if (donosCorrentes[i] != null) {
                                    System.out.println("[" + (i + 1) + "] - " + donosCorrentes[i]);
                                }
                            }
                            int opcaoContaSaidaCorrente = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Quanto deseja transferir?");
                            double transferencia = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.println("Qual o tipo da conta que deseja enviar o dinheiro?" +
                                    "\n 1 - " + TipoConta.CORRENTE +
                                    "\n 2 - " + TipoConta.POUPANCA);
                            int menu8 = scanner.nextInt();
                            scanner.nextLine();

                            switch (menu8) {
                                case 1:
                                    for (int i = 0; i < contasCorrentes.length; i++) {
                                        if (donosCorrentes[i] != null) {
                                            System.out.println("[" + (i + 1) + "] - " + donosCorrentes[i]);
                                        }
                                    }
                                    int opcaoContaEntradaCorrente = scanner.nextInt();
                                    scanner.nextLine();

                                    contasCorrentes[opcaoContaSaidaCorrente - 1].transferir(transferencia, contasCorrentes[opcaoContaEntradaCorrente - 1]);
                                    break;

                                case 2:
                                    for (int i = 0; i < contasPoupancas.length; i++) {
                                        if (donosPoupanca[i] != null) {
                                            System.out.println("[" + (i + 1) + "] - " + donosPoupanca[i]);
                                        }
                                    }
                                    int opcaoContaEntradaPoupanca = scanner.nextInt();
                                    scanner.nextLine();

                                    contasCorrentes[opcaoContaSaidaCorrente - 1].transferir(transferencia, contasPoupancas[opcaoContaEntradaPoupanca - 1]);
                                    break;

                                default:
                                    System.out.println("Opção inválida.");
                            }

                            break;

                        case 2:
                            for (int i = 0; i < contasPoupancas.length; i++) {
                                if (donosPoupanca[i] != null) {
                                    System.out.println("[" + (i + 1) + "] - " + donosPoupanca[i]);
                                }
                            }
                            int opcaoContaSaidaPoupanca = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Quanto deseja transferir?");
                            double transferencia2 = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.println("Qual o tipo da conta que deseja enviar o dinheiro?" +
                                    "\n 1 - " + TipoConta.CORRENTE +
                                    "\n 2 - " + TipoConta.POUPANCA);
                            int menu10 = scanner.nextInt();
                            scanner.nextLine();

                            switch (menu10) {
                                case 1:
                                    for (int i = 0; i < contasCorrentes.length; i++) {
                                        if (donosCorrentes[i] != null) {
                                            System.out.println("[" + (i + 1) + "] - " + donosCorrentes[i]);
                                        }
                                    }
                                    int opcaoContaEntradaCorrente = scanner.nextInt();
                                    scanner.nextLine();

                                    contasPoupancas[opcaoContaSaidaPoupanca - 1].transferir(transferencia2, contasCorrentes[opcaoContaEntradaCorrente - 1]);
                                    break;

                                case 2:
                                    for (int i = 0; i < contasPoupancas.length; i++) {
                                        if (donosPoupanca[i] != null) {
                                            System.out.println("[" + (i + 1) + "] - " + donosPoupanca[i]);
                                        }
                                    }
                                    int opcaoContaEntradaPoupanca = scanner.nextInt();
                                    scanner.nextLine();

                                    contasPoupancas[opcaoContaSaidaPoupanca - 1].transferir(transferencia2, contasPoupancas[opcaoContaEntradaPoupanca - 1]);
                                    break;

                                default:
                                    System.out.println("Opção inválida.");

                            }
                            break;
                    }

            case 6:
                System.out.println("Saindo do programa.");
                break;

            default:
                System.out.println("Opção informada é inválida.");
                break;
            }
        }
    }
}
