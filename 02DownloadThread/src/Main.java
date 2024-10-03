
public class Main {
    public static void main(String[] args) {
        //Creo el array para los objetos y el contador de tiempo
        DownloadThread[] archivos = new DownloadThread[5];
        long inicio = System.currentTimeMillis();

        //Creo los objetos en el array
        archivos[0] = new DownloadThread("Archivo1.jpg",1000);
        archivos[1] = new DownloadThread("Archivo2.mp4",8000);
        archivos[2] = new DownloadThread("Archivo3.gcode",1500);
        archivos[3] = new DownloadThread("Archivo4.ova",7500);
        archivos[4] = new DownloadThread("Archivo5.exe",3000);

        //Try para capturar excepciones lanzadas por los metodos de Thread
        try{
            //Bucle para iniciar las descargas
            for (DownloadThread archivo:archivos) {
                archivo.start();
            }
            //Bucle para que las descargas esperen antes de seguir con el programa
            for (DownloadThread archivo:archivos) {
                archivo.join();
            }
        } catch (InterruptedException e){
            e.getMessage();
        }
        //Captura del tiempo final y cuentas necesarias
        long fin = System.currentTimeMillis();
        long tiempoTotal = fin - inicio;
        //Resultado del programa
        System.out.println("Las descargas han finalizado en "+tiempoTotal/1000+"."+tiempoTotal%1000+" segundos");
    }
}
