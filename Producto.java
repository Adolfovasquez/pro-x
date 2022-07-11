package Supermark;
//import producto;

			public class Producto {
			public static final int case1 = 0;
			private int id;
		    private String nombre;
		    private int stock;
		    private double precio;
			public Producto(int id,String nombre,int stock,
	         double precio) { 
		    	this.id=id; 
		    	this.nombre=nombre;  
		    	this.stock=stock;
		        this.precio=precio;          
	     }
		        //metodos productos
	    public String getproducto() {
	        return getproducto();
	     }
	     public void setproducto(String producto) {
	     }
	 
	     public String getnombre() {
	    	 return nombre;
	     }
	     public void setnombre(String nombre) {
	    	 this. nombre=nombre;
	     }
	     public int getstock() {
	    	 return stock;    	 
	     }
	     public void setstock(int stock) {
	          this.stock=stock;
	     }
	     public double getprecio() {
	    	 return precio;
	     }
	     public void setprecio(double precio) {
	    	 this.precio=precio;
	     }
	     
	     public String tostring() {
		  return "id="+ id + ",nombre=" + nombre + ",stock=" + stock +
				  ",precio="+ precio;
	     }
	     public double calcular(int cantidad) {
	    	 return precio*cantidad;
	     }
	}    
			
	    	 
	    	 /*public class Almacen {
	    	     private mercaderia [] [] estanteria
	    	  public mercaderia (int file, int columna) { 
	    	    	 estanteria=new mercaderia[fila][columna];
	    	 
	    	 }
	    	     public almacen() {
	    	    	 estanteria=new mercaderia[2][2];
	    	     }
	    	public void agregarproducto(mercaderia m) {
	    		boolean encontrado=false;
	    		for(int j=0;)<(estanteria[0].Length && !encontrado;++) {
	    			if(stanteria[i][j]==null) {
	    				if estanteria[i][j], getid()""id){
	    					if(stanteria[i][j]==null) { 
	    				encontrado=true;
	    					} 				
	    				}
	    			}
	    	}
	    			if (encontrado) {
	    				System.out.println("mercaderia añadida");
	    				else {
	    					System.out.println("no se a podido encontrar la mercaderia añadida");
	    				}
	    					
	    				}
	    			
	    			public void eliminar mercaderia(int id) {
	    	    		boolean encontrado=false;
	    	    	}
	    	    		for(int i=0 ;i)<(estanteria[0].Length && !encontrado;i++) {
	    	    			if(stanteria[i][j]==null) {
	    	    				estanteria[i][j]=b;
	    	    				encontrado=true;
	    	    			}
	    	    		}
	    	    		if (encontrado) {
	        				System.out.println("mercaderia añadida");
	        				else {
	        					System.out.println("no se a podido encontrar la mercaderia añadida");
	        				}
	    	 
	     }	
	    	    				
	    	    				
	     public class vencimiento extends Producto {
	    	 private int dias_a_vencer;
	    	 public vencimiento(int dias_a_vencer, String nombre,double precio) {
	    		 super (nombre, precio);
	    	        this.dias_a_vencer=dias_a_vencer;
	    	 }
	    	 public int getDias_a_vencer() {
	    	 return dias_a_vencer;
	    	 
	     }
	    	 public void setdias_a_vencer() {
	    		 
	    	 }
	  
	    		public String toString() {
	    			return super toString() + "dias_a_vencer=" + dias_a_vencer;
	    			
	    		}  
	   
	     public double calcular(int cantidad) {
		double precio final=super calcular(cantidad);
		switch (dias_a_vencer) { 
		
		case1:
			precio final = / 4;
		break;
		case2:
		    precio final 2 / 3;
	    break;
		    			
	}
		return precioFinal;
		
		
		public static void main(String[]args) {
			producto [] producto=mercaderia(2);
			
		     Producto[0] = new producto("arroz", 120);
		     Producto[1] = new producto("fideo",140); 
		     
		}
		public static void main(String[]args) {
			producto [] producto=carniceria(3);
			
		     Producto[0] = new producto("bola de lomo", 1250);
		     Producto[1] = new producto("sobaco",900);
		     Producto[1] = new producto("osobuco",500);
		     
		}
		public static void main(String[]args) {
			producto [] producto=articulos_de_limpieza(2);
			
		     Producto[0] = new producto("desodorante de ambiente",220);
		     Producto[1] = new producto("lavandina",320);
				
		}
		public static void main(String[]args) {
			producto [] producto=cuidado_personal(3);
			
		     Producto[0] = new producto("jabon tocador",190);
		     Producto[1] = new producto("shampoo dave",490);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}*/