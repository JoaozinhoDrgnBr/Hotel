package src;
// classe de utilidades
public class Utils {
    
    public void EscreverVermelho(String texto){
        System.out.println("\033[31m" + texto + "\033[0m");
        //retoorna a cor padrão
    }

    public void EscreverVerde(String texto){
        System.out.println("\033[32m" + texto + "\033[0m");
        //retoorna a cor padrão
    }

    public void Enter(){
        System.out.println("Pressione enter para continuar");
        System.console().readLine();
    }

    public void LimparTela(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    
}
