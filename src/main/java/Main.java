/**
 * Created by marc on 05/02/17.
 */
public class Main {

    //TODO : changer le nom de package

    public static void main(String [] args){
        System.out.println("Hello world!");
        mauvaisNomDeMethode();
        ClasseAuCodeMalFormatte c1 = new ClasseAuCodeMalFormatte();
        c1.champ2 = "12";
        c1.champ4="15";
        c1.methode1();
        try {
            c1.methodeAJavadoquer("test", 1,2L);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static String mauvaisNomDeMethode(){
        System.out.println("Cette chaine doit être transformée en constante"
        + "Ce parametre doit être extrait en variable puis en parametre de la méthode");
        return "Cette chaine doit être transformée en constante";
    }
}
