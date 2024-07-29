public class TestaData {
    
    public static void main(String[] args) {
         /*  Data data = new Data(03,07,2024);

        System.out.println("Data:" + " " + data.Mostra1());
        System.out.println("Data por extenso:" + " " + data.Mostra2());

        if(data.bissexto())
            System.out.println("O ano informado é um ano bissexto.");
        
        else
            System.out.println("O ano informado não é um ano bissexto.");

        System.out.println("A data informada teve um total de" + " " + data.diasTranscorridos() + " " + "dias transcorridos.");

        data.apresentaDataAtual();*/

          Data data2 = new Data();

        System.out.println("Data:" + " " + data2.Mostra1());
        System.out.println("Data por extenso:" + " " + data2.Mostra2());

        /*data2.entraDia(03);
        System.out.println(data2.retDia());
        data2.entraMes(07);
        System.out.println(data2.retMes());
        data2.entraAno(2024);
        System.out.println(data2.retAno());*/

        
        data2.entraDia();
        System.out.println(data2.retDia());
        data2.entraMes();
        System.out.println(data2.retMes());
        data2.entraAno();
        System.out.println(data2.retAno());
       
     

        



    }

}
