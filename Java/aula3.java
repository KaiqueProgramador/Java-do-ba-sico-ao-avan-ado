public class aula3 {
    public static void main(String[] args){
        int idade = 18;
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        String dia = "SEG";
        switch (dia) {
            case "SEG": System.out.println("Segunda"); break;
            case "TER": System.out.println("Terça"); break;
            default: System.out.println("outro dia");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int x = 0;
        while (x < 3) {
            System.out.println(x);
            x++;
        }
    }
}