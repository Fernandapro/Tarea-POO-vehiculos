/*****************************************************************************************************************************************************************************************************************
* Clase Automovil
* Programador: Fernanda Raguex
* 
* Creacion de clases y objetos para la clase Automovil
* 
****************************************************************************************************************************************************************************************************************/

package automovil;


public class Automovil {

    String marca;
    
    int modelo;
    
    double motor;
    
    enum tipoDeCombustible{GASOLINA, DIESEL, GAS_NATURAL}
    tipoDeCombustible tipo;
    
    enum tipoDeAutomovil{ciudad, subcompacto, compacto, familiar, ejecutivo, SUV}
    tipoDeAutomovil tipoAuto;

    int numeroDePuertas;
    
    int cantidadDeAsientos;
    
    double velocidadMaxima;
    
    enum color{blanco, negro, rojo, naranja, amarillo, verde, azul, violeta}
    color col;
    
    float velocidadActual= 0;
    
/*******************************************************************************************************************************************************************************************************************/

//  Este es el constructor de la Clase Automovil que lo haremos de manera publica
    
    Automovil(String marca, int modelo, double motor, tipoDeCombustible tipo, tipoDeAutomovil tipoAuto, int numeroDePuertas, int cantidadDeAsientos, double velocidadMaxima, color col, float velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipo = tipo;
        this.tipoAuto = tipoAuto;
        this.numeroDePuertas = numeroDePuertas;
        this.cantidadDeAsientos = cantidadDeAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.col = col;
        this.velocidadActual = velocidadActual;
    }
    
/********************************************************************************************************************************************************************************************************************/

//  Metodos get y set
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public tipoDeCombustible getTipo() {
        return tipo;
    }

    public void setTipo(tipoDeCombustible tipo) {
        this.tipo = tipo;
    }

    public tipoDeAutomovil getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(tipoDeAutomovil tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public color getCol() {
        return col;
    }

    public void setCol(color col) {
        this.col = col;
    }

    public float getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(float velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
/*************************************************************************************************************************************************************************************************************************/   
    
//  Este metodo nos permitira saber cual es la velocidad actual del automovil cuando esta acelerando   
    
    public void acelerar(float velocidadMaxima)
    {
      if (velocidadActual<velocidadMaxima ) {
            velocidadActual=velocidadActual+velocidadMaxima;
      } else {
            System.out.println("Modere su velocidad");
      }
    }
        
/*************************************************************************************************************************************************************************************************************************/       
    
// Este metodo nos permitira saber cual es la velocidad actual del automovil cuando esta desacelerando   
    
    public void desacelerar(float disminuirVelocidad )
    {
      if (velocidadActual < 0) {
            System.out.println("No es posible la velocidad negativa");
      } else {
            velocidadActual=velocidadActual-disminuirVelocidad;
                
      }
    }
    
/*************************************************************************************************************************************************************************************************************************/
          
//  Este metodo nos permitira saber cuanto es la velocidad del autmovil cuando frena
    
    public void frenar(){
      velocidadActual=0;
    }
     
/*************************************************************************************************************************************************************************************************************************/

// Este metodo nos permitira calcular el tiempo que tomara el automovil en llegar a cierta distancia. 
    
   public void calcularTiempo(float distancia)
   {
      float tiempo = (float) (distancia/velocidadActual);      
   }
   
/*************************************************************************************************************************************************************************************************************************/
    
//  El metodo imprimir mostrara en pantalla los atributos de la clase Automovil
    
    void imprimir()
    {    
        System.out.println("Marca = "+ marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = "+ motor);
        System.out.println("Tipo De Combustible = " + tipo);
        System.out.println("Tipo De Automovil = " + tipoAuto);
        System.out.println("Numero De Puertas = " + numeroDePuertas);
        System.out.println("Cantidad De Asientos = " + cantidadDeAsientos);
        System.out.println("Velocidad Maxima = " + velocidadMaxima);
        System.out.println("Color = " + col);
        System.out.println("Velocidad Actual = " + velocidadActual);
       
/*************************************************************************************************************************************************************************************************************************/    
    
//  Aqui creamos un main class y creamos un objeto llamado auto1 en donde le asignamos valores a los atributos de la calse automovil
        
    }      
    public static void main(String[] args) {
        
        
    Automovil auto1= new Automovil("ferrari", 2022, 3000, tipoDeCombustible.DIESEL, tipoDeAutomovil.ciudad, 2, 2, 150, color.negro, 100 );
    auto1.imprimir();
    
    System.out.println("**********************************************************");
    
    System.out.println("Aceleracion, desaceleracion y freno de su automovil");
    
    System.out.println("**********************************************************");
            
    auto1.setVelocidadActual(100);
    System.out.println("La velocidad actual es " + auto1.velocidadActual);
    auto1.acelerar(20);
    
    System.out.println("----------------------------------------------------------");
           
   
    System.out.println("El automovil desacelero " + auto1.velocidadActual);
    auto1.desacelerar(50);
    
    System.out.println("----------------------------------------------------------");
   
    System.out.println("Su automovil freno " + auto1.velocidadActual);
    auto1.frenar();  
    
    System.out.println("**********************************************************");         
    }
}//Fin
