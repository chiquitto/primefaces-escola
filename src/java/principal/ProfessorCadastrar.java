package principal;

import br.com.chiquitto.escola.Conexao;
import br.com.chiquitto.escola.dao.ProfessorDao;
import br.com.chiquitto.escola.vo.Professor;
import java.util.Calendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ProfessorCadastrar {
    private Professor professor;

    public ProfessorCadastrar() {
        professor = new Professor();
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -18);
        professor.setNascimento(cal.getTime());
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public void salvar() {
        Conexao.setUrl("jdbc:sqlite:/Users/chiquitto/work/aula/java-caso-uso-escola/data/escola.sqlite.db");
        ProfessorDao dao = new ProfessorDao();
        
        dao.cadastrar(this.professor);
        
        // return "professores";
    }
    
    
}
