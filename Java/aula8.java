import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class aula8 {
    public static void main(String[] args) {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/empresa",
            "root",
            "123"
        );

        String sql = "INSERT INTO funcionarios(nome, salario) VALUES (?, ?)";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1, "Maria");
        st.setDouble(2, 2500);
        st.execute();

        ResultSet rs = st.executeQuery("SELECT * FROM funcionarios");
        while (rs.next()) {
            System.out.println(rs.getString("nome"));
        }

        String sql = "UPDATE funcionarios SET salario=? WHERE id=?";

        String sql = "DELETE FROM funcionarios WHERE id=?";
    }
}
