/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cesar;

/**
 *
 * @author BOYK
 */
public class CEsar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //hola
        String abcMa = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String abcMi = "abcdefghijklmnñopqrstuvwxyz";
        String palabra = "Ynkxquip Nuqrky, wak ks as vxñsiñvñu Jueqk zksñg vxkbñyzu qqgrgx\nYnkxxñsluxj, ky as jkzkizñbk vxñbgju, gqzu, jkqmgju, lxñu, ñxusñiu,\nñsmksñuyu k ñszkqkizagqrkszk ñswañkzu. Cgzyus qu jkyixñhk lñyñigrkszk\njkq yñmañkszk ruju gq vuiu jk iusuikxykf";
        int cont = 0;
        int res = 0;
        int clave = 6;

        for (int i = 0; i < palabra.length(); i++)//palabra
        {
            if (palabra.charAt(i) == '.' || palabra.charAt(i) == ',' || palabra.charAt(i) == ' ' || palabra.charAt(i) == '\n') {
                System.out.print(palabra.charAt(i));
            }
            for (int ab = 0; ab < abcMa.length(); ab++)//abcedario
            {
                if (palabra.charAt(i) == abcMa.charAt(ab) || palabra.charAt(i) == abcMi.charAt(ab)) {

                    if (ab - clave < 0) {
                        res = (ab - clave);
                        cont = abcMa.length() + res;
                    } else {
                        cont = ab - clave;
                    }
                    if (Character.isUpperCase(palabra.charAt(i))) {
                        System.out.print(abcMa.charAt(cont));
                    } else {
                        System.out.print(abcMi.charAt(cont));
                    }
                    ab = abcMa.length();
                }
            }
        }
    }
}


