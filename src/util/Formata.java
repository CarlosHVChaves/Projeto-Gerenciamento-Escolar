/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dao.FuncionarioDAO;
import java.text.ParseException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import model.Funcionario;

/**
 *
 * @author CarlosHVChaves
 */
public class Formata {

    public static DefaultFormatterFactory cpf() {
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("###.###.###-##");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            System.out.println("Erro na Formatação do CPF");
        }
        return (new DefaultFormatterFactory(mask, mask));
    }

    //  criar formatação para telefone (11) 1234-5678
    public static DefaultFormatterFactory telefone() {
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("(##) ####-####");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            System.out.println("Erro na Formatação do Telefone");
        }
        return (new DefaultFormatterFactory(mask, mask));
    }

    // criar formatação para celular (11) 123-456-789
    public static DefaultFormatterFactory celular() {
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("(##) ###-###-###");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            System.out.println("Erro na Formatação do Celular");
        }
        return (new DefaultFormatterFactory(mask, mask));
    }

    // criar formatação para celular (11) 123-456-789
    public static DefaultFormatterFactory cep() {
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("#####-###");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            System.out.println("Erro na Formatação do Celular");
        }
        return (new DefaultFormatterFactory(mask, mask));
    }

    // criar formatação para celular (11) 123-456-789
    public static DefaultFormatterFactory data() {
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("##/##/####");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            System.out.println("Erro na Formatação do Celular");
        }
        return (new DefaultFormatterFactory(mask, mask));
    }

    public static void carregaSexo(JComboBox sexo) {
        sexo.addItem("Escolha uma opção");
        sexo.addItem("Feminino");
        sexo.addItem("Masculino");
    }

    public static void carregaUF(JComboBox uf) {
        uf.addItem("Escolha uma opção");
        uf.addItem("Acre");
        uf.addItem("Alagoas");
        uf.addItem("Amapá");
        uf.addItem("Amazonas");
        uf.addItem("Bahia");
        uf.addItem("Ceará");
        uf.addItem("Distrito Federal");
        uf.addItem("Espírito Santo");
        uf.addItem("Goiás");
        uf.addItem("Maranhão");
        uf.addItem("Mato Grosso");
        uf.addItem("Mato Grosso do Sul");
        uf.addItem("Minas Gerais");
        uf.addItem("Pará");
        uf.addItem("Paraíba");
        uf.addItem("Pernambuco");
        uf.addItem("Piauí");
        uf.addItem("Rio de Janeiro");
        uf.addItem("Rio Grande do Norte");
        uf.addItem("Rio Grande do Sul");
        uf.addItem("Rondônia");
        uf.addItem("Roraima");
        uf.addItem("Santa Catarina");
        uf.addItem("São Paulo");
        uf.addItem("Sergipe");
        uf.addItem("Tocantins");
    }

    public static void carregaEstadoCivil(JComboBox estadoCivil) {
        estadoCivil.addItem("Escolha uma opção");
        estadoCivil.addItem("Solteiro");
        estadoCivil.addItem("Casado");
        estadoCivil.addItem("Separado");
        estadoCivil.addItem("Divorciado");
        estadoCivil.addItem("Víuvo");
    }

    public static void carregaFormacao(JComboBox formacao) {
        formacao.addItem("Escolha uma opção");
        formacao.addItem("Ensino Fundamental Completo");
        formacao.addItem("Ensino Médio Incompleto");
        formacao.addItem("Cursando Ensino Médio");
        formacao.addItem("Ensino Médio Completo");
        formacao.addItem("Ensino Superior Incompleto");
        formacao.addItem("Cursando Ensino Superior");
        formacao.addItem("Ensino Superior Completo");
    }

    public static void carregaCargo(JComboBox cargo) {
        cargo.addItem("Escolha uma opção");
        cargo.addItem("Atendente");
        cargo.addItem("Professor");
        cargo.addItem("Vigia");
        cargo.addItem("Auxiliar de Limpeza");
        cargo.addItem("Coordenador");
        cargo.addItem("Espetor");
        cargo.addItem("Ajudante Geral");
    }

    public static void carregaCargaHoraria(JComboBox cargaHoraria) {
        cargaHoraria.addItem("Escolha uma opção");
        int i = 10;
        while (i < 500) {
            cargaHoraria.addItem(i + "");
            i = i + 10;
        }
    }

    public static void carregaProfessor(JComboBox professor) {
        professor.addItem("Escolha uma opção");
        FuncionarioDAO dao = new FuncionarioDAO();
        List<Funcionario> funcionarios = dao.selectProfessor();
        int i = 0;
        while (i < funcionarios.size()) {
            System.out.println(funcionarios.get(i).getNome());
            professor.addItem(funcionarios.get(i).getNome());
            i++;
        }
    }
    
    public static void carregaDiaPagamento(JComboBox diaPagamento) {
        diaPagamento.addItem("Escolha uma opção");
        int i = 5;
        while (i < 25) {
            diaPagamento.addItem(i + "");
            i = i + 5;
        }
    }
    
    public static void carregaStatusNota(JComboBox statusNota) {
        statusNota.addItem("Escolha uma opção");
        statusNota.addItem("Aprovado");
        statusNota.addItem("Recuperação");
        
    }
    
    public static void carregaStatusNotaFinal(JComboBox statusNotaFinal) {
        statusNotaFinal.addItem("Escolha uma opção");
        statusNotaFinal.addItem("Aprovado");
        statusNotaFinal.addItem("Reprovado");
        
    }
    
    public static void retornarEstadoCivil(JComboBox estadoCivil,String eC) {
        switch (eC) {
            case "":
                estadoCivil.setSelectedIndex(0);
                break;
            case "Solteiro":
                estadoCivil.setSelectedIndex(1);
                break;
            case "Casado":
                estadoCivil.setSelectedIndex(2);
                break;
            case "Separado":
                estadoCivil.setSelectedIndex(3);
                break;
            case "Divorciado":
                estadoCivil.setSelectedIndex(4);
                break;
            case "Víuvo":
                estadoCivil.setSelectedIndex(5);
                break;
        }
    }

    public static void retornarFormacao(JComboBox formacao,String f) {
        switch (f) {
            case "":
                formacao.setSelectedIndex(0);
                break;
            case "Ensino Fundamental Completo":
                formacao.setSelectedIndex(1);
                break;
            case "Ensino Médio Incompleto":
                formacao.setSelectedIndex(2);
                break;
            case "Cursando Ensino Médio":
                formacao.setSelectedIndex(3);
                break;
            case "Ensino Médio Completo":
                formacao.setSelectedIndex(4);
                break;
            case "Ensino Superior Incompleto":
                formacao.setSelectedIndex(5);
                break;
            case "Cursando Ensino Superior":
                formacao.setSelectedIndex(6);
                break;
            case "Ensino Superior Completo":
                formacao.setSelectedIndex(7);
                break;
        }
    }

    public static void retornarSexo(JComboBox sexo, String s) {
        switch (s) {
            case "":
                sexo.setSelectedIndex(0);
                break;
            case "Feminino":
                sexo.setSelectedIndex(1);
                break;
            case "Masculino":
                sexo.setSelectedIndex(2);
                break;
        }
    }

    public static void retornarUf(JComboBox ufLogradouro, String uf) {
        switch (uf) {
            case "":
                ufLogradouro.setSelectedIndex(0);
                break;
            case "Acre":
                ufLogradouro.setSelectedIndex(1);
                break;
            case "Alagoas":
                ufLogradouro.setSelectedIndex(2);
                break;
            case "Amapá":
                ufLogradouro.setSelectedIndex(3);
                break;
            case "Amazonas":
                ufLogradouro.setSelectedIndex(4);
                break;
            case "Bahia":
                ufLogradouro.setSelectedIndex(5);
                break;
            case "Ceará":
                ufLogradouro.setSelectedIndex(6);
                break;
            case "Distrito Federal":
                ufLogradouro.setSelectedIndex(7);
                break;
            case "Espírito Santo":
                ufLogradouro.setSelectedIndex(8);
                break;
            case "Goiás":
                ufLogradouro.setSelectedIndex(9);
                break;
            case "Maranhão":
                ufLogradouro.setSelectedIndex(10);
                break;
            case "Mato Grosso":
                ufLogradouro.setSelectedIndex(11);
                break;
            case "Mato Grosso do Sul":
                ufLogradouro.setSelectedIndex(12);
                break;
            case "Minas Gerais":
                ufLogradouro.setSelectedIndex(13);
                break;
            case "Pará":
                ufLogradouro.setSelectedIndex(14);
                break;
            case "Paraíba":
                ufLogradouro.setSelectedIndex(15);
                break;
            case "Pernambuco":
                ufLogradouro.setSelectedIndex(16);
                break;
            case "Piauí":
                ufLogradouro.setSelectedIndex(17);
                break;
            case "Rio de Janeiro":
                ufLogradouro.setSelectedIndex(18);
                break;
            case "Rio Grande do Norte":
                ufLogradouro.setSelectedIndex(19);
                break;
            case "Rio Grande do Sul":
                ufLogradouro.setSelectedIndex(20);
                break;
            case "Rondônia":
                ufLogradouro.setSelectedIndex(21);
                break;
            case "Roraima":
                ufLogradouro.setSelectedIndex(22);
                break;
            case "Santa Catarina":
                ufLogradouro.setSelectedIndex(23);
                break;
            case "São Paulo":
                ufLogradouro.setSelectedIndex(24);
                break;
            case "Sergipe":
                ufLogradouro.setSelectedIndex(25);
                break;
            case "Tocantins":
                ufLogradouro.setSelectedIndex(26);
                break;
        }
    }
    
    public static void retornarCargo(JComboBox cargo,String c) {
        switch (c) {
            case "":
                cargo.setSelectedIndex(0);
                break;
            case "Atendente":
                cargo.setSelectedIndex(1);
                break;
            case "Professor":
                cargo.setSelectedIndex(2);
                break;
            case "Vigia":
                cargo.setSelectedIndex(3);
                break;
            case "Auxiliar de Limpeza":
                cargo.setSelectedIndex(4);
                break;
            case "Coordenador":
                cargo.setSelectedIndex(5);
                break;
            case "Espetor":
                cargo.setSelectedIndex(6);
                break;
            case "Ajudante Geral":
                cargo.setSelectedIndex(7);
                break;
        }
    }

}
