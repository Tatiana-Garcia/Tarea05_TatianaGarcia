
package tarea05_tatianagarcia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Tatiana Garcia
 */
public class Tarea05_TatianaGarcia {
    static Scanner leer = new Scanner (System.in);
    static ArrayList lista = new ArrayList();

    public static void main(String[] args) {
        
        int menu =0;
        
        while (menu != 6) {            
            System.out.println("\n--MAXIDESPENSA--\n"
                    + "1. Agregar Producto\n"
                    + "2. Modificar Producto\n"
                    + "3. Eliminar Producto\n"
                    + "4. Simulacion de Facturacion\n"
                    + "5. Reporte\n"
                    + "6. Salir del Sistema");
            menu = leer.nextInt();
            if (menu == 1) {
                int op = 6;
                while (op >5) {                    
                    System.out.println("Que desea agregar?\n"
                            + "1. Granos basicos\n"//cantidad de quintales
                            + "2. Productos de Limpieza\n"//cantidad en inventario
                            + "3. Liquidos\n"
                            + "4. Carnes y embutidos\n"//cantidad en inventario
                            + "5. Frutas/Verduras");//cantidad en inventario
                    op = leer.nextInt();
                    switch (op) {
                        case 1:{
                            lista.add(granos());
                            break;
                        } 
                        case 2:{
                            lista.add(limpieza());
                            break; 
                        }
                        case 3:{
                            lista.add(liquidos());
                            break;
                        }
                        case 4:{
                            lista.add(carnes());
                            break;
                        }
                        case 5:{
                            lista.add(frutaverdura());
                            break;
                        }
                        default:
                            //throw new AssertionError();
                            break;
                    }
                }
            }//Menu if opcion 1
            if(menu ==2){
                if(!lista.isEmpty()){
                    System.out.println("Ingrese la posicion del producto a modificar: ");
                    int pos = leer.nextInt();
                    if(lista.get(pos)instanceof GranosBasicos){
                        int op =0; 
                        while(op !=6){
                            System.out.println("Que desea modificar: \n"
                                    + "1.Nombre del producto\n"
                                    + "2. Cantidad de quintales\n"
                                    + "3. Precio\n"
                                    + "4. Unidad de medida\n"
                                    + "5. Lugar de procedencia\n"
                                    + "6. Regresar/Nada");
                            op = leer.nextInt();
                            switch (op) {
                                case 1:
                                    System.out.println("Ingrese nombre del producto: ");
                                    leer=new Scanner(System.in);
                                    String nombre = leer.nextLine();
                                    ((GranosBasicos) lista.get(pos)).setNombre(nombre);
                                    break;
                                case 2: 
                                    System.out.println("Ingrese cantidad de quintales: ");
                                    int quintales = leer.nextInt();
                                    ((GranosBasicos) lista.get(pos)).setCant_quintales(quintales);
                                    break;
                                case 3: 
                                    System.out.println("Ingrese precio: ");
                                    double precio = leer.nextDouble();
                                    ((GranosBasicos) lista.get(pos)).setPrecio(precio);
                                    break;
                                case 4: 
                                    int op2 = 4; 
                                    String medida = "";
                                    while (op2>3){
                                        System.out.println("Seleccione la medida: \n"
                                            + "1. libra\n"
                                            + "2. medida\n"
                                            + "3. kilo");
                                        op2 = leer.nextInt();
                                        switch (op2) {
                                            case 1:
                                                medida = "libra";
                                                break;
                                            case 2: 
                                                medida = "medida";
                                                break;
                                            case 3:
                                                medida = "kilo";
                                                break;
                                            default:
                                                //throw new AssertionError();
                                                break;
                                        }
                                    }
                                    ((GranosBasicos) lista.get(pos)).setMedida(medida);
                                    break;
                                case 5: 
                                    System.out.println("Ingrese el lugar de procedencia: ");
                                    leer=new Scanner(System.in);
                                    String procedencia = leer.nextLine();
                                    ((GranosBasicos) lista.get(pos)).setLugar(procedencia);
                                    break;
                                default:
                                    //throw new AssertionError();
                                    break;
                            }
                        }

                    }else if(lista.get(pos)instanceof ProductosdeLimpieza){
                        int op =0; 
                        while(op !=8){
                            System.out.println("Que desea modificar: \n"
                                    + "1. Tipo del producto\n"
                                    + "2. Marca\n"
                                    + "3. Codigo\n"
                                    + "4. Precio\n"
                                    + "5. Cantidad en Inventario\n"
                                    + "6. Proveedor\n"
                                    + "7. Nombre del producto\n"
                                    + "8. Regresar/Nada");
                            op = leer.nextInt();
                            switch (op) {
                                case 1:
                                    int op2 = 4; 
                                    String tipo = "";
                                    while (op2>3){
                                        System.out.println("Seleccione el tipo: \n"
                                            + "1. liquido\n"
                                            + "2. polvo");
                                        op2 = leer.nextInt();
                                        switch (op2) {
                                            case 1:
                                                tipo = "liquido";
                                                break;
                                            case 2: 
                                                tipo = "polvo";
                                                break;
                                            default:
                                                //throw new AssertionError();
                                                break;
                                        }
                                    }
                                    ((ProductosdeLimpieza) lista.get(pos)).setTipo(tipo);
                                    break;
                                case 2: 
                                    System.out.println("Ingrese la marca: ");
                                    leer=new Scanner(System.in);
                                    String marca = leer.nextLine();
                                    ((ProductosdeLimpieza) lista.get(pos)).setMarca(marca);
                                    break;
                                case 3: 
                                    System.out.println("Ingrese el codigo del producto: ");
                                    leer=new Scanner(System.in);
                                    String codigo = leer.nextLine();

                                    for (Object t : lista) {
                                        if(t instanceof ProductosdeLimpieza){
                                            while (t.equals(codigo)) {
                                                System.out.println("El siguiente codigo ya esta registrado");
                                                System.out.println("Ingrese el codigo del producto: ");
                                                leer=new Scanner(System.in);
                                                codigo = leer.nextLine();
                                            }

                                        }
                                    }
                                    ((ProductosdeLimpieza) lista.get(pos)).setCodigo(codigo);
                                    break;
                                case 4: 
                                    System.out.println("Ingrese precio: ");
                                    double precio = leer.nextDouble();
                                    ((ProductosdeLimpieza) lista.get(pos)).setPrecio(precio);
                                    break;
                                case 5: 
                                    System.out.println("Ingrese cantidad de inventario: ");
                                    int cant = leer.nextInt();
                                    ((ProductosdeLimpieza) lista.get(pos)).setCant_inventario(cant);
                                    break;
                                case 6: 
                                    System.out.println("Ingrese el proveedor: ");
                                    leer=new Scanner(System.in);
                                    String proveedor = leer.nextLine();
                                    ((ProductosdeLimpieza) lista.get(pos)).setProveedor(proveedor);
                                    break;
                                case 7:
                                    System.out.println("Ingrese nombre del producto: ");
                                    leer=new Scanner(System.in);
                                    String nombre = leer.nextLine();
                                    ((ProductosdeLimpieza) lista.get(pos)).setProducto(nombre);
                                    break;
                                default:
                                    //throw new AssertionError();
                                    break;
                            }
                        }
                    }else if(lista.get(pos)instanceof Liquidos){
                        int op =0; 
                        while(op !=7){
                            System.out.println("Que desea modificar: \n"
                                    + "1. Categoria\n"
                                    + "2. Empaque\n"
                                    + "3. Tamaño\n"
                                    + "4. Nombre del producto\n"
                                    + "5. Precio\n"
                                    + "6. Fecha de Vencimiento\n"
                                    + "7. Regresar/Nada");
                            op = leer.nextInt();
                            switch (op) {
                                case 1:{
                                    int op2 = 5; 
                                    String categ = "";
                                    while (op2>4){
                                        System.out.println("Seleccione la categoria: \n"
                                            + "1. Lacteos\n"
                                            + "2. Gaseosas\n"
                                            + "3. Jugos\n"
                                            + "4. Agua");
                                        op2 = leer.nextInt();
                                        switch (op2) {
                                            case 1:
                                                categ = "lacteos";
                                                break;
                                            case 2: 
                                                categ = "gaseosas";
                                                break;
                                            case 3:
                                                categ = "jugos";
                                                break;
                                            case 4: 
                                                categ = "agua";
                                                break;
                                            default:
                                                //throw new AssertionError();
                                                break;
                                        }
                                    }
                                    ((Liquidos) lista.get(pos)).setCategoria(categ);
                                    break;
                                }
                                case 2: {
                                    int op2 = 5; 
                                    String empaque = "";
                                    while (op2>3){
                                        System.out.println("Seleccione la categoria: \n"
                                            + "1. Bote\n"
                                            + "2. Caja\n"
                                            + "3. Lata");
                                        op2 = leer.nextInt();
                                        switch (op2) {
                                            case 1:
                                                empaque= "bote";
                                                break;
                                            case 2: 
                                                empaque= "caja";
                                                break;
                                            case 3:
                                                empaque = "lata";
                                                break;
                                            default:
                                                //throw new AssertionError();
                                                break;
                                        }
                                    }
                                    ((Liquidos) lista.get(pos)).setEmpaque(empaque);
                                    break;
                                }
                                case 3:{
                                    int op2 = 5; 
                                    String tam = "";
                                    while (op2>3){
                                        System.out.println("Seleccione la categoria: \n"
                                            + "1. Pequeño\n"
                                            + "2. Mediano\n"
                                            + "3. Grande");
                                        op2 = leer.nextInt();
                                        switch (op2) {
                                            case 1:
                                                tam= "pequeño";
                                                break;
                                            case 2: 
                                                tam= "mediano";
                                                break;
                                            case 3:
                                                tam = "grande";
                                                break;
                                            default:
                                                //throw new AssertionError();
                                                break;
                                        }
                                    }
                                    ((Liquidos) lista.get(pos)).setTam(tam);
                                    break;
                                }
                                case 4: 
                                    System.out.println("Ingrese nombre del producto: ");
                                    leer=new Scanner(System.in);
                                    String nombre = leer.nextLine();
                                    ((Liquidos) lista.get(pos)).setProducto(nombre);

                                    break;
                                case 5: 
                                    System.out.println("Ingrese precio: ");
                                    double precio = leer.nextDouble();
                                    ((Liquidos) lista.get(pos)).setPrecio(precio); 
                                    break;
                                case 6: 
                                    System.out.println("Ingrese fecha de vencimiento (dd/mm/yyyy): ");
                                    String cadena; 
                                    leer=new Scanner(System.in);
                                    cadena = leer.next();
                                    String t[]= cadena.split("/");
                                    Date vencimiento = new Date(Integer.parseInt(t[2])-1900, Integer.parseInt(t[1])-1, Integer.parseInt(t[0]));
                                    ((Liquidos) lista.get(pos)).setFecha(vencimiento); 
                                    break;
                                default:
                                    //throw new AssertionError();
                                    break;
                            }
                        }
                    }else if (lista.get(pos)instanceof CarnesyEmbutidos){
                        int op =0; 
                        while(op !=5){
                            System.out.println("Que desea modificar: \n"
                                    + "1. Lugar de Procedencia\n"
                                    + "2. Cantidad de inventario\n"
                                    + "3. Tipo de producto\n"
                                    + "4. Precio\n"
                                    + "5. Regresar/Nada");
                            op = leer.nextInt();
                            switch (op) {
                                case 1:
                                    System.out.println("Ingrese el lugar de procedencia: ");
                                    leer=new Scanner(System.in);
                                    String procedencia = leer.nextLine();
                                    ((CarnesyEmbutidos) lista.get(pos)).setLugar(procedencia);
                                    break;
                                case 2: 
                                    System.out.println("Ingrese cantidad en inventario: ");
                                    int quintales = leer.nextInt();
                                    ((CarnesyEmbutidos) lista.get(pos)).setInventario(quintales);
                                    break;
                                case 3: 
                                    int op2 = 5; 
                                    String tipo = "";
                                    while (op2>3){
                                        System.out.println("Seleccione el tipo: \n"
                                            + "1. res\n"
                                            + "2. carne blanca\n"
                                            + "3. cerdo");
                                        op2 = leer.nextInt();
                                        switch (op2) {
                                            case 1:
                                                tipo = "res";
                                                break;
                                            case 2: 
                                                tipo = "carne blanca";
                                                break;
                                            case 3:
                                                tipo = "cerdo";
                                                break;
                                            default:
                                                //throw new AssertionError();
                                                break;
                                        }
                                    }
                                    ((CarnesyEmbutidos) lista.get(pos)).setTipo(tipo);
                                    break;
                                case 4: 
                                    System.out.println("Ingrese precio: ");
                                    double precio = leer.nextDouble();
                                    ((CarnesyEmbutidos) lista.get(pos)).setPrecio(precio);
                                    break;
                                default:
                                    //throw new AssertionError();
                                    break;
                            }
                        }
                    }else if(lista.get(pos)instanceof FrutasVerduras){
                        int op =0; 
                        while(op !=4){
                            System.out.println("Que desea modificar: \n"
                                    + "1. Cantidad en inventario\n"
                                    + "2. Precio\n"
                                    + "3. Categoria Fruta/Verdura\n"
                                    + "4. Regresar/Nada");
                            op = leer.nextInt();
                            switch (op) {
                                case 1:
                                    System.out.println("Ingrese cantidad de inventario: ");
                                    int cant = leer.nextInt();
                                    ((FrutasVerduras) lista.get(pos)).setCant_inve(cant);
                                    break;
                                case 2: 
                                    System.out.println("Ingrese precio: ");
                                    double precio = leer.nextDouble();
                                    ((FrutasVerduras) lista.get(pos)).setPrecio(precio);
                                    break;
                                case 3: 
                                    String categoria="";
                                    int op1 = 4; 
                                    while (op1>2){
                                        System.out.println("Seleccione el producto: \n"
                                                + "1. Fruta\n"
                                                + "2. Verdura");
                                        op1 = leer.nextInt();
                                        if(op1==1){
                                            int op2 = 5; 
                                            while (op2>4){
                                                System.out.println("Seleccione la categoria del producto: \n"
                                                        + "1. Citricos\n"
                                                        + "2. Tropical\n"
                                                        + "3. de Grano\n"
                                                        + "4. Rica en Fibra");
                                                op2 = leer.nextInt();
                                                switch (op2) {
                                                    case 1:
                                                        categoria = "Fruta Citricos";
                                                        break;
                                                    case 2:
                                                        categoria = "Fruta Tropical";
                                                        break;
                                                    case 3:
                                                        categoria = "Fruta de Grano";
                                                        break;
                                                    case 4:
                                                        categoria = "Fruta Rica en Fibra";
                                                        break;
                                                    default:
                                                        //throw new AssertionError();
                                                        break;
                                                }
                                            }
                                        }
                                        if(op ==2){
                                            int op2 = 5; 
                                            while (op2>4){
                                                System.out.println("Seleccione la categoria del producto: \n"
                                                        + "1. Tuberculos\n"
                                                        + "2. Legumbres\n"
                                                        + "3. de Hojas");
                                                op2 = leer.nextInt();
                                                switch (op2) {
                                                    case 1:
                                                        categoria = "Verdura Tuberculos";
                                                        break;
                                                    case 2:
                                                        categoria = "Verdura Legumbres";
                                                        break;
                                                    case 3:
                                                        categoria = "Verdura de Hojas";
                                                        break;
                                                    default:
                                                        //throw new AssertionError();
                                                        break;
                                                }
                                            }
                                        }
                                    }//while categoria de producto
                                ((FrutasVerduras) lista.get(pos)).setCategoria(categoria);
                                break;
                                default:
                                    //throw new AssertionError();
                                    break;
                            }
                        }
                    }else{
                        System.out.println("La posicion entregada no es valida");
                    }
                }else{
                    System.out.println("No hay productos agregados, por favor agregar");
                }
            }
            if (menu ==3){
                if(!lista.isEmpty()){
                    int pos ;
                    System.out.println("Ingresa la posicion del producto a borrar: ");
                    pos = leer.nextInt();
                    if(pos>=0 && pos<lista.size()){
                        lista.remove(pos);
                        System.out.println("Producto eliminado correctamente");
                    }else{
                        System.out.println( "La posicion entregada no es valida");
                    } 
                }
                else{
                    System.out.println("No hay productos agregados, por favor agregar");
                }
            }
                    
            if(menu ==4){
                if(!lista.isEmpty()){
                    ArrayList cesta = new ArrayList();
                    System.out.println("Ingrese nombre del cliente: ");
                    leer = new Scanner (System.in);
                    String cliente = leer.nextLine();

                    System.out.println("\n"+Listar(lista));
                    char resp ='s';
                    while(resp=='s'||resp=='S'){
                        System.out.println("Ingrese posicion del producto a comprar: ");
                        int pos = leer.nextInt();
                        if(pos>=0 & pos<lista.size()){
                            if(lista.get(pos)instanceof GranosBasicos){
                                System.out.println(lista.get(pos)+"\n");
                                System.out.println("Ingrese la cantidad a comprar: ");
                                int cant = leer.nextInt();
                                int prod = ((GranosBasicos) lista.get(pos)).getCant_quintales();
                                if(cant<=prod&&cant>=0){
                                    int new_cant = prod-cant;
                                    ((GranosBasicos) lista.get(pos)).setCant_quintales(cant);
                                    cesta.add(Granos(cant, pos));
                                    ((GranosBasicos) lista.get(pos)).setCant_quintales(new_cant);

                                }else{
                                    System.out.println("No se dispone de esa cantidad de productos");
                                }  
                            }else if(lista.get(pos)instanceof ProductosdeLimpieza){
                                System.out.println(lista.get(pos)+"\n");
                                System.out.println("Ingrese la cantidad a comprar: ");
                                int cant = leer.nextInt();
                                int prod = ((ProductosdeLimpieza) lista.get(pos)).getCant_inventario();
                                if(cant<=prod&&cant>=0){
                                    int new_cant = prod-cant;
                                    cesta.add(Limpieza(cant, pos));
                                    ((ProductosdeLimpieza) lista.get(pos)).setCant_inventario(new_cant);
                                }else{
                                    System.out.println("No se dispone de esa cantidad de productos");
                                }  

                            }else if(lista.get(pos)instanceof Liquidos){
                                System.out.println(lista.get(pos)+"\n");
                                System.out.println("Ingrese la cantidad a comprar: ");
                                int cant = leer.nextInt();
                                int prod = ((Liquidos) lista.get(pos)).getInventario();///
                                int new_cant = prod;
                                if(cant<=prod&&cant>=0){
                                    new_cant = prod-cant;
                                    cesta.add(Liquidos(cant, pos));
                                    ((Liquidos) lista.get(pos)).setInventario(new_cant);
                                }else{
                                    System.out.println("No se dispone de esa cantidad de productos");
                                }


                            }else if (lista.get(pos)instanceof CarnesyEmbutidos){
                                System.out.println(lista.get(pos)+"\n");
                                System.out.println("Ingrese la cantidad a comprar: ");
                                int cant = leer.nextInt();
                                int prod = ((CarnesyEmbutidos) lista.get(pos)).getInventario();///
                                if(cant<=prod&&cant>=0){
                                    int new_cant = prod-cant;
                                    cesta.add(embutidos(cant, pos));
                                    ((CarnesyEmbutidos) lista.get(pos)).setInventario(new_cant);///
                                }else{
                                    System.out.println("No se dispone de esa cantidad de productos");
                                }  

                            }else if(lista.get(pos)instanceof FrutasVerduras){
                                System.out.println(lista.get(pos)+"\n");
                                System.out.println("Ingrese la cantidad a comprar: ");
                                int cant = leer.nextInt();
                                int prod = ((FrutasVerduras) lista.get(pos)).getCant_inve();///
                                if(cant<=prod&&cant>=0){
                                    int new_cant = prod-cant;
                                    cesta.add(verduras(cant, pos));
                                    ((FrutasVerduras) lista.get(pos)).setCant_inve(new_cant);///
                                }else{
                                    System.out.println("No se dispone de esa cantidad de productos");
                                }  
                            }else{
                                System.out.println("La posicion entregada no es valida");
                            } 
                        }
                        System.out.println("Desea agregar otro producto a la cesta? [s/n] ");
                        resp = leer.next().charAt(0);
                    }//respuesta de usario



                    System.out.println("--FACTURA--\nCliente: "+cliente+"\n"+Listar(cesta));
                    double subtotal=0; 
                    double impuesto; 
                    double total; 
                    for (Object t : cesta) {
                        if(t instanceof GranosBasicos){
                            subtotal += ((GranosBasicos) t).getCant_quintales()*((GranosBasicos) t).getPrecio();
                        }else if(t instanceof ProductosdeLimpieza){
                            subtotal += ((ProductosdeLimpieza) t).getCant_inventario()*((ProductosdeLimpieza) t).getPrecio();
                        }else if(t instanceof Liquidos){
                            subtotal += ((Liquidos) t).getInventario()*((Liquidos) t).getPrecio();
                        }else if (t instanceof CarnesyEmbutidos){
                            subtotal += ((CarnesyEmbutidos) t).getInventario()*((CarnesyEmbutidos) t).getPrecio();
                        }else if(t instanceof FrutasVerduras){
                            subtotal += ((FrutasVerduras) t).getCant_inve()*((FrutasVerduras) t).getPrecio();
                        }
                    }

                    impuesto = subtotal*0.15;
                    total = subtotal+impuesto;
                    System.out.println("Subtotal: "+subtotal);
                    System.out.println("Impuesto: "+impuesto);
                    System.out.println("Total a Pagar: "+total);
                    System.out.println("");
                }else{
                    System.out.println("No hay productos agregados, por favor agregar");
                }  
            }
            if (menu ==5) {
                if(!lista.isEmpty()){
                    System.out.println(Listar(lista));
                }else{
                    System.out.println("No hay productos agregados, por favor agregar");
                }
                
            }
            
        }//Fin del menu principal
        
    }//Fin del main 
    static GranosBasicos granos(){
        GranosBasicos retorno;
        String nombre; 
        int quintales;
        double precio;
        String medida ="";
        String procedencia;
        
        System.out.println("Ingrese nombre del producto: ");
        leer=new Scanner(System.in);
        nombre = leer.nextLine();
        
        System.out.println("Ingrese cantidad de quintales: ");
        quintales = leer.nextInt();
        
        System.out.println("Ingrese precio: ");
        precio = leer.nextDouble();
        
        int op = 4; 
        while (op>3){
            System.out.println("Seleccione la medida: \n"
                + "1. libra\n"
                + "2. medida\n"
                + "3. kilo");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    medida = "libra";
                    break;
                case 2: 
                    medida = "medida";
                    break;
                case 3:
                    medida = "kilo";
                    break;
                default:
                    //throw new AssertionError();
                    break;
            }
        }
        
