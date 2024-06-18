package model;

import java.time.LocalDate;
import java.util.*;

public class CartaoDeSaude {
    private Long Id_paciente;
    private Map<Funcionario,CartaoDeSaude> cartaoDeSaudeMap = new HashMap<>();
    private String alergias;
    private LocalDate dataAtendimento;

    public CartaoDeSaude(Long id_paciente, String alergias, LocalDate dataAtendimento) {
        Id_paciente = id_paciente;
        this.alergias = alergias;
        this.dataAtendimento = dataAtendimento;
        cartaoDeSaudeMap = new HashMap<>();
    }

    public Long getId_paciente() {
        return Id_paciente;
    }

    public void setId_paciente(Long id_paciente) {
        Id_paciente = id_paciente;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public LocalDate getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(LocalDate dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }
    public void cadastrarPaciente(Funcionario funcionario, CartaoDeSaude cartaoDeSaude){

        cartaoDeSaudeMap.put(funcionario,cartaoDeSaude);
        System.out.println("cartao pertecente ao "+ funcionario);
    }

    public void deletarPaciente(Funcionario funcionario, CartaoDeSaude cartaoDeSaude){

        Iterator<Map.Entry<Funcionario, CartaoDeSaude>> iterator = cartaoDeSaudeMap.entrySet().iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Map.Entry<Funcionario, CartaoDeSaude> entry = iterator.next();
            if (entry.getKey().equals(funcionario) && entry.getValue().equals(cartaoDeSaude)) {
                iterator.remove();
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Funcionario nao possui mais o cartao de acesso");
        } else {
            System.out.println("Funcionario nao encontrado ou cartao de saude nao corresponde");
        }
    }
    public CartaoDeSaude buscarPaciente(Funcionario funcionario,CartaoDeSaude cartaoDeSaude) {

        for (Map.Entry<Funcionario, CartaoDeSaude> entry : cartaoDeSaudeMap.entrySet()) {
            if (entry.getKey().equals(funcionario) && entry.getValue().equals(cartaoDeSaudeMap)) {
                return entry.getValue();
            }
        }
        return null;
    }
    public String descreverSituacao(String situacao){
        return situacao;
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CartaoDeSaude that = (CartaoDeSaude) o;

        return Id_paciente.equals(that.Id_paciente);
    }

    @Override
    public int hashCode() {
        return Id_paciente.hashCode();
    }

    @Override
    public String toString() {
        return "CartaoDeSaude{" +
                "Id_paciente=" + Id_paciente +
                ", alergias='" + alergias + '\'' +
                ", dataAtendimento=" + dataAtendimento +
                '}';
    }
}
