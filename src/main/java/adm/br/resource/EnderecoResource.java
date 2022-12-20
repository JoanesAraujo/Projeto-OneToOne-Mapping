package adm.br.resource;

import adm.br.model.Endereco;
import adm.br.model.Pessoa;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/endereco")
public class EnderecoResource {

    @GET
    public List<Endereco> listAll() {
        return Endereco.listAll();
    }
}