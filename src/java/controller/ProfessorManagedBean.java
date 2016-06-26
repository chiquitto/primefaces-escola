/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.com.chiquitto.escola.dao.ProfessorDao;
import br.com.chiquitto.escola.vo.Professor;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author chiquitto
 */
@Named(value = "professormb")
@SessionScoped
public class ProfessorManagedBean implements Serializable {
    
    private Professor professor;
    
    public ProfessorManagedBean() {
    }
    
    public String criar() {
        ProfessorDao dao = new ProfessorDao();
        
        dao.cadastrar(this.professor);
        
        return "professores";
    }
    
    public String editar() {
        ProfessorDao dao = new ProfessorDao();
        
        dao.editar(this.professor);
        
        return "professores";
    }
    
    public String excluir(Professor professor) {
        ProfessorDao dao = new ProfessorDao();
        
        dao.apagar(professor);
        
        return "professores";
    }
    
    public Professor getProfessor() {
        return professor;
    }
    
    public List<Professor> getProfessores() {
        ProfessorDao dao = new ProfessorDao();
        return dao.getAll();
    }
    
    public String prepararCadastrar() {
        this.professor = new Professor();
        
        return "professor-cadastrar";
    }
    
    public String prepararEditar(Professor professor) {
        this.professor = professor;
        
        return "professor-editar";
    }
    
}
