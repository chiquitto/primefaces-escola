package listeners;

import br.com.chiquitto.escola.Conexao;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ListenerDatabase implements ServletContextListener {

    public void contextInitialized(ServletContextEvent contextEvent) {
        Conexao.setUrl("jdbc:sqlite:/Users/chiquitto/work/aula/java-caso-uso-escola/data/escola.sqlite.db");
    }

    public void contextDestroyed(ServletContextEvent contextEvent) {
    }
}
