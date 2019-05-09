import java.util.Random;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Creador {
    public static void main (String[]args) throws IOException {
       
        String [] Estados={"Mexico","Nayarit","Cancun","Oaxaca","Guerrero","Chiapas","Durango","Sonora","Tijuana","California","Colima","Hidalgo","Tlaxcala","Zacatecas","Campeche","Michoacan","Tamaulipas","Jalisco", "Chihuahaua", "Puebla","Aguascalientes"};
        String [] degrees={"21","22","23","24","25","26","19","18","20","27","28","29","30"} ;
        Random random = new Random();
        String ruta = "data_insert100K.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;

        if(archivo.exists()) {
                bw = new BufferedWriter(new FileWriter(archivo));
                   bw.write("# DDL\n");
                   bw.write("\n");
                   bw.write("CREATE DATABASE IOT_database\n");
                   bw.write("\n");
                   bw.write("# DML\n");
                   bw.write("\n");
                   bw.write("# CONTEXT-DATABASE: IOT_database\n");
                for(int i=0; i<=20000000; i++) {
                    int Estado=  random.nextInt(Estados.length);
                    int unix= random.nextInt(9999999)+100000;
                    int degree= random.nextInt(degrees.length);
                    int energy=random.nextInt(9999)+1000;
                    if (i<=7000000){
                        bw.write("house_temperature,location="+ Estados[Estado] +" degrees=" + degrees[degree] +" 155" +unix+    "\n");
                   }
                   else if(i>=7000001 && i<=15000000){
                    bw.write("refrigerator_temperature,location="+ Estados[Estado] +" degrees=" + degrees[degree] +" 155" + unix +    "\n");
                   }
                   else{
                    bw.write("energy_use,location="+ Estados[Estado] +" watts=" + energy +" 155" +unix+    "\n");
                   }
    
                }
            }
             
            else {
            bw = new BufferedWriter(new FileWriter(archivo));
                   bw.write("# DDL\n");
                   bw.write("\n");
                   bw.write("CREATE DATABASE IOT_database\n");
                   bw.write("\n");
                   bw.write("# DML\n");
                   bw.write("\n");
                   bw.write("# CONTEXT-DATABASE: IOT_database\n");
            for(int i=0; i<=20000000; i++) {
                int Estado=  random.nextInt(Estados.length);
                int unix= random.nextInt(9999999)+100000;
                int degree= random.nextInt(degrees.length);
                int energy=random.nextInt(9999)+1000;
                if (i<=7000000){
                    bw.write("house_temperature,location="+ Estados[Estado] +" degrees=" + degrees[degree] +" 155" +unix+    "\n");
               }
               else if(i>=7000001 && i<=15000000){
                bw.write("refrigerator_temperature,location="+ Estados[Estado] +" degrees=" + degrees[degree] +" 155" + unix +    "\n");
               }
               else{
                bw.write("energy_use,location="+ Estados[Estado] +" watts=" + energy +" 155" +unix+    "\n");
               }

               
               
            }
        }
        bw.close();

    }
}
