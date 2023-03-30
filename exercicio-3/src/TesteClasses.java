public class TesteClasses {
    public static void main(String[] args) throws Exception {
        Universidade universidade1 = new Universidade();

        universidade1.nome = "Uniguairacá Centro Universitário";
        universidade1.cidade = "Guarapuava";
        universidade1.estado = "Paraná";
        universidade1.exibeDados();

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Marina Matulle";
        aluno1.curso = "Análise e Desenvolvimento de Sistemas";
        aluno1.exibeDados();
    }
}
