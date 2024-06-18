import model.CartaoDeSaude;
import model.EmpresaMSG;
import model.Funcionario;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class teste {
    public static void main(String[] args) {

        //get id é o unico atributo que diferencia os funcionarios
        Funcionario funcionario1 = new Funcionario(1651154561l,"Funcionario1@gmail.com","1651648","Funcionario1","adm auxiliar","Administracao",1500d,"1654816-8");
        Funcionario funcionario2 = new Funcionario(165115345l,"Funcionario2@gmail.com","1651648","Funcionario1","adm auxiliar","Administracao",1500d,"1654816-8");
        Funcionario funcionario3 = new Funcionario(1668461561l,"Funcionario3@gmail.com","1651648","Funcionario1","adm auxiliar","Administracao",1500d,"1654816-8");
        Funcionario funcionario4 = new Funcionario(1651646481l,"Funcionario4@gmail.com","1651648","Funcionario1","adm auxiliar","Administracao",1500d,"1654816-8");
        Funcionario funcionario5 = new Funcionario(168559961l,"Funcionario5@gmail.com","1651648","Funcionario1","adm auxiliar","Administracao",1500d,"1654816-8");

        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(funcionario1);
        funcionarioList.add(funcionario2);
        funcionarioList.add(funcionario3);
        funcionarioList.add(funcionario4);
        funcionarioList.add(funcionario5);


        EmpresaMSG empresaMSG = new EmpresaMSG("6156464",21341l,funcionarioList);

        //testado e funcionando corretamente
//        empresaMSG.admitir(funcionario1);
//        empresaMSG.admitir(funcionario2);
//        empresaMSG.admitir(funcionario3);
//        empresaMSG.admitir(funcionario4);
//        empresaMSG.admitir(funcionario5);
//        empresaMSG.BuscarFuncionario(funcionario1);
//        empresaMSG.demitir(funcionario1);
//        System.out.println(empresaMSG.toString());
//        empresaMSG.atualizarFuncionario(funcionario2);

        CartaoDeSaude cartaoDeSaude2 = new CartaoDeSaude(2839429l,"cachorro", LocalDate.of(2005, Month.JANUARY,27));
        CartaoDeSaude cartaoDeSaude3 = new CartaoDeSaude(2884169l,"gato", LocalDate.of(2005, Month.JANUARY,27));
        CartaoDeSaude cartaoDeSaude4 = new CartaoDeSaude(7284169l,"pasta de amendoin", LocalDate.of(2005, Month.JANUARY,27));

        cartaoDeSaude3.cadastrarPaciente(funcionario2,cartaoDeSaude3);
        cartaoDeSaude2.cadastrarPaciente(funcionario1,cartaoDeSaude2);
        cartaoDeSaude2.deletarPaciente(funcionario1,cartaoDeSaude2);
        cartaoDeSaude2.buscarPaciente(funcionario1,cartaoDeSaude2);







    }
}