public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;
    private int horasTrabalhoSemana;

    public void setDados(
            String nome,
            String cargo,
            double salario,
            int horasTrabalhoSemana
    ){
        this.nome=nome;
        this.cargo=cargo;
        this.salario=salario;
        this.horasTrabalhoSemana=horasTrabalhoSemana;
    }

    public void exibirFuncionario(){

        System.out.println("Funcionário:"+nome);
        System.out.println("Cargo:"+cargo);

        System.out.printf("Salário:%.2f%n",salario);

        System.out.println("Bonus:"+calcularBonus());

        System.out.printf("Salário final:%.2f",calcularSalarioFinal());
    }
    private double calcularBonus(){
        if(horasTrabalhoSemana > 40){
            return (horasTrabalhoSemana - 40) * 100;
        }
        return 0;
    }
    private double calcularSalarioFinal(){

        return salario + calcularBonus();
    }
}
