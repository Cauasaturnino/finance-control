import model.Usuario;


public class TesteUsuario {

    public static void main(String[] args) {

        Usuario usuario = null;

        try {
            usuario = new Usuario(" ", "Ecde@sccscd");
        } catch (IllegalArgumentException e) {
            System.out.println("Não foi possível cadastrar o usuário.");
            System.out.println(e.getMessage());
        }
        if (usuario != null) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Data de Cadastro: " + usuario.getDataCadastro());

        }
    }
}