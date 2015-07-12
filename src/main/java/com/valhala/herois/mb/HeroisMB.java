package com.valhala.herois.mb;

import com.valhala.heroi.domain.v1.Heroi;
import com.valhala.herois.dto.HeroiDTO;
import com.valhala.herois.report.ExcelReport;
import com.valhala.herois.report.impl.ExcelReportImpl;
import com.valhala.herois.services.HeroisService.v1.HeroisServiceProxy;

import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Managed Bean para executar a função de Controller entre View e Model relacionado a Heroi.
 *
 * @author Bruno Luiz Viana
 * @version 1.0
 */
public class HeroisMB implements Serializable {

    private static final String ROTULO_SHEET_HEROI = "HEROIS";
    private static final String[] ROTULOS_CELLS_HEROI = new String[]{"CODIGO", "NOME", "EDITORA", "ANO PUBLICACAO"};

    private HeroiDTO heroi;
    private List<HeroiDTO> heroiList;

    public HeroiDTO getHeroi() {
        return heroi;
    }

    public void setHeroi(HeroiDTO heroi) {
        this.heroi = heroi;
    }

    public List<HeroiDTO> getHeroiList() {
        return heroiList;
    }

    public void setHeroiList(List<HeroiDTO> heroiList) {
        this.heroiList = heroiList;
    }

    @PostConstruct
    private void inicializar() {
        heroi = new HeroiDTO();
        heroiList = new ArrayList<HeroiDTO>();

        heroiList = recuperarHerois();
    } // fim metodo

    /**
     * Metodo para disponibilizacao de arquivo para o usuário via Download
     *
     * @throws IOException
     */
    public void exportarHeroisToExcel() throws IOException {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();

        HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();
        response.reset();
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=herois.xlsx");

        OutputStream outputStream = response.getOutputStream();

        ExcelReport excelReport = new ExcelReportImpl();
        excelReport.emitir(montarMapaHeroisParaExportar(), outputStream);

        facesContext.responseComplete();
    } // fim metodo

    private List<HeroiDTO> recuperarHerois() {
        List<HeroiDTO> listaHerois = new ArrayList<>();
        HeroisServiceProxy proxy = new HeroisServiceProxy();
        try {
            Heroi[] herois = proxy.listarHerois();
            for (Heroi hero : herois) {
                HeroiDTO heroiDTO = new HeroiDTO(hero.getId(), hero.getNome(), hero.getEditora(), Short.parseShort(hero.getAnoPrimeriaAparicao()));
                listaHerois.add(heroiDTO);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return listaHerois;
    }

    /*
    Metodo utilizado para montagem do relatorio de herois para disponibilizacao para usuário.
     */
    private Map<String, Map<Integer, String[]>> montarMapaHeroisParaExportar() {
        Map<String, Map<Integer, String[]>> mapaExport = new HashMap<>();
        Map<Integer, String[]> elementos = new HashMap<>();
        int numeroLinha = 0;
        elementos.put(numeroLinha++, ROTULOS_CELLS_HEROI);
        for (HeroiDTO heroiDTO : heroiList) {
            elementos.put(numeroLinha++, new String[]{
                    heroiDTO.getCodigo().toString(),
                    heroiDTO.getNome(),
                    heroiDTO.getEditora(),
                    heroiDTO.getAnoPublicacao().toString()});
        } // fim bloco for
        mapaExport.put(ROTULO_SHEET_HEROI, elementos);
        return mapaExport;
    } // fim metodo

} // fim classe