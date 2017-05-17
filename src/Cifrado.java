import java.io.*;
import java.util.*;
public class Cifrado {
    public static void cambio(String fentrada,String fcifrado,String fsalida) throws FileNotFoundException{
        try{
            File fe=new File(fentrada);
            FileReader fr=new FileReader(fe);
            BufferedReader br=new BufferedReader(fr);
            
            File fs=new File(fsalida);
            FileWriter fw=new FileWriter(fs);
            
            String s;
            while((s=br.readLine())!=null){
                File fc=new File(fcifrado);
                FileReader frc=new FileReader(fc);
                BufferedReader brc=new BufferedReader(frc);
                    
                String scen;
                while((scen=brc.readLine())!=null){
                    StringTokenizer str;
                    str=new StringTokenizer(scen);
                    s=s.replace(str.nextToken(),str.nextToken());
                }
                System.out.println(s);
                fw.write(s);
                fw.write("\r\n");
                
                if(frc!=null){
                    frc.close();
                }
            }
            if(fw!=null){
                fw.close();
            }
            if(fr!=null){
                fr.close();
            }
        }catch(FileNotFoundException fnf){
            System.err.println("Fichero no encontrado");
        }catch(IOException e){
            System.err.println("Se ha producido un IOException");
            e.printStackTrace();
        }catch(Throwable e){
            System.err.println("Error de programa: "+e);
            e.printStackTrace();
        }
    }
    public static void main(String[] arg) throws FileNotFoundException {
        cambio("escribedescifrado.txt","cifrar","leecifrado.txt");
    }
}
