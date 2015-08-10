
package billetera;

import java.util.Scanner;

public class monedero {
    String nombre;
    String codigo;
    double salidas;
    double entradas;
    double saldo;
    int op;
    String validarCodigo;

    void usuario(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nombre: ");
        nombre = sc.next();
        System.out.print("Codigo: ");
        codigo = sc.next();
        System.out.print("Saldo inicial: ");
        saldo=sc.nextDouble();
        System.out.println("-----------------------------");
    }
    void entradas(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingresa el codigo de usuario: ");
        validarCodigo=sc.next();
        if(validarCodigo.equals(codigo)){
            System.out.print("Ingresa el monto a ingresar: ");
            entradas=sc.nextDouble();
            saldo=saldo+entradas;
        }else{
            System.out.println("¡Codigo Incorrecto!");
            System.out.println("-----------------------------");
        }
    }
    void salidas(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingresa el codigo de usuario: ");
        validarCodigo=sc.next();
        if(validarCodigo.equals(codigo)){
            System.out.println("");
            System.out.print("Ingresa el monto a retirar: ");
            salidas=sc.nextDouble();
            if(saldo>salidas){
                saldo=saldo-salidas;
            }else{
                System.out.println("No hay suficiente dinero");
            }
            System.out.println("-----------------------------");
        }else{
            System.out.println("¡Codigo Incorrecto!");
        }
    }
    void saldo(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingresa el codigo de usuario: ");
        validarCodigo=sc.next();
        if(validarCodigo.equals(codigo)){
            System.out.println("-----------------------------");
            System.out.println("Nombre: "+nombre);
            System.out.println("Saldo: "+saldo);
            if(saldo <=100){
                System.out.println("¡Tu saldo es muy poco! te recomendamos ahorrar mas");
                
            }else{
                if(saldo <= 1000){
                    System.out.println("¡Muy bien! sigue ahorrando");
                }else{
                    System.out.println("¡Exelente! sigue ahorrando");
                }
                
            }
            System.out.println("-----------------------------");
        }else{
            System.out.println("¡Codigo Incorrecto!");
            System.out.println("-----------------------------");
        }
    }
    void menu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1-- Nuevo Monedero");
        System.out.println("2-- Retirar");
        System.out.println("3-- ahorrar");
        System.out.println("4-- Ver saldo");
        System.out.println("5-- Salir");
        System.out.print("Ingresa tu opcion: ");
        op=sc.nextInt();
    }
    
}
