package CadastroPet;

import javax.imageio.plugins.jpeg.JPEGQTable;

public class App {
    public static void main(String[] args) {
        Resronsable pessoa = new Resronsable(
                "nenette",
                "gana",
                "54637884",
                "0777",
                22,
                "allayegana78@gmail.com",
                "959251762"
        );
        System.out.println( pessoa.getEmail());
        System.out.println(pessoa.getNome());

        Pet chien =new Pet(
                "laya",
                "genre",
                " mechant",
                12,
                "preta",
                pessoa,
                Pet.TiposCuidado.BanhoETosa.toString()
        );
        pessoa.setEmail("allayegana@gmail.com");

        System.out.println(pessoa.getCep());
        pessoa.retornardadosBasicos();
        if (pessoa.getIdade() >= 18 ) {
            System.out.println(chien.getDono().retornarTodosDados());
        }
        else {
            System.out.println( "ecrire ok");
        }

        System.out.println(chien.RetornarDadosPet());

    }
}
