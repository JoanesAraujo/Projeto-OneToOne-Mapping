package adm.br.resource;

import adm.br.model.Pessoa;
import adm.br.repository.EnderecoRepository;
import adm.br.repository.PessoaRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/pessoa")
public class PessoaResource {

    @Inject
    EnderecoRepository enderecoRepository;

    @Inject
    PessoaRepository pessoaRepository;

    @GET
    public List<Pessoa> listAll() {
        return Pessoa.listAll();
    }
}