public class Principal {
    public static void main(String[] args) {
        Perfil perfil = new Perfil("Yasmin",17,"Jomin2808","2021");

        System.out.println("nome:"+perfil.getNome());
        System.out.println("idade:"+perfil.getIdade());
        System.out.println("Perfil:"+perfil.getUsername());
        perfil.setSenha("Etec");

        if(perfil.verificarSenha("Jomin2808")){
            System.out.println("senha válida");
        }else{
            System.out.println("senha inválida!");
        }

    }

}
