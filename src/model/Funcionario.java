package model;

public class Funcionario {
    private Long id;
    private String email;
    private String telefone;
    private String nome;
    private String cargo;
    private String departamento;
    private Double salario;
    private String CPF;

    public Funcionario(Long id, String email, String telefone, String nome, String cargo, String departamento, Double salario, String CPF) {
        this.id = id;
        this.email = email;
        this.telefone = telefone;
        this.nome = nome;
        this.cargo = cargo;
        this.departamento = departamento;
        this.salario = salario;
        this.CPF = CPF;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String fazerAniversario(String nome){
        return "O funcionario "+nome+" está fazendo aniversario";
    }
    public String pedirAumento(Double valor, String nome){
        valor+=getSalario();
        return "O funcionario " +nome+ " pediu um aumento de : "+ valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Funcionario that = (Funcionario) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                ", CPF=" + CPF +
                '}';
    }
}
