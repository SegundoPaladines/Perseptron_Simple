import javax.swing.JOptionPane;
public class Perceptron{

    public boolean x [];
    public double w [];
    public double bias;
    public double peso_bias;
    public boolean estado=false;
    public double z;
    public Perceptron(int n){

       this.bias = 0;
       this.peso_bias=1;
        try{
            this.bias = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor De La Variable Bias Numero Real"));
        }catch(Exception e){
            System.out.println("Valor del bias no valido, se asume 0");
        }

        try{
            this.peso_bias = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el peso De La Variable Bias Numero Real"));
        }catch(Exception e){
            System.out.println("Valor del peso del bias no valido, se asume 1");
        }

        if(n>0){

            this.x= new boolean [n];
            this.w= new double [n];

            for(int i=0; i<n; i++){
                String tmp = JOptionPane.showInputDialog(null, "Ingrese el Valor De La Variable x"+(i+1)+" VERDADERO o FALSO");
                if(tmp.equalsIgnoreCase("verdadero")){

                    this.x[i]=true;

                }else if(tmp.equalsIgnoreCase("falso")){

                    this.x[i]=false;

                }else{
                    this.x[i]=false;
                    System.out.println("X"+(i+1)+" Valor no valido, se asume falso");
                }

                double tmp2=0;
                boolean bandera=true;
                try {
                    tmp2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese peso De La Variable w"+(i+1)+" Numero Real"));
                } catch (Exception e) {
                    bandera=false;
                }

                if(bandera){
                    this.w[i]=tmp2;
                }else{
                    this.w[i]=1;
                    System.out.println("Valor no Valido, Se asume 1");
                }

            }


        }else{
            System.out.println("Numero Inputs No Valido");
        }

        this.estado=true;

    }
    public boolean Output(){

        boolean bandera=false;
        this.z=this.bias*this.peso_bias;
        if(this.estado==true){
            for(int i=0; i<this.x.length; i++ ){
                if(this.x[i]==true){
                    z=z+(1*this.w[i]);
                }
            }
        }

        if(this.z>=0){
            bandera=true;
        }
        return bandera;
    }

}
