interface aula6tres {
    boolean login(String senha);

    class Usuario implements aula6tres {
        public boolean login(String senha) {
            return senha.equals("123");
        }
    }

    public class Mainv {
        public static void main(String[] args) {
            aula6tres u = new Usuario();
            
            System.out.println(u.login("123"));
            System.out.println(u.login("abc"));
        }
    }
}