package model;
import java.time.LocalDate;

public class Usuario {

      private String nome;
      private String email;
      private LocalDate dataCadastro;


      // construtor
      public Usuario (String nome, String email){
          validarNome(nome);
          this.nome = nome;
          validarEmail(email);
          this.email = email;
          this.dataCadastro = LocalDate.now();
      }


      // metodo GET
      public String getNome(){
          return this.nome;
      }


      public String getEmail() {
        return this.email;
         }
         public LocalDate getDataCadastro() {
               return this.dataCadastro;
         }


         // metodo SET
         public void setNome(String nome){
          validarNome(nome);
          this.nome = nome;
         }

         public void setEmail(String email) {
          validarEmail(email);
          this.email = email;
         }



         // validação

        private void validarNome(String nome){
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome não pode ficar vazio");

    }

      }

      private void validarEmail(String email){
          if (email == null  || email.isBlank()){
              throw new IllegalArgumentException("Email não pode ficar vazio");
          }


      }


}