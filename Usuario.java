public class Usuario {
    public static void main (String[] args) throws Exception{

        SmartTv smarttv = new SmartTv();
         
        System.out.println("TV ligada? "+ smarttv.ligada);
        System.out.println("Canal atual? "+ smarttv.canal);
        System.out.println("Volume atual "+ smarttv.volume);

        smarttv.ligar ();
        System.out.println("Novo Status : Ligada" + smarttv.ligada)
        

    }
    
}
