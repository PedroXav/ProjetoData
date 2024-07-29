import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Date;
import java.text.DateFormat;
public class Data {
    private int dia;
    private int mes;
    private int ano;

    Scanner ler = new Scanner(System.in);

    public Data(){
        entraDia();
        entraMes();
        entraAno();
    }

    public Data(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public void entraDia(int d){
        if (d>=1 && d<=31)
        this.dia = d;
        else{
            throw new IllegalArgumentException("Dia inválido.");
        }
    }

    public void entraMes(int m){
        if(m>=1 && m<=12)
        this.mes = m;
        else
            throw new IllegalArgumentException("Mês inválido.");
        
    }

    public void entraAno(int a){
        if(a>=1)
        this.ano = a;
        else
            throw new IllegalArgumentException("Ano inválido.");
        
    }

    public void entraDia(){
        while(true){
            try{
                System.out.println("Por favor, insira o dia:");
                int dia = ler.nextInt();
            if(dia>= 1 && dia<=31){
                this.dia = dia;
                
                break;
            }
            else
                System.out.println("Por favor, insira um número válido para o dia");
            }
            catch (InputMismatchException msg) {
                System.out.println("O valor digitado é inesperado. Por favor, insira um número válido para o dia.");

                ler.next();
            }
        }
    }

    public void entraMes(){
        while(true){
            try{
                System.out.println("Por favor, insira o mês:");
                int mes = ler.nextInt();
            if(mes>= 1 && mes<=12){
                this.mes = mes;

                break;
            }
            else
                System.out.println("Por favor, insira um número válido para o mês");
            }
            catch (InputMismatchException msg) {
                System.out.println("O valor digitado é inesperado. Por favor, insira um número válido para o mês");

                ler.next();
            }
        }
    }

    public void entraAno(){
        while(true){
            try{
                System.out.println("Por favor, insira o ano:");
                int ano = ler.nextInt();
            if(ano>=1){
                this.ano = ano;

                break;
            }
                
            else
                System.out.println(" Por favor, insira um número válido para o ano");
                
            }
            catch (InputMismatchException msg) {
                System.out.println("O valor digitado é inesperado. Por favor, insira um número válido para o ano");

                ler.next();
            }
        }
    }

     public int retDia(){
        return this.dia;
    }

    public int retMes(){
        return this.mes;
    }

    public int retAno(){
        return this.ano;
    }

    public String Mostra1(){
        return String.format("%02d/%02d/%d", this.dia, this.mes, this.ano);
    }

    public String Mostra2(){
        String[] meses = {"janeiro", "fevereiro", "março", "abril", 
            "maio", "junho", "julho", "agosto",
            "setembro", "outubro", "novembro", "dezembro"};

            return String.format("%02d/%s/%d", this.dia, meses[this.mes-1], this.ano);
    }

    public boolean bissexto(){
        return (this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0);
    }

    public int diasTranscorridos(){
        int[] diasPorMesComum = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int[] diasPorMesBissexto = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int totalDias = 0;

        for (int i = 0; i < this.mes - 1; i++) {
            totalDias += bissexto() ? diasPorMesBissexto[i] : diasPorMesComum[i];
        }

        totalDias += this.dia;
        return totalDias;
    }

    public void apresentaDataAtual(){
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
        String dataFormatada = formatador.format(data);
        System.out.println("Data atual:" + " " + dataFormatada);
    }



}
