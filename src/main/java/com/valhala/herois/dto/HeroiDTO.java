package com.valhala.herois.dto;

import java.io.Serializable;

/**
 * Created by brunolv on 09/07/15.
 */
public class HeroiDTO implements Serializable, Comparable<HeroiDTO> {

    private Long codigo;
    private String nome;
    private String editora;
    private Short anoPublicacao;

    public HeroiDTO() {
        super();
    }

    public HeroiDTO(String nome, String editora, Short anoPublicacao) {
        super();
        this.nome = nome;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }

    public HeroiDTO(Long codigo, String nome, String editora, Short anoPublicacao) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Short getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Short anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HeroiDTO heroiDTO = (HeroiDTO) o;

        if (nome != null ? !nome.equals(heroiDTO.nome) : heroiDTO.nome != null) return false;
        return !(editora != null ? !editora.equals(heroiDTO.editora) : heroiDTO.editora != null);
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (editora != null ? editora.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(HeroiDTO o) {
        if (nome.compareToIgnoreCase(o.nome) < 0) {
            return -1;
        }
        if (nome.compareToIgnoreCase(o.nome) > 0) {
            return 1;
        }
        if (editora.compareToIgnoreCase(o.editora) < 0) {
            return -1;
        }
        if (editora.compareToIgnoreCase(o.editora) > 0) {
            return 1;
        }
        return 0;
    }

}
