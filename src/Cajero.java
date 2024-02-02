import javax.swing.*;


public class Cajero {

    static Cuenta p1 = new Cuenta();
    public static void main(String[] args) {

        int opcion;



        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                    Saldo-1
                    Imposición-2
                    Reintegro-3\s
                    Salir-4"""));
            switch (opcion) {
                case 1:
                        obtenerSaldo();
                    break;
                case 2:
                        double cantidadEuros =solicitaCantidad();
                        ingresar(cantidadEuros);
                    break;

                case 3:
                        double eurosReintegro = solicitaCantidad();
                        extraer(eurosReintegro);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null,"Saliendo");

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }

        }while (opcion !=4);



    }

    public static double solicitaCantidad(){

       double eurosSolicitados = Double.parseDouble(JOptionPane.showInputDialog("Indique cantidad de euros:"));
       if(eurosSolicitados >0){
           JOptionPane.showMessageDialog(null,eurosSolicitados+ "disponible.");

       }else{
           JOptionPane.showMessageDialog(null,"Cantidad erronea");
       }
        return eurosSolicitados;
    }

    public static void ingresar(double cantidadIngresar){

        JOptionPane.showMessageDialog(null, "Operación realizada: Ingreso de " + cantidadIngresar);

        if(cantidadIngresar>0){
            p1.setSaldo(p1.getSaldo() + cantidadIngresar);
        }else{
            JOptionPane.showMessageDialog(null,"Cantidad no válida");
        }
    }

    public static void extraer(double cantidaddExtraer){
        p1.setSaldo(p1.getSaldo() - cantidaddExtraer);
        JOptionPane.showMessageDialog(null,"Cantidad extraida:"+cantidaddExtraer);
    }

    public static void obtenerSaldo(){
        JOptionPane.showMessageDialog(null,"Su saldo es:"+ p1.getSaldo());
    }


}