import java.util.Random;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Creador {
    public static void main (String[]args) throws IOException {
        String [] Edad = {"20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50"};
        String [] Letras={"A", "B", "C", "D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String [] Direccion={"AA1", "BB2", "CC3", "DD4","EE5","FF6","GG7","HH8","II9","JJ10","KK11","LL12","MM13","NN14","OO15","PP16","QQ17","RR18","SS19","TT20","UU21","VV22","WW23","XX24","Y25","ZZ26"};
        String [] Color= {"Azul","Rojo","Amarillo","Verde","Turquesa","Rosa","Morado","Negro","Plateado","Dorado","Blanco","Melon"};
        String [] Years={"2017", "2018", "2019"};
        String [] Mes={"01","02","03","04","05","06","07","08","09","10","11","12"};
        String [] Dia={"01","02","03","04","05","06","07","08","09","10","11","12","20","29","28","27","25","21", "17"};
        String [] Nombre={"Rafa","Moi","Mau","JJ","Alondra","Carmen","Maria","Rodrigo","Carlos","Karla","Alejandra","Alejandro","Sofi","Susie","Roberta","Maleni","Mariana","Naomy","Rebeca","Laura","Nayeli","Cynthia", "Andrea","Juan","Jose","Ingrid","Ruby","Renata","Paola","Paula","Samantha"};
        String [] Estados={"Mexico","Nayarit","Cancun","Oaxaca","Guerrero","Chiapas","Durango","Sonora","Tijuana","California","Colima","Hidalgo","Tlaxcala","Zacatecas","Campeche","Michoacan","Tamaulipas","Jalisco", "Chihuahaua", "Puebla","Aguascalientes"};
        String [] degrees={"21","22","23","24","25","26","19","18","20","27","28","29","30"} ;
        Random random = new Random();
        String ruta = "data_insert100K.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;

        if(archivo.exists()) {
                bw = new BufferedWriter(new FileWriter(archivo));

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
                /*int yearOld= random.nextInt(101);
                int yearOld2= random.nextInt(101);
                int duracion= random.nextInt(12);
                bw.write(yearOld+","+yearOld2+ ","+ duracion+ "\n");*/
                /*int select = random.nextInt(Edad.length);
                int telefono = random.nextInt(90000000) + 10000000;
                int Colores= random.nextInt(Color.length);
                int Meses= random.nextInt(Mes.length);
                int Alos= random.nextInt(Years.length);
                int Dias = random.nextInt(Dia.length);*/
                /*int yearOld= random.nextInt(20)+10;
                int selectDos = random.nextInt(Nombre.length);
                int selectTres = random.nextInt(Direccion.length);
                bw.write(i+ "," + Nombre[selectDos] +"," + Direccion[selectTres] +","+ yearOld + "\n");
               *//*bw.write("\t"+"\"BiciNuevaId\": " + i + "," + "\n");
                bw.write("\t"+"\"Modelo\": "+ "\"" +Direccion[selectTres] + i + "\""+ "," + "\n");
                bw.write("\t"+"\"Color\": "+ "\"" + Color[Colores] + "\"" + "," + "\n");
                bw.write("\t"+"\"FechaCreacion\": "+ "\"" + Years[Alos]+ "-"+Mes[Meses]+"-" +Dia[Dias]+ "\"" + "\n");
                bw.write("}," + "\n"); */
               
            else {
            bw = new BufferedWriter(new FileWriter(archivo));
        
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

               /* int yearOld= random.nextInt(101);
                int yearOld2= random.nextInt(101);
                int duracion= random.nextInt(12);
                bw.write(yearOld+","+yearOld2+ ","+ duracion+ "\n");*/
                /*int selectDos = random.nextInt(Nombre.length);
                int selectTres = random.nextInt(Direccion.length);
                bw.write(i+ "," + Nombre[selectDos] +"," + Direccion[selectTres] +","+ yearOld + "\n");
                *//*
                int select = random.nextInt(Edad.length);
                int selectDos = random.nextInt(Nombre.length);
                int telefono = random.nextInt(90000000) + 10000000;
                int selectTres = random.nextInt(Direccion.length);
                int Colores= random.nextInt(Color.length);
                int Meses= random.nextInt(Mes.length);
                int Alos= random.nextInt(Years.length);
                int Dias = random.nextInt(Dia.length);
                bw.write("{" + "\n");
                bw.write("\t"+"\"BiciNuevaId\": " + i + "," + "\n");
                bw.write("\t"+"\"Modelo\": "+ "\"" +Direccion[selectTres] + i + "\""+ "," + "\n");
                bw.write("\t"+"\"Color\": "+ "\"" + Color[Colores] + "\"" + "," + "\n");
                bw.write("\t"+"\"FechaCreacion\": "+ "\"" + Years[Alos]+ "-"+Mes[Meses]+"-" +Dia[Dias]+ "\"" + "\n");
                bw.write("}," + "\n"); */
               
            }
        }
        bw.close();




       /* for(int i=1; i<=1000000; i++){
            int select = random.nextInt(arr.length);
            int selectDos = random.nextInt(arr2.length);
            System.out.println("INSERT INTO mitabla VALUES ( " + i +", '"+arr[select]+"', '"+arr2[selectDos]+"'  );");


        }*/
    }
}
