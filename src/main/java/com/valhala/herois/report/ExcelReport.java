package com.valhala.herois.report;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/**
 * Interface do contrato para classes de emissão de relatorio em excel.
 *
 * @author Bruno Luiz Viana
 * @version 1.0
 */
public interface ExcelReport {

    /**
     * Metodo para emissao de relatorio.
     *
     * @param elementos Mapa de estrutura de planilha.
     *                  A chave do mapa deve ter o nome da sheet.
     *                  O mapa que representa o valor segue a regra:
     *                  Chave Integer apenas para servir de chave
     *                  Array de String representando o valor para preencher as cells das rows da sheet.
     * @param output    Apontando para o stream onde o relatorio será escrito.
     * @throws IOException
     */
    void emitir(Map<String, Map<Integer, String[]>> elementos, OutputStream output) throws IOException;

} // fim da interface