        System.out.println("Ingrese el lugar de procedencia: ");
        leer=new Scanner(System.in);
        procedencia = leer.nextLine();
        retorno = new GranosBasicos(nombre, quintales, precio, medida, procedencia);
        
        return retorno;
    }
    static ProductosdeLimpieza limpieza(){
        ProductosdeLimpieza retorno;
        String tipo=""; //Tipo -> liquido, polvo
        String marca; 
        String codigo; 
        double precio;
        int cant_inventario;
        String proveedor; 
        String producto;
        
        int op = 4; 
        while (op>2){
            System.out.println("Seleccione el tipo del producto: \n"
                + "1. liquido\n"
                + "2. polvo");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    tipo = "liquido";
                    break;
                case 2: 
                    tipo = "polvo";
                    break;
                default:
                    //throw new AssertionError();
                    break;
            }
        }
        System.out.println("Ingresar marca del producto: ");
        leer=new Scanner(System.in);
        marca = leer.nextLine();
        
        System.out.println("Ingrese el codigo del producto: ");
        leer=new Scanner(System.in);
        codigo = leer.nextLine();
        
        for (Object t : lista) {
            if(t instanceof ProductosdeLimpieza){
                while (t.equals(codigo)) {
                    System.out.println("El siguiente codigo ya esta registrado");
                    System.out.println("Ingrese el codigo del producto: ");
                    leer=new Scanner(System.in);
                    codigo = leer.nextLine();
                }
 
            }
        }
        
        System.out.println("Ingrese precio del producto: ");
        precio = leer.nextDouble();
        
        System.out.println("Ingrese la cantidad en inventario: ");
        cant_inventario = leer.nextInt();
        
        System.out.println("Ingrese el proveedor: ");
        leer=new Scanner(System.in);
        proveedor = leer.nextLine();
        
        System.out.println("Nombre del producto: ");
        leer=new Scanner(System.in);
        producto = leer.nextLine();
        
        retorno = new ProductosdeLimpieza(tipo, marca, codigo, precio, cant_inventario, proveedor, producto);
        return retorno;
    }
    static Liquidos liquidos(){
        Liquidos retorno;
        String categoria="";
        String empaque="";
        String tam="";
        String producto;
        double precio;
        Date vencimiento;
        
        //leer=new Scanner(System.in);
        int op = 5; 
        while (op>4){
            System.out.println("Seleccione la categoria del producto: \n"
                    + "1. lacteos\n"
                    + "2. gaseosas\n"
                    + "3. jugos\n"
                    + "4. agua");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    categoria = "lacteos";
                    break;
                case 2: 
                    categoria = "gaseosas";
                    break;
                case 3:
                    categoria = "jugos";
                    break;
                case 4: 
                    categoria = "agua";
                    break;
                default:
                    //throw new AssertionError();
                    break;
            }
        }
        op = 5;
        while (op>3){
            System.out.println("Seleccione la forma de empaque: \n"
                    + "1. bote\n"
                    + "2. caja\n"
                    + "3. lata");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    empaque = "bote";
                    break;
                case 2: 
                    empaque = "caja";
                    break;
                case 3:
                    empaque = "lata";
                    break;
                default:
                    //throw new AssertionError();
                    break;
            }
        }
        op = 5;
        while (op>3){
            System.out.println("Seleccione la forma de empaque: \n"
                    + "1. pequeño\n"
                    + "2. mediano\n"
                    + "3. grande");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    tam = "pequeño";
                    break;
                case 2: 
                    tam = "mediano";
                    break;
                case 3:
                    tam = "grande";
                    break;
                default:
                    //throw new AssertionError();
                    break;
            }
        }
        
        System.out.println("Nombre del producto: ");
        leer=new Scanner(System.in);
        producto = leer.nextLine();
        
        System.out.println("Ingrese precio del producto: ");
        precio = leer.nextDouble();
        
        System.out.println("Ingrese la fecha de vencimiento(dd/mm/yyyy) :");
        String cadena; 
        leer=new Scanner(System.in);
        cadena = leer.next();
        String t[]= cadena.split("/");
        vencimiento = new Date(Integer.parseInt(t[2])-1900, Integer.parseInt(t[1])-1, Integer.parseInt(t[0]));
        
        System.out.println("Ingrese la cantidad en inventario: ");
        int inventario = leer.nextInt();
        
        retorno = new Liquidos(categoria, empaque, tam, producto, precio, vencimiento, inventario);
        return retorno;
    }
    static CarnesyEmbutidos carnes(){
        CarnesyEmbutidos retorno;
        String tipo=""; 
        double precio;
        int cant_inventario;
        String procedencia;
        
        System.out.println("Ingrese el lugar de procedencia: ");
        leer=new Scanner(System.in);
        procedencia = leer.nextLine();
        
        System.out.println("Ingrese la cantidad en inventario: ");
        cant_inventario = leer.nextInt();
        
        int op = 4; 
        while (op>3){
            System.out.println("Seleccione el tipo del producto: \n"
                    + "1. res\n"
                    + "2. carne blanca\n"
                    + "3. cerdo");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    tipo = "res";
                    break;
                case 2: 
                    tipo = "carne blanca";
                    break;
                case 3:
                    tipo = "cerdo";
                    break;
                default:
                    //throw new AssertionError();
                    break;
            }
        }
        
        System.out.println("Ingrese precio del producto: ");
        precio = leer.nextDouble();
        
        retorno = new CarnesyEmbutidos(procedencia, cant_inventario, tipo, precio);
        return retorno;
    }
    static FrutasVerduras frutaverdura(){
        FrutasVerduras retorno;
        double precio;
        int cant_inventario;
        String categoria ="";
        
        System.out.println("Ingrese precio del producto: ");
        precio = leer.nextDouble();
        
        System.out.println("Ingrese la cantidad en inventario: ");
        cant_inventario = leer.nextInt();
        
        int op = 4; 
        while (op>2){
            System.out.println("Seleccione el producto: \n"
                    + "1. Fruta\n"
                    + "2. Verdura");
            op = leer.nextInt();
            if(op==1){
                int op2 = 5; 
                while (op2>4){
                    System.out.println("Seleccione la categoria del producto: \n"
                            + "1. Citricos\n"
                            + "2. Tropical\n"
                            + "3. de Grano\n"
                            + "4. Rica en Fibra");
                    op2 = leer.nextInt();
                    switch (op2) {
                        case 1:
                            categoria = "Fruta Citricos";
                            break;
                        case 2:
                            categoria = "Fruta Tropical";
                            break;
                        case 3:
                            categoria = "Fruta de Grano";
                            break;
                        case 4:
                            categoria = "Fruta Rica en Fibra";
                            break;
                        default:
                            //throw new AssertionError();
                            break;
                    }
                }
            }
            if(op ==2){
                int op2 = 5; 
                while (op2>4){
                    System.out.println("Seleccione la categoria del producto: \n"
                            + "1. Tuberculos\n"
                            + "2. Legumbres\n"
                            + "3. de Hojas");
                    op2 = leer.nextInt();
                    switch (op2) {
                        case 1:
                            categoria = "Verdura Tuberculos";
                            break;
                        case 2:
                            categoria = "Verdura Legumbres";
                            break;
                        case 3:
                            categoria = "Verdura de Hojas";
                            break;
                        default:
                            //throw new AssertionError();
                            break;
                    }
                }
            }
        }//while categoria de producto
        
        retorno = new FrutasVerduras(precio, cant_inventario, categoria);
        return retorno;
    }
    
    static String Listar(ArrayList lista){
        String s=""; // Collections.swap(lista, menu, menu);
                for (Object t : lista) {
                    if(t instanceof GranosBasicos){
                        s += "Posicion -> "+lista.indexOf(t)+": \n"+t+"\n\n";
                    }
                }
                for (Object t : lista) {
                    if(t instanceof ProductosdeLimpieza){
                        s += "Posicion -> "+lista.indexOf(t)+": \n"+t+"\n\n";
                    }
                }
                for (Object t : lista) {
                    if(t instanceof Liquidos){
                        s += "Posicion -> "+lista.indexOf(t)+": \n"+t+"\n\n";
                    }
                }
                for (Object t : lista) {
                    if(t instanceof CarnesyEmbutidos){
                        s += "Posicion -> "+lista.indexOf(t)+": \n"+t+"\n\n";
                    }
                }
                for (Object t : lista) {
                    if(t instanceof FrutasVerduras){
                        s += "Posicion -> "+lista.indexOf(t)+": \n"+t+"\n\n";
                    }
                }
                return s;
    }
    static GranosBasicos Granos(int cantidad, int pos){
        GranosBasicos retorno;
        lista.get(pos);
        String nombre = ((GranosBasicos) lista.get(pos)).getNombre(); 
        int quintales;
        double precio = ((GranosBasicos) lista.get(pos)).getPrecio();
        String medida = ((GranosBasicos) lista.get(pos)).getMedida();
        String procedencia = ((GranosBasicos) lista.get(pos)).getLugar();
        ((GranosBasicos) lista.get(pos)).setCant_quintales(cantidad);
        quintales = ((GranosBasicos) lista.get(pos)).getCant_quintales();
        
        retorno = new GranosBasicos(nombre, quintales, precio, medida, procedencia);
        
        return retorno;
    }
    static ProductosdeLimpieza Limpieza(int cantidad, int pos){
        ProductosdeLimpieza retorno;
        String tipo= ((ProductosdeLimpieza) lista.get(pos)).getTipo();
        String marca=((ProductosdeLimpieza) lista.get(pos)).getMarca(); 
        String codigo=((ProductosdeLimpieza) lista.get(pos)).getCodigo(); 
        double precio=((ProductosdeLimpieza) lista.get(pos)).getPrecio();
        int cant_inventario;
        String proveedor=((ProductosdeLimpieza) lista.get(pos)).getProveedor(); 
        String producto=((ProductosdeLimpieza) lista.get(pos)).getProducto();
        
        
        ((ProductosdeLimpieza) lista.get(pos)).setCant_inventario(cantidad);
        cant_inventario = ((ProductosdeLimpieza) lista.get(pos)).getCant_inventario();
        
        retorno = new ProductosdeLimpieza(tipo, marca, codigo, precio, cant_inventario, proveedor, producto);
        
        return retorno;
    }
    static Liquidos Liquidos(int cantidad, int pos){
        Liquidos retorno;
        String categoria=((Liquidos) lista.get(pos)).getCategoria();
        String empaque=((Liquidos) lista.get(pos)).getEmpaque();
        String tam=((Liquidos) lista.get(pos)).getTam();
        String producto = ((Liquidos) lista.get(pos)).getProducto();
        double precio =((Liquidos) lista.get(pos)).getPrecio();
        Date vencimiento = ((Liquidos) lista.get(pos)).getFecha();
        
        int inventario;
        ((Liquidos) lista.get(pos)).setInventario(cantidad);
        inventario = ((Liquidos) lista.get(pos)).getInventario();
        
        retorno = new Liquidos(categoria, empaque, tam, producto, precio, vencimiento, inventario);
        
        return retorno;
    }
    static CarnesyEmbutidos embutidos(int cantidad, int pos){
        CarnesyEmbutidos retorno;
        String tipo=((CarnesyEmbutidos) lista.get(pos)).getTipo(); 
        double precio = ((CarnesyEmbutidos) lista.get(pos)).getPrecio();
        int cant_inventario;
        String procedencia = ((CarnesyEmbutidos) lista.get(pos)).getLugar();
        
        ((CarnesyEmbutidos) lista.get(pos)).setInventario(cantidad);
        cant_inventario = ((CarnesyEmbutidos) lista.get(pos)).getInventario();
        
        retorno = new CarnesyEmbutidos(procedencia, cant_inventario, tipo, precio);
        
        return retorno;
    }
    static FrutasVerduras verduras(int cantidad, int pos){
        FrutasVerduras retorno;
        double precio = ((FrutasVerduras) lista.get(pos)).getPrecio();
        int cant_inventario;
        String categoria =((FrutasVerduras) lista.get(pos)).getCategoria();
        
        
        ((FrutasVerduras) lista.get(pos)).setCant_inve(cantidad);
        cant_inventario = ((FrutasVerduras) lista.get(pos)).getCant_inve();
        
        retorno = new FrutasVerduras(precio, cant_inventario, categoria);
        
        return retorno;
    }
    
}//Fin de la clase
