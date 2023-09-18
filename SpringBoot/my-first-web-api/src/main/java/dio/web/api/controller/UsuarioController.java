package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    // o repository tem a lógica de negócio, por isso a injeção
    @Autowired
    private UsuarioRepository repository;
    @GetMapping("/users")
    public List<Usuario> getUsers(){
        return repository.findAll();
    }
    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        //o nome que vier na URI será passada como argumento no método
        return repository.findByUsername(username);
    }
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping("/users")
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
