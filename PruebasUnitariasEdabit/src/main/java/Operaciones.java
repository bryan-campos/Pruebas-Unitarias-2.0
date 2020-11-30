public class Operaciones {
        //Funcion para comprobar si un numero es menor o igual a 0
    public boolean comprobar(int a){
        boolean comprobar;
        if( a <= 0){
            comprobar = true;
            System.out.println("El valor " + a + " es menor o igual a 0 : " + comprobar);
        }else{
            comprobar = false;
            System.out.println("El valor " + a + " es menor o igual a 0 : " + comprobar);
        }
        return comprobar;
    }
    
      //Funcion para comprobar si dos numeros son iguales
    public boolean comprobar1(int a, int b){
        boolean comprobar;
        if( a == b){
            comprobar = true;
            System.out.println("Los numeros " + a + " y " + b + " son iguales: " + comprobar);
        }else{
            comprobar = false;
            System.out.println("Los numeros " + a + " y " + b + " son iguales: " + comprobar);
        }
        return comprobar;
    }
    
    //Funcion para convertir minutos en segundos
     public int tiempo(int a){
        int resultado =  a * 60;
         System.out.println(a + " minutos tiene : " + resultado + " segundos");
        return resultado;
    }
  }

