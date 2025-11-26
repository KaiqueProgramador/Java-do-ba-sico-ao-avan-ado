import java.io.IOException;
import java.nio.file.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class aula7 {
    public static void main(String[] args) throws IOException {
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } 

        String conteudo = Files.readString(Path.of("dados.txt"));
        System.out.println(conteudo);

        Map<String, Integer> idades = new HashMap<>();
        idades.put("Ana", 20);
        idades.put("Pedro", 30);
        System.out.println(idades.get("Ana"));

        Set<String> nomes = new HashSet<>();
        nomes.add("João");
        nomes.add("João");
        System.out.println(nomes);
    }
}