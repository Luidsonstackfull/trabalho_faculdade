package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class EmpresaMSG {
    private String cnpj;
    private Long id;
    private List<Funcionario> funcionarioList;

    public EmpresaMSG(String cnpj, Long id, List<Funcionario>funcionarioList) {
        this.cnpj = cnpj;
        this.id = id;
        this.funcionarioList = new ArrayList<>();

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void admitir(Funcionario funcionario){
        funcionarioList.add(funcionario);
        System.out.println("O "+ funcionario.getId()+ " foi admitido");
    }
    public void demitir(Funcionario funcionario){
        if(funcionario!= null){
        Iterator<Funcionario> iterator = funcionarioList.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()){
            Funcionario funcionario1 = iterator.next();

                if(funcionario.equals(funcionario1)){
                    System.out.println("O "+funcionario.getId()+ " foi demitido");
                    iterator.remove();
                    encontrado= true;
                    break;

                }

        }
        if (!encontrado){
            System.out.println("Funcionário não encontrado na lista.");
        }
        }else{
            System.out.println("O objeto funcionário fornecido é nulo.");
        }
    }

    public void BuscarFuncionario(Funcionario funcionario){
        if(funcionario != null){
            for(Funcionario funcionario1: funcionarioList){
                if(funcionario.equals(funcionario1)){
                    System.out.println("Voce buscou o funcionario "+ funcionario.getId());
                }
            }
        }else{
            System.out.println("Funcionario nao existe");
        }


    }
    public void atualizarFuncionario(Funcionario funcionario) {
        if (funcionario != null) {
            boolean encontrado = false;
            for (Funcionario funcionario1 : funcionarioList) {
                if (funcionario.equals(funcionario1)) {
                    funcionario1.setDepartamento(funcionario.getDepartamento());
                    funcionario1.setCargo(funcionario.getCargo());
                    funcionario1.setNome(funcionario.getNome());
                    funcionario1.setEmail(funcionario.getEmail());
                    funcionario1.setSalario(funcionario.getSalario());
                    System.out.println("Dados atualizados");
                    encontrado = true;
                    break; // Sai do loop após atualizar o funcionário
                }
            }
            if (!encontrado) {
                System.out.println("Funcionário não encontrado na lista.");
            }
        } else {
            System.out.println("O objeto funcionário fornecido é nulo.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpresaMSG that = (EmpresaMSG) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "EmpresaMSG{" +
                "cnpj='" + cnpj + '\'' +
                ", id=" + id +
                ", funcionarioList=" + funcionarioList.size() +
                '}';
    }
}
