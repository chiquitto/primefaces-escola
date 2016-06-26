package controller;

import br.com.chiquitto.escola.dao.ProfessorDao;
import br.com.chiquitto.escola.vo.Professor;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Professores {
    
    public String editar(Professor professor) {
        System.out.println(professor.getIdpessoa());
        return "professor-editar?faces-redirect=true&id=" + professor.getIdpessoa();
    }

    public List<Professor> getProfessores() {
        ProfessorDao dao = new ProfessorDao();
        return dao.getAll();
    }
}
