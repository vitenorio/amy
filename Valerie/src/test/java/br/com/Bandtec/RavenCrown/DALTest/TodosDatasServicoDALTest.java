package br.com.Bandtec.RavenCrown.DALTest;

import br.com.Bandtec.RavenCrown.ClassesConstrutoras.Construtores;
import br.com.Bandtec.RavenCrown.Entity.DataServicoEntity;
import br.com.Bandtec.RavenCrown.Entity.ServicoEntity;
import br.com.Bandtec.RavenCrown.Entity.UsuarioEntity;
import br.com.Bandtec.RavenCrown.Infra.DAL.TodosDatasServicoDAL;
import br.com.Bandtec.RavenCrown.Infra.DAL.TodosServicosDAL;
import br.com.Bandtec.RavenCrown.Infra.DAL.TodosUsuariosDAL;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@Transactional
@SpringBootTest
@RunWith(SpringRunner.class)
public class TodosDatasServicoDALTest {

    @Autowired
    TodosDatasServicoDAL datasServicoDAL;
    DataServicoEntity dataServico;

    @Autowired
    TodosServicosDAL servicosDAL;
    ServicoEntity servico;

    @Autowired
    TodosUsuariosDAL usuariosDAL;
    UsuarioEntity usuario;

    Construtores construtores;

    @Before
    public void setters(){
        construtores = new Construtores();
        construtores.setEndereco();
        construtores.setUser();
        construtores.setService();
    }

    @Test
    public void persistirData(){
        dataServico = new DataServicoEntity();

        java.util.Date DATA = new java.util.Date();

        dataServico.setServico(construtores.getService());
        dataServico.setDtAgendamento(LocalDateTime.now());
        dataServico.setPrestador(construtores.getService().getPrestador());
        dataServico.setConsumidor(construtores.getUser());
        dataServico.setTipoReserva('T');

        datasServicoDAL.save(dataServico);

        DataServicoEntity dataPersistida = datasServicoDAL.getOne(dataServico.getId());

        assertEquals(dataPersistida,dataServico);
    }

    @Test
    public void verirficarDatasEmServico(){
        assertFalse(servicosDAL.getOne(1).getDatas().isEmpty());
    }
}
