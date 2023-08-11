import java.util.Scanner;

class Usuario{
    private int escolha;
    private float primeiroNum;
    private float segundoNum;

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public int getEscolha() {
        return escolha;
    }

    public void setPrimeiroNum(float primeiroNum) {
        this.primeiroNum = primeiroNum;
    }

    public float getPrimeiroNum() {
        return primeiroNum;
    }

    public void setSegundoNum(float segundoNum) {
        this.segundoNum = segundoNum;
    }

    public float getSegundoNum() {
        return segundoNum;
    }

}

class Opera{
    public float soma(float primeiroNum, float segundoNum) {
        return primeiroNum + segundoNum;
    }

    public float subtrai(float primeiroNum, float segundoNum) {
        return primeiroNum - segundoNum;
    }

    public float multiplica(float primeiroNum, float segundoNum) {
        return primeiroNum * segundoNum;
    }

    public float divide(float primeiroNum, float segundoNum) {
        return primeiroNum / segundoNum;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.flush();
        System.out.println("=============================================" +
                "\n   Olá, Seja Bem Vindo à sua Calculadora!" +
                "\n=============================================");

            System.out.println("  Selecione uma operação: \n" +
                    "\n  1 - Adição" +
                    "\n  2 - Subtração" +
                    "\n  3 - Multiplicação" +
                    "\n  4 - Divisão" +
                    "\n  0 - Sair da Calculadora." +
                    "\n_____________________________________________\n");

            Usuario user = new Usuario();
            Opera opera = new Opera();
            Scanner sc = new Scanner(System.in);

            user.setEscolha(sc.nextInt());

            System.out.println("\nInsira o primeiro valor: ");
            user.setPrimeiroNum(sc.nextInt());
            System.out.println("\nInsira o segundo valor: ");
            user.setSegundoNum(sc.nextInt());


            switch (user.getEscolha()) {
                case 1:
                    System.out.println("\n= " + opera.soma(user.getPrimeiroNum(), user.getSegundoNum()));
                    break;
                case 2:
                    System.out.println("\n= " + opera.subtrai(user.getPrimeiroNum(), user.getSegundoNum()));
                    break;
                case 3:
                    System.out.println("\n= " + opera.multiplica(user.getPrimeiroNum(), user.getSegundoNum()));
                    break;
                case 4:
                    System.out.println("\n= " + opera.divide(user.getPrimeiroNum(), user.getSegundoNum()));
                    System.out.println("Resto da divisão = " + user.getPrimeiroNum() % user.getSegundoNum());
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

