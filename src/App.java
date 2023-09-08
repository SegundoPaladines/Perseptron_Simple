import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        int numero_entradas=0;
        try {
            numero_entradas=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese El Nunero de entradas deseado"));
        } catch (Exception e) {System.out.println("El umero de entradas debe ser un numero entero");}
        
       if(numero_entradas>0){
            Perceptron p1 = new Perceptron(numero_entradas);
            boolean out = p1.Output();
            double z = p1.z;

            System.out.println("_____________________________________________________");
            if(out){
                System.out.println("\nZ(x,w) = "+z+" Tarea Exitosa");
            }else{
                System.out.println("Z(x,w) = "+z+" La tarea no se va a realziar \n");
            }
       }else{
            System.out.println("El numero de entradas no es valido");
       }
        System.out.println("_____________________________________________________");
    }
}
