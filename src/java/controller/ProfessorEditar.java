package controller;

import br.com.chiquitto.escola.dao.ProfessorDao;
import br.com.chiquitto.escola.exception.RowNotFoundException;
import br.com.chiquitto.escola.vo.Professor;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ProfessorEditar implements Serializable {
    
    @ManagedProperty(value="#{param.id}")
    private int idpessoa;
    private Professor professor;
    
    public ProfessorEditar() {
        professor = new Professor();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setIdpessoa(int idpessoa) {
        this.idpessoa = idpessoa;
        System.out.println("IDPESSOA:" + idpessoa);
        
        ProfessorDao dao = new ProfessorDao();
        
        try {
            professor = dao.getOne(idpessoa);
        } catch (RowNotFoundException ex) {
            //ex.printStackTrace();
        }
    }
    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public String salvar() {
        ProfessorDao dao = new ProfessorDao();
        
        dao.editar(this.professor);
        
        return "professores";
    }
    
    
}
