package Supermark;

public class Administracion {
	package menu;

	public class Administracion {

	import java.util.arraylit;
	import java.util.scaner;

	private int id Administracion;
	private string usuario;
	private String contraseña
	private String mail;
	private string contraseña;
	private string tipodedni;
	 private long dni;

	private ArrayList productos  productos;
	public Administrador(int id, string nombre de usurio, string mail, string contraseña, string tipo de documento, int tipo de administrador)[
	this.nombre de usuario= usuario;
	this.mail= mail;
	this.contraseña=contraeña;
	this.tipodedocumento=tipo de documento;
	]
	public void cargar productos() {
	arralist'producto?productos=new ArrayList?producto/();
	String opcion = "";
	Scanner scanners= new Scanner(system.int;
	Producto producto1 = new producto();
	do{
	system.out.println("------ingresar producto---");
	System.out.println("1-ingresar producto");
	System.out.println("---------);
	sytem.out.println("S - Salir");
	opcion = scanners.nextLine();
	switch (opcion){
	case "1":
	system.out.println("------ingresar producto---");
	System.out.println:("idproducto: ");
	System.out.println("nombre del producto: ");
	system.out.println("stock: ");
	system.out.printrln("precio: ");
	system.out.println("fechaDeVencimiento: ");
	system.out.pringln("categoria: ");
	break;
	}
	}while opcion!="S");
	for(Producto producto: productos) {
	this.productos.add(pro(procto);
	}
	{
	public viid modificarProductos() {
	strng opcion = "";
	do {
	    System.out.println("----idDelProducto----");
	System.out.println:("---nombreDelProducto:--- ");
	System.out.println("----stock----- ");
	system.out.println("---precio----");
	system.out.printrln("fechadeVencimiento--- ");
	system.out.println("---categoria---- ");
	}while(opcion!);




	comentario:
	para eliminar productoDataBase. ver producto    elegir ete nombre

	 DataBase< ¿'depende la clase de como se llama el base de datos?.ver productos();
	sytem.outprintln("---------eliminacio9n de producto-------");
	do{
	System.out.println("1 Selecione ID");
	int productoId = sc.nextInt();
	Producto eliminarProducto = new producto(idDelProducto,null,0,0,0,0??? null);
	DataBase.???eliminarProducto(eliminarProducto);
	System.out.println:("---Eliminacion Correcta");
	System.out.println("----Quiere eliminar otro Producto?");
	system.out.println("1 - Si");
	system.out.printrln("2 - No");
	sc.nextLine();
	opcion = sc.nexLine();
	} while(!.equals("S)&& !opcion.equals("S") && !opcion.equals("2"));
	opcion = "g";
	beack;



	caso "4":
	do{

	System,out.printtln("lista de usuario y compra");
	dataBase.compraCliente();system.out.println("S - Volver para atras");
	opcion = sc.nextLine();
	}while(!opcion.equals("S") && !opcion.equals("S"));
	opcion = "G";
	break;

	Casa "5"
	do {
	System.out.println("Lista de compra de los usurios");
	DataBase.compraCliente();
	DataBase.ListaCompraclinte(idTemporal);
	sc.nextLine();
	System.out.println("S - Salir")[;
	opcion = c.nextLine();
	}while(!opcion.equals("S") && !opcion.equals("S"));
	opcion = " g";
	break;
	defoult:
	opcion = "0";
	}
	}while(!opcion.equals("="));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
