class Main {

  /*Problem: x kann nicht als double in die Gleichung eingefügt werden
    weil es nicht initialisiert ist. 

  */
    //Grade von 1-5



    public static void main(String[] args) {
        int grad = InOut.readInt("Grad zwischen 1-5 wählen: ");
        double x = 1; // Unbekannte

        double a;
        
        double b;
        
        //double c = InOut.readDouble("c: ");

        double gleichung;
        double ableitung;

          if (grad==1){

            a = InOut.readDouble("a: ");

            b = InOut.readDouble("b: ");
            
            //double pow = Math.pow(x, grad);
            //gleichung = a*x*pow; 
            System.out.println("Gleichung f(x) = "+a +"*x^" +grad); //Problem --> Ausgabe wäre 2^1, soll aber sein 2x^1

            ableitung = grad * a; // hoch n-1 hier nicht nescessaire 
            System.out.println("1. Ableitung f'(x) = "+ableitung);
        }

      if (grad==2){
        
      }




    }

}