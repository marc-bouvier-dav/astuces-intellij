/**
 * Created by marc on 05/02/17.
 */
public class ClasseAuCodeMalFormatte {

    private String champ1;

    public String champ2;
    private String champ3;
    public String champ4;

    public void methode1(

                    ){
                                    //commentaire t
        System.out.println("champ3 : "+champ3);
                    }


    private void methode2(){

    }

    /**
     * Constructeur par défaut.
     */
    public ClasseAuCodeMalFormatte(){

    }

    public int methodeAJavadoquer(String arg1, int arg2, Long arg3) throws IllegalArgumentException, IllegalAccessException {
        if(arg1==null){
            throw new IllegalArgumentException("arg1 must not be null");
        }

        System.out.println(arg1+arg2+arg3+champ4+champ3+champ1+champ2);
        return 2;
    }
}
