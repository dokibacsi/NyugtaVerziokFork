package nyugtaprojektek;

public class atalakitott {

    public static void main(String[] args) {
        
        //symbs(szimbolum);
        
        int egyesTetel = 350;
        int kettesTetel = 90;
        int harmasTetel = 650;
        
        int osszesen = egyesTetel + kettesTetel + harmasTetel;
        
        //System.out.println(szimbolumok[0]);
        System.out.println("     Nyugta 1");
        //System.out.println(szimbolumok[0]);
        System.out.println("Tétel 1:    350 Ft");
        System.out.println("Tétel 2:     90 Ft");
        System.out.println("Tétel 3:    650 Ft");
        System.out.println("==================");
        System.out.printf("Összesen:", osszesen);
        System.out.println("------------------");
        System.out.println("Kedvezmény: 109 Ft");
        System.out.println("(10%)");
        System.out.println("==================");
        System.out.println("Fizetendő:  981 Ft");
        System.out.println("------------------");
        System.out.println("");
        System.out.print("_______");
        System.out.print("   ");
        System.out.println("_______");
        System.out.print(" Dátum");
        System.out.print("   ");
        System.out.println("   Név");
        System.out.println("******************");
        System.out.println("        CÉG");
        System.out.println("******************");
    }

    static void symbs(String szimbolum) {
        
        String csillag = "******************";
        String egyenloseg = "==================";
        String kotojel = "------------------";
        
        String[] szimbolumok = {csillag, egyenloseg, kotojel};
         
        int i = 0;
        while (i < szimbolumok.length){
            if(szimbolum == szimbolumok[0])
               System.out.println(csillag);}
             
            if(szimbolum == szimbolumok[1]){
               System.out.println(egyenloseg);}
            
            if(szimbolum == szimbolumok[2]){
               System.out.println(kotojel);}
    }
    
    static void aruOsszesen(String aruk){
        int egyesTetel
    }
    
}