
import javax.swing.JOptionPane;

public class Funcoes {
    
    public String validaDadosParaTabelaCliente(String nome, String SobreNome, String CPF) {
        if (nome.isEmpty() || SobreNome.isEmpty() || CPF.isEmpty()) {
            return "Existem campos vazios.";
        }
        return "";
    }
    

    public String ValidaCPF(String Cpf) {
        String CPF = Cpf.replaceAll("\\.", "").replaceAll("\\-", "");
        if (CPF.equals("00000000000")
                || CPF.equals("11111111111")
                || CPF.equals("22222222222")
                || CPF.equals("33333333333")
                || CPF.equals("44444444444")
                || CPF.equals("55555555555")
                || CPF.equals("66666666666")
                || CPF.equals("77777777777")
                || CPF.equals("88888888888")
                || CPF.equals("99999999999")
                || (CPF.length() != 11)) {
            return "Erro - Insira um CPF válido!! ";
        }

        int resto, ncpf, pos, soma;
        char dig1, dig2;

        pos = 10;
        soma = 0;

        for (int i = 0; i < 9; i++) {
            ncpf = (int) (CPF.charAt(i) - 48);
            soma = +soma + (ncpf * pos);
            pos--;

        }
        resto = 11 - (soma % 11);
        if ((resto == 11) || (resto == 10)) {
            dig1 = '0';

        } else {
            dig1 = (char) (resto + 48);
        }

        pos = 11;
        soma = 0;

        for (int i = 0; i < 10; i++) {
            ncpf = (int) (CPF.charAt(i) - 48);
            soma = +soma + (ncpf * pos);
            pos--;
        }
        resto = 11 - (soma % 11);

        if ((resto == 11) || (resto == 10)) {
            dig2 = '0';

        } else {
            dig2 = (char) (resto + 48);
        }

        if ((dig1 == CPF.charAt(9)) && (dig2 == CPF.charAt(10))) {
            return "";
        } else {
            return ("Erro - Insira um CPF válido!! ");
        }  
    }

    public String calculaM2(String forma, String altura, String largura) {
        float l = 0, a = 0;
        String resultado = "";
        try {
            l = Float.parseFloat(largura.equals("") ? "0" : largura);
            a = Float.parseFloat(altura.equals("") ? "0" : altura);
            switch (forma) {
                case "Retangular":
                    resultado = Float.toString(l * a);
                    break;
                case "Circular":
                    float pi = (float) 3.1415;
                    resultado = Float.toString(pi * (a * a));
                    break;
                default:
                    resultado = Float.toString((a * l) / 2);
                    break;
            }
            return resultado;
        } catch (NumberFormatException e) {
            return "Digite um numero valido.";
        }
    }
    
    public static String calculaLados(String forma, String total) {
        float totalNum = 0;
        String resultado = "";
        try {
            totalNum = Float.parseFloat(total.equals("") ? "0" : total);
            switch (forma) {
                case "Retangular":
                    resultado = Float.toString((float) Math.sqrt(totalNum));
                    break;
                case "Circular":
                    float pi = (float) 3.1415;
                    resultado = Float.toString((float) Math.sqrt(totalNum /pi));
                    break;
                default:
                    resultado = Float.toString((float) Math.sqrt(totalNum *2));
                    break;
            }
            return resultado;
        } catch (NumberFormatException e) {
            return "Digite um numero valido.";
        }
     }
    
    public String converteParaString(int numero) {
        try {
            return Integer.toString(numero);
        }catch (java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Numero inválido.");
            return "";
        }
    }
    
    public String converteFloatParaString(Float numero) {
        try {
            return Float.toString(numero);
        }catch (java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Numero inválido.");
            return "";
        }
    }
    
    public Float converteParaNumero(String palavra) {
        if (palavra.equals("")){
            return (float) 0;
        }
        try {
            return Float.parseFloat(palavra);
        }catch (java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Numero inválido.");
            return (float) 0;
        }
    }

}
