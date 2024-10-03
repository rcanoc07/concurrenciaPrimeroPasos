// Deberás crear un sistema en el que varios archivos se descarguen simultáneamente,
// pero el programa deberá esperar a que todas las descargas finalicen antes de
// mostrar un mensaje de resumen de las descargas completadas.

public class DownloadThread extends Thread {
    private String nombreArchivo;
    private int tiempoDescarga;

    public DownloadThread(String nombreArchivo,int tiempoDescarga) {
        this.nombreArchivo = nombreArchivo;
        this.tiempoDescarga = tiempoDescarga;
    }

    public void run(){
        try{
            System.out.println("Comenzando la descarga del archivo: "+this.nombreArchivo);
            Thread.sleep(tiempoDescarga);
            System.out.println("Descarga completada: "+this.nombreArchivo);
        } catch (InterruptedException e){
            e.getMessage();
        }

    }
    }
