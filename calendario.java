import java.util.Scanner;

class Calendario {
    static int ano;

    public static void calendarioJudeu() {
        int anoJudeu = ano + 3760;
		if (ano <= 0) {
		System.out.println("ano invalido, insira um ano valido para continuar!!");	
		}
    }

    public static void anoIslamico() {
        int anoIslamico = ano - 576;
		if (ano <= 0) {
		System.out.println("ano invalido, insira um ano valido para continuar!!");	
		}
	}
	
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int calendario;

        System.out.println("Digite um ano Gregoriano");
        ano = teclado.nextInt();

        System.out.println("[1] - Calendario Judeu");
        System.out.println("[2] - Calendario Islamico");
        calendario = teclado.nextInt();

        switch (calendario) {
            case 1:
                System.out.println("Calendario Judeu selecionado. \n");
                calendarioJudeu();
                break;

            case 2:
                System.out.println("Calendario Islamico selecionado. \n");
                anoIslamico();
                break;

            default:
                System.out.println("Opcao invalida. Tente novamente.");
                break;
		}		
	}	
}
