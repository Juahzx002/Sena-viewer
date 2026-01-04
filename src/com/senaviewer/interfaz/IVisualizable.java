package com.senaviewer.interfaz;

import java.util.Date;

/**
 * Contrato para cualquier contenido que pueda ser visto o leído
 * y que pueda generar un tiempo de visualización/lectura.
 */
public interface IVisualizable {
    
    /**
     * Marca el contenido como visto/leído y registra el tiempo dedicado.
     * @param time Tiempo en minutos dedicado a la visualización/lectura.
     * @return El tiempo total dedicado (para fines de reporte).
     */
    Date startToSee(Date dateI); // Fecha de inicio de visualización
    
    void stopToSee(Date dateI, Date dateF); // Fecha de finalización de visualización

}
