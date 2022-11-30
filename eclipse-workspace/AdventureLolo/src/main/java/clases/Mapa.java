package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Mapa {
	private Entidad[][] mapa;
	private Puerta puerta;
	private Cofre baul;
	private int largo;
	private int ancho;
	private int corazones;
	private ArrayList<Ubicacion> enemigos;
	public Mapa(String path_file_elementos) {
		
		Scanner sc = null;

		try {
			sc = new Scanner(new File(path_file_elementos));
			
	
			int fila=sc.nextInt();
			int columna=sc.nextInt();
			this.enemigos=new ArrayList<Ubicacion>();
			

			// SI UNA ENTIDAD TIENE UNA ACCION QUE HACER NO ES TRASPASABLE
			this.setLargo(fila);
			this.setAncho(columna);
			this.mapa=new Entidad[fila][columna];
			this.cargarPared();/// tiene
			Ubicacion aux=new Ubicacion(sc.nextInt(),sc.nextInt()); 
			this.puerta=new Puerta(aux,true,false);
			this.mapa[this.puerta.ubicacion.getPosX()][this.puerta.ubicacion.getPosY()]=this.puerta;
			aux=new Ubicacion(sc.nextInt(),sc.nextInt());
			this.baul=new Cofre(aux,true,false); // BAUL NO ES TRASPASABLE
			this.mapa[this.baul.ubicacion.getPosX()][this.baul.ubicacion.getPosY()]=this.baul;

			int cantidadCorazones=sc.nextInt();
			this.setCorazones(cantidadCorazones);
			
	
			
			for(int i=0;i<cantidadCorazones;i++){
				aux=new Ubicacion (sc.nextInt(),sc.nextInt());
				Entidad corazon=new Corazon(aux,true,false);
				this.mapa[corazon.ubicacion.getPosX()][corazon.ubicacion.getPosY()]=corazon;
			}
			
			int cantidadEnemigos=sc.nextInt();
			
	
			
			for(int i=0;i<cantidadEnemigos;i++) {
				aux=new Ubicacion (sc.nextInt(),sc.nextInt());
				Entidad snake=new Enemigo(aux,true,false,"Snake"); //ENEMIGO TAMPOCO ES TRASPASABLE
				this.enemigos.add(aux); /// cargo los enemigos
				this.mapa[snake.ubicacion.getPosX()][snake.ubicacion.getPosY()]=snake;
			}
			
			int cantidadObstaculos=sc.nextInt();
			
			System.out.println("cantidad obstaculos "+cantidadObstaculos); 
			
			for(int i=0;i<cantidadObstaculos;i++) {
				aux=new Ubicacion (sc.nextInt(),sc.nextInt());
				Entidad obst=new Obstaculo(aux,true,false,"Arbol");
				this.mapa[obst.ubicacion.getPosX()][obst.ubicacion.getPosY()]=obst;
			}
			
				
			

			} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}	
		sc.close();
		
		
	}
	
	public int getAncho() {
		return ancho;
	}
	

	public int getCorazones() {
		return corazones;
	}

	public void setCorazones(int corazones) {
		this.corazones = corazones;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	public void reducirCorazon() {
		this.corazones--;
		System.out.println( "Cantidad corazones faltantes: " + corazones);
		
		if(this.corazones==0) {
			this.baul.abrir();
			System.out.println("Abri la puerta");
		}
			
	}
	
	public void cargarPared() {
		
		//Primer y ultima fila
		for(int i=0;i<this.largo;i++) {
			this.mapa[0][i]=new Obstaculo(new Ubicacion(0,i),true,false,"Pared");
			this.mapa[this.ancho-1][i]=new Obstaculo(new Ubicacion(this.ancho-1,i),true,false,"Pared");
		}
		
		//columna izquierda y derecha
		for(int i=1;i<this.ancho-1;i++) {
			this.mapa[i][0]=new Obstaculo(new Ubicacion(i,0),true,false,"Pared");
			this.mapa[i][this.largo-1]=new Obstaculo(new Ubicacion(i,this.largo-1),true,false,"Pared");
		}
		
		///
//		for(int i=0;i<this.ancho;i+=this.ancho-1) {
//            for(int j=0;j<this.largo;i+=this.largo-1) {
//                this.mapa[i][j]=new Obstaculo(new Ubicacion(i,j),true,false,"Pared");
//            }
//        }
	}
	
	public ArrayList<Ubicacion> getEnemigos() {
		return enemigos;
	}
	
	public void matarEnemigos() {
		for(Ubicacion u: this.enemigos) {
			this.mapa[u.getPosX()][u.getPosY()].traspasable=true;
			this.mapa[u.getPosX()][u.getPosY()].visible=false;
		}
			
			
	}
	public void abrirPuertaMuerteEnemigo() {
		this.puerta.abrir();
		this.matarEnemigos();
		
	}
	public Entidad getArriba(Ubicacion lolo) {
		return this.mapa[lolo.getPosX()-1][lolo.getPosY()];
	}
	
	public Entidad getAbajo(Ubicacion lolo) {
		return this.mapa[lolo.getPosX()+1][lolo.getPosY()];
		
	}
	
	public Entidad getDerecha(Ubicacion lolo) {
		return this.mapa[lolo.getPosX()][lolo.getPosY()+1];
	}
	
	public Entidad getIzquierda(Ubicacion lolo) {
		return this.mapa[lolo.getPosX()][lolo.getPosY()-1];
		
	}

	public int getLargo() {
		return largo;
	}


	public void setLargo(int largo) {
		this.largo = largo;
	}

	public void moverDerecha(Entidad lolo,Entidad otro) {
		if(otro.isTraspasable()==true) {
			
			lolo.ubicacion.setPosY(lolo.ubicacion.getPosY()+1);
		}
	}

	public void mostrarMapa() {
		for (int i = 0; i < this.largo; i++) {
			for (int j = 0; j < this.ancho; j++) {
				if(mapa[i][j]!=null)
					System.out.printf("%-10s\n", mapa[i][j]);
			}
				
			System.out.println();
		}
		System.out.println();
	}

	public Cofre getBaul() {
		return baul;
	}

	public void setBaul(Cofre baul) {
		this.baul = baul;
	}

	public Puerta getPuerta() {
		return puerta;
	}

	public void setPuerta(Puerta puerta) {
		this.puerta = puerta;
	}
	
	
	


}
