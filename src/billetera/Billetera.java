
package billetera;

public class Billetera {

    public static void main(String[] args) {
        
        monedero m1=new monedero();
        do{
            m1.menu();
            switch(m1.op){
                case 1:
                    m1.usuario();
                break;
            case 2:
                m1.salidas();
                break; 
            case 3:
                m1.entradas();
                break;
            case 4:
                m1.saldo();
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
            }
        }while(m1.op!=5);
       
    }
    
}