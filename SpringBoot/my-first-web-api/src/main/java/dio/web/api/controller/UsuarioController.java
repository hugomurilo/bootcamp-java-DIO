package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    // o repository tem a lógica de negócio, por isso a injeção
    @Autowired
    private UsuarioRepository repository;
    @GetMapping()
    public List<Usuario> getUsers(){
        return repository.findAll();
    }
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        //o nome que vier na URI será passada como argumento no método
        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

    // como todos terão um padrão iniciando "/users", pode-se usar a anotação @RequestMapping
}
