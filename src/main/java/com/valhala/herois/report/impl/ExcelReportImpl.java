package com.valhala.herois.report.impl;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import java.util.Set;

/**
 * Created by brunolv on 10/07/15.
 */
public class ExcelReportImpl implements com.valhala.herois.report.ExcelReport {

    @Override
    public void emitir(Map<String, Map<Integer, String[]>> mapaReport, OutputStream output) throws IOException {
        Workbook workbook = new SXSSFWorkbook();
        Set<String> keySet = mapaReport.keySet();
        for (String key : keySet) {
            Sheet sheet = workbook.createSheet(key);
            Map<Integer, String[]> mapaElementos = mapaReport.get(key);
            Set<Integer> keySetElementos = mapaElementos.keySet();
            int numeroLinha = 0;
            for (Integer keyElementos : keySetElementos) {
                int numeroColuna = 0;
                Row row = sheet.createRow(numeroLinha++);
                String[] valores = mapaElementos.get(keyElementos);
                for (String valor : valores) {
                    row.createCell(numeroColuna++).setCellValue(valor);
                } // fim do bloco for
            } // fim do bloco for
        } // fim do bloco for
        workbook.write(output);
    } // fim do bloco emitir

} // fim da classe ExcelReportImpl
