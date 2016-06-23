package principal;

import br.com.chiquitto.escola.Conexao;
import br.com.chiquitto.escola.dao.ProfessorDao;
import br.com.chiquitto.escola.vo.Professor;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Professores {

    public List<Professor> getProfessores() {
        Conexao.setUrl("jdbc:sqlite:/Users/chiquitto/work/aula/java-caso-uso-escola/data/escola.sqlite.db");
        
        ProfessorDao dao = new ProfessorDao();
        return dao.getAll();
    }
}
