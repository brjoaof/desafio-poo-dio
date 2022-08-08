import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHorario(8);

        System.out.println(curso1);
    }
}